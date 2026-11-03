package com.example.ui.screens;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import androidx.webkit.internal.AssetHelper;
import com.example.ads.AdManager;
import com.example.model.ToolCategory;
import com.example.model.ToolItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: HomeScreen.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\u001a!\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0005\u001a#\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\u000b\u001a#\u0010\f\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u0004X\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u008e\u0002"}, d2 = {"HomeScreen", "", "onSelectTool", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "FeaturedToolCard", "tool", "Lcom/example/model/ToolItem;", "onClick", "Lkotlin/Function0;", "(Lcom/example/model/ToolItem;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ToolCard", "app", "searchQuery", "isSearchVisible", "", "selectedCategory", "Lcom/example/model/ToolCategory;", "showInfoDialog", "showRatingDialog", "showPrivacyDialog", "userRating", ""}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeScreenKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FeaturedToolCard$lambda$114(ToolItem toolItem, Function0 function0, int i, Composer composer, int i2) {
        FeaturedToolCard(toolItem, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$108(Function1 function1, int i, Composer composer, int i2) {
        HomeScreen(function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ToolCard$lambda$120(ToolItem toolItem, Function0 function0, int i, Composer composer, int i2) {
        ToolCard(toolItem, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HomeScreen(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r39, androidx.compose.runtime.Composer r40, final int r41) {
        /*
            Method dump skipped, instructions count: 1413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.HomeScreenKt.HomeScreen(kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    private static final String HomeScreen$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean HomeScreen$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void HomeScreen$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final ToolCategory HomeScreen$lambda$7(MutableState<ToolCategory> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean HomeScreen$lambda$10(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void HomeScreen$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean HomeScreen$lambda$13(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void HomeScreen$lambda$14(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean HomeScreen$lambda$16(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void HomeScreen$lambda$17(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HomeScreen$navigateWithAd(Activity activity, final Function1<? super String, Unit> function1, final String toolId) {
        if (activity != null) {
            AdManager.showInterstitialIfReady$default(AdManager.INSTANCE, activity, false, new Function0() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HomeScreenKt.HomeScreen$navigateWithAd$lambda$25(Function1.this, toolId);
                }
            }, 2, null);
        } else {
            function1.invoke(toolId);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$navigateWithAd$lambda$25(Function1 $onSelectTool, String $toolId) {
        $onSelectTool.invoke($toolId);
        return Unit.INSTANCE;
    }

    private static final void HomeScreen$openPlayStoreRating(Context context) {
        String packageName = context.getPackageName();
        try {
            Intent marketIntent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName));
            context.startActivity(marketIntent);
        } catch (Exception e) {
            Intent webIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName));
            context.startActivity(webIntent);
        }
    }

    private static final void HomeScreen$shareApp(Context context) {
        String packageName = context.getPackageName();
        Intent shareIntent = new Intent("android.intent.action.SEND");
        shareIntent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        shareIntent.putExtra("android.intent.extra.SUBJECT", "OmniTools Pro - 40+ All-in-One Tools");
        shareIntent.putExtra("android.intent.extra.TEXT", "Check out OmniTools Pro! 40+ powerful all-in-one free tools for daily utility, designing, video creation, business & PDF:\nhttps://play.google.com/store/apps/details?id=" + packageName);
        context.startActivity(Intent.createChooser(shareIntent, "Share OmniTools via"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit HomeScreen$lambda$46(final androidx.compose.runtime.MutableState r41, final androidx.compose.runtime.MutableState r42, final android.content.Context r43, final androidx.compose.runtime.MutableState r44, final androidx.compose.runtime.MutableState r45, final androidx.compose.runtime.MutableState r46, androidx.compose.runtime.Composer r47, int r48) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.HomeScreenKt.HomeScreen$lambda$46(androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, android.content.Context, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$46$lambda$45$lambda$33(final MutableState $isSearchVisible$delegate, final MutableState $searchQuery$delegate, Composer $composer, int $changed) {
        int i;
        long m4160copywmQWz5c;
        Object obj;
        ComposerKt.sourceInformation($composer, "C:HomeScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-533177643, $changed, -1, "com.example.ui.screens.HomeScreen.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:169)");
            }
            if (HomeScreen$lambda$4($isSearchVisible$delegate)) {
                $composer.startReplaceGroup(-1106012320);
                ComposerKt.sourceInformation($composer, "180@7926L11,181@8020L11,179@7847L245,172@7387L20,183@8141L429,170@7267L1333");
                String HomeScreen$lambda$1 = HomeScreen$lambda$1($searchQuery$delegate);
                Modifier m704height3ABfNKs = SizeKt.m704height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6625constructorimpl(48));
                RoundedCornerShape m956RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m956RoundedCornerShape0680j_4(Dp.m6625constructorimpl(12));
                OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                long primary = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary();
                m4160copywmQWz5c = Color.m4160copywmQWz5c(r5, (r12 & 1) != 0 ? Color.m4164getAlphaimpl(r5) : 0.4f, (r12 & 2) != 0 ? Color.m4168getRedimpl(r5) : 0.0f, (r12 & 4) != 0 ? Color.m4167getGreenimpl(r5) : 0.0f, (r12 & 8) != 0 ? Color.m4165getBlueimpl(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOutline()) : 0.0f);
                TextFieldColors m2346colors0hiis_0 = outlinedTextFieldDefaults.m2346colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, primary, m4160copywmQWz5c, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer, 0, 0, 0, 0, 3072, 2147477503, 4095);
                ComposerKt.sourceInformationMarkerStart($composer, -1282600375, "CC(remember):HomeScreen.kt#9igjgp");
                Object rememberedValue = $composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    obj = new Function1() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda38
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return HomeScreenKt.HomeScreen$lambda$46$lambda$45$lambda$33$lambda$28$lambda$27(MutableState.this, (String) obj2);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                } else {
                    obj = rememberedValue;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                OutlinedTextFieldKt.OutlinedTextField(HomeScreen$lambda$1, (Function1<? super String, Unit>) obj, m704height3ABfNKs, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$HomeScreenKt.INSTANCE.getLambda$1872505473$app(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(1988470019, true, new Function2() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda39
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return HomeScreenKt.HomeScreen$lambda$46$lambda$45$lambda$33$lambda$31(MutableState.this, $isSearchVisible$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) m956RoundedCornerShape0680j_4, m2346colors0hiis_0, $composer, 817889712, 12582912, 0, 1965432);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1104633409);
                ComposerKt.sourceInformation($composer, "193@8662L1174");
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                Modifier modifier = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
                Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i2 = ((((384 << 3) & 112) << 6) & 896) | 6;
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
                Updater.m3662setimpl(m3655constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3662setimpl(m3655constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3655constructorimpl.getInserting()) {
                    i = 384;
                } else {
                    i = 384;
                    if (Intrinsics.areEqual(m3655constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        Updater.m3662setimpl(m3655constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        int i3 = (i2 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        int i4 = ((i >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, 1267127796, "C198@8982L11,194@8748L287,200@9068L28,202@9196L11,201@9129L677:HomeScreen.kt#2thlc2");
                        TextKt.m2696Text4IGK_g("OmniTools", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131026);
                        SpacerKt.Spacer(SizeKt.m723width3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(6)), $composer, 6);
                        SurfaceKt.m2546SurfaceT9BRK9s(null, RoundedCornerShapeKt.m956RoundedCornerShape0680j_4(Dp.m6625constructorimpl(6)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer(), 0L, 0.0f, 0.0f, null, ComposableSingletons$HomeScreenKt.INSTANCE.m6998getLambda$1220728046$app(), $composer, 12582912, 121);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endReplaceGroup();
                    }
                }
                m3655constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3655constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m3662setimpl(m3655constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i32 = (i2 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                int i42 = ((i >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 1267127796, "C198@8982L11,194@8748L287,200@9068L28,202@9196L11,201@9129L677:HomeScreen.kt#2thlc2");
                TextKt.m2696Text4IGK_g("OmniTools", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131026);
                SpacerKt.Spacer(SizeKt.m723width3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(6)), $composer, 6);
                SurfaceKt.m2546SurfaceT9BRK9s(null, RoundedCornerShapeKt.m956RoundedCornerShape0680j_4(Dp.m6625constructorimpl(6)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer(), 0L, 0.0f, 0.0f, null, ComposableSingletons$HomeScreenKt.INSTANCE.m6998getLambda$1220728046$app(), $composer, 12582912, 121);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$46$lambda$45$lambda$33$lambda$28$lambda$27(MutableState $searchQuery$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $searchQuery$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$46$lambda$45$lambda$33$lambda$31(final MutableState $searchQuery$delegate, final MutableState $isSearchVisible$delegate, Composer $composer, int $changed) {
        Object obj;
        ComposerKt.sourceInformation($composer, "C184@8200L160,184@8179L357:HomeScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1988470019, $changed, -1, "com.example.ui.screens.HomeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:184)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -340756413, "CC(remember):HomeScreen.kt#9igjgp");
            Object rememberedValue = $composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeScreenKt.HomeScreen$lambda$46$lambda$45$lambda$33$lambda$31$lambda$30$lambda$29(MutableState.this, $isSearchVisible$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) obj, null, false, null, null, ComposableSingletons$HomeScreenKt.INSTANCE.m7003getLambda$1494162592$app(), $composer, 196614, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$46$lambda$45$lambda$33$lambda$31$lambda$30$lambda$29(MutableState $searchQuery$delegate, MutableState $isSearchVisible$delegate) {
        $searchQuery$delegate.setValue("");
        HomeScreen$lambda$5($isSearchVisible$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$46$lambda$45$lambda$44(final Context $context, final MutableState $isSearchVisible$delegate, final MutableState $showRatingDialog$delegate, final MutableState $showPrivacyDialog$delegate, final MutableState $showInfoDialog$delegate, RowScope TopAppBar, Composer $composer, int $changed) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C:HomeScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1164616074, $changed, -1, "com.example.ui.screens.HomeScreen.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:217)");
            }
            if (HomeScreen$lambda$4($isSearchVisible$delegate)) {
                $composer.startReplaceGroup(321805784);
            } else {
                $composer.startReplaceGroup(331726280);
                ComposerKt.sourceInformation($composer, "218@10015L26,218@9994L175,221@10219L14,221@10198L201,224@10449L27,224@10428L196,227@10674L28,227@10653L223,230@10926L25,230@10905L169");
                ComposerKt.sourceInformationMarkerStart($composer, -1790413948, "CC(remember):HomeScreen.kt#9igjgp");
                Object rememberedValue = $composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    obj = new Function0() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeScreenKt.HomeScreen$lambda$46$lambda$45$lambda$44$lambda$35$lambda$34(MutableState.this);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                } else {
                    obj = rememberedValue;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) obj, null, false, null, null, ComposableSingletons$HomeScreenKt.INSTANCE.getLambda$1374619010$app(), $composer, 196614, 30);
                ComposerKt.sourceInformationMarkerStart($composer, -1790407432, "CC(remember):HomeScreen.kt#9igjgp");
                boolean changedInstance = $composer.changedInstance($context);
                Object rememberedValue2 = $composer.rememberedValue();
                if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    obj2 = new Function0() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeScreenKt.HomeScreen$lambda$46$lambda$45$lambda$44$lambda$37$lambda$36($context);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                } else {
                    obj2 = rememberedValue2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) obj2, null, false, null, null, ComposableSingletons$HomeScreenKt.INSTANCE.m6999getLambda$1255676231$app(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                ComposerKt.sourceInformationMarkerStart($composer, -1790400059, "CC(remember):HomeScreen.kt#9igjgp");
                Object rememberedValue3 = $composer.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    obj3 = new Function0() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeScreenKt.HomeScreen$lambda$46$lambda$45$lambda$44$lambda$39$lambda$38(MutableState.this);
                        }
                    };
                    $composer.updateRememberedValue(obj3);
                } else {
                    obj3 = rememberedValue3;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) obj3, null, false, null, null, ComposableSingletons$HomeScreenKt.INSTANCE.m6992getLambda$1086424646$app(), $composer, 196614, 30);
                ComposerKt.sourceInformationMarkerStart($composer, -1790392858, "CC(remember):HomeScreen.kt#9igjgp");
                Object rememberedValue4 = $composer.rememberedValue();
                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    obj4 = new Function0() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeScreenKt.HomeScreen$lambda$46$lambda$45$lambda$44$lambda$41$lambda$40(MutableState.this);
                        }
                    };
                    $composer.updateRememberedValue(obj4);
                } else {
                    obj4 = rememberedValue4;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) obj4, null, false, null, null, ComposableSingletons$HomeScreenKt.INSTANCE.m7012getLambda$917173061$app(), $composer, 196614, 30);
                ComposerKt.sourceInformationMarkerStart($composer, -1790384797, "CC(remember):HomeScreen.kt#9igjgp");
                Object rememberedValue5 = $composer.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    obj5 = new Function0() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeScreenKt.HomeScreen$lambda$46$lambda$45$lambda$44$lambda$43$lambda$42(MutableState.this);
                        }
                    };
                    $composer.updateRememberedValue(obj5);
                } else {
                    obj5 = rememberedValue5;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) obj5, null, false, null, null, ComposableSingletons$HomeScreenKt.INSTANCE.m7011getLambda$747921476$app(), $composer, 196614, 30);
            }
            $composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$46$lambda$45$lambda$44$lambda$35$lambda$34(MutableState $isSearchVisible$delegate) {
        HomeScreen$lambda$5($isSearchVisible$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$46$lambda$45$lambda$44$lambda$37$lambda$36(Context $context) {
        HomeScreen$shareApp($context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$46$lambda$45$lambda$44$lambda$39$lambda$38(MutableState $showRatingDialog$delegate) {
        HomeScreen$lambda$14($showRatingDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$46$lambda$45$lambda$44$lambda$41$lambda$40(MutableState $showPrivacyDialog$delegate) {
        HomeScreen$lambda$17($showPrivacyDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$46$lambda$45$lambda$44$lambda$43$lambda$42(MutableState $showInfoDialog$delegate) {
        HomeScreen$lambda$11($showInfoDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$83(final List $featuredTools, final Activity $activity, final Function1 $onSelectTool, final List $filteredTools, final Context $context, final MutableState $searchQuery$delegate, final MutableState $selectedCategory$delegate, PaddingValues padding, Composer $composer, int $changed) {
        Object obj;
        Intrinsics.checkNotNullParameter(padding, "padding");
        ComposerKt.sourceInformation($composer, "C249@11648L15344,243@11406L15586:HomeScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(padding) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 19) == 18 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1825700178, $dirty2, -1, "com.example.ui.screens.HomeScreen.<anonymous> (HomeScreen.kt:243)");
            }
            Modifier padding2 = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), padding);
            PaddingValues m670PaddingValuesa9UjIt4$default = PaddingKt.m670PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6625constructorimpl(32), 7, null);
            Arrangement.HorizontalOrVertical m553spacedBy0680j_4 = Arrangement.INSTANCE.m553spacedBy0680j_4(Dp.m6625constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer, 2143776766, "CC(remember):HomeScreen.kt#9igjgp");
            boolean changedInstance = $composer.changedInstance($featuredTools) | $composer.changedInstance($activity) | $composer.changed($onSelectTool) | $composer.changedInstance($filteredTools) | $composer.changedInstance($context);
            Object rememberedValue = $composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function1() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return HomeScreenKt.HomeScreen$lambda$83$lambda$82$lambda$81($filteredTools, $searchQuery$delegate, $selectedCategory$delegate, $featuredTools, $activity, $onSelectTool, $context, (LazyListScope) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            LazyDslKt.LazyColumn(padding2, null, m670PaddingValuesa9UjIt4$default, false, m553spacedBy0680j_4, null, null, false, (Function1) obj, $composer, 24960, 234);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$83$lambda$82$lambda$81(final List $filteredTools, final MutableState $searchQuery$delegate, final MutableState $selectedCategory$delegate, final List $featuredTools, final Activity $activity, final Function1 $onSelectTool, final Context $context, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        if (StringsKt.isBlank(HomeScreen$lambda$1($searchQuery$delegate)) && HomeScreen$lambda$7($selectedCategory$delegate) == ToolCategory.ALL) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$HomeScreenKt.INSTANCE.getLambda$1673063711$app(), 3, null);
        }
        if (StringsKt.isBlank(HomeScreen$lambda$1($searchQuery$delegate)) && HomeScreen$lambda$7($selectedCategory$delegate) == ToolCategory.ALL) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-161443832, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda41
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return HomeScreenKt.HomeScreen$lambda$83$lambda$82$lambda$81$lambda$54($featuredTools, $activity, $onSelectTool, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-651676518, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HomeScreenKt.HomeScreen$lambda$83$lambda$82$lambda$81$lambda$63(MutableState.this, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-853809981, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda43
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HomeScreenKt.HomeScreen$lambda$83$lambda$82$lambda$81$lambda$65($filteredTools, $searchQuery$delegate, $selectedCategory$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        final List chunked = CollectionsKt.chunked($filteredTools, 2);
        final Function1 function1 = new Function1() { // from class: com.example.ui.screens.HomeScreenKt$HomeScreen$lambda$83$lambda$82$lambda$81$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((List<? extends ToolItem>) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(List<? extends ToolItem> list) {
                return null;
            }
        };
        LazyColumn.items(chunked.size(), null, new Function1<Integer, Object>() { // from class: com.example.ui.screens.HomeScreenKt$HomeScreen$lambda$83$lambda$82$lambda$81$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return Function1.this.invoke(chunked.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.HomeScreenKt$HomeScreen$lambda$83$lambda$82$lambda$81$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:38:0x01bd  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x0383  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x03cf  */
            /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:71:0x03a5  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke(androidx.compose.foundation.lazy.LazyItemScope r69, int r70, androidx.compose.runtime.Composer r71, int r72) {
                /*
                    Method dump skipped, instructions count: 979
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.HomeScreenKt$HomeScreen$lambda$83$lambda$82$lambda$81$$inlined$items$default$4.invoke(androidx.compose.foundation.lazy.LazyItemScope, int, androidx.compose.runtime.Composer, int):void");
            }
        }));
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1090427806, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda44
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HomeScreenKt.HomeScreen$lambda$83$lambda$82$lambda$81$lambda$75($context, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1327045631, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda45
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HomeScreenKt.HomeScreen$lambda$83$lambda$82$lambda$81$lambda$80($context, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit HomeScreen$lambda$83$lambda$82$lambda$81$lambda$54(final java.util.List r111, final android.app.Activity r112, final kotlin.jvm.functions.Function1 r113, androidx.compose.foundation.lazy.LazyItemScope r114, androidx.compose.runtime.Composer r115, int r116) {
        /*
            Method dump skipped, instructions count: 1341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.HomeScreenKt.HomeScreen$lambda$83$lambda$82$lambda$81$lambda$54(java.util.List, android.app.Activity, kotlin.jvm.functions.Function1, androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$83$lambda$82$lambda$81$lambda$54$lambda$53$lambda$52$lambda$51(final List $featuredTools, final Activity $activity, final Function1 $onSelectTool, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        final Function1 function1 = new Function1() { // from class: com.example.ui.screens.HomeScreenKt$HomeScreen$lambda$83$lambda$82$lambda$81$lambda$54$lambda$53$lambda$52$lambda$51$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((ToolItem) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(ToolItem toolItem) {
                return null;
            }
        };
        LazyRow.items($featuredTools.size(), null, new Function1<Integer, Object>() { // from class: com.example.ui.screens.HomeScreenKt$HomeScreen$lambda$83$lambda$82$lambda$81$lambda$54$lambda$53$lambda$52$lambda$51$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return Function1.this.invoke($featuredTools.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.HomeScreenKt$HomeScreen$lambda$83$lambda$82$lambda$81$lambda$54$lambda$53$lambda$52$lambda$51$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                Object obj;
                ComposerKt.sourceInformation($composer, "C152@7074L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if (($dirty & 147) == 146 && $composer.getSkipping()) {
                    $composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                int i = $dirty & 14;
                final ToolItem toolItem = (ToolItem) $featuredTools.get(it);
                $composer.startReplaceGroup(2012778830);
                ComposerKt.sourceInformation($composer, "C*338@16634L27,338@16594L68:HomeScreen.kt#2thlc2");
                ComposerKt.sourceInformationMarkerStart($composer, -212165076, "CC(remember):HomeScreen.kt#9igjgp");
                boolean changedInstance = ((((i & 112) ^ 48) > 32 && $composer.changed(toolItem)) || (i & 48) == 32) | $composer.changedInstance($activity) | $composer.changed($onSelectTool);
                Object rememberedValue = $composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Activity activity = $activity;
                    final Function1 function12 = $onSelectTool;
                    obj = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.HomeScreenKt$HomeScreen$2$1$1$1$1$2$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            HomeScreenKt.HomeScreen$navigateWithAd(activity, function12, ToolItem.this.getId());
                        }
                    };
                    $composer.updateRememberedValue(obj);
                } else {
                    obj = rememberedValue;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                HomeScreenKt.FeaturedToolCard(toolItem, (Function0) obj, $composer, (i >> 3) & 14);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit HomeScreen$lambda$83$lambda$82$lambda$81$lambda$63(final androidx.compose.runtime.MutableState r76, androidx.compose.foundation.lazy.LazyItemScope r77, androidx.compose.runtime.Composer r78, int r79) {
        /*
            Method dump skipped, instructions count: 1214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.HomeScreenKt.HomeScreen$lambda$83$lambda$82$lambda$81$lambda$63(androidx.compose.runtime.MutableState, androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$83$lambda$82$lambda$81$lambda$63$lambda$62$lambda$61$lambda$60$lambda$57$lambda$56(ToolCategory $cat, MutableState $selectedCategory$delegate) {
        $selectedCategory$delegate.setValue($cat);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit HomeScreen$lambda$83$lambda$82$lambda$81$lambda$63$lambda$62$lambda$61$lambda$60$lambda$59(boolean r52, com.example.model.ToolCategory r53, int r54, androidx.compose.runtime.Composer r55, int r56) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.HomeScreenKt.HomeScreen$lambda$83$lambda$82$lambda$81$lambda$63$lambda$62$lambda$61$lambda$60$lambda$59(boolean, com.example.model.ToolCategory, int, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$83$lambda$82$lambda$81$lambda$65(List $filteredTools, MutableState $searchQuery$delegate, MutableState $selectedCategory$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Composer composer;
        String title;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C400@19700L808:HomeScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-853809981, $changed, -1, "com.example.ui.screens.HomeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:400)");
            }
            Modifier m675paddingVpY3zN4$default = PaddingKt.m675paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6625constructorimpl(16), 0.0f, 2, null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, m675paddingVpY3zN4$default);
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
            Updater.m3662setimpl(m3655constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3662setimpl(m3655constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3655constructorimpl.getInserting() || !Intrinsics.areEqual(m3655constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3655constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3655constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3662setimpl(m3655constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407918630, "C100@5047L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1347692182, "C407@20016L277:HomeScreen.kt#2thlc2");
            if (StringsKt.isBlank(HomeScreen$lambda$1($searchQuery$delegate))) {
                composer = $composer;
                title = HomeScreen$lambda$7($selectedCategory$delegate).getTitle();
            } else {
                composer = $composer;
                title = "Search Results (" + $filteredTools.size() + ")";
            }
            TextKt.m2696Text4IGK_g(title, (Modifier) null, 0L, TextUnitKt.getSp(17), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199680, 0, 131030);
            Composer composer2 = composer;
            if (StringsKt.isBlank(HomeScreen$lambda$1($searchQuery$delegate))) {
                composer2.startReplaceGroup(-1347379858);
                ComposerKt.sourceInformation(composer2, "414@20439L11,414@20367L101");
                TextKt.m2696Text4IGK_g(HomeScreen$lambda$7($selectedCategory$delegate).getSubtitle(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
            } else {
                composer2.startReplaceGroup(-1367563741);
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
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
    public static final Unit HomeScreen$lambda$83$lambda$82$lambda$81$lambda$75(final Context $context, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C445@21651L40,447@21806L38,448@21863L2033,440@21397L2499:HomeScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1090427806, $changed, -1, "com.example.ui.screens.HomeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:440)");
            }
            CardKt.Card(PaddingKt.m674paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6625constructorimpl(16), Dp.m6625constructorimpl(6)), RoundedCornerShapeKt.m956RoundedCornerShape0680j_4(Dp.m6625constructorimpl(18)), CardDefaults.INSTANCE.m1832cardColorsro_MJ88(Color.INSTANCE.m4199getWhite0d7_KjU(), 0L, 0L, 0L, $composer, (CardDefaults.$stable << 12) | 6, 14), CardDefaults.INSTANCE.m1833cardElevationaqJV_2Y(Dp.m6625constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), BorderStrokeKt.m255BorderStrokecXLIe8U(Dp.m6625constructorimpl(1), ColorKt.Color(4293060848L)), ComposableLambdaKt.rememberComposableLambda(669816112, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return HomeScreenKt.HomeScreen$lambda$83$lambda$82$lambda$81$lambda$75$lambda$74($context, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 221190, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit HomeScreen$lambda$83$lambda$82$lambda$81$lambda$75$lambda$74(final android.content.Context r51, androidx.compose.foundation.layout.ColumnScope r52, androidx.compose.runtime.Composer r53, int r54) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.HomeScreenKt.HomeScreen$lambda$83$lambda$82$lambda$81$lambda$75$lambda$74(android.content.Context, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$83$lambda$82$lambda$81$lambda$75$lambda$74$lambda$73$lambda$72$lambda$71(Context $context) {
        HomeScreen$openPlayStoreRating($context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$83$lambda$82$lambda$81$lambda$80(final Context $context, LazyItemScope item, Composer $composer, int $changed) {
        long m4160copywmQWz5c;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C495@24327L11,495@24285L62,496@24413L11,497@24471L2497,490@24031L2937:HomeScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1327045631, $changed, -1, "com.example.ui.screens.HomeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:490)");
            }
            Modifier m674paddingVpY3zN4 = PaddingKt.m674paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6625constructorimpl(16), Dp.m6625constructorimpl(6));
            RoundedCornerShape m956RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m956RoundedCornerShape0680j_4(Dp.m6625constructorimpl(20));
            CardColors m1832cardColorsro_MJ88 = CardDefaults.INSTANCE.m1832cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14);
            float m6625constructorimpl = Dp.m6625constructorimpl((float) 1.5d);
            m4160copywmQWz5c = Color.m4160copywmQWz5c(r17, (r12 & 1) != 0 ? Color.m4164getAlphaimpl(r17) : 0.4f, (r12 & 2) != 0 ? Color.m4168getRedimpl(r17) : 0.0f, (r12 & 4) != 0 ? Color.m4167getGreenimpl(r17) : 0.0f, (r12 & 8) != 0 ? Color.m4165getBlueimpl(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary()) : 0.0f);
            CardKt.Card(m674paddingVpY3zN4, m956RoundedCornerShape0680j_4, m1832cardColorsro_MJ88, null, BorderStrokeKt.m255BorderStrokecXLIe8U(m6625constructorimpl, m4160copywmQWz5c), ComposableLambdaKt.rememberComposableLambda(433198287, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return HomeScreenKt.HomeScreen$lambda$83$lambda$82$lambda$81$lambda$80$lambda$79($context, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit HomeScreen$lambda$83$lambda$82$lambda$81$lambda$80$lambda$79(final android.content.Context r52, androidx.compose.foundation.layout.ColumnScope r53, androidx.compose.runtime.Composer r54, int r55) {
        /*
            Method dump skipped, instructions count: 723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.HomeScreenKt.HomeScreen$lambda$83$lambda$82$lambda$81$lambda$80$lambda$79(android.content.Context, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$83$lambda$82$lambda$81$lambda$80$lambda$79$lambda$78$lambda$77$lambda$76(Context $context) {
        HomeScreen$shareApp($context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$85$lambda$84(MutableState $showRatingDialog$delegate) {
        HomeScreen$lambda$14($showRatingDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$88(final Context $context, final MutableState $showRatingDialog$delegate, Composer $composer, int $changed) {
        Object obj;
        ComposerKt.sourceInformation($composer, "C595@29136L11,595@29092L64,591@28928L118,590@28890L592:HomeScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(150488242, $changed, -1, "com.example.ui.screens.HomeScreen.<anonymous> (HomeScreen.kt:590)");
            }
            ButtonColors m1812buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1812buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), 0L, 0L, 0L, $composer, ButtonDefaults.$stable << 12, 14);
            RoundedCornerShape m956RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m956RoundedCornerShape0680j_4(Dp.m6625constructorimpl(10));
            ComposerKt.sourceInformationMarkerStart($composer, -1409685592, "CC(remember):HomeScreen.kt#9igjgp");
            boolean changedInstance = $composer.changedInstance($context);
            Object rememberedValue = $composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda40
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeScreenKt.HomeScreen$lambda$88$lambda$87$lambda$86(MutableState.this, $context);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) obj, null, false, m956RoundedCornerShape0680j_4, m1812buttonColorsro_MJ88, null, null, null, null, ComposableSingletons$HomeScreenKt.INSTANCE.getLambda$722561730$app(), $composer, 805306368, 486);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$88$lambda$87$lambda$86(MutableState $showRatingDialog$delegate, Context $context) {
        HomeScreen$lambda$14($showRatingDialog$delegate, false);
        HomeScreen$openPlayStoreRating($context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$91(final MutableState $showRatingDialog$delegate, Composer $composer, int $changed) {
        Object obj;
        ComposerKt.sourceInformation($composer, "C604@29565L28,604@29544L110:HomeScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1539782256, $changed, -1, "com.example.ui.screens.HomeScreen.<anonymous> (HomeScreen.kt:604)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -2032967828, "CC(remember):HomeScreen.kt#9igjgp");
            Object rememberedValue = $composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeScreenKt.HomeScreen$lambda$91$lambda$90$lambda$89(MutableState.this);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) obj, null, false, null, null, null, null, null, null, ComposableSingletons$HomeScreenKt.INSTANCE.m6993getLambda$1106425773$app(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$91$lambda$90$lambda$89(MutableState $showRatingDialog$delegate) {
        HomeScreen$lambda$14($showRatingDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$93$lambda$92(MutableState $showInfoDialog$delegate) {
        HomeScreen$lambda$11($showInfoDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0229  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit HomeScreen$lambda$102(final android.content.Context r53, final androidx.compose.runtime.MutableState r54, final androidx.compose.runtime.MutableState r55, androidx.compose.runtime.Composer r56, int r57) {
        /*
            Method dump skipped, instructions count: 775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.HomeScreenKt.HomeScreen$lambda$102(android.content.Context, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$102$lambda$101$lambda$98$lambda$97(MutableState $showInfoDialog$delegate, Context $context) {
        HomeScreen$lambda$11($showInfoDialog$delegate, false);
        HomeScreen$shareApp($context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$102$lambda$101$lambda$100$lambda$99(MutableState $showInfoDialog$delegate, MutableState $showPrivacyDialog$delegate) {
        HomeScreen$lambda$11($showInfoDialog$delegate, false);
        HomeScreen$lambda$17($showPrivacyDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$96(final MutableState $showInfoDialog$delegate, Composer $composer, int $changed) {
        Object obj;
        ComposerKt.sourceInformation($composer, "C659@32338L26,659@32317L102:HomeScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-780605207, $changed, -1, "com.example.ui.screens.HomeScreen.<anonymous> (HomeScreen.kt:659)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1457674147, "CC(remember):HomeScreen.kt#9igjgp");
            Object rememberedValue = $composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeScreenKt.HomeScreen$lambda$96$lambda$95$lambda$94(MutableState.this);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) obj, null, false, null, null, null, null, null, null, ComposableSingletons$HomeScreenKt.INSTANCE.m6996getLambda$1165881844$app(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$96$lambda$95$lambda$94(MutableState $showInfoDialog$delegate) {
        HomeScreen$lambda$11($showInfoDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$104$lambda$103(MutableState $showPrivacyDialog$delegate) {
        HomeScreen$lambda$17($showPrivacyDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$107(final MutableState $showPrivacyDialog$delegate, Composer $composer, int $changed) {
        Object obj;
        ComposerKt.sourceInformation($composer, "C691@34348L29,691@34327L105:HomeScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-767072406, $changed, -1, "com.example.ui.screens.HomeScreen.<anonymous> (HomeScreen.kt:691)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1577794023, "CC(remember):HomeScreen.kt#9igjgp");
            Object rememberedValue = $composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeScreenKt.HomeScreen$lambda$107$lambda$106$lambda$105(MutableState.this);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) obj, null, false, null, null, null, null, null, null, ComposableSingletons$HomeScreenKt.INSTANCE.m6994getLambda$1152349043$app(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$107$lambda$106$lambda$105(MutableState $showPrivacyDialog$delegate) {
        HomeScreen$lambda$17($showPrivacyDialog$delegate, false);
        return Unit.INSTANCE;
    }

    public static final void FeaturedToolCard(final ToolItem tool, final Function0<Unit> onClick, Composer $composer, final int $changed) {
        long m4160copywmQWz5c;
        Composer $composer2;
        Intrinsics.checkNotNullParameter(tool, "tool");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer $composer3 = $composer.startRestartGroup(585059534);
        ComposerKt.sourceInformation($composer3, "C(FeaturedToolCard)P(1)709@34729L40,710@34804L65,712@34951L2273,704@34552L2672:HomeScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(tool) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onClick) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 19) == 18 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(585059534, $dirty2, -1, "com.example.ui.screens.FeaturedToolCard (HomeScreen.kt:703)");
            }
            Modifier m261clickableXHw0xAI$default = ClickableKt.m261clickableXHw0xAI$default(SizeKt.m723width3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(225)), false, null, null, onClick, 7, null);
            RoundedCornerShape m956RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m956RoundedCornerShape0680j_4(Dp.m6625constructorimpl(18));
            CardColors m1832cardColorsro_MJ88 = CardDefaults.INSTANCE.m1832cardColorsro_MJ88(Color.INSTANCE.m4199getWhite0d7_KjU(), 0L, 0L, 0L, $composer3, (CardDefaults.$stable << 12) | 6, 14);
            CardElevation m1833cardElevationaqJV_2Y = CardDefaults.INSTANCE.m1833cardElevationaqJV_2Y(Dp.m6625constructorimpl((float) 2.5d), Dp.m6625constructorimpl(6), 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 54, 60);
            float m6625constructorimpl = Dp.m6625constructorimpl(1);
            m4160copywmQWz5c = Color.m4160copywmQWz5c(r16, (r12 & 1) != 0 ? Color.m4164getAlphaimpl(r16) : 0.8f, (r12 & 2) != 0 ? Color.m4168getRedimpl(r16) : 0.0f, (r12 & 4) != 0 ? Color.m4167getGreenimpl(r16) : 0.0f, (r12 & 8) != 0 ? Color.m4165getBlueimpl(ColorKt.Color(4293060848L)) : 0.0f);
            CardKt.Card(m261clickableXHw0xAI$default, m956RoundedCornerShape0680j_4, m1832cardColorsro_MJ88, m1833cardElevationaqJV_2Y, BorderStrokeKt.m255BorderStrokecXLIe8U(m6625constructorimpl, m4160copywmQWz5c), ComposableLambdaKt.rememberComposableLambda(1416980380, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda36
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return HomeScreenKt.FeaturedToolCard$lambda$113(ToolItem.this, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer3, 221184, 0);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda37
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeScreenKt.FeaturedToolCard$lambda$114(ToolItem.this, onClick, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit FeaturedToolCard$lambda$113(final com.example.model.ToolItem r80, androidx.compose.foundation.layout.ColumnScope r81, androidx.compose.runtime.Composer r82, int r83) {
        /*
            Method dump skipped, instructions count: 1393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.HomeScreenKt.FeaturedToolCard$lambda$113(com.example.model.ToolItem, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FeaturedToolCard$lambda$113$lambda$112$lambda$111$lambda$110(ToolItem $tool, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C745@36359L299:HomeScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1174549689, $changed, -1, "com.example.ui.screens.FeaturedToolCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:745)");
            }
            TextKt.m2696Text4IGK_g("PRO", PaddingKt.m674paddingVpY3zN4(Modifier.INSTANCE, Dp.m6625constructorimpl(6), Dp.m6625constructorimpl(2)), $tool.getCategory().getBadgeColor(), TextUnitKt.getSp(9), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199734, 0, 131024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void ToolCard(final ToolItem tool, final Function0<Unit> onClick, Composer $composer, final int $changed) {
        long m4160copywmQWz5c;
        Composer $composer2;
        Intrinsics.checkNotNullParameter(tool, "tool");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer $composer3 = $composer.startRestartGroup(168100608);
        ComposerKt.sourceInformation($composer3, "C(ToolCard)P(1)785@37484L40,786@37559L63,788@37704L2882,780@37306L3280:HomeScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(tool) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onClick) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 19) == 18 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(168100608, $dirty2, -1, "com.example.ui.screens.ToolCard (HomeScreen.kt:779)");
            }
            Modifier m261clickableXHw0xAI$default = ClickableKt.m261clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, onClick, 7, null);
            RoundedCornerShape m956RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m956RoundedCornerShape0680j_4(Dp.m6625constructorimpl(18));
            CardColors m1832cardColorsro_MJ88 = CardDefaults.INSTANCE.m1832cardColorsro_MJ88(Color.INSTANCE.m4199getWhite0d7_KjU(), 0L, 0L, 0L, $composer3, (CardDefaults.$stable << 12) | 6, 14);
            CardElevation m1833cardElevationaqJV_2Y = CardDefaults.INSTANCE.m1833cardElevationaqJV_2Y(Dp.m6625constructorimpl(2), Dp.m6625constructorimpl(6), 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 54, 60);
            float m6625constructorimpl = Dp.m6625constructorimpl(1);
            m4160copywmQWz5c = Color.m4160copywmQWz5c(r16, (r12 & 1) != 0 ? Color.m4164getAlphaimpl(r16) : 0.8f, (r12 & 2) != 0 ? Color.m4168getRedimpl(r16) : 0.0f, (r12 & 4) != 0 ? Color.m4167getGreenimpl(r16) : 0.0f, (r12 & 8) != 0 ? Color.m4165getBlueimpl(ColorKt.Color(4293060848L)) : 0.0f);
            CardKt.Card(m261clickableXHw0xAI$default, m956RoundedCornerShape0680j_4, m1832cardColorsro_MJ88, m1833cardElevationaqJV_2Y, BorderStrokeKt.m255BorderStrokecXLIe8U(m6625constructorimpl, m4160copywmQWz5c), ComposableLambdaKt.rememberComposableLambda(30526414, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return HomeScreenKt.ToolCard$lambda$119(ToolItem.this, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer3, 221184, 0);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda32
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeScreenKt.ToolCard$lambda$120(ToolItem.this, onClick, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ToolCard$lambda$119(final com.example.model.ToolItem r78, androidx.compose.foundation.layout.ColumnScope r79, androidx.compose.runtime.Composer r80, int r81) {
        /*
            Method dump skipped, instructions count: 1473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.HomeScreenKt.ToolCard$lambda$119(com.example.model.ToolItem, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ToolCard$lambda$119$lambda$118$lambda$117(ToolItem $tool, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C855@40256L300:HomeScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1405640733, $changed, -1, "com.example.ui.screens.ToolCard.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:855)");
            }
            TextKt.m2696Text4IGK_g($tool.getCategory().getTitle(), PaddingKt.m674paddingVpY3zN4(Modifier.INSTANCE, Dp.m6625constructorimpl(5), Dp.m6625constructorimpl(2)), $tool.getCategory().getBadgeColor(), TextUnitKt.getSp(9), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199728, 0, 131024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
