package com.example.ui.tools.design;

import androidx.compose.ui.graphics.Color;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DesignTools.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0011J\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0011JH\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u00020\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u00020\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\t\u001a\u00020\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011¨\u0006&"}, d2 = {"Lcom/example/ui/tools/design/WeddingTheme;", "", "name", "", "bgColors", "", "Landroidx/compose/ui/graphics/Color;", "textColor", "accentColor", "borderColor", "<init>", "(Ljava/lang/String;Ljava/util/List;JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getName", "()Ljava/lang/String;", "getBgColors", "()Ljava/util/List;", "getTextColor-0d7_KjU", "()J", "J", "getAccentColor-0d7_KjU", "getBorderColor-0d7_KjU", "component1", "component2", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "component5", "component5-0d7_KjU", "copy", "copy-FLEW7EY", "(Ljava/lang/String;Ljava/util/List;JJJ)Lcom/example/ui/tools/design/WeddingTheme;", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class WeddingTheme {
    public static final int $stable = 8;
    private final long accentColor;
    private final List<Color> bgColors;
    private final long borderColor;
    private final String name;
    private final long textColor;

    public /* synthetic */ WeddingTheme(String str, List list, long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, j, j2, j3);
    }

    /* renamed from: copy-FLEW7EY$default, reason: not valid java name */
    public static /* synthetic */ WeddingTheme m7119copyFLEW7EY$default(WeddingTheme weddingTheme, String str, List list, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = weddingTheme.name;
        }
        if ((i & 2) != 0) {
            list = weddingTheme.bgColors;
        }
        if ((i & 4) != 0) {
            j = weddingTheme.textColor;
        }
        if ((i & 8) != 0) {
            j2 = weddingTheme.accentColor;
        }
        if ((i & 16) != 0) {
            j3 = weddingTheme.borderColor;
        }
        long j4 = j3;
        long j5 = j2;
        return weddingTheme.m7123copyFLEW7EY(str, list, j, j5, j4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<Color> component2() {
        return this.bgColors;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextColor() {
        return this.textColor;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getAccentColor() {
        return this.accentColor;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    public final long getBorderColor() {
        return this.borderColor;
    }

    /* renamed from: copy-FLEW7EY, reason: not valid java name */
    public final WeddingTheme m7123copyFLEW7EY(String name, List<Color> bgColors, long textColor, long accentColor, long borderColor) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bgColors, "bgColors");
        return new WeddingTheme(name, bgColors, textColor, accentColor, borderColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeddingTheme)) {
            return false;
        }
        WeddingTheme weddingTheme = (WeddingTheme) other;
        return Intrinsics.areEqual(this.name, weddingTheme.name) && Intrinsics.areEqual(this.bgColors, weddingTheme.bgColors) && Color.m4163equalsimpl0(this.textColor, weddingTheme.textColor) && Color.m4163equalsimpl0(this.accentColor, weddingTheme.accentColor) && Color.m4163equalsimpl0(this.borderColor, weddingTheme.borderColor);
    }

    public int hashCode() {
        return (((((((this.name.hashCode() * 31) + this.bgColors.hashCode()) * 31) + Color.m4169hashCodeimpl(this.textColor)) * 31) + Color.m4169hashCodeimpl(this.accentColor)) * 31) + Color.m4169hashCodeimpl(this.borderColor);
    }

    public String toString() {
        return "WeddingTheme(name=" + this.name + ", bgColors=" + this.bgColors + ", textColor=" + Color.m4170toStringimpl(this.textColor) + ", accentColor=" + Color.m4170toStringimpl(this.accentColor) + ", borderColor=" + Color.m4170toStringimpl(this.borderColor) + ")";
    }

    private WeddingTheme(String name, List<Color> bgColors, long textColor, long accentColor, long borderColor) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bgColors, "bgColors");
        this.name = name;
        this.bgColors = bgColors;
        this.textColor = textColor;
        this.accentColor = accentColor;
        this.borderColor = borderColor;
    }

    public final String getName() {
        return this.name;
    }

    public final List<Color> getBgColors() {
        return this.bgColors;
    }

    /* renamed from: getTextColor-0d7_KjU, reason: not valid java name */
    public final long m7126getTextColor0d7_KjU() {
        return this.textColor;
    }

    /* renamed from: getAccentColor-0d7_KjU, reason: not valid java name */
    public final long m7124getAccentColor0d7_KjU() {
        return this.accentColor;
    }

    /* renamed from: getBorderColor-0d7_KjU, reason: not valid java name */
    public final long m7125getBorderColor0d7_KjU() {
        return this.borderColor;
    }
}
