/*
 * Unpublished Copyright 2024 Ali Khaleqi Yekta, All Rights Reserved.
 */

package dev.yekta.projectname.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.yekta.projectname.ui.theme.Theme

@Composable
fun Root() = Column(Modifier.safeContentPadding().fillMaxSize()) {
  Text(text = "Hello World!", style = Theme.typography.headlineLarge)
  Text(text = "It's a great day, isn't it?")
}

@Preview(showBackground = true)
@Composable
private fun RootPreview() {
  Root()
}
