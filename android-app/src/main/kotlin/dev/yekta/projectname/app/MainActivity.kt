package dev.yekta.projectname.app

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import dev.yekta.projectname.feature.root.rootComponent
import dev.yekta.projectname.feature.root.ui.RootComponentUi
import dev.yekta.projectname.ui.theme.AppTheme
import android.os.Bundle

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    installSplashScreen()
    enableEdgeToEdge()

    super.onCreate(savedInstanceState)

    val root = rootComponent(appContext())

    setContent {
      AppTheme { RootComponentUi(root) }
    }
  }
}
