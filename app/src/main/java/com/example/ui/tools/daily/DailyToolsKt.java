package com.example.ui.tools.daily;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.PauseKt;
import androidx.compose.material.icons.filled.PlayArrowKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
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
import com.example.util.BarcodeQrUtils;
import com.example.util.ImageExportUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DailyTools.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u001b\u0010\u0007\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010\f\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\f\u0010\r\u001a\u0004\u0018\u00010\u000eX\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010\u0014\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u008e\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010\u001a\u001a\u00020\u000bX\u008a\u008e\u0002"}, d2 = {"QrCodeGeneratorScreen", "", "onBack", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "AgeCalculatorScreen", "BmiCalculatorScreen", "StopwatchAndTimerScreen", "UnitConverterScreen", "app", "qrContent", "", "qrType", "qrBitmap", "Landroid/graphics/Bitmap;", "birthYear", "", "birthMonth", "birthDay", "heightCmText", "weightKgText", "isRunning", "", "elapsedMillis", "", "inputValueText", "selectedUnitType"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DailyToolsKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AgeCalculatorScreen$lambda$64(Function0 function0, int i, Composer composer, int i2) {
        AgeCalculatorScreen(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BmiCalculatorScreen$lambda$84(Function0 function0, int i, Composer composer, int i2) {
        BmiCalculatorScreen(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit QrCodeGeneratorScreen$lambda$33(Function0 function0, int i, Composer composer, int i2) {
        QrCodeGeneratorScreen(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StopwatchAndTimerScreen$lambda$110(Function0 function0, int i, Composer composer, int i2) {
        StopwatchAndTimerScreen(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit UnitConverterScreen$lambda$144(Function0 function0, int i, Composer composer, int i2) {
        UnitConverterScreen(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void QrCodeGeneratorScreen(final Function0<Unit> onBack, Composer $composer, final int $changed) {
        Object obj;
        char c;
        Object obj2;
        Object obj3;
        Object mutableStateOf$default;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer $composer2 = $composer.startRestartGroup(966507104);
        ComposerKt.sourceInformation($composer2, "C(QrCodeGeneratorScreen)92@4098L12,92@4086L24,93@4142L7,95@4172L49,96@4240L42,100@4397L94,105@4524L537,119@5068L3406,104@4497L3977:DailyTools.kt#ciovlp");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(onBack) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(966507104, $dirty, -1, "com.example.ui.tools.daily.QrCodeGeneratorScreen (DailyTools.kt:91)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 1100394732, "CC(remember):DailyTools.kt#9igjgp");
            boolean z = ($dirty & 14) == 4;
            Object rememberedValue = $composer2.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.tools.daily.DailyToolsKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DailyToolsKt.QrCodeGeneratorScreen$lambda$1$lambda$0(Function0.this);
                    }
                };
                $composer2.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            BackHandlerKt.BackHandler(false, (Function0) obj, $composer2, 0, 1);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context = (Context) consume;
            ComposerKt.sourceInformationMarkerStart($composer2, 1100397137, "CC(remember):DailyTools.kt#9igjgp");
            Object rememberedValue2 = $composer2.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                c = 4;
                obj2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("https://google.com", null, 2, null);
                $composer2.updateRememberedValue(obj2);
            } else {
                c = 4;
                obj2 = rememberedValue2;
            }
            final MutableState qrContent$delegate = (MutableState) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1100399306, "CC(remember):DailyTools.kt#9igjgp");
            Object rememberedValue3 = $composer2.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("Website URL", null, 2, null);
                $composer2.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            final MutableState qrType$delegate = (MutableState) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            String[] strArr = new String[5];
            strArr[0] = "Website URL";
            strArr[1] = "WiFi";
            strArr[2] = "UPI Pay";
            strArr[3] = "Contact / Phone";
            strArr[c] = "Plain Text";
            final List qrTypes = CollectionsKt.listOf((Object[]) strArr);
            String QrCodeGeneratorScreen$lambda$3 = QrCodeGeneratorScreen$lambda$3(qrContent$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, 1100404382, "CC(remember):DailyTools.kt#9igjgp");
            boolean changed = $composer2.changed(QrCodeGeneratorScreen$lambda$3);
            Object rememberedValue4 = $composer2.rememberedValue();
            if (changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(BarcodeQrUtils.generateQrBitmap$default(BarcodeQrUtils.INSTANCE, QrCodeGeneratorScreen$lambda$3(qrContent$delegate), 0, 0, 0, 0, 30, null), null, 2, null);
                $composer2.updateRememberedValue(mutableStateOf$default);
            } else {
                mutableStateOf$default = rememberedValue4;
            }
            final MutableState qrBitmap$delegate = (MutableState) mutableStateOf$default;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ScaffoldKt.m2411ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-742954468, true, new Function2() { // from class: com.example.ui.tools.daily.DailyToolsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return DailyToolsKt.QrCodeGeneratorScreen$lambda$13(Function0.this, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(1014914481, true, new Function3() { // from class: com.example.ui.tools.daily.DailyToolsKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    return DailyToolsKt.QrCodeGeneratorScreen$lambda$32(MutableState.this, context, qrContent$delegate, qrTypes, qrType$delegate, (PaddingValues) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, $composer2, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.tools.daily.DailyToolsKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return DailyToolsKt.QrCodeGeneratorScreen$lambda$33(Function0.this, $changed, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit QrCodeGeneratorScreen$lambda$1$lambda$0(Function0 $onBack) {
        $onBack.invoke();
        return Unit.INSTANCE;
    }

    private static final String QrCodeGeneratorScreen$lambda$3(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String QrCodeGeneratorScreen$lambda$6(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final Bitmap QrCodeGeneratorScreen$lambda$9(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit QrCodeGeneratorScreen$lambda$13(final kotlin.jvm.functions.Function0 r41, androidx.compose.runtime.Composer r42, int r43) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.daily.DailyToolsKt.QrCodeGeneratorScreen$lambda$13(kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit QrCodeGeneratorScreen$lambda$13$lambda$12$lambda$11(Function0 $onBack, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C110@4696L155:DailyTools.kt#ciovlp");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1091566420, $changed, -1, "com.example.ui.tools.daily.QrCodeGeneratorScreen.<anonymous>.<anonymous>.<anonymous> (DailyTools.kt:110)");
            }
            IconButtonKt.IconButton($onBack, null, false, null, null, ComposableSingletons$DailyToolsKt.INSTANCE.getLambda$809807305$app(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0526 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit QrCodeGeneratorScreen$lambda$32(final androidx.compose.runtime.MutableState r82, final android.content.Context r83, final androidx.compose.runtime.MutableState r84, java.util.List r85, final androidx.compose.runtime.MutableState r86, androidx.compose.foundation.layout.PaddingValues r87, androidx.compose.runtime.Composer r88, int r89) {
        /*
            Method dump skipped, instructions count: 1772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.daily.DailyToolsKt.QrCodeGeneratorScreen$lambda$32(androidx.compose.runtime.MutableState, android.content.Context, androidx.compose.runtime.MutableState, java.util.List, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit QrCodeGeneratorScreen$lambda$32$lambda$31$lambda$16(MutableState $qrBitmap$delegate, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Unit unit;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C137@5771L435:DailyTools.kt#ciovlp");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1059656295, $changed, -1, "com.example.ui.tools.daily.QrCodeGeneratorScreen.<anonymous>.<anonymous>.<anonymous> (DailyTools.kt:137)");
            }
            Modifier m673padding3ABfNKs = PaddingKt.m673padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6625constructorimpl(16));
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, m673padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((54 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m3662setimpl(m3655constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3662setimpl(m3655constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3655constructorimpl.getInserting() || !Intrinsics.areEqual(m3655constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3655constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3655constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3662setimpl(m3655constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i3 = ((54 >> 6) & 112) | 6;
            Composer composer = $composer;
            ComposerKt.sourceInformationMarkerStart(composer, 408556948, "C:DailyTools.kt#ciovlp");
            Bitmap QrCodeGeneratorScreen$lambda$9 = QrCodeGeneratorScreen$lambda$9($qrBitmap$delegate);
            if (QrCodeGeneratorScreen$lambda$9 == null) {
                composer.startReplaceGroup(408565595);
                composer.endReplaceGroup();
                unit = null;
            } else {
                composer.startReplaceGroup(408565596);
                ComposerKt.sourceInformation(composer, "*139@5924L211");
                ImageKt.m284Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(QrCodeGeneratorScreen$lambda$9), "QR Code", SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, 0.0f, null, 0, composer, 432, 248);
                composer = composer;
                composer.endReplaceGroup();
                unit = Unit.INSTANCE;
            }
            if (unit != null) {
                composer.startReplaceGroup(-1372294065);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1372285478);
                ComposerKt.sourceInformation(composer, "144@6161L27");
                ProgressIndicatorKt.m2370CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, composer, 0, 31);
                composer.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
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
    public static final Unit QrCodeGeneratorScreen$lambda$32$lambda$31$lambda$23$lambda$19$lambda$18(MutableState $qrBitmap$delegate, Context $context) {
        Bitmap QrCodeGeneratorScreen$lambda$9 = QrCodeGeneratorScreen$lambda$9($qrBitmap$delegate);
        if (QrCodeGeneratorScreen$lambda$9 != null) {
            ImageExportUtils.INSTANCE.saveBitmapToGallery($context, QrCodeGeneratorScreen$lambda$9, "QRCode");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit QrCodeGeneratorScreen$lambda$32$lambda$31$lambda$23$lambda$22$lambda$21(MutableState $qrBitmap$delegate, Context $context, MutableState $qrContent$delegate) {
        Bitmap QrCodeGeneratorScreen$lambda$9 = QrCodeGeneratorScreen$lambda$9($qrBitmap$delegate);
        if (QrCodeGeneratorScreen$lambda$9 != null) {
            ImageExportUtils.INSTANCE.shareBitmap($context, QrCodeGeneratorScreen$lambda$9, "QR Code: " + QrCodeGeneratorScreen$lambda$3($qrContent$delegate));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit QrCodeGeneratorScreen$lambda$32$lambda$31$lambda$28$lambda$27$lambda$25$lambda$24(String $type, MutableState $qrType$delegate, MutableState $qrContent$delegate) {
        String str;
        $qrType$delegate.setValue($type);
        if (Intrinsics.areEqual($type, "WiFi")) {
            str = "WIFI:S:MyHomeWiFi;T:WPA;P:password123;;";
        } else {
            str = Intrinsics.areEqual($type, "UPI Pay") ? "upi://pay?pa=merchant@upi&pn=Store&am=500" : "https://google.com";
        }
        $qrContent$delegate.setValue(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit QrCodeGeneratorScreen$lambda$32$lambda$31$lambda$28$lambda$27$lambda$26(String $type, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C189@8142L10:DailyTools.kt#ciovlp");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-6597505, $changed, -1, "com.example.ui.tools.daily.QrCodeGeneratorScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DailyTools.kt:189)");
            }
            TextKt.m2696Text4IGK_g($type, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit QrCodeGeneratorScreen$lambda$32$lambda$31$lambda$30$lambda$29(MutableState $qrContent$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $qrContent$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    public static final void AgeCalculatorScreen(final Function0<Unit> onBack, Composer $composer, final int $changed) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer $composer2 = $composer.startRestartGroup(2141315012);
        ComposerKt.sourceInformation($composer2, "C(AgeCalculatorScreen)211@8713L12,211@8701L24,213@8748L36,214@8807L33,215@8868L34,239@9490L534,253@10031L3908,238@9463L4476:DailyTools.kt#ciovlp");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(onBack) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2141315012, $dirty, -1, "com.example.ui.tools.daily.AgeCalculatorScreen (DailyTools.kt:210)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 514395408, "CC(remember):DailyTools.kt#9igjgp");
            boolean z = ($dirty & 14) == 4;
            Object rememberedValue = $composer2.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.tools.daily.DailyToolsKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DailyToolsKt.AgeCalculatorScreen$lambda$35$lambda$34(Function0.this);
                    }
                };
                $composer2.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            BackHandlerKt.BackHandler(false, (Function0) obj, $composer2, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer2, 514396552, "CC(remember):DailyTools.kt#9igjgp");
            Object rememberedValue2 = $composer2.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = SnapshotIntStateKt.mutableIntStateOf(1998);
                $composer2.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            final MutableIntState birthYear$delegate = (MutableIntState) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 514398437, "CC(remember):DailyTools.kt#9igjgp");
            Object rememberedValue3 = $composer2.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj3 = SnapshotIntStateKt.mutableIntStateOf(5);
                $composer2.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            final MutableIntState birthMonth$delegate = (MutableIntState) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 514400390, "CC(remember):DailyTools.kt#9igjgp");
            Object rememberedValue4 = $composer2.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                obj4 = SnapshotIntStateKt.mutableIntStateOf(15);
                $composer2.updateRememberedValue(obj4);
            } else {
                obj4 = rememberedValue4;
            }
            final MutableIntState birthDay$delegate = (MutableIntState) obj4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Calendar today = Calendar.getInstance();
            int currentYear = today.get(1);
            int currentMonth = today.get(2) + 1;
            int currentDay = today.get(5);
            final Ref.IntRef years = new Ref.IntRef();
            years.element = currentYear - AgeCalculatorScreen$lambda$37(birthYear$delegate);
            final Ref.IntRef months = new Ref.IntRef();
            months.element = currentMonth - AgeCalculatorScreen$lambda$40(birthMonth$delegate);
            final Ref.IntRef days = new Ref.IntRef();
            days.element = currentDay - AgeCalculatorScreen$lambda$43(birthDay$delegate);
            if (days.element < 0) {
                months.element--;
                days.element += 30;
            }
            if (months.element < 0) {
                years.element--;
                months.element += 12;
            }
            final int totalDays = (int) ((years.element * 365.25d) + (months.element * 30.4d) + days.element);
            final long totalHours = totalDays * 24;
            ScaffoldKt.m2411ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(119426688, true, new Function2() { // from class: com.example.ui.tools.daily.DailyToolsKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    return DailyToolsKt.AgeCalculatorScreen$lambda$47(Function0.this, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, $composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1228463275, true, new Function3() { // from class: com.example.ui.tools.daily.DailyToolsKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                    return DailyToolsKt.AgeCalculatorScreen$lambda$63(Ref.IntRef.this, months, days, birthDay$delegate, birthMonth$delegate, birthYear$delegate, totalDays, totalHours, (PaddingValues) obj5, (Composer) obj6, ((Integer) obj7).intValue());
                }
            }, $composer2, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.tools.daily.DailyToolsKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    return DailyToolsKt.AgeCalculatorScreen$lambda$64(Function0.this, $changed, (Composer) obj5, ((Integer) obj6).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AgeCalculatorScreen$lambda$35$lambda$34(Function0 $onBack) {
        $onBack.invoke();
        return Unit.INSTANCE;
    }

    private static final int AgeCalculatorScreen$lambda$37(MutableIntState $birthYear$delegate) {
        return $birthYear$delegate.getIntValue();
    }

    private static final int AgeCalculatorScreen$lambda$40(MutableIntState $birthMonth$delegate) {
        return $birthMonth$delegate.getIntValue();
    }

    private static final int AgeCalculatorScreen$lambda$43(MutableIntState $birthDay$delegate) {
        return $birthDay$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit AgeCalculatorScreen$lambda$47(final kotlin.jvm.functions.Function0 r41, androidx.compose.runtime.Composer r42, int r43) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.daily.DailyToolsKt.AgeCalculatorScreen$lambda$47(kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AgeCalculatorScreen$lambda$47$lambda$46$lambda$45(Function0 $onBack, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C244@9659L155:DailyTools.kt#ciovlp");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1445180144, $changed, -1, "com.example.ui.tools.daily.AgeCalculatorScreen.<anonymous>.<anonymous>.<anonymous> (DailyTools.kt:244)");
            }
            IconButtonKt.IconButton($onBack, null, false, null, null, ComposableSingletons$DailyToolsKt.INSTANCE.m7040getLambda$1349346963$app(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit AgeCalculatorScreen$lambda$63(final kotlin.jvm.internal.Ref.IntRef r85, final kotlin.jvm.internal.Ref.IntRef r86, final kotlin.jvm.internal.Ref.IntRef r87, final androidx.compose.runtime.MutableIntState r88, final androidx.compose.runtime.MutableIntState r89, final androidx.compose.runtime.MutableIntState r90, final int r91, final long r92, androidx.compose.foundation.layout.PaddingValues r94, androidx.compose.runtime.Composer r95, int r96) {
        /*
            Method dump skipped, instructions count: 1499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.daily.DailyToolsKt.AgeCalculatorScreen$lambda$63(kotlin.jvm.internal.Ref$IntRef, kotlin.jvm.internal.Ref$IntRef, kotlin.jvm.internal.Ref$IntRef, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableIntState, int, long, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AgeCalculatorScreen$lambda$63$lambda$62$lambda$49(Ref.IntRef $years, Ref.IntRef $months, Ref.IntRef $days, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C268@10616L509:DailyTools.kt#ciovlp");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1884458301, $changed, -1, "com.example.ui.tools.daily.AgeCalculatorScreen.<anonymous>.<anonymous>.<anonymous> (DailyTools.kt:268)");
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
            ComposerKt.sourceInformationMarkerStart($composer, 196786170, "C269@10733L46,270@10800L29,275@11066L11,271@10850L257:DailyTools.kt#ciovlp");
            TextKt.m2696Text4IGK_g("Your Exact Age Today", (Modifier) null, 0L, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3078, 0, 131062);
            SpacerKt.Spacer(SizeKt.m704height3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(6)), $composer, 6);
            TextKt.m2696Text4IGK_g($years.element + " Years, " + $months.element + " Months, " + $days.element + " Days", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131026);
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
    public static final Unit AgeCalculatorScreen$lambda$63$lambda$62$lambda$56$lambda$51$lambda$50(MutableIntState $birthDay$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Integer intOrNull = StringsKt.toIntOrNull(it);
        $birthDay$delegate.setIntValue(intOrNull != null ? intOrNull.intValue() : 1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AgeCalculatorScreen$lambda$63$lambda$62$lambda$56$lambda$53$lambda$52(MutableIntState $birthMonth$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Integer intOrNull = StringsKt.toIntOrNull(it);
        $birthMonth$delegate.setIntValue(intOrNull != null ? intOrNull.intValue() : 1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AgeCalculatorScreen$lambda$63$lambda$62$lambda$56$lambda$55$lambda$54(MutableIntState $birthYear$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Integer intOrNull = StringsKt.toIntOrNull(it);
        $birthYear$delegate.setIntValue(intOrNull != null ? intOrNull.intValue() : 1998);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x05ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0417 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit AgeCalculatorScreen$lambda$63$lambda$62$lambda$61(int r105, long r106, androidx.compose.foundation.layout.ColumnScope r108, androidx.compose.runtime.Composer r109, int r110) {
        /*
            Method dump skipped, instructions count: 1706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.daily.DailyToolsKt.AgeCalculatorScreen$lambda$63$lambda$62$lambda$61(int, long, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final void BmiCalculatorScreen(final Function0<Unit> onBack, Composer $composer, final int $changed) {
        Object obj;
        Object obj2;
        Object obj3;
        Triple triple;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer $composer2 = $composer.startRestartGroup(1867383077);
        ComposerKt.sourceInformation($composer2, "C(BmiCalculatorScreen)339@14178L12,339@14166L24,341@14216L34,342@14275L33,358@15122L534,372@15663L2204,357@15095L2772:DailyTools.kt#ciovlp");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(onBack) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1867383077, $dirty, -1, "com.example.ui.tools.daily.BmiCalculatorScreen (DailyTools.kt:338)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -741189071, "CC(remember):DailyTools.kt#9igjgp");
            boolean z = ($dirty & 14) == 4;
            Object rememberedValue = $composer2.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.tools.daily.DailyToolsKt$$ExternalSyntheticLambda44
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DailyToolsKt.BmiCalculatorScreen$lambda$66$lambda$65(Function0.this);
                    }
                };
                $composer2.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            BackHandlerKt.BackHandler(false, (Function0) obj, $composer2, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer2, -741187833, "CC(remember):DailyTools.kt#9igjgp");
            Object rememberedValue2 = $composer2.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("172", null, 2, null);
                $composer2.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            final MutableState heightCmText$delegate = (MutableState) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -741185946, "CC(remember):DailyTools.kt#9igjgp");
            Object rememberedValue3 = $composer2.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("68", null, 2, null);
                $composer2.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            final MutableState weightKgText$delegate = (MutableState) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Double doubleOrNull = StringsKt.toDoubleOrNull(BmiCalculatorScreen$lambda$68(heightCmText$delegate));
            double heightCm = doubleOrNull != null ? doubleOrNull.doubleValue() : 172.0d;
            Double doubleOrNull2 = StringsKt.toDoubleOrNull(BmiCalculatorScreen$lambda$71(weightKgText$delegate));
            double weightKg = doubleOrNull2 != null ? doubleOrNull2.doubleValue() : 68.0d;
            double heightM = heightCm / 100.0d;
            final double bmi = heightM > 0.0d ? weightKg / (heightM * heightM) : 0.0d;
            if (bmi < 18.5d) {
                triple = new Triple("Underweight", Color.m4152boximpl(ColorKt.Color(4282090230L)), "Consider nutrient-dense meals and strength building.");
            } else if (bmi < 25.0d) {
                triple = new Triple("Normal Weight", Color.m4152boximpl(ColorKt.Color(4279286145L)), "Great job! Keep maintaining a balanced diet and regular exercise.");
            } else {
                triple = bmi < 30.0d ? new Triple("Overweight", Color.m4152boximpl(ColorKt.Color(4294286859L)), "Incorporate 30 minutes of daily cardio and portion control.") : new Triple("Obesity", Color.m4152boximpl(ColorKt.Color(4293870660L)), "Consult with a health professional for personalized wellness guidance.");
            }
            final String category = (String) triple.component1();
            final long catColor = ((Color) triple.component2()).m4172unboximpl();
            final String advice = (String) triple.component3();
            ScaffoldKt.m2411ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-154505247, true, new Function2() { // from class: com.example.ui.tools.daily.DailyToolsKt$$ExternalSyntheticLambda45
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return DailyToolsKt.BmiCalculatorScreen$lambda$75(Function0.this, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1502395210, true, new Function3() { // from class: com.example.ui.tools.daily.DailyToolsKt$$ExternalSyntheticLambda46
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    return DailyToolsKt.BmiCalculatorScreen$lambda$83(catColor, bmi, category, advice, heightCmText$delegate, weightKgText$delegate, (PaddingValues) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, $composer2, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.tools.daily.DailyToolsKt$$ExternalSyntheticLambda47
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return DailyToolsKt.BmiCalculatorScreen$lambda$84(Function0.this, $changed, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BmiCalculatorScreen$lambda$66$lambda$65(Function0 $onBack) {
        $onBack.invoke();
        return Unit.INSTANCE;
    }

    private static final String BmiCalculatorScreen$lambda$68(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String BmiCalculatorScreen$lambda$71(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit BmiCalculatorScreen$lambda$75(final kotlin.jvm.functions.Function0 r41, androidx.compose.runtime.Composer r42, int r43) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.daily.DailyToolsKt.BmiCalculatorScreen$lambda$75(kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BmiCalculatorScreen$lambda$75$lambda$74$lambda$73(Function0 $onBack, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C363@15291L155:DailyTools.kt#ciovlp");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1719112079, $changed, -1, "com.example.ui.tools.daily.BmiCalculatorScreen.<anonymous>.<anonymous>.<anonymous> (DailyTools.kt:363)");
            }
            IconButtonKt.IconButton($onBack, null, false, null, null, ComposableSingletons$DailyToolsKt.INSTANCE.m7041getLambda$1623278898$app(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit BmiCalculatorScreen$lambda$83(final long r58, final double r60, final java.lang.String r62, final java.lang.String r63, final androidx.compose.runtime.MutableState r64, final androidx.compose.runtime.MutableState r65, androidx.compose.foundation.layout.PaddingValues r66, androidx.compose.runtime.Composer r67, int r68) {
        /*
            Method dump skipped, instructions count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.daily.DailyToolsKt.BmiCalculatorScreen$lambda$83(long, double, java.lang.String, java.lang.String, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BmiCalculatorScreen$lambda$83$lambda$82$lambda$77(double $bmi, long $catColor, String $category, String $advice, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C388@16287L898:DailyTools.kt#ciovlp");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1610526366, $changed, -1, "com.example.ui.tools.daily.BmiCalculatorScreen.<anonymous>.<anonymous>.<anonymous> (DailyTools.kt:388)");
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
            ComposerKt.sourceInformationMarkerStart($composer, -71616754, "C392@16462L46,393@16529L29,394@16579L216,400@16816L198,406@17035L29,407@17138L11,407@17085L82:DailyTools.kt#ciovlp");
            TextKt.m2696Text4IGK_g("Your Body Mass Index", (Modifier) null, 0L, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3078, 0, 131062);
            SpacerKt.Spacer(SizeKt.m704height3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(6)), $composer, 6);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf($bmi)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            TextKt.m2696Text4IGK_g(format, (Modifier) null, $catColor, TextUnitKt.getSp(38), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131026);
            TextKt.m2696Text4IGK_g($category, (Modifier) null, $catColor, TextUnitKt.getSp(18), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131026);
            SpacerKt.Spacer(SizeKt.m704height3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(8)), $composer, 6);
            TextKt.m2696Text4IGK_g($advice, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3072, 0, 131058);
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
    public static final Unit BmiCalculatorScreen$lambda$83$lambda$82$lambda$79$lambda$78(MutableState $heightCmText$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $heightCmText$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BmiCalculatorScreen$lambda$83$lambda$82$lambda$81$lambda$80(MutableState $weightKgText$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $weightKgText$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    public static final void StopwatchAndTimerScreen(final Function0<Unit> onBack, Composer $composer, final int $changed) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        DailyToolsKt$StopwatchAndTimerScreen$2$1 dailyToolsKt$StopwatchAndTimerScreen$2$1;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer $composer2 = $composer.startRestartGroup(1155749898);
        ComposerKt.sourceInformation($composer2, "C(StopwatchAndTimerScreen)437@18116L12,437@18104L24,439@18151L34,440@18211L35,441@18262L39,443@18333L201,443@18307L227,456@18704L539,470@19250L3325,455@18677L3898:DailyTools.kt#ciovlp");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(onBack) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1155749898, $dirty, -1, "com.example.ui.tools.daily.StopwatchAndTimerScreen (DailyTools.kt:436)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -1720873898, "CC(remember):DailyTools.kt#9igjgp");
            boolean z = ($dirty & 14) == 4;
            Object rememberedValue = $composer2.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.tools.daily.DailyToolsKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DailyToolsKt.StopwatchAndTimerScreen$lambda$86$lambda$85(Function0.this);
                    }
                };
                $composer2.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            BackHandlerKt.BackHandler(false, (Function0) obj, $composer2, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer2, -1720872756, "CC(remember):DailyTools.kt#9igjgp");
            Object rememberedValue2 = $composer2.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            final MutableState isRunning$delegate = (MutableState) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1720870835, "CC(remember):DailyTools.kt#9igjgp");
            Object rememberedValue3 = $composer2.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj3 = SnapshotLongStateKt.mutableLongStateOf(0L);
                $composer2.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            final MutableLongState elapsedMillis$delegate = (MutableLongState) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1720869199, "CC(remember):DailyTools.kt#9igjgp");
            Object rememberedValue4 = $composer2.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                obj4 = SnapshotStateKt.mutableStateListOf();
                $composer2.updateRememberedValue(obj4);
            } else {
                obj4 = rememberedValue4;
            }
            final SnapshotStateList laps = (SnapshotStateList) obj4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Boolean valueOf = Boolean.valueOf(StopwatchAndTimerScreen$lambda$88(isRunning$delegate));
            ComposerKt.sourceInformationMarkerStart($composer2, -1720866765, "CC(remember):DailyTools.kt#9igjgp");
            Object rememberedValue5 = $composer2.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                dailyToolsKt$StopwatchAndTimerScreen$2$1 = new DailyToolsKt$StopwatchAndTimerScreen$2$1(elapsedMillis$delegate, isRunning$delegate, null);
                $composer2.updateRememberedValue(dailyToolsKt$StopwatchAndTimerScreen$2$1);
            } else {
                dailyToolsKt$StopwatchAndTimerScreen$2$1 = rememberedValue5;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) dailyToolsKt$StopwatchAndTimerScreen$2$1, $composer2, 0);
            final long minutes = StopwatchAndTimerScreen$lambda$91(elapsedMillis$delegate) / 60000;
            final long seconds = (StopwatchAndTimerScreen$lambda$91(elapsedMillis$delegate) % 60000) / 1000;
            final long millis = (StopwatchAndTimerScreen$lambda$91(elapsedMillis$delegate) % 1000) / 10;
            ScaffoldKt.m2411ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-959313722, true, new Function2() { // from class: com.example.ui.tools.daily.DailyToolsKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    return DailyToolsKt.StopwatchAndTimerScreen$lambda$97(Function0.this, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, $composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(430598939, true, new Function3() { // from class: com.example.ui.tools.daily.DailyToolsKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                    return DailyToolsKt.StopwatchAndTimerScreen$lambda$109(minutes, seconds, millis, laps, isRunning$delegate, elapsedMillis$delegate, (PaddingValues) obj5, (Composer) obj6, ((Integer) obj7).intValue());
                }
            }, $composer2, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.tools.daily.DailyToolsKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    return DailyToolsKt.StopwatchAndTimerScreen$lambda$110(Function0.this, $changed, (Composer) obj5, ((Integer) obj6).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StopwatchAndTimerScreen$lambda$86$lambda$85(Function0 $onBack) {
        $onBack.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean StopwatchAndTimerScreen$lambda$88(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void StopwatchAndTimerScreen$lambda$89(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long StopwatchAndTimerScreen$lambda$91(MutableLongState $elapsedMillis$delegate) {
        return $elapsedMillis$delegate.getLongValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit StopwatchAndTimerScreen$lambda$97(final kotlin.jvm.functions.Function0 r41, androidx.compose.runtime.Composer r42, int r43) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.daily.DailyToolsKt.StopwatchAndTimerScreen$lambda$97(kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StopwatchAndTimerScreen$lambda$97$lambda$96$lambda$95(Function0 $onBack, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C461@18878L155:DailyTools.kt#ciovlp");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-967950506, $changed, -1, "com.example.ui.tools.daily.StopwatchAndTimerScreen.<anonymous>.<anonymous>.<anonymous> (DailyTools.kt:461)");
            }
            IconButtonKt.IconButton($onBack, null, false, null, null, ComposableSingletons$DailyToolsKt.INSTANCE.getLambda$891098419$app(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x08ea  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x035d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit StopwatchAndTimerScreen$lambda$109(long r123, long r125, long r127, final androidx.compose.runtime.snapshots.SnapshotStateList r129, final androidx.compose.runtime.MutableState r130, final androidx.compose.runtime.MutableLongState r131, androidx.compose.foundation.layout.PaddingValues r132, androidx.compose.runtime.Composer r133, int r134) {
        /*
            Method dump skipped, instructions count: 2288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.daily.DailyToolsKt.StopwatchAndTimerScreen$lambda$109(long, long, long, androidx.compose.runtime.snapshots.SnapshotStateList, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableLongState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StopwatchAndTimerScreen$lambda$109$lambda$108$lambda$104$lambda$99$lambda$98(MutableState $isRunning$delegate) {
        StopwatchAndTimerScreen$lambda$89($isRunning$delegate, !StopwatchAndTimerScreen$lambda$88($isRunning$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StopwatchAndTimerScreen$lambda$109$lambda$108$lambda$104$lambda$100(MutableState $isRunning$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C499@20406L94,500@20521L28,501@20570L41:DailyTools.kt#ciovlp");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(29372005, $changed, -1, "com.example.ui.tools.daily.StopwatchAndTimerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DailyTools.kt:499)");
            }
            IconKt.m2153Iconww6aTOc(StopwatchAndTimerScreen$lambda$88($isRunning$delegate) ? PauseKt.getPause(Icons.Filled.INSTANCE) : PlayArrowKt.getPlayArrow(Icons.Filled.INSTANCE), (String) null, (Modifier) null, 0L, $composer, 48, 12);
            SpacerKt.Spacer(SizeKt.m723width3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(6)), $composer, 6);
            TextKt.m2696Text4IGK_g(StopwatchAndTimerScreen$lambda$88($isRunning$delegate) ? "Pause" : "Start", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StopwatchAndTimerScreen$lambda$109$lambda$108$lambda$104$lambda$102$lambda$101(SnapshotStateList $laps, MutableState $isRunning$delegate, MutableLongState $elapsedMillis$delegate) {
        if (StopwatchAndTimerScreen$lambda$88($isRunning$delegate)) {
            $laps.add(0, Long.valueOf(StopwatchAndTimerScreen$lambda$91($elapsedMillis$delegate)));
        } else {
            $elapsedMillis$delegate.setLongValue(0L);
            $laps.clear();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StopwatchAndTimerScreen$lambda$109$lambda$108$lambda$104$lambda$103(MutableState $isRunning$delegate, RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C515@21055L39:DailyTools.kt#ciovlp");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(637970151, $changed, -1, "com.example.ui.tools.daily.StopwatchAndTimerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DailyTools.kt:515)");
            }
            TextKt.m2696Text4IGK_g(StopwatchAndTimerScreen$lambda$88($isRunning$delegate) ? "Lap" : "Reset", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void UnitConverterScreen(final Function0<Unit> onBack, Composer $composer, final int $changed) {
        Object obj;
        char c;
        Object obj2;
        Object obj3;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer $composer2 = $composer.startRestartGroup(1715510345);
        ComposerKt.sourceInformation($composer2, "C(UnitConverterScreen)557@22814L12,557@22802L24,559@22854L33,560@22916L37,566@23119L544,580@23670L5384,565@23092L5962:DailyTools.kt#ciovlp");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(onBack) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1715510345, $dirty, -1, "com.example.ui.tools.daily.UnitConverterScreen (DailyTools.kt:556)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -661996459, "CC(remember):DailyTools.kt#9igjgp");
            boolean z = ($dirty & 14) == 4;
            Object rememberedValue = $composer2.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.tools.daily.DailyToolsKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DailyToolsKt.UnitConverterScreen$lambda$112$lambda$111(Function0.this);
                    }
                };
                $composer2.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            BackHandlerKt.BackHandler(false, (Function0) obj, $composer2, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer2, -661995158, "CC(remember):DailyTools.kt#9igjgp");
            Object rememberedValue2 = $composer2.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                c = 0;
                obj2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("10", null, 2, null);
                $composer2.updateRememberedValue(obj2);
            } else {
                c = 0;
                obj2 = rememberedValue2;
            }
            final MutableState inputValueText$delegate = (MutableState) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -661993170, "CC(remember):DailyTools.kt#9igjgp");
            Object rememberedValue3 = $composer2.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("Length", null, 2, null);
                $composer2.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            final MutableState selectedUnitType$delegate = (MutableState) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            String[] strArr = new String[4];
            strArr[c] = "Length";
            strArr[1] = "Weight";
            strArr[2] = "Temperature";
            strArr[3] = "Speed";
            final List unitTypes = CollectionsKt.listOf((Object[]) strArr);
            Double doubleOrNull = StringsKt.toDoubleOrNull(UnitConverterScreen$lambda$114(inputValueText$delegate));
            final double inputValue = doubleOrNull != null ? doubleOrNull.doubleValue() : 10.0d;
            ScaffoldKt.m2411ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-306377979, true, new Function2() { // from class: com.example.ui.tools.daily.DailyToolsKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return DailyToolsKt.UnitConverterScreen$lambda$121(Function0.this, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1654267942, true, new Function3() { // from class: com.example.ui.tools.daily.DailyToolsKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    return DailyToolsKt.UnitConverterScreen$lambda$143(unitTypes, selectedUnitType$delegate, inputValueText$delegate, inputValue, (PaddingValues) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, $composer2, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.tools.daily.DailyToolsKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return DailyToolsKt.UnitConverterScreen$lambda$144(Function0.this, $changed, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit UnitConverterScreen$lambda$112$lambda$111(Function0 $onBack) {
        $onBack.invoke();
        return Unit.INSTANCE;
    }

    private static final String UnitConverterScreen$lambda$114(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String UnitConverterScreen$lambda$117(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit UnitConverterScreen$lambda$121(final kotlin.jvm.functions.Function0 r41, androidx.compose.runtime.Composer r42, int r43) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.daily.DailyToolsKt.UnitConverterScreen$lambda$121(kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit UnitConverterScreen$lambda$121$lambda$120$lambda$119(Function0 $onBack, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C571@23298L155:DailyTools.kt#ciovlp");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1870984811, $changed, -1, "com.example.ui.tools.daily.UnitConverterScreen.<anonymous>.<anonymous>.<anonymous> (DailyTools.kt:571)");
            }
            IconButtonKt.IconButton($onBack, null, false, null, null, ComposableSingletons$DailyToolsKt.INSTANCE.m7043getLambda$1775151630$app(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit UnitConverterScreen$lambda$143(final java.util.List r57, final androidx.compose.runtime.MutableState r58, final androidx.compose.runtime.MutableState r59, final double r60, androidx.compose.foundation.layout.PaddingValues r62, androidx.compose.runtime.Composer r63, int r64) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.daily.DailyToolsKt.UnitConverterScreen$lambda$143(java.util.List, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, double, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit UnitConverterScreen$lambda$143$lambda$142$lambda$126(List $unitTypes, final MutableState $selectedUnitType$delegate, Composer $composer, int $changed) {
        Object obj;
        Composer composer = $composer;
        ComposerKt.sourceInformation(composer, "C*594@24229L27,595@24289L14,592@24129L196:DailyTools.kt#ciovlp");
        if (($changed & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-59252632, $changed, -1, "com.example.ui.tools.daily.UnitConverterScreen.<anonymous>.<anonymous>.<anonymous> (DailyTools.kt:591)");
            }
            Iterator it = $unitTypes.iterator();
            while (it.hasNext()) {
                final String str = (String) it.next();
                boolean areEqual = Intrinsics.areEqual(UnitConverterScreen$lambda$117($selectedUnitType$delegate), str);
                ComposerKt.sourceInformationMarkerStart(composer, -695718125, "CC(remember):DailyTools.kt#9igjgp");
                boolean changed = composer.changed(str);
                Object rememberedValue = $composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    obj = new Function0() { // from class: com.example.ui.tools.daily.DailyToolsKt$$ExternalSyntheticLambda25
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DailyToolsKt.UnitConverterScreen$lambda$143$lambda$142$lambda$126$lambda$125$lambda$123$lambda$122(str, $selectedUnitType$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                } else {
                    obj = rememberedValue;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                TabKt.m2582TabwqdebIU(areEqual, (Function0) obj, null, false, ComposableLambdaKt.rememberComposableLambda(-1826448878, true, new Function2() { // from class: com.example.ui.tools.daily.DailyToolsKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return DailyToolsKt.UnitConverterScreen$lambda$143$lambda$142$lambda$126$lambda$125$lambda$124(str, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer, 54), null, 0L, 0L, null, composer, 24576, 492);
                composer = $composer;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit UnitConverterScreen$lambda$143$lambda$142$lambda$126$lambda$125$lambda$123$lambda$122(String $type, MutableState $selectedUnitType$delegate) {
        $selectedUnitType$delegate.setValue($type);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit UnitConverterScreen$lambda$143$lambda$142$lambda$126$lambda$125$lambda$124(String $type, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C595@24291L10:DailyTools.kt#ciovlp");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1826448878, $changed, -1, "com.example.ui.tools.daily.UnitConverterScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DailyTools.kt:595)");
            }
            TextKt.m2696Text4IGK_g($type, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit UnitConverterScreen$lambda$143$lambda$142$lambda$128$lambda$127(MutableState $inputValueText$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $inputValueText$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:105:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0905 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x08be  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x09cc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0be6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0bf2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0d72  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0d7e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0db7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0eff  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0f0b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0f42  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0f58 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0f11  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0dcd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0d84  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0bf8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x109f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x10ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x10e4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x122d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x1239  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x1270  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x1366  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x1286  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x123f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x10fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x10b1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0505  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit UnitConverterScreen$lambda$143$lambda$142$lambda$141(androidx.compose.runtime.MutableState r86, double r87, androidx.compose.foundation.layout.ColumnScope r89, androidx.compose.runtime.Composer r90, int r91) {
        /*
            Method dump skipped, instructions count: 4986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.daily.DailyToolsKt.UnitConverterScreen$lambda$143$lambda$142$lambda$141(androidx.compose.runtime.MutableState, double, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }
}
