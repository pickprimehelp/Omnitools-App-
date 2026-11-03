package com.example.ui.tools.fonts;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FontsMakerScreen.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J=\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/example/ui/tools/fonts/FontVariant;", "", "id", "", "name", "sampleText", "transform", "Lkotlin/Function1;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getId", "()Ljava/lang/String;", "getName", "getSampleText", "getTransform", "()Lkotlin/jvm/functions/Function1;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FontVariant {
    public static final int $stable = 0;
    private final String id;
    private final String name;
    private final String sampleText;
    private final Function1<String, String> transform;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FontVariant copy$default(FontVariant fontVariant, String str, String str2, String str3, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fontVariant.id;
        }
        if ((i & 2) != 0) {
            str2 = fontVariant.name;
        }
        if ((i & 4) != 0) {
            str3 = fontVariant.sampleText;
        }
        if ((i & 8) != 0) {
            function1 = fontVariant.transform;
        }
        return fontVariant.copy(str, str2, str3, function1);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSampleText() {
        return this.sampleText;
    }

    public final Function1<String, String> component4() {
        return this.transform;
    }

    public final FontVariant copy(String id, String name, String sampleText, Function1<? super String, String> transform) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(sampleText, "sampleText");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new FontVariant(id, name, sampleText, transform);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FontVariant)) {
            return false;
        }
        FontVariant fontVariant = (FontVariant) other;
        return Intrinsics.areEqual(this.id, fontVariant.id) && Intrinsics.areEqual(this.name, fontVariant.name) && Intrinsics.areEqual(this.sampleText, fontVariant.sampleText) && Intrinsics.areEqual(this.transform, fontVariant.transform);
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.sampleText.hashCode()) * 31) + this.transform.hashCode();
    }

    public String toString() {
        return "FontVariant(id=" + this.id + ", name=" + this.name + ", sampleText=" + this.sampleText + ", transform=" + this.transform + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FontVariant(String id, String name, String sampleText, Function1<? super String, String> transform) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(sampleText, "sampleText");
        Intrinsics.checkNotNullParameter(transform, "transform");
        this.id = id;
        this.name = name;
        this.sampleText = sampleText;
        this.transform = transform;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSampleText() {
        return this.sampleText;
    }

    public final Function1<String, String> getTransform() {
        return this.transform;
    }
}
