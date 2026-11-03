package com.example.ui.tools.design;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.net.Uri;
import android.widget.Toast;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.PickVisualMediaRequestKt;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.VisibilityKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
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
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.example.ads.AdManager;
import com.example.util.ImageExportUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: DesignTools.kt */
@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u001b\u0010\u0007\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\t\u001a@\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010H\u0002\u001ah\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000eH\u0002\u001a\u001b\u0010#\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\t\u001a:\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u00182\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000eH\u0002\u001a\u001b\u0010+\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\t\u001aZ\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\b\u00100\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001f\u001a\u0002012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u001b\u00102\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\t\u001a8\u00103\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u00182\u0006\u00105\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u00182\u0006\u00107\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u0002082\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u001b\u00109\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\t\u001a:\u0010:\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u00182\u0006\u0010;\u001a\u00020\u00182\u0006\u0010<\u001a\u00020\u00182\u0006\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006@²\u0006\n\u0010A\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010B\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010C\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010D\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010E\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010F\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010\u0002\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\f\u0010G\u001a\u0004\u0018\u00010HX\u008a\u008e\u0002²\u0006\f\u0010I\u001a\u0004\u0018\u00010HX\u008a\u008e\u0002²\u0006\f\u0010!\u001a\u0004\u0018\u00010\u000eX\u008a\u008e\u0002²\u0006\f\u0010\"\u001a\u0004\u0018\u00010\u000eX\u008a\u008e\u0002²\u0006\n\u0010J\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010K\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010L\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010B\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010M\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0002\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\f\u0010N\u001a\u0004\u0018\u00010HX\u008a\u008e\u0002²\u0006\f\u0010*\u001a\u0004\u0018\u00010\u000eX\u008a\u008e\u0002²\u0006\n\u0010O\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010P\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010Q\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010\u001a\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010\u001b\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010A\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010B\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010\u0002\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\f\u0010R\u001a\u0004\u0018\u00010HX\u008a\u008e\u0002²\u0006\f\u00100\u001a\u0004\u0018\u00010\u000eX\u008a\u008e\u0002²\u0006\n\u0010S\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010T\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010U\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u00107\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010A\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010B\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010\u0002\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010S\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010V\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010W\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010X\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010B\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010Y\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010\u0002\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\f\u0010Z\u001a\u0004\u0018\u00010HX\u008a\u008e\u0002²\u0006\f\u0010[\u001a\u0004\u0018\u00010\u000eX\u008a\u008e\u0002"}, d2 = {"WatermarkControlBar", "", "hasWatermark", "", "onWatchAdToSaveClean", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "WeddingCardMakerScreen", "onBack", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "drawCircularBitmap", "canvas", "Landroid/graphics/Canvas;", "source", "Landroid/graphics/Bitmap;", "centerX", "", "centerY", "radius", "borderColor", "", "borderWidth", "renderWeddingCardBitmap", "bride", "", "groom", "date", "time", "venue", "rsvp", "tagline", "theme", "Lcom/example/ui/tools/design/WeddingTheme;", "brideBitmap", "groomBitmap", "StatusMakerScreen", "renderStatusBitmap", "quote", "author", "colors", "", "Landroidx/compose/ui/graphics/Color;", "bgPhotoBitmap", "InvitationCardMakerScreen", "renderInvitationBitmap", NotificationCompat.CATEGORY_EVENT, "host", "title", "celebrantBitmap", "Lcom/example/ui/tools/design/InvitationTheme;", "ReelsMakerScreen", "renderReelBitmap", "badge", "hook", "subtitle", "handle", "Lcom/example/ui/tools/design/ReelTheme;", "YouTubeThumbnailMakerScreen", "renderThumbnailBitmap", "main", "sub", "bgDesign", "Lcom/example/ui/tools/design/ThumbnailBgDesign;", "customBitmap", "app", "selectedThemeIndex", "selectedTab", "brideName", "groomName", "weddingDate", "weddingTime", "bridePhotoUri", "Landroid/net/Uri;", "groomPhotoUri", "currentQuote", "currentAuthor", "selectedGradientIndex", "fontSizeSp", "bgPhotoUri", "selectedEvent", "hostName", "eventTitle", "celebrantPhotoUri", "selectedBadge", "hookHeadline", "subtitleText", "mainHeadline", "secondaryHook", "selectedBgIndex", "showSafeZone", "customBgUri", "customBgBitmap"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DesignToolsKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$lambda$385(Function0 function0, int i, Composer composer, int i2) {
        InvitationCardMakerScreen(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ReelsMakerScreen$lambda$473(Function0 function0, int i, Composer composer, int i2) {
        ReelsMakerScreen(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusMakerScreen$lambda$255(Function0 function0, int i, Composer composer, int i2) {
        StatusMakerScreen(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WatermarkControlBar$lambda$4(boolean z, Function0 function0, int i, Composer composer, int i2) {
        WatermarkControlBar(z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$143(Function0 function0, int i, Composer composer, int i2) {
        WeddingCardMakerScreen(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeThumbnailMakerScreen$lambda$584(Function0 function0, int i, Composer composer, int i2) {
        YouTubeThumbnailMakerScreen(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void WatermarkControlBar(final boolean hasWatermark, final Function0<Unit> onWatchAdToSaveClean, Composer $composer, final int $changed) {
        long m4160copywmQWz5c;
        long Color;
        Intrinsics.checkNotNullParameter(onWatchAdToSaveClean, "onWatchAdToSaveClean");
        Composer $composer2 = $composer.startRestartGroup(-1891591461);
        ComposerKt.sourceInformation($composer2, "C(WatermarkControlBar)116@5176L152,124@5544L2192,114@5096L2640:DesignTools.kt#x08fh6");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(hasWatermark) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onWatchAdToSaveClean) ? 32 : 16;
        }
        if (($dirty & 19) == 18 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1891591461, $dirty, -1, "com.example.ui.tools.design.WatermarkControlBar (DesignTools.kt:113)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            if (hasWatermark) {
                $composer2.startReplaceGroup(-1048219031);
                ComposerKt.sourceInformation($composer2, "117@5249L11");
                m4160copywmQWz5c = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSurfaceVariant();
                $composer2.endReplaceGroup();
            } else {
                $composer2.startReplaceGroup(-1048217810);
                $composer2.endReplaceGroup();
                m4160copywmQWz5c = Color.m4160copywmQWz5c(r18, (r12 & 1) != 0 ? Color.m4164getAlphaimpl(r18) : 0.15f, (r12 & 2) != 0 ? Color.m4168getRedimpl(r18) : 0.0f, (r12 & 4) != 0 ? Color.m4167getGreenimpl(r18) : 0.0f, (r12 & 8) != 0 ? Color.m4165getBlueimpl(ColorKt.Color(4278556265L)) : 0.0f);
            }
            CardColors m1832cardColorsro_MJ88 = cardDefaults.m1832cardColorsro_MJ88(m4160copywmQWz5c, 0L, 0L, 0L, $composer2, CardDefaults.$stable << 12, 14);
            float m6625constructorimpl = Dp.m6625constructorimpl(1);
            if (!hasWatermark) {
                $composer2.startReplaceGroup(-1048212436);
                $composer2.endReplaceGroup();
                Color = ColorKt.Color(4278556265L);
            } else {
                $composer2.startReplaceGroup(-1048213203);
                ComposerKt.sourceInformation($composer2, "121@5423L11");
                Color = Color.m4160copywmQWz5c(r20, (r12 & 1) != 0 ? Color.m4164getAlphaimpl(r20) : 0.3f, (r12 & 2) != 0 ? Color.m4168getRedimpl(r20) : 0.0f, (r12 & 4) != 0 ? Color.m4167getGreenimpl(r20) : 0.0f, (r12 & 8) != 0 ? Color.m4165getBlueimpl(MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOutline()) : 0.0f);
                $composer2.endReplaceGroup();
            }
            CardKt.Card(fillMaxWidth$default, RoundedCornerShapeKt.m956RoundedCornerShape0680j_4(Dp.m6625constructorimpl(12)), m1832cardColorsro_MJ88, null, BorderStrokeKt.m255BorderStrokecXLIe8U(m6625constructorimpl, Color), ComposableLambdaKt.rememberComposableLambda(221120425, true, new Function3() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda41
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DesignToolsKt.WatermarkControlBar$lambda$3(hasWatermark, onWatchAdToSaveClean, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 196614, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda42
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DesignToolsKt.WatermarkControlBar$lambda$4(hasWatermark, onWatchAdToSaveClean, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit WatermarkControlBar$lambda$3(boolean r97, kotlin.jvm.functions.Function0 r98, androidx.compose.foundation.layout.ColumnScope r99, androidx.compose.runtime.Composer r100, int r101) {
        /*
            Method dump skipped, instructions count: 1441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.WatermarkControlBar$lambda$3(boolean, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0508  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void WeddingCardMakerScreen(final kotlin.jvm.functions.Function0<kotlin.Unit> r38, androidx.compose.runtime.Composer r39, final int r40) {
        /*
            Method dump skipped, instructions count: 1419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.WeddingCardMakerScreen(kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$6$lambda$5(Function0 $onBack) {
        $onBack.invoke();
        return Unit.INSTANCE;
    }

    private static final int WeddingCardMakerScreen$lambda$8(MutableIntState $selectedThemeIndex$delegate) {
        return $selectedThemeIndex$delegate.getIntValue();
    }

    private static final int WeddingCardMakerScreen$lambda$11(MutableIntState $selectedTab$delegate) {
        return $selectedTab$delegate.getIntValue();
    }

    private static final String WeddingCardMakerScreen$lambda$14(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String WeddingCardMakerScreen$lambda$17(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String WeddingCardMakerScreen$lambda$20(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String WeddingCardMakerScreen$lambda$23(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String WeddingCardMakerScreen$lambda$26(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String WeddingCardMakerScreen$lambda$29(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String WeddingCardMakerScreen$lambda$32(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean WeddingCardMakerScreen$lambda$35(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void WeddingCardMakerScreen$lambda$36(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final Bitmap WeddingCardMakerScreen$lambda$44(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    private static final Bitmap WeddingCardMakerScreen$lambda$47(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$50$lambda$49(Context $context, MutableState $bridePhotoUri$delegate, MutableState $brideBitmap$delegate, Uri uri) {
        if (uri != null) {
            $bridePhotoUri$delegate.setValue(uri);
            try {
                InputStream stream = $context.getContentResolver().openInputStream(uri);
                $brideBitmap$delegate.setValue(BitmapFactory.decodeStream(stream));
            } catch (Exception e) {
                Toast.makeText($context, "Error loading bride photo", 0).show();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$52$lambda$51(Context $context, MutableState $groomPhotoUri$delegate, MutableState $groomBitmap$delegate, Uri uri) {
        if (uri != null) {
            $groomPhotoUri$delegate.setValue(uri);
            try {
                InputStream stream = $context.getContentResolver().openInputStream(uri);
                $groomBitmap$delegate.setValue(BitmapFactory.decodeStream(stream));
            } catch (Exception e) {
                Toast.makeText($context, "Error loading groom photo", 0).show();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void WeddingCardMakerScreen$saveWithoutWatermarkViaAd(Activity activity, final WeddingTheme activeTheme, final Context context, final MutableState<String> mutableState, final MutableState<String> mutableState2, final MutableState<String> mutableState3, final MutableState<String> mutableState4, final MutableState<String> mutableState5, final MutableState<String> mutableState6, final MutableState<String> mutableState7, final MutableState<Bitmap> mutableState8, final MutableState<Bitmap> mutableState9, final MutableState<Boolean> mutableState10) {
        if (activity != null) {
            AdManager.INSTANCE.showRewardedAd(activity, new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda79
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DesignToolsKt.WeddingCardMakerScreen$saveWithoutWatermarkViaAd$lambda$53(WeddingTheme.this, context, mutableState, mutableState2, mutableState3, mutableState4, mutableState5, mutableState6, mutableState7, mutableState8, mutableState9, mutableState10);
                }
            }, new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda80
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DesignToolsKt.WeddingCardMakerScreen$saveWithoutWatermarkViaAd$lambda$54(MutableState.this);
                }
            });
        } else {
            Bitmap cleanBmp = renderWeddingCardBitmap(WeddingCardMakerScreen$lambda$14(mutableState), WeddingCardMakerScreen$lambda$17(mutableState2), WeddingCardMakerScreen$lambda$20(mutableState3), WeddingCardMakerScreen$lambda$23(mutableState4), WeddingCardMakerScreen$lambda$26(mutableState5), WeddingCardMakerScreen$lambda$29(mutableState6), WeddingCardMakerScreen$lambda$32(mutableState7), activeTheme, false, WeddingCardMakerScreen$lambda$44(mutableState8), WeddingCardMakerScreen$lambda$47(mutableState9));
            ImageExportUtils.INSTANCE.saveBitmapToGallery(context, cleanBmp, "WeddingCard_NoWatermark");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$saveWithoutWatermarkViaAd$lambda$53(WeddingTheme $activeTheme, Context $context, MutableState $brideName$delegate, MutableState $groomName$delegate, MutableState $weddingDate$delegate, MutableState $weddingTime$delegate, MutableState $venue$delegate, MutableState $rsvp$delegate, MutableState $tagline$delegate, MutableState $brideBitmap$delegate, MutableState $groomBitmap$delegate, MutableState $hasWatermark$delegate) {
        Bitmap cleanBmp = renderWeddingCardBitmap(WeddingCardMakerScreen$lambda$14($brideName$delegate), WeddingCardMakerScreen$lambda$17($groomName$delegate), WeddingCardMakerScreen$lambda$20($weddingDate$delegate), WeddingCardMakerScreen$lambda$23($weddingTime$delegate), WeddingCardMakerScreen$lambda$26($venue$delegate), WeddingCardMakerScreen$lambda$29($rsvp$delegate), WeddingCardMakerScreen$lambda$32($tagline$delegate), $activeTheme, false, WeddingCardMakerScreen$lambda$44($brideBitmap$delegate), WeddingCardMakerScreen$lambda$47($groomBitmap$delegate));
        ImageExportUtils.INSTANCE.saveBitmapToGallery($context, cleanBmp, "WeddingCard_NoWatermark");
        Toast.makeText($context, "Saved without watermark! Next card will require watching video ad again.", 1).show();
        WeddingCardMakerScreen$lambda$36($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$saveWithoutWatermarkViaAd$lambda$54(MutableState $hasWatermark$delegate) {
        WeddingCardMakerScreen$lambda$36($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit WeddingCardMakerScreen$lambda$66(final kotlin.jvm.functions.Function0 r41, final androidx.compose.runtime.MutableIntState r42, androidx.compose.runtime.Composer r43, int r44) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.WeddingCardMakerScreen$lambda$66(kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$66$lambda$65$lambda$55(Function0 $onBack, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C267@12513L155:DesignTools.kt#x08fh6");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(605194461, $changed, -1, "com.example.ui.tools.design.WeddingCardMakerScreen.<anonymous>.<anonymous>.<anonymous> (DesignTools.kt:267)");
            }
            IconButtonKt.IconButton($onBack, null, false, null, null, ComposableSingletons$DesignToolsKt.INSTANCE.m7070getLambda$1893831008$app(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$66$lambda$65$lambda$64(final MutableIntState $selectedTab$delegate, Composer $composer, int $changed) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        ComposerKt.sourceInformation($composer, "C277@13024L19,275@12932L364,283@13409L19,281@13317L370,289@13800L19,287@13708L361,295@14182L19,293@14090L372:DesignTools.kt#x08fh6");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-143500293, $changed, -1, "com.example.ui.tools.design.WeddingCardMakerScreen.<anonymous>.<anonymous>.<anonymous> (DesignTools.kt:275)");
            }
            boolean z = WeddingCardMakerScreen$lambda$11($selectedTab$delegate) == 0;
            ComposerKt.sourceInformationMarkerStart($composer, -464824434, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue = $composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DesignToolsKt.WeddingCardMakerScreen$lambda$66$lambda$65$lambda$64$lambda$57$lambda$56(MutableIntState.this);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TabKt.m2582TabwqdebIU(z, (Function0) obj, null, false, ComposableSingletons$DesignToolsKt.INSTANCE.m7065getLambda$1796815903$app(), ComposableSingletons$DesignToolsKt.INSTANCE.getLambda$1118366080$app(), 0L, 0L, null, $composer, 221232, 460);
            boolean z2 = WeddingCardMakerScreen$lambda$11($selectedTab$delegate) == 1;
            ComposerKt.sourceInformationMarkerStart($composer, -464812114, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue2 = $composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DesignToolsKt.WeddingCardMakerScreen$lambda$66$lambda$65$lambda$64$lambda$59$lambda$58(MutableIntState.this);
                    }
                };
                $composer.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TabKt.m2582TabwqdebIU(z2, (Function0) obj2, null, false, ComposableSingletons$DesignToolsKt.INSTANCE.getLambda$1933724248$app(), ComposableSingletons$DesignToolsKt.INSTANCE.m7053getLambda$1190034377$app(), 0L, 0L, null, $composer, 221232, 460);
            boolean z3 = WeddingCardMakerScreen$lambda$11($selectedTab$delegate) == 2;
            ComposerKt.sourceInformationMarkerStart($composer, -464799602, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue3 = $composer.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj3 = new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DesignToolsKt.WeddingCardMakerScreen$lambda$66$lambda$65$lambda$64$lambda$61$lambda$60(MutableIntState.this);
                    }
                };
                $composer.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TabKt.m2582TabwqdebIU(z3, (Function0) obj3, null, false, ComposableSingletons$DesignToolsKt.INSTANCE.m7089getLambda$808155687$app(), ComposableSingletons$DesignToolsKt.INSTANCE.getLambda$363052984$app(), 0L, 0L, null, $composer, 221232, 460);
            boolean z4 = WeddingCardMakerScreen$lambda$11($selectedTab$delegate) == 3;
            ComposerKt.sourceInformationMarkerStart($composer, -464787378, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue4 = $composer.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                obj4 = new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DesignToolsKt.WeddingCardMakerScreen$lambda$66$lambda$65$lambda$64$lambda$63$lambda$62(MutableIntState.this);
                    }
                };
                $composer.updateRememberedValue(obj4);
            } else {
                obj4 = rememberedValue4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TabKt.m2582TabwqdebIU(z4, (Function0) obj4, null, false, ComposableSingletons$DesignToolsKt.INSTANCE.getLambda$744931674$app(), ComposableSingletons$DesignToolsKt.INSTANCE.getLambda$1916140345$app(), 0L, 0L, null, $composer, 221232, 460);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$66$lambda$65$lambda$64$lambda$57$lambda$56(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$66$lambda$65$lambda$64$lambda$59$lambda$58(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$66$lambda$65$lambda$64$lambda$61$lambda$60(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$66$lambda$65$lambda$64$lambda$63$lambda$62(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0922  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x09b2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x09ce  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x09d3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x09be  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0ab4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0ac6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0b27  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0d7a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0d86  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0de5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0fbb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x106f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x10eb  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x1165  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x11e9  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x1269  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x12e9  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x1369  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x1411  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x141f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x1379  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x12f9  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x1279  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x11f9  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x1177  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x10f9  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x107d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0fc9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x1495  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0761  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit WeddingCardMakerScreen$lambda$142(final androidx.compose.runtime.MutableIntState r113, final com.example.ui.tools.design.WeddingTheme r114, final androidx.compose.runtime.MutableState r115, final androidx.compose.runtime.MutableState r116, final androidx.compose.runtime.MutableState r117, final androidx.compose.runtime.MutableState r118, final androidx.compose.runtime.MutableState r119, final androidx.compose.runtime.MutableState r120, final androidx.compose.runtime.MutableState r121, final androidx.compose.runtime.MutableState r122, final androidx.activity.compose.ManagedActivityResultLauncher r123, final androidx.activity.compose.ManagedActivityResultLauncher r124, final androidx.compose.runtime.MutableState r125, final androidx.compose.runtime.MutableState r126, final androidx.compose.runtime.MutableState r127, final androidx.compose.runtime.MutableState r128, java.util.List r129, androidx.compose.runtime.MutableIntState r130, final android.app.Activity r131, android.content.Context r132, androidx.compose.foundation.layout.PaddingValues r133, androidx.compose.runtime.Composer r134, int r135) {
        /*
            Method dump skipped, instructions count: 5288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.WeddingCardMakerScreen$lambda$142(androidx.compose.runtime.MutableIntState, com.example.ui.tools.design.WeddingTheme, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.activity.compose.ManagedActivityResultLauncher, androidx.activity.compose.ManagedActivityResultLauncher, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, java.util.List, androidx.compose.runtime.MutableIntState, android.app.Activity, android.content.Context, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$142$lambda$141$lambda$88$lambda$68$lambda$67(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit WeddingCardMakerScreen$lambda$142$lambda$141$lambda$88$lambda$71(com.example.ui.tools.design.WeddingTheme r71, androidx.compose.runtime.MutableState r72, androidx.compose.runtime.MutableState r73, androidx.compose.runtime.Composer r74, int r75) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.WeddingCardMakerScreen$lambda$142$lambda$141$lambda$88$lambda$71(com.example.ui.tools.design.WeddingTheme, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$142$lambda$141$lambda$88$lambda$73$lambda$72(MutableState $brideName$delegate, MutableState $hasWatermark$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $brideName$delegate.setValue(it);
        WeddingCardMakerScreen$lambda$36($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$142$lambda$141$lambda$88$lambda$75$lambda$74(MutableState $groomName$delegate, MutableState $hasWatermark$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $groomName$delegate.setValue(it);
        WeddingCardMakerScreen$lambda$36($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$142$lambda$141$lambda$88$lambda$77$lambda$76(MutableState $weddingDate$delegate, MutableState $hasWatermark$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $weddingDate$delegate.setValue(it);
        WeddingCardMakerScreen$lambda$36($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$142$lambda$141$lambda$88$lambda$79$lambda$78(MutableState $weddingTime$delegate, MutableState $hasWatermark$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $weddingTime$delegate.setValue(it);
        WeddingCardMakerScreen$lambda$36($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$142$lambda$141$lambda$88$lambda$81$lambda$80(MutableState $venue$delegate, MutableState $hasWatermark$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $venue$delegate.setValue(it);
        WeddingCardMakerScreen$lambda$36($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$142$lambda$141$lambda$88$lambda$83$lambda$82(MutableState $rsvp$delegate, MutableState $hasWatermark$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $rsvp$delegate.setValue(it);
        WeddingCardMakerScreen$lambda$36($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$142$lambda$141$lambda$88$lambda$85$lambda$84(MutableState $tagline$delegate, MutableState $hasWatermark$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $tagline$delegate.setValue(it);
        WeddingCardMakerScreen$lambda$36($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$142$lambda$141$lambda$88$lambda$87$lambda$86(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x05a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0435 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit WeddingCardMakerScreen$lambda$142$lambda$141$lambda$107$lambda$104(final androidx.activity.compose.ManagedActivityResultLauncher r87, final androidx.activity.compose.ManagedActivityResultLauncher r88, final androidx.compose.runtime.MutableState r89, final androidx.compose.runtime.MutableState r90, final androidx.compose.runtime.MutableState r91, final androidx.compose.runtime.MutableState r92, androidx.compose.foundation.layout.ColumnScope r93, androidx.compose.runtime.Composer r94, int r95) {
        /*
            Method dump skipped, instructions count: 1668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.WeddingCardMakerScreen$lambda$142$lambda$141$lambda$107$lambda$104(androidx.activity.compose.ManagedActivityResultLauncher, androidx.activity.compose.ManagedActivityResultLauncher, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$142$lambda$141$lambda$107$lambda$104$lambda$103$lambda$102$lambda$91$lambda$90(ManagedActivityResultLauncher $bridePicker) {
        $bridePicker.launch(PickVisualMediaRequestKt.PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE, 0, false, null, 14, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$142$lambda$141$lambda$107$lambda$104$lambda$103$lambda$102$lambda$95(final MutableState $brideBitmap$delegate, final MutableState $bridePhotoUri$delegate, ColumnScope OutlinedCard, Composer $composer, int $changed) {
        Composer composer;
        Composer composer2;
        Object obj;
        Intrinsics.checkNotNullParameter(OutlinedCard, "$this$OutlinedCard");
        ComposerKt.sourceInformation($composer, "C444@22699L3162:DesignTools.kt#x08fh6");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-462750220, $changed, -1, "com.example.ui.tools.design.WeddingCardMakerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DesignTools.kt:444)");
            }
            Modifier m673padding3ABfNKs = PaddingKt.m673padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6625constructorimpl(12));
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.Vertical m553spacedBy0680j_4 = Arrangement.INSTANCE.m553spacedBy0680j_4(Dp.m6625constructorimpl(6));
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m553spacedBy0680j_4, centerHorizontally, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, m673padding3ABfNKs);
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
            ComposerKt.sourceInformationMarkerStart($composer, 1420852787, "C:DesignTools.kt#x08fh6");
            if (WeddingCardMakerScreen$lambda$44($brideBitmap$delegate) != null) {
                $composer.startReplaceGroup(1420843796);
                ComposerKt.sourceInformation($composer, "452@23252L640,461@23941L96,463@24160L207,462@24086L622");
                Bitmap WeddingCardMakerScreen$lambda$44 = WeddingCardMakerScreen$lambda$44($brideBitmap$delegate);
                Intrinsics.checkNotNull(WeddingCardMakerScreen$lambda$44);
                ImageKt.m284Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(WeddingCardMakerScreen$lambda$44), "Bride Photo", BorderKt.m239borderxT4_qwU(ClipKt.clip(SizeKt.m718size3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(60)), RoundedCornerShapeKt.getCircleShape()), Dp.m6625constructorimpl(2), ColorKt.Color(4278556265L), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, $composer, 24624, 232);
                TextKt.m2696Text4IGK_g("Bride Added ✓", (Modifier) null, ColorKt.Color(4278556265L), TextUnitKt.getSp(11), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131026);
                ComposerKt.sourceInformationMarkerStart($composer, -785421011, "CC(remember):DesignTools.kt#9igjgp");
                Object rememberedValue = $composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    composer2 = $composer;
                    obj = new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda96
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DesignToolsKt.WeddingCardMakerScreen$lambda$142$lambda$141$lambda$107$lambda$104$lambda$103$lambda$102$lambda$95$lambda$94$lambda$93$lambda$92(MutableState.this, $bridePhotoUri$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                } else {
                    composer2 = $composer;
                    obj = rememberedValue;
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                Composer composer3 = composer2;
                ButtonKt.TextButton((Function0) obj, null, false, null, null, null, null, PaddingKt.m666PaddingValues0680j_4(Dp.m6625constructorimpl(0)), null, ComposableSingletons$DesignToolsKt.INSTANCE.getLambda$489776358$app(), composer3, 817889286, 382);
                composer3.endReplaceGroup();
                composer = composer3;
            } else {
                $composer.startReplaceGroup(1422374049);
                ComposerKt.sourceInformation($composer, "474@24966L11,472@24810L707,481@25566L67,482@25744L11,482@25682L91");
                composer = $composer;
                SurfaceKt.m2546SurfaceT9BRK9s(SizeKt.m718size3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(50)), RoundedCornerShapeKt.getCircleShape(), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer(), 0L, 0.0f, 0.0f, null, ComposableSingletons$DesignToolsKt.INSTANCE.getLambda$1301019615$app(), composer, 12582918, 120);
                TextKt.m2696Text4IGK_g("Bride Photo", (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199686, 0, 131030);
                TextKt.m2696Text4IGK_g("Tap to upload", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3078, 0, 131058);
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
    public static final Unit WeddingCardMakerScreen$lambda$142$lambda$141$lambda$107$lambda$104$lambda$103$lambda$102$lambda$95$lambda$94$lambda$93$lambda$92(MutableState $brideBitmap$delegate, MutableState $bridePhotoUri$delegate) {
        $brideBitmap$delegate.setValue(null);
        $bridePhotoUri$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$142$lambda$141$lambda$107$lambda$104$lambda$103$lambda$102$lambda$97$lambda$96(ManagedActivityResultLauncher $groomPicker) {
        $groomPicker.launch(PickVisualMediaRequestKt.PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE, 0, false, null, 14, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$142$lambda$141$lambda$107$lambda$104$lambda$103$lambda$102$lambda$101(final MutableState $groomBitmap$delegate, final MutableState $groomPhotoUri$delegate, ColumnScope OutlinedCard, Composer $composer, int $changed) {
        Composer composer;
        Composer composer2;
        Object obj;
        Intrinsics.checkNotNullParameter(OutlinedCard, "$this$OutlinedCard");
        ComposerKt.sourceInformation($composer, "C497@26706L3162:DesignTools.kt#x08fh6");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(141379165, $changed, -1, "com.example.ui.tools.design.WeddingCardMakerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DesignTools.kt:497)");
            }
            Modifier m673padding3ABfNKs = PaddingKt.m673padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6625constructorimpl(12));
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.Vertical m553spacedBy0680j_4 = Arrangement.INSTANCE.m553spacedBy0680j_4(Dp.m6625constructorimpl(6));
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m553spacedBy0680j_4, centerHorizontally, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, m673padding3ABfNKs);
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
            ComposerKt.sourceInformationMarkerStart($composer, -547148886, "C:DesignTools.kt#x08fh6");
            if (WeddingCardMakerScreen$lambda$47($groomBitmap$delegate) != null) {
                $composer.startReplaceGroup(-547157877);
                ComposerKt.sourceInformation($composer, "505@27259L640,514@27948L96,516@28167L207,515@28093L622");
                Bitmap WeddingCardMakerScreen$lambda$47 = WeddingCardMakerScreen$lambda$47($groomBitmap$delegate);
                Intrinsics.checkNotNull(WeddingCardMakerScreen$lambda$47);
                ImageKt.m284Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(WeddingCardMakerScreen$lambda$47), "Groom Photo", BorderKt.m239borderxT4_qwU(ClipKt.clip(SizeKt.m718size3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(60)), RoundedCornerShapeKt.getCircleShape()), Dp.m6625constructorimpl(2), ColorKt.Color(4278556265L), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, $composer, 24624, 232);
                TextKt.m2696Text4IGK_g("Groom Added ✓", (Modifier) null, ColorKt.Color(4278556265L), TextUnitKt.getSp(11), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131026);
                ComposerKt.sourceInformationMarkerStart($composer, 1229305046, "CC(remember):DesignTools.kt#9igjgp");
                Object rememberedValue = $composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    composer2 = $composer;
                    obj = new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda97
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DesignToolsKt.WeddingCardMakerScreen$lambda$142$lambda$141$lambda$107$lambda$104$lambda$103$lambda$102$lambda$101$lambda$100$lambda$99$lambda$98(MutableState.this, $groomPhotoUri$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                } else {
                    composer2 = $composer;
                    obj = rememberedValue;
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                Composer composer3 = composer2;
                ButtonKt.TextButton((Function0) obj, null, false, null, null, null, null, PaddingKt.m666PaddingValues0680j_4(Dp.m6625constructorimpl(0)), null, ComposableSingletons$DesignToolsKt.INSTANCE.getLambda$691386575$app(), composer3, 817889286, 382);
                composer3.endReplaceGroup();
                composer = composer3;
            } else {
                $composer.startReplaceGroup(-545627624);
                ComposerKt.sourceInformation($composer, "527@28973L11,525@28817L707,534@29573L67,535@29751L11,535@29689L91");
                composer = $composer;
                SurfaceKt.m2546SurfaceT9BRK9s(SizeKt.m718size3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(50)), RoundedCornerShapeKt.getCircleShape(), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer(), 0L, 0.0f, 0.0f, null, ComposableSingletons$DesignToolsKt.INSTANCE.m7055getLambda$1387891320$app(), composer, 12582918, 120);
                TextKt.m2696Text4IGK_g("Groom Photo", (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199686, 0, 131030);
                TextKt.m2696Text4IGK_g("Tap to upload", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3078, 0, 131058);
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
    public static final Unit WeddingCardMakerScreen$lambda$142$lambda$141$lambda$107$lambda$104$lambda$103$lambda$102$lambda$101$lambda$100$lambda$99$lambda$98(MutableState $groomBitmap$delegate, MutableState $groomPhotoUri$delegate) {
        $groomBitmap$delegate.setValue(null);
        $groomPhotoUri$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$142$lambda$141$lambda$107$lambda$106$lambda$105(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$142$lambda$141$lambda$118$lambda$115$lambda$109$lambda$108(int $index, MutableIntState $selectedThemeIndex$delegate, MutableState $hasWatermark$delegate) {
        $selectedThemeIndex$delegate.setIntValue($index);
        WeddingCardMakerScreen$lambda$36($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit WeddingCardMakerScreen$lambda$142$lambda$141$lambda$118$lambda$115$lambda$114(int r94, final com.example.ui.tools.design.WeddingTheme r95, androidx.compose.runtime.MutableIntState r96, androidx.compose.foundation.layout.ColumnScope r97, androidx.compose.runtime.Composer r98, int r99) {
        /*
            Method dump skipped, instructions count: 1307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.WeddingCardMakerScreen$lambda$142$lambda$141$lambda$118$lambda$115$lambda$114(int, com.example.ui.tools.design.WeddingTheme, androidx.compose.runtime.MutableIntState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$142$lambda$141$lambda$118$lambda$115$lambda$114$lambda$113$lambda$112(WeddingTheme $theme, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C610@34086L442:DesignTools.kt#x08fh6");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1080801122, $changed, -1, "com.example.ui.tools.design.WeddingCardMakerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DesignTools.kt:610)");
            }
            TextKt.m2696Text4IGK_g("Active ✓", PaddingKt.m674paddingVpY3zN4(Modifier.INSTANCE, Dp.m6625constructorimpl(8), Dp.m6625constructorimpl(3)), $theme.m7124getAccentColor0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199734, 0, 131024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$142$lambda$141$lambda$118$lambda$117$lambda$116(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x12a6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x1373  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x1308  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x112f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x10e8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0f05 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0ebc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x08c8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0978  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0b14  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0b20  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0b59  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0c6f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0c7b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0cb4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0d1d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0d63  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0cca A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0c81  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0b6f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0b26  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x09be  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0923 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x07c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x06a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x038c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0eaa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0eb6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0eef  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0f60  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0fae  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x1011  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x10d6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x10e2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x1119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit WeddingCardMakerScreen$lambda$142$lambda$141$lambda$140$lambda$130(com.example.ui.tools.design.WeddingTheme r169, androidx.compose.runtime.MutableState r170, androidx.compose.runtime.MutableState r171, androidx.compose.runtime.MutableState r172, androidx.compose.runtime.MutableState r173, androidx.compose.runtime.MutableState r174, androidx.compose.runtime.MutableState r175, androidx.compose.runtime.MutableState r176, androidx.compose.runtime.MutableState r177, androidx.compose.runtime.MutableState r178, androidx.compose.runtime.MutableState r179, androidx.compose.foundation.layout.ColumnScope r180, androidx.compose.runtime.Composer r181, int r182) {
        /*
            Method dump skipped, instructions count: 4985
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.WeddingCardMakerScreen$lambda$142$lambda$141$lambda$140$lambda$130(com.example.ui.tools.design.WeddingTheme, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$142$lambda$141$lambda$140$lambda$132$lambda$131(Activity $activity, WeddingTheme $activeTheme, Context $context, MutableState $brideName$delegate, MutableState $groomName$delegate, MutableState $weddingDate$delegate, MutableState $weddingTime$delegate, MutableState $venue$delegate, MutableState $rsvp$delegate, MutableState $tagline$delegate, MutableState $brideBitmap$delegate, MutableState $groomBitmap$delegate, MutableState $hasWatermark$delegate) {
        WeddingCardMakerScreen$saveWithoutWatermarkViaAd($activity, $activeTheme, $context, $brideName$delegate, $groomName$delegate, $weddingDate$delegate, $weddingTime$delegate, $venue$delegate, $rsvp$delegate, $tagline$delegate, $brideBitmap$delegate, $groomBitmap$delegate, $hasWatermark$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$142$lambda$141$lambda$140$lambda$134$lambda$133(Activity $activity, WeddingTheme $activeTheme, Context $context, MutableState $brideName$delegate, MutableState $groomName$delegate, MutableState $weddingDate$delegate, MutableState $weddingTime$delegate, MutableState $venue$delegate, MutableState $rsvp$delegate, MutableState $tagline$delegate, MutableState $brideBitmap$delegate, MutableState $groomBitmap$delegate, MutableState $hasWatermark$delegate) {
        WeddingCardMakerScreen$saveWithoutWatermarkViaAd($activity, $activeTheme, $context, $brideName$delegate, $groomName$delegate, $weddingDate$delegate, $weddingTime$delegate, $venue$delegate, $rsvp$delegate, $tagline$delegate, $brideBitmap$delegate, $groomBitmap$delegate, $hasWatermark$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$142$lambda$141$lambda$140$lambda$139$lambda$136$lambda$135(WeddingTheme $activeTheme, Context $context, MutableState $brideName$delegate, MutableState $groomName$delegate, MutableState $weddingDate$delegate, MutableState $weddingTime$delegate, MutableState $venue$delegate, MutableState $rsvp$delegate, MutableState $tagline$delegate, MutableState $brideBitmap$delegate, MutableState $groomBitmap$delegate) {
        Bitmap bmp = renderWeddingCardBitmap(WeddingCardMakerScreen$lambda$14($brideName$delegate), WeddingCardMakerScreen$lambda$17($groomName$delegate), WeddingCardMakerScreen$lambda$20($weddingDate$delegate), WeddingCardMakerScreen$lambda$23($weddingTime$delegate), WeddingCardMakerScreen$lambda$26($venue$delegate), WeddingCardMakerScreen$lambda$29($rsvp$delegate), WeddingCardMakerScreen$lambda$32($tagline$delegate), $activeTheme, true, WeddingCardMakerScreen$lambda$44($brideBitmap$delegate), WeddingCardMakerScreen$lambda$47($groomBitmap$delegate));
        ImageExportUtils.INSTANCE.saveBitmapToGallery($context, bmp, "WeddingCard_Free");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WeddingCardMakerScreen$lambda$142$lambda$141$lambda$140$lambda$139$lambda$138$lambda$137(WeddingTheme $activeTheme, Context $context, MutableState $brideName$delegate, MutableState $groomName$delegate, MutableState $weddingDate$delegate, MutableState $weddingTime$delegate, MutableState $venue$delegate, MutableState $rsvp$delegate, MutableState $tagline$delegate, MutableState $brideBitmap$delegate, MutableState $groomBitmap$delegate) {
        Bitmap bmp = renderWeddingCardBitmap(WeddingCardMakerScreen$lambda$14($brideName$delegate), WeddingCardMakerScreen$lambda$17($groomName$delegate), WeddingCardMakerScreen$lambda$20($weddingDate$delegate), WeddingCardMakerScreen$lambda$23($weddingTime$delegate), WeddingCardMakerScreen$lambda$26($venue$delegate), WeddingCardMakerScreen$lambda$29($rsvp$delegate), WeddingCardMakerScreen$lambda$32($tagline$delegate), $activeTheme, true, WeddingCardMakerScreen$lambda$44($brideBitmap$delegate), WeddingCardMakerScreen$lambda$47($groomBitmap$delegate));
        ImageExportUtils.INSTANCE.shareBitmap($context, bmp, "Wedding Invitation - " + WeddingCardMakerScreen$lambda$14($brideName$delegate) + " & " + WeddingCardMakerScreen$lambda$17($groomName$delegate));
        return Unit.INSTANCE;
    }

    private static final void drawCircularBitmap(Canvas canvas, Bitmap source, float centerX, float centerY, float radius, int borderColor, float borderWidth) {
        Bitmap output;
        Canvas tempCanvas;
        Paint paint;
        Rect srcRect;
        Rect dstRect;
        int size = (int) (2.0f * radius);
        if (size <= 0) {
            return;
        }
        try {
            output = Bitmap.createBitmap(size, size, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(output, "createBitmap(...)");
            tempCanvas = new Canvas(output);
            paint = new Paint();
            paint.setAntiAlias(true);
            tempCanvas.drawCircle(radius, radius, radius, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            int minDim = Math.min(source.getWidth(), source.getHeight());
            int srcX = (source.getWidth() - minDim) / 2;
            int srcY = (source.getHeight() - minDim) / 2;
            srcRect = new Rect(srcX, srcY, srcX + minDim, srcY + minDim);
            dstRect = new Rect(0, 0, size, size);
        } catch (Exception e) {
        }
        try {
            tempCanvas.drawBitmap(source, srcRect, dstRect, paint);
            canvas.drawBitmap(output, centerX - radius, centerY - radius, (Paint) null);
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(borderColor);
            try {
                paint2.setStrokeWidth(borderWidth);
                canvas.drawCircle(centerX, centerY, radius, paint2);
            } catch (Exception e2) {
            }
        } catch (Exception e3) {
        }
    }

    static /* synthetic */ Bitmap renderWeddingCardBitmap$default(String str, String str2, String str3, String str4, String str5, String str6, String str7, WeddingTheme weddingTheme, boolean z, Bitmap bitmap, Bitmap bitmap2, int i, Object obj) {
        if ((i & 512) != 0) {
            bitmap = null;
        }
        if ((i & 1024) != 0) {
            bitmap2 = null;
        }
        return renderWeddingCardBitmap(str, str2, str3, str4, str5, str6, str7, weddingTheme, z, bitmap, bitmap2);
    }

    private static final Bitmap renderWeddingCardBitmap(String bride, String groom, String date, String time, String venue, String rsvp, String tagline, WeddingTheme theme, boolean hasWatermark, Bitmap brideBitmap, Bitmap groomBitmap) {
        boolean z;
        float f;
        Bitmap bitmap = Bitmap.createBitmap(1080, 1440, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmap);
        Paint bgPaint = new Paint();
        bgPaint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 1440, ColorKt.m4216toArgb8_81llA(((Color) CollectionsKt.first((List) theme.getBgColors())).m4172unboximpl()), ColorKt.m4216toArgb8_81llA(((Color) CollectionsKt.last((List) theme.getBgColors())).m4172unboximpl()), Shader.TileMode.CLAMP));
        canvas.drawRect(0.0f, 0.0f, 1080, 1440, bgPaint);
        Paint paint = new Paint();
        paint.setColor(ColorKt.m4216toArgb8_81llA(theme.m7125getBorderColor0d7_KjU()));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(14.0f);
        canvas.drawRoundRect(new RectF(40.0f, 40.0f, 1080 - 40.0f, 1440 - 40.0f), 40.0f, 40.0f, paint);
        Paint paint2 = new Paint();
        paint2.setColor(ColorKt.m4216toArgb8_81llA(theme.m7125getBorderColor0d7_KjU()));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(3.0f);
        paint2.setAlpha(150);
        canvas.drawRoundRect(new RectF(70.0f, 70.0f, 1080 - 70.0f, 1440 - 70.0f), 24.0f, 24.0f, paint2);
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setColor(ColorKt.m4216toArgb8_81llA(theme.m7124getAccentColor0d7_KjU()));
        paint3.setTextSize(38.0f);
        paint3.setFakeBoldText(true);
        canvas.drawText("॥ श्री गणेशाय नमः ॥", 1080 / 2.0f, 170.0f, paint3);
        paint3.setColor(ColorKt.m4216toArgb8_81llA(theme.m7126getTextColor0d7_KjU()));
        paint3.setTextSize(28.0f);
        paint3.setFakeBoldText(false);
        canvas.drawText(tagline, 1080 / 2.0f, 240.0f, paint3);
        if (brideBitmap != null || groomBitmap != null) {
            z = true;
        } else {
            z = false;
        }
        boolean hasPhotos = z;
        if (!hasPhotos) {
            f = 240.0f;
        } else if (brideBitmap == null || groomBitmap == null) {
            f = 240.0f;
            if (brideBitmap != null) {
                drawCircularBitmap(canvas, brideBitmap, 1080 / 2.0f, 410.0f, 130.0f, ColorKt.m4216toArgb8_81llA(theme.m7125getBorderColor0d7_KjU()), 10.0f);
            } else if (groomBitmap != null) {
                drawCircularBitmap(canvas, groomBitmap, 1080 / 2.0f, 410.0f, 130.0f, ColorKt.m4216toArgb8_81llA(theme.m7125getBorderColor0d7_KjU()), 10.0f);
            }
        } else {
            f = 240.0f;
            drawCircularBitmap(canvas, brideBitmap, 1080 * 0.32f, 410.0f, 110.0f, ColorKt.m4216toArgb8_81llA(theme.m7125getBorderColor0d7_KjU()), 8.0f);
            drawCircularBitmap(canvas, groomBitmap, 0.68f * 1080, 410.0f, 110.0f, ColorKt.m4216toArgb8_81llA(theme.m7125getBorderColor0d7_KjU()), 8.0f);
            Paint heartPaint = new Paint();
            heartPaint.setAntiAlias(true);
            heartPaint.setTextAlign(Paint.Align.CENTER);
            heartPaint.setTextSize(50.0f);
            heartPaint.setColor(ColorKt.m4216toArgb8_81llA(theme.m7124getAccentColor0d7_KjU()));
            canvas.drawText("❤", 1080 / 2.0f, 18.0f + 410.0f, heartPaint);
        }
        float namesStartY = hasPhotos ? 630.0f : 540.0f;
        paint3.setTextSize(hasPhotos ? 64.0f : 72.0f);
        paint3.setFakeBoldText(true);
        paint3.setColor(ColorKt.m4216toArgb8_81llA(theme.m7126getTextColor0d7_KjU()));
        canvas.drawText(bride, 1080 / 2.0f, namesStartY, paint3);
        paint3.setTextSize(hasPhotos ? 48.0f : 54.0f);
        paint3.setColor(ColorKt.m4216toArgb8_81llA(theme.m7124getAccentColor0d7_KjU()));
        canvas.drawText("&", 1080 / 2.0f, namesStartY + 80.0f, paint3);
        paint3.setTextSize(hasPhotos ? 64.0f : 72.0f);
        paint3.setColor(ColorKt.m4216toArgb8_81llA(theme.m7126getTextColor0d7_KjU()));
        canvas.drawText(groom, 1080 / 2.0f, 160.0f + namesStartY, paint3);
        float dateStartY = hasPhotos ? 980.0f : 960.0f;
        paint3.setTextSize(38.0f);
        paint3.setColor(ColorKt.m4216toArgb8_81llA(theme.m7124getAccentColor0d7_KjU()));
        canvas.drawText("🗓  " + date, 1080 / 2.0f, dateStartY, paint3);
        paint3.setTextSize(34.0f);
        paint3.setColor(ColorKt.m4216toArgb8_81llA(theme.m7126getTextColor0d7_KjU()));
        canvas.drawText("⏰  " + time, 1080 / 2.0f, dateStartY + 65.0f, paint3);
        paint3.setTextSize(32.0f);
        canvas.drawText("📍  " + venue, 1080 / 2.0f, dateStartY + 165.0f, paint3);
        paint3.setTextSize(30.0f);
        paint3.setColor(ColorKt.m4216toArgb8_81llA(theme.m7124getAccentColor0d7_KjU()));
        canvas.drawText("RSVP: " + rsvp, 1080 / 2.0f, dateStartY + 270.0f, paint3);
        if (hasWatermark) {
            Paint paint4 = new Paint();
            paint4.setColor(android.graphics.Color.argb(160, 0, 0, 0));
            Paint paint5 = new Paint();
            paint5.setColor(-1);
            paint5.setTextSize(28.0f);
            paint5.setFakeBoldText(true);
            paint5.setTextAlign(Paint.Align.CENTER);
            paint5.setAntiAlias(true);
            canvas.drawRoundRect(new RectF((1080 / 2.0f) - f, 1440 - 80.0f, (1080 / 2.0f) + f, 1440 - 30.0f), 16.0f, 16.0f, paint4);
            canvas.drawText("⚡ Created with OmniTools App", 1080 / 2.0f, 1440 - 44.0f, paint5);
        }
        return bitmap;
    }

    public static final void StatusMakerScreen(final Function0<Unit> onBack, Composer $composer, final int $changed) {
        Object obj;
        Object obj2;
        int i;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        MutableState currentAuthor$delegate;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer $composer2 = $composer.startRestartGroup(-1835698637);
        ComposerKt.sourceInformation($composer2, "C(StatusMakerScreen)1026@56067L12,1026@56055L24,1027@56111L7,1039@56743L50,1040@56819L51,1041@56904L33,1042@56961L33,1043@57017L37,1044@57079L33,1047@57174L39,1048@57239L42,1049@57387L427,1049@57310L504,1089@59254L2168,1129@61429L28263,1088@59227L30465:DesignTools.kt#x08fh6");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(onBack) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1835698637, $dirty, -1, "com.example.ui.tools.design.StatusMakerScreen (DesignTools.kt:1025)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 1125172095, "CC(remember):DesignTools.kt#9igjgp");
            boolean z = ($dirty & 14) == 4;
            Object rememberedValue = $composer2.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda119
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DesignToolsKt.StatusMakerScreen$lambda$154$lambda$153(Function0.this);
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
            final Activity activity = context instanceof Activity ? (Activity) context : null;
            final List quotePresets = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("\"The secret of getting ahead is getting started.\"", "Mark Twain"), TuplesKt.to("\"जिंदगी आसान नहीं होती, इसे आसान बनाना पड़ता है। कुछ अंदाज से, कुछ नजरअंदाज से।\"", "Life Motivation"), TuplesKt.to("\"Your time is limited, so don't waste it living someone else's life.\"", "Steve Jobs"), TuplesKt.to("\"मेहनत इतनी खामोशी से करो कि सफलता शोर मचा दे।\"", "Success Mantra"), TuplesKt.to("\"Believe in yourself and you will be unstoppable.\"", "Daily Spark"), TuplesKt.to("\"Dream big, work hard, stay humble.\"", "Inspiration")});
            ComposerKt.sourceInformationMarkerStart($composer2, 1125193765, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue2 = $composer2.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(((Pair) quotePresets.get(0)).getFirst(), null, 2, null);
                $composer2.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            final MutableState currentQuote$delegate = (MutableState) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1125196198, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue3 = $composer2.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                i = 0;
                obj3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(((Pair) quotePresets.get(0)).getSecond(), null, 2, null);
                $composer2.updateRememberedValue(obj3);
            } else {
                i = 0;
                obj3 = rememberedValue3;
            }
            MutableState currentAuthor$delegate2 = (MutableState) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1125198900, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue4 = $composer2.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                obj4 = SnapshotIntStateKt.mutableIntStateOf(i);
                $composer2.updateRememberedValue(obj4);
            } else {
                obj4 = rememberedValue4;
            }
            final MutableIntState selectedGradientIndex$delegate = (MutableIntState) obj4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1125200724, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue5 = $composer2.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                obj5 = SnapshotIntStateKt.mutableIntStateOf(i);
                $composer2.updateRememberedValue(obj5);
            } else {
                obj5 = rememberedValue5;
            }
            final MutableIntState selectedTab$delegate = (MutableIntState) obj5;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1125202520, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue6 = $composer2.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                obj6 = PrimitiveSnapshotStateKt.mutableFloatStateOf(20.0f);
                $composer2.updateRememberedValue(obj6);
            } else {
                obj6 = rememberedValue6;
            }
            final MutableFloatState fontSizeSp$delegate = (MutableFloatState) obj6;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1125204500, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue7 = $composer2.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                currentAuthor$delegate = currentAuthor$delegate2;
                obj7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                $composer2.updateRememberedValue(obj7);
            } else {
                currentAuthor$delegate = currentAuthor$delegate2;
                obj7 = rememberedValue7;
            }
            final MutableState hasWatermark$delegate = (MutableState) obj7;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1125207546, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue8 = $composer2.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                obj8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer2.updateRememberedValue(obj8);
            } else {
                obj8 = rememberedValue8;
            }
            final MutableState bgPhotoUri$delegate = (MutableState) obj8;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1125209629, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue9 = $composer2.rememberedValue();
            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                obj9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer2.updateRememberedValue(obj9);
            } else {
                obj9 = rememberedValue9;
            }
            final MutableState bgPhotoBitmap$delegate = (MutableState) obj9;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ActivityResultContracts.PickVisualMedia pickVisualMedia = new ActivityResultContracts.PickVisualMedia();
            ComposerKt.sourceInformationMarkerStart($composer2, 1125214750, "CC(remember):DesignTools.kt#9igjgp");
            boolean changedInstance = $composer2.changedInstance(context);
            Object rememberedValue10 = $composer2.rememberedValue();
            if (changedInstance || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                obj10 = new Function1() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda121
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj11) {
                        return DesignToolsKt.StatusMakerScreen$lambda$180$lambda$179(context, bgPhotoUri$delegate, bgPhotoBitmap$delegate, hasWatermark$delegate, (Uri) obj11);
                    }
                };
                $composer2.updateRememberedValue(obj10);
            } else {
                obj10 = rememberedValue10;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            int i2 = i;
            final ManagedActivityResultLauncher statusPhotoPicker = ActivityResultRegistryKt.rememberLauncherForActivityResult(pickVisualMedia, (Function1) obj10, $composer2, i2);
            List[] listArr = new List[5];
            Color[] colorArr = new Color[3];
            colorArr[i2] = Color.m4152boximpl(ColorKt.Color(4284704497L));
            colorArr[1] = Color.m4152boximpl(ColorKt.Color(4289222135L));
            colorArr[2] = Color.m4152boximpl(ColorKt.Color(4293675161L));
            listArr[i2] = CollectionsKt.listOf((Object[]) colorArr);
            Color[] colorArr2 = new Color[3];
            colorArr2[i2] = Color.m4152boximpl(ColorKt.Color(4279179050L));
            colorArr2[1] = Color.m4152boximpl(ColorKt.Color(4280166715L));
            colorArr2[2] = Color.m4152boximpl(ColorKt.Color(4281549141L));
            listArr[1] = CollectionsKt.listOf((Object[]) colorArr2);
            listArr[2] = CollectionsKt.listOf((Object[]) new Color[]{Color.m4152boximpl(ColorKt.Color(4278556265L)), Color.m4152boximpl(ColorKt.Color(4279286145L)), Color.m4152boximpl(ColorKt.Color(4278630100L))});
            listArr[3] = CollectionsKt.listOf((Object[]) new Color[]{Color.m4152boximpl(ColorKt.Color(4294538006L)), Color.m4152boximpl(ColorKt.Color(4293675161L)), Color.m4152boximpl(ColorKt.Color(4287323382L))});
            listArr[4] = CollectionsKt.listOf((Object[]) new Color[]{Color.m4152boximpl(ColorKt.Color(4280163147L)), Color.m4152boximpl(ColorKt.Color(4281413249L)), Color.m4152boximpl(ColorKt.Color(4282595530L))});
            final List gradients = CollectionsKt.listOf((Object[]) listArr);
            final MutableState currentAuthor$delegate3 = currentAuthor$delegate;
            ScaffoldKt.m2411ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(437380335, true, new Function2() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda122
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj11, Object obj12) {
                    return DesignToolsKt.StatusMakerScreen$lambda$195(Function0.this, selectedTab$delegate, (Composer) obj11, ((Integer) obj12).intValue());
                }
            }, $composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-910509628, true, new Function3() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda123
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj11, Object obj12, Object obj13) {
                    return DesignToolsKt.StatusMakerScreen$lambda$254(MutableIntState.this, currentQuote$delegate, currentAuthor$delegate3, hasWatermark$delegate, quotePresets, statusPhotoPicker, bgPhotoBitmap$delegate, bgPhotoUri$delegate, gradients, selectedGradientIndex$delegate, fontSizeSp$delegate, activity, context, (PaddingValues) obj11, (Composer) obj12, ((Integer) obj13).intValue());
                }
            }, $composer2, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda124
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj11, Object obj12) {
                    return DesignToolsKt.StatusMakerScreen$lambda$255(Function0.this, $changed, (Composer) obj11, ((Integer) obj12).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusMakerScreen$lambda$154$lambda$153(Function0 $onBack) {
        $onBack.invoke();
        return Unit.INSTANCE;
    }

    private static final String StatusMakerScreen$lambda$156(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String StatusMakerScreen$lambda$159(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final int StatusMakerScreen$lambda$162(MutableIntState $selectedGradientIndex$delegate) {
        return $selectedGradientIndex$delegate.getIntValue();
    }

    private static final int StatusMakerScreen$lambda$165(MutableIntState $selectedTab$delegate) {
        return $selectedTab$delegate.getIntValue();
    }

    private static final float StatusMakerScreen$lambda$168(MutableFloatState $fontSizeSp$delegate) {
        return $fontSizeSp$delegate.getFloatValue();
    }

    private static final boolean StatusMakerScreen$lambda$171(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void StatusMakerScreen$lambda$172(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final Bitmap StatusMakerScreen$lambda$177(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusMakerScreen$lambda$180$lambda$179(Context $context, MutableState $bgPhotoUri$delegate, MutableState $bgPhotoBitmap$delegate, MutableState $hasWatermark$delegate, Uri uri) {
        if (uri != null) {
            $bgPhotoUri$delegate.setValue(uri);
            try {
                InputStream stream = $context.getContentResolver().openInputStream(uri);
                $bgPhotoBitmap$delegate.setValue(BitmapFactory.decodeStream(stream));
                StatusMakerScreen$lambda$172($hasWatermark$delegate, true);
            } catch (Exception e) {
                Toast.makeText($context, "Error loading background photo", 0).show();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void StatusMakerScreen$saveWithoutWatermarkViaAd$183(Activity activity, final List<? extends List<Color>> list, final Context context, final MutableState<String> mutableState, final MutableState<String> mutableState2, final MutableIntState selectedGradientIndex$delegate, final MutableState<Bitmap> mutableState3, final MutableState<Boolean> mutableState4) {
        if (activity != null) {
            AdManager.INSTANCE.showRewardedAd(activity, new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DesignToolsKt.StatusMakerScreen$saveWithoutWatermarkViaAd$183$lambda$181(list, context, mutableState, mutableState2, selectedGradientIndex$delegate, mutableState3, mutableState4);
                }
            }, new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DesignToolsKt.StatusMakerScreen$saveWithoutWatermarkViaAd$183$lambda$182(MutableState.this);
                }
            });
        } else {
            Bitmap cleanBmp = renderStatusBitmap(StatusMakerScreen$lambda$156(mutableState), StatusMakerScreen$lambda$159(mutableState2), list.get(StatusMakerScreen$lambda$162(selectedGradientIndex$delegate)), false, StatusMakerScreen$lambda$177(mutableState3));
            ImageExportUtils.INSTANCE.saveBitmapToGallery(context, cleanBmp, "Status_NoWatermark");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusMakerScreen$saveWithoutWatermarkViaAd$183$lambda$181(List $gradients, Context $context, MutableState $currentQuote$delegate, MutableState $currentAuthor$delegate, MutableIntState $selectedGradientIndex$delegate, MutableState $bgPhotoBitmap$delegate, MutableState $hasWatermark$delegate) {
        Bitmap cleanBmp = renderStatusBitmap(StatusMakerScreen$lambda$156($currentQuote$delegate), StatusMakerScreen$lambda$159($currentAuthor$delegate), (List) $gradients.get(StatusMakerScreen$lambda$162($selectedGradientIndex$delegate)), false, StatusMakerScreen$lambda$177($bgPhotoBitmap$delegate));
        ImageExportUtils.INSTANCE.saveBitmapToGallery($context, cleanBmp, "Status_NoWatermark");
        Toast.makeText($context, "Saved without watermark! Next image will require watching video ad again.", 1).show();
        StatusMakerScreen$lambda$172($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusMakerScreen$saveWithoutWatermarkViaAd$183$lambda$182(MutableState $hasWatermark$delegate) {
        StatusMakerScreen$lambda$172($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit StatusMakerScreen$lambda$195(final kotlin.jvm.functions.Function0 r41, final androidx.compose.runtime.MutableIntState r42, androidx.compose.runtime.Composer r43, int r44) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.StatusMakerScreen$lambda$195(kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusMakerScreen$lambda$195$lambda$194$lambda$184(Function0 $onBack, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1094@59427L155:DesignTools.kt#x08fh6");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1127226497, $changed, -1, "com.example.ui.tools.design.StatusMakerScreen.<anonymous>.<anonymous>.<anonymous> (DesignTools.kt:1094)");
            }
            IconButtonKt.IconButton($onBack, null, false, null, null, ComposableSingletons$DesignToolsKt.INSTANCE.m7046getLambda$1031393316$app(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusMakerScreen$lambda$195$lambda$194$lambda$193(final MutableIntState $selectedTab$delegate, Composer $composer, int $changed) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        ComposerKt.sourceInformation($composer, "C1104@59938L19,1102@59846L364,1110@60323L19,1108@60231L369,1116@60713L19,1114@60621L366,1122@61100L19,1120@61008L372:DesignTools.kt#x08fh6");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1044649377, $changed, -1, "com.example.ui.tools.design.StatusMakerScreen.<anonymous>.<anonymous>.<anonymous> (DesignTools.kt:1102)");
            }
            boolean z = StatusMakerScreen$lambda$165($selectedTab$delegate) == 0;
            ComposerKt.sourceInformationMarkerStart($composer, -1114292300, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue = $composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda50
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DesignToolsKt.StatusMakerScreen$lambda$195$lambda$194$lambda$193$lambda$186$lambda$185(MutableIntState.this);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TabKt.m2582TabwqdebIU(z, (Function0) obj, null, false, ComposableSingletons$DesignToolsKt.INSTANCE.m7084getLambda$549726725$app(), ComposableSingletons$DesignToolsKt.INSTANCE.m7079getLambda$380475140$app(), 0L, 0L, null, $composer, 221232, 460);
            boolean z2 = StatusMakerScreen$lambda$165($selectedTab$delegate) == 1;
            ComposerKt.sourceInformationMarkerStart($composer, -1114279980, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue2 = $composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda51
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DesignToolsKt.StatusMakerScreen$lambda$195$lambda$194$lambda$193$lambda$188$lambda$187(MutableIntState.this);
                    }
                };
                $composer.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TabKt.m2582TabwqdebIU(z2, (Function0) obj2, null, false, ComposableSingletons$DesignToolsKt.INSTANCE.m7060getLambda$161095388$app(), ComposableSingletons$DesignToolsKt.INSTANCE.m7087getLambda$719079451$app(), 0L, 0L, null, $composer, 221232, 460);
            boolean z3 = StatusMakerScreen$lambda$165($selectedTab$delegate) == 2;
            ComposerKt.sourceInformationMarkerStart($composer, -1114267500, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue3 = $composer.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj3 = new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda52
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DesignToolsKt.StatusMakerScreen$lambda$195$lambda$194$lambda$193$lambda$190$lambda$189(MutableIntState.this);
                    }
                };
                $composer.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TabKt.m2582TabwqdebIU(z3, (Function0) obj3, null, false, ComposableSingletons$DesignToolsKt.INSTANCE.m7063getLambda$1765099261$app(), ComposableSingletons$DesignToolsKt.INSTANCE.getLambda$1971883972$app(), 0L, 0L, null, $composer, 221232, 460);
            boolean z4 = StatusMakerScreen$lambda$165($selectedTab$delegate) == 3;
            ComposerKt.sourceInformationMarkerStart($composer, -1114255116, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue4 = $composer.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                obj4 = new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda53
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DesignToolsKt.StatusMakerScreen$lambda$195$lambda$194$lambda$193$lambda$192$lambda$191(MutableIntState.this);
                    }
                };
                $composer.updateRememberedValue(obj4);
            } else {
                obj4 = rememberedValue4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TabKt.m2582TabwqdebIU(z4, (Function0) obj4, null, false, ComposableSingletons$DesignToolsKt.INSTANCE.getLambda$925864162$app(), ComposableSingletons$DesignToolsKt.INSTANCE.getLambda$367880099$app(), 0L, 0L, null, $composer, 221232, 460);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusMakerScreen$lambda$195$lambda$194$lambda$193$lambda$186$lambda$185(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusMakerScreen$lambda$195$lambda$194$lambda$193$lambda$188$lambda$187(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusMakerScreen$lambda$195$lambda$194$lambda$193$lambda$190$lambda$189(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusMakerScreen$lambda$195$lambda$194$lambda$193$lambda$192$lambda$191(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0923  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x09e7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0c00  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0c0c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0c43  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0d38  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0dd0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0de0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0d46  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0c59  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0c12  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0935  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0e40  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x1080  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x108e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x10ea  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x12a4  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x1355  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x13d2  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x14ca  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x14d6  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x1584  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x16e2  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x16ee  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x14dc  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x13e0  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x1363  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x12b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x1766  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x06d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit StatusMakerScreen$lambda$254(final androidx.compose.runtime.MutableIntState r111, final androidx.compose.runtime.MutableState r112, final androidx.compose.runtime.MutableState r113, final androidx.compose.runtime.MutableState r114, java.util.List r115, final androidx.activity.compose.ManagedActivityResultLauncher r116, final androidx.compose.runtime.MutableState r117, final androidx.compose.runtime.MutableState r118, final java.util.List r119, final androidx.compose.runtime.MutableIntState r120, final androidx.compose.runtime.MutableFloatState r121, android.app.Activity r122, final android.content.Context r123, androidx.compose.foundation.layout.PaddingValues r124, androidx.compose.runtime.Composer r125, int r126) {
        /*
            Method dump skipped, instructions count: 6008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.StatusMakerScreen$lambda$254(androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, java.util.List, androidx.activity.compose.ManagedActivityResultLauncher, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, java.util.List, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableFloatState, android.app.Activity, android.content.Context, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusMakerScreen$lambda$254$lambda$253$lambda$212$lambda$197$lambda$196(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit StatusMakerScreen$lambda$254$lambda$253$lambda$212$lambda$200(androidx.compose.runtime.MutableState r71, androidx.compose.runtime.MutableState r72, androidx.compose.runtime.Composer r73, int r74) {
        /*
            Method dump skipped, instructions count: 883
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.StatusMakerScreen$lambda$254$lambda$253$lambda$212$lambda$200(androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusMakerScreen$lambda$254$lambda$253$lambda$212$lambda$202$lambda$201(MutableState $currentQuote$delegate, MutableState $hasWatermark$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $currentQuote$delegate.setValue(it);
        StatusMakerScreen$lambda$172($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusMakerScreen$lambda$254$lambda$253$lambda$212$lambda$204$lambda$203(MutableState $currentAuthor$delegate, MutableState $hasWatermark$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $currentAuthor$delegate.setValue(it);
        StatusMakerScreen$lambda$172($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusMakerScreen$lambda$254$lambda$253$lambda$212$lambda$209$lambda$208$lambda$206$lambda$205(String $quote, String $author, MutableState $currentQuote$delegate, MutableState $currentAuthor$delegate, MutableState $hasWatermark$delegate) {
        $currentQuote$delegate.setValue($quote);
        $currentAuthor$delegate.setValue($author);
        StatusMakerScreen$lambda$172($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusMakerScreen$lambda$254$lambda$253$lambda$212$lambda$209$lambda$208$lambda$207(String $quote, String $author, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1204@65540L297:DesignTools.kt#x08fh6");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(179339004, $changed, -1, "com.example.ui.tools.design.StatusMakerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DesignTools.kt:1204)");
            }
            TextKt.m2696Text4IGK_g($quote + " — " + $author, PaddingKt.m673padding3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(12)), 0L, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3120, 3072, 122868);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusMakerScreen$lambda$254$lambda$253$lambda$212$lambda$211$lambda$210(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0895  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0a92  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0831 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0998  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit StatusMakerScreen$lambda$254$lambda$253$lambda$227$lambda$224(final androidx.activity.compose.ManagedActivityResultLauncher r112, final androidx.compose.runtime.MutableState r113, androidx.compose.runtime.MutableState r114, final androidx.compose.runtime.MutableState r115, final androidx.compose.runtime.MutableState r116, androidx.compose.foundation.layout.ColumnScope r117, androidx.compose.runtime.Composer r118, int r119) {
        /*
            Method dump skipped, instructions count: 2712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.StatusMakerScreen$lambda$254$lambda$253$lambda$227$lambda$224(androidx.activity.compose.ManagedActivityResultLauncher, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusMakerScreen$lambda$254$lambda$253$lambda$227$lambda$224$lambda$223$lambda$220$lambda$217$lambda$216(ManagedActivityResultLauncher $statusPhotoPicker) {
        $statusPhotoPicker.launch(PickVisualMediaRequestKt.PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE, 0, false, null, 14, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusMakerScreen$lambda$254$lambda$253$lambda$227$lambda$224$lambda$223$lambda$220$lambda$219$lambda$218(MutableState $bgPhotoBitmap$delegate, MutableState $bgPhotoUri$delegate, MutableState $hasWatermark$delegate) {
        $bgPhotoBitmap$delegate.setValue(null);
        $bgPhotoUri$delegate.setValue(null);
        StatusMakerScreen$lambda$172($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusMakerScreen$lambda$254$lambda$253$lambda$227$lambda$224$lambda$223$lambda$222$lambda$221(ManagedActivityResultLauncher $statusPhotoPicker) {
        $statusPhotoPicker.launch(PickVisualMediaRequestKt.PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE, 0, false, null, 14, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusMakerScreen$lambda$254$lambda$253$lambda$227$lambda$226$lambda$225(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusMakerScreen$lambda$254$lambda$253$lambda$237$lambda$231$lambda$230$lambda$229$lambda$228(int $index, MutableIntState $selectedGradientIndex$delegate, MutableState $bgPhotoBitmap$delegate, MutableState $hasWatermark$delegate) {
        $selectedGradientIndex$delegate.setIntValue($index);
        $bgPhotoBitmap$delegate.setValue(null);
        StatusMakerScreen$lambda$172($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusMakerScreen$lambda$254$lambda$253$lambda$237$lambda$234$lambda$233(MutableFloatState $fontSizeSp$delegate, float it) {
        $fontSizeSp$delegate.setFloatValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusMakerScreen$lambda$254$lambda$253$lambda$237$lambda$236$lambda$235(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x043a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit StatusMakerScreen$lambda$254$lambda$253$lambda$252$lambda$242(java.util.List r128, androidx.compose.runtime.MutableState r129, androidx.compose.runtime.MutableIntState r130, androidx.compose.runtime.MutableState r131, androidx.compose.runtime.MutableFloatState r132, androidx.compose.runtime.MutableState r133, androidx.compose.runtime.MutableState r134, androidx.compose.foundation.layout.ColumnScope r135, androidx.compose.runtime.Composer r136, int r137) {
        /*
            Method dump skipped, instructions count: 1914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.StatusMakerScreen$lambda$254$lambda$253$lambda$252$lambda$242(java.util.List, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusMakerScreen$lambda$254$lambda$253$lambda$252$lambda$244$lambda$243(Activity $activity, List $gradients, Context $context, MutableState $currentQuote$delegate, MutableState $currentAuthor$delegate, MutableIntState $selectedGradientIndex$delegate, MutableState $bgPhotoBitmap$delegate, MutableState $hasWatermark$delegate) {
        StatusMakerScreen$saveWithoutWatermarkViaAd$183($activity, $gradients, $context, $currentQuote$delegate, $currentAuthor$delegate, $selectedGradientIndex$delegate, $bgPhotoBitmap$delegate, $hasWatermark$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusMakerScreen$lambda$254$lambda$253$lambda$252$lambda$246$lambda$245(Activity $activity, List $gradients, Context $context, MutableState $currentQuote$delegate, MutableState $currentAuthor$delegate, MutableIntState $selectedGradientIndex$delegate, MutableState $bgPhotoBitmap$delegate, MutableState $hasWatermark$delegate) {
        StatusMakerScreen$saveWithoutWatermarkViaAd$183($activity, $gradients, $context, $currentQuote$delegate, $currentAuthor$delegate, $selectedGradientIndex$delegate, $bgPhotoBitmap$delegate, $hasWatermark$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusMakerScreen$lambda$254$lambda$253$lambda$252$lambda$251$lambda$248$lambda$247(List $gradients, Context $context, MutableState $currentQuote$delegate, MutableState $currentAuthor$delegate, MutableIntState $selectedGradientIndex$delegate, MutableState $bgPhotoBitmap$delegate) {
        Bitmap bmp = renderStatusBitmap(StatusMakerScreen$lambda$156($currentQuote$delegate), StatusMakerScreen$lambda$159($currentAuthor$delegate), (List) $gradients.get(StatusMakerScreen$lambda$162($selectedGradientIndex$delegate)), true, StatusMakerScreen$lambda$177($bgPhotoBitmap$delegate));
        ImageExportUtils.INSTANCE.saveBitmapToGallery($context, bmp, "StatusPost_Free");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusMakerScreen$lambda$254$lambda$253$lambda$252$lambda$251$lambda$250$lambda$249(List $gradients, Context $context, MutableState $currentQuote$delegate, MutableState $currentAuthor$delegate, MutableIntState $selectedGradientIndex$delegate, MutableState $bgPhotoBitmap$delegate) {
        Bitmap bmp = renderStatusBitmap(StatusMakerScreen$lambda$156($currentQuote$delegate), StatusMakerScreen$lambda$159($currentAuthor$delegate), (List) $gradients.get(StatusMakerScreen$lambda$162($selectedGradientIndex$delegate)), true, StatusMakerScreen$lambda$177($bgPhotoBitmap$delegate));
        ImageExportUtils.INSTANCE.shareBitmap($context, bmp, "Status - " + StatusMakerScreen$lambda$159($currentAuthor$delegate));
        return Unit.INSTANCE;
    }

    static /* synthetic */ Bitmap renderStatusBitmap$default(String str, String str2, List list, boolean z, Bitmap bitmap, int i, Object obj) {
        if ((i & 16) != 0) {
            bitmap = null;
        }
        return renderStatusBitmap(str, str2, list, z, bitmap);
    }

    private static final Bitmap renderStatusBitmap(String quote, String author, List<Color> list, boolean hasWatermark, Bitmap bgPhotoBitmap) {
        int i;
        Bitmap bitmap = Bitmap.createBitmap(1080, 1080, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmap);
        int i2 = 0;
        if (bgPhotoBitmap != null) {
            int minDim = Math.min(bgPhotoBitmap.getWidth(), bgPhotoBitmap.getHeight());
            int srcX = (bgPhotoBitmap.getWidth() - minDim) / 2;
            int srcY = (bgPhotoBitmap.getHeight() - minDim) / 2;
            Rect srcRect = new Rect(srcX, srcY, srcX + minDim, srcY + minDim);
            Rect dstRect = new Rect(0, 0, 1080, 1080);
            canvas.drawBitmap(bgPhotoBitmap, srcRect, dstRect, (Paint) null);
            Paint overlayPaint = new Paint();
            overlayPaint.setColor(android.graphics.Color.argb(165, 0, 0, 0));
            canvas.drawRect(0.0f, 0.0f, 1080, 1080, overlayPaint);
            i = 0;
        } else {
            Paint bgPaint = new Paint();
            float f = 1080;
            float f2 = 1080;
            List<Color> list2 = list;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(ColorKt.m4216toArgb8_81llA(((Color) it.next()).m4172unboximpl())));
                i2 = i2;
            }
            i = i2;
            bgPaint.setShader(new LinearGradient(0.0f, 0.0f, f, f2, CollectionsKt.toIntArray((List) arrayList), (float[]) null, Shader.TileMode.CLAMP));
            canvas.drawRect(0.0f, 0.0f, 1080, 1080, bgPaint);
        }
        Paint textPaint = new Paint();
        textPaint.setColor(-1);
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(48.0f);
        textPaint.setFakeBoldText(true);
        String[] strArr = new String[1];
        strArr[i] = " ";
        List<String> words = StringsKt.split$default((CharSequence) quote, strArr, false, 0, 6, (Object) null);
        List lines = new ArrayList();
        String currentLine = "";
        for (String word : words) {
            if ((currentLine + word).length() > 30) {
                lines.add(currentLine);
                currentLine = word + " ";
            } else {
                currentLine = currentLine + word + " ";
            }
        }
        if (!StringsKt.isBlank(currentLine)) {
            lines.add(currentLine);
        }
        float f3 = 2.0f;
        float f4 = 65.0f;
        float startY = (1080 / 2.0f) - ((lines.size() * 65.0f) / 2.0f);
        int i3 = 0;
        for (Object obj : lines) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            float f5 = f3;
            float f6 = f4;
            canvas.drawText(StringsKt.trim((CharSequence) obj).toString(), 1080 / f5, (i3 * f6) + startY, textPaint);
            i3 = i4;
            f4 = f6;
            f3 = f5;
        }
        float f7 = f3;
        Paint authorPaint = new Paint();
        authorPaint.setColor(android.graphics.Color.argb(230, 255, 255, 255));
        authorPaint.setAntiAlias(true);
        authorPaint.setTextAlign(Paint.Align.CENTER);
        authorPaint.setTextSize(34.0f);
        canvas.drawText("— " + author, 1080 / f7, 1080 - 150.0f, authorPaint);
        if (!hasWatermark) {
            return bitmap;
        }
        Paint wmBg = new Paint();
        int i5 = i;
        wmBg.setColor(android.graphics.Color.argb(160, i5, i5, i5));
        Paint wmText = new Paint();
        wmText.setColor(-1);
        wmText.setTextSize(28.0f);
        wmText.setFakeBoldText(true);
        wmText.setTextAlign(Paint.Align.CENTER);
        wmText.setAntiAlias(true);
        canvas.drawRoundRect(new RectF((1080 / f7) - 240.0f, 1080 - 70.0f, (1080 / f7) + 240.0f, 1080 - 20.0f), 16.0f, 16.0f, wmBg);
        canvas.drawText("⚡ Made with OmniTools App", 1080 / f7, 1080 - 36.0f, wmText);
        return bitmap;
    }

    public static final void InvitationCardMakerScreen(final Function0<Unit> onBack, Composer $composer, final int $changed) {
        Object obj;
        Object obj2;
        int i;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        final List themes;
        Object obj12;
        Object obj13;
        Object obj14;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer $composer2 = $composer.startRestartGroup(-1624150454);
        ComposerKt.sourceInformation($composer2, "C(InvitationCardMakerScreen)1717@93039L12,1717@93027L24,1718@93083L7,1730@94129L42,1731@94192L44,1732@94259L64,1733@94340L57,1734@94414L46,1735@94478L72,1736@94567L47,1737@94645L33,1738@94702L33,1739@94760L33,1744@94915L39,1745@94982L42,1746@95133L435,1746@95056L512,1778@96620L2169,1818@98796L25071,1777@96593L27274:DesignTools.kt#x08fh6");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(onBack) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1624150454, $dirty, -1, "com.example.ui.tools.design.InvitationCardMakerScreen (DesignTools.kt:1716)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -1735453994, "CC(remember):DesignTools.kt#9igjgp");
            boolean z = ($dirty & 14) == 4;
            Object rememberedValue = $composer2.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda111
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DesignToolsKt.InvitationCardMakerScreen$lambda$265$lambda$264(Function0.this);
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
            final Activity activity = context instanceof Activity ? (Activity) context : null;
            final List eventTypes = CollectionsKt.listOf((Object[]) new String[]{"Birthday Party 🎂", "Housewarming (गृह प्रवेश) 🏡", "Anniversary 🎉", "Baby Shower 👶", "Grand Opening 🚀", "Corporate Party 💼"});
            List themes2 = CollectionsKt.listOf((Object[]) new InvitationTheme[]{new InvitationTheme("Royal Gold", CollectionsKt.listOf((Object[]) new Color[]{Color.m4152boximpl(ColorKt.Color(4280163147L)), Color.m4152boximpl(ColorKt.Color(4281413249L))}), ColorKt.Color(4294829706L), Color.INSTANCE.m4199getWhite0d7_KjU(), ColorKt.Color(4294286859L), ColorKt.Color(4294286859L), null), new InvitationTheme("Birthday Pink", CollectionsKt.listOf((Object[]) new Color[]{Color.m4152boximpl(ColorKt.Color(4286781507L)), Color.m4152boximpl(ColorKt.Color(4290648157L))}), ColorKt.Color(4294764531L), Color.INSTANCE.m4199getWhite0d7_KjU(), ColorKt.Color(4294210230L), ColorKt.Color(4294692840L), null), new InvitationTheme("Emerald Luxe", CollectionsKt.listOf((Object[]) new Color[]{Color.m4152boximpl(ColorKt.Color(4278603323L)), Color.m4152boximpl(ColorKt.Color(4278483031L))}), ColorKt.Color(4291951333L), Color.INSTANCE.m4199getWhite0d7_KjU(), ColorKt.Color(4281652121L), ColorKt.Color(4289197008L), null), new InvitationTheme("Sunset Fire", CollectionsKt.listOf((Object[]) new Color[]{Color.m4152boximpl(ColorKt.Color(4286328082L)), Color.m4152boximpl(ColorKt.Color(4290920716L))}), ColorKt.Color(4294898631L), Color.INSTANCE.m4199getWhite0d7_KjU(), ColorKt.Color(4294688548L), ColorKt.Color(4294829706L), null), new InvitationTheme("Cosmic Dark", CollectionsKt.listOf((Object[]) new Color[]{Color.m4152boximpl(ColorKt.Color(4279179050L)), Color.m4152boximpl(ColorKt.Color(4280166715L))}), ColorKt.Color(4292932350L), Color.INSTANCE.m4199getWhite0d7_KjU(), ColorKt.Color(4281908728L), ColorKt.Color(4286436348L), null)});
            ComposerKt.sourceInformationMarkerStart($composer2, -1735419084, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue2 = $composer2.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(eventTypes.get(0), null, 2, null);
                $composer2.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            final MutableState selectedEvent$delegate = (MutableState) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1735417066, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue3 = $composer2.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                i = 0;
                obj3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("Sharma Family", null, 2, null);
                $composer2.updateRememberedValue(obj3);
            } else {
                i = 0;
                obj3 = rememberedValue3;
            }
            final MutableState hostName$delegate = (MutableState) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1735414902, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue4 = $composer2.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                obj4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("Aarav's 5th Birthday Celebration!", null, 2, null);
                $composer2.updateRememberedValue(obj4);
            } else {
                obj4 = rememberedValue4;
            }
            final MutableState eventTitle$delegate = (MutableState) obj4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1735412317, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue5 = $composer2.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                obj5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("Saturday, October 24, 2026", null, 2, null);
                $composer2.updateRememberedValue(obj5);
            } else {
                obj5 = rememberedValue5;
            }
            final MutableState date$delegate = (MutableState) obj5;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1735409960, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue6 = $composer2.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                obj6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("6:30 PM Onwards", null, 2, null);
                $composer2.updateRememberedValue(obj6);
            } else {
                obj6 = rememberedValue6;
            }
            final MutableState time$delegate = (MutableState) obj6;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1735407886, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue7 = $composer2.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                obj7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("Club House, Green Valley Heights, MG Road", null, 2, null);
                $composer2.updateRememberedValue(obj7);
            } else {
                obj7 = rememberedValue7;
            }
            final MutableState venue$delegate = (MutableState) obj7;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1735405063, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue8 = $composer2.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                obj8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("RSVP: 9876543210", null, 2, null);
                $composer2.updateRememberedValue(obj8);
            } else {
                obj8 = rememberedValue8;
            }
            final MutableState rsvp$delegate = (MutableState) obj8;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1735402581, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue9 = $composer2.rememberedValue();
            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                obj9 = SnapshotIntStateKt.mutableIntStateOf(i);
                $composer2.updateRememberedValue(obj9);
            } else {
                obj9 = rememberedValue9;
            }
            final MutableIntState selectedThemeIndex$delegate = (MutableIntState) obj9;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1735400757, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue10 = $composer2.rememberedValue();
            if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                obj10 = SnapshotIntStateKt.mutableIntStateOf(i);
                $composer2.updateRememberedValue(obj10);
            } else {
                obj10 = rememberedValue10;
            }
            final MutableIntState selectedTab$delegate = (MutableIntState) obj10;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1735398901, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue11 = $composer2.rememberedValue();
            if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                obj11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                $composer2.updateRememberedValue(obj11);
            } else {
                obj11 = rememberedValue11;
            }
            final MutableState hasWatermark$delegate = (MutableState) obj11;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final InvitationTheme activeTheme = (InvitationTheme) themes2.get(InvitationCardMakerScreen$lambda$288(selectedThemeIndex$delegate));
            ComposerKt.sourceInformationMarkerStart($composer2, -1735393935, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue12 = $composer2.rememberedValue();
            if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                themes = themes2;
                obj12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer2.updateRememberedValue(obj12);
            } else {
                themes = themes2;
                obj12 = rememberedValue12;
            }
            final MutableState celebrantPhotoUri$delegate = (MutableState) obj12;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1735391788, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue13 = $composer2.rememberedValue();
            if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                obj13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer2.updateRememberedValue(obj13);
            } else {
                obj13 = rememberedValue13;
            }
            final MutableState celebrantBitmap$delegate = (MutableState) obj13;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ActivityResultContracts.PickVisualMedia pickVisualMedia = new ActivityResultContracts.PickVisualMedia();
            ComposerKt.sourceInformationMarkerStart($composer2, -1735386563, "CC(remember):DesignTools.kt#9igjgp");
            boolean changedInstance = $composer2.changedInstance(context);
            Object rememberedValue14 = $composer2.rememberedValue();
            if (changedInstance || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                obj14 = new Function1() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda112
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        return DesignToolsKt.InvitationCardMakerScreen$lambda$303$lambda$302(context, celebrantPhotoUri$delegate, celebrantBitmap$delegate, hasWatermark$delegate, (Uri) obj15);
                    }
                };
                $composer2.updateRememberedValue(obj14);
            } else {
                obj14 = rememberedValue14;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final ManagedActivityResultLauncher celebrantPhotoPicker = ActivityResultRegistryKt.rememberLauncherForActivityResult(pickVisualMedia, (Function1) obj14, $composer2, i);
            ScaffoldKt.m2411ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(882991366, true, new Function2() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda113
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj15, Object obj16) {
                    return DesignToolsKt.InvitationCardMakerScreen$lambda$318(Function0.this, selectedTab$delegate, (Composer) obj15, ((Integer) obj16).intValue());
                }
            }, $composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-987328293, true, new Function3() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda114
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj15, Object obj16, Object obj17) {
                    return DesignToolsKt.InvitationCardMakerScreen$lambda$384(MutableIntState.this, activeTheme, eventTitle$delegate, eventTypes, selectedEvent$delegate, hasWatermark$delegate, hostName$delegate, date$delegate, time$delegate, venue$delegate, rsvp$delegate, celebrantBitmap$delegate, celebrantPhotoPicker, celebrantPhotoUri$delegate, themes, selectedThemeIndex$delegate, activity, context, (PaddingValues) obj15, (Composer) obj16, ((Integer) obj17).intValue());
                }
            }, $composer2, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda115
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj15, Object obj16) {
                    return DesignToolsKt.InvitationCardMakerScreen$lambda$385(Function0.this, $changed, (Composer) obj15, ((Integer) obj16).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$lambda$265$lambda$264(Function0 $onBack) {
        $onBack.invoke();
        return Unit.INSTANCE;
    }

    private static final String InvitationCardMakerScreen$lambda$267(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String InvitationCardMakerScreen$lambda$270(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String InvitationCardMakerScreen$lambda$273(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String InvitationCardMakerScreen$lambda$276(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String InvitationCardMakerScreen$lambda$279(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String InvitationCardMakerScreen$lambda$282(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String InvitationCardMakerScreen$lambda$285(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final int InvitationCardMakerScreen$lambda$288(MutableIntState $selectedThemeIndex$delegate) {
        return $selectedThemeIndex$delegate.getIntValue();
    }

    private static final int InvitationCardMakerScreen$lambda$291(MutableIntState $selectedTab$delegate) {
        return $selectedTab$delegate.getIntValue();
    }

    private static final boolean InvitationCardMakerScreen$lambda$294(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void InvitationCardMakerScreen$lambda$295(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final Bitmap InvitationCardMakerScreen$lambda$300(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$lambda$303$lambda$302(Context $context, MutableState $celebrantPhotoUri$delegate, MutableState $celebrantBitmap$delegate, MutableState $hasWatermark$delegate, Uri uri) {
        if (uri != null) {
            $celebrantPhotoUri$delegate.setValue(uri);
            try {
                InputStream stream = $context.getContentResolver().openInputStream(uri);
                $celebrantBitmap$delegate.setValue(BitmapFactory.decodeStream(stream));
                InvitationCardMakerScreen$lambda$295($hasWatermark$delegate, true);
            } catch (Exception e) {
                Toast.makeText($context, "Error loading celebrant photo", 0).show();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void InvitationCardMakerScreen$saveWithoutWatermarkViaAd$306(Activity activity, final InvitationTheme activeTheme, final Context context, final MutableState<String> mutableState, final MutableState<String> mutableState2, final MutableState<String> mutableState3, final MutableState<String> mutableState4, final MutableState<String> mutableState5, final MutableState<String> mutableState6, final MutableState<String> mutableState7, final MutableState<Bitmap> mutableState8, final MutableState<Boolean> mutableState9) {
        if (activity != null) {
            AdManager.INSTANCE.showRewardedAd(activity, new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda39
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DesignToolsKt.InvitationCardMakerScreen$saveWithoutWatermarkViaAd$306$lambda$304(InvitationTheme.this, context, mutableState, mutableState2, mutableState3, mutableState4, mutableState5, mutableState6, mutableState7, mutableState8, mutableState9);
                }
            }, new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda40
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DesignToolsKt.InvitationCardMakerScreen$saveWithoutWatermarkViaAd$306$lambda$305(MutableState.this);
                }
            });
        } else {
            Bitmap cleanBmp = renderInvitationBitmap(InvitationCardMakerScreen$lambda$267(mutableState), InvitationCardMakerScreen$lambda$270(mutableState2), InvitationCardMakerScreen$lambda$273(mutableState3), InvitationCardMakerScreen$lambda$276(mutableState4), InvitationCardMakerScreen$lambda$279(mutableState5), InvitationCardMakerScreen$lambda$282(mutableState6), InvitationCardMakerScreen$lambda$285(mutableState7), InvitationCardMakerScreen$lambda$300(mutableState8), activeTheme, false);
            ImageExportUtils.INSTANCE.saveBitmapToGallery(context, cleanBmp, "Invitation_NoWatermark");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$saveWithoutWatermarkViaAd$306$lambda$304(InvitationTheme $activeTheme, Context $context, MutableState $selectedEvent$delegate, MutableState $hostName$delegate, MutableState $eventTitle$delegate, MutableState $date$delegate, MutableState $time$delegate, MutableState $venue$delegate, MutableState $rsvp$delegate, MutableState $celebrantBitmap$delegate, MutableState $hasWatermark$delegate) {
        Bitmap cleanBmp = renderInvitationBitmap(InvitationCardMakerScreen$lambda$267($selectedEvent$delegate), InvitationCardMakerScreen$lambda$270($hostName$delegate), InvitationCardMakerScreen$lambda$273($eventTitle$delegate), InvitationCardMakerScreen$lambda$276($date$delegate), InvitationCardMakerScreen$lambda$279($time$delegate), InvitationCardMakerScreen$lambda$282($venue$delegate), InvitationCardMakerScreen$lambda$285($rsvp$delegate), InvitationCardMakerScreen$lambda$300($celebrantBitmap$delegate), $activeTheme, false);
        ImageExportUtils.INSTANCE.saveBitmapToGallery($context, cleanBmp, "Invitation_NoWatermark");
        Toast.makeText($context, "Saved without watermark! Next card will require watching video ad again.", 1).show();
        InvitationCardMakerScreen$lambda$295($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$saveWithoutWatermarkViaAd$306$lambda$305(MutableState $hasWatermark$delegate) {
        InvitationCardMakerScreen$lambda$295($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit InvitationCardMakerScreen$lambda$318(final kotlin.jvm.functions.Function0 r41, final androidx.compose.runtime.MutableIntState r42, androidx.compose.runtime.Composer r43, int r44) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.InvitationCardMakerScreen$lambda$318(kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$lambda$318$lambda$317$lambda$307(Function0 $onBack, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1783@96802L155:DesignTools.kt#x08fh6");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(385863574, $changed, -1, "com.example.ui.tools.design.InvitationCardMakerScreen.<anonymous>.<anonymous>.<anonymous> (DesignTools.kt:1783)");
            }
            IconButtonKt.IconButton($onBack, null, false, null, null, ComposableSingletons$DesignToolsKt.INSTANCE.getLambda$881225459$app(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$lambda$318$lambda$317$lambda$316(final MutableIntState $selectedTab$delegate, Composer $composer, int $changed) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        ComposerKt.sourceInformation($composer, "C1793@97313L19,1791@97221L364,1799@97698L19,1797@97606L367,1805@98086L19,1803@97994L362,1811@98469L19,1809@98377L370:DesignTools.kt#x08fh6");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-214384712, $changed, -1, "com.example.ui.tools.design.InvitationCardMakerScreen.<anonymous>.<anonymous>.<anonymous> (DesignTools.kt:1791)");
            }
            boolean z = InvitationCardMakerScreen$lambda$291($selectedTab$delegate) == 0;
            ComposerKt.sourceInformationMarkerStart($composer, 134725643, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue = $composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda168
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DesignToolsKt.InvitationCardMakerScreen$lambda$318$lambda$317$lambda$316$lambda$309$lambda$308(MutableIntState.this);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TabKt.m2582TabwqdebIU(z, (Function0) obj, null, false, ComposableSingletons$DesignToolsKt.INSTANCE.getLambda$545228306$app(), ComposableSingletons$DesignToolsKt.INSTANCE.m7066getLambda$1802008557$app(), 0L, 0L, null, $composer, 221232, 460);
            boolean z2 = InvitationCardMakerScreen$lambda$291($selectedTab$delegate) == 1;
            ComposerKt.sourceInformationMarkerStart($composer, 134737963, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue2 = $composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda169
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DesignToolsKt.InvitationCardMakerScreen$lambda$318$lambda$317$lambda$316$lambda$311$lambda$310(MutableIntState.this);
                    }
                };
                $composer.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TabKt.m2582TabwqdebIU(z2, (Function0) obj2, null, false, ComposableSingletons$DesignToolsKt.INSTANCE.getLambda$493115451$app(), ComposableSingletons$DesignToolsKt.INSTANCE.m7077getLambda$343679492$app(), 0L, 0L, null, $composer, 221232, 460);
            boolean z3 = InvitationCardMakerScreen$lambda$291($selectedTab$delegate) == 2;
            ComposerKt.sourceInformationMarkerStart($composer, 134750379, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue3 = $composer.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj3 = new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda170
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DesignToolsKt.InvitationCardMakerScreen$lambda$318$lambda$317$lambda$316$lambda$313$lambda$312(MutableIntState.this);
                    }
                };
                $composer.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TabKt.m2582TabwqdebIU(z3, (Function0) obj3, null, false, ComposableSingletons$DesignToolsKt.INSTANCE.m7051getLambda$1163992806$app(), ComposableSingletons$DesignToolsKt.INSTANCE.m7074getLambda$2000787749$app(), 0L, 0L, null, $composer, 221232, 460);
            boolean z4 = InvitationCardMakerScreen$lambda$291($selectedTab$delegate) == 3;
            ComposerKt.sourceInformationMarkerStart($composer, 134762635, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue4 = $composer.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                obj4 = new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda171
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DesignToolsKt.InvitationCardMakerScreen$lambda$318$lambda$317$lambda$316$lambda$315$lambda$314(MutableIntState.this);
                    }
                };
                $composer.updateRememberedValue(obj4);
            } else {
                obj4 = rememberedValue4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TabKt.m2582TabwqdebIU(z4, (Function0) obj4, null, false, ComposableSingletons$DesignToolsKt.INSTANCE.getLambda$1473866233$app(), ComposableSingletons$DesignToolsKt.INSTANCE.getLambda$637071290$app(), 0L, 0L, null, $composer, 221232, 460);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$lambda$318$lambda$317$lambda$316$lambda$309$lambda$308(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$lambda$318$lambda$317$lambda$316$lambda$311$lambda$310(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$lambda$318$lambda$317$lambda$316$lambda$313$lambda$312(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$lambda$318$lambda$317$lambda$316$lambda$315$lambda$314(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x09ba  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x09d6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x09e4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x09c6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0ab1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0ac3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0b29  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0d7a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0d88  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0de7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0fb6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x10d5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x10e1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x1118  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x1199  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x12bb  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x1336  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x13ad  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x1428  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x14a3  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x151e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x15d6  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x15e2  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x152c  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x14b1  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x1436  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x13bb  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x1342  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x12c9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x112e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x10e7  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0fc4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x1658  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x060d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x074b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit InvitationCardMakerScreen$lambda$384(final androidx.compose.runtime.MutableIntState r113, final com.example.ui.tools.design.InvitationTheme r114, final androidx.compose.runtime.MutableState r115, java.util.List r116, final androidx.compose.runtime.MutableState r117, final androidx.compose.runtime.MutableState r118, final androidx.compose.runtime.MutableState r119, final androidx.compose.runtime.MutableState r120, final androidx.compose.runtime.MutableState r121, final androidx.compose.runtime.MutableState r122, final androidx.compose.runtime.MutableState r123, final androidx.compose.runtime.MutableState r124, final androidx.activity.compose.ManagedActivityResultLauncher r125, final androidx.compose.runtime.MutableState r126, java.util.List r127, androidx.compose.runtime.MutableIntState r128, android.app.Activity r129, android.content.Context r130, androidx.compose.foundation.layout.PaddingValues r131, androidx.compose.runtime.Composer r132, int r133) {
        /*
            Method dump skipped, instructions count: 5738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.InvitationCardMakerScreen$lambda$384(androidx.compose.runtime.MutableIntState, com.example.ui.tools.design.InvitationTheme, androidx.compose.runtime.MutableState, java.util.List, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.activity.compose.ManagedActivityResultLauncher, androidx.compose.runtime.MutableState, java.util.List, androidx.compose.runtime.MutableIntState, android.app.Activity, android.content.Context, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$lambda$384$lambda$383$lambda$343$lambda$320$lambda$319(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit InvitationCardMakerScreen$lambda$384$lambda$383$lambda$343$lambda$323(com.example.ui.tools.design.InvitationTheme r71, androidx.compose.runtime.MutableState r72, androidx.compose.runtime.Composer r73, int r74) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.InvitationCardMakerScreen$lambda$384$lambda$383$lambda$343$lambda$323(com.example.ui.tools.design.InvitationTheme, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$lambda$384$lambda$383$lambda$343$lambda$328$lambda$327$lambda$325$lambda$324(String $event, MutableState $selectedEvent$delegate, MutableState $hasWatermark$delegate) {
        $selectedEvent$delegate.setValue($event);
        InvitationCardMakerScreen$lambda$295($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$lambda$384$lambda$383$lambda$343$lambda$328$lambda$327$lambda$326(String $event, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1873@101817L11:DesignTools.kt#x08fh6");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1489459424, $changed, -1, "com.example.ui.tools.design.InvitationCardMakerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DesignTools.kt:1873)");
            }
            TextKt.m2696Text4IGK_g($event, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$lambda$384$lambda$383$lambda$343$lambda$330$lambda$329(MutableState $hostName$delegate, MutableState $hasWatermark$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $hostName$delegate.setValue(it);
        InvitationCardMakerScreen$lambda$295($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$lambda$384$lambda$383$lambda$343$lambda$332$lambda$331(MutableState $eventTitle$delegate, MutableState $hasWatermark$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $eventTitle$delegate.setValue(it);
        InvitationCardMakerScreen$lambda$295($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$lambda$384$lambda$383$lambda$343$lambda$334$lambda$333(MutableState $date$delegate, MutableState $hasWatermark$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $date$delegate.setValue(it);
        InvitationCardMakerScreen$lambda$295($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$lambda$384$lambda$383$lambda$343$lambda$336$lambda$335(MutableState $time$delegate, MutableState $hasWatermark$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $time$delegate.setValue(it);
        InvitationCardMakerScreen$lambda$295($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$lambda$384$lambda$383$lambda$343$lambda$338$lambda$337(MutableState $venue$delegate, MutableState $hasWatermark$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $venue$delegate.setValue(it);
        InvitationCardMakerScreen$lambda$295($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$lambda$384$lambda$383$lambda$343$lambda$340$lambda$339(MutableState $rsvp$delegate, MutableState $hasWatermark$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $rsvp$delegate.setValue(it);
        InvitationCardMakerScreen$lambda$295($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$lambda$384$lambda$383$lambda$343$lambda$342$lambda$341(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0946  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0907  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0848 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x045c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0413  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit InvitationCardMakerScreen$lambda$384$lambda$383$lambda$357$lambda$354(com.example.ui.tools.design.InvitationTheme r116, final androidx.compose.runtime.MutableState r117, final androidx.activity.compose.ManagedActivityResultLauncher r118, final androidx.compose.runtime.MutableState r119, androidx.compose.foundation.layout.ColumnScope r120, androidx.compose.runtime.Composer r121, int r122) {
        /*
            Method dump skipped, instructions count: 2380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.InvitationCardMakerScreen$lambda$384$lambda$383$lambda$357$lambda$354(com.example.ui.tools.design.InvitationTheme, androidx.compose.runtime.MutableState, androidx.activity.compose.ManagedActivityResultLauncher, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$lambda$384$lambda$383$lambda$357$lambda$354$lambda$353$lambda$352$lambda$348$lambda$347(ManagedActivityResultLauncher $celebrantPhotoPicker) {
        $celebrantPhotoPicker.launch(PickVisualMediaRequestKt.PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE, 0, false, null, 14, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$lambda$384$lambda$383$lambda$357$lambda$354$lambda$353$lambda$352$lambda$349(MutableState $celebrantBitmap$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C2004@109438L104,2005@109583L28,2006@109652L120:DesignTools.kt#x08fh6");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(822883483, $changed, -1, "com.example.ui.tools.design.InvitationCardMakerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DesignTools.kt:2004)");
            }
            IconKt.m2153Iconww6aTOc(androidx.compose.material.icons.filled.ImageKt.getImage(Icons.Filled.INSTANCE), (String) null, SizeKt.m718size3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(18)), Color.INSTANCE.m4188getBlack0d7_KjU(), $composer, 3504, 0);
            SpacerKt.Spacer(SizeKt.m723width3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(6)), $composer, 6);
            TextKt.m2696Text4IGK_g(InvitationCardMakerScreen$lambda$300($celebrantBitmap$delegate) != null ? "Change Photo" : "Upload Photo", (Modifier) null, Color.INSTANCE.m4188getBlack0d7_KjU(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196992, 0, 131034);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$lambda$384$lambda$383$lambda$357$lambda$354$lambda$353$lambda$352$lambda$351$lambda$350(MutableState $celebrantBitmap$delegate, MutableState $celebrantPhotoUri$delegate) {
        $celebrantBitmap$delegate.setValue(null);
        $celebrantPhotoUri$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$lambda$384$lambda$383$lambda$357$lambda$356$lambda$355(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$lambda$384$lambda$383$lambda$366$lambda$363$lambda$359$lambda$358(int $index, MutableIntState $selectedThemeIndex$delegate, MutableState $hasWatermark$delegate) {
        $selectedThemeIndex$delegate.setIntValue($index);
        InvitationCardMakerScreen$lambda$295($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit InvitationCardMakerScreen$lambda$384$lambda$383$lambda$366$lambda$363$lambda$362(com.example.ui.tools.design.InvitationTheme r71, int r72, androidx.compose.runtime.MutableIntState r73, androidx.compose.foundation.layout.ColumnScope r74, androidx.compose.runtime.Composer r75, int r76) {
        /*
            Method dump skipped, instructions count: 983
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.InvitationCardMakerScreen$lambda$384$lambda$383$lambda$366$lambda$363$lambda$362(com.example.ui.tools.design.InvitationTheme, int, androidx.compose.runtime.MutableIntState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$lambda$384$lambda$383$lambda$366$lambda$365$lambda$364(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0555 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit InvitationCardMakerScreen$lambda$384$lambda$383$lambda$382$lambda$372(com.example.ui.tools.design.InvitationTheme r112, androidx.compose.runtime.MutableState r113, androidx.compose.runtime.MutableState r114, androidx.compose.runtime.MutableState r115, androidx.compose.runtime.MutableState r116, androidx.compose.runtime.MutableState r117, androidx.compose.runtime.MutableState r118, androidx.compose.runtime.MutableState r119, androidx.compose.runtime.MutableState r120, androidx.compose.runtime.MutableState r121, androidx.compose.foundation.layout.ColumnScope r122, androidx.compose.runtime.Composer r123, int r124) {
        /*
            Method dump skipped, instructions count: 2382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.InvitationCardMakerScreen$lambda$384$lambda$383$lambda$382$lambda$372(com.example.ui.tools.design.InvitationTheme, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$lambda$384$lambda$383$lambda$382$lambda$374$lambda$373(Activity $activity, InvitationTheme $activeTheme, Context $context, MutableState $selectedEvent$delegate, MutableState $hostName$delegate, MutableState $eventTitle$delegate, MutableState $date$delegate, MutableState $time$delegate, MutableState $venue$delegate, MutableState $rsvp$delegate, MutableState $celebrantBitmap$delegate, MutableState $hasWatermark$delegate) {
        InvitationCardMakerScreen$saveWithoutWatermarkViaAd$306($activity, $activeTheme, $context, $selectedEvent$delegate, $hostName$delegate, $eventTitle$delegate, $date$delegate, $time$delegate, $venue$delegate, $rsvp$delegate, $celebrantBitmap$delegate, $hasWatermark$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$lambda$384$lambda$383$lambda$382$lambda$376$lambda$375(Activity $activity, InvitationTheme $activeTheme, Context $context, MutableState $selectedEvent$delegate, MutableState $hostName$delegate, MutableState $eventTitle$delegate, MutableState $date$delegate, MutableState $time$delegate, MutableState $venue$delegate, MutableState $rsvp$delegate, MutableState $celebrantBitmap$delegate, MutableState $hasWatermark$delegate) {
        InvitationCardMakerScreen$saveWithoutWatermarkViaAd$306($activity, $activeTheme, $context, $selectedEvent$delegate, $hostName$delegate, $eventTitle$delegate, $date$delegate, $time$delegate, $venue$delegate, $rsvp$delegate, $celebrantBitmap$delegate, $hasWatermark$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$lambda$384$lambda$383$lambda$382$lambda$381$lambda$378$lambda$377(InvitationTheme $activeTheme, Context $context, MutableState $selectedEvent$delegate, MutableState $hostName$delegate, MutableState $eventTitle$delegate, MutableState $date$delegate, MutableState $time$delegate, MutableState $venue$delegate, MutableState $rsvp$delegate, MutableState $celebrantBitmap$delegate) {
        Bitmap bmp = renderInvitationBitmap(InvitationCardMakerScreen$lambda$267($selectedEvent$delegate), InvitationCardMakerScreen$lambda$270($hostName$delegate), InvitationCardMakerScreen$lambda$273($eventTitle$delegate), InvitationCardMakerScreen$lambda$276($date$delegate), InvitationCardMakerScreen$lambda$279($time$delegate), InvitationCardMakerScreen$lambda$282($venue$delegate), InvitationCardMakerScreen$lambda$285($rsvp$delegate), InvitationCardMakerScreen$lambda$300($celebrantBitmap$delegate), $activeTheme, true);
        ImageExportUtils.INSTANCE.saveBitmapToGallery($context, bmp, "InvitationCard_Free");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InvitationCardMakerScreen$lambda$384$lambda$383$lambda$382$lambda$381$lambda$380$lambda$379(InvitationTheme $activeTheme, Context $context, MutableState $selectedEvent$delegate, MutableState $hostName$delegate, MutableState $eventTitle$delegate, MutableState $date$delegate, MutableState $time$delegate, MutableState $venue$delegate, MutableState $rsvp$delegate, MutableState $celebrantBitmap$delegate) {
        Bitmap bmp = renderInvitationBitmap(InvitationCardMakerScreen$lambda$267($selectedEvent$delegate), InvitationCardMakerScreen$lambda$270($hostName$delegate), InvitationCardMakerScreen$lambda$273($eventTitle$delegate), InvitationCardMakerScreen$lambda$276($date$delegate), InvitationCardMakerScreen$lambda$279($time$delegate), InvitationCardMakerScreen$lambda$282($venue$delegate), InvitationCardMakerScreen$lambda$285($rsvp$delegate), InvitationCardMakerScreen$lambda$300($celebrantBitmap$delegate), $activeTheme, true);
        ImageExportUtils.INSTANCE.shareBitmap($context, bmp, "Invitation - " + InvitationCardMakerScreen$lambda$273($eventTitle$delegate));
        return Unit.INSTANCE;
    }

    private static final Bitmap renderInvitationBitmap(String event, String host, String title, String date, String time, String venue, String rsvp, Bitmap celebrantBitmap, InvitationTheme theme, boolean hasWatermark) {
        float f;
        float nextY;
        Bitmap bitmap = Bitmap.createBitmap(1080, 1350, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmap);
        Paint bgPaint = new Paint();
        bgPaint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 1350, new int[]{ColorKt.m4216toArgb8_81llA(((Color) CollectionsKt.first((List) theme.getBgColors())).m4172unboximpl()), ColorKt.m4216toArgb8_81llA(((Color) CollectionsKt.last((List) theme.getBgColors())).m4172unboximpl())}, (float[]) null, Shader.TileMode.CLAMP));
        canvas.drawRect(0.0f, 0.0f, 1080, 1350, bgPaint);
        Paint paint = new Paint();
        paint.setColor(ColorKt.m4216toArgb8_81llA(theme.m7102getBorderColor0d7_KjU()));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10.0f);
        canvas.drawRoundRect(new RectF(30.0f, 30.0f, 1080 - 30.0f, 1350 - 30.0f), 30.0f, 30.0f, paint);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setColor(ColorKt.m4216toArgb8_81llA(theme.m7103getHeaderColor0d7_KjU()));
        paint2.setTextSize(32.0f);
        paint2.setFakeBoldText(true);
        String upperCase = host.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        canvas.drawText(upperCase + " CORDIALLY INVITES YOU", 1080 / 2.0f, 120.0f, paint2);
        paint2.setColor(ColorKt.m4216toArgb8_81llA(theme.m7101getAccentColor0d7_KjU()));
        paint2.setTextSize(38.0f);
        canvas.drawText(event, 1080 / 2.0f, 190.0f, paint2);
        if (celebrantBitmap != null) {
            f = 38.0f;
            drawCircularBitmap(canvas, celebrantBitmap, 1080 / 2.0f, 370.0f, 140.0f, ColorKt.m4216toArgb8_81llA(theme.m7102getBorderColor0d7_KjU()), 10.0f);
            nextY = 600.0f;
        } else {
            f = 38.0f;
            nextY = 320.0f;
        }
        paint2.setColor(ColorKt.m4216toArgb8_81llA(theme.m7104getTitleColor0d7_KjU()));
        paint2.setTextSize(58.0f);
        paint2.setFakeBoldText(true);
        canvas.drawText(title, 1080 / 2.0f, nextY, paint2);
        paint2.setColor(ColorKt.m4216toArgb8_81llA(theme.m7101getAccentColor0d7_KjU()));
        paint2.setTextSize(f);
        paint2.setFakeBoldText(false);
        canvas.drawText("🗓  " + date, 1080 / 2.0f, 110.0f + nextY, paint2);
        paint2.setColor(android.graphics.Color.argb(230, 255, 255, 255));
        paint2.setTextSize(34.0f);
        canvas.drawText("⏰  " + time, 1080 / 2.0f, nextY + 180.0f, paint2);
        paint2.setColor(-1);
        paint2.setTextSize(34.0f);
        canvas.drawText("📍  " + venue, 1080 / 2.0f, nextY + 270.0f, paint2);
        paint2.setColor(ColorKt.m4216toArgb8_81llA(theme.m7103getHeaderColor0d7_KjU()));
        paint2.setTextSize(32.0f);
        paint2.setFakeBoldText(true);
        canvas.drawText(rsvp, 1080 / 2.0f, 360.0f + nextY, paint2);
        if (!hasWatermark) {
            return bitmap;
        }
        Paint wmBg = new Paint();
        wmBg.setColor(android.graphics.Color.argb(160, 0, 0, 0));
        Paint paint3 = new Paint();
        paint3.setColor(-1);
        paint3.setTextSize(28.0f);
        paint3.setFakeBoldText(true);
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setAntiAlias(true);
        float nextY2 = 1350;
        canvas.drawRoundRect(new RectF((1080 / 2.0f) - 240.0f, nextY2 - 70.0f, (1080 / 2.0f) + 240.0f, 1350 - 20.0f), 14.0f, 14.0f, wmBg);
        canvas.drawText("⚡ Created with OmniTools App", 1080 / 2.0f, 1350 - 36.0f, paint3);
        return bitmap;
    }

    public static final void ReelsMakerScreen(final Function0<Unit> onBack, Composer $composer, final int $changed) {
        Object obj;
        final Context context;
        Object obj2;
        int i;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer $composer2 = $composer.startRestartGroup(1519456894);
        ComposerKt.sourceInformation($composer2, "C(ReelsMakerScreen)2366@127589L12,2366@127577L24,2367@127633L7,2380@128693L38,2381@128756L77,2382@128858L75,2383@128952L49,2384@129032L33,2385@129089L33,2386@129147L33,2409@130202L1776,2443@131985L16632,2408@130175L18442:DesignTools.kt#x08fh6");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(onBack) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1519456894, $dirty, -1, "com.example.ui.tools.design.ReelsMakerScreen (DesignTools.kt:2365)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -90801942, "CC(remember):DesignTools.kt#9igjgp");
            boolean z = ($dirty & 14) == 4;
            Object rememberedValue = $composer2.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DesignToolsKt.ReelsMakerScreen$lambda$392$lambda$391(Function0.this);
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
            Context context2 = (Context) consume;
            final Activity activity = context2 instanceof Activity ? (Activity) context2 : null;
            final List badges = CollectionsKt.listOf((Object[]) new String[]{"HOT TIP 🔥", "MINDSET 🚀", "DID YOU KNOW? 💡", "DAILY MOTIVATION ✨", "TRENDING 📈", "SECRETS 🤫"});
            final List themes = CollectionsKt.listOf((Object[]) new ReelTheme[]{new ReelTheme("Neon Cyber", CollectionsKt.listOf((Object[]) new Color[]{Color.m4152boximpl(ColorKt.Color(4279179050L)), Color.m4152boximpl(ColorKt.Color(4280163147L)), Color.m4152boximpl(ColorKt.Color(4281413249L))}), ColorKt.Color(4293675161L), ColorKt.Color(4287874557L), null), new ReelTheme("Sunset Passion", CollectionsKt.listOf((Object[]) new Color[]{Color.m4152boximpl(ColorKt.Color(4282586119L)), Color.m4152boximpl(ColorKt.Color(4286328082L)), Color.m4152boximpl(ColorKt.Color(4290920716L))}), ColorKt.Color(4294538006L), ColorKt.Color(4294829706L), null), new ReelTheme("Royal Violet", CollectionsKt.listOf((Object[]) new Color[]{Color.m4152boximpl(ColorKt.Color(4280163147L)), Color.m4152boximpl(ColorKt.Color(4283178389L)), Color.m4152boximpl(ColorKt.Color(4285343961L))}), ColorKt.Color(4289222135L), ColorKt.Color(4292728574L), null), new ReelTheme("Emerald Glow", CollectionsKt.listOf((Object[]) new Color[]{Color.m4152boximpl(ColorKt.Color(4278332450L)), Color.m4152boximpl(ColorKt.Color(4278603323L)), Color.m4152boximpl(ColorKt.Color(4278483031L))}), ColorKt.Color(4279286145L), ColorKt.Color(4289197008L), null), new ReelTheme("Crimson Strike", CollectionsKt.listOf((Object[]) new Color[]{Color.m4152boximpl(ColorKt.Color(4282714634L)), Color.m4152boximpl(ColorKt.Color(4286520605L)), Color.m4152boximpl(ColorKt.Color(4288224027L))}), ColorKt.Color(4293870660L), ColorKt.Color(4294888138L), null), new ReelTheme("Carbon Stealth", CollectionsKt.listOf((Object[]) new Color[]{Color.m4152boximpl(ColorKt.Color(4278782219L)), Color.m4152boximpl(ColorKt.Color(4279769115L)), Color.m4152boximpl(ColorKt.Color(4280756010L))}), ColorKt.Color(4281908728L), ColorKt.Color(4293060848L), null)});
            ComposerKt.sourceInformationMarkerStart($composer2, -90766588, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue2 = $composer2.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                context = context2;
                obj2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(badges.get(0), null, 2, null);
                $composer2.updateRememberedValue(obj2);
            } else {
                context = context2;
                obj2 = rememberedValue2;
            }
            final MutableState selectedBadge$delegate = (MutableState) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -90764533, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue3 = $composer2.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                i = 0;
                obj3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("5 Habits That Will Change Your Life in 30 Days", null, 2, null);
                $composer2.updateRememberedValue(obj3);
            } else {
                i = 0;
                obj3 = rememberedValue3;
            }
            final MutableState hookHeadline$delegate = (MutableState) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -90761271, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue4 = $composer2.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                obj4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("Save this reel so you don't forget it later!", null, 2, null);
                $composer2.updateRememberedValue(obj4);
            } else {
                obj4 = rememberedValue4;
            }
            final MutableState subtitleText$delegate = (MutableState) obj4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -90758289, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue5 = $composer2.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                obj5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("@yourcreatorhandle", null, 2, null);
                $composer2.updateRememberedValue(obj5);
            } else {
                obj5 = rememberedValue5;
            }
            final MutableState handle$delegate = (MutableState) obj5;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -90755745, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue6 = $composer2.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                obj6 = SnapshotIntStateKt.mutableIntStateOf(i);
                $composer2.updateRememberedValue(obj6);
            } else {
                obj6 = rememberedValue6;
            }
            final MutableIntState selectedThemeIndex$delegate = (MutableIntState) obj6;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -90753921, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue7 = $composer2.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                obj7 = SnapshotIntStateKt.mutableIntStateOf(i);
                $composer2.updateRememberedValue(obj7);
            } else {
                obj7 = rememberedValue7;
            }
            final MutableIntState selectedTab$delegate = (MutableIntState) obj7;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -90752065, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue8 = $composer2.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                obj8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                $composer2.updateRememberedValue(obj8);
            } else {
                obj8 = rememberedValue8;
            }
            final MutableState hasWatermark$delegate = (MutableState) obj8;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final ReelTheme activeTheme = (ReelTheme) themes.get(ReelsMakerScreen$lambda$406(selectedThemeIndex$delegate));
            ScaffoldKt.m2411ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(1454234690, true, new Function2() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda32
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj9, Object obj10) {
                    return DesignToolsKt.ReelsMakerScreen$lambda$426(Function0.this, selectedTab$delegate, (Composer) obj9, ((Integer) obj10).intValue());
                }
            }, $composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(1826396365, true, new Function3() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj9, Object obj10, Object obj11) {
                    return DesignToolsKt.ReelsMakerScreen$lambda$472(MutableIntState.this, activeTheme, hookHeadline$delegate, badges, selectedBadge$delegate, hasWatermark$delegate, subtitleText$delegate, handle$delegate, themes, selectedThemeIndex$delegate, activity, context, (PaddingValues) obj9, (Composer) obj10, ((Integer) obj11).intValue());
                }
            }, $composer2, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj9, Object obj10) {
                    return DesignToolsKt.ReelsMakerScreen$lambda$473(Function0.this, $changed, (Composer) obj9, ((Integer) obj10).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ReelsMakerScreen$lambda$392$lambda$391(Function0 $onBack) {
        $onBack.invoke();
        return Unit.INSTANCE;
    }

    private static final String ReelsMakerScreen$lambda$394(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String ReelsMakerScreen$lambda$397(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String ReelsMakerScreen$lambda$400(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String ReelsMakerScreen$lambda$403(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final int ReelsMakerScreen$lambda$406(MutableIntState $selectedThemeIndex$delegate) {
        return $selectedThemeIndex$delegate.getIntValue();
    }

    private static final int ReelsMakerScreen$lambda$409(MutableIntState $selectedTab$delegate) {
        return $selectedTab$delegate.getIntValue();
    }

    private static final boolean ReelsMakerScreen$lambda$412(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ReelsMakerScreen$lambda$413(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final void ReelsMakerScreen$saveWithoutWatermarkViaAd$416(Activity activity, final ReelTheme activeTheme, final Context context, final MutableState<String> mutableState, final MutableState<String> mutableState2, final MutableState<String> mutableState3, final MutableState<String> mutableState4, final MutableState<Boolean> mutableState5) {
        if (activity != null) {
            AdManager.INSTANCE.showRewardedAd(activity, new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DesignToolsKt.ReelsMakerScreen$saveWithoutWatermarkViaAd$416$lambda$414(ReelTheme.this, context, mutableState, mutableState2, mutableState3, mutableState4, mutableState5);
                }
            }, new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DesignToolsKt.ReelsMakerScreen$saveWithoutWatermarkViaAd$416$lambda$415(MutableState.this);
                }
            });
        } else {
            Bitmap cleanBmp = renderReelBitmap(ReelsMakerScreen$lambda$394(mutableState), ReelsMakerScreen$lambda$397(mutableState2), ReelsMakerScreen$lambda$400(mutableState3), ReelsMakerScreen$lambda$403(mutableState4), activeTheme, false);
            ImageExportUtils.INSTANCE.saveBitmapToGallery(context, cleanBmp, "Reel_NoWatermark");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ReelsMakerScreen$saveWithoutWatermarkViaAd$416$lambda$414(ReelTheme $activeTheme, Context $context, MutableState $selectedBadge$delegate, MutableState $hookHeadline$delegate, MutableState $subtitleText$delegate, MutableState $handle$delegate, MutableState $hasWatermark$delegate) {
        Bitmap cleanBmp = renderReelBitmap(ReelsMakerScreen$lambda$394($selectedBadge$delegate), ReelsMakerScreen$lambda$397($hookHeadline$delegate), ReelsMakerScreen$lambda$400($subtitleText$delegate), ReelsMakerScreen$lambda$403($handle$delegate), $activeTheme, false);
        ImageExportUtils.INSTANCE.saveBitmapToGallery($context, cleanBmp, "Reel_NoWatermark");
        Toast.makeText($context, "Saved without watermark! Next reel will require watching video ad again.", 1).show();
        ReelsMakerScreen$lambda$413($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ReelsMakerScreen$saveWithoutWatermarkViaAd$416$lambda$415(MutableState $hasWatermark$delegate) {
        ReelsMakerScreen$lambda$413($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ReelsMakerScreen$lambda$426(final kotlin.jvm.functions.Function0 r41, final androidx.compose.runtime.MutableIntState r42, androidx.compose.runtime.Composer r43, int r44) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.ReelsMakerScreen$lambda$426(kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ReelsMakerScreen$lambda$426$lambda$425$lambda$417(Function0 $onBack, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C2414@130376L155:DesignTools.kt#x08fh6");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1542310834, $changed, -1, "com.example.ui.tools.design.ReelsMakerScreen.<anonymous>.<anonymous>.<anonymous> (DesignTools.kt:2414)");
            }
            IconButtonKt.IconButton($onBack, null, false, null, null, ComposableSingletons$DesignToolsKt.INSTANCE.m7082getLambda$532807755$app(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ReelsMakerScreen$lambda$426$lambda$425$lambda$424(final MutableIntState $selectedTab$delegate, Composer $composer, int $changed) {
        Object obj;
        Object obj2;
        Object obj3;
        ComposerKt.sourceInformation($composer, "C2424@130887L19,2422@130795L363,2430@131271L19,2428@131179L364,2436@131656L19,2434@131564L372:DesignTools.kt#x08fh6");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-604385968, $changed, -1, "com.example.ui.tools.design.ReelsMakerScreen.<anonymous>.<anonymous>.<anonymous> (DesignTools.kt:2422)");
            }
            boolean z = ReelsMakerScreen$lambda$409($selectedTab$delegate) == 0;
            ComposerKt.sourceInformationMarkerStart($composer, -994326621, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue = $composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda81
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DesignToolsKt.ReelsMakerScreen$lambda$426$lambda$425$lambda$424$lambda$419$lambda$418(MutableIntState.this);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TabKt.m2582TabwqdebIU(z, (Function0) obj, null, false, ComposableSingletons$DesignToolsKt.INSTANCE.getLambda$591108534$app(), ComposableSingletons$DesignToolsKt.INSTANCE.m7047getLambda$1065999723$app(), 0L, 0L, null, $composer, 221232, 460);
            boolean z2 = ReelsMakerScreen$lambda$409($selectedTab$delegate) == 1;
            ComposerKt.sourceInformationMarkerStart($composer, -994314333, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue2 = $composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda82
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DesignToolsKt.ReelsMakerScreen$lambda$426$lambda$425$lambda$424$lambda$421$lambda$420(MutableIntState.this);
                    }
                };
                $composer.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TabKt.m2582TabwqdebIU(z2, (Function0) obj2, null, false, ComposableSingletons$DesignToolsKt.INSTANCE.getLambda$880739693$app(), ComposableSingletons$DesignToolsKt.INSTANCE.getLambda$1832571532$app(), 0L, 0L, null, $composer, 221232, 460);
            boolean z3 = ReelsMakerScreen$lambda$409($selectedTab$delegate) == 2;
            ComposerKt.sourceInformationMarkerStart($composer, -994302013, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue3 = $composer.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj3 = new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda83
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DesignToolsKt.ReelsMakerScreen$lambda$426$lambda$425$lambda$424$lambda$423$lambda$422(MutableIntState.this);
                    }
                };
                $composer.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TabKt.m2582TabwqdebIU(z3, (Function0) obj3, null, false, ComposableSingletons$DesignToolsKt.INSTANCE.m7073getLambda$1941949010$app(), ComposableSingletons$DesignToolsKt.INSTANCE.m7094getLambda$990117171$app(), 0L, 0L, null, $composer, 221232, 460);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ReelsMakerScreen$lambda$426$lambda$425$lambda$424$lambda$419$lambda$418(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ReelsMakerScreen$lambda$426$lambda$425$lambda$424$lambda$421$lambda$420(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ReelsMakerScreen$lambda$426$lambda$425$lambda$424$lambda$423$lambda$422(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:104:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0955  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0971  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x097f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0961  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0a46  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0a58  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0ab9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0c6f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0d8f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0d9b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0dd2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0e53  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0f73  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0feb  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x106a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x1126  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x1134  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x107a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0ffb  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0f7f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0de8  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0da1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0c7d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x11ac  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x06f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ReelsMakerScreen$lambda$472(final androidx.compose.runtime.MutableIntState r111, final com.example.ui.tools.design.ReelTheme r112, final androidx.compose.runtime.MutableState r113, java.util.List r114, final androidx.compose.runtime.MutableState r115, final androidx.compose.runtime.MutableState r116, final androidx.compose.runtime.MutableState r117, final androidx.compose.runtime.MutableState r118, java.util.List r119, androidx.compose.runtime.MutableIntState r120, android.app.Activity r121, final android.content.Context r122, androidx.compose.foundation.layout.PaddingValues r123, androidx.compose.runtime.Composer r124, int r125) {
        /*
            Method dump skipped, instructions count: 4540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.ReelsMakerScreen$lambda$472(androidx.compose.runtime.MutableIntState, com.example.ui.tools.design.ReelTheme, androidx.compose.runtime.MutableState, java.util.List, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, java.util.List, androidx.compose.runtime.MutableIntState, android.app.Activity, android.content.Context, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ReelsMakerScreen$lambda$472$lambda$471$lambda$445$lambda$428$lambda$427(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ReelsMakerScreen$lambda$472$lambda$471$lambda$445$lambda$431(com.example.ui.tools.design.ReelTheme r71, androidx.compose.runtime.MutableState r72, androidx.compose.runtime.Composer r73, int r74) {
        /*
            Method dump skipped, instructions count: 847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.ReelsMakerScreen$lambda$472$lambda$471$lambda$445$lambda$431(com.example.ui.tools.design.ReelTheme, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ReelsMakerScreen$lambda$472$lambda$471$lambda$445$lambda$436$lambda$435$lambda$433$lambda$432(String $badge, MutableState $selectedBadge$delegate, MutableState $hasWatermark$delegate) {
        $selectedBadge$delegate.setValue($badge);
        ReelsMakerScreen$lambda$413($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ReelsMakerScreen$lambda$472$lambda$471$lambda$445$lambda$436$lambda$435$lambda$434(String $badge, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C2498@134977L11:DesignTools.kt#x08fh6");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(560645928, $changed, -1, "com.example.ui.tools.design.ReelsMakerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DesignTools.kt:2498)");
            }
            TextKt.m2696Text4IGK_g($badge, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ReelsMakerScreen$lambda$472$lambda$471$lambda$445$lambda$438$lambda$437(MutableState $hookHeadline$delegate, MutableState $hasWatermark$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $hookHeadline$delegate.setValue(it);
        ReelsMakerScreen$lambda$413($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ReelsMakerScreen$lambda$472$lambda$471$lambda$445$lambda$440$lambda$439(MutableState $subtitleText$delegate, MutableState $hasWatermark$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $subtitleText$delegate.setValue(it);
        ReelsMakerScreen$lambda$413($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ReelsMakerScreen$lambda$472$lambda$471$lambda$445$lambda$442$lambda$441(MutableState $handle$delegate, MutableState $hasWatermark$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $handle$delegate.setValue(it);
        ReelsMakerScreen$lambda$413($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ReelsMakerScreen$lambda$472$lambda$471$lambda$445$lambda$444$lambda$443(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ReelsMakerScreen$lambda$472$lambda$471$lambda$454$lambda$451$lambda$447$lambda$446(int $index, MutableIntState $selectedThemeIndex$delegate, MutableState $hasWatermark$delegate) {
        $selectedThemeIndex$delegate.setIntValue($index);
        ReelsMakerScreen$lambda$413($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ReelsMakerScreen$lambda$472$lambda$471$lambda$454$lambda$451$lambda$450(com.example.ui.tools.design.ReelTheme r71, int r72, androidx.compose.runtime.MutableIntState r73, androidx.compose.foundation.layout.ColumnScope r74, androidx.compose.runtime.Composer r75, int r76) {
        /*
            Method dump skipped, instructions count: 983
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.ReelsMakerScreen$lambda$472$lambda$471$lambda$454$lambda$451$lambda$450(com.example.ui.tools.design.ReelTheme, int, androidx.compose.runtime.MutableIntState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ReelsMakerScreen$lambda$472$lambda$471$lambda$454$lambda$453$lambda$452(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0565 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ReelsMakerScreen$lambda$472$lambda$471$lambda$470$lambda$460(com.example.ui.tools.design.ReelTheme r103, final androidx.compose.runtime.MutableState r104, androidx.compose.runtime.MutableState r105, androidx.compose.runtime.MutableState r106, androidx.compose.runtime.MutableState r107, androidx.compose.runtime.MutableState r108, androidx.compose.foundation.layout.ColumnScope r109, androidx.compose.runtime.Composer r110, int r111) {
        /*
            Method dump skipped, instructions count: 1725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.ReelsMakerScreen$lambda$472$lambda$471$lambda$470$lambda$460(com.example.ui.tools.design.ReelTheme, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ReelsMakerScreen$lambda$472$lambda$471$lambda$470$lambda$460$lambda$459$lambda$458$lambda$455(MutableState $selectedBadge$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C2639@142670L423:DesignTools.kt#x08fh6");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1458955400, $changed, -1, "com.example.ui.tools.design.ReelsMakerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DesignTools.kt:2639)");
            }
            TextKt.m2696Text4IGK_g(ReelsMakerScreen$lambda$394($selectedBadge$delegate), PaddingKt.m674paddingVpY3zN4(Modifier.INSTANCE, Dp.m6625constructorimpl(12), Dp.m6625constructorimpl(6)), Color.INSTANCE.m4199getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200112, 0, 131024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ReelsMakerScreen$lambda$472$lambda$471$lambda$470$lambda$462$lambda$461(Activity $activity, ReelTheme $activeTheme, Context $context, MutableState $selectedBadge$delegate, MutableState $hookHeadline$delegate, MutableState $subtitleText$delegate, MutableState $handle$delegate, MutableState $hasWatermark$delegate) {
        ReelsMakerScreen$saveWithoutWatermarkViaAd$416($activity, $activeTheme, $context, $selectedBadge$delegate, $hookHeadline$delegate, $subtitleText$delegate, $handle$delegate, $hasWatermark$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ReelsMakerScreen$lambda$472$lambda$471$lambda$470$lambda$464$lambda$463(Activity $activity, ReelTheme $activeTheme, Context $context, MutableState $selectedBadge$delegate, MutableState $hookHeadline$delegate, MutableState $subtitleText$delegate, MutableState $handle$delegate, MutableState $hasWatermark$delegate) {
        ReelsMakerScreen$saveWithoutWatermarkViaAd$416($activity, $activeTheme, $context, $selectedBadge$delegate, $hookHeadline$delegate, $subtitleText$delegate, $handle$delegate, $hasWatermark$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ReelsMakerScreen$lambda$472$lambda$471$lambda$470$lambda$469$lambda$466$lambda$465(ReelTheme $activeTheme, Context $context, MutableState $selectedBadge$delegate, MutableState $hookHeadline$delegate, MutableState $subtitleText$delegate, MutableState $handle$delegate) {
        Bitmap bmp = renderReelBitmap(ReelsMakerScreen$lambda$394($selectedBadge$delegate), ReelsMakerScreen$lambda$397($hookHeadline$delegate), ReelsMakerScreen$lambda$400($subtitleText$delegate), ReelsMakerScreen$lambda$403($handle$delegate), $activeTheme, true);
        ImageExportUtils.INSTANCE.saveBitmapToGallery($context, bmp, "ReelCover_Free");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ReelsMakerScreen$lambda$472$lambda$471$lambda$470$lambda$469$lambda$468$lambda$467(ReelTheme $activeTheme, Context $context, MutableState $selectedBadge$delegate, MutableState $hookHeadline$delegate, MutableState $subtitleText$delegate, MutableState $handle$delegate) {
        Bitmap bmp = renderReelBitmap(ReelsMakerScreen$lambda$394($selectedBadge$delegate), ReelsMakerScreen$lambda$397($hookHeadline$delegate), ReelsMakerScreen$lambda$400($subtitleText$delegate), ReelsMakerScreen$lambda$403($handle$delegate), $activeTheme, true);
        ImageExportUtils.INSTANCE.shareBitmap($context, bmp, "Reel Story - " + ReelsMakerScreen$lambda$397($hookHeadline$delegate));
        return Unit.INSTANCE;
    }

    private static final Bitmap renderReelBitmap(String badge, String hook, String subtitle, String handle, ReelTheme theme, boolean hasWatermark) {
        Bitmap bitmap = Bitmap.createBitmap(1080, 1920, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmap);
        Paint bgPaint = new Paint();
        bgPaint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 1920, new int[]{ColorKt.m4216toArgb8_81llA(((Color) CollectionsKt.first((List) theme.getBgColors())).m4172unboximpl()), ColorKt.m4216toArgb8_81llA(((Color) CollectionsKt.last((List) theme.getBgColors())).m4172unboximpl())}, (float[]) null, Shader.TileMode.CLAMP));
        canvas.drawRect(0.0f, 0.0f, 1080, 1920, bgPaint);
        Paint badgePaint = new Paint();
        badgePaint.setColor(ColorKt.m4216toArgb8_81llA(theme.m7109getBadgeColor0d7_KjU()));
        canvas.drawRoundRect(new RectF((1080 / 2.0f) - 240.0f, 220.0f, (1080 / 2.0f) + 240.0f, 310.0f), 25.0f, 25.0f, badgePaint);
        Paint badgeTextPaint = new Paint();
        badgeTextPaint.setColor(-1);
        badgeTextPaint.setTextSize(38.0f);
        badgeTextPaint.setFakeBoldText(true);
        badgeTextPaint.setTextAlign(Paint.Align.CENTER);
        badgeTextPaint.setAntiAlias(true);
        canvas.drawText(badge, 1080 / 2.0f, 280.0f, badgeTextPaint);
        Paint hookPaint = new Paint();
        hookPaint.setColor(-1);
        hookPaint.setTextSize(72.0f);
        hookPaint.setFakeBoldText(true);
        hookPaint.setTextAlign(Paint.Align.CENTER);
        hookPaint.setAntiAlias(true);
        List<String> words = StringsKt.split$default((CharSequence) hook, new String[]{" "}, false, 0, 6, (Object) null);
        List lines = new ArrayList();
        String curr = "";
        for (String w : words) {
            if ((curr + w).length() > 22) {
                lines.add(curr);
                curr = w + " ";
            } else {
                curr = curr + w + " ";
            }
        }
        if (!StringsKt.isBlank(curr)) {
            lines.add(curr);
        }
        int i = 0;
        for (Object obj : lines) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            canvas.drawText(StringsKt.trim((CharSequence) obj).toString(), 1080 / 2.0f, (i * 90.0f) + 850.0f, hookPaint);
            i = i2;
            badgePaint = badgePaint;
            bitmap = bitmap;
            badgeTextPaint = badgeTextPaint;
        }
        Bitmap bitmap2 = bitmap;
        Paint subPaint = new Paint();
        subPaint.setColor(ColorKt.m4216toArgb8_81llA(theme.m7110getSubtitleColor0d7_KjU()));
        subPaint.setTextSize(42.0f);
        subPaint.setTextAlign(Paint.Align.CENTER);
        subPaint.setAntiAlias(true);
        canvas.drawText(subtitle, 1080 / 2.0f, (lines.size() * 90.0f) + 850.0f + 60.0f, subPaint);
        Paint handlePaint = new Paint();
        handlePaint.setColor(android.graphics.Color.argb(180, 255, 255, 255));
        handlePaint.setTextSize(38.0f);
        handlePaint.setTextAlign(Paint.Align.CENTER);
        handlePaint.setAntiAlias(true);
        canvas.drawText(handle, 1080 / 2.0f, 1920 - 160.0f, handlePaint);
        if (hasWatermark) {
            Paint paint = new Paint();
            paint.setColor(android.graphics.Color.argb(160, 0, 0, 0));
            Paint paint2 = new Paint();
            paint2.setColor(-1);
            paint2.setTextSize(28.0f);
            paint2.setFakeBoldText(true);
            paint2.setTextAlign(Paint.Align.CENTER);
            paint2.setAntiAlias(true);
            canvas.drawRoundRect(new RectF((1080 / 2.0f) - 240.0f, 1920 - 90.0f, (1080 / 2.0f) + 240.0f, 1920 - 35.0f), 16.0f, 16.0f, paint);
            canvas.drawText("⚡ Made with OmniTools App", 1080 / 2.0f, 1920 - 52.0f, paint2);
        }
        return bitmap2;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x05c4  */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void YouTubeThumbnailMakerScreen(final kotlin.jvm.functions.Function0<kotlin.Unit> r51, androidx.compose.runtime.Composer r52, final int r53) {
        /*
            Method dump skipped, instructions count: 1494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.YouTubeThumbnailMakerScreen(kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeThumbnailMakerScreen$lambda$484$lambda$483(Function0 $onBack) {
        $onBack.invoke();
        return Unit.INSTANCE;
    }

    private static final String YouTubeThumbnailMakerScreen$lambda$486(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String YouTubeThumbnailMakerScreen$lambda$489(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String YouTubeThumbnailMakerScreen$lambda$492(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final int YouTubeThumbnailMakerScreen$lambda$495(MutableIntState $selectedBgIndex$delegate) {
        return $selectedBgIndex$delegate.getIntValue();
    }

    private static final int YouTubeThumbnailMakerScreen$lambda$498(MutableIntState $selectedTab$delegate) {
        return $selectedTab$delegate.getIntValue();
    }

    private static final boolean YouTubeThumbnailMakerScreen$lambda$501(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void YouTubeThumbnailMakerScreen$lambda$502(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean YouTubeThumbnailMakerScreen$lambda$504(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void YouTubeThumbnailMakerScreen$lambda$505(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final Bitmap YouTubeThumbnailMakerScreen$lambda$510(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeThumbnailMakerScreen$lambda$513$lambda$512(Context $context, MutableState $customBgUri$delegate, MutableState $customBgBitmap$delegate, MutableState $hasWatermark$delegate, Uri uri) {
        if (uri != null) {
            $customBgUri$delegate.setValue(uri);
            try {
                InputStream stream = $context.getContentResolver().openInputStream(uri);
                $customBgBitmap$delegate.setValue(BitmapFactory.decodeStream(stream));
                YouTubeThumbnailMakerScreen$lambda$505($hasWatermark$delegate, true);
            } catch (Exception e) {
                Toast.makeText($context, "Error loading thumbnail background", 0).show();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void YouTubeThumbnailMakerScreen$saveWithoutWatermarkViaAd$516(Activity activity, final ThumbnailBgDesign activeBg, final Context context, final MutableState<String> mutableState, final MutableState<String> mutableState2, final MutableState<String> mutableState3, final MutableState<Bitmap> mutableState4, final MutableState<Boolean> mutableState5) {
        if (activity != null) {
            AdManager.INSTANCE.showRewardedAd(activity, new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DesignToolsKt.YouTubeThumbnailMakerScreen$saveWithoutWatermarkViaAd$516$lambda$514(ThumbnailBgDesign.this, context, mutableState, mutableState2, mutableState3, mutableState4, mutableState5);
                }
            }, new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DesignToolsKt.YouTubeThumbnailMakerScreen$saveWithoutWatermarkViaAd$516$lambda$515(MutableState.this);
                }
            });
        } else {
            Bitmap cleanBmp = renderThumbnailBitmap(YouTubeThumbnailMakerScreen$lambda$486(mutableState), YouTubeThumbnailMakerScreen$lambda$489(mutableState2), YouTubeThumbnailMakerScreen$lambda$492(mutableState3), activeBg, YouTubeThumbnailMakerScreen$lambda$510(mutableState4), false);
            ImageExportUtils.INSTANCE.saveBitmapToGallery(context, cleanBmp, "YTThumbnail_NoWatermark");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeThumbnailMakerScreen$saveWithoutWatermarkViaAd$516$lambda$514(ThumbnailBgDesign $activeBg, Context $context, MutableState $selectedBadge$delegate, MutableState $mainHeadline$delegate, MutableState $secondaryHook$delegate, MutableState $customBgBitmap$delegate, MutableState $hasWatermark$delegate) {
        Bitmap cleanBmp = renderThumbnailBitmap(YouTubeThumbnailMakerScreen$lambda$486($selectedBadge$delegate), YouTubeThumbnailMakerScreen$lambda$489($mainHeadline$delegate), YouTubeThumbnailMakerScreen$lambda$492($secondaryHook$delegate), $activeBg, YouTubeThumbnailMakerScreen$lambda$510($customBgBitmap$delegate), false);
        ImageExportUtils.INSTANCE.saveBitmapToGallery($context, cleanBmp, "YTThumbnail_NoWatermark");
        Toast.makeText($context, "Saved without watermark! Next thumbnail will require watching video ad again.", 1).show();
        YouTubeThumbnailMakerScreen$lambda$505($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeThumbnailMakerScreen$saveWithoutWatermarkViaAd$516$lambda$515(MutableState $hasWatermark$delegate) {
        YouTubeThumbnailMakerScreen$lambda$505($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit YouTubeThumbnailMakerScreen$lambda$526(final kotlin.jvm.functions.Function0 r41, final androidx.compose.runtime.MutableIntState r42, androidx.compose.runtime.Composer r43, int r44) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.YouTubeThumbnailMakerScreen$lambda$526(kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeThumbnailMakerScreen$lambda$526$lambda$525$lambda$517(Function0 $onBack, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C2918@156213L155:DesignTools.kt#x08fh6");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1550400438, $changed, -1, "com.example.ui.tools.design.YouTubeThumbnailMakerScreen.<anonymous>.<anonymous>.<anonymous> (DesignTools.kt:2918)");
            }
            IconButtonKt.IconButton($onBack, null, false, null, null, ComposableSingletons$DesignToolsKt.INSTANCE.getLambda$851802067$app(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeThumbnailMakerScreen$lambda$526$lambda$525$lambda$524(final MutableIntState $selectedTab$delegate, Composer $composer, int $changed) {
        Object obj;
        Object obj2;
        Object obj3;
        ComposerKt.sourceInformation($composer, "C2928@156724L19,2926@156632L367,2934@157112L19,2932@157020L376,2940@157509L19,2938@157417L372:DesignTools.kt#x08fh6");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(237415256, $changed, -1, "com.example.ui.tools.design.YouTubeThumbnailMakerScreen.<anonymous>.<anonymous>.<anonymous> (DesignTools.kt:2926)");
            }
            boolean z = YouTubeThumbnailMakerScreen$lambda$498($selectedTab$delegate) == 0;
            ComposerKt.sourceInformationMarkerStart($composer, 522797995, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue = $composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda36
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DesignToolsKt.YouTubeThumbnailMakerScreen$lambda$526$lambda$525$lambda$524$lambda$519$lambda$518(MutableIntState.this);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TabKt.m2582TabwqdebIU(z, (Function0) obj, null, false, ComposableSingletons$DesignToolsKt.INSTANCE.getLambda$81085234$app(), ComposableSingletons$DesignToolsKt.INSTANCE.m7088getLambda$755709709$app(), 0L, 0L, null, $composer, 221232, 460);
            boolean z2 = YouTubeThumbnailMakerScreen$lambda$498($selectedTab$delegate) == 1;
            ComposerKt.sourceInformationMarkerStart($composer, 522810411, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue2 = $composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda37
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DesignToolsKt.YouTubeThumbnailMakerScreen$lambda$526$lambda$525$lambda$524$lambda$521$lambda$520(MutableIntState.this);
                    }
                };
                $composer.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TabKt.m2582TabwqdebIU(z2, (Function0) obj2, null, false, ComposableSingletons$DesignToolsKt.INSTANCE.getLambda$1540239131$app(), ComposableSingletons$DesignToolsKt.INSTANCE.getLambda$539183260$app(), 0L, 0L, null, $composer, 221232, 460);
            boolean z3 = YouTubeThumbnailMakerScreen$lambda$498($selectedTab$delegate) == 2;
            ComposerKt.sourceInformationMarkerStart($composer, 522823115, "CC(remember):DesignTools.kt#9igjgp");
            Object rememberedValue3 = $composer.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj3 = new Function0() { // from class: com.example.ui.tools.design.DesignToolsKt$$ExternalSyntheticLambda38
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DesignToolsKt.YouTubeThumbnailMakerScreen$lambda$526$lambda$525$lambda$524$lambda$523$lambda$522(MutableIntState.this);
                    }
                };
                $composer.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TabKt.m2582TabwqdebIU(z3, (Function0) obj3, null, false, ComposableSingletons$DesignToolsKt.INSTANCE.m7067getLambda$1802896326$app(), ComposableSingletons$DesignToolsKt.INSTANCE.getLambda$1491015099$app(), 0L, 0L, null, $composer, 221232, 460);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeThumbnailMakerScreen$lambda$526$lambda$525$lambda$524$lambda$519$lambda$518(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeThumbnailMakerScreen$lambda$526$lambda$525$lambda$524$lambda$521$lambda$520(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeThumbnailMakerScreen$lambda$526$lambda$525$lambda$524$lambda$523$lambda$522(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:108:0x09af  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0b50  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0b62  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0bc3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0d84  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0ea0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0eac  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0ee3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0f64  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x1084  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x10fb  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x11b7  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x11c3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x110b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x1090  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0ef9  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0eb2  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0d92  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x1239  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x076a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit YouTubeThumbnailMakerScreen$lambda$583(final androidx.compose.runtime.MutableIntState r108, final com.example.ui.tools.design.ThumbnailBgDesign r109, final androidx.compose.runtime.MutableState r110, java.util.List r111, final androidx.compose.runtime.MutableState r112, final androidx.compose.runtime.MutableState r113, final androidx.compose.runtime.MutableState r114, java.util.List r115, final androidx.activity.compose.ManagedActivityResultLauncher r116, final androidx.compose.runtime.MutableState r117, final androidx.compose.runtime.MutableState r118, androidx.compose.runtime.MutableIntState r119, android.app.Activity r120, final android.content.Context r121, final androidx.compose.runtime.MutableState r122, androidx.compose.foundation.layout.PaddingValues r123, androidx.compose.runtime.Composer r124, int r125) {
        /*
            Method dump skipped, instructions count: 4682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.YouTubeThumbnailMakerScreen$lambda$583(androidx.compose.runtime.MutableIntState, com.example.ui.tools.design.ThumbnailBgDesign, androidx.compose.runtime.MutableState, java.util.List, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, java.util.List, androidx.activity.compose.ManagedActivityResultLauncher, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableIntState, android.app.Activity, android.content.Context, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeThumbnailMakerScreen$lambda$583$lambda$582$lambda$543$lambda$528$lambda$527(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit YouTubeThumbnailMakerScreen$lambda$583$lambda$582$lambda$543$lambda$531(com.example.ui.tools.design.ThumbnailBgDesign r71, androidx.compose.runtime.MutableState r72, androidx.compose.runtime.Composer r73, int r74) {
        /*
            Method dump skipped, instructions count: 847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.YouTubeThumbnailMakerScreen$lambda$583$lambda$582$lambda$543$lambda$531(com.example.ui.tools.design.ThumbnailBgDesign, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeThumbnailMakerScreen$lambda$583$lambda$582$lambda$543$lambda$536$lambda$535$lambda$533$lambda$532(String $badge, MutableState $selectedBadge$delegate, MutableState $hasWatermark$delegate) {
        $selectedBadge$delegate.setValue($badge);
        YouTubeThumbnailMakerScreen$lambda$505($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeThumbnailMakerScreen$lambda$583$lambda$582$lambda$543$lambda$536$lambda$535$lambda$534(String $badge, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C3002@160838L11:DesignTools.kt#x08fh6");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1249090176, $changed, -1, "com.example.ui.tools.design.YouTubeThumbnailMakerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DesignTools.kt:3002)");
            }
            TextKt.m2696Text4IGK_g($badge, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeThumbnailMakerScreen$lambda$583$lambda$582$lambda$543$lambda$538$lambda$537(MutableState $mainHeadline$delegate, MutableState $hasWatermark$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $mainHeadline$delegate.setValue(it);
        YouTubeThumbnailMakerScreen$lambda$505($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeThumbnailMakerScreen$lambda$583$lambda$582$lambda$543$lambda$540$lambda$539(MutableState $secondaryHook$delegate, MutableState $hasWatermark$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $secondaryHook$delegate.setValue(it);
        YouTubeThumbnailMakerScreen$lambda$505($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeThumbnailMakerScreen$lambda$583$lambda$582$lambda$543$lambda$542$lambda$541(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x038f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit YouTubeThumbnailMakerScreen$lambda$583$lambda$582$lambda$560$lambda$551(final androidx.activity.compose.ManagedActivityResultLauncher r95, final androidx.compose.runtime.MutableState r96, final androidx.compose.runtime.MutableState r97, androidx.compose.foundation.layout.ColumnScope r98, androidx.compose.runtime.Composer r99, int r100) {
        /*
            Method dump skipped, instructions count: 1452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.YouTubeThumbnailMakerScreen$lambda$583$lambda$582$lambda$560$lambda$551(androidx.activity.compose.ManagedActivityResultLauncher, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeThumbnailMakerScreen$lambda$583$lambda$582$lambda$560$lambda$551$lambda$550$lambda$547$lambda$546(MutableState $customBgBitmap$delegate, MutableState $customBgUri$delegate) {
        $customBgBitmap$delegate.setValue(null);
        $customBgUri$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeThumbnailMakerScreen$lambda$583$lambda$582$lambda$560$lambda$551$lambda$550$lambda$549$lambda$548(ManagedActivityResultLauncher $customBgPicker) {
        $customBgPicker.launch(PickVisualMediaRequestKt.PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE, 0, false, null, 14, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeThumbnailMakerScreen$lambda$583$lambda$582$lambda$560$lambda$557$lambda$553$lambda$552(int $index, MutableIntState $selectedBgIndex$delegate, MutableState $customBgBitmap$delegate, MutableState $hasWatermark$delegate) {
        $selectedBgIndex$delegate.setIntValue($index);
        $customBgBitmap$delegate.setValue(null);
        YouTubeThumbnailMakerScreen$lambda$505($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0264  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit YouTubeThumbnailMakerScreen$lambda$583$lambda$582$lambda$560$lambda$557$lambda$556(com.example.ui.tools.design.ThumbnailBgDesign r72, int r73, androidx.compose.runtime.MutableIntState r74, androidx.compose.runtime.MutableState r75, androidx.compose.foundation.layout.ColumnScope r76, androidx.compose.runtime.Composer r77, int r78) {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.YouTubeThumbnailMakerScreen$lambda$583$lambda$582$lambda$560$lambda$557$lambda$556(com.example.ui.tools.design.ThumbnailBgDesign, int, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeThumbnailMakerScreen$lambda$583$lambda$582$lambda$560$lambda$559$lambda$558(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0630 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0467 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit YouTubeThumbnailMakerScreen$lambda$583$lambda$582$lambda$581$lambda$568(final com.example.ui.tools.design.ThumbnailBgDesign r100, androidx.compose.runtime.MutableState r101, final androidx.compose.runtime.MutableState r102, final androidx.compose.runtime.MutableState r103, final androidx.compose.runtime.MutableState r104, androidx.compose.runtime.MutableState r105, androidx.compose.runtime.MutableState r106, androidx.compose.foundation.layout.ColumnScope r107, androidx.compose.runtime.Composer r108, int r109) {
        /*
            Method dump skipped, instructions count: 2018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.design.DesignToolsKt.YouTubeThumbnailMakerScreen$lambda$583$lambda$582$lambda$581$lambda$568(com.example.ui.tools.design.ThumbnailBgDesign, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeThumbnailMakerScreen$lambda$583$lambda$582$lambda$581$lambda$568$lambda$567$lambda$566$lambda$561(MutableState $selectedBadge$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C3204@172525L428:DesignTools.kt#x08fh6");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-885296080, $changed, -1, "com.example.ui.tools.design.YouTubeThumbnailMakerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DesignTools.kt:3204)");
            }
            TextKt.m2696Text4IGK_g(YouTubeThumbnailMakerScreen$lambda$486($selectedBadge$delegate), PaddingKt.m674paddingVpY3zN4(Modifier.INSTANCE, Dp.m6625constructorimpl(10), Dp.m6625constructorimpl(4)), Color.INSTANCE.m4199getWhite0d7_KjU(), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200112, 0, 131024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeThumbnailMakerScreen$lambda$583$lambda$582$lambda$581$lambda$568$lambda$567$lambda$566$lambda$564$lambda$562(ThumbnailBgDesign $activeBg, MutableState $mainHeadline$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C3220@173482L353:DesignTools.kt#x08fh6");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(743721638, $changed, -1, "com.example.ui.tools.design.YouTubeThumbnailMakerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DesignTools.kt:3220)");
            }
            TextKt.m2696Text4IGK_g(" " + YouTubeThumbnailMakerScreen$lambda$489($mainHeadline$delegate) + " ", (Modifier) null, $activeBg.m7118getHeadlineTextColor0d7_KjU(), TextUnitKt.getSp(17), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131026);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeThumbnailMakerScreen$lambda$583$lambda$582$lambda$581$lambda$568$lambda$567$lambda$566$lambda$564$lambda$563(MutableState $secondaryHook$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C3231@174157L343:DesignTools.kt#x08fh6");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(772194909, $changed, -1, "com.example.ui.tools.design.YouTubeThumbnailMakerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DesignTools.kt:3231)");
            }
            TextKt.m2696Text4IGK_g(" " + YouTubeThumbnailMakerScreen$lambda$492($secondaryHook$delegate) + " ", (Modifier) null, Color.INSTANCE.m4188getBlack0d7_KjU(), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200064, 0, 131026);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeThumbnailMakerScreen$lambda$583$lambda$582$lambda$581$lambda$570$lambda$569(MutableState $showSafeZone$delegate) {
        YouTubeThumbnailMakerScreen$lambda$502($showSafeZone$delegate, !YouTubeThumbnailMakerScreen$lambda$501($showSafeZone$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeThumbnailMakerScreen$lambda$583$lambda$582$lambda$581$lambda$571(MutableState $showSafeZone$delegate, RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C3283@177143L89,3284@177261L28,3285@177318L87:DesignTools.kt#x08fh6");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1547595993, $changed, -1, "com.example.ui.tools.design.YouTubeThumbnailMakerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DesignTools.kt:3283)");
            }
            IconKt.m2153Iconww6aTOc(VisibilityKt.getVisibility(Icons.Filled.INSTANCE), (String) null, SizeKt.m718size3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(18)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.m723width3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(8)), $composer, 6);
            TextKt.m2696Text4IGK_g(YouTubeThumbnailMakerScreen$lambda$501($showSafeZone$delegate) ? "Hide Timecode Safe-Zone" : "Show YouTube Safe-Zone Overlay", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeThumbnailMakerScreen$lambda$583$lambda$582$lambda$581$lambda$573$lambda$572(Activity $activity, ThumbnailBgDesign $activeBg, Context $context, MutableState $selectedBadge$delegate, MutableState $mainHeadline$delegate, MutableState $secondaryHook$delegate, MutableState $customBgBitmap$delegate, MutableState $hasWatermark$delegate) {
        YouTubeThumbnailMakerScreen$saveWithoutWatermarkViaAd$516($activity, $activeBg, $context, $selectedBadge$delegate, $mainHeadline$delegate, $secondaryHook$delegate, $customBgBitmap$delegate, $hasWatermark$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeThumbnailMakerScreen$lambda$583$lambda$582$lambda$581$lambda$575$lambda$574(Activity $activity, ThumbnailBgDesign $activeBg, Context $context, MutableState $selectedBadge$delegate, MutableState $mainHeadline$delegate, MutableState $secondaryHook$delegate, MutableState $customBgBitmap$delegate, MutableState $hasWatermark$delegate) {
        YouTubeThumbnailMakerScreen$saveWithoutWatermarkViaAd$516($activity, $activeBg, $context, $selectedBadge$delegate, $mainHeadline$delegate, $secondaryHook$delegate, $customBgBitmap$delegate, $hasWatermark$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeThumbnailMakerScreen$lambda$583$lambda$582$lambda$581$lambda$580$lambda$577$lambda$576(ThumbnailBgDesign $activeBg, Context $context, MutableState $selectedBadge$delegate, MutableState $mainHeadline$delegate, MutableState $secondaryHook$delegate, MutableState $customBgBitmap$delegate) {
        Bitmap bmp = renderThumbnailBitmap(YouTubeThumbnailMakerScreen$lambda$486($selectedBadge$delegate), YouTubeThumbnailMakerScreen$lambda$489($mainHeadline$delegate), YouTubeThumbnailMakerScreen$lambda$492($secondaryHook$delegate), $activeBg, YouTubeThumbnailMakerScreen$lambda$510($customBgBitmap$delegate), true);
        ImageExportUtils.INSTANCE.saveBitmapToGallery($context, bmp, "YTThumbnail_Free");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit YouTubeThumbnailMakerScreen$lambda$583$lambda$582$lambda$581$lambda$580$lambda$579$lambda$578(ThumbnailBgDesign $activeBg, Context $context, MutableState $selectedBadge$delegate, MutableState $mainHeadline$delegate, MutableState $secondaryHook$delegate, MutableState $customBgBitmap$delegate) {
        Bitmap bmp = renderThumbnailBitmap(YouTubeThumbnailMakerScreen$lambda$486($selectedBadge$delegate), YouTubeThumbnailMakerScreen$lambda$489($mainHeadline$delegate), YouTubeThumbnailMakerScreen$lambda$492($secondaryHook$delegate), $activeBg, YouTubeThumbnailMakerScreen$lambda$510($customBgBitmap$delegate), true);
        ImageExportUtils.INSTANCE.shareBitmap($context, bmp, "YouTube Thumbnail - " + YouTubeThumbnailMakerScreen$lambda$489($mainHeadline$delegate));
        return Unit.INSTANCE;
    }

    private static final Bitmap renderThumbnailBitmap(String badge, String main, String sub, ThumbnailBgDesign bgDesign, Bitmap customBitmap, boolean hasWatermark) {
        Bitmap bitmap = Bitmap.createBitmap(1280, 720, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmap);
        if (customBitmap != null) {
            Rect srcRect = new Rect(0, 0, customBitmap.getWidth(), customBitmap.getHeight());
            Rect dstRect = new Rect(0, 0, 1280, 720);
            Paint paint = new Paint();
            paint.setFilterBitmap(true);
            canvas.drawBitmap(customBitmap, srcRect, dstRect, paint);
            Paint overlayPaint = new Paint();
            overlayPaint.setColor(android.graphics.Color.argb(120, 0, 0, 0));
            canvas.drawRect(0.0f, 0.0f, 1280, 720, overlayPaint);
        } else {
            Paint bgPaint = new Paint();
            bgPaint.setShader(new LinearGradient(0.0f, 0.0f, 1280, 720, new int[]{ColorKt.m4216toArgb8_81llA(((Color) CollectionsKt.first((List) bgDesign.getColors())).m4172unboximpl()), ColorKt.m4216toArgb8_81llA(bgDesign.getColors().get(1).m4172unboximpl()), ColorKt.m4216toArgb8_81llA(((Color) CollectionsKt.last((List) bgDesign.getColors())).m4172unboximpl())}, (float[]) null, Shader.TileMode.CLAMP));
            canvas.drawRect(0.0f, 0.0f, 1280, 720, bgPaint);
        }
        Paint badgePaint = new Paint();
        badgePaint.setColor(ColorKt.m4216toArgb8_81llA(bgDesign.m7116getBadgeColor0d7_KjU()));
        canvas.drawRoundRect(new RectF(60.0f, 60.0f, 360.0f, 130.0f), 12.0f, 12.0f, badgePaint);
        Paint badgeText = new Paint();
        badgeText.setColor(-1);
        badgeText.setTextSize(34.0f);
        badgeText.setFakeBoldText(true);
        badgeText.setTextAlign(Paint.Align.CENTER);
        badgeText.setAntiAlias(true);
        canvas.drawText(badge, 210.0f, 110.0f, badgeText);
        Paint headlineBarPaint = new Paint();
        headlineBarPaint.setColor(ColorKt.m4216toArgb8_81llA(bgDesign.m7117getHeadlineBarColor0d7_KjU()));
        canvas.drawRoundRect(new RectF(60.0f, 240.0f, 1100.0f, 360.0f), 16.0f, 16.0f, headlineBarPaint);
        Paint mainTextPaint = new Paint();
        mainTextPaint.setColor(ColorKt.m4216toArgb8_81llA(bgDesign.m7118getHeadlineTextColor0d7_KjU()));
        mainTextPaint.setTextSize(62.0f);
        mainTextPaint.setFakeBoldText(true);
        mainTextPaint.setAntiAlias(true);
        canvas.drawText(main, 90.0f, 325.0f, mainTextPaint);
        Paint whitePaint = new Paint();
        whitePaint.setColor(-1);
        canvas.drawRoundRect(new RectF(60.0f, 390.0f, 960.0f, 490.0f), 16.0f, 16.0f, whitePaint);
        Paint subText = new Paint();
        subText.setColor(ViewCompat.MEASURED_STATE_MASK);
        subText.setTextSize(50.0f);
        subText.setFakeBoldText(true);
        subText.setAntiAlias(true);
        canvas.drawText(sub, 90.0f, 460.0f, subText);
        if (!hasWatermark) {
            return bitmap;
        }
        Paint wmBg = new Paint();
        wmBg.setColor(android.graphics.Color.argb(180, 0, 0, 0));
        Paint wmText = new Paint();
        wmText.setColor(-1);
        wmText.setTextSize(28.0f);
        wmText.setFakeBoldText(true);
        wmText.setTextAlign(Paint.Align.CENTER);
        wmText.setAntiAlias(true);
        canvas.drawRoundRect(new RectF((1280 / 2.0f) - 240.0f, 720 - 70.0f, (1280 / 2.0f) + 240.0f, 720 - 20.0f), 14.0f, 14.0f, wmBg);
        canvas.drawText("⚡ Created with OmniTools App", 1280 / 2.0f, 720 - 36.0f, wmText);
        return bitmap;
    }
}
