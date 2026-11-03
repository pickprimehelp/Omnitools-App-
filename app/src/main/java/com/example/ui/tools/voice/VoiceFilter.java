package com.example.ui.tools.voice;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VoiceChangerScreen.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015JL\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u00020\n¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006'"}, d2 = {"Lcom/example/ui/tools/voice/VoiceFilter;", "", "name", "", "emoji", "pitch", "", "speed", "description", "color", "Landroidx/compose/ui/graphics/Color;", "<init>", "(Ljava/lang/String;Ljava/lang/String;FFLjava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getName", "()Ljava/lang/String;", "getEmoji", "getPitch", "()F", "getSpeed", "getDescription", "getColor-0d7_KjU", "()J", "J", "component1", "component2", "component3", "component4", "component5", "component6", "component6-0d7_KjU", "copy", "copy-kKL39v8", "(Ljava/lang/String;Ljava/lang/String;FFLjava/lang/String;J)Lcom/example/ui/tools/voice/VoiceFilter;", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class VoiceFilter {
    public static final int $stable = 0;
    private final long color;
    private final String description;
    private final String emoji;
    private final String name;
    private final float pitch;
    private final float speed;

    public /* synthetic */ VoiceFilter(String str, String str2, float f, float f2, String str3, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, f, f2, str3, j);
    }

    /* renamed from: copy-kKL39v8$default, reason: not valid java name */
    public static /* synthetic */ VoiceFilter m7159copykKL39v8$default(VoiceFilter voiceFilter, String str, String str2, float f, float f2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceFilter.name;
        }
        if ((i & 2) != 0) {
            str2 = voiceFilter.emoji;
        }
        if ((i & 4) != 0) {
            f = voiceFilter.pitch;
        }
        if ((i & 8) != 0) {
            f2 = voiceFilter.speed;
        }
        if ((i & 16) != 0) {
            str3 = voiceFilter.description;
        }
        if ((i & 32) != 0) {
            j = voiceFilter.color;
        }
        long j2 = j;
        String str4 = str3;
        float f3 = f;
        return voiceFilter.m7161copykKL39v8(str, str2, f3, f2, str4, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEmoji() {
        return this.emoji;
    }

    /* renamed from: component3, reason: from getter */
    public final float getPitch() {
        return this.pitch;
    }

    /* renamed from: component4, reason: from getter */
    public final float getSpeed() {
        return this.speed;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component6-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: copy-kKL39v8, reason: not valid java name */
    public final VoiceFilter m7161copykKL39v8(String name, String emoji, float pitch, float speed, String description, long color) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        Intrinsics.checkNotNullParameter(description, "description");
        return new VoiceFilter(name, emoji, pitch, speed, description, color, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceFilter)) {
            return false;
        }
        VoiceFilter voiceFilter = (VoiceFilter) other;
        return Intrinsics.areEqual(this.name, voiceFilter.name) && Intrinsics.areEqual(this.emoji, voiceFilter.emoji) && Float.compare(this.pitch, voiceFilter.pitch) == 0 && Float.compare(this.speed, voiceFilter.speed) == 0 && Intrinsics.areEqual(this.description, voiceFilter.description) && Color.m4163equalsimpl0(this.color, voiceFilter.color);
    }

    public int hashCode() {
        return (((((((((this.name.hashCode() * 31) + this.emoji.hashCode()) * 31) + Float.hashCode(this.pitch)) * 31) + Float.hashCode(this.speed)) * 31) + this.description.hashCode()) * 31) + Color.m4169hashCodeimpl(this.color);
    }

    public String toString() {
        return "VoiceFilter(name=" + this.name + ", emoji=" + this.emoji + ", pitch=" + this.pitch + ", speed=" + this.speed + ", description=" + this.description + ", color=" + Color.m4170toStringimpl(this.color) + ")";
    }

    private VoiceFilter(String name, String emoji, float pitch, float speed, String description, long color) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        Intrinsics.checkNotNullParameter(description, "description");
        this.name = name;
        this.emoji = emoji;
        this.pitch = pitch;
        this.speed = speed;
        this.description = description;
        this.color = color;
    }

    public final String getName() {
        return this.name;
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public final float getPitch() {
        return this.pitch;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final String getDescription() {
        return this.description;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m7162getColor0d7_KjU() {
        return this.color;
    }
}
