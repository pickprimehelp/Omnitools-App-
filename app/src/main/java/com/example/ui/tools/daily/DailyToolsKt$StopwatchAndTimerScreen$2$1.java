package com.example.ui.tools.daily;

import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DailyTools.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.tools.daily.DailyToolsKt$StopwatchAndTimerScreen$2$1", f = "DailyTools.kt", i = {0}, l = {447}, m = "invokeSuspend", n = {"startTime"}, s = {"J$0"})
/* loaded from: classes4.dex */
public final class DailyToolsKt$StopwatchAndTimerScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableLongState $elapsedMillis$delegate;
    final /* synthetic */ MutableState<Boolean> $isRunning$delegate;
    long J$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyToolsKt$StopwatchAndTimerScreen$2$1(MutableLongState mutableLongState, MutableState<Boolean> mutableState, Continuation<? super DailyToolsKt$StopwatchAndTimerScreen$2$1> continuation) {
        super(2, continuation);
        this.$elapsedMillis$delegate = mutableLongState;
        this.$isRunning$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DailyToolsKt$StopwatchAndTimerScreen$2$1(this.$elapsedMillis$delegate, this.$isRunning$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DailyToolsKt$StopwatchAndTimerScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003d -> B:7:0x0040). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            switch(r1) {
                case 0: goto L18;
                case 1: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L11:
            long r1 = r7.J$0
            kotlin.ResultKt.throwOnFailure(r8)
            r3 = r7
            goto L40
        L18:
            kotlin.ResultKt.throwOnFailure(r8)
            long r1 = java.lang.System.currentTimeMillis()
            androidx.compose.runtime.MutableLongState r3 = r7.$elapsedMillis$delegate
            long r3 = com.example.ui.tools.daily.DailyToolsKt.access$StopwatchAndTimerScreen$lambda$91(r3)
            long r1 = r1 - r3
            r3 = r7
        L27:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r4 = r3.$isRunning$delegate
            boolean r4 = com.example.ui.tools.daily.DailyToolsKt.access$StopwatchAndTimerScreen$lambda$88(r4)
            if (r4 == 0) goto L4b
            r4 = r3
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r3.J$0 = r1
            r5 = 1
            r3.label = r5
            r5 = 16
            java.lang.Object r4 = kotlinx.coroutines.DelayKt.delay(r5, r4)
            if (r4 != r0) goto L40
            return r0
        L40:
            androidx.compose.runtime.MutableLongState r4 = r3.$elapsedMillis$delegate
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r1
            com.example.ui.tools.daily.DailyToolsKt.access$StopwatchAndTimerScreen$lambda$92(r4, r5)
            goto L27
        L4b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.daily.DailyToolsKt$StopwatchAndTimerScreen$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
