package dev.yekta.projectname.feature.about

import dev.yekta.projectname.app.AppContext

interface AboutComponent : AppContext

fun aboutComponent(
  context: AppContext,
): AboutComponent = AboutComponentImp(context)

private class AboutComponentImp(
  context: AppContext,
) : AboutComponent, AppContext by context
