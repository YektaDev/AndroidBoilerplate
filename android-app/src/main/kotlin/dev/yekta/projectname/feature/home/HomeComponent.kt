package dev.yekta.projectname.feature.home

import dev.yekta.projectname.app.AppContext

interface HomeComponent : AppContext {
  fun onAboutClick()
}

fun homeComponent(
  context: AppContext,
  onAboutNavigation: () -> Unit,
): HomeComponent = HomeComponentImp(
  context = context,
  onAboutNavigation = onAboutNavigation,
)

private class HomeComponentImp(
  context: AppContext,
  private val onAboutNavigation: () -> Unit,
) : HomeComponent, AppContext by context {
  override fun onAboutClick() = onAboutNavigation()
}
