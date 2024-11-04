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
```kotlin.kts
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

```kotlin.kts
implementation("com.github.hasanelfalakiy:flashbar:${version}")
```
if using groovy dsl
```groovy
implementation 'com.github.hasanelfalakiy:flashbar:${version}'
```

## Documentation

- [Documentation](https://hasanelfalakiy.github.io/flashbar/)

## Usage

WIP (work in progress)


## Want to contribute?

> If you want to contribute, please fork this repository, clone to your local machine, make changes, push, and then send a pull request to this repository

## Contact us

- [Telegram](https://t.me/moonelfalakiy)
- [Telegram discussion group](https://t.me/moonlight_studio01/9)

## License

```
flashbar

Copyright (C) 2024  Andi Hasan Ashari

flashbar is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

flashbar is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with flashbar.  If not, see <https://www.gnu.org/licenses/>.

```
Report to us if anyone violates the terms of the License, either by creating issues or writing message to us directly.
