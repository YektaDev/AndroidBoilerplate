# ✴️ An Opinionated Android Project Boilerplate - 2024

## Features

+ The most up-to-date Activity setup (+ splashscreen)
+ Up-to-date dependencies + Kotlin 2.0
+ KMP-ready default dependencies and configurations _(except the module structure, left to the user
  to migrate when needed)_
+ Aggressive R8 configured
+ Simplified release and versioning
+ Embedded `Vazirmatn` variable font by default (it uses `Roboto` for Latin, alongside offering a
  polished and standard look and feel for Persian/Arabic glyphs)
+ Opinionated code formatting rules (`.editorconfig`), most notably 2-space indentations
+ Internet permission by default
+ Version catalog by default
+ Git configured
+ Gradle "tuned"
+ Decompose for navigation
  + Custom `AppContext` by default
  + Predictive back gesture enabled by default
  + Default component tree:
    ```text
            RootComponent
             /         \
    HomeComponent     AboutComponent
    ```
+ Comes with:
  + Compose Runtime + Compose UI + Material 3
  + Kotlin Serialization + JSON Serialization
  + Kotlin Coroutines
  + Kotlin Immutable Collections (specially useful in conjunction with Compose)
  + Ktor
  + Coil
  + Decompose
  + LeakCanary

## Setup

### 1. 📝 Project Properties

1. Search and replace `projectname` and `PROJECT_NAME` throughout the project.
2. From source directories, rename `dev/yekta/projectname` to the package name.
3. Configure XML files within `res` directory (including icon & colors).

### 2. 🔧 Release Config

Append the following lines into the root `local.properties` (create if doesn't exist):

```properties
RELEASE_KEYSTORE_FILE=keystore_path
RELEASE_KEYSTORE_PWD=keystore_pass
RELEASE_KEY_ALIAS=key_alias
RELEASE_KEY_PWD=key_pass
```

### 3. 🎨 Theming

Head over to the
[Material Theme Builder](https://material-foundation.github.io/material-theme-builder/) and export
the desired theme for the app.

### 4. 🚀 Happy Crafting!

_Note: If you don't plan to use Decompose and just want a minimal boilerplate, you may use the repo
before the `34689c45` commit._
