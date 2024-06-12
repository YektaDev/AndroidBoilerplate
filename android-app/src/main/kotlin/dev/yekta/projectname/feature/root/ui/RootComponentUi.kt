package dev.yekta.projectname.feature.root.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.extensions.compose.stack.Children
import com.arkivanov.decompose.extensions.compose.stack.animation.fade
import com.arkivanov.decompose.extensions.compose.stack.animation.plus
import com.arkivanov.decompose.extensions.compose.stack.animation.predictiveback.predictiveBackAnimation
import com.arkivanov.decompose.extensions.compose.stack.animation.slide
import com.arkivanov.decompose.extensions.compose.stack.animation.stackAnimation
import dev.yekta.projectname.feature.about.ui.AboutComponentUi
import dev.yekta.projectname.feature.home.ui.HomeComponentUi
import dev.yekta.projectname.feature.root.RootComponent
import dev.yekta.projectname.ui.theme.Theme

@OptIn(ExperimentalDecomposeApi::class)
@Composable
internal fun RootComponentUi(component: RootComponent, modifier: Modifier = Modifier) =
  CompositionLocalProvider(LocalContentColor provides Theme.colorScheme.onSurface) {
    Children(
      modifier = modifier.fillMaxSize(),
      stack = component.stack,
      animation = predictiveBackAnimation(
        backHandler = component.backHandler,
        fallbackAnimation = stackAnimation(fade() + slide()),
        onBack = component::onBackClick,
      ),
    ) {
      when (val child = it.instance) {
        is RootComponent.Child.HomeChild -> HomeComponentUi(child.component)
        // Other screens will be added here...
        is RootComponent.Child.AboutChild -> AboutComponentUi(child.component)
      }
    }
  }
