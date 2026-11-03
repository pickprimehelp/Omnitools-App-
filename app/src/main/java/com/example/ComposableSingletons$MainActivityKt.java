package com.example;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.example.ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MainActivity.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$MainActivityKt {
    public static final ComposableSingletons$MainActivityKt INSTANCE = new ComposableSingletons$MainActivityKt();
    private static Function2<Composer, Integer, Unit> lambda$434770631 = ComposableLambdaKt.composableLambdaInstance(434770631, false, new Function2() { // from class: com.example.ComposableSingletons$MainActivityKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MainActivityKt.lambda_434770631$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-601144069, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f88lambda$601144069 = ComposableLambdaKt.composableLambdaInstance(-601144069, false, new Function2() { // from class: com.example.ComposableSingletons$MainActivityKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MainActivityKt.lambda__601144069$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: getLambda$-601144069$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6986getLambda$601144069$app() {
        return f88lambda$601144069;
    }

    public final Function2<Composer, Integer, Unit> getLambda$434770631$app() {
        return lambda$434770631;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__601144069$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C52@2384L65:MainActivity.kt#to5c3");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-601144069, $changed, -1, "com.example.ComposableSingletons$MainActivityKt.lambda$-601144069.<anonymous> (MainActivity.kt:52)");
            }
            ThemeKt.MyApplicationTheme(false, false, lambda$434770631, $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_434770631$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C53@2421L14:MainActivity.kt#to5c3");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(434770631, $changed, -1, "com.example.ComposableSingletons$MainActivityKt.lambda$434770631.<anonymous> (MainActivity.kt:53)");
            }
            MainActivityKt.OmniToolsApp($composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
