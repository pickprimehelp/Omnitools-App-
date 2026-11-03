package com.example.ui.theme;

import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Theme.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"DarkColorScheme", "Landroidx/compose/material3/ColorScheme;", "LightColorScheme", "MyApplicationTheme", "", "darkTheme", "", "dynamicColor", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThemeKt {
    private static final ColorScheme DarkColorScheme = ColorSchemeKt.m1935darkColorSchemeCXl9yA$default(ColorKt.getIndigoPrimary(), Color.INSTANCE.m4199getWhite0d7_KjU(), androidx.compose.ui.graphics.ColorKt.Color(4281413249L), androidx.compose.ui.graphics.ColorKt.Color(4292929535L), 0, ColorKt.getCyanAccent(), androidx.compose.ui.graphics.ColorKt.Color(4278464302L), androidx.compose.ui.graphics.ColorKt.Color(4279455306L), androidx.compose.ui.graphics.ColorKt.Color(4291623921L), ColorKt.getPurpleAccent(), 0, 0, 0, ColorKt.getSlateBgDark(), ColorKt.getTextPrimaryDark(), ColorKt.getSlateSurfaceDark(), ColorKt.getTextPrimaryDark(), ColorKt.getSlateCardDark(), ColorKt.getTextSecondaryDark(), 0, 0, 0, ColorKt.getRoseError(), 0, 0, 0, ColorKt.getSlateBorderDark(), 0, 0, 0, 0, 0, 0, 0, 0, 0, -71820272, 15, null);
    private static final ColorScheme LightColorScheme = ColorSchemeKt.m1939lightColorSchemeCXl9yA$default(ColorKt.getIndigoPrimaryVariant(), Color.INSTANCE.m4199getWhite0d7_KjU(), androidx.compose.ui.graphics.ColorKt.Color(4293849855L), androidx.compose.ui.graphics.ColorKt.Color(4281413249L), 0, ColorKt.getCyanAccent(), Color.INSTANCE.m4199getWhite0d7_KjU(), androidx.compose.ui.graphics.ColorKt.Color(4292932350L), androidx.compose.ui.graphics.ColorKt.Color(4278413729L), ColorKt.getPurpleAccent(), 0, 0, 0, ColorKt.getSlateBgLight(), ColorKt.getTextPrimaryLight(), ColorKt.getSlateSurfaceLight(), ColorKt.getTextPrimaryLight(), androidx.compose.ui.graphics.ColorKt.Color(4294047225L), ColorKt.getTextSecondaryLight(), 0, 0, 0, ColorKt.getRoseError(), 0, 0, 0, ColorKt.getSlateBorderLight(), 0, 0, 0, 0, 0, 0, 0, 0, 0, -71820272, 15, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MyApplicationTheme$lambda$0(boolean z, boolean z2, Function2 function2, int i, int i2, Composer composer, int i3) {
        MyApplicationTheme(z, z2, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void MyApplicationTheme(boolean darkTheme, boolean dynamicColor, final Function2<? super Composer, ? super Integer, Unit> content, Composer $composer, final int $changed, final int i) {
        boolean darkTheme2;
        boolean dynamicColor2;
        int $dirty;
        boolean darkTheme3;
        Composer $composer2;
        final boolean darkTheme4;
        final boolean dynamicColor3;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer $composer3 = $composer.startRestartGroup(548420513);
        ComposerKt.sourceInformation($composer3, "C(MyApplicationTheme)P(1,2)60@2074L114:Theme.kt#75kw8w");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= ((i & 1) == 0 && $composer3.changed(darkTheme)) ? 4 : 2;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer3.changedInstance(content) ? 256 : 128;
        }
        if (($dirty2 & 131) == 130 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            dynamicColor3 = dynamicColor;
            $composer2 = $composer3;
            darkTheme4 = darkTheme;
        } else {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "55@1862L21");
            if (($changed & 1) == 0 || $composer3.getDefaultsInvalid()) {
                if ((i & 1) != 0) {
                    darkTheme2 = DarkThemeKt.isSystemInDarkTheme($composer3, 0);
                    $dirty2 &= -15;
                } else {
                    darkTheme2 = darkTheme;
                }
                if ((i & 2) != 0) {
                    $dirty = $dirty2;
                    darkTheme3 = darkTheme2;
                    dynamicColor2 = false;
                } else {
                    dynamicColor2 = dynamicColor;
                    $dirty = $dirty2;
                    darkTheme3 = darkTheme2;
                }
            } else {
                $composer3.skipToGroupEnd();
                if ((i & 1) != 0) {
                    $dirty2 &= -15;
                }
                darkTheme3 = darkTheme;
                dynamicColor2 = dynamicColor;
                $dirty = $dirty2;
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(548420513, $dirty, -1, "com.example.ui.theme.MyApplicationTheme (Theme.kt:58)");
            }
            ColorScheme colorScheme = darkTheme3 ? DarkColorScheme : LightColorScheme;
            MaterialThemeKt.MaterialTheme(colorScheme, null, TypeKt.getTypography(), content, $composer3, (($dirty << 3) & 7168) | 384, 2);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            darkTheme4 = darkTheme3;
            dynamicColor3 = dynamicColor2;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.theme.ThemeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ThemeKt.MyApplicationTheme$lambda$0(darkTheme4, dynamicColor3, content, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
