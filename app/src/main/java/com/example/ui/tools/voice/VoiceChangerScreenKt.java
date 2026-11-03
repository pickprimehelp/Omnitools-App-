package com.example.ui.tools.voice;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Build;
import android.widget.Toast;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.PauseKt;
import androidx.compose.material.icons.filled.PlayArrowKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.content.FileProvider;
import androidx.profileinstaller.ProfileVerifier;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VoiceChangerScreen.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005²\u0006\n\u0010\u0006\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\n\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\u000b\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010\f\u001a\u00020\tX\u008a\u008e\u0002²\u0006\f\u0010\r\u001a\u0004\u0018\u00010\u000eX\u008a\u008e\u0002²\u0006\f\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0011\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002"}, d2 = {"VoiceChangerScreen", "", "onBack", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app", "selectedFilterIndex", "", "isRecording", "", "isPlaying", "recordingDurationSec", "hasRecording", "mediaRecorder", "Landroid/media/MediaRecorder;", "mediaPlayer", "Landroid/media/MediaPlayer;", "hasAudioPermission", "pulseScale", ""}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VoiceChangerScreenKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit VoiceChangerScreen$lambda$64(Function0 function0, int i, Composer composer, int i2) {
        VoiceChangerScreen(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0419  */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void VoiceChangerScreen(final kotlin.jvm.functions.Function0<kotlin.Unit> r34, androidx.compose.runtime.Composer r35, final int r36) {
        /*
            Method dump skipped, instructions count: 1253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.voice.VoiceChangerScreenKt.VoiceChangerScreen(kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit VoiceChangerScreen$lambda$1$lambda$0(Function0 $onBack) {
        $onBack.invoke();
        return Unit.INSTANCE;
    }

    private static final int VoiceChangerScreen$lambda$3(MutableIntState $selectedFilterIndex$delegate) {
        return $selectedFilterIndex$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean VoiceChangerScreen$lambda$6(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void VoiceChangerScreen$lambda$7(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VoiceChangerScreen$lambda$10(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean VoiceChangerScreen$lambda$9(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int VoiceChangerScreen$lambda$12(MutableIntState $recordingDurationSec$delegate) {
        return $recordingDurationSec$delegate.getIntValue();
    }

    private static final boolean VoiceChangerScreen$lambda$15(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void VoiceChangerScreen$lambda$16(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediaRecorder VoiceChangerScreen$lambda$19(MutableState<MediaRecorder> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediaPlayer VoiceChangerScreen$lambda$22(MutableState<MediaPlayer> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean VoiceChangerScreen$lambda$26(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void VoiceChangerScreen$lambda$27(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit VoiceChangerScreen$lambda$29$lambda$28(Context $context, MutableState $hasAudioPermission$delegate, boolean granted) {
        VoiceChangerScreen$lambda$27($hasAudioPermission$delegate, granted);
        if (!granted) {
            Toast.makeText($context, "Audio permission needed to record your voice", 0).show();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final DisposableEffectResult VoiceChangerScreen$lambda$32$lambda$31(final MutableState $mediaPlayer$delegate, final MutableState $mediaRecorder$delegate, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.example.ui.tools.voice.VoiceChangerScreenKt$VoiceChangerScreen$lambda$32$lambda$31$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                MediaPlayer VoiceChangerScreen$lambda$22;
                MediaRecorder VoiceChangerScreen$lambda$19;
                try {
                    VoiceChangerScreen$lambda$22 = VoiceChangerScreenKt.VoiceChangerScreen$lambda$22(MutableState.this);
                    if (VoiceChangerScreen$lambda$22 != null) {
                        VoiceChangerScreen$lambda$22.release();
                    }
                    VoiceChangerScreen$lambda$19 = VoiceChangerScreenKt.VoiceChangerScreen$lambda$19($mediaRecorder$delegate);
                    if (VoiceChangerScreen$lambda$19 != null) {
                        VoiceChangerScreen$lambda$19.release();
                    }
                } catch (Exception e) {
                }
            }
        };
    }

    private static final void VoiceChangerScreen$startRecording(ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher, File audioFile, Context context, MutableState<Boolean> mutableState, MutableState<MediaPlayer> mutableState2, MutableState<Boolean> mutableState3, MutableState<MediaRecorder> mutableState4, MutableState<Boolean> mutableState5, MutableState<Boolean> mutableState6) {
        MediaRecorder recorder;
        if (!VoiceChangerScreen$lambda$26(mutableState)) {
            managedActivityResultLauncher.launch("android.permission.RECORD_AUDIO");
            return;
        }
        try {
            MediaPlayer VoiceChangerScreen$lambda$22 = VoiceChangerScreen$lambda$22(mutableState2);
            if (VoiceChangerScreen$lambda$22 != null) {
                VoiceChangerScreen$lambda$22.stop();
            }
            MediaPlayer VoiceChangerScreen$lambda$222 = VoiceChangerScreen$lambda$22(mutableState2);
            if (VoiceChangerScreen$lambda$222 != null) {
                VoiceChangerScreen$lambda$222.release();
            }
            mutableState2.setValue(null);
            VoiceChangerScreen$lambda$10(mutableState3, false);
            if (audioFile.exists()) {
                audioFile.delete();
            }
            if (Build.VERSION.SDK_INT >= 31) {
                recorder = new MediaRecorder(context);
            } else {
                recorder = new MediaRecorder();
            }
            MediaRecorder mediaRecorder = recorder;
            mediaRecorder.setAudioSource(1);
            mediaRecorder.setOutputFormat(2);
            mediaRecorder.setAudioEncoder(3);
            mediaRecorder.setOutputFile(audioFile.getAbsolutePath());
            mediaRecorder.prepare();
            mediaRecorder.start();
            mutableState4.setValue(recorder);
            VoiceChangerScreen$lambda$7(mutableState5, true);
            VoiceChangerScreen$lambda$16(mutableState6, false);
        } catch (Exception e) {
            Toast.makeText(context, "Error starting recording: " + e.getMessage(), 0).show();
            VoiceChangerScreen$lambda$7(mutableState5, false);
        }
    }

    private static final void VoiceChangerScreen$stopRecording(File audioFile, Context context, MutableState<MediaRecorder> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3) {
        try {
            MediaRecorder VoiceChangerScreen$lambda$19 = VoiceChangerScreen$lambda$19(mutableState);
            if (VoiceChangerScreen$lambda$19 != null) {
                VoiceChangerScreen$lambda$19.stop();
                VoiceChangerScreen$lambda$19.release();
            }
            mutableState.setValue(null);
            VoiceChangerScreen$lambda$7(mutableState2, false);
            VoiceChangerScreen$lambda$16(mutableState3, audioFile.exists() && audioFile.length() > 0);
            Toast.makeText(context, "Recording saved! Select a voice effect to play.", 0).show();
        } catch (Exception e) {
            VoiceChangerScreen$lambda$7(mutableState2, false);
        }
    }

    private static final void VoiceChangerScreen$playWithFilter(File audioFile, Context context, MutableState<MediaPlayer> mutableState, final MutableState<Boolean> mutableState2, VoiceFilter filter) {
        if (!audioFile.exists() || audioFile.length() == 0) {
            Toast.makeText(context, "Please record your voice first!", 0).show();
            return;
        }
        try {
            MediaPlayer VoiceChangerScreen$lambda$22 = VoiceChangerScreen$lambda$22(mutableState);
            if (VoiceChangerScreen$lambda$22 != null) {
                VoiceChangerScreen$lambda$22.release();
            }
            MediaPlayer player = new MediaPlayer();
            player.setDataSource(audioFile.getAbsolutePath());
            player.prepare();
            PlaybackParams playbackParams = new PlaybackParams();
            playbackParams.setPitch(filter.getPitch());
            playbackParams.setSpeed(filter.getSpeed());
            player.setPlaybackParams(playbackParams);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.example.ui.tools.voice.VoiceChangerScreenKt$$ExternalSyntheticLambda2
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    VoiceChangerScreenKt.VoiceChangerScreen$lambda$10(MutableState.this, false);
                }
            });
            player.start();
            mutableState.setValue(player);
            VoiceChangerScreen$lambda$10(mutableState2, true);
        } catch (Exception e) {
            Toast.makeText(context, "Error playing audio: " + e.getMessage(), 0).show();
            VoiceChangerScreen$lambda$10(mutableState2, false);
        }
    }

    private static final void VoiceChangerScreen$stopPlaying(MutableState<MediaPlayer> mutableState, MutableState<Boolean> mutableState2) {
        try {
            MediaPlayer VoiceChangerScreen$lambda$22 = VoiceChangerScreen$lambda$22(mutableState);
            if (VoiceChangerScreen$lambda$22 != null) {
                VoiceChangerScreen$lambda$22.stop();
            }
            MediaPlayer VoiceChangerScreen$lambda$222 = VoiceChangerScreen$lambda$22(mutableState);
            if (VoiceChangerScreen$lambda$222 != null) {
                VoiceChangerScreen$lambda$222.release();
            }
            mutableState.setValue(null);
            VoiceChangerScreen$lambda$10(mutableState2, false);
        } catch (Exception e) {
            VoiceChangerScreen$lambda$10(mutableState2, false);
        }
    }

    private static final float VoiceChangerScreen$lambda$38(State<Float> state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit VoiceChangerScreen$lambda$41(final kotlin.jvm.functions.Function0 r41, androidx.compose.runtime.Composer r42, int r43) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.voice.VoiceChangerScreenKt.VoiceChangerScreen$lambda$41(kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit VoiceChangerScreen$lambda$41$lambda$40$lambda$39(Function0 $onBack, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C276@10548L155:VoiceChangerScreen.kt#csu3va");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(996328890, $changed, -1, "com.example.ui.tools.voice.VoiceChangerScreen.<anonymous>.<anonymous>.<anonymous> (VoiceChangerScreen.kt:276)");
            }
            IconButtonKt.IconButton($onBack, null, false, null, null, ComposableSingletons$VoiceChangerScreenKt.INSTANCE.getLambda$319571645$app(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0770  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit VoiceChangerScreen$lambda$63(java.util.List r115, final java.io.File r116, final android.content.Context r117, final androidx.activity.compose.ManagedActivityResultLauncher r118, final androidx.compose.runtime.MutableState r119, final androidx.compose.runtime.MutableIntState r120, final androidx.compose.runtime.MutableState r121, final androidx.compose.runtime.MutableIntState r122, final androidx.compose.runtime.MutableState r123, final androidx.compose.runtime.State r124, final androidx.compose.runtime.MutableState r125, final androidx.compose.runtime.MutableState r126, final androidx.compose.runtime.MutableState r127, androidx.compose.foundation.layout.PaddingValues r128, androidx.compose.runtime.Composer r129, int r130) {
        /*
            Method dump skipped, instructions count: 1910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.voice.VoiceChangerScreenKt.VoiceChangerScreen$lambda$63(java.util.List, java.io.File, android.content.Context, androidx.activity.compose.ManagedActivityResultLauncher, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableState, androidx.compose.runtime.State, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x06e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit VoiceChangerScreen$lambda$63$lambda$62$lambda$53(final java.util.List r75, java.io.File r76, android.content.Context r77, final androidx.activity.compose.ManagedActivityResultLauncher r78, final androidx.compose.runtime.MutableState r79, androidx.compose.runtime.MutableIntState r80, final androidx.compose.runtime.MutableState r81, final androidx.compose.runtime.MutableIntState r82, final androidx.compose.runtime.MutableState r83, androidx.compose.runtime.State r84, final androidx.compose.runtime.MutableState r85, final androidx.compose.runtime.MutableState r86, final androidx.compose.runtime.MutableState r87, androidx.compose.foundation.layout.ColumnScope r88, androidx.compose.runtime.Composer r89, int r90) {
        /*
            Method dump skipped, instructions count: 1901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.voice.VoiceChangerScreenKt.VoiceChangerScreen$lambda$63$lambda$62$lambda$53(java.util.List, java.io.File, android.content.Context, androidx.activity.compose.ManagedActivityResultLauncher, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableState, androidx.compose.runtime.State, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit VoiceChangerScreen$lambda$63$lambda$62$lambda$53$lambda$52$lambda$43$lambda$42(MutableState $isRecording$delegate, File $audioFile, Context $context, MutableState $mediaRecorder$delegate, MutableState $hasRecording$delegate, ManagedActivityResultLauncher $permissionLauncher, MutableState $hasAudioPermission$delegate, MutableState $mediaPlayer$delegate, MutableState $isPlaying$delegate) {
        if (VoiceChangerScreen$lambda$6($isRecording$delegate)) {
            VoiceChangerScreen$stopRecording($audioFile, $context, $mediaRecorder$delegate, $isRecording$delegate, $hasRecording$delegate);
        } else {
            VoiceChangerScreen$startRecording($permissionLauncher, $audioFile, $context, $hasAudioPermission$delegate, $mediaPlayer$delegate, $isPlaying$delegate, $mediaRecorder$delegate, $isRecording$delegate, $hasRecording$delegate);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit VoiceChangerScreen$lambda$63$lambda$62$lambda$53$lambda$52$lambda$51$lambda$46$lambda$45(List $filters, MutableState $isPlaying$delegate, MutableState $mediaPlayer$delegate, MutableIntState $selectedFilterIndex$delegate, File $audioFile, Context $context) {
        if (VoiceChangerScreen$lambda$9($isPlaying$delegate)) {
            VoiceChangerScreen$stopPlaying($mediaPlayer$delegate, $isPlaying$delegate);
        } else {
            VoiceChangerScreen$playWithFilter($audioFile, $context, $mediaPlayer$delegate, $isPlaying$delegate, (VoiceFilter) $filters.get(VoiceChangerScreen$lambda$3($selectedFilterIndex$delegate)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit VoiceChangerScreen$lambda$63$lambda$62$lambda$53$lambda$52$lambda$51$lambda$47(MutableState $isPlaying$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C356@14368L94,357@14495L28,358@14556L46:VoiceChangerScreen.kt#csu3va");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1677622104, $changed, -1, "com.example.ui.tools.voice.VoiceChangerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VoiceChangerScreen.kt:356)");
            }
            IconKt.m2153Iconww6aTOc(VoiceChangerScreen$lambda$9($isPlaying$delegate) ? PauseKt.getPause(Icons.Filled.INSTANCE) : PlayArrowKt.getPlayArrow(Icons.Filled.INSTANCE), (String) null, (Modifier) null, 0L, $composer, 48, 12);
            SpacerKt.Spacer(SizeKt.m723width3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(6)), $composer, 6);
            TextKt.m2696Text4IGK_g(VoiceChangerScreen$lambda$9($isPlaying$delegate) ? "Stop" : "Play Filter", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit VoiceChangerScreen$lambda$63$lambda$62$lambda$53$lambda$52$lambda$51$lambda$50$lambda$49(Context $context, File $audioFile) {
        try {
            Uri uri = FileProvider.getUriForFile($context, $context.getPackageName() + ".provider", $audioFile);
            Intrinsics.checkNotNullExpressionValue(uri, "getUriForFile(...)");
            Intent shareIntent = new Intent("android.intent.action.SEND");
            shareIntent.setType("audio/*");
            shareIntent.putExtra("android.intent.extra.STREAM", uri);
            shareIntent.addFlags(1);
            $context.startActivity(Intent.createChooser(shareIntent, "Share Audio"));
        } catch (Exception e) {
            Toast.makeText($context, "Error sharing audio", 0).show();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit VoiceChangerScreen$lambda$63$lambda$62$lambda$61$lambda$60$lambda$59$lambda$58$lambda$55$lambda$54(List $filters, VoiceFilter $filter, MutableIntState $selectedFilterIndex$delegate, MutableState $hasRecording$delegate, File $audioFile, Context $context, MutableState $mediaPlayer$delegate, MutableState $isPlaying$delegate) {
        $selectedFilterIndex$delegate.setIntValue($filters.indexOf($filter));
        if (VoiceChangerScreen$lambda$15($hasRecording$delegate)) {
            VoiceChangerScreen$playWithFilter($audioFile, $context, $mediaPlayer$delegate, $isPlaying$delegate, $filter);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit VoiceChangerScreen$lambda$63$lambda$62$lambda$61$lambda$60$lambda$59$lambda$58$lambda$57(VoiceFilter $filter, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C423@18060L622:VoiceChangerScreen.kt#csu3va");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-336569931, $changed, -1, "com.example.ui.tools.voice.VoiceChangerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VoiceChangerScreen.kt:423)");
            }
            Modifier m673padding3ABfNKs = PaddingKt.m673padding3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(12));
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, m673padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((390 << 3) & 112) << 6) & 896) | 6;
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
            int i3 = ((390 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -572354821, "C427@18299L36,428@18372L29,429@18438L65,430@18605L11,430@18540L108:VoiceChangerScreen.kt#csu3va");
            TextKt.m2696Text4IGK_g($filter.getEmoji(), (Modifier) null, 0L, TextUnitKt.getSp(28), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3072, 0, 131062);
            SpacerKt.Spacer(SizeKt.m704height3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(4)), $composer, 6);
            TextKt.m2696Text4IGK_g($filter.getName(), (Modifier) null, 0L, TextUnitKt.getSp(13), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131030);
            TextKt.m2696Text4IGK_g($filter.getDescription(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3072, 3072, 122866);
            ComposerKt.sourceInformationMarkerEnd($composer);
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
}
