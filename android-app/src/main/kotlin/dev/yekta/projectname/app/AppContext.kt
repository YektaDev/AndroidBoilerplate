package dev.yekta.projectname.app

import androidx.activity.ComponentActivity
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.ComponentContextFactory
import com.arkivanov.decompose.GenericComponentContext
import com.arkivanov.decompose.defaultComponentContext
import com.arkivanov.essenty.backhandler.BackHandlerOwner
import com.arkivanov.essenty.instancekeeper.InstanceKeeperOwner
import com.arkivanov.essenty.lifecycle.LifecycleOwner
import com.arkivanov.essenty.lifecycle.doOnDestroy
import com.arkivanov.essenty.statekeeper.StateKeeperOwner
import io.ktor.client.*
import io.ktor.client.engine.okhttp.*
import android.app.Activity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel

interface AppContext : GenericComponentContext<AppContext> {
  val version: String
  val activity: Activity
  val coroutineScope: CoroutineScope
  val httpClient: HttpClient
  // Other dependencies can be added here
}

internal fun ComponentActivity.appContext(): AppContext {
  val version = runCatching {
    packageManager.getPackageInfo(packageName, 0).versionName
  }.getOrNull() ?: "Unknown Version"

  val httpClient = HttpClient(OkHttp)

  return AppContextImp(
    version = version,
    activity = this,
    httpClient = httpClient,
    componentContext = defaultComponentContext(),
  )
}

private class AppContextImp(
  override val version: String,
  override val activity: Activity,
  override val httpClient: HttpClient,
  componentContext: ComponentContext,
) : AppContext,
  LifecycleOwner by componentContext,
  StateKeeperOwner by componentContext,
  InstanceKeeperOwner by componentContext,
  BackHandlerOwner by componentContext {

  override val coroutineScope: CoroutineScope = CoroutineScope(SupervisorJob()).also { doOnDestroy(it::cancel) }
  override val componentContextFactory: ComponentContextFactory<AppContext> =
    ComponentContextFactory { lifecycle, stateKeeper, instanceKeeper, backHandler ->
      val context = componentContext.componentContextFactory(lifecycle, stateKeeper, instanceKeeper, backHandler)
      AppContextImp(
        version = version,
        activity = activity,
        httpClient = httpClient,
        componentContext = context,
      )
    }
}
