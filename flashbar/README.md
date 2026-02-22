# Flashbar

A highly customizable, powerful, and easy-to-use Android library for showing messages as an alternative to Snakbars and Toasts.
Based on [Flashbar (AndroidIDE)](https://github.com/AndroidIDEOfficial/AndroidIDE/tree/dev/utilities%2Fflashbar) which is based on [Flashbar (aritraroy)](https://github.com/aritraroy/Flashbar).

## Configuration

1. Add JitPack to your `settings.gradle.kts` (root)
```kotlin
dependencyResolutionManagement {
    repositories {
        maven { url = uri("https://jitpack.io") }
    }
}
```

2. Add the dependency to your `app/build.gradle.kts`
```kotlin
implementation("com.github.hasanelfalakiy:flashbar:latest_version")
```

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
In Jetpack Compose, you can use `LocalContext` to get the Activity instance.
```kotlin
@Composable
fun MyScreen() {
    val context = LocalContext.current
    val activity = context as Activity

    Button(onClick = {
        Flashbar.Builder(activity)
            .message("Showing in Jetpack Compose!")
            .build()
            .show()
    }) {
        Text("Show Flashbar")
    }
}
```

### 3. Card Customization (New!)
You can now customize the Flashbar's card appearance for better flexibility (e.g., to make it flush to the screen edges in Landscape mode).
```kotlin
Flashbar.Builder(activity)
    .message("Customized Flashbar")
    // Set elevation (shadow). Use 0f to make it flush to the screen edge (Landscape)
    .cardElevation(0f) 
    // Set corner radius. Use 0f for a perfect rectangle
    .cardCornerRadius(0f)
    .build()
    .show()
```

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
Copyright (C) 2024 Andi Hasan Ashari
... (full license terms included in the file)
```
