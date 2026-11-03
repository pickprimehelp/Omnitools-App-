package com.example.ui.tools.fonts;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.Toast;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
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
import com.example.ads.AdManager;
import com.example.util.ImageExportUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: FontsMakerScreen.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\n\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a=\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a/\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0010\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0010\u0010 \u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0010\u0010!\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0010\u0010\"\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0010\u0010#\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0010\u0010$\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0010\u0010%\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0010\u0010&\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0010\u0010'\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0010\u0010(\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0010\u0010)\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006*²\u0006\n\u0010+\u001a\u00020,X\u008a\u008e\u0002²\u0006\n\u0010-\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020,X\u008a\u008e\u0002²\u0006\n\u0010/\u001a\u00020,X\u008a\u008e\u0002²\u0006\n\u00100\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u00101\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u00102\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u00103\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u00104\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u00105\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u00106\u001a\u00020\u0010X\u008a\u008e\u0002"}, d2 = {"FontsMakerScreen", "", "onBack", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "renderFontCardBitmap", "Landroid/graphics/Bitmap;", "text", "", "textColor", "Landroidx/compose/ui/graphics/Color;", "bgColors", "", "fontSize", "", "hasWatermark", "", "renderFontCardBitmap-iJQMabo", "(Ljava/lang/String;JLjava/util/List;FZ)Landroid/graphics/Bitmap;", "renderRgbFontCardBitmap", "rgbColor", "renderRgbFontCardBitmap-RPmYEkk", "(Ljava/lang/String;JFZ)Landroid/graphics/Bitmap;", "convertMathSerifBold", "convertMathSansBold", "convertMathSerifItalic", "convertMathBoldItalic", "convertScript", "convertBoldScript", "convertFraktur", "convertBoldFraktur", "convertDoubleStruck", "convertCircled", "convertCircledFilled", "convertSquared", "convertMonospace", "convertSmallCaps", "convertUpsideDown", "convertStrikethrough", "convertUnderline", "convertSlash", "convertFullwidth", "app", "selectedTab", "", "inputText", "selectedColorIndex", "selectedBgIndex", "fontSizeSp", "fontStyleName", "rgbRed", "rgbGreen", "rgbBlue", "rgbFontSize", "rgbGlowEffect"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FontsMakerScreenKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$173(Function0 function0, int i, Composer composer, int i2) {
        FontsMakerScreen(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r33v2 */
    public static final void FontsMakerScreen(final Function0<Unit> onBack, Composer $composer, final int $changed) {
        Object obj;
        Object obj2;
        int r33 = 1;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Context context;
        Object obj8;
        MutableState hasWatermark$delegate;
        MutableState fontStyleName$delegate;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        MutableFloatState rgbRed$delegate;
        Object obj14;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer $composer2 = $composer.startRestartGroup(2138780756);
        ComposerKt.sourceInformation($composer2, "C(FontsMakerScreen)99@4252L12,99@4240L24,100@4296L7,103@4368L33,104@4474L44,125@5460L33,126@5521L33,127@5577L37,128@5640L41,129@5706L33,132@5812L2309,161@8171L38,162@8230L37,163@8287L38,164@8349L37,165@8412L33,204@10533L2097,243@12637L33717,203@10506L35848:FontsMakerScreen.kt#ck1ii0");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(onBack) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2138780756, $dirty, -1, "com.example.ui.tools.fonts.FontsMakerScreen (FontsMakerScreen.kt:98)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -1921024704, "CC(remember):FontsMakerScreen.kt#9igjgp");
            boolean z = ($dirty & 14) == 4;
            Object rememberedValue = $composer2.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda34
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FontsMakerScreenKt.FontsMakerScreen$lambda$1$lambda$0(Function0.this);
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
            ComposerKt.sourceInformationMarkerStart($composer2, -1921020971, "CC(remember):FontsMakerScreen.kt#9igjgp");
            Object rememberedValue2 = $composer2.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = SnapshotIntStateKt.mutableIntStateOf(0);
                $composer2.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            final MutableIntState selectedTab$delegate = (MutableIntState) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1921017568, "CC(remember):FontsMakerScreen.kt#9igjgp");
            Object rememberedValue3 = $composer2.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                r33 = 1;
                obj3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("OmniTools VIP", null, 2, null);
                $composer2.updateRememberedValue(obj3);
            } else {
                r33 = 1;
                obj3 = rememberedValue3;
            }
            final MutableState inputText$delegate = (MutableState) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Pair[] pairArr = new Pair[7];
            pairArr[0] = TuplesKt.to("Neon Cyan", Color.m4152boximpl(ColorKt.Color(4278248959L)));
            pairArr[r33] = TuplesKt.to("Flaming Gold", Color.m4152boximpl(ColorKt.Color(4294956800L)));
            pairArr[2] = TuplesKt.to("Cyber Green", Color.m4152boximpl(ColorKt.Color(4278249078L)));
            pairArr[3] = TuplesKt.to("Electric Pink", Color.m4152boximpl(ColorKt.Color(4294918273L)));
            pairArr[4] = TuplesKt.to("Royal Violet", Color.m4152boximpl(ColorKt.Color(4289956095L)));
            pairArr[5] = TuplesKt.to("Sunset Orange", Color.m4152boximpl(ColorKt.Color(4294929984L)));
            pairArr[6] = TuplesKt.to("Pure White", Color.m4152boximpl(ColorKt.Color(4294967295L)));
            final List colorPalettes = CollectionsKt.listOf((Object[]) pairArr);
            Pair[] pairArr2 = new Pair[6];
            Color[] colorArr = new Color[2];
            colorArr[0] = Color.m4152boximpl(ColorKt.Color(4279179050L));
            colorArr[r33] = Color.m4152boximpl(ColorKt.Color(4280166715L));
            pairArr2[0] = TuplesKt.to("Dark Luxury", CollectionsKt.listOf((Object[]) colorArr));
            Color[] colorArr2 = new Color[3];
            colorArr2[0] = Color.m4152boximpl(ColorKt.Color(4280163147L));
            colorArr2[r33] = Color.m4152boximpl(ColorKt.Color(4283178389L));
            colorArr2[2] = Color.m4152boximpl(ColorKt.Color(4286781507L));
            pairArr2[r33] = TuplesKt.to("Cyberpunk", CollectionsKt.listOf((Object[]) colorArr2));
            Color[] colorArr3 = new Color[3];
            colorArr3[0] = Color.m4152boximpl(ColorKt.Color(4278603323L));
            colorArr3[r33] = Color.m4152boximpl(ColorKt.Color(4278483031L));
            colorArr3[2] = Color.m4152boximpl(ColorKt.Color(4278607686L));
            pairArr2[2] = TuplesKt.to("Emerald Glow", CollectionsKt.listOf((Object[]) colorArr3));
            Color[] colorArr4 = new Color[3];
            colorArr4[0] = Color.m4152boximpl(ColorKt.Color(4286328082L));
            colorArr4[r33] = Color.m4152boximpl(ColorKt.Color(4290920716L));
            colorArr4[2] = Color.m4152boximpl(ColorKt.Color(4293548044L));
            pairArr2[3] = TuplesKt.to("Sunset Fire", CollectionsKt.listOf((Object[]) colorArr4));
            Color[] colorArr5 = new Color[2];
            colorArr5[0] = Color.m4152boximpl(ColorKt.Color(4278190080L));
            colorArr5[r33] = Color.m4152boximpl(ColorKt.Color(4279310375L));
            pairArr2[4] = TuplesKt.to("AMOLED Black", CollectionsKt.listOf((Object[]) colorArr5));
            Color[] colorArr6 = new Color[2];
            colorArr6[0] = Color.m4152boximpl(ColorKt.Color(4283043351L));
            colorArr6[r33] = Color.m4152boximpl(ColorKt.Color(4287107895L));
            pairArr2[5] = TuplesKt.to("Royal Velvet", CollectionsKt.listOf((Object[]) colorArr6));
            final List backgroundGradients = CollectionsKt.listOf((Object[]) pairArr2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1920986027, "CC(remember):FontsMakerScreen.kt#9igjgp");
            Object rememberedValue4 = $composer2.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                obj4 = SnapshotIntStateKt.mutableIntStateOf(0);
                $composer2.updateRememberedValue(obj4);
            } else {
                obj4 = rememberedValue4;
            }
            final MutableIntState selectedColorIndex$delegate = (MutableIntState) obj4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1920984075, "CC(remember):FontsMakerScreen.kt#9igjgp");
            Object rememberedValue5 = $composer2.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                obj5 = SnapshotIntStateKt.mutableIntStateOf(0);
                $composer2.updateRememberedValue(obj5);
            } else {
                obj5 = rememberedValue5;
            }
            final MutableIntState selectedBgIndex$delegate = (MutableIntState) obj5;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1920982279, "CC(remember):FontsMakerScreen.kt#9igjgp");
            Object rememberedValue6 = $composer2.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                obj6 = PrimitiveSnapshotStateKt.mutableFloatStateOf(26.0f);
                $composer2.updateRememberedValue(obj6);
            } else {
                obj6 = rememberedValue6;
            }
            final MutableFloatState fontSizeSp$delegate = (MutableFloatState) obj6;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1920980259, "CC(remember):FontsMakerScreen.kt#9igjgp");
            Object rememberedValue7 = $composer2.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                obj7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("Bold Serif", null, 2, null);
                $composer2.updateRememberedValue(obj7);
            } else {
                obj7 = rememberedValue7;
            }
            MutableState fontStyleName$delegate2 = (MutableState) obj7;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1920978155, "CC(remember):FontsMakerScreen.kt#9igjgp");
            Object rememberedValue8 = $composer2.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                context = context2;
                obj8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(r33 != 0), null, 2, null);
                $composer2.updateRememberedValue(obj8);
            } else {
                context = context2;
                obj8 = rememberedValue8;
            }
            MutableState hasWatermark$delegate2 = (MutableState) obj8;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1920972487, "CC(remember):FontsMakerScreen.kt#9igjgp");
            Object rememberedValue9 = $composer2.rememberedValue();
            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                FontVariant[] fontVariantArr = new FontVariant[23];
                hasWatermark$delegate = hasWatermark$delegate2;
                fontStyleName$delegate = fontStyleName$delegate2;
                fontVariantArr[0] = new FontVariant("bold_serif", "Bold Serif", "𝐁𝐨𝐥𝐝 𝐒𝐞𝐫𝐢𝐟", new Function1() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda46
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        return FontsMakerScreenKt.FontsMakerScreen$lambda$46$lambda$23((String) obj15);
                    }
                });
                fontVariantArr[r33] = new FontVariant("bold_sans", "Bold Sans", "𝗕𝗼𝗹𝗱 𝗦𝗮𝗻𝘀", new Function1() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda54
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        return FontsMakerScreenKt.FontsMakerScreen$lambda$46$lambda$24((String) obj15);
                    }
                });
                fontVariantArr[2] = new FontVariant("italic_serif", "Italic Serif", "𝐼𝑡𝑎𝑙𝑖𝑐 𝑆𝑒𝑟𝑖𝑓", new Function1() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda56
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        return FontsMakerScreenKt.FontsMakerScreen$lambda$46$lambda$25((String) obj15);
                    }
                });
                fontVariantArr[3] = new FontVariant("bold_italic", "Bold Italic", "𝑩𝒐𝒍𝒅 𝑰𝒕𝒂𝒍𝒊𝒄", new Function1() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda57
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        return FontsMakerScreenKt.FontsMakerScreen$lambda$46$lambda$26((String) obj15);
                    }
                });
                fontVariantArr[4] = new FontVariant("cursive", "Cursive / Script", "𝒞𝓊𝓇𝓈𝒾𝓋𝑒 𝒮𝒸𝓇𝒾𝓅𝓉", new Function1() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda58
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        return FontsMakerScreenKt.FontsMakerScreen$lambda$46$lambda$27((String) obj15);
                    }
                });
                fontVariantArr[5] = new FontVariant("bold_cursive", "Bold Cursive", "𝓒𝓾𝓻𝓼𝓲𝓿𝓮 𝓑𝓸𝓵𝓭", new Function1() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda59
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        return FontsMakerScreenKt.FontsMakerScreen$lambda$46$lambda$28((String) obj15);
                    }
                });
                fontVariantArr[6] = new FontVariant("fraktur", "Gothic / Fraktur", "𝕱𝖗𝖆𝖐𝖙𝖚𝖗 𝕲𝖔𝖙𝖍𝖎𝖈", new Function1() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda60
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        return FontsMakerScreenKt.FontsMakerScreen$lambda$46$lambda$29((String) obj15);
                    }
                });
                fontVariantArr[7] = new FontVariant("bold_fraktur", "Bold Gothic", "𝕭𝖔𝖑𝖉 𝕲𝖔𝖙𝖍𝖎𝖈", new Function1() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda61
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        return FontsMakerScreenKt.FontsMakerScreen$lambda$46$lambda$30((String) obj15);
                    }
                });
                fontVariantArr[8] = new FontVariant("double_struck", "Double Struck", "𝔻𝕠𝕦𝕓𝕝𝕖 𝕊𝕥𝕣𝕦𝕔𝕜", new Function1() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda62
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        return FontsMakerScreenKt.FontsMakerScreen$lambda$46$lambda$31((String) obj15);
                    }
                });
                fontVariantArr[9] = new FontVariant("bubble", "Circled / Bubble", "Ⓒⓘⓡⓒⓛⓔⓓ", new Function1() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda35
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        return FontsMakerScreenKt.FontsMakerScreen$lambda$46$lambda$32((String) obj15);
                    }
                });
                fontVariantArr[10] = new FontVariant("bubble_filled", "Filled Bubble", "🅒🅘🅡🅒🅛🅔🅓", new Function1() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda36
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        return FontsMakerScreenKt.FontsMakerScreen$lambda$46$lambda$33((String) obj15);
                    }
                });
                fontVariantArr[11] = new FontVariant("squared", "Squared / Boxed", "🅂🅀🅄🄰🅁🄴🄳", new Function1() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda37
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        return FontsMakerScreenKt.FontsMakerScreen$lambda$46$lambda$34((String) obj15);
                    }
                });
                fontVariantArr[12] = new FontVariant("monospace", "Monospace Code", "𝙼𝚘𝚗𝚘𝚜𝚙𝚊𝚌𝚎", new Function1() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda38
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        return FontsMakerScreenKt.FontsMakerScreen$lambda$46$lambda$35((String) obj15);
                    }
                });
                fontVariantArr[13] = new FontVariant("small_caps", "Small Caps", "ꜱᴍᴀʟʟ ᴄᴀᴘꜱ", new Function1() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda39
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        return FontsMakerScreenKt.FontsMakerScreen$lambda$46$lambda$36((String) obj15);
                    }
                });
                fontVariantArr[14] = new FontVariant("inverted", "Upside Down", "uʍop ǝpısd∩", new Function1() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda40
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        return FontsMakerScreenKt.FontsMakerScreen$lambda$46$lambda$37((String) obj15);
                    }
                });
                fontVariantArr[15] = new FontVariant("strikethrough", "Strikethrough", "S̶t̶r̶i̶k̶e̶", new Function1() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda41
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        return FontsMakerScreenKt.FontsMakerScreen$lambda$46$lambda$38((String) obj15);
                    }
                });
                fontVariantArr[16] = new FontVariant("underline", "Underline", "U̲n̲d̲e̲r̲l̲i̲n̲e̲", new Function1() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda42
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        return FontsMakerScreenKt.FontsMakerScreen$lambda$46$lambda$39((String) obj15);
                    }
                });
                fontVariantArr[17] = new FontVariant("slash", "Slash Through", "S̷l̷a̷s̷h̷", new Function1() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda43
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        return FontsMakerScreenKt.FontsMakerScreen$lambda$46$lambda$40((String) obj15);
                    }
                });
                fontVariantArr[18] = new FontVariant("aesthetic", "Aesthetic / Fullwidth", "Ｆｕｌｌｗｉｄｔｈ", new Function1() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda45
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        return FontsMakerScreenKt.FontsMakerScreen$lambda$46$lambda$41((String) obj15);
                    }
                });
                fontVariantArr[19] = new FontVariant("sparkles", "Magic Sparkles", "✨ Text ✨", new Function1() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda47
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        return FontsMakerScreenKt.FontsMakerScreen$lambda$46$lambda$42((String) obj15);
                    }
                });
                fontVariantArr[20] = new FontVariant("royal", "Crown Royal", "👑 Text 👑", new Function1() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda48
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        return FontsMakerScreenKt.FontsMakerScreen$lambda$46$lambda$43((String) obj15);
                    }
                });
                fontVariantArr[21] = new FontVariant("fire", "Trending Fire", "🔥 Text 🔥", new Function1() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda49
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        return FontsMakerScreenKt.FontsMakerScreen$lambda$46$lambda$44((String) obj15);
                    }
                });
                fontVariantArr[22] = new FontVariant("vip", "VIP Diamond", "💎 Text 💎", new Function1() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda50
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        return FontsMakerScreenKt.FontsMakerScreen$lambda$46$lambda$45((String) obj15);
                    }
                });
                obj9 = CollectionsKt.listOf((Object[]) fontVariantArr);
                $composer2.updateRememberedValue(obj9);
            } else {
                hasWatermark$delegate = hasWatermark$delegate2;
                fontStyleName$delegate = fontStyleName$delegate2;
                obj9 = rememberedValue9;
            }
            final List fontVariants = (List) obj9;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1920899270, "CC(remember):FontsMakerScreen.kt#9igjgp");
            Object rememberedValue10 = $composer2.rememberedValue();
            if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                obj10 = PrimitiveSnapshotStateKt.mutableFloatStateOf(255.0f);
                $composer2.updateRememberedValue(obj10);
            } else {
                obj10 = rememberedValue10;
            }
            MutableFloatState rgbRed$delegate2 = (MutableFloatState) obj10;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1920897383, "CC(remember):FontsMakerScreen.kt#9igjgp");
            Object rememberedValue11 = $composer2.rememberedValue();
            if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                obj11 = PrimitiveSnapshotStateKt.mutableFloatStateOf(45.0f);
                $composer2.updateRememberedValue(obj11);
            } else {
                obj11 = rememberedValue11;
            }
            final MutableFloatState rgbGreen$delegate = (MutableFloatState) obj11;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1920895558, "CC(remember):FontsMakerScreen.kt#9igjgp");
            Object rememberedValue12 = $composer2.rememberedValue();
            if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                obj12 = PrimitiveSnapshotStateKt.mutableFloatStateOf(120.0f);
                $composer2.updateRememberedValue(obj12);
            } else {
                obj12 = rememberedValue12;
            }
            final MutableFloatState rgbBlue$delegate = (MutableFloatState) obj12;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1920893575, "CC(remember):FontsMakerScreen.kt#9igjgp");
            Object rememberedValue13 = $composer2.rememberedValue();
            if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                obj13 = PrimitiveSnapshotStateKt.mutableFloatStateOf(26.0f);
                $composer2.updateRememberedValue(obj13);
            } else {
                obj13 = rememberedValue13;
            }
            final MutableFloatState rgbFontSize$delegate = (MutableFloatState) obj13;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1920891563, "CC(remember):FontsMakerScreen.kt#9igjgp");
            Object rememberedValue14 = $composer2.rememberedValue();
            if (rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                rgbRed$delegate = rgbRed$delegate2;
                obj14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(r33 != 0), null, 2, null);
                $composer2.updateRememberedValue(obj14);
            } else {
                rgbRed$delegate = rgbRed$delegate2;
                obj14 = rememberedValue14;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            boolean z2 = r33 != 0;
            final Context context3 = context;
            final MutableState hasWatermark$delegate3 = hasWatermark$delegate;
            final MutableState fontStyleName$delegate3 = fontStyleName$delegate;
            final MutableFloatState rgbRed$delegate3 = rgbRed$delegate;
            ScaffoldKt.m2411ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(685079576, z2, new Function2() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda51
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj15, Object obj16) {
                    return FontsMakerScreenKt.FontsMakerScreen$lambda$76(Function0.this, selectedTab$delegate, fontVariants, (Composer) obj15, ((Integer) obj16).intValue());
                }
            }, $composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-655557853, z2, new Function3() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda52
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj15, Object obj16, Object obj17) {
                    return FontsMakerScreenKt.FontsMakerScreen$lambda$172(fontVariants, context3, inputText$delegate, hasWatermark$delegate3, selectedTab$delegate, activity, fontStyleName$delegate3, backgroundGradients, selectedBgIndex$delegate, colorPalettes, selectedColorIndex$delegate, fontSizeSp$delegate, rgbRed$delegate3, rgbGreen$delegate, rgbBlue$delegate, rgbFontSize$delegate, (PaddingValues) obj15, (Composer) obj16, ((Integer) obj17).intValue());
                }
            }, $composer2, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda53
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj15, Object obj16) {
                    return FontsMakerScreenKt.FontsMakerScreen$lambda$173(Function0.this, $changed, (Composer) obj15, ((Integer) obj16).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$1$lambda$0(Function0 $onBack) {
        $onBack.invoke();
        return Unit.INSTANCE;
    }

    private static final int FontsMakerScreen$lambda$3(MutableIntState $selectedTab$delegate) {
        return $selectedTab$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String FontsMakerScreen$lambda$6(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final int FontsMakerScreen$lambda$9(MutableIntState $selectedColorIndex$delegate) {
        return $selectedColorIndex$delegate.getIntValue();
    }

    private static final int FontsMakerScreen$lambda$12(MutableIntState $selectedBgIndex$delegate) {
        return $selectedBgIndex$delegate.getIntValue();
    }

    private static final float FontsMakerScreen$lambda$15(MutableFloatState $fontSizeSp$delegate) {
        return $fontSizeSp$delegate.getFloatValue();
    }

    private static final String FontsMakerScreen$lambda$18(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean FontsMakerScreen$lambda$21(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void FontsMakerScreen$lambda$22(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String FontsMakerScreen$lambda$46$lambda$23(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return convertMathSerifBold(it);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String FontsMakerScreen$lambda$46$lambda$24(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return convertMathSansBold(it);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String FontsMakerScreen$lambda$46$lambda$25(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return convertMathSerifItalic(it);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String FontsMakerScreen$lambda$46$lambda$26(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return convertMathBoldItalic(it);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String FontsMakerScreen$lambda$46$lambda$27(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return convertScript(it);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String FontsMakerScreen$lambda$46$lambda$28(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return convertBoldScript(it);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String FontsMakerScreen$lambda$46$lambda$29(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return convertFraktur(it);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String FontsMakerScreen$lambda$46$lambda$30(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return convertBoldFraktur(it);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String FontsMakerScreen$lambda$46$lambda$31(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return convertDoubleStruck(it);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String FontsMakerScreen$lambda$46$lambda$32(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return convertCircled(it);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String FontsMakerScreen$lambda$46$lambda$33(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return convertCircledFilled(it);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String FontsMakerScreen$lambda$46$lambda$34(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return convertSquared(it);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String FontsMakerScreen$lambda$46$lambda$35(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return convertMonospace(it);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String FontsMakerScreen$lambda$46$lambda$36(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return convertSmallCaps(it);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String FontsMakerScreen$lambda$46$lambda$37(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return convertUpsideDown(it);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String FontsMakerScreen$lambda$46$lambda$38(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return convertStrikethrough(it);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String FontsMakerScreen$lambda$46$lambda$39(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return convertUnderline(it);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String FontsMakerScreen$lambda$46$lambda$40(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return convertSlash(it);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String FontsMakerScreen$lambda$46$lambda$41(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return convertFullwidth(it);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String FontsMakerScreen$lambda$46$lambda$42(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "✨ " + it + " ✨";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String FontsMakerScreen$lambda$46$lambda$43(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "👑 " + it + " 👑";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String FontsMakerScreen$lambda$46$lambda$44(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "🔥 " + it + " 🔥";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String FontsMakerScreen$lambda$46$lambda$45(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "💎 " + it + " 💎";
    }

    private static final float FontsMakerScreen$lambda$48(MutableFloatState $rgbRed$delegate) {
        return $rgbRed$delegate.getFloatValue();
    }

    private static final float FontsMakerScreen$lambda$51(MutableFloatState $rgbGreen$delegate) {
        return $rgbGreen$delegate.getFloatValue();
    }

    private static final float FontsMakerScreen$lambda$54(MutableFloatState $rgbBlue$delegate) {
        return $rgbBlue$delegate.getFloatValue();
    }

    private static final float FontsMakerScreen$lambda$57(MutableFloatState $rgbFontSize$delegate) {
        return $rgbFontSize$delegate.getFloatValue();
    }

    private static final long FontsMakerScreen$currentRgbColor(MutableFloatState rgbRed$delegate, MutableFloatState rgbGreen$delegate, MutableFloatState rgbBlue$delegate) {
        return ColorKt.Color$default(RangesKt.coerceIn((int) FontsMakerScreen$lambda$48(rgbRed$delegate), 0, 255), RangesKt.coerceIn((int) FontsMakerScreen$lambda$51(rgbGreen$delegate), 0, 255), RangesKt.coerceIn((int) FontsMakerScreen$lambda$54(rgbBlue$delegate), 0, 255), 0, 8, null);
    }

    private static final String FontsMakerScreen$currentHexCode(MutableFloatState rgbRed$delegate, MutableFloatState rgbGreen$delegate, MutableFloatState rgbBlue$delegate) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("#%02X%02X%02X", Arrays.copyOf(new Object[]{Integer.valueOf(RangesKt.coerceIn((int) FontsMakerScreen$lambda$48(rgbRed$delegate), 0, 255)), Integer.valueOf(RangesKt.coerceIn((int) FontsMakerScreen$lambda$51(rgbGreen$delegate), 0, 255)), Integer.valueOf(RangesKt.coerceIn((int) FontsMakerScreen$lambda$54(rgbBlue$delegate), 0, 255))}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    private static final String FontsMakerScreen$currentRgbString(MutableFloatState rgbRed$delegate, MutableFloatState rgbGreen$delegate, MutableFloatState rgbBlue$delegate) {
        return "rgb(" + RangesKt.coerceIn((int) FontsMakerScreen$lambda$48(rgbRed$delegate), 0, 255) + ", " + RangesKt.coerceIn((int) FontsMakerScreen$lambda$51(rgbGreen$delegate), 0, 255) + ", " + RangesKt.coerceIn((int) FontsMakerScreen$lambda$54(rgbBlue$delegate), 0, 255) + ")";
    }

    private static final void FontsMakerScreen$saveCleanCardViaAd(Activity activity, final List<FontVariant> list, final List<Pair<String, Color>> list2, final List<? extends Pair<String, ? extends List<Color>>> list3, final Context context, final MutableState<String> mutableState, final MutableState<String> mutableState2, final MutableIntState selectedColorIndex$delegate, final MutableIntState selectedBgIndex$delegate, final MutableFloatState fontSizeSp$delegate, final MutableState<Boolean> mutableState3) {
        Object obj;
        String FontsMakerScreen$lambda$6;
        Function1<String, String> transform;
        if (activity != null) {
            AdManager.INSTANCE.showRewardedAd(activity, new Function0() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FontsMakerScreenKt.FontsMakerScreen$saveCleanCardViaAd$lambda$63(list, list2, list3, context, mutableState, mutableState2, selectedColorIndex$delegate, selectedBgIndex$delegate, fontSizeSp$delegate, mutableState3);
                }
            }, new Function0() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FontsMakerScreenKt.FontsMakerScreen$saveCleanCardViaAd$lambda$64(MutableState.this);
                }
            });
            return;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(((FontVariant) obj).getName(), FontsMakerScreen$lambda$18(mutableState))) {
                    break;
                }
            }
        }
        FontVariant fontVariant = (FontVariant) obj;
        if (fontVariant == null || (transform = fontVariant.getTransform()) == null || (FontsMakerScreen$lambda$6 = transform.invoke(FontsMakerScreen$lambda$6(mutableState2))) == null) {
            FontsMakerScreen$lambda$6 = FontsMakerScreen$lambda$6(mutableState2);
        }
        String currentStyled = FontsMakerScreen$lambda$6;
        Bitmap bmp = m7140renderFontCardBitmapiJQMabo(currentStyled, list2.get(FontsMakerScreen$lambda$9(selectedColorIndex$delegate)).getSecond().m4172unboximpl(), list3.get(FontsMakerScreen$lambda$12(selectedBgIndex$delegate)).getSecond(), FontsMakerScreen$lambda$15(fontSizeSp$delegate), false);
        ImageExportUtils.INSTANCE.saveBitmapToGallery(context, bmp, "FontArt_NoWatermark");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$saveCleanCardViaAd$lambda$63(List $fontVariants, List $colorPalettes, List $backgroundGradients, Context $context, MutableState $fontStyleName$delegate, MutableState $inputText$delegate, MutableIntState $selectedColorIndex$delegate, MutableIntState $selectedBgIndex$delegate, MutableFloatState $fontSizeSp$delegate, MutableState $hasWatermark$delegate) {
        Object obj;
        String FontsMakerScreen$lambda$6;
        Function1<String, String> transform;
        Iterator it = $fontVariants.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((FontVariant) obj).getName(), FontsMakerScreen$lambda$18($fontStyleName$delegate))) {
                break;
            }
        }
        FontVariant fontVariant = (FontVariant) obj;
        if (fontVariant == null || (transform = fontVariant.getTransform()) == null || (FontsMakerScreen$lambda$6 = transform.invoke(FontsMakerScreen$lambda$6($inputText$delegate))) == null) {
            FontsMakerScreen$lambda$6 = FontsMakerScreen$lambda$6($inputText$delegate);
        }
        String currentStyled = FontsMakerScreen$lambda$6;
        Bitmap bmp = m7140renderFontCardBitmapiJQMabo(currentStyled, ((Color) ((Pair) $colorPalettes.get(FontsMakerScreen$lambda$9($selectedColorIndex$delegate))).getSecond()).m4172unboximpl(), (List) ((Pair) $backgroundGradients.get(FontsMakerScreen$lambda$12($selectedBgIndex$delegate))).getSecond(), FontsMakerScreen$lambda$15($fontSizeSp$delegate), false);
        ImageExportUtils.INSTANCE.saveBitmapToGallery($context, bmp, "FontArt_NoWatermark");
        Toast.makeText($context, "Saved without watermark! Next export will require video ad again.", 1).show();
        FontsMakerScreen$lambda$22($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$saveCleanCardViaAd$lambda$64(MutableState $hasWatermark$delegate) {
        FontsMakerScreen$lambda$22($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit FontsMakerScreen$lambda$76(final kotlin.jvm.functions.Function0 r41, final androidx.compose.runtime.MutableIntState r42, final java.util.List r43, androidx.compose.runtime.Composer r44, int r45) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.fonts.FontsMakerScreenKt.FontsMakerScreen$lambda$76(kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableIntState, java.util.List, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$76$lambda$75$lambda$66(Function0 $onBack, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C214@11010L155:FontsMakerScreen.kt#ck1ii0");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1531956344, $changed, -1, "com.example.ui.tools.fonts.FontsMakerScreen.<anonymous>.<anonymous>.<anonymous> (FontsMakerScreen.kt:214)");
            }
            IconButtonKt.IconButton($onBack, null, false, null, null, ComposableSingletons$FontsMakerScreenKt.INSTANCE.getLambda$1576054283$app(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$76$lambda$75$lambda$74(final MutableIntState $selectedTab$delegate, final List $fontVariants, Composer $composer, int $changed) {
        Object obj;
        Object obj2;
        Object obj3;
        ComposerKt.sourceInformation($composer, "C224@11521L19,225@11573L92,222@11429L384,230@11926L19,228@11834L367,236@12314L19,234@12222L366:FontsMakerScreen.kt#ck1ii0");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1434859046, $changed, -1, "com.example.ui.tools.fonts.FontsMakerScreen.<anonymous>.<anonymous>.<anonymous> (FontsMakerScreen.kt:222)");
            }
            boolean z = FontsMakerScreen$lambda$3($selectedTab$delegate) == 0;
            ComposerKt.sourceInformationMarkerStart($composer, 215044857, "CC(remember):FontsMakerScreen.kt#9igjgp");
            Object rememberedValue = $composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda44
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FontsMakerScreenKt.FontsMakerScreen$lambda$76$lambda$75$lambda$74$lambda$68$lambda$67(MutableIntState.this);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TabKt.m2582TabwqdebIU(z, (Function0) obj, null, false, ComposableLambdaKt.rememberComposableLambda(1419730828, true, new Function2() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda55
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return FontsMakerScreenKt.FontsMakerScreen$lambda$76$lambda$75$lambda$74$lambda$69($fontVariants, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer, 54), ComposableSingletons$FontsMakerScreenKt.INSTANCE.getLambda$1302094059$app(), 0L, 0L, null, $composer, 221232, 460);
            boolean z2 = FontsMakerScreen$lambda$3($selectedTab$delegate) == 1;
            ComposerKt.sourceInformationMarkerStart($composer, 215057817, "CC(remember):FontsMakerScreen.kt#9igjgp");
            Object rememberedValue2 = $composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = new Function0() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda66
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FontsMakerScreenKt.FontsMakerScreen$lambda$76$lambda$75$lambda$74$lambda$71$lambda$70(MutableIntState.this);
                    }
                };
                $composer.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TabKt.m2582TabwqdebIU(z2, (Function0) obj2, null, false, ComposableSingletons$FontsMakerScreenKt.INSTANCE.m7139getLambda$95938621$app(), ComposableSingletons$FontsMakerScreenKt.INSTANCE.m7128getLambda$1475723934$app(), 0L, 0L, null, $composer, 221232, 460);
            boolean z3 = FontsMakerScreen$lambda$3($selectedTab$delegate) == 2;
            ComposerKt.sourceInformationMarkerStart($composer, 215070233, "CC(remember):FontsMakerScreen.kt#9igjgp");
            Object rememberedValue3 = $composer.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj3 = new Function0() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda67
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FontsMakerScreenKt.FontsMakerScreen$lambda$76$lambda$75$lambda$74$lambda$73$lambda$72(MutableIntState.this);
                    }
                };
                $composer.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TabKt.m2582TabwqdebIU(z3, (Function0) obj3, null, false, ComposableSingletons$FontsMakerScreenKt.INSTANCE.getLambda$830816132$app(), ComposableSingletons$FontsMakerScreenKt.INSTANCE.m7136getLambda$548969181$app(), 0L, 0L, null, $composer, 221232, 460);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$76$lambda$75$lambda$74$lambda$68$lambda$67(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$76$lambda$75$lambda$74$lambda$69(List $fontVariants, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C225@11575L88:FontsMakerScreen.kt#ck1ii0");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1419730828, $changed, -1, "com.example.ui.tools.fonts.FontsMakerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FontsMakerScreen.kt:225)");
            }
            TextKt.m2696Text4IGK_g("Fonts (" + $fontVariants.size() + ")", (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$76$lambda$75$lambda$74$lambda$71$lambda$70(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$76$lambda$75$lambda$74$lambda$73$lambda$72(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x1bcb, code lost:
    
        if (r0 != null) goto L313;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0b9e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0db7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0dc3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0dfc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0ede  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0eea  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0f23  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x1011  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x10cb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x10d7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x1110  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x11f2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x11fe  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x1237  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x1325  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x13df  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x13eb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x1424  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x1506  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x1512  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x154b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x1639  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x16f2  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x16fe  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x1737  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x1815  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x1821  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x1858  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x1945  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x1953  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x186e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x1827  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x174d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x1704  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x1649  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x1561 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x1518  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x143a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x13f1  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x1335  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x124d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x1204  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x1126 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x10dd  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x1021  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0f39 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0ef0  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0e12 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0dc9  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0b3a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0af5  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x19d1  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x1b64  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x1c9e  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x1d58  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x1e33  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x1e3f  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x1e72  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x1ef3  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x1fa1  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x20f5  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x2101  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x213a  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x21e9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x235c  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x2368  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x23a1  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x2422  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x25f9  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x2605  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x263e  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x26bf  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x2861  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x286d  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x28a6  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x298b  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x2997  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x29ce  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x2aba  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x2ac8  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x29e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:420:0x299d  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x28bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x2873  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x2654 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x260b  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x23b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:429:0x236e  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x2150 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x2107  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x1f1b  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x1e88  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x1e43  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x1b83  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x1bc1  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x1ba5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:461:0x1b72  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x2b40  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x2c11  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0ae5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0af1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0b24  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit FontsMakerScreen$lambda$172(final java.util.List r147, final android.content.Context r148, final androidx.compose.runtime.MutableState r149, final androidx.compose.runtime.MutableState r150, androidx.compose.runtime.MutableIntState r151, final android.app.Activity r152, final androidx.compose.runtime.MutableState r153, final java.util.List r154, final androidx.compose.runtime.MutableIntState r155, final java.util.List r156, final androidx.compose.runtime.MutableIntState r157, final androidx.compose.runtime.MutableFloatState r158, final androidx.compose.runtime.MutableFloatState r159, final androidx.compose.runtime.MutableFloatState r160, final androidx.compose.runtime.MutableFloatState r161, final androidx.compose.runtime.MutableFloatState r162, androidx.compose.foundation.layout.PaddingValues r163, androidx.compose.runtime.Composer r164, int r165) {
        /*
            Method dump skipped, instructions count: 11298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.fonts.FontsMakerScreenKt.FontsMakerScreen$lambda$172(java.util.List, android.content.Context, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableIntState, android.app.Activity, androidx.compose.runtime.MutableState, java.util.List, androidx.compose.runtime.MutableIntState, java.util.List, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.MutableFloatState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$82$lambda$78$lambda$77(MutableState $inputText$delegate, MutableState $hasWatermark$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $inputText$delegate.setValue(it);
        FontsMakerScreen$lambda$22($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$82$lambda$81(final MutableState $inputText$delegate, final MutableState $hasWatermark$delegate, Composer $composer, int $changed) {
        Object obj;
        ComposerKt.sourceInformation($composer, "C:FontsMakerScreen.kt#ck1ii0");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-603457456, $changed, -1, "com.example.ui.tools.fonts.FontsMakerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FontsMakerScreen.kt:263)");
            }
            if (FontsMakerScreen$lambda$6($inputText$delegate).length() > 0) {
                $composer.startReplaceGroup(1132090401);
                ComposerKt.sourceInformation($composer, "264@13510L39,264@13489L185");
                ComposerKt.sourceInformationMarkerStart($composer, -102026857, "CC(remember):FontsMakerScreen.kt#9igjgp");
                Object rememberedValue = $composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    obj = new Function0() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda63
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FontsMakerScreenKt.FontsMakerScreen$lambda$172$lambda$171$lambda$82$lambda$81$lambda$80$lambda$79(MutableState.this, $hasWatermark$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                } else {
                    obj = rememberedValue;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) obj, null, false, null, null, ComposableSingletons$FontsMakerScreenKt.INSTANCE.getLambda$1590560328$app(), $composer, 196614, 30);
            } else {
                $composer.startReplaceGroup(1118730610);
            }
            $composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$82$lambda$81$lambda$80$lambda$79(MutableState $inputText$delegate, MutableState $hasWatermark$delegate) {
        $inputText$delegate.setValue("");
        FontsMakerScreen$lambda$22($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$86$lambda$85(final List $fontVariants, final MutableState $inputText$delegate, final Context $context, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$FontsMakerScreenKt.INSTANCE.getLambda$2026704865$app(), 3, null);
        final Function1 function1 = new Function1() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$FontsMakerScreen$lambda$172$lambda$171$lambda$86$lambda$85$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((FontVariant) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(FontVariant fontVariant) {
                return null;
            }
        };
        LazyColumn.items($fontVariants.size(), null, new Function1<Integer, Object>() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$FontsMakerScreen$lambda$172$lambda$171$lambda$86$lambda$85$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return Function1.this.invoke($fontVariants.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$FontsMakerScreen$lambda$172$lambda$171$lambda$86$lambda$85$$inlined$items$default$4
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
                String FontsMakerScreen$lambda$6;
                String FontsMakerScreen$lambda$62;
                String FontsMakerScreen$lambda$63;
                String invoke;
                long m4160copywmQWz5c;
                long m4160copywmQWz5c2;
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
                final FontVariant fontVariant = (FontVariant) $fontVariants.get(it);
                $composer.startReplaceGroup(-910801648);
                ComposerKt.sourceInformation($composer, "C*290@14658L165,297@15074L11,297@15032L88,298@15192L11,299@15258L2810,294@14849L3219:FontsMakerScreen.kt#ck1ii0");
                FontsMakerScreen$lambda$6 = FontsMakerScreenKt.FontsMakerScreen$lambda$6($inputText$delegate);
                String id = fontVariant.getId();
                ComposerKt.sourceInformationMarkerStart($composer, 1494637206, "CC(remember):FontsMakerScreen.kt#9igjgp");
                boolean changed = $composer.changed(FontsMakerScreen$lambda$6) | $composer.changed(id);
                Object rememberedValue = $composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    FontsMakerScreen$lambda$62 = FontsMakerScreenKt.FontsMakerScreen$lambda$6($inputText$delegate);
                    if (StringsKt.isBlank(FontsMakerScreen$lambda$62)) {
                        invoke = fontVariant.getSampleText();
                    } else {
                        Function1<String, String> transform = fontVariant.getTransform();
                        FontsMakerScreen$lambda$63 = FontsMakerScreenKt.FontsMakerScreen$lambda$6($inputText$delegate);
                        invoke = transform.invoke(FontsMakerScreen$lambda$63);
                    }
                    $composer.updateRememberedValue(invoke);
                } else {
                    invoke = rememberedValue;
                }
                final String str = (String) invoke;
                ComposerKt.sourceInformationMarkerEnd($composer);
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                RoundedCornerShape m956RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m956RoundedCornerShape0680j_4(Dp.m6625constructorimpl(14));
                CardDefaults cardDefaults = CardDefaults.INSTANCE;
                m4160copywmQWz5c = Color.m4160copywmQWz5c(r23, (r12 & 1) != 0 ? Color.m4164getAlphaimpl(r23) : 0.6f, (r12 & 2) != 0 ? Color.m4168getRedimpl(r23) : 0.0f, (r12 & 4) != 0 ? Color.m4167getGreenimpl(r23) : 0.0f, (r12 & 8) != 0 ? Color.m4165getBlueimpl(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceVariant()) : 0.0f);
                CardColors m1832cardColorsro_MJ88 = cardDefaults.m1832cardColorsro_MJ88(m4160copywmQWz5c, 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14);
                float m6625constructorimpl = Dp.m6625constructorimpl(1);
                m4160copywmQWz5c2 = Color.m4160copywmQWz5c(r23, (r12 & 1) != 0 ? Color.m4164getAlphaimpl(r23) : 0.2f, (r12 & 2) != 0 ? Color.m4168getRedimpl(r23) : 0.0f, (r12 & 4) != 0 ? Color.m4167getGreenimpl(r23) : 0.0f, (r12 & 8) != 0 ? Color.m4165getBlueimpl(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOutline()) : 0.0f);
                BorderStroke m255BorderStrokecXLIe8U = BorderStrokeKt.m255BorderStrokecXLIe8U(m6625constructorimpl, m4160copywmQWz5c2);
                final Context context = $context;
                CardKt.Card(fillMaxWidth$default, m956RoundedCornerShape0680j_4, m1832cardColorsro_MJ88, null, m255BorderStrokecXLIe8U, ComposableLambdaKt.rememberComposableLambda(1200500447, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$FontsMakerScreen$3$1$2$1$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
                        invoke(columnScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:35:0x03f3  */
                    /* JADX WARN: Removed duplicated region for block: B:38:0x03ff  */
                    /* JADX WARN: Removed duplicated region for block: B:46:0x04c0  */
                    /* JADX WARN: Removed duplicated region for block: B:51:0x0549  */
                    /* JADX WARN: Removed duplicated region for block: B:56:0x05e7  */
                    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:60:0x0556 A[ADDED_TO_REGION] */
                    /* JADX WARN: Removed duplicated region for block: B:62:0x04d0 A[ADDED_TO_REGION] */
                    /* JADX WARN: Removed duplicated region for block: B:65:0x0405  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void invoke(androidx.compose.foundation.layout.ColumnScope r95, androidx.compose.runtime.Composer r96, int r97) {
                        /*
                            Method dump skipped, instructions count: 1515
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.fonts.FontsMakerScreenKt$FontsMakerScreen$3$1$2$1$1$1.invoke(androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):void");
                    }
                }, $composer, 54), $composer, 196614, 8);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0211  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit FontsMakerScreen$lambda$172$lambda$171$lambda$120$lambda$93(java.util.List r76, androidx.compose.runtime.MutableIntState r77, java.lang.String r78, final java.util.List r79, final androidx.compose.runtime.MutableState r80, final androidx.compose.runtime.MutableIntState r81, androidx.compose.runtime.MutableFloatState r82, androidx.compose.runtime.MutableState r83, androidx.compose.foundation.layout.ColumnScope r84, androidx.compose.runtime.Composer r85, int r86) {
        /*
            Method dump skipped, instructions count: 1039
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.fonts.FontsMakerScreenKt.FontsMakerScreen$lambda$172$lambda$171$lambda$120$lambda$93(java.util.List, androidx.compose.runtime.MutableIntState, java.lang.String, java.util.List, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$120$lambda$93$lambda$92$lambda$91$lambda$90(List $colorPalettes, MutableState $fontStyleName$delegate, MutableIntState $selectedColorIndex$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C384@20073L432:FontsMakerScreen.kt#ck1ii0");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1983004211, $changed, -1, "com.example.ui.tools.fonts.FontsMakerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FontsMakerScreen.kt:384)");
            }
            String upperCase = FontsMakerScreen$lambda$18($fontStyleName$delegate).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            TextKt.m2696Text4IGK_g(upperCase, PaddingKt.m674paddingVpY3zN4(Modifier.INSTANCE, Dp.m6625constructorimpl(8), Dp.m6625constructorimpl(2)), ((Color) ((Pair) $colorPalettes.get(FontsMakerScreen$lambda$9($selectedColorIndex$delegate))).getSecond()).m4172unboximpl(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199728, 0, 131024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$120$lambda$95$lambda$94(Activity $activity, List $fontVariants, List $colorPalettes, List $backgroundGradients, Context $context, MutableState $fontStyleName$delegate, MutableState $inputText$delegate, MutableIntState $selectedColorIndex$delegate, MutableIntState $selectedBgIndex$delegate, MutableFloatState $fontSizeSp$delegate, MutableState $hasWatermark$delegate) {
        FontsMakerScreen$saveCleanCardViaAd($activity, $fontVariants, $colorPalettes, $backgroundGradients, $context, $fontStyleName$delegate, $inputText$delegate, $selectedColorIndex$delegate, $selectedBgIndex$delegate, $fontSizeSp$delegate, $hasWatermark$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$120$lambda$97$lambda$96(Activity $activity, List $fontVariants, List $colorPalettes, List $backgroundGradients, Context $context, MutableState $fontStyleName$delegate, MutableState $inputText$delegate, MutableIntState $selectedColorIndex$delegate, MutableIntState $selectedBgIndex$delegate, MutableFloatState $fontSizeSp$delegate, MutableState $hasWatermark$delegate) {
        FontsMakerScreen$saveCleanCardViaAd($activity, $fontVariants, $colorPalettes, $backgroundGradients, $context, $fontStyleName$delegate, $inputText$delegate, $selectedColorIndex$delegate, $selectedBgIndex$delegate, $fontSizeSp$delegate, $hasWatermark$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$120$lambda$102$lambda$99$lambda$98(String $currentStyled, List $colorPalettes, List $backgroundGradients, Context $context, MutableIntState $selectedColorIndex$delegate, MutableIntState $selectedBgIndex$delegate, MutableFloatState $fontSizeSp$delegate) {
        Bitmap bmp = m7140renderFontCardBitmapiJQMabo($currentStyled, ((Color) ((Pair) $colorPalettes.get(FontsMakerScreen$lambda$9($selectedColorIndex$delegate))).getSecond()).m4172unboximpl(), (List) ((Pair) $backgroundGradients.get(FontsMakerScreen$lambda$12($selectedBgIndex$delegate))).getSecond(), FontsMakerScreen$lambda$15($fontSizeSp$delegate), true);
        ImageExportUtils.INSTANCE.saveBitmapToGallery($context, bmp, "FontArt_Free");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$120$lambda$102$lambda$101$lambda$100(String $currentStyled, List $colorPalettes, List $backgroundGradients, Context $context, MutableIntState $selectedColorIndex$delegate, MutableIntState $selectedBgIndex$delegate, MutableFloatState $fontSizeSp$delegate, MutableState $inputText$delegate) {
        Bitmap bmp = m7140renderFontCardBitmapiJQMabo($currentStyled, ((Color) ((Pair) $colorPalettes.get(FontsMakerScreen$lambda$9($selectedColorIndex$delegate))).getSecond()).m4172unboximpl(), (List) ((Pair) $backgroundGradients.get(FontsMakerScreen$lambda$12($selectedBgIndex$delegate))).getSecond(), FontsMakerScreen$lambda$15($fontSizeSp$delegate), true);
        ImageExportUtils.INSTANCE.shareBitmap($context, bmp, "Colour Font Card - " + FontsMakerScreen$lambda$6($inputText$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$120$lambda$107$lambda$106$lambda$104$lambda$103(String $style, MutableState $fontStyleName$delegate, MutableState $hasWatermark$delegate) {
        $fontStyleName$delegate.setValue($style);
        FontsMakerScreen$lambda$22($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$120$lambda$107$lambda$106$lambda$105(String $style, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C489@25993L11:FontsMakerScreen.kt#ck1ii0");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1548215138, $changed, -1, "com.example.ui.tools.fonts.FontsMakerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FontsMakerScreen.kt:489)");
            }
            TextKt.m2696Text4IGK_g($style, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$120$lambda$111$lambda$110$lambda$109$lambda$108(int $index, MutableIntState $selectedColorIndex$delegate, MutableState $hasWatermark$delegate) {
        $selectedColorIndex$delegate.setIntValue($index);
        FontsMakerScreen$lambda$22($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$120$lambda$115$lambda$114$lambda$113$lambda$112(int $index, MutableIntState $selectedBgIndex$delegate, MutableState $hasWatermark$delegate) {
        $selectedBgIndex$delegate.setIntValue($index);
        FontsMakerScreen$lambda$22($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$120$lambda$119$lambda$118$lambda$117(MutableFloatState $fontSizeSp$delegate, float it) {
        $fontSizeSp$delegate.setFloatValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0327  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit FontsMakerScreen$lambda$172$lambda$171$lambda$170$lambda$127(java.lang.String r93, final long r94, final java.lang.String r96, final java.lang.String r97, androidx.compose.runtime.MutableFloatState r98, androidx.compose.runtime.MutableState r99, androidx.compose.foundation.layout.ColumnScope r100, androidx.compose.runtime.Composer r101, int r102) {
        /*
            Method dump skipped, instructions count: 1466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.fonts.FontsMakerScreenKt.FontsMakerScreen$lambda$172$lambda$171$lambda$170$lambda$127(java.lang.String, long, java.lang.String, java.lang.String, androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$170$lambda$127$lambda$126$lambda$125$lambda$124$lambda$122(String $hexCode, long $activeRgbColor, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C605@31940L419:FontsMakerScreen.kt#ck1ii0");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(243088554, $changed, -1, "com.example.ui.tools.fonts.FontsMakerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FontsMakerScreen.kt:605)");
            }
            TextKt.m2696Text4IGK_g($hexCode, PaddingKt.m674paddingVpY3zN4(Modifier.INSTANCE, Dp.m6625constructorimpl(8), Dp.m6625constructorimpl(3)), $activeRgbColor, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199728, 0, 131024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$170$lambda$127$lambda$126$lambda$125$lambda$124$lambda$123(String $rgbString, Composer $composer, int $changed) {
        long m4160copywmQWz5c;
        ComposerKt.sourceInformation($composer, "C618@32677L363:FontsMakerScreen.kt#ck1ii0");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1389394029, $changed, -1, "com.example.ui.tools.fonts.FontsMakerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FontsMakerScreen.kt:618)");
            }
            m4160copywmQWz5c = Color.m4160copywmQWz5c(r3, (r12 & 1) != 0 ? Color.m4164getAlphaimpl(r3) : 0.9f, (r12 & 2) != 0 ? Color.m4168getRedimpl(r3) : 0.0f, (r12 & 4) != 0 ? Color.m4167getGreenimpl(r3) : 0.0f, (r12 & 8) != 0 ? Color.m4165getBlueimpl(Color.INSTANCE.m4199getWhite0d7_KjU()) : 0.0f);
            TextKt.m2696Text4IGK_g($rgbString, PaddingKt.m674paddingVpY3zN4(Modifier.INSTANCE, Dp.m6625constructorimpl(8), Dp.m6625constructorimpl(3)), m4160copywmQWz5c, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3504, 0, 131056);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$170$lambda$131$lambda$130(Activity $activity, final String $displayText, final long $activeRgbColor, final Context $context, final MutableFloatState $rgbFontSize$delegate, final MutableState $hasWatermark$delegate) {
        if ($activity != null) {
            AdManager.INSTANCE.showRewardedAd($activity, new Function0() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FontsMakerScreenKt.FontsMakerScreen$lambda$172$lambda$171$lambda$170$lambda$131$lambda$130$lambda$128($displayText, $activeRgbColor, $context, $rgbFontSize$delegate, $hasWatermark$delegate);
                }
            }, new Function0() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FontsMakerScreenKt.FontsMakerScreen$lambda$172$lambda$171$lambda$170$lambda$131$lambda$130$lambda$129(MutableState.this);
                }
            });
        } else {
            Bitmap bmp = m7141renderRgbFontCardBitmapRPmYEkk($displayText, $activeRgbColor, FontsMakerScreen$lambda$57($rgbFontSize$delegate), false);
            ImageExportUtils.INSTANCE.saveBitmapToGallery($context, bmp, "RGBText_NoWatermark");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$170$lambda$131$lambda$130$lambda$128(String $displayText, long $activeRgbColor, Context $context, MutableFloatState $rgbFontSize$delegate, MutableState $hasWatermark$delegate) {
        Bitmap bmp = m7141renderRgbFontCardBitmapRPmYEkk($displayText, $activeRgbColor, FontsMakerScreen$lambda$57($rgbFontSize$delegate), false);
        ImageExportUtils.INSTANCE.saveBitmapToGallery($context, bmp, "RGBText_NoWatermark");
        Toast.makeText($context, "Saved without watermark! Next export will require video ad again.", 1).show();
        FontsMakerScreen$lambda$22($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$170$lambda$131$lambda$130$lambda$129(MutableState $hasWatermark$delegate) {
        FontsMakerScreen$lambda$22($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$170$lambda$138$lambda$135$lambda$134(Activity $activity, final String $displayText, final long $activeRgbColor, final Context $context, final MutableFloatState $rgbFontSize$delegate, final MutableState $hasWatermark$delegate) {
        if ($activity != null) {
            AdManager.INSTANCE.showRewardedAd($activity, new Function0() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FontsMakerScreenKt.FontsMakerScreen$lambda$172$lambda$171$lambda$170$lambda$138$lambda$135$lambda$134$lambda$132($displayText, $activeRgbColor, $context, $rgbFontSize$delegate, $hasWatermark$delegate);
                }
            }, new Function0() { // from class: com.example.ui.tools.fonts.FontsMakerScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FontsMakerScreenKt.FontsMakerScreen$lambda$172$lambda$171$lambda$170$lambda$138$lambda$135$lambda$134$lambda$133(MutableState.this);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$170$lambda$138$lambda$135$lambda$134$lambda$132(String $displayText, long $activeRgbColor, Context $context, MutableFloatState $rgbFontSize$delegate, MutableState $hasWatermark$delegate) {
        Bitmap bmp = m7141renderRgbFontCardBitmapRPmYEkk($displayText, $activeRgbColor, FontsMakerScreen$lambda$57($rgbFontSize$delegate), false);
        ImageExportUtils.INSTANCE.saveBitmapToGallery($context, bmp, "RGBText_HD");
        Toast.makeText($context, "Saved HD without watermark!", 0).show();
        FontsMakerScreen$lambda$22($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$170$lambda$138$lambda$135$lambda$134$lambda$133(MutableState $hasWatermark$delegate) {
        FontsMakerScreen$lambda$22($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$170$lambda$138$lambda$137$lambda$136(String $displayText, long $activeRgbColor, Context $context, MutableFloatState $rgbFontSize$delegate) {
        Bitmap bmp = m7141renderRgbFontCardBitmapRPmYEkk($displayText, $activeRgbColor, FontsMakerScreen$lambda$57($rgbFontSize$delegate), true);
        ImageExportUtils.INSTANCE.saveBitmapToGallery($context, bmp, "RGBText_Free");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0232  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit FontsMakerScreen$lambda$172$lambda$171$lambda$170$lambda$147(final android.content.Context r72, final java.lang.String r73, final java.lang.String r74, final java.lang.String r75, androidx.compose.foundation.layout.ColumnScope r76, androidx.compose.runtime.Composer r77, int r78) {
        /*
            Method dump skipped, instructions count: 1127
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.fonts.FontsMakerScreenKt.FontsMakerScreen$lambda$172$lambda$171$lambda$170$lambda$147(android.content.Context, java.lang.String, java.lang.String, java.lang.String, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$170$lambda$147$lambda$146$lambda$145$lambda$140$lambda$139(Context $context, String $hexCode) {
        ImageExportUtils.INSTANCE.copyToClipboard($context, $hexCode, "HEX Color");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$170$lambda$147$lambda$146$lambda$145$lambda$142$lambda$141(Context $context, String $rgbString) {
        ImageExportUtils.INSTANCE.copyToClipboard($context, $rgbString, "RGB CSS");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$170$lambda$147$lambda$146$lambda$145$lambda$144$lambda$143(String $hexCode, String $displayText, Context $context) {
        String html = "<span style=\"color:" + $hexCode + ";\">" + $displayText + "</span>";
        ImageExportUtils.INSTANCE.copyToClipboard($context, html, "HTML Colored Text");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$170$lambda$153$lambda$152$lambda$149$lambda$148(Triple $rgb, MutableFloatState $rgbRed$delegate, MutableFloatState $rgbGreen$delegate, MutableFloatState $rgbBlue$delegate, MutableState $hasWatermark$delegate) {
        $rgbRed$delegate.setFloatValue(((Number) $rgb.getFirst()).floatValue());
        $rgbGreen$delegate.setFloatValue(((Number) $rgb.getSecond()).floatValue());
        $rgbBlue$delegate.setFloatValue(((Number) $rgb.getThird()).floatValue());
        FontsMakerScreen$lambda$22($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit FontsMakerScreen$lambda$172$lambda$171$lambda$170$lambda$153$lambda$152$lambda$151(long r52, java.lang.String r54, androidx.compose.runtime.Composer r55, int r56) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.fonts.FontsMakerScreenKt.FontsMakerScreen$lambda$172$lambda$171$lambda$170$lambda$153$lambda$152$lambda$151(long, java.lang.String, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$170$lambda$157$lambda$156$lambda$155(MutableFloatState $rgbRed$delegate, MutableState $hasWatermark$delegate, float it) {
        $rgbRed$delegate.setFloatValue(it);
        FontsMakerScreen$lambda$22($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$170$lambda$161$lambda$160$lambda$159(MutableFloatState $rgbGreen$delegate, MutableState $hasWatermark$delegate, float it) {
        $rgbGreen$delegate.setFloatValue(it);
        FontsMakerScreen$lambda$22($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$170$lambda$165$lambda$164$lambda$163(MutableFloatState $rgbBlue$delegate, MutableState $hasWatermark$delegate, float it) {
        $rgbBlue$delegate.setFloatValue(it);
        FontsMakerScreen$lambda$22($hasWatermark$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontsMakerScreen$lambda$172$lambda$171$lambda$170$lambda$169$lambda$168$lambda$167(MutableFloatState $rgbFontSize$delegate, float it) {
        $rgbFontSize$delegate.setFloatValue(it);
        return Unit.INSTANCE;
    }

    /* renamed from: renderFontCardBitmap-iJQMabo, reason: not valid java name */
    private static final Bitmap m7140renderFontCardBitmapiJQMabo(String text, long textColor, List<Color> list, float fontSize, boolean hasWatermark) {
        Bitmap bitmap = Bitmap.createBitmap(1080, 900, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmap);
        Paint bgPaint = new Paint();
        float f = 1080;
        float f2 = 900;
        List<Color> list2 = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(ColorKt.m4216toArgb8_81llA(((Color) it.next()).m4172unboximpl())));
            bitmap = bitmap;
        }
        Bitmap bitmap2 = bitmap;
        bgPaint.setShader(new LinearGradient(0.0f, 0.0f, f, f2, CollectionsKt.toIntArray((List) arrayList), (float[]) null, Shader.TileMode.CLAMP));
        canvas.drawRect(0.0f, 0.0f, 1080, 900, bgPaint);
        Paint borderPaint = new Paint();
        borderPaint.setColor(ColorKt.m4216toArgb8_81llA(textColor));
        borderPaint.setStyle(Paint.Style.STROKE);
        borderPaint.setStrokeWidth(6.0f);
        borderPaint.setAlpha(80);
        canvas.drawRoundRect(new RectF(30.0f, 30.0f, 1080 - 30.0f, 900 - 30.0f), 24.0f, 24.0f, borderPaint);
        Paint textPaint = new Paint();
        textPaint.setColor(ColorKt.m4216toArgb8_81llA(textColor));
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(2.2f * fontSize);
        textPaint.setFakeBoldText(true);
        List<String> words = StringsKt.split$default((CharSequence) text, new String[]{" "}, false, 0, 6, (Object) null);
        List lines = new ArrayList();
        String curr = "";
        for (String w : words) {
            if ((curr + w).length() > 20) {
                lines.add(curr);
                curr = w + " ";
            } else {
                curr = curr + w + " ";
            }
        }
        if (!StringsKt.isBlank(curr)) {
            lines.add(curr);
        }
        float lineHeight = 2.8f * fontSize;
        float f3 = 2.0f;
        float startY = ((900 / 2.0f) - (((lines.size() - 1) * lineHeight) / 2.0f)) + (0.7f * fontSize);
        int i = 0;
        for (Object obj : lines) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            float f4 = f3;
            canvas.drawText(StringsKt.trim((CharSequence) obj).toString(), 1080 / f4, (i * lineHeight) + startY, textPaint);
            i = i2;
            f3 = f4;
            borderPaint = borderPaint;
        }
        float f5 = f3;
        if (hasWatermark) {
            Paint wmBg = new Paint();
            wmBg.setColor(android.graphics.Color.argb(160, 0, 0, 0));
            Paint wmText = new Paint();
            wmText.setColor(-1);
            wmText.setTextSize(28.0f);
            wmText.setFakeBoldText(true);
            wmText.setTextAlign(Paint.Align.CENTER);
            wmText.setAntiAlias(true);
            canvas.drawRoundRect(new RectF((1080 / f5) - 240.0f, 900 - 70.0f, (1080 / f5) + 240.0f, 900 - 20.0f), 16.0f, 16.0f, wmBg);
            canvas.drawText("⚡ Made with OmniTools App", 1080 / f5, 900 - 36.0f, wmText);
        }
        return bitmap2;
    }

    /* renamed from: renderRgbFontCardBitmap-RPmYEkk, reason: not valid java name */
    private static final Bitmap m7141renderRgbFontCardBitmapRPmYEkk(String text, long rgbColor, float fontSize, boolean hasWatermark) {
        Bitmap bitmap = Bitmap.createBitmap(1080, 900, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmap);
        Paint bgPaint = new Paint();
        bgPaint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 900, new int[]{android.graphics.Color.parseColor("#0F172A"), android.graphics.Color.parseColor("#020617")}, (float[]) null, Shader.TileMode.CLAMP));
        canvas.drawRect(0.0f, 0.0f, 1080, 900, bgPaint);
        Paint borderPaint = new Paint();
        borderPaint.setColor(ColorKt.m4216toArgb8_81llA(rgbColor));
        borderPaint.setStyle(Paint.Style.STROKE);
        borderPaint.setStrokeWidth(8.0f);
        canvas.drawRoundRect(new RectF(30.0f, 30.0f, 1080 - 30.0f, 900 - 30.0f), 28.0f, 28.0f, borderPaint);
        Paint textPaint = new Paint();
        textPaint.setColor(ColorKt.m4216toArgb8_81llA(rgbColor));
        textPaint.setTextSize(RangesKt.coerceIn(2.3f * fontSize, 40.0f, 110.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setAntiAlias(true);
        textPaint.setFakeBoldText(true);
        List lines = StringsKt.split$default((CharSequence) text, new String[]{"\n"}, false, 0, 6, (Object) null);
        float lineHeight = textPaint.getTextSize() * 1.35f;
        float totalHeight = lines.size() * lineHeight;
        float f = 2.0f;
        float startY = ((900 - totalHeight) / 2.0f) + textPaint.getTextSize();
        int i = 0;
        for (Object obj : lines) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            float f2 = f;
            canvas.drawText(StringsKt.trim((CharSequence) obj).toString(), 1080 / f2, (i * lineHeight) + startY, textPaint);
            i = i2;
            f = f2;
        }
        float f3 = f;
        Paint subPaint = new Paint();
        subPaint.setColor(android.graphics.Color.argb(180, 255, 255, 255));
        subPaint.setTextSize(30.0f);
        subPaint.setTextAlign(Paint.Align.CENTER);
        subPaint.setAntiAlias(true);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String hexStr = String.format("#%02X%02X%02X", Arrays.copyOf(new Object[]{Integer.valueOf((int) (Color.m4168getRedimpl(rgbColor) * 255.0f)), Integer.valueOf((int) (Color.m4167getGreenimpl(rgbColor) * 255.0f)), Integer.valueOf((int) (Color.m4165getBlueimpl(rgbColor) * 255.0f))}, 3));
        Intrinsics.checkNotNullExpressionValue(hexStr, "format(...)");
        canvas.drawText("HEX: " + hexStr + "  •  RGB: (" + ((int) (Color.m4168getRedimpl(rgbColor) * 255.0f)) + ", " + ((int) (Color.m4167getGreenimpl(rgbColor) * 255.0f)) + ", " + ((int) (255.0f * Color.m4165getBlueimpl(rgbColor))) + ")", 1080 / f3, 900 - 120.0f, subPaint);
        if (hasWatermark) {
            Paint wmBg = new Paint();
            wmBg.setColor(android.graphics.Color.argb(160, 0, 0, 0));
            Paint wmText = new Paint();
            wmText.setColor(-1);
            wmText.setTextSize(28.0f);
            wmText.setFakeBoldText(true);
            wmText.setTextAlign(Paint.Align.CENTER);
            wmText.setAntiAlias(true);
            canvas.drawRoundRect(new RectF((1080 / f3) - 240.0f, 900 - 70.0f, (1080 / f3) + 240.0f, 900 - 20.0f), 16.0f, 16.0f, wmBg);
            canvas.drawText("⚡ Made with OmniTools App", 1080 / f3, 900 - 36.0f, wmText);
        }
        return bitmap;
    }

    private static final String convertMathSerifBold(String text) {
        StringBuilder sb = new StringBuilder();
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if ('A' <= ch && ch < '[') {
                sb.append(Character.toChars((ch - 'A') + 119808));
            } else if ('a' <= ch && ch < '{') {
                sb.append(Character.toChars((ch - 'a') + 119834));
            } else if ('0' <= ch && ch < ':') {
                sb.append(Character.toChars((ch - '0') + 120782));
            } else {
                sb.append(ch);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private static final String convertMathSansBold(String text) {
        StringBuilder sb = new StringBuilder();
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if ('A' <= ch && ch < '[') {
                sb.append(Character.toChars((ch - 'A') + 120276));
            } else if ('a' <= ch && ch < '{') {
                sb.append(Character.toChars((ch - 'a') + 120302));
            } else if ('0' <= ch && ch < ':') {
                sb.append(Character.toChars((ch - '0') + 120812));
            } else {
                sb.append(ch);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private static final String convertMathSerifItalic(String text) {
        StringBuilder sb = new StringBuilder();
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch == 'h') {
                sb.append("ℎ");
            } else if ('A' <= ch && ch < '[') {
                sb.append(Character.toChars((ch - 'A') + 119860));
            } else if ('a' <= ch && ch < '{') {
                sb.append(Character.toChars((ch - 'a') + 119886));
            } else {
                sb.append(ch);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private static final String convertMathBoldItalic(String text) {
        StringBuilder sb = new StringBuilder();
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if ('A' <= ch && ch < '[') {
                sb.append(Character.toChars((ch - 'A') + 119912));
            } else if ('a' <= ch && ch < '{') {
                sb.append(Character.toChars((ch - 'a') + 119938));
            } else {
                sb.append(ch);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private static final String convertScript(String text) {
        Map scriptMap = MapsKt.mapOf(TuplesKt.to('A', "𝒜"), TuplesKt.to('B', "ℬ"), TuplesKt.to('C', "𝒞"), TuplesKt.to('D', "𝒟"), TuplesKt.to('E', "ℰ"), TuplesKt.to('F', "ℱ"), TuplesKt.to('G', "𝒢"), TuplesKt.to('H', "ℋ"), TuplesKt.to('I', "ℐ"), TuplesKt.to('J', "𝒥"), TuplesKt.to('K', "𝒦"), TuplesKt.to('L', "ℒ"), TuplesKt.to('M', "ℳ"), TuplesKt.to('N', "𝒩"), TuplesKt.to('O', "𝒪"), TuplesKt.to('P', "𝒫"), TuplesKt.to('Q', "𝒬"), TuplesKt.to('R', "ℛ"), TuplesKt.to('S', "𝒮"), TuplesKt.to('T', "𝒯"), TuplesKt.to('U', "𝒰"), TuplesKt.to('V', "𝒱"), TuplesKt.to('W', "𝒲"), TuplesKt.to('X', "𝒳"), TuplesKt.to('Y', "𝒴"), TuplesKt.to('Z', "𝒵"), TuplesKt.to('a', "𝒶"), TuplesKt.to('b', "𝒷"), TuplesKt.to('c', "𝒸"), TuplesKt.to('d', "𝒹"), TuplesKt.to('e', "ℯ"), TuplesKt.to('f', "𝒻"), TuplesKt.to('g', "ℊ"), TuplesKt.to('h', "𝒽"), TuplesKt.to('i', "𝒾"), TuplesKt.to('j', "𝒿"), TuplesKt.to('k', "𝓀"), TuplesKt.to('l', "𝓁"), TuplesKt.to('m', "𝓂"), TuplesKt.to('n', "𝓃"), TuplesKt.to('o', "ℴ"), TuplesKt.to('p', "𝓅"), TuplesKt.to('q', "𝓆"), TuplesKt.to('r', "𝓇"), TuplesKt.to('s', "𝓈"), TuplesKt.to('t', "𝓉"), TuplesKt.to('u', "𝓊"), TuplesKt.to('v', "𝓋"), TuplesKt.to('w', "𝓌"), TuplesKt.to('x', "𝓍"), TuplesKt.to('y', "𝓎"), TuplesKt.to('z', "𝓏"));
        String str = text;
        Collection arrayList = new ArrayList(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            String str2 = (String) scriptMap.get(Character.valueOf(charAt));
            if (str2 == null) {
                str2 = String.valueOf(charAt);
            }
            arrayList.add(str2);
        }
        return CollectionsKt.joinToString$default((List) arrayList, "", null, null, 0, null, null, 62, null);
    }

    private static final String convertBoldScript(String text) {
        StringBuilder sb = new StringBuilder();
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if ('A' <= ch && ch < '[') {
                sb.append(Character.toChars((ch - 'A') + 120016));
            } else if ('a' <= ch && ch < '{') {
                sb.append(Character.toChars((ch - 'a') + 120042));
            } else {
                sb.append(ch);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private static final String convertFraktur(String text) {
        Map frakturMap = MapsKt.mapOf(TuplesKt.to('C', "ℭ"), TuplesKt.to('H', "ℌ"), TuplesKt.to('I', "ℑ"), TuplesKt.to('R', "ℜ"), TuplesKt.to('Z', "ℨ"));
        StringBuilder sb = new StringBuilder();
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (frakturMap.containsKey(Character.valueOf(ch))) {
                sb.append((String) frakturMap.get(Character.valueOf(ch)));
            } else if ('A' <= ch && ch < '[') {
                sb.append(Character.toChars((ch - 'A') + 120068));
            } else if ('a' <= ch && ch < '{') {
                sb.append(Character.toChars((ch - 'a') + 120094));
            } else {
                sb.append(ch);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private static final String convertBoldFraktur(String text) {
        StringBuilder sb = new StringBuilder();
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if ('A' <= ch && ch < '[') {
                sb.append(Character.toChars((ch - 'A') + 120172));
            } else if ('a' <= ch && ch < '{') {
                sb.append(Character.toChars((ch - 'a') + 120198));
            } else {
                sb.append(ch);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private static final String convertDoubleStruck(String text) {
        Map map = MapsKt.mapOf(TuplesKt.to('C', "ℂ"), TuplesKt.to('H', "ℍ"), TuplesKt.to('N', "ℕ"), TuplesKt.to('P', "ℙ"), TuplesKt.to('Q', "ℚ"), TuplesKt.to('R', "ℝ"), TuplesKt.to('Z', "ℤ"));
        StringBuilder sb = new StringBuilder();
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (map.containsKey(Character.valueOf(ch))) {
                sb.append((String) map.get(Character.valueOf(ch)));
            } else if ('A' <= ch && ch < '[') {
                sb.append(Character.toChars((ch - 'A') + 120120));
            } else if ('a' <= ch && ch < '{') {
                sb.append(Character.toChars((ch - 'a') + 120146));
            } else if ('0' <= ch && ch < ':') {
                sb.append(Character.toChars((ch - '0') + 120792));
            } else {
                sb.append(ch);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private static final String convertCircled(String text) {
        StringBuilder sb = new StringBuilder();
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if ('A' <= ch && ch < '[') {
                sb.append(Character.toChars((ch - 'A') + 9398));
            } else if ('a' <= ch && ch < '{') {
                sb.append(Character.toChars((ch - 'a') + 9424));
            } else if ('1' <= ch && ch < ':') {
                sb.append(Character.toChars((ch - '1') + 9312));
            } else if (ch == '0') {
                sb.append("⓪");
            } else {
                sb.append(ch);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private static final String convertCircledFilled(String text) {
        StringBuilder sb = new StringBuilder();
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if ('A' <= ch && ch < '[') {
                sb.append(Character.toChars((ch - 'A') + 127312));
            } else if ('a' <= ch && ch < '{') {
                sb.append(Character.toChars((ch - 'a') + 127312));
            } else {
                sb.append(ch);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private static final String convertSquared(String text) {
        StringBuilder sb = new StringBuilder();
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if ('A' <= ch && ch < '[') {
                sb.append(Character.toChars((ch - 'A') + 127280));
            } else if ('a' <= ch && ch < '{') {
                sb.append(Character.toChars((ch - 'a') + 127280));
            } else {
                sb.append(ch);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private static final String convertMonospace(String text) {
        StringBuilder sb = new StringBuilder();
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if ('A' <= ch && ch < '[') {
                sb.append(Character.toChars((ch - 'A') + 120432));
            } else if ('a' <= ch && ch < '{') {
                sb.append(Character.toChars((ch - 'a') + 120458));
            } else if ('0' <= ch && ch < ':') {
                sb.append(Character.toChars((ch - '0') + 120822));
            } else {
                sb.append(ch);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private static final String convertSmallCaps(String text) {
        Map map = MapsKt.mapOf(TuplesKt.to('a', "ᴀ"), TuplesKt.to('b', "ʙ"), TuplesKt.to('c', "ᴄ"), TuplesKt.to('d', "ᴅ"), TuplesKt.to('e', "ᴇ"), TuplesKt.to('f', "ꜰ"), TuplesKt.to('g', "ɢ"), TuplesKt.to('h', "ʜ"), TuplesKt.to('i', "ɪ"), TuplesKt.to('j', "ᴊ"), TuplesKt.to('k', "ᴋ"), TuplesKt.to('l', "ʟ"), TuplesKt.to('m', "ᴍ"), TuplesKt.to('n', "ɴ"), TuplesKt.to('o', "ᴏ"), TuplesKt.to('p', "ᴘ"), TuplesKt.to('q', "ǫ"), TuplesKt.to('r', "ʀ"), TuplesKt.to('s', "ꜱ"), TuplesKt.to('t', "ᴛ"), TuplesKt.to('u', "ᴜ"), TuplesKt.to('v', "ᴠ"), TuplesKt.to('w', "ᴡ"), TuplesKt.to('x', "x"), TuplesKt.to('y', "ʏ"), TuplesKt.to('z', "ᴢ"), TuplesKt.to('A', "ᴀ"), TuplesKt.to('B', "ʙ"), TuplesKt.to('C', "ᴄ"), TuplesKt.to('D', "ᴅ"), TuplesKt.to('E', "ᴇ"), TuplesKt.to('F', "ꜰ"), TuplesKt.to('G', "ɢ"), TuplesKt.to('H', "ʜ"), TuplesKt.to('I', "ɪ"), TuplesKt.to('J', "ᴊ"), TuplesKt.to('K', "ᴋ"), TuplesKt.to('L', "ʟ"), TuplesKt.to('M', "ᴍ"), TuplesKt.to('N', "ɴ"), TuplesKt.to('O', "ᴏ"), TuplesKt.to('P', "ᴘ"), TuplesKt.to('Q', "ǫ"), TuplesKt.to('R', "ʀ"), TuplesKt.to('S', "ꜱ"), TuplesKt.to('T', "ᴛ"), TuplesKt.to('U', "ᴜ"), TuplesKt.to('V', "ᴠ"), TuplesKt.to('W', "ᴡ"), TuplesKt.to('X', "x"), TuplesKt.to('Y', "ʏ"), TuplesKt.to('Z', "ᴢ"));
        String str = text;
        Collection arrayList = new ArrayList(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            String str2 = (String) map.get(Character.valueOf(charAt));
            if (str2 == null) {
                str2 = String.valueOf(charAt);
            }
            arrayList.add(str2);
        }
        return CollectionsKt.joinToString$default((List) arrayList, "", null, null, 0, null, null, 62, null);
    }

    private static final String convertUpsideDown(String text) {
        StringBuilder sb = new StringBuilder();
        int i = text.length();
        while (true) {
            i--;
            if (-1 < i) {
                char c = text.charAt(i);
                int idx = StringsKt.indexOf$default((CharSequence) "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?!&_.", c, 0, false, 6, (Object) null);
                if (idx != -1) {
                    sb.append("ɐqɔpǝɟƃɥıɾʞlɯuodbɹsʇnʌʍxʎz∀ᗺƆᗡƎℲ⅁HIſʞ˥WNOԀÒᴚS⊥∩ΛMX⅄Z0ƖᄅƐㄣϛ9ㄥ86¿¡⅋‾˙".charAt(idx));
                } else {
                    sb.append(c);
                }
            } else {
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                return sb2;
            }
        }
    }

    private static final String convertStrikethrough(String text) {
        String str = text;
        Collection arrayList = new ArrayList(str.length());
        for (int i = 0; i < str.length(); i++) {
            arrayList.add(str.charAt(i) + "̶");
        }
        return CollectionsKt.joinToString$default((List) arrayList, "", null, null, 0, null, null, 62, null);
    }

    private static final String convertUnderline(String text) {
        String str = text;
        Collection arrayList = new ArrayList(str.length());
        for (int i = 0; i < str.length(); i++) {
            arrayList.add(str.charAt(i) + "̲");
        }
        return CollectionsKt.joinToString$default((List) arrayList, "", null, null, 0, null, null, 62, null);
    }

    private static final String convertSlash(String text) {
        String str = text;
        Collection arrayList = new ArrayList(str.length());
        for (int i = 0; i < str.length(); i++) {
            arrayList.add(str.charAt(i) + "̷");
        }
        return CollectionsKt.joinToString$default((List) arrayList, "", null, null, 0, null, null, 62, null);
    }

    private static final String convertFullwidth(String text) {
        StringBuilder sb = new StringBuilder();
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if ('!' <= ch && ch < 127) {
                sb.append(Character.toChars(65248 + ch));
            } else if (ch == ' ') {
                sb.append("\u3000");
            } else {
                sb.append(ch);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
