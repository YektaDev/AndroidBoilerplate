package dev.yekta.projectname.feature.about.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContent
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.core.graphics.drawable.toBitmap
import dev.yekta.projectname.feature.about.AboutComponent
import dev.yekta.projectname.ui.theme.Theme
import android.graphics.Bitmap

@Composable
fun AboutComponentUi(component: AboutComponent, modifier: Modifier = Modifier) {
  val bitmap = remember {
    component.activity.packageManager
      .getApplicationIcon(component.activity.packageName)
      .toBitmap(config = Bitmap.Config.ARGB_8888)
      .asImageBitmap()
  }

  Column(modifier.safeContentPadding()) {
    Spacer(Modifier.weight(1f))

    Text(
      text = "PROJECT_NAME",
      modifier = Modifier
        .fillMaxWidth()
        .windowInsetsPadding(WindowInsets.safeContent.only(WindowInsetsSides.Top))
        .padding(vertical = 16f.dp),
      style = Theme.typography.headlineLarge.copy(
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.ExtraBold,
      ),
    )

    Spacer(Modifier.weight(3f))

    Image(
      bitmap = bitmap,
      contentDescription = "App Logo",
      modifier = Modifier
        .size(100f.dp)
        .padding(8f.dp),
    )

    Spacer(Modifier.weight(1f))
  }
}
