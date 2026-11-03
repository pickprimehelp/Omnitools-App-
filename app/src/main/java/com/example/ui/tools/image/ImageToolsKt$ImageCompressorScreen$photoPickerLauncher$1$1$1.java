package com.example.ui.tools.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.example.ui.tools.image.ImageToolsKt$ImageCompressorScreen$photoPickerLauncher$1$1$1;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ImageTools.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.tools.image.ImageToolsKt$ImageCompressorScreen$photoPickerLauncher$1$1$1", f = "ImageTools.kt", i = {0, 0, 0, 1}, l = {125, 135}, m = "invokeSuspend", n = {"stream", "bytes", "bmp", "e"}, s = {"L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes5.dex */
public final class ImageToolsKt$ImageCompressorScreen$photoPickerLauncher$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Bitmap> $compressedBitmap$delegate;
    final /* synthetic */ MutableIntState $compressedSizeKb$delegate;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<Boolean> $isProcessing$delegate;
    final /* synthetic */ MutableState<Bitmap> $originalBitmap$delegate;
    final /* synthetic */ MutableIntState $originalSizeKb$delegate;
    final /* synthetic */ MutableFloatState $qualityPercent$delegate;
    final /* synthetic */ Uri $uri;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageToolsKt$ImageCompressorScreen$photoPickerLauncher$1$1$1(Context context, Uri uri, MutableState<Boolean> mutableState, MutableState<Bitmap> mutableState2, MutableIntState mutableIntState, MutableFloatState mutableFloatState, MutableState<Bitmap> mutableState3, MutableIntState mutableIntState2, Continuation<? super ImageToolsKt$ImageCompressorScreen$photoPickerLauncher$1$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$uri = uri;
        this.$isProcessing$delegate = mutableState;
        this.$originalBitmap$delegate = mutableState2;
        this.$originalSizeKb$delegate = mutableIntState;
        this.$qualityPercent$delegate = mutableFloatState;
        this.$compressedBitmap$delegate = mutableState3;
        this.$compressedSizeKb$delegate = mutableIntState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ImageToolsKt$ImageCompressorScreen$photoPickerLauncher$1$1$1(this.$context, this.$uri, this.$isProcessing$delegate, this.$originalBitmap$delegate, this.$originalSizeKb$delegate, this.$qualityPercent$delegate, this.$compressedBitmap$delegate, this.$compressedSizeKb$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ImageToolsKt$ImageCompressorScreen$photoPickerLauncher$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        byte[] bArr;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    ImageToolsKt.ImageCompressorScreen$lambda$22(this.$isProcessing$delegate, true);
                    InputStream stream = this.$context.getContentResolver().openInputStream(this.$uri);
                    if (stream == null || (bArr = ByteStreamsKt.readBytes(stream)) == null) {
                        bArr = new byte[0];
                    }
                    byte[] bytes = bArr;
                    if (stream != null) {
                        stream.close();
                    }
                    Bitmap bmp = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(stream);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(bytes);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(bmp);
                    this.label = 1;
                    if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(bmp, bytes, this.$originalBitmap$delegate, this.$originalSizeKb$delegate, this.$qualityPercent$delegate, this.$compressedBitmap$delegate, this.$compressedSizeKb$delegate, this.$isProcessing$delegate, null), this) != coroutine_suspended) {
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                case 2:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Exception e) {
            this.L$0 = SpillingKt.nullOutSpilledVariable(e);
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(this.$isProcessing$delegate, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImageTools.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.tools.image.ImageToolsKt$ImageCompressorScreen$photoPickerLauncher$1$1$1$1", f = "ImageTools.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.ui.tools.image.ImageToolsKt$ImageCompressorScreen$photoPickerLauncher$1$1$1$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bitmap $bmp;
        final /* synthetic */ byte[] $bytes;
        final /* synthetic */ MutableState<Bitmap> $compressedBitmap$delegate;
        final /* synthetic */ MutableIntState $compressedSizeKb$delegate;
        final /* synthetic */ MutableState<Boolean> $isProcessing$delegate;
        final /* synthetic */ MutableState<Bitmap> $originalBitmap$delegate;
        final /* synthetic */ MutableIntState $originalSizeKb$delegate;
        final /* synthetic */ MutableFloatState $qualityPercent$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Bitmap bitmap, byte[] bArr, MutableState<Bitmap> mutableState, MutableIntState mutableIntState, MutableFloatState mutableFloatState, MutableState<Bitmap> mutableState2, MutableIntState mutableIntState2, MutableState<Boolean> mutableState3, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$bmp = bitmap;
            this.$bytes = bArr;
            this.$originalBitmap$delegate = mutableState;
            this.$originalSizeKb$delegate = mutableIntState;
            this.$qualityPercent$delegate = mutableFloatState;
            this.$compressedBitmap$delegate = mutableState2;
            this.$compressedSizeKb$delegate = mutableIntState2;
            this.$isProcessing$delegate = mutableState3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$bmp, this.$bytes, this.$originalBitmap$delegate, this.$originalSizeKb$delegate, this.$qualityPercent$delegate, this.$compressedBitmap$delegate, this.$compressedSizeKb$delegate, this.$isProcessing$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            float ImageCompressorScreen$lambda$12;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.$originalBitmap$delegate.setValue(this.$bmp);
                    this.$originalSizeKb$delegate.setIntValue(this.$bytes.length / 1024);
                    Bitmap bitmap = this.$bmp;
                    Intrinsics.checkNotNull(bitmap);
                    ImageCompressorScreen$lambda$12 = ImageToolsKt.ImageCompressorScreen$lambda$12(this.$qualityPercent$delegate);
                    final MutableState<Bitmap> mutableState = this.$compressedBitmap$delegate;
                    final MutableIntState mutableIntState = this.$compressedSizeKb$delegate;
                    final MutableState<Boolean> mutableState2 = this.$isProcessing$delegate;
                    ImageToolsKt.compressBitmap(bitmap, (int) ImageCompressorScreen$lambda$12, new Function2() { // from class: com.example.ui.tools.image.ImageToolsKt$ImageCompressorScreen$photoPickerLauncher$1$1$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ImageToolsKt$ImageCompressorScreen$photoPickerLauncher$1$1$1.AnonymousClass1.invokeSuspend$lambda$0(MutableState.this, mutableIntState, mutableState2, (Bitmap) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static final Unit invokeSuspend$lambda$0(MutableState $compressedBitmap$delegate, MutableIntState $compressedSizeKb$delegate, MutableState $isProcessing$delegate, Bitmap compBmp, int compSize) {
            $compressedBitmap$delegate.setValue(compBmp);
            $compressedSizeKb$delegate.setIntValue(compSize);
            ImageToolsKt.ImageCompressorScreen$lambda$22($isProcessing$delegate, false);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImageTools.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.tools.image.ImageToolsKt$ImageCompressorScreen$photoPickerLauncher$1$1$1$2", f = "ImageTools.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.ui.tools.image.ImageToolsKt$ImageCompressorScreen$photoPickerLauncher$1$1$1$2, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<Boolean> $isProcessing$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(MutableState<Boolean> mutableState, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$isProcessing$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$isProcessing$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    ImageToolsKt.ImageCompressorScreen$lambda$22(this.$isProcessing$delegate, false);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
