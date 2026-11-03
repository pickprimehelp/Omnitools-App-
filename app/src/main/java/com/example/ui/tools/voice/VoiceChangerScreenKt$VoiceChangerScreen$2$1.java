package com.example.ui.tools.voice;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VoiceChangerScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.tools.voice.VoiceChangerScreenKt$VoiceChangerScreen$2$1", f = "VoiceChangerScreen.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class VoiceChangerScreenKt$VoiceChangerScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $isRecording$delegate;
    final /* synthetic */ MutableIntState $recordingDurationSec$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceChangerScreenKt$VoiceChangerScreen$2$1(MutableState<Boolean> mutableState, MutableIntState mutableIntState, Continuation<? super VoiceChangerScreenKt$VoiceChangerScreen$2$1> continuation) {
        super(2, continuation);
        this.$isRecording$delegate = mutableState;
        this.$recordingDurationSec$delegate = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VoiceChangerScreenKt$VoiceChangerScreen$2$1(this.$isRecording$delegate, this.$recordingDurationSec$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VoiceChangerScreenKt$VoiceChangerScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:7:0x003f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 1
            switch(r1) {
                case 0: goto L17;
                case 1: goto L12;
                default: goto La;
            }
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L12:
            kotlin.ResultKt.throwOnFailure(r7)
            r1 = r6
            goto L3f
        L17:
            kotlin.ResultKt.throwOnFailure(r7)
            androidx.compose.runtime.MutableState<java.lang.Boolean> r1 = r6.$isRecording$delegate
            boolean r1 = com.example.ui.tools.voice.VoiceChangerScreenKt.access$VoiceChangerScreen$lambda$6(r1)
            if (r1 == 0) goto L4c
            androidx.compose.runtime.MutableIntState r1 = r6.$recordingDurationSec$delegate
            r3 = 0
            com.example.ui.tools.voice.VoiceChangerScreenKt.access$VoiceChangerScreen$lambda$13(r1, r3)
            r1 = r6
        L29:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r3 = r1.$isRecording$delegate
            boolean r3 = com.example.ui.tools.voice.VoiceChangerScreenKt.access$VoiceChangerScreen$lambda$6(r3)
            if (r3 == 0) goto L4d
            r3 = r1
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r1.label = r2
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r3 = kotlinx.coroutines.DelayKt.delay(r4, r3)
            if (r3 != r0) goto L3f
            return r0
        L3f:
            androidx.compose.runtime.MutableIntState r3 = r1.$recordingDurationSec$delegate
            int r3 = com.example.ui.tools.voice.VoiceChangerScreenKt.access$VoiceChangerScreen$lambda$12(r3)
            androidx.compose.runtime.MutableIntState r4 = r1.$recordingDurationSec$delegate
            int r3 = r3 + r2
            com.example.ui.tools.voice.VoiceChangerScreenKt.access$VoiceChangerScreen$lambda$13(r4, r3)
            goto L29
        L4c:
            r1 = r6
        L4d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.voice.VoiceChangerScreenKt$VoiceChangerScreen$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
