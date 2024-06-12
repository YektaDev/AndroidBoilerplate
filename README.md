# Personal Opinionated Android Project Boilerplate - 2024

## Features

+ Internet permission by default
+ Copyright comments by default
+ Version catalog by default
+ Complete Git config
+ Complete Gradle tuning
+ The most up-to-date Activity setup (+ splashscreen)
+ Up-to-date dependencies + Kotlin 2.0
+ Opinionated `.editorconfig`
+ KMP-ready default dependencies and configurations _(except the module structure, left to the user
  to migrate when needed)_
+ Aggressive R8 configured
+ Simplified release and versioning
+ Embedded `Vazirmatn` variable font by default (it uses `Roboto` for Latin, alongside offering a
  polished and standard look and feel for Persian/Arabic glyphs)
+ Comes with:
  + Compose
  + Kotlin Serialization + JSON Serialization
  + Kotlin Coroutines
  + Immutable Collections (specially useful in conjunction with Compose)
  + Ktor
  + Coil
  + LeakCanary

## Setup

### 1. Project Properties

1. Search and replace `projectname` and `PROJECT_NAME` throughout the project.
2. From source directories, rename `dev.yekta.projectname` to the package name.
3. Configure xml files withing `res` directory (including icon & colors).

### 2. Release Config

Append the following lines into the root `local.properties` (create if doesn't exist):

```properties
RELEASE_KEYSTORE_FILE=keystore_path
RELEASE_KEYSTORE_PWD=keystore_pass
RELEASE_KEY_ALIAS=key_alias
RELEASE_KEY_PWD=key_pass
```

### 3. Theming

Head over to the
[Material Theme Builder](https://material-foundation.github.io/material-theme-builder/) and export
the desired theme for the app.

### 4. Happy Crafting!
