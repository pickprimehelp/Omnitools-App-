package com.example.ui.tools.pdf

import android.content.Context
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.EditNote
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.TextFields
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ads.TopBannerAd
import com.example.util.ImageExportUtils
import java.util.Locale

@Composable
fun TextToPdfScreen(onBack: () -> Unit) {
    // Directly launches the comprehensive Photo to PDF tool requested by user
    PhotoToPdfScreen(onBack = onBack)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WordAndCharacterCounterScreen(onBack: () -> Unit) {
    BackHandler { onBack() }
    val context = LocalContext.current
    var textInput by remember { mutableStateOf("") }

    val charCount = textInput.length
    val charNoSpaceCount = textInput.replace(" ", "").replace("\n", "").length
    val words = textInput.trim().split(Regex("\\s+")).filter { it.isNotBlank() }
    val wordCount = if (textInput.isBlank()) 0 else words.size
    val sentenceCount = if (textInput.isBlank()) 0 else textInput.split(Regex("[.!?]+\\s*")).filter { it.isNotBlank() }.size
    val paragraphCount = if (textInput.isBlank()) 0 else textInput.split(Regex("\n+")).filter { it.isNotBlank() }.size
    val readingTimeMinutes = Math.max(1, (wordCount / 200.0).toInt())

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Word & Character Counter", fontWeight = FontWeight.Bold, fontSize = 18.sp) },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = MaterialTheme.colorScheme.surface)
            )
        },
        bottomBar = { TopBannerAd() }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                Spacer(modifier = Modifier.height(4.dp))
                // Live Stat Grid
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    CountStatCard("Words", "$wordCount", Modifier.weight(1f))
                    CountStatCard("Characters", "$charCount", Modifier.weight(1f))
                    CountStatCard("No Spaces", "$charNoSpaceCount", Modifier.weight(1f))
                }
            }

            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    CountStatCard("Sentences", "$sentenceCount", Modifier.weight(1f))
                    CountStatCard("Paragraphs", "$paragraphCount", Modifier.weight(1f))
                    CountStatCard("Read Time", "~$readingTimeMinutes min", Modifier.weight(1f))
                }
            }

            item {
                OutlinedTextField(
                    value = textInput,
                    onValueChange = { textInput = it },
                    label = { Text("Type or paste your text here...") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(260.dp),
                    shape = RoundedCornerShape(16.dp)
                )
            }

            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Button(
                        onClick = { ImageExportUtils.copyToClipboard(context, textInput, "Text Stats") },
                        enabled = textInput.isNotBlank(),
                        modifier = Modifier.weight(1f),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Icon(Icons.Default.ContentCopy, contentDescription = null, modifier = Modifier.size(18.dp))
                        Spacer(modifier = Modifier.width(6.dp))
                        Text("Copy Text")
                    }

                    OutlinedButton(
                        onClick = { textInput = "" },
                        enabled = textInput.isNotBlank(),
                        modifier = Modifier.weight(1f),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Icon(Icons.Default.Clear, contentDescription = null, modifier = Modifier.size(18.dp))
                        Spacer(modifier = Modifier.width(6.dp))
                        Text("Clear")
                    }
                }
            }

            item {
                Spacer(modifier = Modifier.height(24.dp))
            }
        }
    }
}

@Composable
private fun CountStatCard(title: String, value: String, modifier: Modifier = Modifier) {
    Card(
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.7f)),
        modifier = modifier
    ) {
        Column(
            modifier = Modifier.padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = value, fontWeight = FontWeight.Bold, fontSize = 20.sp, color = MaterialTheme.colorScheme.primary)
            Spacer(modifier = Modifier.height(2.dp))
            Text(text = title, fontSize = 11.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CaseConverterScreen(onBack: () -> Unit) {
    BackHandler { onBack() }
    val context = LocalContext.current
    var inputText by remember { mutableStateOf("") }

    fun toTitleCase(str: String): String {
        return str.split(" ").joinToString(" ") { word ->
            word.lowercase(Locale.getDefault()).replaceFirstChar { it.titlecase(Locale.getDefault()) }
        }
    }

    fun toCamelCase(str: String): String {
        val words = str.trim().split(Regex("[\\s_\\-]+"))
        return words.mapIndexed { index, w ->
            if (index == 0) w.lowercase(Locale.getDefault())
            else w.lowercase(Locale.getDefault()).replaceFirstChar { it.titlecase(Locale.getDefault()) }
        }.joinToString("")
    }

    fun toSnakeCase(str: String): String {
        return str.trim().split(Regex("[\\s_\\-]+")).joinToString("_") { it.lowercase(Locale.getDefault()) }
    }

    fun toKebabCase(str: String): String {
        return str.trim().split(Regex("[\\s_\\-]+")).joinToString("-") { it.lowercase(Locale.getDefault()) }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Case Converter", fontWeight = FontWeight.Bold, fontSize = 18.sp) },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = MaterialTheme.colorScheme.surface)
            )
        },
        bottomBar = { TopBannerAd() }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            item {
                Spacer(modifier = Modifier.height(4.dp))
                OutlinedTextField(
                    value = inputText,
                    onValueChange = { inputText = it },
                    label = { Text("Enter your text to convert...") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(180.dp),
                    shape = RoundedCornerShape(16.dp)
                )
            }

            if (inputText.isNotBlank()) {
                val conversions = listOf(
                    "UPPERCASE" to inputText.uppercase(Locale.getDefault()),
                    "lowercase" to inputText.lowercase(Locale.getDefault()),
                    "Title Case" to toTitleCase(inputText),
                    "camelCase" to toCamelCase(inputText),
                    "snake_case" to toSnakeCase(inputText),
                    "kebab-case" to toKebabCase(inputText)
                )

                items(conversions.size) { i ->
                    val (label, converted) = conversions[i]
                    Card(
                        shape = RoundedCornerShape(14.dp),
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(14.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column(modifier = Modifier.weight(1f)) {
                                Text(text = label, fontWeight = FontWeight.Bold, fontSize = 12.sp, color = MaterialTheme.colorScheme.primary)
                                Spacer(modifier = Modifier.height(2.dp))
                                Text(text = converted, fontSize = 15.sp, maxLines = 3)
                            }
                            Row {
                                IconButton(onClick = { ImageExportUtils.copyToClipboard(context, converted, label) }) {
                                    Icon(Icons.Default.ContentCopy, contentDescription = "Copy", modifier = Modifier.size(20.dp))
                                }
                                IconButton(onClick = { ImageExportUtils.shareText(context, converted, "Converted Text - $label") }) {
                                    Icon(Icons.Default.Share, contentDescription = "Share", modifier = Modifier.size(20.dp))
                                }
                            }
                        }
                    }
                }
            }

            item {
                Spacer(modifier = Modifier.height(24.dp))
            }
        }
    }
}
