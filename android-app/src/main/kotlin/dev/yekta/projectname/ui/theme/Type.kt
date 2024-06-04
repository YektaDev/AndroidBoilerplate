/*
 * Unpublished Copyright 2024 Ali Khaleqi Yekta, All Rights Reserved.
 */

package dev.yekta.projectname.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.unit.em
import dev.yekta.projectname.R
import android.os.Build

@Stable
@OptIn(ExperimentalTextApi::class)
private val vazirmatnBold = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
  FontFamily(
    Font(
      R.font.vazirmatn,
      variationSettings = FontVariation.Settings(
        FontVariation.weight(950),
        FontVariation.width(30f),
      ),
    ),
  )
} else FontFamily.Default

@Stable
private val vazirmatnNormal =
  if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) FontFamily(Font(R.font.vazirmatn))
  else FontFamily.Default

@Stable
private val displayFontFamily = vazirmatnBold

@Stable
private val bodyFontFamily = vazirmatnNormal

// Default Material 3 typography values
@Stable
private val baseline = Typography()

@Stable
private val lineHeight = 1.5f.em

@JvmField
@Stable
val AppTypography = Typography(
  displayLarge = baseline.displayLarge.copy(fontFamily = displayFontFamily, lineHeight = lineHeight),
  displayMedium = baseline.displayMedium.copy(fontFamily = displayFontFamily, lineHeight = lineHeight),
  displaySmall = baseline.displaySmall.copy(fontFamily = displayFontFamily, lineHeight = lineHeight),
  headlineLarge = baseline.headlineLarge.copy(fontFamily = displayFontFamily, lineHeight = lineHeight),
  headlineMedium = baseline.headlineMedium.copy(fontFamily = displayFontFamily, lineHeight = lineHeight),
  headlineSmall = baseline.headlineSmall.copy(fontFamily = displayFontFamily, lineHeight = lineHeight),
  titleLarge = baseline.titleLarge.copy(fontFamily = displayFontFamily, lineHeight = lineHeight),
  titleMedium = baseline.titleMedium.copy(fontFamily = displayFontFamily, lineHeight = lineHeight),
  titleSmall = baseline.titleSmall.copy(fontFamily = displayFontFamily, lineHeight = lineHeight),
  bodyLarge = baseline.bodyLarge.copy(fontFamily = bodyFontFamily, lineHeight = lineHeight),
  bodyMedium = baseline.bodyMedium.copy(fontFamily = bodyFontFamily, lineHeight = lineHeight),
  bodySmall = baseline.bodySmall.copy(fontFamily = bodyFontFamily, lineHeight = lineHeight),
  labelLarge = baseline.labelLarge.copy(fontFamily = bodyFontFamily, lineHeight = lineHeight),
  labelMedium = baseline.labelMedium.copy(fontFamily = bodyFontFamily, lineHeight = lineHeight),
  labelSmall = baseline.labelSmall.copy(fontFamily = bodyFontFamily, lineHeight = lineHeight),
)
