package com.example.ui.tools.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Color;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ImageTools.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.tools.image.ImageToolsKt$PassportPhotoMakerScreen$photoPickerLauncher$1$1$1", f = "ImageTools.kt", i = {0, 0}, l = {347}, m = "invokeSuspend", n = {"stream", "bmp"}, s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
public final class ImageToolsKt$PassportPhotoMakerScreen$photoPickerLauncher$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<Bitmap> $passportBitmap$delegate;
    final /* synthetic */ MutableState<Color> $selectedBgColor$delegate;
    final /* synthetic */ MutableState<Bitmap> $sourceBitmap$delegate;
    final /* synthetic */ Uri $uri;
    Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageToolsKt$PassportPhotoMakerScreen$photoPickerLauncher$1$1$1(Context context, Uri uri, MutableState<Bitmap> mutableState, MutableState<Color> mutableState2, MutableState<Bitmap> mutableState3, Continuation<? super ImageToolsKt$PassportPhotoMakerScreen$photoPickerLauncher$1$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$uri = uri;
        this.$sourceBitmap$delegate = mutableState;
        this.$selectedBgColor$delegate = mutableState2;
        this.$passportBitmap$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ImageToolsKt$PassportPhotoMakerScreen$photoPickerLauncher$1$1$1(this.$context, this.$uri, this.$sourceBitmap$delegate, this.$selectedBgColor$delegate, this.$passportBitmap$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ImageToolsKt$PassportPhotoMakerScreen$photoPickerLauncher$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                this.L$0 = SpillingKt.nullOutSpilledVariable(stream);
                this.L$1 = SpillingKt.nullOutSpilledVariable(bmp);
                this.label = 1;
                if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(bmp, this.$sourceBitmap$delegate, this.$selectedBgColor$delegate, this.$passportBitmap$delegate, null), this) != coroutine_suspended) {
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImageTools.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.tools.image.ImageToolsKt$PassportPhotoMakerScreen$photoPickerLauncher$1$1$1$1", f = "ImageTools.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.ui.tools.image.ImageToolsKt$PassportPhotoMakerScreen$photoPickerLauncher$1$1$1$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bitmap $bmp;
        final /* synthetic */ MutableState<Bitmap> $passportBitmap$delegate;
        final /* synthetic */ MutableState<Color> $selectedBgColor$delegate;
        final /* synthetic */ MutableState<Bitmap> $sourceBitmap$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Bitmap bitmap, MutableState<Bitmap> mutableState, MutableState<Color> mutableState2, MutableState<Bitmap> mutableState3, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$bmp = bitmap;
            this.$sourceBitmap$delegate = mutableState;
            this.$selectedBgColor$delegate = mutableState2;
            this.$passportBitmap$delegate = mutableState3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$bmp, this.$sourceBitmap$delegate, this.$selectedBgColor$delegate, this.$passportBitmap$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            long PassportPhotoMakerScreen$lambda$63;
            Bitmap m7148renderPassportPhoto4WTKRHQ;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.$sourceBitmap$delegate.setValue(this.$bmp);
                    MutableState<Bitmap> mutableState = this.$passportBitmap$delegate;
                    Bitmap bitmap = this.$bmp;
                    Intrinsics.checkNotNull(bitmap);
                    PassportPhotoMakerScreen$lambda$63 = ImageToolsKt.PassportPhotoMakerScreen$lambda$63(this.$selectedBgColor$delegate);
                    m7148renderPassportPhoto4WTKRHQ = ImageToolsKt.m7148renderPassportPhoto4WTKRHQ(bitmap, PassportPhotoMakerScreen$lambda$63);
                    mutableState.setValue(m7148renderPassportPhoto4WTKRHQ);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
