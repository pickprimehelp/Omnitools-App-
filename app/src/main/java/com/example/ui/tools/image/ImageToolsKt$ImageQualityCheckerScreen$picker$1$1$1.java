package com.example.ui.tools.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ImageTools.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.tools.image.ImageToolsKt$ImageQualityCheckerScreen$picker$1$1$1", f = "ImageTools.kt", i = {0, 0, 0, 0}, l = {558}, m = "invokeSuspend", n = {"stream", "bmp", "it\\1", "$i$a$-let-ImageToolsKt$ImageQualityCheckerScreen$picker$1$1$1$1\\1\\557\\0"}, s = {"L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes5.dex */
public final class ImageToolsKt$ImageQualityCheckerScreen$picker$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableIntState $heightPx$delegate;
    final /* synthetic */ MutableState<Bitmap> $imageBmp$delegate;
    final /* synthetic */ MutableFloatState $megapixels$delegate;
    final /* synthetic */ MutableState<String> $qualityRating$delegate;
    final /* synthetic */ Uri $uri;
    final /* synthetic */ MutableIntState $widthPx$delegate;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageToolsKt$ImageQualityCheckerScreen$picker$1$1$1(Context context, Uri uri, MutableState<Bitmap> mutableState, MutableIntState mutableIntState, MutableIntState mutableIntState2, MutableFloatState mutableFloatState, MutableState<String> mutableState2, Continuation<? super ImageToolsKt$ImageQualityCheckerScreen$picker$1$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$uri = uri;
        this.$imageBmp$delegate = mutableState;
        this.$widthPx$delegate = mutableIntState;
        this.$heightPx$delegate = mutableIntState2;
        this.$megapixels$delegate = mutableFloatState;
        this.$qualityRating$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ImageToolsKt$ImageQualityCheckerScreen$picker$1$1$1(this.$context, this.$uri, this.$imageBmp$delegate, this.$widthPx$delegate, this.$heightPx$delegate, this.$megapixels$delegate, this.$qualityRating$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ImageToolsKt$ImageQualityCheckerScreen$picker$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                InputStream stream = this.$context.getContentResolver().openInputStream(this.$uri);
                Bitmap bmp = BitmapFactory.decodeStream(stream);
                if (stream != null) {
                    stream.close();
                }
                if (bmp != null) {
                    MutableState<Bitmap> mutableState = this.$imageBmp$delegate;
                    MutableIntState mutableIntState = this.$widthPx$delegate;
                    MutableIntState mutableIntState2 = this.$heightPx$delegate;
                    MutableFloatState mutableFloatState = this.$megapixels$delegate;
                    MutableState<String> mutableState2 = this.$qualityRating$delegate;
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    ImageToolsKt$ImageQualityCheckerScreen$picker$1$1$1$1$1 imageToolsKt$ImageQualityCheckerScreen$picker$1$1$1$1$1 = new ImageToolsKt$ImageQualityCheckerScreen$picker$1$1$1$1$1(bmp, mutableState, mutableIntState, mutableIntState2, mutableFloatState, mutableState2, null);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(stream);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(bmp);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(bmp);
                    this.I$0 = 0;
                    this.label = 1;
                    if (BuildersKt.withContext(main, imageToolsKt$ImageQualityCheckerScreen$picker$1$1$1$1$1, this) != coroutine_suspended) {
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                }
                break;
            case 1:
                int i = this.I$0;
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
