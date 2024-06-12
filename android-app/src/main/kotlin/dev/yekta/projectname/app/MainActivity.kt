package dev.yekta.projectname.app

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import dev.yekta.projectname.ui.Root
import dev.yekta.projectname.ui.theme.AppTheme
import android.os.Bundle

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    installSplashScreen()
    enableEdgeToEdge()

    super.onCreate(savedInstanceState)

    setContent {
      AppTheme { Root() }
    }
  }
}
