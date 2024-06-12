package dev.yekta.projectname.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import android.app.Activity
import android.os.Build

val Theme @ReadOnlyComposable @Stable get() = MaterialTheme

@Stable private val primaryLight = Color(0xFF566422)
@Stable private val onPrimaryLight = Color(0xFFFFFFFF)
@Stable private val primaryContainerLight = Color(0xFFD9EB99)
@Stable private val onPrimaryContainerLight = Color(0xFF171E00)
@Stable private val secondaryLight = Color(0xFF5C6146)
@Stable private val onSecondaryLight = Color(0xFFFFFFFF)
@Stable private val secondaryContainerLight = Color(0xFFE0E6C3)
@Stable private val onSecondaryContainerLight = Color(0xFF191E08)
@Stable private val tertiaryLight = Color(0xFF3A665D)
@Stable private val onTertiaryLight = Color(0xFFFFFFFF)
@Stable private val tertiaryContainerLight = Color(0xFFBDECE1)
@Stable private val onTertiaryContainerLight = Color(0xFF00201B)
@Stable private val errorLight = Color(0xFFBA1A1A)
@Stable private val onErrorLight = Color(0xFFFFFFFF)
@Stable private val errorContainerLight = Color(0xFFFFDAD6)
@Stable private val onErrorContainerLight = Color(0xFF410002)
@Stable private val backgroundLight = Color(0xFFFBFAED)
@Stable private val onBackgroundLight = Color(0xFF1B1C15)
@Stable private val surfaceLight = Color(0xFFFBFAED)
@Stable private val onSurfaceLight = Color(0xFF1B1C15)
@Stable private val surfaceVariantLight = Color(0xFFE3E4D3)
@Stable private val onSurfaceVariantLight = Color(0xFF46483C)
@Stable private val outlineLight = Color(0xFF77786A)
@Stable private val outlineVariantLight = Color(0xFFC7C8B8)
@Stable private val scrimLight = Color(0xFF000000)
@Stable private val inverseSurfaceLight = Color(0xFF303129)
@Stable private val inverseOnSurfaceLight = Color(0xFFF2F1E5)
@Stable private val inversePrimaryLight = Color(0xFFBDCE80)
@Stable private val surfaceDimLight = Color(0xFFDBDBCE)
@Stable private val surfaceBrightLight = Color(0xFFFBFAED)
@Stable private val surfaceContainerLowestLight = Color(0xFFFFFFFF)
@Stable private val surfaceContainerLowLight = Color(0xFFF5F4E8)
@Stable private val surfaceContainerLight = Color(0xFFEFEEE2)
@Stable private val surfaceContainerHighLight = Color(0xFFE9E9DC)
@Stable private val surfaceContainerHighestLight = Color(0xFFE4E3D7)

@Stable private val primaryLightMediumContrast = Color(0xFF3B4806)
@Stable private val onPrimaryLightMediumContrast = Color(0xFFFFFFFF)
@Stable private val primaryContainerLightMediumContrast = Color(0xFF6C7B36)
@Stable private val onPrimaryContainerLightMediumContrast = Color(0xFFFFFFFF)
@Stable private val secondaryLightMediumContrast = Color(0xFF40452C)
@Stable private val onSecondaryLightMediumContrast = Color(0xFFFFFFFF)
@Stable private val secondaryContainerLightMediumContrast = Color(0xFF72775B)
@Stable private val onSecondaryContainerLightMediumContrast = Color(0xFFFFFFFF)
@Stable private val tertiaryLightMediumContrast = Color(0xFF1C4A42)
@Stable private val onTertiaryLightMediumContrast = Color(0xFFFFFFFF)
@Stable private val tertiaryContainerLightMediumContrast = Color(0xFF507D73)
@Stable private val onTertiaryContainerLightMediumContrast = Color(0xFFFFFFFF)
@Stable private val errorLightMediumContrast = Color(0xFF8C0009)
@Stable private val onErrorLightMediumContrast = Color(0xFFFFFFFF)
@Stable private val errorContainerLightMediumContrast = Color(0xFFDA342E)
@Stable private val onErrorContainerLightMediumContrast = Color(0xFFFFFFFF)
@Stable private val backgroundLightMediumContrast = Color(0xFFFBFAED)
@Stable private val onBackgroundLightMediumContrast = Color(0xFF1B1C15)
@Stable private val surfaceLightMediumContrast = Color(0xFFFBFAED)
@Stable private val onSurfaceLightMediumContrast = Color(0xFF1B1C15)
@Stable private val surfaceVariantLightMediumContrast = Color(0xFFE3E4D3)
@Stable private val onSurfaceVariantLightMediumContrast = Color(0xFF424438)
@Stable private val outlineLightMediumContrast = Color(0xFF5E6053)
@Stable private val outlineVariantLightMediumContrast = Color(0xFF7A7C6E)
@Stable private val scrimLightMediumContrast = Color(0xFF000000)
@Stable private val inverseSurfaceLightMediumContrast = Color(0xFF303129)
@Stable private val inverseOnSurfaceLightMediumContrast = Color(0xFFF2F1E5)
@Stable private val inversePrimaryLightMediumContrast = Color(0xFFBDCE80)
@Stable private val surfaceDimLightMediumContrast = Color(0xFFDBDBCE)
@Stable private val surfaceBrightLightMediumContrast = Color(0xFFFBFAED)
@Stable private val surfaceContainerLowestLightMediumContrast = Color(0xFFFFFFFF)
@Stable private val surfaceContainerLowLightMediumContrast = Color(0xFFF5F4E8)
@Stable private val surfaceContainerLightMediumContrast = Color(0xFFEFEEE2)
@Stable private val surfaceContainerHighLightMediumContrast = Color(0xFFE9E9DC)
@Stable private val surfaceContainerHighestLightMediumContrast = Color(0xFFE4E3D7)

@Stable private val primaryLightHighContrast = Color(0xFF1D2500)
@Stable private val onPrimaryLightHighContrast = Color(0xFFFFFFFF)
@Stable private val primaryContainerLightHighContrast = Color(0xFF3B4806)
@Stable private val onPrimaryContainerLightHighContrast = Color(0xFFFFFFFF)
@Stable private val secondaryLightHighContrast = Color(0xFF1F240E)
@Stable private val onSecondaryLightHighContrast = Color(0xFFFFFFFF)
@Stable private val secondaryContainerLightHighContrast = Color(0xFF40452C)
@Stable private val onSecondaryContainerLightHighContrast = Color(0xFFFFFFFF)
@Stable private val tertiaryLightHighContrast = Color(0xFF002822)
@Stable private val onTertiaryLightHighContrast = Color(0xFFFFFFFF)
@Stable private val tertiaryContainerLightHighContrast = Color(0xFF1C4A42)
@Stable private val onTertiaryContainerLightHighContrast = Color(0xFFFFFFFF)
@Stable private val errorLightHighContrast = Color(0xFF4E0002)
@Stable private val onErrorLightHighContrast = Color(0xFFFFFFFF)
@Stable private val errorContainerLightHighContrast = Color(0xFF8C0009)
@Stable private val onErrorContainerLightHighContrast = Color(0xFFFFFFFF)
@Stable private val backgroundLightHighContrast = Color(0xFFFBFAED)
@Stable private val onBackgroundLightHighContrast = Color(0xFF1B1C15)
@Stable private val surfaceLightHighContrast = Color(0xFFFBFAED)
@Stable private val onSurfaceLightHighContrast = Color(0xFF000000)
@Stable private val surfaceVariantLightHighContrast = Color(0xFFE3E4D3)
@Stable private val onSurfaceVariantLightHighContrast = Color(0xFF23251A)
@Stable private val outlineLightHighContrast = Color(0xFF424438)
@Stable private val outlineVariantLightHighContrast = Color(0xFF424438)
@Stable private val scrimLightHighContrast = Color(0xFF000000)
@Stable private val inverseSurfaceLightHighContrast = Color(0xFF303129)
@Stable private val inverseOnSurfaceLightHighContrast = Color(0xFFFFFFFF)
@Stable private val inversePrimaryLightHighContrast = Color(0xFFE3F4A2)
@Stable private val surfaceDimLightHighContrast = Color(0xFFDBDBCE)
@Stable private val surfaceBrightLightHighContrast = Color(0xFFFBFAED)
@Stable private val surfaceContainerLowestLightHighContrast = Color(0xFFFFFFFF)
@Stable private val surfaceContainerLowLightHighContrast = Color(0xFFF5F4E8)
@Stable private val surfaceContainerLightHighContrast = Color(0xFFEFEEE2)
@Stable private val surfaceContainerHighLightHighContrast = Color(0xFFE9E9DC)
@Stable private val surfaceContainerHighestLightHighContrast = Color(0xFFE4E3D7)

@Stable private val primaryDark = Color(0xFFBDCE80)
@Stable private val onPrimaryDark = Color(0xFF2A3500)
@Stable private val primaryContainerDark = Color(0xFF3F4C0B)
@Stable private val onPrimaryContainerDark = Color(0xFFD9EB99)
@Stable private val secondaryDark = Color(0xFFC4CAA9)
@Stable private val onSecondaryDark = Color(0xFF2E331B)
@Stable private val secondaryContainerDark = Color(0xFF444930)
@Stable private val onSecondaryContainerDark = Color(0xFFE0E6C3)
@Stable private val tertiaryDark = Color(0xFFA1D0C5)
@Stable private val onTertiaryDark = Color(0xFF033730)
@Stable private val tertiaryContainerDark = Color(0xFF214E46)
@Stable private val onTertiaryContainerDark = Color(0xFFBDECE1)
@Stable private val errorDark = Color(0xFFFFB4AB)
@Stable private val onErrorDark = Color(0xFF690005)
@Stable private val errorContainerDark = Color(0xFF93000A)
@Stable private val onErrorContainerDark = Color(0xFFFFDAD6)
@Stable private val backgroundDark = Color(0xFF13140D)
@Stable private val onBackgroundDark = Color(0xFFE4E3D7)
@Stable private val surfaceDark = Color(0xFF13140D)
@Stable private val onSurfaceDark = Color(0xFFE4E3D7)
@Stable private val surfaceVariantDark = Color(0xFF46483C)
@Stable private val onSurfaceVariantDark = Color(0xFFC7C8B8)
@Stable private val outlineDark = Color(0xFF919283)
@Stable private val outlineVariantDark = Color(0xFF46483C)
@Stable private val scrimDark = Color(0xFF000000)
@Stable private val inverseSurfaceDark = Color(0xFFE4E3D7)
@Stable private val inverseOnSurfaceDark = Color(0xFF303129)
@Stable private val inversePrimaryDark = Color(0xFF566422)
@Stable private val surfaceDimDark = Color(0xFF13140D)
@Stable private val surfaceBrightDark = Color(0xFF393A31)
@Stable private val surfaceContainerLowestDark = Color(0xFF0D0F08)
@Stable private val surfaceContainerLowDark = Color(0xFF1B1C15)
@Stable private val surfaceContainerDark = Color(0xFF1F2019)
@Stable private val surfaceContainerHighDark = Color(0xFF292B23)
@Stable private val surfaceContainerHighestDark = Color(0xFF34352D)

@Stable private val primaryDarkMediumContrast = Color(0xFFC2D384)
@Stable private val onPrimaryDarkMediumContrast = Color(0xFF121900)
@Stable private val primaryContainerDarkMediumContrast = Color(0xFF88984F)
@Stable private val onPrimaryContainerDarkMediumContrast = Color(0xFF000000)
@Stable private val secondaryDarkMediumContrast = Color(0xFFC8CEAD)
@Stable private val onSecondaryDarkMediumContrast = Color(0xFF141804)
@Stable private val secondaryContainerDarkMediumContrast = Color(0xFF8E9475)
@Stable private val onSecondaryContainerDarkMediumContrast = Color(0xFF000000)
@Stable private val tertiaryDarkMediumContrast = Color(0xFFA5D4C9)
@Stable private val onTertiaryDarkMediumContrast = Color(0xFF001A16)
@Stable private val tertiaryContainerDarkMediumContrast = Color(0xFF6C998F)
@Stable private val onTertiaryContainerDarkMediumContrast = Color(0xFF000000)
@Stable private val errorDarkMediumContrast = Color(0xFFFFBAB1)
@Stable private val onErrorDarkMediumContrast = Color(0xFF370001)
@Stable private val errorContainerDarkMediumContrast = Color(0xFFFF5449)
@Stable private val onErrorContainerDarkMediumContrast = Color(0xFF000000)
@Stable private val backgroundDarkMediumContrast = Color(0xFF13140D)
@Stable private val onBackgroundDarkMediumContrast = Color(0xFFE4E3D7)
@Stable private val surfaceDarkMediumContrast = Color(0xFF13140D)
@Stable private val onSurfaceDarkMediumContrast = Color(0xFFFCFBEF)
@Stable private val surfaceVariantDarkMediumContrast = Color(0xFF46483C)
@Stable private val onSurfaceVariantDarkMediumContrast = Color(0xFFCBCCBC)
@Stable private val outlineDarkMediumContrast = Color(0xFFA3A495)
@Stable private val outlineVariantDarkMediumContrast = Color(0xFF838476)
@Stable private val scrimDarkMediumContrast = Color(0xFF000000)
@Stable private val inverseSurfaceDarkMediumContrast = Color(0xFFE4E3D7)
@Stable private val inverseOnSurfaceDarkMediumContrast = Color(0xFF292B23)
@Stable private val inversePrimaryDarkMediumContrast = Color(0xFF404D0C)
@Stable private val surfaceDimDarkMediumContrast = Color(0xFF13140D)
@Stable private val surfaceBrightDarkMediumContrast = Color(0xFF393A31)
@Stable private val surfaceContainerLowestDarkMediumContrast = Color(0xFF0D0F08)
@Stable private val surfaceContainerLowDarkMediumContrast = Color(0xFF1B1C15)
@Stable private val surfaceContainerDarkMediumContrast = Color(0xFF1F2019)
@Stable private val surfaceContainerHighDarkMediumContrast = Color(0xFF292B23)
@Stable private val surfaceContainerHighestDarkMediumContrast = Color(0xFF34352D)

@Stable private val primaryDarkHighContrast = Color(0xFFF8FFD3)
@Stable private val onPrimaryDarkHighContrast = Color(0xFF000000)
@Stable private val primaryContainerDarkHighContrast = Color(0xFFC2D384)
@Stable private val onPrimaryContainerDarkHighContrast = Color(0xFF000000)
@Stable private val secondaryDarkHighContrast = Color(0xFFF9FEDB)
@Stable private val onSecondaryDarkHighContrast = Color(0xFF000000)
@Stable private val secondaryContainerDarkHighContrast = Color(0xFFC8CEAD)
@Stable private val onSecondaryContainerDarkHighContrast = Color(0xFF000000)
@Stable private val tertiaryDarkHighContrast = Color(0xFFECFFF9)
@Stable private val onTertiaryDarkHighContrast = Color(0xFF000000)
@Stable private val tertiaryContainerDarkHighContrast = Color(0xFFA5D4C9)
@Stable private val onTertiaryContainerDarkHighContrast = Color(0xFF000000)
@Stable private val errorDarkHighContrast = Color(0xFFFFF9F9)
@Stable private val onErrorDarkHighContrast = Color(0xFF000000)
@Stable private val errorContainerDarkHighContrast = Color(0xFFFFBAB1)
@Stable private val onErrorContainerDarkHighContrast = Color(0xFF000000)
@Stable private val backgroundDarkHighContrast = Color(0xFF13140D)
@Stable private val onBackgroundDarkHighContrast = Color(0xFFE4E3D7)
@Stable private val surfaceDarkHighContrast = Color(0xFF13140D)
@Stable private val onSurfaceDarkHighContrast = Color(0xFFFFFFFF)
@Stable private val surfaceVariantDarkHighContrast = Color(0xFF46483C)
@Stable private val onSurfaceVariantDarkHighContrast = Color(0xFFFCFCEB)
@Stable private val outlineDarkHighContrast = Color(0xFFCBCCBC)
@Stable private val outlineVariantDarkHighContrast = Color(0xFFCBCCBC)
@Stable private val scrimDarkHighContrast = Color(0xFF000000)
@Stable private val inverseSurfaceDarkHighContrast = Color(0xFFE4E3D7)
@Stable private val inverseOnSurfaceDarkHighContrast = Color(0xFF000000)
@Stable private val inversePrimaryDarkHighContrast = Color(0xFF242E00)
@Stable private val surfaceDimDarkHighContrast = Color(0xFF13140D)
@Stable private val surfaceBrightDarkHighContrast = Color(0xFF393A31)
@Stable private val surfaceContainerLowestDarkHighContrast = Color(0xFF0D0F08)
@Stable private val surfaceContainerLowDarkHighContrast = Color(0xFF1B1C15)
@Stable private val surfaceContainerDarkHighContrast = Color(0xFF1F2019)
@Stable private val surfaceContainerHighDarkHighContrast = Color(0xFF292B23)
@Stable private val surfaceContainerHighestDarkHighContrast = Color(0xFF34352D)

private val lightScheme = lightColorScheme(
  primary = primaryLight,
  onPrimary = onPrimaryLight,
  primaryContainer = primaryContainerLight,
  onPrimaryContainer = onPrimaryContainerLight,
  secondary = secondaryLight,
  onSecondary = onSecondaryLight,
  secondaryContainer = secondaryContainerLight,
  onSecondaryContainer = onSecondaryContainerLight,
  tertiary = tertiaryLight,
  onTertiary = onTertiaryLight,
  tertiaryContainer = tertiaryContainerLight,
  onTertiaryContainer = onTertiaryContainerLight,
  error = errorLight,
  onError = onErrorLight,
  errorContainer = errorContainerLight,
  onErrorContainer = onErrorContainerLight,
  background = backgroundLight,
  onBackground = onBackgroundLight,
  surface = surfaceLight,
  onSurface = onSurfaceLight,
  surfaceVariant = surfaceVariantLight,
  onSurfaceVariant = onSurfaceVariantLight,
  outline = outlineLight,
  outlineVariant = outlineVariantLight,
  scrim = scrimLight,
  inverseSurface = inverseSurfaceLight,
  inverseOnSurface = inverseOnSurfaceLight,
  inversePrimary = inversePrimaryLight,
  surfaceDim = surfaceDimLight,
  surfaceBright = surfaceBrightLight,
  surfaceContainerLowest = surfaceContainerLowestLight,
  surfaceContainerLow = surfaceContainerLowLight,
  surfaceContainer = surfaceContainerLight,
  surfaceContainerHigh = surfaceContainerHighLight,
  surfaceContainerHighest = surfaceContainerHighestLight,
)

private val darkScheme = darkColorScheme(
  primary = primaryDark,
  onPrimary = onPrimaryDark,
  primaryContainer = primaryContainerDark,
  onPrimaryContainer = onPrimaryContainerDark,
  secondary = secondaryDark,
  onSecondary = onSecondaryDark,
  secondaryContainer = secondaryContainerDark,
  onSecondaryContainer = onSecondaryContainerDark,
  tertiary = tertiaryDark,
  onTertiary = onTertiaryDark,
  tertiaryContainer = tertiaryContainerDark,
  onTertiaryContainer = onTertiaryContainerDark,
  error = errorDark,
  onError = onErrorDark,
  errorContainer = errorContainerDark,
  onErrorContainer = onErrorContainerDark,
  background = backgroundDark,
  onBackground = onBackgroundDark,
  surface = surfaceDark,
  onSurface = onSurfaceDark,
  surfaceVariant = surfaceVariantDark,
  onSurfaceVariant = onSurfaceVariantDark,
  outline = outlineDark,
  outlineVariant = outlineVariantDark,
  scrim = scrimDark,
  inverseSurface = inverseSurfaceDark,
  inverseOnSurface = inverseOnSurfaceDark,
  inversePrimary = inversePrimaryDark,
  surfaceDim = surfaceDimDark,
  surfaceBright = surfaceBrightDark,
  surfaceContainerLowest = surfaceContainerLowestDark,
  surfaceContainerLow = surfaceContainerLowDark,
  surfaceContainer = surfaceContainerDark,
  surfaceContainerHigh = surfaceContainerHighDark,
  surfaceContainerHighest = surfaceContainerHighestDark,
)

private val mediumContrastLightColorScheme = lightColorScheme(
  primary = primaryLightMediumContrast,
  onPrimary = onPrimaryLightMediumContrast,
  primaryContainer = primaryContainerLightMediumContrast,
  onPrimaryContainer = onPrimaryContainerLightMediumContrast,
  secondary = secondaryLightMediumContrast,
  onSecondary = onSecondaryLightMediumContrast,
  secondaryContainer = secondaryContainerLightMediumContrast,
  onSecondaryContainer = onSecondaryContainerLightMediumContrast,
  tertiary = tertiaryLightMediumContrast,
  onTertiary = onTertiaryLightMediumContrast,
  tertiaryContainer = tertiaryContainerLightMediumContrast,
  onTertiaryContainer = onTertiaryContainerLightMediumContrast,
  error = errorLightMediumContrast,
  onError = onErrorLightMediumContrast,
  errorContainer = errorContainerLightMediumContrast,
  onErrorContainer = onErrorContainerLightMediumContrast,
  background = backgroundLightMediumContrast,
  onBackground = onBackgroundLightMediumContrast,
  surface = surfaceLightMediumContrast,
  onSurface = onSurfaceLightMediumContrast,
  surfaceVariant = surfaceVariantLightMediumContrast,
  onSurfaceVariant = onSurfaceVariantLightMediumContrast,
  outline = outlineLightMediumContrast,
  outlineVariant = outlineVariantLightMediumContrast,
  scrim = scrimLightMediumContrast,
  inverseSurface = inverseSurfaceLightMediumContrast,
  inverseOnSurface = inverseOnSurfaceLightMediumContrast,
  inversePrimary = inversePrimaryLightMediumContrast,
  surfaceDim = surfaceDimLightMediumContrast,
  surfaceBright = surfaceBrightLightMediumContrast,
  surfaceContainerLowest = surfaceContainerLowestLightMediumContrast,
  surfaceContainerLow = surfaceContainerLowLightMediumContrast,
  surfaceContainer = surfaceContainerLightMediumContrast,
  surfaceContainerHigh = surfaceContainerHighLightMediumContrast,
  surfaceContainerHighest = surfaceContainerHighestLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
  primary = primaryLightHighContrast,
  onPrimary = onPrimaryLightHighContrast,
  primaryContainer = primaryContainerLightHighContrast,
  onPrimaryContainer = onPrimaryContainerLightHighContrast,
  secondary = secondaryLightHighContrast,
  onSecondary = onSecondaryLightHighContrast,
  secondaryContainer = secondaryContainerLightHighContrast,
  onSecondaryContainer = onSecondaryContainerLightHighContrast,
  tertiary = tertiaryLightHighContrast,
  onTertiary = onTertiaryLightHighContrast,
  tertiaryContainer = tertiaryContainerLightHighContrast,
  onTertiaryContainer = onTertiaryContainerLightHighContrast,
  error = errorLightHighContrast,
  onError = onErrorLightHighContrast,
  errorContainer = errorContainerLightHighContrast,
  onErrorContainer = onErrorContainerLightHighContrast,
  background = backgroundLightHighContrast,
  onBackground = onBackgroundLightHighContrast,
  surface = surfaceLightHighContrast,
  onSurface = onSurfaceLightHighContrast,
  surfaceVariant = surfaceVariantLightHighContrast,
  onSurfaceVariant = onSurfaceVariantLightHighContrast,
  outline = outlineLightHighContrast,
  outlineVariant = outlineVariantLightHighContrast,
  scrim = scrimLightHighContrast,
  inverseSurface = inverseSurfaceLightHighContrast,
  inverseOnSurface = inverseOnSurfaceLightHighContrast,
  inversePrimary = inversePrimaryLightHighContrast,
  surfaceDim = surfaceDimLightHighContrast,
  surfaceBright = surfaceBrightLightHighContrast,
  surfaceContainerLowest = surfaceContainerLowestLightHighContrast,
  surfaceContainerLow = surfaceContainerLowLightHighContrast,
  surfaceContainer = surfaceContainerLightHighContrast,
  surfaceContainerHigh = surfaceContainerHighLightHighContrast,
  surfaceContainerHighest = surfaceContainerHighestLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
  primary = primaryDarkMediumContrast,
  onPrimary = onPrimaryDarkMediumContrast,
  primaryContainer = primaryContainerDarkMediumContrast,
  onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
  secondary = secondaryDarkMediumContrast,
  onSecondary = onSecondaryDarkMediumContrast,
  secondaryContainer = secondaryContainerDarkMediumContrast,
  onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
  tertiary = tertiaryDarkMediumContrast,
  onTertiary = onTertiaryDarkMediumContrast,
  tertiaryContainer = tertiaryContainerDarkMediumContrast,
  onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
  error = errorDarkMediumContrast,
  onError = onErrorDarkMediumContrast,
  errorContainer = errorContainerDarkMediumContrast,
  onErrorContainer = onErrorContainerDarkMediumContrast,
  background = backgroundDarkMediumContrast,
  onBackground = onBackgroundDarkMediumContrast,
  surface = surfaceDarkMediumContrast,
  onSurface = onSurfaceDarkMediumContrast,
  surfaceVariant = surfaceVariantDarkMediumContrast,
  onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
  outline = outlineDarkMediumContrast,
  outlineVariant = outlineVariantDarkMediumContrast,
  scrim = scrimDarkMediumContrast,
  inverseSurface = inverseSurfaceDarkMediumContrast,
  inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
  inversePrimary = inversePrimaryDarkMediumContrast,
  surfaceDim = surfaceDimDarkMediumContrast,
  surfaceBright = surfaceBrightDarkMediumContrast,
  surfaceContainerLowest = surfaceContainerLowestDarkMediumContrast,
  surfaceContainerLow = surfaceContainerLowDarkMediumContrast,
  surfaceContainer = surfaceContainerDarkMediumContrast,
  surfaceContainerHigh = surfaceContainerHighDarkMediumContrast,
  surfaceContainerHighest = surfaceContainerHighestDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
  primary = primaryDarkHighContrast,
  onPrimary = onPrimaryDarkHighContrast,
  primaryContainer = primaryContainerDarkHighContrast,
  onPrimaryContainer = onPrimaryContainerDarkHighContrast,
  secondary = secondaryDarkHighContrast,
  onSecondary = onSecondaryDarkHighContrast,
  secondaryContainer = secondaryContainerDarkHighContrast,
  onSecondaryContainer = onSecondaryContainerDarkHighContrast,
  tertiary = tertiaryDarkHighContrast,
  onTertiary = onTertiaryDarkHighContrast,
  tertiaryContainer = tertiaryContainerDarkHighContrast,
  onTertiaryContainer = onTertiaryContainerDarkHighContrast,
  error = errorDarkHighContrast,
  onError = onErrorDarkHighContrast,
  errorContainer = errorContainerDarkHighContrast,
  onErrorContainer = onErrorContainerDarkHighContrast,
  background = backgroundDarkHighContrast,
  onBackground = onBackgroundDarkHighContrast,
  surface = surfaceDarkHighContrast,
  onSurface = onSurfaceDarkHighContrast,
  surfaceVariant = surfaceVariantDarkHighContrast,
  onSurfaceVariant = onSurfaceVariantDarkHighContrast,
  outline = outlineDarkHighContrast,
  outlineVariant = outlineVariantDarkHighContrast,
  scrim = scrimDarkHighContrast,
  inverseSurface = inverseSurfaceDarkHighContrast,
  inverseOnSurface = inverseOnSurfaceDarkHighContrast,
  inversePrimary = inversePrimaryDarkHighContrast,
  surfaceDim = surfaceDimDarkHighContrast,
  surfaceBright = surfaceBrightDarkHighContrast,
  surfaceContainerLowest = surfaceContainerLowestDarkHighContrast,
  surfaceContainerLow = surfaceContainerLowDarkHighContrast,
  surfaceContainer = surfaceContainerDarkHighContrast,
  surfaceContainerHigh = surfaceContainerHighDarkHighContrast,
  surfaceContainerHighest = surfaceContainerHighestDarkHighContrast,
)

/** @param dynamicColor Available on Android 12+ */
@Composable
fun AppTheme(
  darkTheme: Boolean = isSystemInDarkTheme(),
  dynamicColor: Boolean = true,
  content: @Composable () -> Unit
) {
  val colorScheme = when {
    dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
      val context = LocalContext.current
      if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
    }

    darkTheme -> darkScheme
    else -> lightScheme
  }

  val view = LocalView.current
  if (!view.isInEditMode) {
    SideEffect {
      val window = (view.context as Activity).window
      window.statusBarColor = colorScheme.primary.toArgb()
      WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
    }
  }

  MaterialTheme(
    colorScheme = colorScheme,
    typography = AppTypography,
    content = content,
  )
}
