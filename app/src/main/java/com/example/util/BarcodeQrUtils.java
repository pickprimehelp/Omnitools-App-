package com.example.util;

import android.graphics.Bitmap;
import androidx.core.view.ViewCompat;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: BarcodeQrUtils.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tJ$\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t¨\u0006\u000e"}, d2 = {"Lcom/example/util/BarcodeQrUtils;", "", "<init>", "()V", "generateQrBitmap", "Landroid/graphics/Bitmap;", "content", "", "width", "", "height", "foregroundColor", "backgroundColor", "generateBarcodeBitmap", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BarcodeQrUtils {
    public static final int $stable = 0;
    public static final BarcodeQrUtils INSTANCE = new BarcodeQrUtils();

    private BarcodeQrUtils() {
    }

    public static /* synthetic */ Bitmap generateQrBitmap$default(BarcodeQrUtils barcodeQrUtils, String str, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i = 600;
        }
        if ((i5 & 4) != 0) {
            i2 = 600;
        }
        if ((i5 & 8) != 0) {
            i3 = ViewCompat.MEASURED_STATE_MASK;
        }
        if ((i5 & 16) != 0) {
            i4 = -1;
        }
        return barcodeQrUtils.generateQrBitmap(str, i, i2, i3, i4);
    }

    public final Bitmap generateQrBitmap(String content, int width, int height, int foregroundColor, int backgroundColor) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (StringsKt.isBlank(content)) {
            return null;
        }
        try {
            QRCodeWriter writer = new QRCodeWriter();
            BitMatrix bitMatrix = writer.encode(content, BarcodeFormat.QR_CODE, width, height);
            Intrinsics.checkNotNullExpressionValue(bitMatrix, "encode(...)");
            Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmap, "createBitmap(...)");
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    bitmap.setPixel(x, y, bitMatrix.get(x, y) ? foregroundColor : backgroundColor);
                }
            }
            return bitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static /* synthetic */ Bitmap generateBarcodeBitmap$default(BarcodeQrUtils barcodeQrUtils, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 700;
        }
        if ((i3 & 4) != 0) {
            i2 = 260;
        }
        return barcodeQrUtils.generateBarcodeBitmap(str, i, i2);
    }

    public final Bitmap generateBarcodeBitmap(String content, int width, int height) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (StringsKt.isBlank(content)) {
            return null;
        }
        try {
            MultiFormatWriter writer = new MultiFormatWriter();
            BitMatrix bitMatrix = writer.encode(content, BarcodeFormat.CODE_128, width, height);
            Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmap, "createBitmap(...)");
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    bitmap.setPixel(x, y, bitMatrix.get(x, y) ? ViewCompat.MEASURED_STATE_MASK : -1);
                }
            }
            return bitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
