plugins {
  alias(libs.plugins.android.application) apply false
  alias(libs.plugins.jetbrains.kotlin.android) apply false
  alias(libs.plugins.jetbrains.kotlin.compose) apply false
  alias(libs.plugins.jetbrains.kotlin.serialization) apply false
}

tasks.register("clean", Delete::class) {
  delete(rootProject.layout.buildDirectory)
}
