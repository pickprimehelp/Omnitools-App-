package com.example.model

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

data class ToolItem(
    val id: String,
    val title: String,
    val description: String,
    val category: ToolCategory,
    val icon: ImageVector,
    val iconColor: Color,
    val isFeatured: Boolean = false,
    val isPopular: Boolean = false
) {
    val accentColor: Color get() = iconColor
}
