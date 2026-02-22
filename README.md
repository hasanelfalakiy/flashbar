<p align="center">
  <img src="./img/banner_flashbar.png" alt="app_banner"/>
</p>

<h2 align="center"><b>flashbar</b></h2>
<p align="center">
<b>Alternative of snackbar and toast, powerful, customizable, beautiful and easy to use</b>
<p><br>

<p align="center">
<!-- Latest release -->
<img src="https://img.shields.io/github/v/release/hasanelfalakiy/flashbar?include_releases&label=latest%20release&style=for-the-badge&color=brightgreen" alt="latest_release"/>
<!-- Jitpack -->
[![](https://jitpack.io/v/hasanelfalakiy/flashbar.svg)](https://jitpack.io/#hasanelfalakiy/flashbar)
<!-- Github Repo size -->
<img src="https://img.shields.io/github/repo-size/hasanelfalakiy/flashbar?style=for-the-badge">
<!-- Build with Kotlin -->
<img src="https://img.shields.io/badge/Kotlin-C116E3?&style=for-the-badge&logo=kotlin&logoColor=white" alt="build_with_kotlin">
<!-- License -->
<img src="https://img.shields.io/github/license/hasanelfalakiy/flashbar?color=blue&style=for-the-badge&color=brightgreen" alt="License">
</p>

## Read in Indonesia

- [Indonesia](./README_IN.md)

## About Flashbar
Library for displaying messages as an alternative to snackbars and toast, which is powerful, easy to customize, and easy to use.
Based on [Flashbar (AndroidIDE)](https://github.com/AndroidIDEOfficial/AndroidIDE/tree/dev/utilities%2Fflashbar) that based on [Flashbar (aritraroy)](https://github.com/aritraroy/Flashbar)

## Configuration

1. Put this code in settings.gradle.kts (root kotlin dsl) in ```repositories``` block
```kotlin
  dependencyResolutionManagement {
    repositories {
      // example
      maven {
        url = uri("https://jitpack.io")
      }
    }
  }
```
If using groovy dsl
```groovy
  repositories {
    maven { url 'https://jitpack.io' }
  }
```
2. Put dependencies into build.gradle.kts (app/build.gradle.kts kotlin dsl)
inside the ```dependencies``` block

```kotlin
implementation("com.github.hasanelfalakiy:flashbar:${version}")
```
if using groovy dsl
```groovy
implementation 'com.github.hasanelfalakiy:flashbar:${version}'
```

## Read Dokka Documentation

- [Documentation](https://hasanelfalakiy.github.io/flashbar/)

## Usage

### 1. Basic Usage (Activity/View)
```kotlin
Flashbar.Builder(this)
    .gravity(Flashbar.Gravity.TOP) // or BOTTOM
    .title("Hello World!")
    .message("This is a message from Flashbar.")
    .backgroundColorRes(R.color.colorPrimary)
    .build()
    .show()
```

### 2. Usage in Jetpack Compose
In Jetpack Compose, you can use `LocalContext` to get the Activity.
```kotlin
@Composable
fun MyScreen() {
    val context = LocalContext.current
    val activity = context as Activity

    Button(onClick = {
        Flashbar.Builder(activity)
            .message("Appears in Jetpack Compose!")
            .build()
            .show()
    }) {
        Text("Show Flashbar")
    }
}
```

### 3. Card Customization (New!)
You can now customize the appearance of Flashbar cards to be more flexible.
```kotlin
Flashbar.Builder(activity)
    .message("Custom Flashbar")
    // Set the elevation (shadow). Use 0f so there are no shadows
    .cardElevation(0f) 
    // Set the corner radius. Use 0f for perfect square corners
    .cardCornerRadius(0f)
    .build()
    .show()
```

## Want to contribute?

> If you want to contribute, please fork this repository, clone to your local machine, make changes, push, and then send a pull request to this repository

## Contact us

- [Telegram](https://t.me/moonelfalakiy)
- [Telegram discussion group](https://t.me/moonlight_studio01/9)

## License

```
Copyright 2016 aritraroy

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
```
flashbar
Copyright (C) 2024 Akash Yadav (AndroidIDE)
... (License details are the same as before)
```
```
flashbar
Copyright (C) 2026 Andi Hasan Ashari
... (License details are the same as before)
```
