package com.example.ui.tools.business;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.activity.compose.BackHandlerKt;
import androidx.autofill.HintConstants;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableDoubleState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotDoubleStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
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
import androidx.core.view.ViewCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.example.util.ImageExportUtils;
import com.google.android.gms.common.ConnectionResult;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* compiled from: BusinessTools.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001aN\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\u001b\u0010\u0013\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u001b\u0010\u0014\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u001b\u0010\u0015\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010\u001a\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010\u001b\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010\u001f\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020!X\u008a\u008e\u0002²\u0006\n\u0010\"\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010#\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010$\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010%\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010&\u001a\u00020\bX\u008a\u008e\u0002"}, d2 = {"InvoiceBillMakerScreen", "", "onBack", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "renderInvoiceBitmap", "Landroid/graphics/Bitmap;", "bizName", "", "gstin", "invNo", "date", "client", HintConstants.AUTOFILL_HINT_PHONE, "items", "", "Lcom/example/ui/tools/business/InvoiceItem;", "total", "", "GstCalculatorScreen", "EmiCalculatorScreen", "ProfitDiscountCalculatorScreen", "app", "businessName", "businessGst", "businessAddress", "customerName", "customerPhone", "invoiceNumber", "invoiceDate", "amountText", "gstRate", "isExclusive", "", "loanAmountText", "interestRateText", "tenureYearsText", "costPriceText", "sellingPriceText"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BusinessToolsKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EmiCalculatorScreen$lambda$153(Function0 function0, int i, Composer composer, int i2) {
        EmiCalculatorScreen(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GstCalculatorScreen$lambda$122(Function0 function0, int i, Composer composer, int i2) {
        GstCalculatorScreen(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvoiceBillMakerScreen$lambda$82(Function0 function0, int i, Composer composer, int i2) {
        InvoiceBillMakerScreen(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ProfitDiscountCalculatorScreen$lambda$176(Function0 function0, int i, Composer composer, int i2) {
        ProfitDiscountCalculatorScreen(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void InvoiceBillMakerScreen(final Function0<Unit> onBack, Composer $composer, final int $changed) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer $composer2 = $composer.startRestartGroup(81959421);
        ComposerKt.sourceInformation($composer2, "C(InvoiceBillMakerScreen)97@4070L12,97@4058L24,98@4114L7,100@4147L50,101@4221L46,102@4295L66,103@4386L44,104@4456L46,105@4528L43,106@4595L41,108@4654L200,125@5187L540,139@5734L13340,124@5160L13914:BusinessTools.kt#3kogv0");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(onBack) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(81959421, $dirty, -1, "com.example.ui.tools.business.InvoiceBillMakerScreen (BusinessTools.kt:96)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 1453596009, "CC(remember):BusinessTools.kt#9igjgp");
            boolean z = ($dirty & 14) == 4;
            Object rememberedValue = $composer2.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.tools.business.BusinessToolsKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BusinessToolsKt.InvoiceBillMakerScreen$lambda$1$lambda$0(Function0.this);
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
            ComposerKt.sourceInformationMarkerStart($composer2, 1453598511, "CC(remember):BusinessTools.kt#9igjgp");
            Object rememberedValue2 = $composer2.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("TechCraft Solutions", null, 2, null);
                $composer2.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            final MutableState businessName$delegate = (MutableState) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1453600875, "CC(remember):BusinessTools.kt#9igjgp");
            Object rememberedValue3 = $composer2.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("07AAAAA0000A1Z5", null, 2, null);
                $composer2.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            final MutableState businessGst$delegate = (MutableState) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1453603263, "CC(remember):BusinessTools.kt#9igjgp");
            Object rememberedValue4 = $composer2.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                obj4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("Connaught Place, New Delhi - 110001", null, 2, null);
                $composer2.updateRememberedValue(obj4);
            } else {
                obj4 = rememberedValue4;
            }
            final MutableState businessAddress$delegate = (MutableState) obj4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1453606153, "CC(remember):BusinessTools.kt#9igjgp");
            Object rememberedValue5 = $composer2.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                obj5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("Vikas Singhal", null, 2, null);
                $composer2.updateRememberedValue(obj5);
            } else {
                obj5 = rememberedValue5;
            }
            final MutableState customerName$delegate = (MutableState) obj5;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1453608395, "CC(remember):BusinessTools.kt#9igjgp");
            Object rememberedValue6 = $composer2.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                obj6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("+91 98112 34567", null, 2, null);
                $composer2.updateRememberedValue(obj6);
            } else {
                obj6 = rememberedValue6;
            }
            final MutableState customerPhone$delegate = (MutableState) obj6;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1453610696, "CC(remember):BusinessTools.kt#9igjgp");
            Object rememberedValue7 = $composer2.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                obj7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("INV-2026-089", null, 2, null);
                $composer2.updateRememberedValue(obj7);
            } else {
                obj7 = rememberedValue7;
            }
            final MutableState invoiceNumber$delegate = (MutableState) obj7;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1453612838, "CC(remember):BusinessTools.kt#9igjgp");
            Object rememberedValue8 = $composer2.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                obj8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("29-09-2026", null, 2, null);
                $composer2.updateRememberedValue(obj8);
            } else {
                obj8 = rememberedValue8;
            }
            final MutableState invoiceDate$delegate = (MutableState) obj8;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1453614885, "CC(remember):BusinessTools.kt#9igjgp");
            Object rememberedValue9 = $composer2.rememberedValue();
            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                obj9 = SnapshotStateKt.mutableStateListOf(new InvoiceItem("Website Design & Development", 1.0d, 25000.0d, 18.0d), new InvoiceItem("Cloud Hosting (1 Year)", 1.0d, 4500.0d, 18.0d));
                $composer2.updateRememberedValue(obj9);
            } else {
                obj9 = rememberedValue9;
            }
            final SnapshotStateList items = (SnapshotStateList) obj9;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Iterator<T> it = items.iterator();
            double d = 0.0d;
            final double subtotal = 0.0d;
            while (it.hasNext()) {
                subtotal += ((InvoiceItem) it.next()).getTotalTaxable();
            }
            Iterator<T> it2 = items.iterator();
            while (it2.hasNext()) {
                d += ((InvoiceItem) it2.next()).getTaxAmount();
            }
            double totalGst = d;
            final double cgst = totalGst / 2.0d;
            final double sgst = totalGst / 2.0d;
            final double grandTotal = subtotal + totalGst;
            NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
            ScaffoldKt.m2411ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(493944513, true, new Function2() { // from class: com.example.ui.tools.business.BusinessToolsKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj10, Object obj11) {
                    return BusinessToolsKt.InvoiceBillMakerScreen$lambda$28(Function0.this, (Composer) obj10, ((Integer) obj11).intValue());
                }
            }, $composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1651390068, true, new Function3() { // from class: com.example.ui.tools.business.BusinessToolsKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj10, Object obj11, Object obj12) {
                    return BusinessToolsKt.InvoiceBillMakerScreen$lambda$81(SnapshotStateList.this, businessName$delegate, businessGst$delegate, businessAddress$delegate, invoiceNumber$delegate, invoiceDate$delegate, customerName$delegate, customerPhone$delegate, subtotal, cgst, sgst, grandTotal, context, (PaddingValues) obj10, (Composer) obj11, ((Integer) obj12).intValue());
                }
            }, $composer2, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.tools.business.BusinessToolsKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj10, Object obj11) {
                    return BusinessToolsKt.InvoiceBillMakerScreen$lambda$82(Function0.this, $changed, (Composer) obj10, ((Integer) obj11).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvoiceBillMakerScreen$lambda$1$lambda$0(Function0 $onBack) {
        $onBack.invoke();
        return Unit.INSTANCE;
    }

    private static final String InvoiceBillMakerScreen$lambda$3(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String InvoiceBillMakerScreen$lambda$6(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String InvoiceBillMakerScreen$lambda$9(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String InvoiceBillMakerScreen$lambda$12(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String InvoiceBillMakerScreen$lambda$15(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String InvoiceBillMakerScreen$lambda$18(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String InvoiceBillMakerScreen$lambda$21(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit InvoiceBillMakerScreen$lambda$28(final kotlin.jvm.functions.Function0 r41, androidx.compose.runtime.Composer r42, int r43) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.business.BusinessToolsKt.InvoiceBillMakerScreen$lambda$28(kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvoiceBillMakerScreen$lambda$28$lambda$27$lambda$26(Function0 $onBack, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C130@5362L155:BusinessTools.kt#3kogv0");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2032115151, $changed, -1, "com.example.ui.tools.business.InvoiceBillMakerScreen.<anonymous>.<anonymous>.<anonymous> (BusinessTools.kt:130)");
            }
            IconButtonKt.IconButton($onBack, null, false, null, null, ComposableSingletons$BusinessToolsKt.INSTANCE.getLambda$439201396$app(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0c06  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0ca0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0b8d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0a7e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x099d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x090f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x08fd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0989  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0a6c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0a78  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0b7f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit InvoiceBillMakerScreen$lambda$81(final androidx.compose.runtime.snapshots.SnapshotStateList r113, final androidx.compose.runtime.MutableState r114, final androidx.compose.runtime.MutableState r115, final androidx.compose.runtime.MutableState r116, final androidx.compose.runtime.MutableState r117, final androidx.compose.runtime.MutableState r118, final androidx.compose.runtime.MutableState r119, final androidx.compose.runtime.MutableState r120, final double r121, final double r123, final double r125, final double r127, android.content.Context r129, androidx.compose.foundation.layout.PaddingValues r130, androidx.compose.runtime.Composer r131, int r132) {
        /*
            Method dump skipped, instructions count: 3238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.business.BusinessToolsKt.InvoiceBillMakerScreen$lambda$81(androidx.compose.runtime.snapshots.SnapshotStateList, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, double, double, double, double, android.content.Context, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0998  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x04f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0344 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit InvoiceBillMakerScreen$lambda$81$lambda$80$lambda$39(androidx.compose.runtime.MutableState r103, androidx.compose.runtime.MutableState r104, androidx.compose.runtime.MutableState r105, androidx.compose.runtime.MutableState r106, androidx.compose.runtime.MutableState r107, androidx.compose.runtime.MutableState r108, androidx.compose.runtime.MutableState r109, final androidx.compose.runtime.snapshots.SnapshotStateList r110, double r111, double r113, double r115, double r117, androidx.compose.foundation.layout.ColumnScope r119, androidx.compose.runtime.Composer r120, int r121) {
        /*
            Method dump skipped, instructions count: 2462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.business.BusinessToolsKt.InvoiceBillMakerScreen$lambda$81$lambda$80$lambda$39(androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.snapshots.SnapshotStateList, double, double, double, double, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit InvoiceBillMakerScreen$lambda$81$lambda$80$lambda$39$lambda$38$lambda$36(androidx.compose.runtime.snapshots.SnapshotStateList r85, androidx.compose.runtime.Composer r86, int r87) {
        /*
            Method dump skipped, instructions count: 1715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.business.BusinessToolsKt.InvoiceBillMakerScreen$lambda$81$lambda$80$lambda$39$lambda$38$lambda$36(androidx.compose.runtime.snapshots.SnapshotStateList, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvoiceBillMakerScreen$lambda$81$lambda$80$lambda$46$lambda$43$lambda$42(Context $context, SnapshotStateList $items, double $subtotal, double $cgst, double $sgst, double $grandTotal, MutableState $businessName$delegate, MutableState $businessGst$delegate, MutableState $invoiceNumber$delegate, MutableState $invoiceDate$delegate, MutableState $customerName$delegate, MutableState $customerPhone$delegate) {
        StringBuilder sb = new StringBuilder();
        sb.append("===== " + InvoiceBillMakerScreen$lambda$3($businessName$delegate) + " =====").append('\n');
        sb.append("GSTIN: " + InvoiceBillMakerScreen$lambda$6($businessGst$delegate)).append('\n');
        sb.append("Invoice No: " + InvoiceBillMakerScreen$lambda$18($invoiceNumber$delegate) + "  | Date: " + InvoiceBillMakerScreen$lambda$21($invoiceDate$delegate)).append('\n');
        sb.append("Bill To: " + InvoiceBillMakerScreen$lambda$12($customerName$delegate) + " (" + InvoiceBillMakerScreen$lambda$15($customerPhone$delegate) + ")").append('\n');
        sb.append("----------------------------------------").append('\n');
        Iterator it = $items.iterator();
        while (it.hasNext()) {
            InvoiceItem invoiceItem = (InvoiceItem) it.next();
            sb.append(invoiceItem.getName() + " x " + ((int) invoiceItem.getQty()) + " = ₹" + ((int) invoiceItem.getTotalAmount())).append('\n');
        }
        sb.append("----------------------------------------").append('\n');
        sb.append("Subtotal: ₹" + ((int) $subtotal)).append('\n');
        sb.append("CGST: ₹" + ((int) $cgst) + " | SGST: ₹" + ((int) $sgst)).append('\n');
        sb.append("GRAND TOTAL: ₹" + ((int) $grandTotal)).append('\n');
        sb.append("Thank you for your business!").append('\n');
        String textBill = sb.toString();
        ImageExportUtils.INSTANCE.copyToClipboard($context, textBill, "Invoice");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvoiceBillMakerScreen$lambda$81$lambda$80$lambda$46$lambda$45$lambda$44(SnapshotStateList $items, double $grandTotal, Context $context, MutableState $businessName$delegate, MutableState $businessGst$delegate, MutableState $invoiceNumber$delegate, MutableState $invoiceDate$delegate, MutableState $customerName$delegate, MutableState $customerPhone$delegate) {
        Bitmap bmp = renderInvoiceBitmap(InvoiceBillMakerScreen$lambda$3($businessName$delegate), InvoiceBillMakerScreen$lambda$6($businessGst$delegate), InvoiceBillMakerScreen$lambda$18($invoiceNumber$delegate), InvoiceBillMakerScreen$lambda$21($invoiceDate$delegate), InvoiceBillMakerScreen$lambda$12($customerName$delegate), InvoiceBillMakerScreen$lambda$15($customerPhone$delegate), $items, $grandTotal);
        ImageExportUtils.INSTANCE.shareBitmap($context, bmp, "Invoice " + InvoiceBillMakerScreen$lambda$18($invoiceNumber$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvoiceBillMakerScreen$lambda$81$lambda$80$lambda$48$lambda$47(MutableState $businessName$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $businessName$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvoiceBillMakerScreen$lambda$81$lambda$80$lambda$50$lambda$49(MutableState $businessGst$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $businessGst$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvoiceBillMakerScreen$lambda$81$lambda$80$lambda$52$lambda$51(MutableState $businessAddress$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $businessAddress$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvoiceBillMakerScreen$lambda$81$lambda$80$lambda$54$lambda$53(MutableState $customerName$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $customerName$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvoiceBillMakerScreen$lambda$81$lambda$80$lambda$56$lambda$55(MutableState $customerPhone$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $customerPhone$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvoiceBillMakerScreen$lambda$81$lambda$80$lambda$61$lambda$58$lambda$57(MutableState $invoiceNumber$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $invoiceNumber$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvoiceBillMakerScreen$lambda$81$lambda$80$lambda$61$lambda$60$lambda$59(MutableState $invoiceDate$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $invoiceDate$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvoiceBillMakerScreen$lambda$81$lambda$80$lambda$64$lambda$63$lambda$62(SnapshotStateList $items) {
        $items.add(new InvoiceItem("New Item", 1.0d, 1000.0d, 18.0d));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0596 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x048e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit InvoiceBillMakerScreen$lambda$81$lambda$80$lambda$79$lambda$78(final com.example.ui.tools.business.InvoiceItem r94, final int r95, final androidx.compose.runtime.snapshots.SnapshotStateList r96, androidx.compose.foundation.layout.ColumnScope r97, androidx.compose.runtime.Composer r98, int r99) {
        /*
            Method dump skipped, instructions count: 1940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.business.BusinessToolsKt.InvoiceBillMakerScreen$lambda$81$lambda$80$lambda$79$lambda$78(com.example.ui.tools.business.InvoiceItem, int, androidx.compose.runtime.snapshots.SnapshotStateList, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvoiceBillMakerScreen$lambda$81$lambda$80$lambda$79$lambda$78$lambda$77$lambda$67$lambda$66$lambda$65(SnapshotStateList $items, int $index) {
        $items.remove($index);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvoiceBillMakerScreen$lambda$81$lambda$80$lambda$79$lambda$78$lambda$77$lambda$69$lambda$68(InvoiceItem $item, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $item.setName(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvoiceBillMakerScreen$lambda$81$lambda$80$lambda$79$lambda$78$lambda$77$lambda$76$lambda$71$lambda$70(InvoiceItem $item, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Double doubleOrNull = StringsKt.toDoubleOrNull(it);
        $item.setQty(doubleOrNull != null ? doubleOrNull.doubleValue() : 1.0d);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvoiceBillMakerScreen$lambda$81$lambda$80$lambda$79$lambda$78$lambda$77$lambda$76$lambda$73$lambda$72(InvoiceItem $item, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Double doubleOrNull = StringsKt.toDoubleOrNull(it);
        $item.setRate(doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvoiceBillMakerScreen$lambda$81$lambda$80$lambda$79$lambda$78$lambda$77$lambda$76$lambda$75$lambda$74(InvoiceItem $item, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Double doubleOrNull = StringsKt.toDoubleOrNull(it);
        $item.setGstRate(doubleOrNull != null ? doubleOrNull.doubleValue() : 18.0d);
        return Unit.INSTANCE;
    }

    private static final Bitmap renderInvoiceBitmap(String bizName, String gstin, String invNo, String date, String client, String phone, List<InvoiceItem> list, double total) {
        Bitmap bitmap = Bitmap.createBitmap(1080, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-1);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint.setTextSize(50.0f);
        paint.setFakeBoldText(true);
        float f = 60.0f;
        canvas.drawText(bizName, 60.0f, 120.0f, paint);
        paint.setTextSize(28.0f);
        paint.setFakeBoldText(false);
        canvas.drawText("GSTIN: " + gstin, 60.0f, 170.0f, paint);
        paint.setTextSize(40.0f);
        paint.setFakeBoldText(true);
        paint.setTextAlign(Paint.Align.RIGHT);
        canvas.drawText("TAX INVOICE", 1080 - 60.0f, 120.0f, paint);
        paint.setTextSize(28.0f);
        paint.setFakeBoldText(false);
        canvas.drawText("Invoice: " + invNo, 1080 - 60.0f, 170.0f, paint);
        canvas.drawText("Date: " + date, 1080 - 60.0f, 210.0f, paint);
        paint.setStrokeWidth(3.0f);
        paint.setColor(-3355444);
        canvas.drawLine(60.0f, 260.0f, 1080 - 60.0f, 260.0f, paint);
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint.setTextAlign(Paint.Align.LEFT);
        paint.setTextSize(34.0f);
        paint.setFakeBoldText(true);
        canvas.drawText("Bill To: " + client, 60.0f, 320.0f, paint);
        paint.setTextSize(28.0f);
        paint.setFakeBoldText(false);
        canvas.drawText("Phone: " + phone, 60.0f, 360.0f, paint);
        paint.setColor(Color.parseColor("#F1F5F9"));
        canvas.drawRect(60.0f, 420.0f, 1080 - 60.0f, 480.0f, paint);
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint.setTextSize(28.0f);
        paint.setFakeBoldText(true);
        float f2 = 80.0f;
        canvas.drawText("Item / Description", 80.0f, 460.0f, paint);
        float f3 = 650.0f;
        canvas.drawText("Qty", 650.0f, 460.0f, paint);
        canvas.drawText("Rate", 780.0f, 460.0f, paint);
        canvas.drawText("Total", 920.0f, 460.0f, paint);
        paint.setFakeBoldText(false);
        float currentY = 540.0f;
        int i = 0;
        for (InvoiceItem invoiceItem : list) {
            float f4 = f;
            canvas.drawText(invoiceItem.getName(), f2, currentY, paint);
            canvas.drawText(String.valueOf((int) invoiceItem.getQty()), f3, currentY, paint);
            canvas.drawText("₹" + ((int) invoiceItem.getRate()), 780.0f, currentY, paint);
            canvas.drawText("₹" + ((int) invoiceItem.getTotalAmount()), 920.0f, currentY, paint);
            currentY += f4;
            f = f4;
            i = i;
            f2 = 80.0f;
            f3 = 650.0f;
        }
        paint.setColor(Color.parseColor("#059669"));
        canvas.drawRect(1080 - 450.0f, currentY + 40.0f, 1080 - f, currentY + 120.0f, paint);
        paint.setColor(-1);
        paint.setTextSize(36.0f);
        paint.setFakeBoldText(true);
        canvas.drawText("GRAND TOTAL: ₹" + ((int) total), 1080 - 420.0f, 92.0f + currentY, paint);
        return bitmap;
    }

    public static final void GstCalculatorScreen(final Function0<Unit> onBack, Composer $composer, final int $changed) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object triple;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer $composer2 = $composer.startRestartGroup(916059903);
        ComposerKt.sourceInformation($composer2, "C(GstCalculatorScreen)448@22050L12,448@22038L24,450@22086L36,451@22142L39,452@22205L33,456@22379L352,470@22826L534,484@23367L4122,469@22799L4690:BusinessTools.kt#3kogv0");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(onBack) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(916059903, $dirty, -1, "com.example.ui.tools.business.GstCalculatorScreen (BusinessTools.kt:447)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -134725237, "CC(remember):BusinessTools.kt#9igjgp");
            boolean z = ($dirty & 14) == 4;
            Object rememberedValue = $composer2.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.tools.business.BusinessToolsKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BusinessToolsKt.GstCalculatorScreen$lambda$86$lambda$85(Function0.this);
                    }
                };
                $composer2.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            BackHandlerKt.BackHandler(false, (Function0) obj, $composer2, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer2, -134724061, "CC(remember):BusinessTools.kt#9igjgp");
            Object rememberedValue2 = $composer2.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("10000", null, 2, null);
                $composer2.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            final MutableState amountText$delegate = (MutableState) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -134722266, "CC(remember):BusinessTools.kt#9igjgp");
            Object rememberedValue3 = $composer2.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj3 = SnapshotDoubleStateKt.mutableDoubleStateOf(18.0d);
                $composer2.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            final MutableDoubleState gstRate$delegate = (MutableDoubleState) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -134720256, "CC(remember):BusinessTools.kt#9igjgp");
            Object rememberedValue4 = $composer2.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                obj4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                $composer2.updateRememberedValue(obj4);
            } else {
                obj4 = rememberedValue4;
            }
            final MutableState isExclusive$delegate = (MutableState) obj4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Double doubleOrNull = StringsKt.toDoubleOrNull(GstCalculatorScreen$lambda$88(amountText$delegate));
            double baseAmount = doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d;
            double GstCalculatorScreen$lambda$91 = GstCalculatorScreen$lambda$91(gstRate$delegate);
            boolean GstCalculatorScreen$lambda$94 = GstCalculatorScreen$lambda$94(isExclusive$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, -134714369, "CC(remember):BusinessTools.kt#9igjgp");
            boolean changed = $composer2.changed(GstCalculatorScreen$lambda$94) | $composer2.changed(baseAmount) | $composer2.changed(GstCalculatorScreen$lambda$91);
            Object rememberedValue5 = $composer2.rememberedValue();
            if (changed || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                if (GstCalculatorScreen$lambda$94(isExclusive$delegate)) {
                    double GstCalculatorScreen$lambda$912 = (GstCalculatorScreen$lambda$91(gstRate$delegate) / 100.0d) * baseAmount;
                    triple = new Triple(Double.valueOf(baseAmount), Double.valueOf(GstCalculatorScreen$lambda$912), Double.valueOf(baseAmount + GstCalculatorScreen$lambda$912));
                } else {
                    double GstCalculatorScreen$lambda$913 = baseAmount / ((GstCalculatorScreen$lambda$91(gstRate$delegate) / 100.0d) + 1.0d);
                    triple = new Triple(Double.valueOf(GstCalculatorScreen$lambda$913), Double.valueOf(baseAmount - GstCalculatorScreen$lambda$913), Double.valueOf(baseAmount));
                }
                $composer2.updateRememberedValue(triple);
            } else {
                triple = rememberedValue5;
            }
            Triple triple2 = (Triple) triple;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final double netAmount = ((Number) triple2.component1()).doubleValue();
            final double gstAmount = ((Number) triple2.component2()).doubleValue();
            final double totalAmount = ((Number) triple2.component3()).doubleValue();
            final double cgst = gstAmount / 2.0d;
            final double sgst = gstAmount / 2.0d;
            ScaffoldKt.m2411ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-140547909, true, new Function2() { // from class: com.example.ui.tools.business.BusinessToolsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    return BusinessToolsKt.GstCalculatorScreen$lambda$99(Function0.this, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, $composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-169309744, true, new Function3() { // from class: com.example.ui.tools.business.BusinessToolsKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                    return BusinessToolsKt.GstCalculatorScreen$lambda$121(MutableState.this, amountText$delegate, gstRate$delegate, netAmount, cgst, sgst, gstAmount, totalAmount, (PaddingValues) obj5, (Composer) obj6, ((Integer) obj7).intValue());
                }
            }, $composer2, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.tools.business.BusinessToolsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    return BusinessToolsKt.GstCalculatorScreen$lambda$122(Function0.this, $changed, (Composer) obj5, ((Integer) obj6).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GstCalculatorScreen$lambda$86$lambda$85(Function0 $onBack) {
        $onBack.invoke();
        return Unit.INSTANCE;
    }

    private static final String GstCalculatorScreen$lambda$88(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final double GstCalculatorScreen$lambda$91(MutableDoubleState $gstRate$delegate) {
        return $gstRate$delegate.getDoubleValue();
    }

    private static final boolean GstCalculatorScreen$lambda$94(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void GstCalculatorScreen$lambda$95(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit GstCalculatorScreen$lambda$99(final kotlin.jvm.functions.Function0 r41, androidx.compose.runtime.Composer r42, int r43) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.business.BusinessToolsKt.GstCalculatorScreen$lambda$99(kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GstCalculatorScreen$lambda$99$lambda$98$lambda$97(Function0 $onBack, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C475@22995L155:BusinessTools.kt#3kogv0");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(149437259, $changed, -1, "com.example.ui.tools.business.GstCalculatorScreen.<anonymous>.<anonymous>.<anonymous> (BusinessTools.kt:475)");
            }
            IconButtonKt.IconButton($onBack, null, false, null, null, ComposableSingletons$BusinessToolsKt.INSTANCE.m7014getLambda$10940952$app(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit GstCalculatorScreen$lambda$121(final androidx.compose.runtime.MutableState r82, final androidx.compose.runtime.MutableState r83, final androidx.compose.runtime.MutableDoubleState r84, final double r85, final double r87, final double r89, final double r91, final double r93, androidx.compose.foundation.layout.PaddingValues r95, androidx.compose.runtime.Composer r96, int r97) {
        /*
            Method dump skipped, instructions count: 1408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.business.BusinessToolsKt.GstCalculatorScreen$lambda$121(androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableDoubleState, double, double, double, double, double, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GstCalculatorScreen$lambda$121$lambda$120$lambda$104(final MutableState $isExclusive$delegate, Composer $composer, int $changed) {
        Object obj;
        Object obj2;
        ComposerKt.sourceInformation($composer, "C495@23828L22,495@23790L101,496@23947L23,496@23908L106:BusinessTools.kt#3kogv0");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1758500898, $changed, -1, "com.example.ui.tools.business.GstCalculatorScreen.<anonymous>.<anonymous>.<anonymous> (BusinessTools.kt:495)");
            }
            boolean GstCalculatorScreen$lambda$94 = GstCalculatorScreen$lambda$94($isExclusive$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -1997213836, "CC(remember):BusinessTools.kt#9igjgp");
            Object rememberedValue = $composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.tools.business.BusinessToolsKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BusinessToolsKt.GstCalculatorScreen$lambda$121$lambda$120$lambda$104$lambda$101$lambda$100(MutableState.this);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TabKt.m2582TabwqdebIU(GstCalculatorScreen$lambda$94, (Function0) obj, null, false, ComposableSingletons$BusinessToolsKt.INSTANCE.m7020getLambda$1669003964$app(), null, 0L, 0L, null, $composer, 24624, 492);
            boolean z = !GstCalculatorScreen$lambda$94($isExclusive$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -1997210027, "CC(remember):BusinessTools.kt#9igjgp");
            Object rememberedValue2 = $composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = new Function0() { // from class: com.example.ui.tools.business.BusinessToolsKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BusinessToolsKt.GstCalculatorScreen$lambda$121$lambda$120$lambda$104$lambda$103$lambda$102(MutableState.this);
                    }
                };
                $composer.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TabKt.m2582TabwqdebIU(z, (Function0) obj2, null, false, ComposableSingletons$BusinessToolsKt.INSTANCE.getLambda$1581019003$app(), null, 0L, 0L, null, $composer, 24624, 492);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GstCalculatorScreen$lambda$121$lambda$120$lambda$104$lambda$101$lambda$100(MutableState $isExclusive$delegate) {
        GstCalculatorScreen$lambda$95($isExclusive$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GstCalculatorScreen$lambda$121$lambda$120$lambda$104$lambda$103$lambda$102(MutableState $isExclusive$delegate) {
        GstCalculatorScreen$lambda$95($isExclusive$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GstCalculatorScreen$lambda$121$lambda$120$lambda$106$lambda$105(MutableState $amountText$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $amountText$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GstCalculatorScreen$lambda$121$lambda$120$lambda$107(MutableState $isExclusive$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C503@24204L69:BusinessTools.kt#3kogv0");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1570857888, $changed, -1, "com.example.ui.tools.business.GstCalculatorScreen.<anonymous>.<anonymous>.<anonymous> (BusinessTools.kt:503)");
            }
            TextKt.m2696Text4IGK_g(GstCalculatorScreen$lambda$94($isExclusive$delegate) ? "Net Amount (₹)" : "Total Gross Amount (₹)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GstCalculatorScreen$lambda$121$lambda$120$lambda$112$lambda$111$lambda$109$lambda$108(double $rate, MutableDoubleState $gstRate$delegate) {
        $gstRate$delegate.setDoubleValue($rate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GstCalculatorScreen$lambda$121$lambda$120$lambda$112$lambda$111$lambda$110(double $rate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C516@24951L24:BusinessTools.kt#3kogv0");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1568650521, $changed, -1, "com.example.ui.tools.business.GstCalculatorScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BusinessTools.kt:516)");
            }
            TextKt.m2696Text4IGK_g(((int) $rate) + "%", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x091c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0953  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0a61  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0969 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0922  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x07b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x05ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0425 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit GstCalculatorScreen$lambda$121$lambda$120$lambda$119(double r109, double r111, androidx.compose.runtime.MutableDoubleState r113, double r114, double r116, double r118, androidx.compose.foundation.layout.ColumnScope r120, androidx.compose.runtime.Composer r121, int r122) {
        /*
            Method dump skipped, instructions count: 2663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.business.BusinessToolsKt.GstCalculatorScreen$lambda$121$lambda$120$lambda$119(double, double, androidx.compose.runtime.MutableDoubleState, double, double, double, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final void EmiCalculatorScreen(final Function0<Unit> onBack, Composer $composer, final int $changed) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        double d;
        Object valueOf;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer $composer2 = $composer.startRestartGroup(379561766);
        ComposerKt.sourceInformation($composer2, "C(EmiCalculatorScreen)567@27728L12,567@27716L24,569@27768L37,570@27834L34,571@27896L32,580@28220L265,591@28648L534,605@29189L3714,590@28621L4282:BusinessTools.kt#3kogv0");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(onBack) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(379561766, $dirty, -1, "com.example.ui.tools.business.EmiCalculatorScreen (BusinessTools.kt:566)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -313359374, "CC(remember):BusinessTools.kt#9igjgp");
            boolean z = ($dirty & 14) == 4;
            Object rememberedValue = $composer2.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.tools.business.BusinessToolsKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BusinessToolsKt.EmiCalculatorScreen$lambda$124$lambda$123(Function0.this);
                    }
                };
                $composer2.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            BackHandlerKt.BackHandler(false, (Function0) obj, $composer2, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer2, -313358069, "CC(remember):BusinessTools.kt#9igjgp");
            Object rememberedValue2 = $composer2.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("500000", null, 2, null);
                $composer2.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            final MutableState loanAmountText$delegate = (MutableState) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -313355960, "CC(remember):BusinessTools.kt#9igjgp");
            Object rememberedValue3 = $composer2.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("9.5", null, 2, null);
                $composer2.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            final MutableState interestRateText$delegate = (MutableState) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -313353978, "CC(remember):BusinessTools.kt#9igjgp");
            Object rememberedValue4 = $composer2.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                obj4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("5", null, 2, null);
                $composer2.updateRememberedValue(obj4);
            } else {
                obj4 = rememberedValue4;
            }
            final MutableState tenureYearsText$delegate = (MutableState) obj4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Double doubleOrNull = StringsKt.toDoubleOrNull(EmiCalculatorScreen$lambda$126(loanAmountText$delegate));
            final double principal = doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d;
            Double doubleOrNull2 = StringsKt.toDoubleOrNull(EmiCalculatorScreen$lambda$129(interestRateText$delegate));
            double annualRate = doubleOrNull2 != null ? doubleOrNull2.doubleValue() : 0.0d;
            Double doubleOrNull3 = StringsKt.toDoubleOrNull(EmiCalculatorScreen$lambda$132(tenureYearsText$delegate));
            double tenureYears = doubleOrNull3 != null ? doubleOrNull3.doubleValue() : 0.0d;
            double monthlyRate = (annualRate / 12.0d) / 100.0d;
            double totalMonths = 12.0d * tenureYears;
            ComposerKt.sourceInformationMarkerStart($composer2, -313343377, "CC(remember):BusinessTools.kt#9igjgp");
            boolean changed = $composer2.changed(principal) | $composer2.changed(monthlyRate) | $composer2.changed(totalMonths);
            Object rememberedValue5 = $composer2.rememberedValue();
            if (changed || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                if (principal > 0.0d && monthlyRate > 0.0d && totalMonths > 0.0d) {
                    double pow = Math.pow(monthlyRate + 1.0d, totalMonths);
                    d = ((principal * monthlyRate) * pow) / (pow - 1.0d);
                } else {
                    d = 0.0d;
                }
                valueOf = Double.valueOf(d);
                $composer2.updateRememberedValue(valueOf);
            } else {
                valueOf = rememberedValue5;
            }
            final double emi = ((Number) valueOf).doubleValue();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final double totalPayment = emi * totalMonths;
            final double totalInterest = totalPayment > principal ? totalPayment - principal : 0.0d;
            ScaffoldKt.m2411ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-677046046, true, new Function2() { // from class: com.example.ui.tools.business.BusinessToolsKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    return BusinessToolsKt.EmiCalculatorScreen$lambda$137(Function0.this, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, $composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-705807881, true, new Function3() { // from class: com.example.ui.tools.business.BusinessToolsKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                    return BusinessToolsKt.EmiCalculatorScreen$lambda$152(emi, loanAmountText$delegate, interestRateText$delegate, tenureYearsText$delegate, principal, totalInterest, totalPayment, (PaddingValues) obj5, (Composer) obj6, ((Integer) obj7).intValue());
                }
            }, $composer2, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.tools.business.BusinessToolsKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    return BusinessToolsKt.EmiCalculatorScreen$lambda$153(Function0.this, $changed, (Composer) obj5, ((Integer) obj6).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EmiCalculatorScreen$lambda$124$lambda$123(Function0 $onBack) {
        $onBack.invoke();
        return Unit.INSTANCE;
    }

    private static final String EmiCalculatorScreen$lambda$126(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String EmiCalculatorScreen$lambda$129(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String EmiCalculatorScreen$lambda$132(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit EmiCalculatorScreen$lambda$137(final kotlin.jvm.functions.Function0 r41, androidx.compose.runtime.Composer r42, int r43) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.business.BusinessToolsKt.EmiCalculatorScreen$lambda$137(kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EmiCalculatorScreen$lambda$137$lambda$136$lambda$135(Function0 $onBack, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C596@28817L155:BusinessTools.kt#3kogv0");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-387060878, $changed, -1, "com.example.ui.tools.business.EmiCalculatorScreen.<anonymous>.<anonymous>.<anonymous> (BusinessTools.kt:596)");
            }
            IconButtonKt.IconButton($onBack, null, false, null, null, ComposableSingletons$BusinessToolsKt.INSTANCE.m7030getLambda$547439089$app(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit EmiCalculatorScreen$lambda$152(final double r56, final androidx.compose.runtime.MutableState r58, final androidx.compose.runtime.MutableState r59, final androidx.compose.runtime.MutableState r60, final double r61, final double r63, final double r65, androidx.compose.foundation.layout.PaddingValues r67, androidx.compose.runtime.Composer r68, int r69) {
        /*
            Method dump skipped, instructions count: 1103
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.business.BusinessToolsKt.EmiCalculatorScreen$lambda$152(double, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, double, double, double, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EmiCalculatorScreen$lambda$152$lambda$151$lambda$139(double $emi, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C620@29773L584:BusinessTools.kt#3kogv0");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1512871391, $changed, -1, "com.example.ui.tools.business.EmiCalculatorScreen.<anonymous>.<anonymous>.<anonymous> (BusinessTools.kt:620)");
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
            ComposerKt.sourceInformationMarkerStart($composer, 1044305575, "C624@29998L10,624@29948L72,625@30041L29,630@30298L11,626@30091L248:BusinessTools.kt#3kogv0");
            TextKt.m2696Text4IGK_g("Monthly EMI Payable", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleSmall(), $composer, 6, 0, 65534);
            SpacerKt.Spacer(SizeKt.m704height3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(6)), $composer, 6);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%,.0f", Arrays.copyOf(new Object[]{Double.valueOf($emi)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            TextKt.m2696Text4IGK_g("₹" + format, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), TextUnitKt.getSp(32), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131026);
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
    public static final Unit EmiCalculatorScreen$lambda$152$lambda$151$lambda$141$lambda$140(MutableState $loanAmountText$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $loanAmountText$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EmiCalculatorScreen$lambda$152$lambda$151$lambda$143$lambda$142(MutableState $interestRateText$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $interestRateText$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EmiCalculatorScreen$lambda$152$lambda$151$lambda$145$lambda$144(MutableState $tenureYearsText$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $tenureYearsText$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x05b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0415 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit EmiCalculatorScreen$lambda$152$lambda$151$lambda$150(double r109, double r111, double r113, androidx.compose.foundation.layout.ColumnScope r115, androidx.compose.runtime.Composer r116, int r117) {
        /*
            Method dump skipped, instructions count: 1698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.business.BusinessToolsKt.EmiCalculatorScreen$lambda$152$lambda$151$lambda$150(double, double, double, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final void ProfitDiscountCalculatorScreen(final Function0<Unit> onBack, Composer $composer, final int $changed) {
        Object obj;
        Object obj2;
        Object obj3;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer $composer2 = $composer.startRestartGroup(-1354719066);
        ComposerKt.sourceInformation($composer2, "C(ProfitDiscountCalculatorScreen)693@33167L12,693@33155L24,695@33206L35,696@33270L35,706@33632L542,720@34181L2513,705@33605L3089:BusinessTools.kt#3kogv0");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(onBack) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1354719066, $dirty, -1, "com.example.ui.tools.business.ProfitDiscountCalculatorScreen (BusinessTools.kt:692)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -509927726, "CC(remember):BusinessTools.kt#9igjgp");
            boolean z = ($dirty & 14) == 4;
            Object rememberedValue = $composer2.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.tools.business.BusinessToolsKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BusinessToolsKt.ProfitDiscountCalculatorScreen$lambda$155$lambda$154(Function0.this);
                    }
                };
                $composer2.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            BackHandlerKt.BackHandler(false, (Function0) obj, $composer2, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer2, -509926455, "CC(remember):BusinessTools.kt#9igjgp");
            Object rememberedValue2 = $composer2.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("1200", null, 2, null);
                $composer2.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            final MutableState costPriceText$delegate = (MutableState) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -509924407, "CC(remember):BusinessTools.kt#9igjgp");
            Object rememberedValue3 = $composer2.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("1800", null, 2, null);
                $composer2.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            final MutableState sellingPriceText$delegate = (MutableState) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Double doubleOrNull = StringsKt.toDoubleOrNull(ProfitDiscountCalculatorScreen$lambda$157(costPriceText$delegate));
            double cost = doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d;
            Double doubleOrNull2 = StringsKt.toDoubleOrNull(ProfitDiscountCalculatorScreen$lambda$160(sellingPriceText$delegate));
            double selling = doubleOrNull2 != null ? doubleOrNull2.doubleValue() : 0.0d;
            final double profit = selling - cost;
            final double marginPercent = selling > 0.0d ? (profit / selling) * 100.0d : 0.0d;
            final double markupPercent = cost > 0.0d ? (profit / cost) * 100.0d : 0.0d;
            ScaffoldKt.m2411ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-1718615702, true, new Function2() { // from class: com.example.ui.tools.business.BusinessToolsKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return BusinessToolsKt.ProfitDiscountCalculatorScreen$lambda$164(Function0.this, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1953836747, true, new Function3() { // from class: com.example.ui.tools.business.BusinessToolsKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    return BusinessToolsKt.ProfitDiscountCalculatorScreen$lambda$175(MutableState.this, sellingPriceText$delegate, profit, marginPercent, markupPercent, (PaddingValues) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, $composer2, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.tools.business.BusinessToolsKt$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return BusinessToolsKt.ProfitDiscountCalculatorScreen$lambda$176(Function0.this, $changed, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ProfitDiscountCalculatorScreen$lambda$155$lambda$154(Function0 $onBack) {
        $onBack.invoke();
        return Unit.INSTANCE;
    }

    private static final String ProfitDiscountCalculatorScreen$lambda$157(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String ProfitDiscountCalculatorScreen$lambda$160(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ProfitDiscountCalculatorScreen$lambda$164(final kotlin.jvm.functions.Function0 r41, androidx.compose.runtime.Composer r42, int r43) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.business.BusinessToolsKt.ProfitDiscountCalculatorScreen$lambda$164(kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ProfitDiscountCalculatorScreen$lambda$164$lambda$163$lambda$162(Function0 $onBack, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C711@33809L155:BusinessTools.kt#3kogv0");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2027746522, $changed, -1, "com.example.ui.tools.business.ProfitDiscountCalculatorScreen.<anonymous>.<anonymous>.<anonymous> (BusinessTools.kt:711)");
            }
            IconButtonKt.IconButton($onBack, null, false, null, null, ComposableSingletons$BusinessToolsKt.INSTANCE.m7025getLambda$1912123875$app(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ProfitDiscountCalculatorScreen$lambda$175(final androidx.compose.runtime.MutableState r56, final androidx.compose.runtime.MutableState r57, final double r58, final double r60, final double r62, androidx.compose.foundation.layout.PaddingValues r64, androidx.compose.runtime.Composer r65, int r66) {
        /*
            Method dump skipped, instructions count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.business.BusinessToolsKt.ProfitDiscountCalculatorScreen$lambda$175(androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, double, double, double, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ProfitDiscountCalculatorScreen$lambda$175$lambda$174$lambda$166$lambda$165(MutableState $costPriceText$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $costPriceText$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ProfitDiscountCalculatorScreen$lambda$175$lambda$174$lambda$168$lambda$167(MutableState $sellingPriceText$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $sellingPriceText$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0602 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0469 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ProfitDiscountCalculatorScreen$lambda$175$lambda$174$lambda$173(double r109, double r111, double r113, androidx.compose.foundation.layout.ColumnScope r115, androidx.compose.runtime.Composer r116, int r117) {
        /*
            Method dump skipped, instructions count: 1767
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.business.BusinessToolsKt.ProfitDiscountCalculatorScreen$lambda$175$lambda$174$lambda$173(double, double, double, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }
}
