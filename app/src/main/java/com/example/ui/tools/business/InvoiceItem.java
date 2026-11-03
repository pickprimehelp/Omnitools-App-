package com.example.ui.tools.business;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BusinessTools.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J1\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0018\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000fR\u0011\u0010\u001a\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000f¨\u0006'"}, d2 = {"Lcom/example/ui/tools/business/InvoiceItem;", "", "name", "", "qty", "", "rate", "gstRate", "<init>", "(Ljava/lang/String;DDD)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getQty", "()D", "setQty", "(D)V", "getRate", "setRate", "getGstRate", "setGstRate", "totalTaxable", "getTotalTaxable", "taxAmount", "getTaxAmount", "totalAmount", "getTotalAmount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class InvoiceItem {
    public static final int $stable = 8;
    private double gstRate;
    private String name;
    private double qty;
    private double rate;

    public static /* synthetic */ InvoiceItem copy$default(InvoiceItem invoiceItem, String str, double d, double d2, double d3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = invoiceItem.name;
        }
        if ((i & 2) != 0) {
            d = invoiceItem.qty;
        }
        if ((i & 4) != 0) {
            d2 = invoiceItem.rate;
        }
        if ((i & 8) != 0) {
            d3 = invoiceItem.gstRate;
        }
        double d4 = d3;
        return invoiceItem.copy(str, d, d2, d4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final double getQty() {
        return this.qty;
    }

    /* renamed from: component3, reason: from getter */
    public final double getRate() {
        return this.rate;
    }

    /* renamed from: component4, reason: from getter */
    public final double getGstRate() {
        return this.gstRate;
    }

    public final InvoiceItem copy(String name, double qty, double rate, double gstRate) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new InvoiceItem(name, qty, rate, gstRate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvoiceItem)) {
            return false;
        }
        InvoiceItem invoiceItem = (InvoiceItem) other;
        return Intrinsics.areEqual(this.name, invoiceItem.name) && Double.compare(this.qty, invoiceItem.qty) == 0 && Double.compare(this.rate, invoiceItem.rate) == 0 && Double.compare(this.gstRate, invoiceItem.gstRate) == 0;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + Double.hashCode(this.qty)) * 31) + Double.hashCode(this.rate)) * 31) + Double.hashCode(this.gstRate);
    }

    public String toString() {
        return "InvoiceItem(name=" + this.name + ", qty=" + this.qty + ", rate=" + this.rate + ", gstRate=" + this.gstRate + ")";
    }

    public InvoiceItem(String name, double qty, double rate, double gstRate) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.qty = qty;
        this.rate = rate;
        this.gstRate = gstRate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ InvoiceItem(java.lang.String r11, double r12, double r14, double r16, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r10 = this;
            r0 = r18 & 8
            if (r0 == 0) goto L8
            r0 = 4625759767262920704(0x4032000000000000, double:18.0)
            r8 = r0
            goto La
        L8:
            r8 = r16
        La:
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r14
            r2.<init>(r3, r4, r6, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.business.InvoiceItem.<init>(java.lang.String, double, double, double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final double getQty() {
        return this.qty;
    }

    public final void setQty(double d) {
        this.qty = d;
    }

    public final double getRate() {
        return this.rate;
    }

    public final void setRate(double d) {
        this.rate = d;
    }

    public final double getGstRate() {
        return this.gstRate;
    }

    public final void setGstRate(double d) {
        this.gstRate = d;
    }

    public final double getTotalTaxable() {
        return this.qty * this.rate;
    }

    public final double getTaxAmount() {
        return getTotalTaxable() * (this.gstRate / 100.0d);
    }

    public final double getTotalAmount() {
        return getTotalTaxable() + getTaxAmount();
    }
}
