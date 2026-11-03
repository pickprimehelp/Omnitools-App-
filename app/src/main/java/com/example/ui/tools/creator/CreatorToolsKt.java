package com.example.ui.tools.creator;

import android.content.Context;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ContentCopyKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import com.example.util.ImageExportUtils;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* compiled from: CreatorTools.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a%\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a%\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\n\u001a\u001b\u0010\u000b\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\n¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\u0010\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011X\u008a\u008e\u0002²\u0006\n\u0010\u0012\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011X\u008a\u008e\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u0010\u0017\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\u000eX\u008a\u008e\u0002"}, d2 = {"YouTubeTitleGeneratorScreen", "", "isShortsMode", "", "onBack", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "HashtagAndTagGeneratorScreen", "isTagMode", "YouTubeRevenueCalculatorScreen", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "VideoFileSizeCalculatorScreen", "app", "topic", "", "tone", "titles", "", "keyword", "tags", "dailyViews", "", "estimatedCpm", "durationMinutesText", "bitrateMbpsText"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CreatorToolsKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HashtagAndTagGeneratorScreen$lambda$55(boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        HashtagAndTagGeneratorScreen(z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit VideoFileSizeCalculatorScreen$lambda$111(Function0 function0, int i, Composer composer, int i2) {
        VideoFileSizeCalculatorScreen(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeRevenueCalculatorScreen$lambda$86(Function0 function0, int i, Composer composer, int i2) {
        YouTubeRevenueCalculatorScreen(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeTitleGeneratorScreen$lambda$32(boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        YouTubeTitleGeneratorScreen(z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v3 */
    public static final void YouTubeTitleGeneratorScreen(boolean isShortsMode, final Function0<Unit> onBack, Composer $composer, final int $changed, final int i) {
        final boolean isShortsMode2;
        Object obj;
        char c;
        int r19 = 1;
        Object obj2;
        Object obj3;
        MutableState tone$delegate;
        Object obj4;
        Composer $composer2;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer $composer3 = $composer.startRestartGroup(-1589251765);
        ComposerKt.sourceInformation($composer3, "C(YouTubeTitleGeneratorScreen)66@2969L12,66@2957L24,67@3013L7,69@3039L47,70@3103L51,122@5736L56,125@5825L591,139@6423L3168,124@5798L3793:CreatorTools.kt#k11ekw");
        int $dirty = $changed;
        int i2 = i & 1;
        if (i2 != 0) {
            $dirty |= 6;
            isShortsMode2 = isShortsMode;
        } else if (($changed & 6) == 0) {
            isShortsMode2 = isShortsMode;
            $dirty |= $composer3.changed(isShortsMode2) ? 4 : 2;
        } else {
            isShortsMode2 = isShortsMode;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onBack) ? 32 : 16;
        }
        if (($dirty & 19) == 18 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            final boolean isShortsMode3 = i2 != 0 ? false : isShortsMode2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1589251765, $dirty, -1, "com.example.ui.tools.creator.YouTubeTitleGeneratorScreen (CreatorTools.kt:65)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 1737416119, "CC(remember):CreatorTools.kt#9igjgp");
            boolean z = ($dirty & 112) == 32;
            Object rememberedValue = $composer3.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.tools.creator.CreatorToolsKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreatorToolsKt.YouTubeTitleGeneratorScreen$lambda$1$lambda$0(Function0.this);
                    }
                };
                $composer3.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            BackHandlerKt.BackHandler(false, (Function0) obj, $composer3, 0, 1);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Context context = (Context) consume;
            ComposerKt.sourceInformationMarkerStart($composer3, 1737418394, "CC(remember):CreatorTools.kt#9igjgp");
            Object rememberedValue2 = $composer3.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                c = 0;
                r19 = 1;
                obj2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("Weight Loss Diet", null, 2, null);
                $composer3.updateRememberedValue(obj2);
            } else {
                c = 0;
                r19 = 1;
                obj2 = rememberedValue2;
            }
            final MutableState topic$delegate = (MutableState) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1737420446, "CC(remember):CreatorTools.kt#9igjgp");
            Object rememberedValue3 = $composer3.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("Viral / Click-worthy", null, 2, null);
                $composer3.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            MutableState tone$delegate2 = (MutableState) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            String[] strArr = new String[4];
            strArr[c] = "Viral / Click-worthy";
            strArr[r19] = "How-To / Educational";
            strArr[2] = "Listicle / Numbers";
            strArr[3] = "Curiosity / Secret";
            final List tones = CollectionsKt.listOf((Object[]) strArr);
            ComposerKt.sourceInformationMarkerStart($composer3, 1737504707, "CC(remember):CreatorTools.kt#9igjgp");
            Object rememberedValue4 = $composer3.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                tone$delegate = tone$delegate2;
                obj4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(YouTubeTitleGeneratorScreen$generateTitles(isShortsMode3, YouTubeTitleGeneratorScreen$lambda$3(topic$delegate), YouTubeTitleGeneratorScreen$lambda$6(tone$delegate)), null, 2, null);
                $composer3.updateRememberedValue(obj4);
            } else {
                tone$delegate = tone$delegate2;
                obj4 = rememberedValue4;
            }
            final MutableState titles$delegate = (MutableState) obj4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            boolean z2 = r19 != 0;
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1936479737, z2, new Function2() { // from class: com.example.ui.tools.creator.CreatorToolsKt$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    return CreatorToolsKt.YouTubeTitleGeneratorScreen$lambda$15(isShortsMode3, onBack, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, $composer3, 54);
            final MutableState tone$delegate3 = tone$delegate;
            boolean isShortsMode4 = isShortsMode3;
            ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-20004260, z2, new Function3() { // from class: com.example.ui.tools.creator.CreatorToolsKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                    return CreatorToolsKt.YouTubeTitleGeneratorScreen$lambda$31(isShortsMode3, topic$delegate, tone$delegate3, titles$delegate, tones, context, (PaddingValues) obj5, (Composer) obj6, ((Integer) obj7).intValue());
                }
            }, $composer3, 54);
            $composer2 = $composer3;
            ScaffoldKt.m2411ScaffoldTvnljyQ(null, rememberComposableLambda, null, null, null, 0, 0L, 0L, null, rememberComposableLambda2, $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            isShortsMode2 = isShortsMode4;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.tools.creator.CreatorToolsKt$$ExternalSyntheticLambda28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    return CreatorToolsKt.YouTubeTitleGeneratorScreen$lambda$32(isShortsMode2, onBack, $changed, i, (Composer) obj5, ((Integer) obj6).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeTitleGeneratorScreen$lambda$1$lambda$0(Function0 $onBack) {
        $onBack.invoke();
        return Unit.INSTANCE;
    }

    private static final String YouTubeTitleGeneratorScreen$lambda$3(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String YouTubeTitleGeneratorScreen$lambda$6(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0106. Please report as an issue. */
    private static final List<String> YouTubeTitleGeneratorScreen$generateTitles(boolean $isShortsMode, String t, String selectedTone) {
        String str = t;
        if (StringsKt.isBlank(str)) {
            str = "Video Topic";
        }
        String clean = str;
        if ($isShortsMode) {
            return CollectionsKt.listOf((Object[]) new String[]{"Stop Doing This For " + clean + "! ❌ #shorts", "Best " + clean + " Hack in 60 Seconds! ⚡", "3 Secrets of " + clean + " Nobody Tells You! 🤫", "How I Mastered " + clean + " (Shocking Result) 😱", "Never Ignore This Rule in " + clean + "! 🚨", "1 Minute " + clean + " Guide That Actually Works! 🔥", "Why Everyone is Wrong About " + clean + " 🤯", "Try This Simple " + clean + " Routine Today! ✨"});
        }
        switch (selectedTone.hashCode()) {
            case -1827968640:
                if (selectedTone.equals("Curiosity / Secret")) {
                    return CollectionsKt.listOf((Object[]) new String[]{"The Truth About " + clean + " (What Nobody is Telling You)", "Why Most People Fail at " + clean + " (Secret Exposed)", "I Tested " + clean + " for 30 Days and This Happened...", "Is " + clean + " Actually Worth It? Honest Truth", "The Dark Side of " + clean + " Nobody Talks About"});
                }
                return CollectionsKt.listOf((Object[]) new String[]{"DO NOT Start " + clean + " Until You Watch This!", "This ONE Change in " + clean + " Doubled My Results!", "How to Get Crazy Good at " + clean + " (Fast & Easy)", "The Genius " + clean + " Strategy That Works Every Time", "Stop Wasting Time on " + clean + " (Do THIS Instead)", "I Wish I Knew This About " + clean + " 5 Years Ago!"});
            case 77383594:
                if (selectedTone.equals("Listicle / Numbers")) {
                    return CollectionsKt.listOf((Object[]) new String[]{"Top 7 " + clean + " Rules You Must Follow in 2026", "5 Mistakes People Make with " + clean + " (And How to Fix Them)", "10 Powerful Tips for " + clean + " That Actually Work", "3 Quick Hacks to 10x Your " + clean + " Results", "5 Best Tools for " + clean + " Every Creator Needs"});
                }
                return CollectionsKt.listOf((Object[]) new String[]{"DO NOT Start " + clean + " Until You Watch This!", "This ONE Change in " + clean + " Doubled My Results!", "How to Get Crazy Good at " + clean + " (Fast & Easy)", "The Genius " + clean + " Strategy That Works Every Time", "Stop Wasting Time on " + clean + " (Do THIS Instead)", "I Wish I Knew This About " + clean + " 5 Years Ago!"});
            case 719753850:
                if (selectedTone.equals("How-To / Educational")) {
                    return CollectionsKt.listOf((Object[]) new String[]{"How to Master " + clean + " (Complete Step-by-Step Guide)", clean + " for Beginners: Everything You Need to Know", "How to Do " + clean + " the Right Way (Avoid Common Mistakes)", "The Ultimate Guide to " + clean + " in 2026", "How I Learned " + clean + " from Scratch in 14 Days"});
                }
                return CollectionsKt.listOf((Object[]) new String[]{"DO NOT Start " + clean + " Until You Watch This!", "This ONE Change in " + clean + " Doubled My Results!", "How to Get Crazy Good at " + clean + " (Fast & Easy)", "The Genius " + clean + " Strategy That Works Every Time", "Stop Wasting Time on " + clean + " (Do THIS Instead)", "I Wish I Knew This About " + clean + " 5 Years Ago!"});
            default:
                return CollectionsKt.listOf((Object[]) new String[]{"DO NOT Start " + clean + " Until You Watch This!", "This ONE Change in " + clean + " Doubled My Results!", "How to Get Crazy Good at " + clean + " (Fast & Easy)", "The Genius " + clean + " Strategy That Works Every Time", "Stop Wasting Time on " + clean + " (Do THIS Instead)", "I Wish I Knew This About " + clean + " 5 Years Ago!"});
        }
    }

    private static final List<String> YouTubeTitleGeneratorScreen$lambda$10(MutableState<List<String>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit YouTubeTitleGeneratorScreen$lambda$15(final boolean r41, final kotlin.jvm.functions.Function0 r42, androidx.compose.runtime.Composer r43, int r44) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.creator.CreatorToolsKt.YouTubeTitleGeneratorScreen$lambda$15(boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeTitleGeneratorScreen$lambda$15$lambda$14$lambda$12(boolean $isShortsMode, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C128@5905L79:CreatorTools.kt#k11ekw");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1221210347, $changed, -1, "com.example.ui.tools.creator.YouTubeTitleGeneratorScreen.<anonymous>.<anonymous>.<anonymous> (CreatorTools.kt:128)");
            }
            TextKt.m2696Text4IGK_g($isShortsMode ? "Shorts Title Generator" : "YouTube Title Generator", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeTitleGeneratorScreen$lambda$15$lambda$14$lambda$13(Function0 $onBack, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C130@6051L155:CreatorTools.kt#k11ekw");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1215348887, $changed, -1, "com.example.ui.tools.creator.YouTubeTitleGeneratorScreen.<anonymous>.<anonymous>.<anonymous> (CreatorTools.kt:130)");
            }
            IconButtonKt.IconButton($onBack, null, false, null, null, ComposableSingletons$CreatorToolsKt.INSTANCE.getLambda$1402616948$app(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0545 A[LOOP:1: B:69:0x053f->B:71:0x0545, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit YouTubeTitleGeneratorScreen$lambda$31(final boolean r82, final androidx.compose.runtime.MutableState r83, final androidx.compose.runtime.MutableState r84, final androidx.compose.runtime.MutableState r85, java.util.List r86, final android.content.Context r87, androidx.compose.foundation.layout.PaddingValues r88, androidx.compose.runtime.Composer r89, int r90) {
        /*
            Method dump skipped, instructions count: 1512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.creator.CreatorToolsKt.YouTubeTitleGeneratorScreen$lambda$31(boolean, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, java.util.List, android.content.Context, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeTitleGeneratorScreen$lambda$31$lambda$30$lambda$17$lambda$16(MutableState $topic$delegate, MutableState $tone$delegate, boolean $isShortsMode, MutableState $titles$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $topic$delegate.setValue(it);
        $titles$delegate.setValue(YouTubeTitleGeneratorScreen$generateTitles($isShortsMode, it, YouTubeTitleGeneratorScreen$lambda$6($tone$delegate)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeTitleGeneratorScreen$lambda$31$lambda$30$lambda$22$lambda$21$lambda$19$lambda$18(String $item, MutableState $tone$delegate, MutableState $topic$delegate, boolean $isShortsMode, MutableState $titles$delegate) {
        $tone$delegate.setValue($item);
        $titles$delegate.setValue(YouTubeTitleGeneratorScreen$generateTitles($isShortsMode, YouTubeTitleGeneratorScreen$lambda$3($topic$delegate), $item));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeTitleGeneratorScreen$lambda$31$lambda$30$lambda$22$lambda$21$lambda$20(String $item, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C173@7758L10:CreatorTools.kt#k11ekw");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1674706894, $changed, -1, "com.example.ui.tools.creator.YouTubeTitleGeneratorScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreatorTools.kt:173)");
            }
            TextKt.m2696Text4IGK_g($item, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeTitleGeneratorScreen$lambda$31$lambda$30$lambda$24$lambda$23(MutableState $topic$delegate, MutableState $tone$delegate, boolean $isShortsMode, MutableState $titles$delegate) {
        $titles$delegate.setValue(YouTubeTitleGeneratorScreen$generateTitles($isShortsMode, YouTubeTitleGeneratorScreen$lambda$3($topic$delegate), YouTubeTitleGeneratorScreen$lambda$6($tone$delegate)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00fe, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11.rememberedValue(), java.lang.Integer.valueOf(r29)) == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit YouTubeTitleGeneratorScreen$lambda$31$lambda$30$lambda$29$lambda$28(final java.lang.String r57, final android.content.Context r58, androidx.compose.foundation.layout.ColumnScope r59, androidx.compose.runtime.Composer r60, int r61) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.creator.CreatorToolsKt.YouTubeTitleGeneratorScreen$lambda$31$lambda$30$lambda$29$lambda$28(java.lang.String, android.content.Context, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeTitleGeneratorScreen$lambda$31$lambda$30$lambda$29$lambda$28$lambda$27$lambda$26$lambda$25(Context $context, String $titleText) {
        ImageExportUtils.INSTANCE.copyToClipboard($context, $titleText, "Title");
        return Unit.INSTANCE;
    }

    public static final void HashtagAndTagGeneratorScreen(boolean isTagMode, final Function0<Unit> onBack, Composer $composer, final int $changed, final int i) {
        final boolean isTagMode2;
        Object obj;
        int $dirty;
        Object obj2;
        Object obj3;
        Composer $composer2;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer $composer3 = $composer.startRestartGroup(1953206025);
        ComposerKt.sourceInformation($composer3, "C(HashtagAndTagGeneratorScreen)226@9869L12,226@9857L24,227@9913L7,229@9941L40,248@10682L50,251@10765L583,265@11355L2187,250@10738L2804:CreatorTools.kt#k11ekw");
        int $dirty2 = $changed;
        int i2 = i & 1;
        if (i2 != 0) {
            $dirty2 |= 6;
            isTagMode2 = isTagMode;
        } else if (($changed & 6) == 0) {
            isTagMode2 = isTagMode;
            $dirty2 |= $composer3.changed(isTagMode2) ? 4 : 2;
        } else {
            isTagMode2 = isTagMode;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer3.changedInstance(onBack) ? 32 : 16;
        }
        if (($dirty2 & 19) == 18 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            final boolean isTagMode3 = i2 != 0 ? false : isTagMode2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1953206025, $dirty2, -1, "com.example.ui.tools.creator.HashtagAndTagGeneratorScreen (CreatorTools.kt:225)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 130286517, "CC(remember):CreatorTools.kt#9igjgp");
            boolean z = ($dirty2 & 112) == 32;
            Object rememberedValue = $composer3.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.tools.creator.CreatorToolsKt$$ExternalSyntheticLambda32
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreatorToolsKt.HashtagAndTagGeneratorScreen$lambda$34$lambda$33(Function0.this);
                    }
                };
                $composer3.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            BackHandlerKt.BackHandler(false, (Function0) obj, $composer3, 0, 1);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Context context = (Context) consume;
            ComposerKt.sourceInformationMarkerStart($composer3, 130288849, "CC(remember):CreatorTools.kt#9igjgp");
            Object rememberedValue2 = $composer3.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                $dirty = $dirty2;
                obj2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("Tech & AI", null, 2, null);
                $composer3.updateRememberedValue(obj2);
            } else {
                $dirty = $dirty2;
                obj2 = rememberedValue2;
            }
            final MutableState keyword$delegate = (MutableState) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 130312571, "CC(remember):CreatorTools.kt#9igjgp");
            Object rememberedValue3 = $composer3.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(HashtagAndTagGeneratorScreen$generateTags(isTagMode3, HashtagAndTagGeneratorScreen$lambda$36(keyword$delegate)), null, 2, null);
                $composer3.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            final MutableState tags$delegate = (MutableState) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            boolean isTagMode4 = isTagMode3;
            ScaffoldKt.m2411ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-220926515, true, new Function2() { // from class: com.example.ui.tools.creator.CreatorToolsKt$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return CreatorToolsKt.HashtagAndTagGeneratorScreen$lambda$44(isTagMode3, onBack, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer3, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-939728872, true, new Function3() { // from class: com.example.ui.tools.creator.CreatorToolsKt$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    return CreatorToolsKt.HashtagAndTagGeneratorScreen$lambda$54(isTagMode3, keyword$delegate, tags$delegate, context, (PaddingValues) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, $composer3, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            isTagMode2 = isTagMode4;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.tools.creator.CreatorToolsKt$$ExternalSyntheticLambda36
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return CreatorToolsKt.HashtagAndTagGeneratorScreen$lambda$55(isTagMode2, onBack, $changed, i, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HashtagAndTagGeneratorScreen$lambda$34$lambda$33(Function0 $onBack) {
        $onBack.invoke();
        return Unit.INSTANCE;
    }

    private static final String HashtagAndTagGeneratorScreen$lambda$36(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final List<String> HashtagAndTagGeneratorScreen$generateTags(boolean $isTagMode, String kw) {
        String lowerCase = kw.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String clean = StringsKt.replace$default(lowerCase, " ", "", false, 4, (Object) null);
        return $isTagMode ? CollectionsKt.listOf((Object[]) new String[]{kw, kw + " tutorial", "best " + kw, "how to " + kw, kw + " 2026", kw + " tips", kw + " tricks", "learn " + kw, kw + " review", kw + " guide", kw + " online", kw + " free", kw + " course"}) : CollectionsKt.listOf((Object[]) new String[]{"#" + clean, "#" + clean + "viral", "#trending", "#reelsindia", "#fyp", "#explorepage", "#shorts", "#youtubeshorts", "#instagramreels", "#creator", "#daily" + clean, "#viralpost", "#best" + clean});
    }

    private static final List<String> HashtagAndTagGeneratorScreen$lambda$39(MutableState<List<String>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit HashtagAndTagGeneratorScreen$lambda$44(final boolean r41, final kotlin.jvm.functions.Function0 r42, androidx.compose.runtime.Composer r43, int r44) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.creator.CreatorToolsKt.HashtagAndTagGeneratorScreen$lambda$44(boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HashtagAndTagGeneratorScreen$lambda$44$lambda$43$lambda$41(boolean $isTagMode, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C254@10845L71:CreatorTools.kt#k11ekw");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(477588095, $changed, -1, "com.example.ui.tools.creator.HashtagAndTagGeneratorScreen.<anonymous>.<anonymous>.<anonymous> (CreatorTools.kt:254)");
            }
            TextKt.m2696Text4IGK_g($isTagMode ? "SEO Video Tag Generator" : "Hashtag Generator", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HashtagAndTagGeneratorScreen$lambda$44$lambda$43$lambda$42(Function0 $onBack, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C256@10983L155:CreatorTools.kt#k11ekw");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1298486979, $changed, -1, "com.example.ui.tools.creator.HashtagAndTagGeneratorScreen.<anonymous>.<anonymous>.<anonymous> (CreatorTools.kt:256)");
            }
            IconButtonKt.IconButton($onBack, null, false, null, null, ComposableSingletons$CreatorToolsKt.INSTANCE.getLambda$211855616$app(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x022b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit HashtagAndTagGeneratorScreen$lambda$54(final boolean r58, final androidx.compose.runtime.MutableState r59, androidx.compose.runtime.MutableState r60, final android.content.Context r61, androidx.compose.foundation.layout.PaddingValues r62, androidx.compose.runtime.Composer r63, int r64) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.creator.CreatorToolsKt.HashtagAndTagGeneratorScreen$lambda$54(boolean, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, android.content.Context, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HashtagAndTagGeneratorScreen$lambda$54$lambda$53$lambda$46$lambda$45(MutableState $keyword$delegate, boolean $isTagMode, MutableState $tags$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $keyword$delegate.setValue(it);
        $tags$delegate.setValue(HashtagAndTagGeneratorScreen$generateTags($isTagMode, it));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0275  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit HashtagAndTagGeneratorScreen$lambda$54$lambda$53$lambda$52(final java.lang.String r77, final android.content.Context r78, final boolean r79, androidx.compose.foundation.layout.ColumnScope r80, androidx.compose.runtime.Composer r81, int r82) {
        /*
            Method dump skipped, instructions count: 1011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.creator.CreatorToolsKt.HashtagAndTagGeneratorScreen$lambda$54$lambda$53$lambda$52(java.lang.String, android.content.Context, boolean, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HashtagAndTagGeneratorScreen$lambda$54$lambda$53$lambda$52$lambda$51$lambda$49$lambda$48(Context $context, String $fullText, boolean $isTagMode) {
        ImageExportUtils.INSTANCE.copyToClipboard($context, $fullText, $isTagMode ? "Tags" : "Hashtags");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HashtagAndTagGeneratorScreen$lambda$54$lambda$53$lambda$52$lambda$51$lambda$50(boolean $isTagMode, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C305@13237L90,306@13352L28,307@13405L67:CreatorTools.kt#k11ekw");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-112136566, $changed, -1, "com.example.ui.tools.creator.HashtagAndTagGeneratorScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreatorTools.kt:305)");
            }
            IconKt.m2153Iconww6aTOc(ContentCopyKt.getContentCopy(Icons.Filled.INSTANCE), (String) null, SizeKt.m718size3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(18)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.m723width3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(8)), $composer, 6);
            TextKt.m2696Text4IGK_g($isTagMode ? "Copy All Video Tags" : "Copy All Hashtags", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void YouTubeRevenueCalculatorScreen(final Function0<Unit> onBack, Composer $composer, final int $changed) {
        Object obj;
        Object obj2;
        Object obj3;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer $composer2 = $composer.startRestartGroup(-83608530);
        ComposerKt.sourceInformation($composer2, "C(YouTubeRevenueCalculatorScreen)322@13803L12,322@13791L24,324@13839L40,325@13904L38,334@14184L546,348@14737L4457,333@14157L5037:CreatorTools.kt#k11ekw");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(onBack) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-83608530, $dirty, -1, "com.example.ui.tools.creator.YouTubeRevenueCalculatorScreen (CreatorTools.kt:321)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 1256585306, "CC(remember):CreatorTools.kt#9igjgp");
            boolean z = ($dirty & 14) == 4;
            Object rememberedValue = $composer2.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.tools.creator.CreatorToolsKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreatorToolsKt.YouTubeRevenueCalculatorScreen$lambda$57$lambda$56(Function0.this);
                    }
                };
                $composer2.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            BackHandlerKt.BackHandler(false, (Function0) obj, $composer2, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer2, 1256586486, "CC(remember):CreatorTools.kt#9igjgp");
            Object rememberedValue2 = $composer2.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(10000.0f);
                $composer2.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            final MutableFloatState dailyViews$delegate = (MutableFloatState) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1256588564, "CC(remember):CreatorTools.kt#9igjgp");
            Object rememberedValue3 = $composer2.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(2.5f);
                $composer2.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            final MutableFloatState estimatedCpm$delegate = (MutableFloatState) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final float dailyEarnings = (YouTubeRevenueCalculatorScreen$lambda$59(dailyViews$delegate) / 1000.0f) * YouTubeRevenueCalculatorScreen$lambda$62(estimatedCpm$delegate);
            final float monthlyEarnings = dailyEarnings * 30.0f;
            final float yearlyEarnings = dailyEarnings * 365.0f;
            final double inrRate = 84.0d;
            ScaffoldKt.m2411ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(1618804210, true, new Function2() { // from class: com.example.ui.tools.creator.CreatorToolsKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return CreatorToolsKt.YouTubeRevenueCalculatorScreen$lambda$66(Function0.this, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-437304195, true, new Function3() { // from class: com.example.ui.tools.creator.CreatorToolsKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    return CreatorToolsKt.YouTubeRevenueCalculatorScreen$lambda$85(monthlyEarnings, inrRate, dailyViews$delegate, estimatedCpm$delegate, dailyEarnings, yearlyEarnings, (PaddingValues) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, $composer2, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.tools.creator.CreatorToolsKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return CreatorToolsKt.YouTubeRevenueCalculatorScreen$lambda$86(Function0.this, $changed, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeRevenueCalculatorScreen$lambda$57$lambda$56(Function0 $onBack) {
        $onBack.invoke();
        return Unit.INSTANCE;
    }

    private static final float YouTubeRevenueCalculatorScreen$lambda$59(MutableFloatState $dailyViews$delegate) {
        return $dailyViews$delegate.getFloatValue();
    }

    private static final float YouTubeRevenueCalculatorScreen$lambda$62(MutableFloatState $estimatedCpm$delegate) {
        return $estimatedCpm$delegate.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit YouTubeRevenueCalculatorScreen$lambda$66(final kotlin.jvm.functions.Function0 r41, androidx.compose.runtime.Composer r42, int r43) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.creator.CreatorToolsKt.YouTubeRevenueCalculatorScreen$lambda$66(kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeRevenueCalculatorScreen$lambda$66$lambda$65$lambda$64(Function0 $onBack, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C339@14365L155:CreatorTools.kt#k11ekw");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-397406878, $changed, -1, "com.example.ui.tools.creator.YouTubeRevenueCalculatorScreen.<anonymous>.<anonymous>.<anonymous> (CreatorTools.kt:339)");
            }
            IconButtonKt.IconButton($onBack, null, false, null, null, ComposableSingletons$CreatorToolsKt.INSTANCE.getLambda$1068882789$app(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit YouTubeRevenueCalculatorScreen$lambda$85(final float r39, final double r40, final androidx.compose.runtime.MutableFloatState r42, final androidx.compose.runtime.MutableFloatState r43, final float r44, final float r45, androidx.compose.foundation.layout.PaddingValues r46, androidx.compose.runtime.Composer r47, int r48) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.creator.CreatorToolsKt.YouTubeRevenueCalculatorScreen$lambda$85(float, double, androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.MutableFloatState, float, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeRevenueCalculatorScreen$lambda$85$lambda$84$lambda$68(float $monthlyEarnings, double $inrRate, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C363@15302L808:CreatorTools.kt#k11ekw");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-986329707, $changed, -1, "com.example.ui.tools.creator.YouTubeRevenueCalculatorScreen.<anonymous>.<anonymous>.<anonymous> (CreatorTools.kt:363)");
            }
            Modifier m673padding3ABfNKs = PaddingKt.m673padding3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(20));
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, m673padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((390 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer m3655constructorimpl = Updater.m3655constructorimpl($composer);
            Updater.m3662setimpl(m3655constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3662setimpl(m3655constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3655constructorimpl.getInserting() || !Intrinsics.areEqual(m3655constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3655constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3655constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3662setimpl(m3655constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384862393, "C87@4365L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i3 = ((390 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -34768643, "C367@15477L79,368@15577L29,369@15627L238,375@15886L206:CreatorTools.kt#k11ekw");
            TextKt.m2696Text4IGK_g("Estimated Monthly Earnings", (Modifier) null, ColorKt.Color(4285458359L), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3462, 0, 131058);
            SpacerKt.Spacer(SizeKt.m704height3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(6)), $composer, 6);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%,.0f", Arrays.copyOf(new Object[]{Float.valueOf($monthlyEarnings)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            TextKt.m2696Text4IGK_g("$" + format, (Modifier) null, Color.INSTANCE.m4199getWhite0d7_KjU(), TextUnitKt.getSp(34), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200064, 0, 131026);
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String format2 = String.format("%,.0f", Arrays.copyOf(new Object[]{Double.valueOf($monthlyEarnings * $inrRate)}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            TextKt.m2696Text4IGK_g("≈ ₹" + format2 + " INR", (Modifier) null, ColorKt.Color(4289197008L), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3456, 0, 131058);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit YouTubeRevenueCalculatorScreen$lambda$85$lambda$84$lambda$73(final androidx.compose.runtime.MutableFloatState r72, androidx.compose.foundation.layout.ColumnScope r73, androidx.compose.runtime.Composer r74, int r75) {
        /*
            Method dump skipped, instructions count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.creator.CreatorToolsKt.YouTubeRevenueCalculatorScreen$lambda$85$lambda$84$lambda$73(androidx.compose.runtime.MutableFloatState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeRevenueCalculatorScreen$lambda$85$lambda$84$lambda$73$lambda$72$lambda$71$lambda$70(MutableFloatState $dailyViews$delegate, float it) {
        $dailyViews$delegate.setFloatValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit YouTubeRevenueCalculatorScreen$lambda$85$lambda$84$lambda$78(final androidx.compose.runtime.MutableFloatState r72, androidx.compose.foundation.layout.ColumnScope r73, androidx.compose.runtime.Composer r74, int r75) {
        /*
            Method dump skipped, instructions count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.creator.CreatorToolsKt.YouTubeRevenueCalculatorScreen$lambda$85$lambda$84$lambda$78(androidx.compose.runtime.MutableFloatState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeRevenueCalculatorScreen$lambda$85$lambda$84$lambda$78$lambda$77$lambda$76$lambda$75(MutableFloatState $estimatedCpm$delegate, float it) {
        $estimatedCpm$delegate.setFloatValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x060a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x044a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit YouTubeRevenueCalculatorScreen$lambda$85$lambda$84$lambda$83(float r111, double r112, float r114, float r115, androidx.compose.foundation.layout.ColumnScope r116, androidx.compose.runtime.Composer r117, int r118) {
        /*
            Method dump skipped, instructions count: 1827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.creator.CreatorToolsKt.YouTubeRevenueCalculatorScreen$lambda$85$lambda$84$lambda$83(float, double, float, float, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final void VideoFileSizeCalculatorScreen(final Function0<Unit> onBack, Composer $composer, final int $changed) {
        Object obj;
        Object obj2;
        Object obj3;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer $composer2 = $composer.startRestartGroup(1899116619);
        ComposerKt.sourceInformation($composer2, "C(VideoFileSizeCalculatorScreen)446@19460L12,446@19448L24,448@19505L33,449@19566L33,460@19973L546,474@20526L2470,459@19946L3050:CreatorTools.kt#k11ekw");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(onBack) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1899116619, $dirty, -1, "com.example.ui.tools.creator.VideoFileSizeCalculatorScreen (CreatorTools.kt:445)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -310025961, "CC(remember):CreatorTools.kt#9igjgp");
            boolean z = ($dirty & 14) == 4;
            Object rememberedValue = $composer2.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.tools.creator.CreatorToolsKt$$ExternalSyntheticLambda38
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreatorToolsKt.VideoFileSizeCalculatorScreen$lambda$88$lambda$87(Function0.this);
                    }
                };
                $composer2.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            BackHandlerKt.BackHandler(false, (Function0) obj, $composer2, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer2, -310024500, "CC(remember):CreatorTools.kt#9igjgp");
            Object rememberedValue2 = $composer2.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("10", null, 2, null);
                $composer2.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            final MutableState durationMinutesText$delegate = (MutableState) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -310022548, "CC(remember):CreatorTools.kt#9igjgp");
            Object rememberedValue3 = $composer2.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("16", null, 2, null);
                $composer2.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            final MutableState bitrateMbpsText$delegate = (MutableState) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Double doubleOrNull = StringsKt.toDoubleOrNull(VideoFileSizeCalculatorScreen$lambda$90(durationMinutesText$delegate));
            double minutes = doubleOrNull != null ? doubleOrNull.doubleValue() : 10.0d;
            Double doubleOrNull2 = StringsKt.toDoubleOrNull(VideoFileSizeCalculatorScreen$lambda$93(bitrateMbpsText$delegate));
            double bitrateMbps = doubleOrNull2 != null ? doubleOrNull2.doubleValue() : 16.0d;
            double totalSeconds = minutes * 60.0d;
            final double sizeInMb = (bitrateMbps * totalSeconds) / 8.0d;
            final double sizeInGb = sizeInMb / 1024.0d;
            ScaffoldKt.m2411ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(1954033159, true, new Function2() { // from class: com.example.ui.tools.creator.CreatorToolsKt$$ExternalSyntheticLambda39
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return CreatorToolsKt.VideoFileSizeCalculatorScreen$lambda$97(Function0.this, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(363686428, true, new Function3() { // from class: com.example.ui.tools.creator.CreatorToolsKt$$ExternalSyntheticLambda40
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    return CreatorToolsKt.VideoFileSizeCalculatorScreen$lambda$110(sizeInGb, sizeInMb, durationMinutesText$delegate, bitrateMbpsText$delegate, (PaddingValues) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, $composer2, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.tools.creator.CreatorToolsKt$$ExternalSyntheticLambda41
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return CreatorToolsKt.VideoFileSizeCalculatorScreen$lambda$111(Function0.this, $changed, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit VideoFileSizeCalculatorScreen$lambda$88$lambda$87(Function0 $onBack) {
        $onBack.invoke();
        return Unit.INSTANCE;
    }

    private static final String VideoFileSizeCalculatorScreen$lambda$90(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String VideoFileSizeCalculatorScreen$lambda$93(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit VideoFileSizeCalculatorScreen$lambda$97(final kotlin.jvm.functions.Function0 r41, androidx.compose.runtime.Composer r42, int r43) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.creator.CreatorToolsKt.VideoFileSizeCalculatorScreen$lambda$97(kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit VideoFileSizeCalculatorScreen$lambda$97$lambda$96$lambda$95(Function0 $onBack, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C465@20154L155:CreatorTools.kt#k11ekw");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1196257431, $changed, -1, "com.example.ui.tools.creator.VideoFileSizeCalculatorScreen.<anonymous>.<anonymous>.<anonymous> (CreatorTools.kt:465)");
            }
            IconButtonKt.IconButton($onBack, null, false, null, null, ComposableSingletons$CreatorToolsKt.INSTANCE.m7038getLambda$557558220$app(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit VideoFileSizeCalculatorScreen$lambda$110(final double r84, final double r86, final androidx.compose.runtime.MutableState r88, androidx.compose.runtime.MutableState r89, androidx.compose.foundation.layout.PaddingValues r90, androidx.compose.runtime.Composer r91, int r92) {
        /*
            Method dump skipped, instructions count: 1455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.creator.CreatorToolsKt.VideoFileSizeCalculatorScreen$lambda$110(double, double, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit VideoFileSizeCalculatorScreen$lambda$110$lambda$109$lambda$99(double $sizeInGb, double $sizeInMb, ColumnScope Card, Composer $composer, int $changed) {
        StringBuilder append;
        String str;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C488@21077L599:CreatorTools.kt#k11ekw");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(761617924, $changed, -1, "com.example.ui.tools.creator.VideoFileSizeCalculatorScreen.<anonymous>.<anonymous>.<anonymous> (CreatorTools.kt:488)");
            }
            Modifier m673padding3ABfNKs = PaddingKt.m673padding3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(20));
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, m673padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((390 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                $composer.createNode(constructor);
            } else {
                $composer.useNode();
            }
            Composer m3655constructorimpl = Updater.m3655constructorimpl($composer);
            Updater.m3662setimpl(m3655constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3662setimpl(m3655constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3655constructorimpl.getInserting() || !Intrinsics.areEqual(m3655constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3655constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3655constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3662setimpl(m3655constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384862393, "C87@4365L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i3 = ((390 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1185021753, "C489@21245L10,489@21194L73,490@21288L29,495@21617L11,491@21338L320:CreatorTools.kt#k11ekw");
            TextKt.m2696Text4IGK_g("Estimated Video Size", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleSmall(), $composer, 6, 0, 65534);
            SpacerKt.Spacer(SizeKt.m704height3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(6)), $composer, 6);
            if ($sizeInGb >= 1.0d) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf($sizeInGb)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                append = new StringBuilder().append(format);
                str = " GB";
            } else {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String format2 = String.format("%.0f", Arrays.copyOf(new Object[]{Double.valueOf($sizeInMb)}, 1));
                Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                append = new StringBuilder().append(format2);
                str = " MB";
            }
            TextKt.m2696Text4IGK_g(append.append(str).toString(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), TextUnitKt.getSp(32), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131026);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit VideoFileSizeCalculatorScreen$lambda$110$lambda$109$lambda$101$lambda$100(MutableState $durationMinutesText$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $durationMinutesText$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit VideoFileSizeCalculatorScreen$lambda$110$lambda$109$lambda$103$lambda$102(MutableState $bitrateMbpsText$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $bitrateMbpsText$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit VideoFileSizeCalculatorScreen$lambda$110$lambda$109$lambda$108$lambda$107$lambda$105$lambda$104(String $rate, MutableState $bitrateMbpsText$delegate) {
        $bitrateMbpsText$delegate.setValue($rate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit VideoFileSizeCalculatorScreen$lambda$110$lambda$109$lambda$108$lambda$107$lambda$106(String $label, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C522@22899L25:CreatorTools.kt#k11ekw");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1096799684, $changed, -1, "com.example.ui.tools.creator.VideoFileSizeCalculatorScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreatorTools.kt:522)");
            }
            TextKt.m2696Text4IGK_g((String) StringsKt.split$default((CharSequence) $label, new String[]{" "}, false, 0, 6, (Object) null).get(0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
