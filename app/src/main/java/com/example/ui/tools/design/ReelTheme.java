package com.example.ui.tools.design;

import androidx.compose.ui.graphics.Color;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DesignTools.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J>\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u00020\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u00020\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010¨\u0006\""}, d2 = {"Lcom/example/ui/tools/design/ReelTheme;", "", "name", "", "bgColors", "", "Landroidx/compose/ui/graphics/Color;", "badgeColor", "subtitleColor", "<init>", "(Ljava/lang/String;Ljava/util/List;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getName", "()Ljava/lang/String;", "getBgColors", "()Ljava/util/List;", "getBadgeColor-0d7_KjU", "()J", "J", "getSubtitleColor-0d7_KjU", "component1", "component2", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "copy", "copy-0YGnOg8", "(Ljava/lang/String;Ljava/util/List;JJ)Lcom/example/ui/tools/design/ReelTheme;", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ReelTheme {
    public static final int $stable = 8;
    private final long badgeColor;
    private final List<Color> bgColors;
    private final String name;
    private final long subtitleColor;

    public /* synthetic */ ReelTheme(String str, List list, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, j, j2);
    }

    /* renamed from: copy-0YGnOg8$default, reason: not valid java name */
    public static /* synthetic */ ReelTheme m7105copy0YGnOg8$default(ReelTheme reelTheme, String str, List list, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reelTheme.name;
        }
        if ((i & 2) != 0) {
            list = reelTheme.bgColors;
        }
        if ((i & 4) != 0) {
            j = reelTheme.badgeColor;
        }
        if ((i & 8) != 0) {
            j2 = reelTheme.subtitleColor;
        }
        long j3 = j2;
        return reelTheme.m7108copy0YGnOg8(str, list, j, j3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<Color> component2() {
        return this.bgColors;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getBadgeColor() {
        return this.badgeColor;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getSubtitleColor() {
        return this.subtitleColor;
    }

    /* renamed from: copy-0YGnOg8, reason: not valid java name */
    public final ReelTheme m7108copy0YGnOg8(String name, List<Color> bgColors, long badgeColor, long subtitleColor) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bgColors, "bgColors");
        return new ReelTheme(name, bgColors, badgeColor, subtitleColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReelTheme)) {
            return false;
        }
        ReelTheme reelTheme = (ReelTheme) other;
        return Intrinsics.areEqual(this.name, reelTheme.name) && Intrinsics.areEqual(this.bgColors, reelTheme.bgColors) && Color.m4163equalsimpl0(this.badgeColor, reelTheme.badgeColor) && Color.m4163equalsimpl0(this.subtitleColor, reelTheme.subtitleColor);
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.bgColors.hashCode()) * 31) + Color.m4169hashCodeimpl(this.badgeColor)) * 31) + Color.m4169hashCodeimpl(this.subtitleColor);
    }

    public String toString() {
        return "ReelTheme(name=" + this.name + ", bgColors=" + this.bgColors + ", badgeColor=" + Color.m4170toStringimpl(this.badgeColor) + ", subtitleColor=" + Color.m4170toStringimpl(this.subtitleColor) + ")";
    }

    private ReelTheme(String name, List<Color> bgColors, long badgeColor, long subtitleColor) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bgColors, "bgColors");
        this.name = name;
        this.bgColors = bgColors;
        this.badgeColor = badgeColor;
        this.subtitleColor = subtitleColor;
    }

    public final String getName() {
        return this.name;
    }

    public final List<Color> getBgColors() {
        return this.bgColors;
    }

    /* renamed from: getBadgeColor-0d7_KjU, reason: not valid java name */
    public final long m7109getBadgeColor0d7_KjU() {
        return this.badgeColor;
    }

    /* renamed from: getSubtitleColor-0d7_KjU, reason: not valid java name */
    public final long m7110getSubtitleColor0d7_KjU() {
        return this.subtitleColor;
    }
}
