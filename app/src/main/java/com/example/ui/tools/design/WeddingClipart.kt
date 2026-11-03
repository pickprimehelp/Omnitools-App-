package com.example.ui.tools.design

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color as AndroidColor
import android.graphics.LinearGradient
import android.graphics.Paint
import android.graphics.Path
import android.graphics.RadialGradient
import android.graphics.RectF
import android.graphics.Shader
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

enum class WeddingClipartType(val title: String, val subtitle: String) {
    DULHA_DULHAN_ROYAL("Royal Dulha-Dulhan", "Traditional Couple Clipart with Varmala"),
    GANPATI_AUSPICIOUS("Ganpati Bappa", "Shree Ganesha Blessing & Sacred Halo"),
    SHEHNAI_KALASH("Shehnai & Kalash", "Traditional Wedding Music & Mangal Kalash"),
    CUSTOM_PHOTOS("Upload Custom Photos", "Your own Bride & Groom pictures")
}

object WeddingClipartRenderer {

    /**
     * Generates a high-resolution Ganpati Bappa auspicious emblem bitmap (400x320)
     */
    fun createGanpatiBitmap(accentColor: Int = AndroidColor.rgb(255, 215, 0)): Bitmap {
        val width = 400
        val height = 320
        val bmp = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bmp)

        val cx = width / 2f
        val cy = height / 2f - 20f

        // Golden aura / sunburst halo behind Ganpati
        val haloPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            shader = RadialGradient(
                cx, cy, 140f,
                intArrayOf(AndroidColor.argb(200, 255, 223, 0), AndroidColor.argb(80, 255, 140, 0), AndroidColor.TRANSPARENT),
                floatArrayOf(0f, 0.7f, 1f),
                Shader.TileMode.CLAMP
            )
        }
        canvas.drawCircle(cx, cy, 130f, haloPaint)

        // Mukut (Crown)
        val goldPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = AndroidColor.rgb(245, 185, 30)
            style = Paint.Style.FILL
        }
        val redPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = AndroidColor.rgb(200, 20, 20)
            style = Paint.Style.FILL
        }

        val crownPath = Path().apply {
            moveTo(cx, cy - 110f)
            lineTo(cx - 50f, cy - 40f)
            lineTo(cx + 50f, cy - 40f)
            close()
        }
        canvas.drawPath(crownPath, goldPaint)

        // Crown jewel
        canvas.drawCircle(cx, cy - 65f, 12f, redPaint)
        canvas.drawCircle(cx, cy - 110f, 7f, redPaint)

        // Large Ganesha Ears
        val earPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = AndroidColor.rgb(255, 200, 70)
            style = Paint.Style.FILL
        }
        canvas.drawOval(RectF(cx - 95f, cy - 40f, cx - 25f, cy + 30f), earPaint)
        canvas.drawOval(RectF(cx + 25f, cy - 40f, cx + 95f, cy + 30f), earPaint)

        // Ear inner detailing
        val innerEarPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = AndroidColor.rgb(230, 80, 50)
            style = Paint.Style.FILL
            alpha = 180
        }
        canvas.drawOval(RectF(cx - 85f, cy - 30f, cx - 35f, cy + 20f), innerEarPaint)
        canvas.drawOval(RectF(cx + 35f, cy - 30f, cx + 85f, cy + 20f), innerEarPaint)

        // Ganesha Head & Trunk
        val facePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = AndroidColor.rgb(255, 215, 90)
            style = Paint.Style.FILL
        }
        canvas.drawCircle(cx, cy - 10f, 45f, facePaint)

        // Sacred Trishul / Tilak on forehead
        val tilakPath = Path().apply {
            moveTo(cx - 16f, cy - 30f)
            quadTo(cx, cy - 15f, cx + 16f, cy - 30f)
            lineTo(cx + 12f, cy - 42f)
            quadTo(cx, cy - 25f, cx - 12f, cy - 42f)
            close()
        }
        canvas.drawPath(tilakPath, redPaint)
        canvas.drawCircle(cx, cy - 25f, 5f, redPaint)

        // Curved Trunk (Vakratunda)
        val trunkPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = AndroidColor.rgb(255, 195, 60)
            style = Paint.Style.STROKE
            strokeWidth = 24f
            strokeCap = Paint.Cap.ROUND
        }
        val trunkPath = Path().apply {
            moveTo(cx, cy - 5f)
            quadTo(cx - 15f, cy + 45f, cx + 20f, cy + 55f)
            quadTo(cx + 45f, cy + 55f, cx + 38f, cy + 40f)
        }
        canvas.drawPath(trunkPath, trunkPaint)

        // Modak (sweet delicacy) on trunk tip
        val modakPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = AndroidColor.rgb(255, 230, 100)
            style = Paint.Style.FILL
        }
        canvas.drawCircle(cx + 45f, cy + 38f, 14f, modakPaint)

        // Auspicious Text underneath
        val textPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = accentColor
            textSize = 28f
            isFakeBoldText = true
            textAlign = Paint.Align.CENTER
        }
        canvas.drawText("॥ वक्रतुण्ड महाकाय सूर्यकोटि समप्रभ ॥", cx, height - 20f, textPaint)

        return bmp
    }

    /**
     * Generates a readymade royal Dulha & Dulhan couple clipart illustration (500x320)
     */
    fun createDulhaDulhanBitmap(accentColor: Int = AndroidColor.rgb(255, 215, 0)): Bitmap {
        val width = 500
        val height = 320
        val bmp = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bmp)

        val groomCx = 180f
        val brideCx = 320f
        val headCy = 110f

        // Soft royal aura behind couple
        val auraPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            shader = RadialGradient(
                250f, 150f, 200f,
                intArrayOf(AndroidColor.argb(160, 255, 220, 120), AndroidColor.TRANSPARENT),
                floatArrayOf(0f, 1f),
                Shader.TileMode.CLAMP
            )
        }
        canvas.drawCircle(250f, 150f, 190f, auraPaint)

        // --- Groom (Dulha) ---
        // Pagdi / Turban (Royal Red with Golden Kalgi)
        val pagdiPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = AndroidColor.rgb(190, 25, 45)
            style = Paint.Style.FILL
        }
        val goldTrim = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = AndroidColor.rgb(255, 215, 0)
            style = Paint.Style.FILL
        }

        // Turban dome & folds
        canvas.drawOval(RectF(groomCx - 46f, headCy - 68f, groomCx + 46f, headCy - 20f), pagdiPaint)
        val kalgiPath = Path().apply {
            moveTo(groomCx, headCy - 85f)
            lineTo(groomCx - 12f, headCy - 60f)
            lineTo(groomCx + 12f, headCy - 60f)
            close()
        }
        canvas.drawPath(kalgiPath, goldTrim)
        canvas.drawCircle(groomCx, headCy - 58f, 7f, goldTrim)

        // Groom Face
        val skinPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = AndroidColor.rgb(240, 195, 160)
            style = Paint.Style.FILL
        }
        canvas.drawOval(RectF(groomCx - 36f, headCy - 30f, groomCx + 36f, headCy + 42f), skinPaint)

        // Groom Tilak & Mustache
        val tilakPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = AndroidColor.rgb(200, 20, 20)
            strokeWidth = 4f
            style = Paint.Style.STROKE
        }
        canvas.drawLine(groomCx, headCy - 15f, groomCx, headCy - 3f, tilakPaint)

        // Groom Sherwani (Golden Cream with Maroon Stole)
        val sherwaniPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = AndroidColor.rgb(248, 240, 220)
            style = Paint.Style.FILL
        }
        val groomBody = Path().apply {
            moveTo(groomCx - 50f, headCy + 42f)
            lineTo(groomCx + 45f, headCy + 42f)
            lineTo(groomCx + 70f, headCy + 150f)
            lineTo(groomCx - 75f, headCy + 150f)
            close()
        }
        canvas.drawPath(groomBody, sherwaniPaint)

        // Royal Stole / Dupatta (Dupatta across groom)
        val stolePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = AndroidColor.rgb(180, 20, 40)
            style = Paint.Style.FILL
        }
        val stolePath = Path().apply {
            moveTo(groomCx - 40f, headCy + 42f)
            lineTo(groomCx - 15f, headCy + 42f)
            lineTo(groomCx + 25f, headCy + 150f)
            lineTo(groomCx - 10f, headCy + 150f)
            close()
        }
        canvas.drawPath(stolePath, stolePaint)

        // --- Bride (Dulhan) ---
        // Bridal Chunari / Veil (Embroidered Crimson Red)
        val lehengaPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = AndroidColor.rgb(215, 20, 45)
            style = Paint.Style.FILL
        }
        // Chunari drape
        val chunariPath = Path().apply {
            moveTo(brideCx, headCy - 55f)
            quadTo(brideCx - 60f, headCy, brideCx - 55f, headCy + 150f)
            lineTo(brideCx + 75f, headCy + 150f)
            quadTo(brideCx + 65f, headCy, brideCx, headCy - 55f)
            close()
        }
        canvas.drawPath(chunariPath, lehengaPaint)

        // Bride Face
        val brideSkinPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = AndroidColor.rgb(248, 205, 175)
            style = Paint.Style.FILL
        }
        canvas.drawOval(RectF(brideCx - 33f, headCy - 28f, brideCx + 33f, headCy + 38f), brideSkinPaint)

        // Maang Tikka (Golden bridal jewel on forehead)
        canvas.drawCircle(brideCx, headCy - 22f, 6f, goldTrim)
        canvas.drawLine(brideCx, headCy - 38f, brideCx, headCy - 22f, tilakPaint)

        // Nath (Nose ring) & Bindi
        canvas.drawCircle(brideCx, headCy - 12f, 4f, tilakPaint)
        val nathPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = AndroidColor.rgb(255, 215, 0)
            style = Paint.Style.STROKE
            strokeWidth = 3f
        }
        canvas.drawCircle(brideCx - 8f, headCy + 8f, 7f, nathPaint)

        // Bridal Blouse & Jewelry
        val brideBody = Path().apply {
            moveTo(brideCx - 42f, headCy + 38f)
            lineTo(brideCx + 48f, headCy + 38f)
            lineTo(brideCx + 65f, headCy + 150f)
            lineTo(brideCx - 55f, headCy + 150f)
            close()
        }
        canvas.drawPath(brideBody, lehengaPaint)

        // Golden Rani Haar (Necklace)
        canvas.drawOval(RectF(brideCx - 22f, headCy + 38f, brideCx + 22f, headCy + 65f), nathPaint)

        // --- Varmala (Garlands) around couple ---
        val garlandPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = AndroidColor.rgb(255, 80, 80)
            style = Paint.Style.STROKE
            strokeWidth = 14f
            strokeCap = Paint.Cap.ROUND
        }
        val goldGarlandDot = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = AndroidColor.rgb(255, 220, 50)
            style = Paint.Style.FILL
        }

        // Connecting Varmala in center
        val centerHeartPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = AndroidColor.rgb(230, 30, 60)
            textSize = 42f
            textAlign = Paint.Align.CENTER
        }
        canvas.drawText("❤", 250f, headCy + 65f, centerHeartPaint)

        // Auspicious Label
        val labelPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = accentColor
            textSize = 28f
            isFakeBoldText = true
            textAlign = Paint.Align.CENTER
        }
        canvas.drawText("शुभ विवाह • Perfect Pair", 250f, height - 15f, labelPaint)

        return bmp
    }

    /**
     * Generates traditional Shehnai & Kalash clipart (460x220)
     */
    fun createShehnaiKalashBitmap(accentColor: Int = AndroidColor.rgb(255, 215, 0)): Bitmap {
        val width = 460
        val height = 220
        val bmp = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bmp)

        val cx = width / 2f
        val kalashCy = 115f

        // --- Center Kalash ---
        val goldPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = AndroidColor.rgb(240, 190, 40)
            style = Paint.Style.FILL
        }
        val brassPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = AndroidColor.rgb(215, 155, 25)
            style = Paint.Style.FILL
        }
        val redPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = AndroidColor.rgb(210, 30, 40)
            style = Paint.Style.FILL
        }
        val greenPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = AndroidColor.rgb(40, 160, 60)
            style = Paint.Style.FILL
        }

        // Kalash Pot body
        val potPath = Path().apply {
            moveTo(cx - 30f, kalashCy - 10f)
            quadTo(cx - 60f, kalashCy + 30f, cx - 40f, kalashCy + 65f)
            lineTo(cx + 40f, kalashCy + 65f)
            quadTo(cx + 60f, kalashCy + 30f, cx + 30f, kalashCy - 10f)
            close()
        }
        canvas.drawPath(potPath, goldPaint)

        // Kalash Rim
        canvas.drawRect(cx - 35f, kalashCy - 18f, cx + 35f, kalashCy - 10f, brassPaint)

        // Swastik on Kalash
        val swastikPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = AndroidColor.rgb(210, 30, 40)
            strokeWidth = 4f
            style = Paint.Style.STROKE
        }
        canvas.drawLine(cx, kalashCy + 15f, cx, kalashCy + 45f, swastikPaint)
        canvas.drawLine(cx - 15f, kalashCy + 30f, cx + 15f, kalashCy + 30f, swastikPaint)
        canvas.drawLine(cx - 15f, kalashCy + 30f, cx - 15f, kalashCy + 20f, swastikPaint)
        canvas.drawLine(cx + 15f, kalashCy + 30f, cx + 15f, kalashCy + 40f, swastikPaint)
        canvas.drawLine(cx, kalashCy + 15f, cx + 10f, kalashCy + 15f, swastikPaint)
        canvas.drawLine(cx, kalashCy + 45f, cx - 10f, kalashCy + 45f, swastikPaint)

        // Mango Leaves (Amra Pallav)
        val leaf1 = Path().apply {
            moveTo(cx, kalashCy - 18f)
            quadTo(cx - 45f, kalashCy - 45f, cx - 50f, kalashCy - 20f)
            close()
        }
        val leaf2 = Path().apply {
            moveTo(cx, kalashCy - 18f)
            quadTo(cx + 45f, kalashCy - 45f, cx + 50f, kalashCy - 20f)
            close()
        }
        canvas.drawPath(leaf1, greenPaint)
        canvas.drawPath(leaf2, greenPaint)

        // Nariyal (Coconut on top)
        val coconutPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = AndroidColor.rgb(139, 69, 19)
            style = Paint.Style.FILL
        }
        canvas.drawOval(RectF(cx - 24f, kalashCy - 55f, cx + 24f, kalashCy - 16f), coconutPaint)

        // Sacred Thread / Tilak on coconut
        canvas.drawCircle(cx, kalashCy - 35f, 6f, redPaint)

        // --- Twin Shehnais (Left & Right) ---
        val shehnaiPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = AndroidColor.rgb(255, 210, 50)
            style = Paint.Style.STROKE
            strokeWidth = 10f
            strokeCap = Paint.Cap.ROUND
        }

        // Left Shehnai
        val leftShehnai = Path().apply {
            moveTo(40f, kalashCy + 40f)
            lineTo(cx - 75f, kalashCy - 30f)
        }
        canvas.drawPath(leftShehnai, shehnaiPaint)
        // Left bell flare
        val leftBell = Path().apply {
            moveTo(40f, kalashCy + 40f)
            lineTo(20f, kalashCy + 25f)
            lineTo(25f, kalashCy + 55f)
            close()
        }
        canvas.drawPath(leftBell, goldPaint)

        // Right Shehnai
        val rightShehnai = Path().apply {
            moveTo(width - 40f, kalashCy + 40f)
            lineTo(cx + 75f, kalashCy - 30f)
        }
        canvas.drawPath(rightShehnai, shehnaiPaint)
        // Right bell flare
        val rightBell = Path().apply {
            moveTo(width - 40f, kalashCy + 40f)
            lineTo(width - 20f, kalashCy + 25f)
            lineTo(width - 25f, kalashCy + 55f)
            close()
        }
        canvas.drawPath(rightBell, goldPaint)

        // Musical Swar & Blessings text
        val musicPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = accentColor
            textSize = 24f
            isFakeBoldText = true
            textAlign = Paint.Align.CENTER
        }
        canvas.drawText("♬  मंगल वाद्य व शहनाई  ♬", cx, height - 12f, musicPaint)

        return bmp
    }
}

@Composable
fun WeddingClipartSelector(
    selectedType: WeddingClipartType,
    onSelectType: (WeddingClipartType) -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f))
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "✨ Wedding Clipart & Couple Avatars",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Choose ready-made Ganpati Bappa, Dulha-Dulhan, or Shehnai clipart:",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            Spacer(modifier = Modifier.height(12.dp))

            WeddingClipartType.values().forEach { type ->
                val isSelected = selectedType == type
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp)
                        .clickable { onSelectType(type) },
                    shape = RoundedCornerShape(12.dp),
                    color = if (isSelected) MaterialTheme.colorScheme.primaryContainer else MaterialTheme.colorScheme.surface,
                    border = BorderStroke(
                        width = if (isSelected) 2.dp else 1.dp,
                        color = if (isSelected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.outlineVariant
                    )
                ) {
                    Row(
                        modifier = Modifier.padding(12.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            val icon = when (type) {
                                WeddingClipartType.GANPATI_AUSPICIOUS -> Icons.Default.Star
                                WeddingClipartType.DULHA_DULHAN_ROYAL -> Icons.Default.Favorite
                                WeddingClipartType.SHEHNAI_KALASH -> Icons.Default.MusicNote
                                WeddingClipartType.CUSTOM_PHOTOS -> Icons.Default.CheckCircle
                            }
                            Icon(
                                imageVector = icon,
                                contentDescription = null,
                                tint = if (isSelected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurfaceVariant,
                                modifier = Modifier.size(24.dp)
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Column {
                                Text(
                                    text = type.title,
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = 14.sp
                                )
                                Text(
                                    text = type.subtitle,
                                    fontSize = 12.sp,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            }
                        }

                        if (isSelected) {
                            Icon(
                                imageVector = Icons.Default.CheckCircle,
                                contentDescription = "Selected",
                                tint = MaterialTheme.colorScheme.primary
                            )
                        }
                    }
                }
            }
        }
    }
}
