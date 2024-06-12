package dev.yekta.projectname.feature.root

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.pop
import com.arkivanov.decompose.router.stack.pushNew
import com.arkivanov.decompose.value.Value
import dev.yekta.projectname.app.AppContext
import dev.yekta.projectname.feature.about.AboutComponent
import dev.yekta.projectname.feature.about.aboutComponent
import dev.yekta.projectname.feature.home.HomeComponent
import dev.yekta.projectname.feature.home.homeComponent
import dev.yekta.projectname.feature.root.RootComponent.Child
import dev.yekta.projectname.feature.root.RootComponent.Child.AboutChild
import dev.yekta.projectname.feature.root.RootComponent.Child.HomeChild
import dev.yekta.projectname.feature.root.RootComponentImp.Config.About
import dev.yekta.projectname.feature.root.RootComponentImp.Config.Home
import kotlinx.serialization.Serializable

interface RootComponent : AppContext {
  val stack: Value<ChildStack<*, Child>>

  fun onBackClick()

  sealed class Child {
    class HomeChild(val component: HomeComponent) : Child()
    class AboutChild(val component: AboutComponent) : Child()
  }
}

fun rootComponent(
  context: AppContext,
): RootComponent = RootComponentImp(context)

private class RootComponentImp(
  context: AppContext,
) : RootComponent, AppContext by context {
  private val navigation = StackNavigation<Config>()
  override val stack: Value<ChildStack<*, Child>> =
    childStack(
      source = navigation,
      serializer = Config.serializer(),
      initialConfiguration = Home,
      handleBackButton = true,
      childFactory = ::child,
    )

  override fun onBackClick() = navigation.pop()

  private fun child(config: Config, context: AppContext): Child = when (config) {
    is Home -> HomeChild(
      homeComponent(
        context = context,
        onAboutNavigation = { navigation.pushNew(About) },
      ),
    )

    is About -> AboutChild(
      aboutComponent(
        context = context,
      ),
    )
  }

  @Serializable
  private sealed interface Config {
    @Serializable
    data object Home : Config

    @Serializable
    data object About : Config
  }
}
