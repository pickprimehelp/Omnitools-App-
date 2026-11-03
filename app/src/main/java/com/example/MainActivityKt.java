package com.example;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003²\u0006\f\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u008a\u008e\u0002"}, d2 = {"OmniToolsApp", "", "(Landroidx/compose/runtime/Composer;I)V", "app", "activeToolId", ""}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MainActivityKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OmniToolsApp$lambda$9(int i, Composer composer, int i2) {
        OmniToolsApp(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02e2, code lost:
    
        if (r4.equals("ig_caption_gen") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02ff, code lost:
    
        if (r4.equals("discount_calc") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0488, code lost:
    
        r10.startReplaceGroup(65240733);
        androidx.compose.runtime.ComposerKt.sourceInformation(r10, "83@3606L47");
        com.example.ui.tools.business.BusinessToolsKt.ProfitDiscountCalculatorScreen(r2, r10, 6);
        r10.endReplaceGroup();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0309, code lost:
    
        if (r4.equals("tax_calc") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0313, code lost:
    
        if (r4.equals("profit_margin") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x031d, code lost:
    
        if (r4.equals("format_converter") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0327, code lost:
    
        if (r4.equals("unit_converter") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0331, code lost:
    
        if (r4.equals("currency_converter") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x034e, code lost:
    
        if (r4.equals("countdown_timer") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x036b, code lost:
    
        if (r4.equals("text_to_pdf") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0375, code lost:
    
        if (r4.equals("percentage_calc") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x037f, code lost:
    
        if (r4.equals("date_diff_calc") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0432, code lost:
    
        r10.startReplaceGroup(65291154);
        androidx.compose.runtime.ComposerKt.sourceInformation(r10, "108@5182L36");
        com.example.ui.tools.daily.DailyToolsKt.AgeCalculatorScreen(r2, r10, 6);
        r10.endReplaceGroup();
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0389, code lost:
    
        if (r4.equals("blur_image") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0393, code lost:
    
        if (r4.equals("salary_calc") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03d7, code lost:
    
        if (r4.equals("word_counter") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03f4, code lost:
    
        if (r4.equals("barcode_generator") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0411, code lost:
    
        if (r4.equals("passport_photo") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x042e, code lost:
    
        if (r4.equals("age_calculator") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0468, code lost:
    
        if (r4.equals("pdf_merger") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0485, code lost:
    
        if (r4.equals("tip_calc") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x04a1, code lost:
    
        if (r4.equals("image_compressor") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0121, code lost:
    
        if (r4.equals("character_counter") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x03db, code lost:
    
        r10.startReplaceGroup(65282076);
        androidx.compose.runtime.ComposerKt.sourceInformation(r10, "103@4898L46");
        com.example.ui.tools.pdf.PdfToolsKt.WordAndCharacterCounterScreen(r2, r10, 6);
        r10.endReplaceGroup();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0165, code lost:
    
        if (r4.equals("qr_generator") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x03f8, code lost:
    
        r10.startReplaceGroup(65288308);
        androidx.compose.runtime.ComposerKt.sourceInformation(r10, "107@5093L38");
        com.example.ui.tools.daily.DailyToolsKt.QrCodeGeneratorScreen(r2, r10, 6);
        r10.endReplaceGroup();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x016f, code lost:
    
        if (r4.equals("loan_calc") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01d6, code lost:
    
        r10.startReplaceGroup(65236146);
        androidx.compose.runtime.ComposerKt.sourceInformation(r10, "82@3463L36");
        com.example.ui.tools.business.BusinessToolsKt.EmiCalculatorScreen(r2, r10, 6);
        r10.endReplaceGroup();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0179, code lost:
    
        if (r4.equals(androidx.core.app.NotificationCompat.CATEGORY_STOPWATCH) == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0352, code lost:
    
        r10.startReplaceGroup(65296022);
        androidx.compose.runtime.ComposerKt.sourceInformation(r10, "110@5334L40");
        com.example.ui.tools.daily.DailyToolsKt.StopwatchAndTimerScreen(r2, r10, 6);
        r10.endReplaceGroup();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a0, code lost:
    
        if (r4.equals("timezone_converter") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0335, code lost:
    
        r10.startReplaceGroup(65299762);
        androidx.compose.runtime.ComposerKt.sourceInformation(r10, "111@5451L36");
        com.example.ui.tools.daily.DailyToolsKt.UnitConverterScreen(r2, r10, 6);
        r10.endReplaceGroup();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01aa, code lost:
    
        if (r4.equals("yt_desc_gen") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02e6, code lost:
    
        r10.startReplaceGroup(65245264);
        androidx.compose.runtime.ComposerKt.sourceInformation(r10, "86@3747L66");
        com.example.ui.tools.creator.CreatorToolsKt.YouTubeTitleGeneratorScreen(false, r2, r10, 54, 0);
        r10.endReplaceGroup();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b4, code lost:
    
        if (r4.equals("photo_size_calc") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0415, code lost:
    
        r10.startReplaceGroup(65272759);
        androidx.compose.runtime.ComposerKt.sourceInformation(r10, "98@4607L41");
        com.example.ui.tools.image.ImageToolsKt.PassportPhotoMakerScreen(r2, r10, 6);
        r10.endReplaceGroup();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01be, code lost:
    
        if (r4.equals("cpm_rpm_calc") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x025e, code lost:
    
        r10.startReplaceGroup(65261149);
        androidx.compose.runtime.ComposerKt.sourceInformation(r10, "91@4244L47");
        com.example.ui.tools.creator.CreatorToolsKt.YouTubeRevenueCalculatorScreen(r2, r10, 6);
        r10.endReplaceGroup();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01c8, code lost:
    
        if (r4.equals("yt_title_gen") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01d2, code lost:
    
        if (r4.equals("emi_calc") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x020c, code lost:
    
        if (r4.equals("thumbnail_size") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x021a, code lost:
    
        r10.startReplaceGroup(65258076);
        androidx.compose.runtime.ComposerKt.sourceInformation(r10, "90@4148L46");
        com.example.ui.tools.creator.CreatorToolsKt.VideoFileSizeCalculatorScreen(r2, r10, 6);
        r10.endReplaceGroup();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0216, code lost:
    
        if (r4.equals("video_file_size") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0250, code lost:
    
        if (r4.equals("image_resizer") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x04a4, code lost:
    
        r10.startReplaceGroup(65269876);
        androidx.compose.runtime.ComposerKt.sourceInformation(r10, "97@4517L38");
        com.example.ui.tools.image.ImageToolsKt.ImageCompressorScreen(r2, r10, 6);
        r10.endReplaceGroup();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x025a, code lost:
    
        if (r4.equals("yt_revenue_calc") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0277, code lost:
    
        if (r4.equals("image_cropper") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0281, code lost:
    
        if (r4.equals("image_to_pdf_quick") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x046c, code lost:
    
        r10.startReplaceGroup(65279374);
        androidx.compose.runtime.ComposerKt.sourceInformation(r10, "102@4814L32");
        com.example.ui.tools.pdf.PdfToolsKt.TextToPdfScreen(r2, r10, 6);
        r10.endReplaceGroup();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OmniToolsApp(androidx.compose.runtime.Composer r10, final int r11) {
        /*
            Method dump skipped, instructions count: 1554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.MainActivityKt.OmniToolsApp(androidx.compose.runtime.Composer, int):void");
    }

    private static final String OmniToolsApp$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OmniToolsApp$lambda$4$lambda$3(MutableState $activeToolId$delegate, String toolId) {
        Intrinsics.checkNotNullParameter(toolId, "toolId");
        $activeToolId$delegate.setValue(toolId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OmniToolsApp$lambda$6$lambda$5(MutableState $activeToolId$delegate) {
        $activeToolId$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OmniToolsApp$lambda$8$lambda$7(MutableState $activeToolId$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $activeToolId$delegate.setValue(it);
        return Unit.INSTANCE;
    }
}
