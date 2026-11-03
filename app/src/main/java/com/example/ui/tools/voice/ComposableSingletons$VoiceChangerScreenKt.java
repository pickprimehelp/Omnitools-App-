package com.example.ui.tools.voice;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.ShareKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VoiceChangerScreen.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$VoiceChangerScreenKt {
    public static final ComposableSingletons$VoiceChangerScreenKt INSTANCE = new ComposableSingletons$VoiceChangerScreenKt();
    private static Function2<Composer, Integer, Unit> lambda$1850868348 = ComposableLambdaKt.composableLambdaInstance(1850868348, false, new Function2() { // from class: com.example.ui.tools.voice.ComposableSingletons$VoiceChangerScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$VoiceChangerScreenKt.lambda_1850868348$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$319571645 = ComposableLambdaKt.composableLambdaInstance(319571645, false, new Function2() { // from class: com.example.ui.tools.voice.ComposableSingletons$VoiceChangerScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$VoiceChangerScreenKt.lambda_319571645$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1252687642, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f219lambda$1252687642 = ComposableLambdaKt.composableLambdaInstance(-1252687642, false, new Function3() { // from class: com.example.ui.tools.voice.ComposableSingletons$VoiceChangerScreenKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$VoiceChangerScreenKt.lambda__1252687642$lambda$2((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-1252687642$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7158getLambda$1252687642$app() {
        return f219lambda$1252687642;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1850868348$app() {
        return lambda$1850868348;
    }

    public final Function2<Composer, Integer, Unit> getLambda$319571645$app() {
        return lambda$319571645;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_1850868348$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C274@10454L27:VoiceChangerScreen.kt#csu3va");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1850868348, $changed, -1, "com.example.ui.tools.voice.ComposableSingletons$VoiceChangerScreenKt.lambda$1850868348.<anonymous> (VoiceChangerScreen.kt:274)");
            }
            TextKt.m2696Text4IGK_g("Voice Changer Tools", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_319571645$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C277@10607L70:VoiceChangerScreen.kt#csu3va");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(319571645, $changed, -1, "com.example.ui.tools.voice.ComposableSingletons$VoiceChangerScreenKt.lambda$319571645.<anonymous> (VoiceChangerScreen.kt:277)");
            }
            IconKt.m2153Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "Back", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1252687642$lambda$2(RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C380@15865L84,381@15982L28,382@16043L19:VoiceChangerScreen.kt#csu3va");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1252687642, $changed, -1, "com.example.ui.tools.voice.ComposableSingletons$VoiceChangerScreenKt.lambda$-1252687642.<anonymous> (VoiceChangerScreen.kt:380)");
            }
            IconKt.m2153Iconww6aTOc(ShareKt.getShare(Icons.Filled.INSTANCE), (String) null, SizeKt.m718size3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(18)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.m723width3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(6)), $composer, 6);
            TextKt.m2696Text4IGK_g("Share Audio", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
