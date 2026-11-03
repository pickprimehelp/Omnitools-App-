package com.example.ui.tools.image;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.AddPhotoAlternateKt;
import androidx.compose.material.icons.filled.DownloadKt;
import androidx.compose.material.icons.filled.PhotoCameraKt;
import androidx.compose.material.icons.filled.ShareKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageTools.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$ImageToolsKt {
    public static final ComposableSingletons$ImageToolsKt INSTANCE = new ComposableSingletons$ImageToolsKt();
    private static Function2<Composer, Integer, Unit> lambda$807675727 = ComposableLambdaKt.composableLambdaInstance(807675727, false, new Function2() { // from class: com.example.ui.tools.image.ComposableSingletons$ImageToolsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ImageToolsKt.lambda_807675727$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$741244526 = ComposableLambdaKt.composableLambdaInstance(741244526, false, new Function2() { // from class: com.example.ui.tools.image.ComposableSingletons$ImageToolsKt$$ExternalSyntheticLambda9
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ImageToolsKt.lambda_741244526$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1164015079, reason: not valid java name */
    private static Function3<ColumnScope, Composer, Integer, Unit> f205lambda$1164015079 = ComposableLambdaKt.composableLambdaInstance(-1164015079, false, new Function3() { // from class: com.example.ui.tools.image.ComposableSingletons$ImageToolsKt$$ExternalSyntheticLambda10
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ImageToolsKt.lambda__1164015079$lambda$3((ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1341147964, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f206lambda$1341147964 = ComposableLambdaKt.composableLambdaInstance(-1341147964, false, new Function3() { // from class: com.example.ui.tools.image.ComposableSingletons$ImageToolsKt$$ExternalSyntheticLambda11
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ImageToolsKt.lambda__1341147964$lambda$4((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-796507194, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f209lambda$796507194 = ComposableLambdaKt.composableLambdaInstance(-796507194, false, new Function3() { // from class: com.example.ui.tools.image.ComposableSingletons$ImageToolsKt$$ExternalSyntheticLambda12
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ImageToolsKt.lambda__796507194$lambda$5((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1365082910, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f207lambda$1365082910 = ComposableLambdaKt.composableLambdaInstance(-1365082910, false, new Function3() { // from class: com.example.ui.tools.image.ComposableSingletons$ImageToolsKt$$ExternalSyntheticLambda13
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ImageToolsKt.lambda__1365082910$lambda$6((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$987400315 = ComposableLambdaKt.composableLambdaInstance(987400315, false, new Function2() { // from class: com.example.ui.tools.image.ComposableSingletons$ImageToolsKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ImageToolsKt.lambda_987400315$lambda$7((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1915414780 = ComposableLambdaKt.composableLambdaInstance(1915414780, false, new Function2() { // from class: com.example.ui.tools.image.ComposableSingletons$ImageToolsKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ImageToolsKt.lambda_1915414780$lambda$8((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<ColumnScope, Composer, Integer, Unit> lambda$319338865 = ComposableLambdaKt.composableLambdaInstance(319338865, false, new Function3() { // from class: com.example.ui.tools.image.ComposableSingletons$ImageToolsKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ImageToolsKt.lambda_319338865$lambda$10((ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1419620298 = ComposableLambdaKt.composableLambdaInstance(1419620298, false, new Function3() { // from class: com.example.ui.tools.image.ComposableSingletons$ImageToolsKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ImageToolsKt.lambda_1419620298$lambda$11((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1786963464 = ComposableLambdaKt.composableLambdaInstance(1786963464, false, new Function3() { // from class: com.example.ui.tools.image.ComposableSingletons$ImageToolsKt$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ImageToolsKt.lambda_1786963464$lambda$12((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$605767358 = ComposableLambdaKt.composableLambdaInstance(605767358, false, new Function2() { // from class: com.example.ui.tools.image.ComposableSingletons$ImageToolsKt$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ImageToolsKt.lambda_605767358$lambda$13((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-690555299, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f208lambda$690555299 = ComposableLambdaKt.composableLambdaInstance(-690555299, false, new Function2() { // from class: com.example.ui.tools.image.ComposableSingletons$ImageToolsKt$$ExternalSyntheticLambda7
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ImageToolsKt.lambda__690555299$lambda$14((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$322690731 = ComposableLambdaKt.composableLambdaInstance(322690731, false, new Function3() { // from class: com.example.ui.tools.image.ComposableSingletons$ImageToolsKt$$ExternalSyntheticLambda8
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ImageToolsKt.lambda_322690731$lambda$15((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-1164015079$app, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m7142getLambda$1164015079$app() {
        return f205lambda$1164015079;
    }

    /* renamed from: getLambda$-1341147964$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7143getLambda$1341147964$app() {
        return f206lambda$1341147964;
    }

    /* renamed from: getLambda$-1365082910$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7144getLambda$1365082910$app() {
        return f207lambda$1365082910;
    }

    /* renamed from: getLambda$-690555299$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7145getLambda$690555299$app() {
        return f208lambda$690555299;
    }

    /* renamed from: getLambda$-796507194$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7146getLambda$796507194$app() {
        return f209lambda$796507194;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1419620298$app() {
        return lambda$1419620298;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1786963464$app() {
        return lambda$1786963464;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1915414780$app() {
        return lambda$1915414780;
    }

    public final Function3<ColumnScope, Composer, Integer, Unit> getLambda$319338865$app() {
        return lambda$319338865;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$322690731$app() {
        return lambda$322690731;
    }

    public final Function2<Composer, Integer, Unit> getLambda$605767358$app() {
        return lambda$605767358;
    }

    public final Function2<Composer, Integer, Unit> getLambda$741244526$app() {
        return lambda$741244526;
    }

    public final Function2<Composer, Integer, Unit> getLambda$807675727$app() {
        return lambda$807675727;
    }

    public final Function2<Composer, Integer, Unit> getLambda$987400315$app() {
        return lambda$987400315;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_807675727$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C144@6272L24:ImageTools.kt#clnccf");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(807675727, $changed, -1, "com.example.ui.tools.image.ComposableSingletons$ImageToolsKt.lambda$807675727.<anonymous> (ImageTools.kt:144)");
            }
            TextKt.m2696Text4IGK_g("Image Compressor", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_741244526$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C147@6422L70:ImageTools.kt#clnccf");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(741244526, $changed, -1, "com.example.ui.tools.image.ComposableSingletons$ImageToolsKt.lambda$741244526.<anonymous> (ImageTools.kt:147)");
            }
            IconKt.m2153Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "Back", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1164015079$lambda$3(ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C179@7804L704:ImageTools.kt#clnccf");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1164015079, $changed, -1, "com.example.ui.tools.image.ComposableSingletons$ImageToolsKt.lambda$-1164015079.<anonymous> (ImageTools.kt:179)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.Vertical center = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, fillMaxSize$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((438 << 3) & 112) << 6) & 896) | 6;
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
            int i3 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1373762666, "C184@8178L11,184@8060L138,185@8223L30,186@8278L62,187@8457L11,187@8365L121:ImageTools.kt#clnccf");
            IconKt.m2153Iconww6aTOc(AddPhotoAlternateKt.getAddPhotoAlternate(Icons.Filled.INSTANCE), (String) null, SizeKt.m718size3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(48)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 432, 0);
            SpacerKt.Spacer(SizeKt.m704height3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(10)), $composer, 6);
            TextKt.m2696Text4IGK_g("Select Photo to Compress", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196614, 0, 131038);
            TextKt.m2696Text4IGK_g("Works with JPG, PNG, WEBP (No Quality Loss)", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3078, 0, 131058);
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
    public static final Unit lambda__1341147964$lambda$4(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C275@13209L87,276@13321L28,277@13374L23:ImageTools.kt#clnccf");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1341147964, $changed, -1, "com.example.ui.tools.image.ComposableSingletons$ImageToolsKt.lambda$-1341147964.<anonymous> (ImageTools.kt:275)");
            }
            IconKt.m2153Iconww6aTOc(DownloadKt.getDownload(Icons.Filled.INSTANCE), (String) null, SizeKt.m718size3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(18)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.m723width3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(6)), $composer, 6);
            TextKt.m2696Text4IGK_g("Save to Gallery", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__796507194$lambda$5(RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C287@13798L84,288@13907L28,289@13960L13:ImageTools.kt#clnccf");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-796507194, $changed, -1, "com.example.ui.tools.image.ComposableSingletons$ImageToolsKt.lambda$-796507194.<anonymous> (ImageTools.kt:287)");
            }
            IconKt.m2153Iconww6aTOc(ShareKt.getShare(Icons.Filled.INSTANCE), (String) null, SizeKt.m718size3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(18)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.m723width3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(6)), $composer, 6);
            TextKt.m2696Text4IGK_g("Share", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1365082910$lambda$6(RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C301@14377L28:ImageTools.kt#clnccf");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1365082910, $changed, -1, "com.example.ui.tools.image.ComposableSingletons$ImageToolsKt.lambda$-1365082910.<anonymous> (ImageTools.kt:301)");
            }
            TextKt.m2696Text4IGK_g("Select Another Photo", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_987400315$lambda$7(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C358@16300L28:ImageTools.kt#clnccf");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(987400315, $changed, -1, "com.example.ui.tools.image.ComposableSingletons$ImageToolsKt.lambda$987400315.<anonymous> (ImageTools.kt:358)");
            }
            TextKt.m2696Text4IGK_g("Passport Photo Maker", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_1915414780$lambda$8(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C361@16454L70:ImageTools.kt#clnccf");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1915414780, $changed, -1, "com.example.ui.tools.image.ComposableSingletons$ImageToolsKt.lambda$1915414780.<anonymous> (ImageTools.kt:361)");
            }
            IconKt.m2153Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "Back", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_319338865$lambda$10(ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C391@17721L706:ImageTools.kt#clnccf");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(319338865, $changed, -1, "com.example.ui.tools.image.ComposableSingletons$ImageToolsKt.lambda$319338865.<anonymous> (ImageTools.kt:391)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.Vertical center = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, fillMaxSize$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((438 << 3) & 112) << 6) & 896) | 6;
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
            int i3 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1913825404, "C396@18089L11,396@17977L132,397@18134L30,398@18189L64,399@18376L11,399@18278L127:ImageTools.kt#clnccf");
            IconKt.m2153Iconww6aTOc(PhotoCameraKt.getPhotoCamera(Icons.Filled.INSTANCE), (String) null, SizeKt.m718size3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(48)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 432, 0);
            SpacerKt.Spacer(SizeKt.m704height3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(10)), $composer, 6);
            TextKt.m2696Text4IGK_g("Upload Your Portrait Photo", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196614, 0, 131038);
            TextKt.m2696Text4IGK_g("Auto creates 35x45mm (2x2 inch) passport standard", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3078, 0, 131058);
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
    public static final Unit lambda_1419620298$lambda$11(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C453@20878L54,454@20953L28,455@21002L43:ImageTools.kt#clnccf");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1419620298, $changed, -1, "com.example.ui.tools.image.ComposableSingletons$ImageToolsKt.lambda$1419620298.<anonymous> (ImageTools.kt:453)");
            }
            IconKt.m2153Iconww6aTOc(DownloadKt.getDownload(Icons.Filled.INSTANCE), (String) null, (Modifier) null, 0L, $composer, 48, 12);
            SpacerKt.Spacer(SizeKt.m723width3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(8)), $composer, 6);
            TextKt.m2696Text4IGK_g("Save 6-Photo Print Sheet (4x6 Inch)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_1786963464$lambda$12(RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C466@21415L34:ImageTools.kt#clnccf");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1786963464, $changed, -1, "com.example.ui.tools.image.ComposableSingletons$ImageToolsKt.lambda$1786963464.<anonymous> (ImageTools.kt:466)");
            }
            TextKt.m2696Text4IGK_g("Save Single Passport Photo", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_605767358$lambda$13(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C579@25373L29:ImageTools.kt#clnccf");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(605767358, $changed, -1, "com.example.ui.tools.image.ComposableSingletons$ImageToolsKt.lambda$605767358.<anonymous> (ImageTools.kt:579)");
            }
            TextKt.m2696Text4IGK_g("Image Quality Checker", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__690555299$lambda$14(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C582@25528L70:ImageTools.kt#clnccf");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-690555299, $changed, -1, "com.example.ui.tools.image.ComposableSingletons$ImageToolsKt.lambda$-690555299.<anonymous> (ImageTools.kt:582)");
            }
            IconKt.m2153Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "Back", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_322690731$lambda$15(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C603@26352L63,604@26432L28,605@26477L31:ImageTools.kt#clnccf");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(322690731, $changed, -1, "com.example.ui.tools.image.ComposableSingletons$ImageToolsKt.lambda$322690731.<anonymous> (ImageTools.kt:603)");
            }
            IconKt.m2153Iconww6aTOc(AddPhotoAlternateKt.getAddPhotoAlternate(Icons.Filled.INSTANCE), (String) null, (Modifier) null, 0L, $composer, 48, 12);
            SpacerKt.Spacer(SizeKt.m723width3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(8)), $composer, 6);
            TextKt.m2696Text4IGK_g("Select Image to Inspect", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
