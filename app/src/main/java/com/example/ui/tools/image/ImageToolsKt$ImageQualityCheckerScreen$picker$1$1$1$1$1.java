package com.example.ui.tools.image;

import android.graphics.Bitmap;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ImageTools.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.tools.image.ImageToolsKt$ImageQualityCheckerScreen$picker$1$1$1$1$1", f = "ImageTools.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class ImageToolsKt$ImageQualityCheckerScreen$picker$1$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableIntState $heightPx$delegate;
    final /* synthetic */ MutableState<Bitmap> $imageBmp$delegate;
    final /* synthetic */ Bitmap $it;
    final /* synthetic */ MutableFloatState $megapixels$delegate;
    final /* synthetic */ MutableState<String> $qualityRating$delegate;
    final /* synthetic */ MutableIntState $widthPx$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageToolsKt$ImageQualityCheckerScreen$picker$1$1$1$1$1(Bitmap bitmap, MutableState<Bitmap> mutableState, MutableIntState mutableIntState, MutableIntState mutableIntState2, MutableFloatState mutableFloatState, MutableState<String> mutableState2, Continuation<? super ImageToolsKt$ImageQualityCheckerScreen$picker$1$1$1$1$1> continuation) {
        super(2, continuation);
        this.$it = bitmap;
        this.$imageBmp$delegate = mutableState;
        this.$widthPx$delegate = mutableIntState;
        this.$heightPx$delegate = mutableIntState2;
        this.$megapixels$delegate = mutableFloatState;
        this.$qualityRating$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ImageToolsKt$ImageQualityCheckerScreen$picker$1$1$1$1$1(this.$it, this.$imageBmp$delegate, this.$widthPx$delegate, this.$heightPx$delegate, this.$megapixels$delegate, this.$qualityRating$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ImageToolsKt$ImageQualityCheckerScreen$picker$1$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        String str;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.$imageBmp$delegate.setValue(this.$it);
                this.$widthPx$delegate.setIntValue(this.$it.getWidth());
                this.$heightPx$delegate.setIntValue(this.$it.getHeight());
                float mp = (this.$it.getWidth() * this.$it.getHeight()) / 1000000.0f;
                this.$megapixels$delegate.setFloatValue(mp);
                MutableState<String> mutableState = this.$qualityRating$delegate;
                if (mp >= 12.0f) {
                    str = "4K Ultra HD • Professional Print Ready";
                } else if (mp >= 5.0f) {
                    str = "Full HD (1080p) • Excellent Quality";
                } else {
                    str = mp >= 2.0f ? "Standard HD (720p) • Good for Social Media" : "Low Resolution • May appear blurry when printed";
                }
                mutableState.setValue(str);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
