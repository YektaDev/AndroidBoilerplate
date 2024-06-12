import java.io.FileNotFoundException
import java.util.Properties

val id = "dev.yekta.projectname"

plugins {
  alias(libs.plugins.android.application)
  alias(libs.plugins.jetbrains.kotlin.android)
  alias(libs.plugins.jetbrains.kotlin.compose)
  alias(libs.plugins.jetbrains.kotlin.serialization)
}

fun Project.localProp(key: String) = with(Properties()) {
  load(project.rootProject.file("local.properties").inputStream())
  getProperty(key, null) ?: throw NoSuchElementException("Local key \"$key\" is not set in root properties.")
}

android {
  namespace = id
  compileSdk = libs.versions.maxsdk.get().toInt()

  defaultConfig {
    applicationId = id
    minSdk = libs.versions.minsdk.get().toInt()
    targetSdk = libs.versions.maxsdk.get().toInt()
    versionCode = libs.versions.versionCode.get().toInt()
    versionName = libs.versions.versionName.get()

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    vectorDrawables {
      useSupportLibrary = true
    }
  }

  signingConfigs {
    create("release") {
      val releaseKeyStore = File(localProp("RELEASE_KEYSTORE_FILE"))
      if (!releaseKeyStore.exists())
        throw FileNotFoundException("Release keystore not found at ${releaseKeyStore.absolutePath}.")
      storeFile = releaseKeyStore
      storePassword = localProp("RELEASE_KEYSTORE_PWD")
      keyAlias = localProp("RELEASE_KEY_ALIAS")
      keyPassword = localProp("RELEASE_KEY_PWD")
      enableV1Signing = true
      enableV2Signing = true
      enableV3Signing = true
      enableV4Signing = true
    }
  }
  buildTypes {
    release {
      isMinifyEnabled = true
      isShrinkResources = true
      signingConfig = signingConfigs["release"]
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
    debug {
      isMinifyEnabled = false
      isShrinkResources = false
      versionNameSuffix = "-dev"
      applicationIdSuffix = ".debug"
    }
  }
  kotlinOptions.jvmTarget = "17"
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
  }

  buildFeatures.compose = true
  composeOptions.kotlinCompilerExtensionVersion = libs.versions.composeCompiler.get()

  testOptions.unitTests.all { it.useJUnitPlatform() }

  packaging.resources.excludes.addAll(
    listOf(
      "META-INF/AL2.0", "META-INF/LGPL2.1",
      "META-INF/*.version",
      "kotlin-tooling-metadata.json",
      "DebugProbesKt.bin", // https://github.com/Kotlin/kotlinx.coroutines/issues/2274
      // Just a workaround for incremental compilation:
      // https://github.com/Kotlin/kotlinx.coroutines/issues/3668#issuecomment-1462442235
      "META-INF/versions/9/previous-compilation-data.bin",
    ),
  )
}

dependencies {
  implementation(libs.androidx.core.ktx)
  implementation(libs.androidx.core.splashscreen)
  implementation(libs.androidx.lifecycle.runtime.ktx)
  implementation(libs.androidx.activity.compose)
  implementation(platform(libs.androidx.compose.bom))
  implementation(libs.androidx.ui)
  implementation(libs.androidx.ui.graphics)
  implementation(libs.androidx.ui.tooling.preview)
  implementation(libs.androidx.material3)
  implementation(libs.kotlinx.coroutines.core)
  implementation(libs.kotlinx.serialization.json)
  implementation(libs.kotlinx.collections.immutable)
  implementation(libs.kotlinx.datetime)
  implementation(libs.ktor.client.core)
  implementation(libs.ktor.client.okhttp)
  implementation(libs.coil)
  implementation(libs.coil.compose)
  implementation(libs.decompose)
  implementation(libs.decompose.compose)

  testImplementation(libs.junit)
  testImplementation(libs.leakcanary)
  testImplementation(libs.kotest)
  androidTestImplementation(libs.androidx.junit)
  androidTestImplementation(libs.androidx.espresso.core)
  androidTestImplementation(platform(libs.androidx.compose.bom))
  androidTestImplementation(libs.androidx.ui.test.junit4)
  debugImplementation(libs.androidx.ui.tooling)
  debugImplementation(libs.androidx.ui.test.manifest)
}
