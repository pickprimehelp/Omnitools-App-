package com.example.ads

import android.app.Activity
import android.content.Context
import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import com.google.android.gms.ads.rewarded.RewardedAd
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback

object AdManager {
    private const val TAG = "OmniToolsAds"
    const val USE_TEST_ADS = false

    const val TEST_APP_ID = "ca-app-pub-3940256099942544~3347511713"
    const val TEST_BANNER_ID = "ca-app-pub-3940256099942544/6300978111"
    const val TEST_INTERSTITIAL_ID = "ca-app-pub-3940256099942544/1033173712"
    const val TEST_REWARDED_ID = "ca-app-pub-3940256099942544/5224354917"

    const val REAL_APP_ID = "ca-app-pub-7584087725069099~5449667520"
    const val REAL_BANNER_ID = "ca-app-pub-7584087725069099/8154712759"
    const val REAL_INTERSTITIAL_ID = "ca-app-pub-7584087725069099/1322545249"
    const val REAL_REWARDED_ID = "ca-app-pub-7584087725069099/3640752672"

    val APP_ID: String get() = if (USE_TEST_ADS) TEST_APP_ID else REAL_APP_ID
    val BANNER_ID: String get() = if (USE_TEST_ADS) TEST_BANNER_ID else REAL_BANNER_ID
    val INTERSTITIAL_ID: String get() = if (USE_TEST_ADS) TEST_INTERSTITIAL_ID else REAL_INTERSTITIAL_ID
    val REWARDED_ID: String get() = if (USE_TEST_ADS) TEST_REWARDED_ID else REAL_REWARDED_ID

    private var interstitialAd: InterstitialAd? = null
    private var rewardedAd: RewardedAd? = null
    private var isInterstitialLoading = false
    private var isRewardedLoading = false

    private var lastInterstitialShownTime: Long = 0L
    private var screenChangeCount: Int = 0

    // Rate-limiting for safe AdMob compliance & optimal UX (minimum 120s / 2 minutes)
    private const val INTERSTITIAL_COOLDOWN_MS = 120000L
    private const val SCREENS_BETWEEN_ADS = 4

    fun initialize(context: Context) {
        try {
            MobileAds.initialize(context) {
                Log.d(TAG, "MobileAds initialized successfully")
                preloadInterstitial(context)
                preloadRewarded(context)
            }
        } catch (e: Exception) {
            Log.e(TAG, "Error initializing MobileAds", e)
        }
    }

    fun preloadInterstitial(context: Context) {
        if (interstitialAd != null || isInterstitialLoading) return
        isInterstitialLoading = true
        val adRequest = AdRequest.Builder().build()
        InterstitialAd.load(
            context,
            INTERSTITIAL_ID,
            adRequest,
            object : InterstitialAdLoadCallback() {
                override fun onAdLoaded(ad: InterstitialAd) {
                    interstitialAd = ad
                    isInterstitialLoading = false
                    Log.d(TAG, "Interstitial loaded")
                }

                override fun onAdFailedToLoad(loadAdError: LoadAdError) {
                    interstitialAd = null
                    isInterstitialLoading = false
                    Log.w(TAG, "Interstitial failed to load: ${loadAdError.message}")
                }
            }
        )
    }

    fun preloadRewarded(context: Context) {
        if (rewardedAd != null || isRewardedLoading) return
        isRewardedLoading = true
        val adRequest = AdRequest.Builder().build()
        RewardedAd.load(
            context,
            REWARDED_ID,
            adRequest,
            object : RewardedAdLoadCallback() {
                override fun onAdLoaded(ad: RewardedAd) {
                    rewardedAd = ad
                    isRewardedLoading = false
                    Log.d(TAG, "Rewarded ad loaded")
                }

                override fun onAdFailedToLoad(loadAdError: LoadAdError) {
                    rewardedAd = null
                    isRewardedLoading = false
                    Log.w(TAG, "Rewarded failed to load: ${loadAdError.message}")
                }
            }
        )
    }

    @JvmOverloads
    fun showInterstitialIfReady(
        activity: Activity,
        forceShow: Boolean = false,
        onDismissed: () -> Unit
    ) {
        screenChangeCount++
        val now = System.currentTimeMillis()
        val cooldownPassed = (now - lastInterstitialShownTime) > INTERSTITIAL_COOLDOWN_MS
        val countReached = screenChangeCount >= SCREENS_BETWEEN_ADS

        // Safe ad display logic: protect AdMob account with strict rate limiting
        val shouldShow = if (forceShow) {
            (now - lastInterstitialShownTime) > 60000L // At least 60s even on forced action
        } else {
            cooldownPassed && countReached
        }

        val ad = interstitialAd
        if (ad != null && shouldShow) {
            ad.fullScreenContentCallback = object : FullScreenContentCallback() {
                override fun onAdDismissedFullScreenContent() {
                    interstitialAd = null
                    lastInterstitialShownTime = System.currentTimeMillis()
                    screenChangeCount = 0
                    preloadInterstitial(activity)
                    onDismissed()
                }

                override fun onAdFailedToShowFullScreenContent(adError: AdError) {
                    interstitialAd = null
                    preloadInterstitial(activity)
                    onDismissed()
                }
            }
            ad.show(activity)
        } else {
            preloadInterstitial(activity)
            onDismissed()
        }
    }

    fun showRewardedAd(
        activity: Activity,
        onRewardEarned: () -> Unit,
        onDismissed: () -> Unit
    ) {
        val ad = rewardedAd
        if (ad != null) {
            ad.fullScreenContentCallback = object : FullScreenContentCallback() {
                override fun onAdDismissedFullScreenContent() {
                    rewardedAd = null
                    preloadRewarded(activity)
                    onDismissed()
                }

                override fun onAdFailedToShowFullScreenContent(adError: AdError) {
                    rewardedAd = null
                    preloadRewarded(activity)
                    onDismissed()
                }
            }
            ad.show(activity) {
                onRewardEarned()
            }
        } else {
            preloadRewarded(activity)
            onRewardEarned()
            onDismissed()
        }
    }
}

@Composable
fun TopBannerAd(modifier: Modifier = Modifier) {
    var isAdFailed by remember { mutableStateOf(false) }
    if (isAdFailed) return

    AndroidView(
        modifier = modifier,
        factory = { ctx ->
            AdView(ctx).apply {
                setAdSize(AdSize.BANNER)
                adUnitId = AdManager.BANNER_ID
                adListener = object : AdListener() {
                    override fun onAdFailedToLoad(error: LoadAdError) {
                        Log.w("TopBannerAd", "Banner failed: ${error.message}")
                        isAdFailed = true
                    }

                    override fun onAdLoaded() {
                        isAdFailed = false
                    }
                }
                loadAd(AdRequest.Builder().build())
            }
        }
    )
}
