package com.example.model

import androidx.compose.ui.graphics.Color

enum class ToolCategory(
    val title: String,
    val subtitle: String,
    val badgeColor: Color
) {
    ALL("All Tools", "Every tool in one place", Color(4284704497L)),
    DESIGN("Design & Cards", "Weddings, Status, Reels & Thumbnails", Color(4293675161L)),
    CREATOR("Creator Tools", "YouTube, SEO, Hashtags & Revenue", Color(4293870660L)),
    BUSINESS("Business & Finance", "Invoices, GST, EMI & Calculations", Color(4279286145L)),
    IMAGE("Image Tools", "Compress, Resize, Crop & Passport", Color(4282090230L)),
    PDF_DOC("PDF & Document", "PDF Tools, Word Counter & Formatters", Color(4287323382L)),
    VOICE("Voice & Audio", "Voice Changer & Sound Effects", Color(4294286859L)),
    DAILY("Daily Utilities", "QR Code, Barcode, Age, BMI & Time", Color(4279548070L))
}
