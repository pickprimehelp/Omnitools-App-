package com.example.util

import android.content.ClipData
import android.content.ClipboardManager
import android.content.ContentResolver
import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.provider.MediaStore
import android.widget.Toast
import androidx.core.content.FileProvider
import com.example.ui.tools.design.WeddingClipartRenderer
import java.io.File
import java.io.FileOutputStream
import java.io.OutputStream

object ImageExportUtils {

    fun copyToClipboard(context: Context, text: String, label: String = "OmniTools") {
        try {
            val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as? ClipboardManager
            val clip = ClipData.newPlainText(label, text)
            clipboard?.setPrimaryClip(clip)
            Toast.makeText(context, "Copied to clipboard!", Toast.LENGTH_SHORT).show()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun shareText(context: Context, text: String, title: String = "Share via") {
        try {
            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, text)
            }
            context.startActivity(Intent.createChooser(intent, title))
        } catch (e: Exception) {
            Toast.makeText(context, "Failed to share: ${e.message}", Toast.LENGTH_SHORT).show()
        }
    }

    private fun enrichWeddingCardBitmapIfNeeded(bitmap: Bitmap, isWeddingCard: Boolean): Bitmap {
        if (!isWeddingCard) return bitmap
        try {
            val mutable = bitmap.copy(Bitmap.Config.ARGB_8888, true)
            val canvas = Canvas(mutable)

            // 1. Ganpati Bappa Auspicious Header Motif (Top center)
            val ganpatiBmp = WeddingClipartRenderer.createGanpatiBitmap()
            val ganpatiDst = Rect(540 - 100, 70, 540 + 100, 70 + 160)
            canvas.drawBitmap(ganpatiBmp, null, ganpatiDst, Paint(Paint.ANTI_ALIAS_FLAG))

            // 2. Readymade Dulha-Dulhan Clipart (Center)
            val dulhaDulhanBmp = WeddingClipartRenderer.createDulhaDulhanBitmap()
            val ddDst = Rect(540 - 190, 310, 540 + 190, 310 + 240)
            canvas.drawBitmap(dulhaDulhanBmp, null, ddDst, Paint(Paint.ANTI_ALIAS_FLAG))

            // 3. Shehnai & Kalash Clipart (Around Date & Venue)
            val shehnaiBmp = WeddingClipartRenderer.createShehnaiKalashBitmap()
            val shehnaiDst = Rect(540 - 200, 1150, 540 + 200, 1150 + 100)
            canvas.drawBitmap(shehnaiBmp, null, shehnaiDst, Paint(Paint.ANTI_ALIAS_FLAG))

            return mutable
        } catch (e: Exception) {
            e.printStackTrace()
            return bitmap
        }
    }

    fun shareBitmap(context: Context, bitmap: Bitmap, title: String = "OmniTools Creation") {
        val isWedding = title.contains("Wedding", ignoreCase = true)
        val finalBmp = enrichWeddingCardBitmapIfNeeded(bitmap, isWedding)

        try {
            val cachePath = File(context.cacheDir, "images").apply { mkdirs() }
            val file = File(cachePath, "omnitools_${System.currentTimeMillis()}.png")
            FileOutputStream(file).use { stream ->
                finalBmp.compress(Bitmap.CompressFormat.PNG, 100, stream)
            }

            val contentUri = FileProvider.getUriForFile(
                context,
                "${context.packageName}.fileprovider",
                file
            )

            val shareIntent = Intent(Intent.ACTION_SEND).apply {
                type = "image/png"
                putExtra(Intent.EXTRA_STREAM, contentUri)
                putExtra(Intent.EXTRA_SUBJECT, title)
                addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
            }
            context.startActivity(Intent.createChooser(shareIntent, "Share via"))
        } catch (e: Exception) {
            Toast.makeText(context, "Failed to share image: ${e.message}", Toast.LENGTH_SHORT).show()
        }
    }

    fun saveBitmapToGallery(context: Context, bitmap: Bitmap, filenamePrefix: String = "OmniTools"): Boolean {
        val isWedding = filenamePrefix.contains("Wedding", ignoreCase = true)
        val finalBmp = enrichWeddingCardBitmapIfNeeded(bitmap, isWedding)

        return try {
            val filename = "${filenamePrefix}_${System.currentTimeMillis()}.png"
            var fos: OutputStream? = null

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                val resolver: ContentResolver = context.contentResolver
                val contentValues = ContentValues().apply {
                    put(MediaStore.MediaColumns.DISPLAY_NAME, filename)
                    put(MediaStore.MediaColumns.MIME_TYPE, "image/png")
                    put(MediaStore.MediaColumns.RELATIVE_PATH, Environment.DIRECTORY_PICTURES + "/OmniTools")
                }
                val imageUri = resolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues)
                if (imageUri != null) {
                    fos = resolver.openOutputStream(imageUri)
                }
            } else {
                val imagesDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).toString() + "/OmniTools"
                val file = File(imagesDir).apply { if (!exists()) mkdirs() }
                val image = File(file, filename)
                fos = FileOutputStream(image)
            }

            if (fos == null) return false

            fos.use { out ->
                finalBmp.compress(Bitmap.CompressFormat.PNG, 100, out)
            }
            Toast.makeText(context, "Saved to Gallery (Pictures/OmniTools)", Toast.LENGTH_SHORT).show()
            true
        } catch (e: Exception) {
            e.printStackTrace()
            Toast.makeText(context, "Saved locally in app cache", Toast.LENGTH_SHORT).show()
            false
        }
    }
}
