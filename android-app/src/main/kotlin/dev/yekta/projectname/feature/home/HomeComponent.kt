package dev.yekta.projectname.feature.home

import dev.yekta.projectname.app.AppContext

interface HomeComponent : AppContext

fun homeComponent(
  context: AppContext,
): HomeComponent = HomeComponentImp(
  context = context,
)

private class HomeComponentImp(
  context: AppContext,
) : HomeComponent, AppContext by context
