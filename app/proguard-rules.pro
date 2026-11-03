# Optimization and Obfuscation Rules for OmniTools Release

# Keep Main Entry points and Activity
-keep public class com.example.MainActivity { *; }
-keep public class * extends android.app.Activity
-keep public class * extends android.app.Application

# Jetpack Compose Rules
-keep class androidx.compose.** { *; }
-dontwarn androidx.compose.**

# Google Mobile Ads (AdMob)
-keep class com.google.android.gms.ads.** { *; }
-dontwarn com.google.android.gms.ads.**

# Coroutines and Kotlin runtime
-keep class kotlinx.coroutines.** { *; }
-dontwarn kotlinx.coroutines.**
-keepattributes *Annotation*,Signature,InnerClasses,EnclosingMethod,SourceFile,LineNumberTable

# Keep Models and Tools
-keep class com.example.model.** { *; }
-keep class com.example.ui.** { *; }
-keep class com.example.ads.** { *; }
