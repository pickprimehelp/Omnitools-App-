package com.example.ui.tools.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.PickVisualMediaRequestKt;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.example.util.ImageExportUtils;
import java.io.ByteArrayOutputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: ImageTools.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a2\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000bH\u0002\u001a\u001b\u0010\f\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0002\u001a\u001b\u0010\u0014\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\tH\u0002¨\u0006\u0018²\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u008a\u008e\u0002²\u0006\f\u0010\u001b\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002²\u0006\f\u0010\u001c\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u008e\u0002²\u0006\n\u0010\u001f\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\"X\u008a\u008e\u0002²\u0006\f\u0010#\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002²\u0006\n\u0010$\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\f\u0010%\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002²\u0006\f\u0010&\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010(\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010)\u001a\u00020\u001eX\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020+X\u008a\u008e\u0002"}, d2 = {"ImageCompressorScreen", "", "onBack", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "compressBitmap", "source", "Landroid/graphics/Bitmap;", "quality", "", "onResult", "Lkotlin/Function2;", "PassportPhotoMakerScreen", "renderPassportPhoto", "bgColor", "Landroidx/compose/ui/graphics/Color;", "renderPassportPhoto-4WTKRHQ", "(Landroid/graphics/Bitmap;J)Landroid/graphics/Bitmap;", "renderSixPhotoSheet", "passportPhoto", "ImageQualityCheckerScreen", "findGcd", "a", "b", "app", "selectedImageUri", "Landroid/net/Uri;", "originalBitmap", "compressedBitmap", "qualityPercent", "", "originalSizeKb", "compressedSizeKb", "isProcessing", "", "sourceBitmap", "selectedBgColor", "passportBitmap", "imageBmp", "widthPx", "heightPx", "megapixels", "qualityRating", ""}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ImageToolsKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ImageCompressorScreen$lambda$56(Function0 function0, int i, Composer composer, int i2) {
        ImageCompressorScreen(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ImageQualityCheckerScreen$lambda$127(Function0 function0, int i, Composer composer, int i2) {
        ImageQualityCheckerScreen(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PassportPhotoMakerScreen$lambda$92(Function0 function0, int i, Composer composer, int i2) {
        PassportPhotoMakerScreen(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ImageCompressorScreen(final Function0<Unit> onBack, Composer $composer, final int $changed) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        final Context context;
        MutableState compressedBitmap$delegate;
        final MutableState originalBitmap$delegate;
        final MutableIntState compressedSizeKb$delegate;
        Object obj10;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer $composer2 = $composer.startRestartGroup(897944325);
        ComposerKt.sourceInformation($composer2, "C(ImageCompressorScreen)100@4424L12,100@4412L24,101@4468L7,102@4492L24,104@4546L39,105@4612L42,106@4683L42,107@4752L37,108@4816L33,109@4878L33,110@4936L34,114@5104L1055,112@5002L1157,141@6192L536,155@6735L7718,140@6165L8288:ImageTools.kt#clnccf");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(onBack) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(897944325, $dirty, -1, "com.example.ui.tools.image.ImageCompressorScreen (ImageTools.kt:99)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -363926447, "CC(remember):ImageTools.kt#9igjgp");
            boolean z = ($dirty & 14) == 4;
            Object rememberedValue = $composer2.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.tools.image.ImageToolsKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ImageToolsKt.ImageCompressorScreen$lambda$1$lambda$0(Function0.this);
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
            ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer2, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue2 = $composer2.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2));
                $composer2.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final CoroutineScope scope = ((CompositionScopedCoroutineScopeCanceller) obj2).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -363922516, "CC(remember):ImageTools.kt#9igjgp");
            Object rememberedValue3 = $composer2.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer2.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            final MutableState selectedImageUri$delegate = (MutableState) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -363920401, "CC(remember):ImageTools.kt#9igjgp");
            Object rememberedValue4 = $composer2.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                obj4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer2.updateRememberedValue(obj4);
            } else {
                obj4 = rememberedValue4;
            }
            final MutableState originalBitmap$delegate2 = (MutableState) obj4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -363918129, "CC(remember):ImageTools.kt#9igjgp");
            Object rememberedValue5 = $composer2.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                obj5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer2.updateRememberedValue(obj5);
            } else {
                obj5 = rememberedValue5;
            }
            final MutableState compressedBitmap$delegate2 = (MutableState) obj5;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -363915926, "CC(remember):ImageTools.kt#9igjgp");
            Object rememberedValue6 = $composer2.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                obj6 = PrimitiveSnapshotStateKt.mutableFloatStateOf(70.0f);
                $composer2.updateRememberedValue(obj6);
            } else {
                obj6 = rememberedValue6;
            }
            final MutableFloatState qualityPercent$delegate = (MutableFloatState) obj6;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -363913882, "CC(remember):ImageTools.kt#9igjgp");
            Object rememberedValue7 = $composer2.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                obj7 = SnapshotIntStateKt.mutableIntStateOf(0);
                $composer2.updateRememberedValue(obj7);
            } else {
                obj7 = rememberedValue7;
            }
            final MutableIntState originalSizeKb$delegate = (MutableIntState) obj7;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -363911898, "CC(remember):ImageTools.kt#9igjgp");
            Object rememberedValue8 = $composer2.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                obj8 = SnapshotIntStateKt.mutableIntStateOf(0);
                $composer2.updateRememberedValue(obj8);
            } else {
                obj8 = rememberedValue8;
            }
            final MutableIntState compressedSizeKb$delegate2 = (MutableIntState) obj8;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -363910041, "CC(remember):ImageTools.kt#9igjgp");
            Object rememberedValue9 = $composer2.rememberedValue();
            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                obj9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(obj9);
            } else {
                obj9 = rememberedValue9;
            }
            final MutableState isProcessing$delegate = (MutableState) obj9;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ActivityResultContracts.PickVisualMedia pickVisualMedia = new ActivityResultContracts.PickVisualMedia();
            ComposerKt.sourceInformationMarkerStart($composer2, -363903644, "CC(remember):ImageTools.kt#9igjgp");
            boolean changedInstance = $composer2.changedInstance(scope) | $composer2.changedInstance(context2);
            Object rememberedValue10 = $composer2.rememberedValue();
            if (changedInstance || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                context = context2;
                Function1 function1 = new Function1() { // from class: com.example.ui.tools.image.ImageToolsKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj11) {
                        return ImageToolsKt.ImageCompressorScreen$lambda$24$lambda$23(CoroutineScope.this, selectedImageUri$delegate, context, isProcessing$delegate, originalBitmap$delegate2, originalSizeKb$delegate, qualityPercent$delegate, compressedBitmap$delegate2, compressedSizeKb$delegate2, (Uri) obj11);
                    }
                };
                compressedBitmap$delegate = compressedBitmap$delegate2;
                originalBitmap$delegate = originalBitmap$delegate2;
                compressedSizeKb$delegate = compressedSizeKb$delegate2;
                originalSizeKb$delegate = originalSizeKb$delegate;
                qualityPercent$delegate = qualityPercent$delegate;
                obj10 = function1;
                $composer2.updateRememberedValue(obj10);
            } else {
                context = context2;
                compressedBitmap$delegate = compressedBitmap$delegate2;
                obj10 = rememberedValue10;
                originalBitmap$delegate = originalBitmap$delegate2;
                compressedSizeKb$delegate = compressedSizeKb$delegate2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final ManagedActivityResultLauncher photoPickerLauncher = ActivityResultRegistryKt.rememberLauncherForActivityResult(pickVisualMedia, (Function1) obj10, $composer2, 0);
            final Context context3 = context;
            final MutableState compressedBitmap$delegate3 = compressedBitmap$delegate;
            ScaffoldKt.m2411ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-811517247, true, new Function2() { // from class: com.example.ui.tools.image.ImageToolsKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj11, Object obj12) {
                    return ImageToolsKt.ImageCompressorScreen$lambda$27(Function0.this, (Composer) obj11, ((Integer) obj12).intValue());
                }
            }, $composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(946351702, true, new Function3() { // from class: com.example.ui.tools.image.ImageToolsKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj11, Object obj12, Object obj13) {
                    return ImageToolsKt.ImageCompressorScreen$lambda$55(ManagedActivityResultLauncher.this, originalBitmap$delegate, compressedBitmap$delegate3, originalSizeKb$delegate, compressedSizeKb$delegate, qualityPercent$delegate, context3, (PaddingValues) obj11, (Composer) obj12, ((Integer) obj13).intValue());
                }
            }, $composer2, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.tools.image.ImageToolsKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj11, Object obj12) {
                    return ImageToolsKt.ImageCompressorScreen$lambda$56(Function0.this, $changed, (Composer) obj11, ((Integer) obj12).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ImageCompressorScreen$lambda$1$lambda$0(Function0 $onBack) {
        $onBack.invoke();
        return Unit.INSTANCE;
    }

    private static final Bitmap ImageCompressorScreen$lambda$6(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    private static final Bitmap ImageCompressorScreen$lambda$9(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ImageCompressorScreen$lambda$12(MutableFloatState $qualityPercent$delegate) {
        return $qualityPercent$delegate.getFloatValue();
    }

    private static final int ImageCompressorScreen$lambda$15(MutableIntState $originalSizeKb$delegate) {
        return $originalSizeKb$delegate.getIntValue();
    }

    private static final int ImageCompressorScreen$lambda$18(MutableIntState $compressedSizeKb$delegate) {
        return $compressedSizeKb$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ImageCompressorScreen$lambda$22(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ImageCompressorScreen$lambda$24$lambda$23(CoroutineScope $scope, MutableState $selectedImageUri$delegate, Context $context, MutableState $isProcessing$delegate, MutableState $originalBitmap$delegate, MutableIntState $originalSizeKb$delegate, MutableFloatState $qualityPercent$delegate, MutableState $compressedBitmap$delegate, MutableIntState $compressedSizeKb$delegate, Uri uri) {
        if (uri != null) {
            $selectedImageUri$delegate.setValue(uri);
            BuildersKt__Builders_commonKt.launch$default($scope, Dispatchers.getIO(), null, new ImageToolsKt$ImageCompressorScreen$photoPickerLauncher$1$1$1($context, uri, $isProcessing$delegate, $originalBitmap$delegate, $originalSizeKb$delegate, $qualityPercent$delegate, $compressedBitmap$delegate, $compressedSizeKb$delegate, null), 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ImageCompressorScreen$lambda$27(final kotlin.jvm.functions.Function0 r41, androidx.compose.runtime.Composer r42, int r43) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.image.ImageToolsKt.ImageCompressorScreen$lambda$27(kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ImageCompressorScreen$lambda$27$lambda$26$lambda$25(Function0 $onBack, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C146@6363L155:ImageTools.kt#clnccf");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1160129199, $changed, -1, "com.example.ui.tools.image.ImageCompressorScreen.<anonymous>.<anonymous>.<anonymous> (ImageTools.kt:146)");
            }
            IconButtonKt.IconButton($onBack, null, false, null, null, ComposableSingletons$ImageToolsKt.INSTANCE.getLambda$741244526$app(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x04a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ImageCompressorScreen$lambda$55(final androidx.activity.compose.ManagedActivityResultLauncher r66, final androidx.compose.runtime.MutableState r67, final androidx.compose.runtime.MutableState r68, final androidx.compose.runtime.MutableIntState r69, final androidx.compose.runtime.MutableIntState r70, final androidx.compose.runtime.MutableFloatState r71, final android.content.Context r72, androidx.compose.foundation.layout.PaddingValues r73, androidx.compose.runtime.Composer r74, int r75) {
        /*
            Method dump skipped, instructions count: 1404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.image.ImageToolsKt.ImageCompressorScreen$lambda$55(androidx.activity.compose.ManagedActivityResultLauncher, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableFloatState, android.content.Context, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ImageCompressorScreen$lambda$55$lambda$54$lambda$29$lambda$28(ManagedActivityResultLauncher $photoPickerLauncher) {
        $photoPickerLauncher.launch(PickVisualMediaRequestKt.PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE, 0, false, null, 14, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0410 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x08e1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0995  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x06c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x052d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ImageCompressorScreen$lambda$55$lambda$54$lambda$37(androidx.compose.runtime.MutableState r105, androidx.compose.runtime.MutableIntState r106, androidx.compose.runtime.MutableIntState r107, androidx.compose.foundation.layout.ColumnScope r108, androidx.compose.runtime.Composer r109, int r110) {
        /*
            Method dump skipped, instructions count: 2459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.image.ImageToolsKt.ImageCompressorScreen$lambda$55$lambda$54$lambda$37(androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableIntState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ImageCompressorScreen$lambda$55$lambda$54$lambda$44(final androidx.compose.runtime.MutableFloatState r71, final androidx.compose.runtime.MutableState r72, final androidx.compose.runtime.MutableState r73, final androidx.compose.runtime.MutableIntState r74, androidx.compose.foundation.layout.ColumnScope r75, androidx.compose.runtime.Composer r76, int r77) {
        /*
            Method dump skipped, instructions count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.image.ImageToolsKt.ImageCompressorScreen$lambda$55$lambda$54$lambda$44(androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableIntState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ImageCompressorScreen$lambda$55$lambda$54$lambda$44$lambda$43$lambda$42$lambda$41(MutableFloatState $qualityPercent$delegate, MutableState $originalBitmap$delegate, final MutableState $compressedBitmap$delegate, final MutableIntState $compressedSizeKb$delegate, float it) {
        $qualityPercent$delegate.setFloatValue(it);
        Bitmap ImageCompressorScreen$lambda$6 = ImageCompressorScreen$lambda$6($originalBitmap$delegate);
        if (ImageCompressorScreen$lambda$6 != null) {
            compressBitmap(ImageCompressorScreen$lambda$6, (int) it, new Function2() { // from class: com.example.ui.tools.image.ImageToolsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ImageToolsKt.ImageCompressorScreen$lambda$55$lambda$54$lambda$44$lambda$43$lambda$42$lambda$41$lambda$40$lambda$39(MutableState.this, $compressedSizeKb$delegate, (Bitmap) obj, ((Integer) obj2).intValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ImageCompressorScreen$lambda$55$lambda$54$lambda$44$lambda$43$lambda$42$lambda$41$lambda$40$lambda$39(MutableState $compressedBitmap$delegate, MutableIntState $compressedSizeKb$delegate, Bitmap compBmp, int compSize) {
        Intrinsics.checkNotNullParameter(compBmp, "compBmp");
        $compressedBitmap$delegate.setValue(compBmp);
        $compressedSizeKb$delegate.setIntValue(compSize);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ImageCompressorScreen$lambda$55$lambda$54$lambda$51$lambda$47$lambda$46(MutableState $compressedBitmap$delegate, Context $context) {
        Bitmap ImageCompressorScreen$lambda$9 = ImageCompressorScreen$lambda$9($compressedBitmap$delegate);
        if (ImageCompressorScreen$lambda$9 != null) {
            ImageExportUtils.INSTANCE.saveBitmapToGallery($context, ImageCompressorScreen$lambda$9, "Compressed");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ImageCompressorScreen$lambda$55$lambda$54$lambda$51$lambda$50$lambda$49(MutableState $compressedBitmap$delegate, Context $context) {
        Bitmap ImageCompressorScreen$lambda$9 = ImageCompressorScreen$lambda$9($compressedBitmap$delegate);
        if (ImageCompressorScreen$lambda$9 != null) {
            ImageExportUtils.INSTANCE.shareBitmap($context, ImageCompressorScreen$lambda$9, "Compressed Image");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ImageCompressorScreen$lambda$55$lambda$54$lambda$53$lambda$52(ManagedActivityResultLauncher $photoPickerLauncher) {
        $photoPickerLauncher.launch(PickVisualMediaRequestKt.PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE, 0, false, null, 14, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void compressBitmap(Bitmap source, int quality, Function2<? super Bitmap, ? super Integer, Unit> function2) {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        source.compress(Bitmap.CompressFormat.JPEG, quality, stream);
        byte[] byteArray = stream.toByteArray();
        Bitmap compressed = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        Intrinsics.checkNotNull(compressed);
        function2.invoke(compressed, Integer.valueOf(byteArray.length / 1024));
    }

    public static final void PassportPhotoMakerScreen(final Function0<Unit> onBack, Composer $composer, final int $changed) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        final Context context;
        final MutableState sourceBitmap$delegate;
        Object obj6;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer $composer2 = $composer.startRestartGroup(1529676037);
        ComposerKt.sourceInformation($composer2, "C(PassportPhotoMakerScreen)323@15074L12,323@15062L24,324@15118L7,325@15142L24,327@15192L42,328@15262L46,329@15349L42,340@15728L459,338@15626L561,355@16220L540,369@16767L4730,354@16193L5304:ImageTools.kt#clnccf");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(onBack) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1529676037, $dirty, -1, "com.example.ui.tools.image.PassportPhotoMakerScreen (ImageTools.kt:322)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 1139860145, "CC(remember):ImageTools.kt#9igjgp");
            boolean z = ($dirty & 14) == 4;
            Object rememberedValue = $composer2.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.tools.image.ImageToolsKt$$ExternalSyntheticLambda33
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ImageToolsKt.PassportPhotoMakerScreen$lambda$58$lambda$57(Function0.this);
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
            ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer2, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue2 = $composer2.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2));
                $composer2.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final CoroutineScope scope = ((CompositionScopedCoroutineScopeCanceller) obj2).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1139863951, "CC(remember):ImageTools.kt#9igjgp");
            Object rememberedValue3 = $composer2.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer2.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            MutableState sourceBitmap$delegate2 = (MutableState) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1139866195, "CC(remember):ImageTools.kt#9igjgp");
            Object rememberedValue4 = $composer2.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                obj4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m4152boximpl(ColorKt.Color(4280640491L)), null, 2, null);
                $composer2.updateRememberedValue(obj4);
            } else {
                obj4 = rememberedValue4;
            }
            final MutableState selectedBgColor$delegate = (MutableState) obj4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1139868975, "CC(remember):ImageTools.kt#9igjgp");
            Object rememberedValue5 = $composer2.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                obj5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer2.updateRememberedValue(obj5);
            } else {
                obj5 = rememberedValue5;
            }
            final MutableState passportBitmap$delegate = (MutableState) obj5;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final List bgColors = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("Studio Blue", Color.m4152boximpl(ColorKt.Color(4280640491L))), TuplesKt.to("Pure White", Color.m4152boximpl(ColorKt.Color(4294967295L))), TuplesKt.to("Soft Gray", Color.m4152boximpl(ColorKt.Color(4293060848L))), TuplesKt.to("Sky Blue", Color.m4152boximpl(ColorKt.Color(4281908728L)))});
            ActivityResultContracts.PickVisualMedia pickVisualMedia = new ActivityResultContracts.PickVisualMedia();
            ComposerKt.sourceInformationMarkerStart($composer2, 1139881520, "CC(remember):ImageTools.kt#9igjgp");
            boolean changedInstance = $composer2.changedInstance(scope) | $composer2.changedInstance(context2);
            Object rememberedValue6 = $composer2.rememberedValue();
            if (changedInstance || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                context = context2;
                sourceBitmap$delegate = sourceBitmap$delegate2;
                obj6 = new Function1() { // from class: com.example.ui.tools.image.ImageToolsKt$$ExternalSyntheticLambda34
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        return ImageToolsKt.PassportPhotoMakerScreen$lambda$69$lambda$68(CoroutineScope.this, context, sourceBitmap$delegate, selectedBgColor$delegate, passportBitmap$delegate, (Uri) obj7);
                    }
                };
                $composer2.updateRememberedValue(obj6);
            } else {
                context = context2;
                sourceBitmap$delegate = sourceBitmap$delegate2;
                obj6 = rememberedValue6;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final ManagedActivityResultLauncher photoPickerLauncher = ActivityResultRegistryKt.rememberLauncherForActivityResult(pickVisualMedia, (Function1) obj6, $composer2, 0);
            final MutableState sourceBitmap$delegate3 = sourceBitmap$delegate;
            ScaffoldKt.m2411ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(387213257, true, new Function2() { // from class: com.example.ui.tools.image.ImageToolsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj7, Object obj8) {
                    return ImageToolsKt.PassportPhotoMakerScreen$lambda$72(Function0.this, (Composer) obj7, ((Integer) obj8).intValue());
                }
            }, $composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(524832788, true, new Function3() { // from class: com.example.ui.tools.image.ImageToolsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj7, Object obj8, Object obj9) {
                    return ImageToolsKt.PassportPhotoMakerScreen$lambda$91(ManagedActivityResultLauncher.this, context, passportBitmap$delegate, bgColors, selectedBgColor$delegate, sourceBitmap$delegate3, (PaddingValues) obj7, (Composer) obj8, ((Integer) obj9).intValue());
                }
            }, $composer2, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.tools.image.ImageToolsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj7, Object obj8) {
                    return ImageToolsKt.PassportPhotoMakerScreen$lambda$92(Function0.this, $changed, (Composer) obj7, ((Integer) obj8).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PassportPhotoMakerScreen$lambda$58$lambda$57(Function0 $onBack) {
        $onBack.invoke();
        return Unit.INSTANCE;
    }

    private static final Bitmap PassportPhotoMakerScreen$lambda$60(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long PassportPhotoMakerScreen$lambda$63(MutableState<Color> mutableState) {
        return mutableState.getValue().m4172unboximpl();
    }

    private static final void PassportPhotoMakerScreen$lambda$64(MutableState<Color> mutableState, long j) {
        mutableState.setValue(Color.m4152boximpl(j));
    }

    private static final Bitmap PassportPhotoMakerScreen$lambda$66(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PassportPhotoMakerScreen$lambda$69$lambda$68(CoroutineScope $scope, Context $context, MutableState $sourceBitmap$delegate, MutableState $selectedBgColor$delegate, MutableState $passportBitmap$delegate, Uri uri) {
        if (uri != null) {
            BuildersKt__Builders_commonKt.launch$default($scope, Dispatchers.getIO(), null, new ImageToolsKt$PassportPhotoMakerScreen$photoPickerLauncher$1$1$1($context, uri, $sourceBitmap$delegate, $selectedBgColor$delegate, $passportBitmap$delegate, null), 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit PassportPhotoMakerScreen$lambda$72(final kotlin.jvm.functions.Function0 r41, androidx.compose.runtime.Composer r42, int r43) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.image.ImageToolsKt.PassportPhotoMakerScreen$lambda$72(kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PassportPhotoMakerScreen$lambda$72$lambda$71$lambda$70(Function0 $onBack, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C360@16395L155:ImageTools.kt#clnccf");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(119472953, $changed, -1, "com.example.ui.tools.image.PassportPhotoMakerScreen.<anonymous>.<anonymous>.<anonymous> (ImageTools.kt:360)");
            }
            IconButtonKt.IconButton($onBack, null, false, null, null, ComposableSingletons$ImageToolsKt.INSTANCE.getLambda$1915414780$app(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0467  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit PassportPhotoMakerScreen$lambda$91(final androidx.activity.compose.ManagedActivityResultLauncher r81, final android.content.Context r82, final androidx.compose.runtime.MutableState r83, java.util.List r84, final androidx.compose.runtime.MutableState r85, final androidx.compose.runtime.MutableState r86, androidx.compose.foundation.layout.PaddingValues r87, androidx.compose.runtime.Composer r88, int r89) {
        /*
            Method dump skipped, instructions count: 1602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.image.ImageToolsKt.PassportPhotoMakerScreen$lambda$91(androidx.activity.compose.ManagedActivityResultLauncher, android.content.Context, androidx.compose.runtime.MutableState, java.util.List, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PassportPhotoMakerScreen$lambda$91$lambda$90$lambda$74$lambda$73(ManagedActivityResultLauncher $photoPickerLauncher) {
        $photoPickerLauncher.launch(PickVisualMediaRequestKt.PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE, 0, false, null, 14, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PassportPhotoMakerScreen$lambda$91$lambda$90$lambda$76(MutableState $passportBitmap$delegate, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C:ImageTools.kt#clnccf");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1972196856, $changed, -1, "com.example.ui.tools.image.PassportPhotoMakerScreen.<anonymous>.<anonymous>.<anonymous> (ImageTools.kt:413)");
            }
            Bitmap PassportPhotoMakerScreen$lambda$66 = PassportPhotoMakerScreen$lambda$66($passportBitmap$delegate);
            if (PassportPhotoMakerScreen$lambda$66 == null) {
                $composer.startReplaceGroup(1436120173);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1436120174);
                ComposerKt.sourceInformation($composer, "*414@19015L280");
                ImageKt.m284Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(PassportPhotoMakerScreen$lambda$66), "Passport Photo", SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, $composer, 25008, 232);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PassportPhotoMakerScreen$lambda$91$lambda$90$lambda$83$lambda$82$lambda$79$lambda$78(long $color, MutableState $selectedBgColor$delegate, MutableState $sourceBitmap$delegate, MutableState $passportBitmap$delegate) {
        PassportPhotoMakerScreen$lambda$64($selectedBgColor$delegate, $color);
        Bitmap PassportPhotoMakerScreen$lambda$60 = PassportPhotoMakerScreen$lambda$60($sourceBitmap$delegate);
        if (PassportPhotoMakerScreen$lambda$60 != null) {
            $passportBitmap$delegate.setValue(m7148renderPassportPhoto4WTKRHQ(PassportPhotoMakerScreen$lambda$60, $color));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PassportPhotoMakerScreen$lambda$91$lambda$90$lambda$83$lambda$82$lambda$80(String $name, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C435@20068L10:ImageTools.kt#clnccf");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1292990160, $changed, -1, "com.example.ui.tools.image.PassportPhotoMakerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ImageTools.kt:435)");
            }
            TextKt.m2696Text4IGK_g($name, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PassportPhotoMakerScreen$lambda$91$lambda$90$lambda$83$lambda$82$lambda$81(long $color, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C437@20158L110:ImageTools.kt#clnccf");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(381417555, $changed, -1, "com.example.ui.tools.image.PassportPhotoMakerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ImageTools.kt:437)");
            }
            BoxKt.Box(BorderKt.m239borderxT4_qwU(BackgroundKt.m228backgroundbw27NRU$default(ClipKt.clip(SizeKt.m718size3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(14)), RoundedCornerShapeKt.getCircleShape()), $color, null, 2, null), Dp.m6625constructorimpl(1), Color.INSTANCE.m4192getGray0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PassportPhotoMakerScreen$lambda$91$lambda$90$lambda$86$lambda$85(MutableState $passportBitmap$delegate, Context $context) {
        Bitmap PassportPhotoMakerScreen$lambda$66 = PassportPhotoMakerScreen$lambda$66($passportBitmap$delegate);
        if (PassportPhotoMakerScreen$lambda$66 != null) {
            ImageExportUtils.INSTANCE.saveBitmapToGallery($context, renderSixPhotoSheet(PassportPhotoMakerScreen$lambda$66), "Passport_6_PrintSheet");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PassportPhotoMakerScreen$lambda$91$lambda$90$lambda$89$lambda$88(MutableState $passportBitmap$delegate, Context $context) {
        Bitmap PassportPhotoMakerScreen$lambda$66 = PassportPhotoMakerScreen$lambda$66($passportBitmap$delegate);
        if (PassportPhotoMakerScreen$lambda$66 != null) {
            ImageExportUtils.INSTANCE.saveBitmapToGallery($context, PassportPhotoMakerScreen$lambda$66, "Passport_Photo");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: renderPassportPhoto-4WTKRHQ, reason: not valid java name */
    public static final Bitmap m7148renderPassportPhoto4WTKRHQ(Bitmap source, long bgColor) {
        Rect srcRect;
        Bitmap bitmap = Bitmap.createBitmap(413, 531, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(ColorKt.m4216toArgb8_81llA(bgColor));
        int srcWidth = source.getWidth();
        int srcHeight = source.getHeight();
        if (srcWidth > srcHeight) {
            int offset = (srcWidth - srcHeight) / 2;
            srcRect = new Rect(offset, 0, offset + srcHeight, srcHeight);
        } else {
            int offset2 = (srcHeight - srcWidth) / 4;
            srcRect = new Rect(0, offset2, srcWidth, offset2 + srcWidth);
        }
        Rect dstRect = new Rect(0, 0, 413, 531);
        canvas.drawBitmap(source, srcRect, dstRect, new Paint(2));
        return bitmap;
    }

    private static final Bitmap renderSixPhotoSheet(Bitmap passportPhoto) {
        int sheetWidth = 1200;
        int sheetHeight = 1800;
        Bitmap sheetBitmap = Bitmap.createBitmap(1200, 1800, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(sheetBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(sheetBitmap);
        canvas.drawColor(-1);
        int i = 2;
        Paint paint = new Paint(2);
        Paint borderPaint = new Paint();
        borderPaint.setColor(-3355444);
        borderPaint.setStyle(Paint.Style.STROKE);
        borderPaint.setStrokeWidth(2.0f);
        int gapX = (1200 - (450 * 2)) / 3;
        int gapY = (1800 - (580 * 3)) / 4;
        int row = 0;
        for (int i2 = 3; row < i2; i2 = 3) {
            int col = 0;
            while (col < i) {
                int left = ((450 + gapX) * col) + gapX;
                int top = ((580 + gapY) * row) + gapY;
                int sheetWidth2 = sheetWidth;
                int sheetWidth3 = top + 580;
                Rect dstRect = new Rect(left, top, left + 450, sheetWidth3);
                canvas.drawBitmap(passportPhoto, (Rect) null, dstRect, paint);
                canvas.drawRect(new RectF(left, top, left + 450, top + 580), borderPaint);
                col++;
                sheetWidth = sheetWidth2;
                sheetHeight = sheetHeight;
                sheetBitmap = sheetBitmap;
                paint = paint;
                i = 2;
            }
            row++;
            i = 2;
        }
        return sheetBitmap;
    }

    public static final void ImageQualityCheckerScreen(final Function0<Unit> onBack, Composer $composer, final int $changed) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer $composer2 = $composer.startRestartGroup(236445556);
        ComposerKt.sourceInformation($composer2, "C(ImageQualityCheckerScreen)538@23705L12,538@23693L24,539@23749L7,540@23773L24,542@23819L42,543@23881L33,544@23935L33,545@23991L36,546@24053L47,550@24221L1039,548@24119L1141,576@25293L541,590@25841L2575,575@25266L3150:ImageTools.kt#clnccf");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(onBack) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(236445556, $dirty, -1, "com.example.ui.tools.image.ImageQualityCheckerScreen (ImageTools.kt:537)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -409083520, "CC(remember):ImageTools.kt#9igjgp");
            boolean z = ($dirty & 14) == 4;
            Object rememberedValue = $composer2.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.tools.image.ImageToolsKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ImageToolsKt.ImageQualityCheckerScreen$lambda$95$lambda$94(Function0.this);
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
            ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer2, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue2 = $composer2.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2));
                $composer2.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final CoroutineScope scope = ((CompositionScopedCoroutineScopeCanceller) obj2).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -409079842, "CC(remember):ImageTools.kt#9igjgp");
            Object rememberedValue3 = $composer2.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer2.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            final MutableState imageBmp$delegate = (MutableState) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -409077867, "CC(remember):ImageTools.kt#9igjgp");
            Object rememberedValue4 = $composer2.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                obj4 = SnapshotIntStateKt.mutableIntStateOf(0);
                $composer2.updateRememberedValue(obj4);
            } else {
                obj4 = rememberedValue4;
            }
            final MutableIntState widthPx$delegate = (MutableIntState) obj4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -409076139, "CC(remember):ImageTools.kt#9igjgp");
            Object rememberedValue5 = $composer2.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                obj5 = SnapshotIntStateKt.mutableIntStateOf(0);
                $composer2.updateRememberedValue(obj5);
            } else {
                obj5 = rememberedValue5;
            }
            final MutableIntState heightPx$delegate = (MutableIntState) obj5;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -409074344, "CC(remember):ImageTools.kt#9igjgp");
            Object rememberedValue6 = $composer2.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                obj6 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                $composer2.updateRememberedValue(obj6);
            } else {
                obj6 = rememberedValue6;
            }
            final MutableFloatState megapixels$delegate = (MutableFloatState) obj6;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -409072349, "CC(remember):ImageTools.kt#9igjgp");
            Object rememberedValue7 = $composer2.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                obj7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("Ready to inspect", null, 2, null);
                $composer2.updateRememberedValue(obj7);
            } else {
                obj7 = rememberedValue7;
            }
            final MutableState qualityRating$delegate = (MutableState) obj7;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ActivityResultContracts.PickVisualMedia pickVisualMedia = new ActivityResultContracts.PickVisualMedia();
            ComposerKt.sourceInformationMarkerStart($composer2, -409065981, "CC(remember):ImageTools.kt#9igjgp");
            boolean changedInstance = $composer2.changedInstance(scope) | $composer2.changedInstance(context);
            Object rememberedValue8 = $composer2.rememberedValue();
            if (changedInstance || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                obj8 = new Function1() { // from class: com.example.ui.tools.image.ImageToolsKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj9) {
                        return ImageToolsKt.ImageQualityCheckerScreen$lambda$112$lambda$111(CoroutineScope.this, context, imageBmp$delegate, widthPx$delegate, heightPx$delegate, megapixels$delegate, qualityRating$delegate, (Uri) obj9);
                    }
                };
                $composer2.updateRememberedValue(obj8);
            } else {
                obj8 = rememberedValue8;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final ManagedActivityResultLauncher picker = ActivityResultRegistryKt.rememberLauncherForActivityResult(pickVisualMedia, (Function1) obj8, $composer2, 0);
            ScaffoldKt.m2411ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-820162256, true, new Function2() { // from class: com.example.ui.tools.image.ImageToolsKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj9, Object obj10) {
                    return ImageToolsKt.ImageQualityCheckerScreen$lambda$115(Function0.this, (Composer) obj9, ((Integer) obj10).intValue());
                }
            }, $composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-848924091, true, new Function3() { // from class: com.example.ui.tools.image.ImageToolsKt$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj9, Object obj10, Object obj11) {
                    return ImageToolsKt.ImageQualityCheckerScreen$lambda$126(ManagedActivityResultLauncher.this, imageBmp$delegate, widthPx$delegate, heightPx$delegate, megapixels$delegate, qualityRating$delegate, (PaddingValues) obj9, (Composer) obj10, ((Integer) obj11).intValue());
                }
            }, $composer2, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.tools.image.ImageToolsKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj9, Object obj10) {
                    return ImageToolsKt.ImageQualityCheckerScreen$lambda$127(Function0.this, $changed, (Composer) obj9, ((Integer) obj10).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ImageQualityCheckerScreen$lambda$95$lambda$94(Function0 $onBack) {
        $onBack.invoke();
        return Unit.INSTANCE;
    }

    private static final Bitmap ImageQualityCheckerScreen$lambda$97(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    private static final int ImageQualityCheckerScreen$lambda$100(MutableIntState $widthPx$delegate) {
        return $widthPx$delegate.getIntValue();
    }

    private static final int ImageQualityCheckerScreen$lambda$103(MutableIntState $heightPx$delegate) {
        return $heightPx$delegate.getIntValue();
    }

    private static final float ImageQualityCheckerScreen$lambda$106(MutableFloatState $megapixels$delegate) {
        return $megapixels$delegate.getFloatValue();
    }

    private static final String ImageQualityCheckerScreen$lambda$109(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ImageQualityCheckerScreen$lambda$112$lambda$111(CoroutineScope $scope, Context $context, MutableState $imageBmp$delegate, MutableIntState $widthPx$delegate, MutableIntState $heightPx$delegate, MutableFloatState $megapixels$delegate, MutableState $qualityRating$delegate, Uri uri) {
        if (uri != null) {
            BuildersKt__Builders_commonKt.launch$default($scope, Dispatchers.getIO(), null, new ImageToolsKt$ImageQualityCheckerScreen$picker$1$1$1($context, uri, $imageBmp$delegate, $widthPx$delegate, $heightPx$delegate, $megapixels$delegate, $qualityRating$delegate, null), 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ImageQualityCheckerScreen$lambda$115(final kotlin.jvm.functions.Function0 r41, androidx.compose.runtime.Composer r42, int r43) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.image.ImageToolsKt.ImageQualityCheckerScreen$lambda$115(kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ImageQualityCheckerScreen$lambda$115$lambda$114$lambda$113(Function0 $onBack, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C581@25469L155:ImageTools.kt#clnccf");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-530177088, $changed, -1, "com.example.ui.tools.image.ImageQualityCheckerScreen.<anonymous>.<anonymous>.<anonymous> (ImageTools.kt:581)");
            }
            IconButtonKt.IconButton($onBack, null, false, null, null, ComposableSingletons$ImageToolsKt.INSTANCE.m7145getLambda$690555299$app(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ImageQualityCheckerScreen$lambda$126(final androidx.activity.compose.ManagedActivityResultLauncher r41, androidx.compose.runtime.MutableState r42, final androidx.compose.runtime.MutableIntState r43, final androidx.compose.runtime.MutableIntState r44, final androidx.compose.runtime.MutableFloatState r45, final androidx.compose.runtime.MutableState r46, androidx.compose.foundation.layout.PaddingValues r47, androidx.compose.runtime.Composer r48, int r49) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.image.ImageToolsKt.ImageQualityCheckerScreen$lambda$126(androidx.activity.compose.ManagedActivityResultLauncher, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ImageQualityCheckerScreen$lambda$126$lambda$125$lambda$117$lambda$116(ManagedActivityResultLauncher $picker) {
        $picker.launch(PickVisualMediaRequestKt.PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE, 0, false, null, 14, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x074c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x05b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0406 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0226  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ImageQualityCheckerScreen$lambda$126$lambda$125$lambda$124$lambda$123(androidx.compose.runtime.MutableIntState r105, androidx.compose.runtime.MutableIntState r106, androidx.compose.runtime.MutableFloatState r107, androidx.compose.runtime.MutableState r108, androidx.compose.foundation.layout.ColumnScope r109, androidx.compose.runtime.Composer r110, int r111) {
        /*
            Method dump skipped, instructions count: 2119
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.image.ImageToolsKt.ImageQualityCheckerScreen$lambda$126$lambda$125$lambda$124$lambda$123(androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    private static final int findGcd(int a, int b) {
        return b == 0 ? a : findGcd(b, a % b);
    }
}
