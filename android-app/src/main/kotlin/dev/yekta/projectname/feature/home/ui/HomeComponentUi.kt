package dev.yekta.projectname.feature.home.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.yekta.projectname.feature.home.HomeComponent
import dev.yekta.projectname.ui.theme.Theme

@Composable
fun HomeComponentUi(component: HomeComponent, modifier: Modifier = Modifier) {
  Column(modifier.safeContentPadding()) {
    Text(text = "Hello World!", style = Theme.typography.headlineLarge)
    Text(text = "It's a great day, isn't it?")
  }
}
