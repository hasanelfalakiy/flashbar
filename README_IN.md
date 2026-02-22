<p align="center">
  <img src="./img/banner_flashbar.png" alt="app_banner"/>
</p>

<h2 align="center"><b>flashbar</b></h2>
<p align="center">
<b>Alternatif snackbar dan toast, canggih, dapat disesuaikan, cantik dan mudah digunakan</b>
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

## Baca dalam bahasa Inggris

- [English](./README.md)

## Tentang Flashbar
Pustaka untuk menampilkan pesan sebagai alternatif snackbar dan toast, yang canggih, mudah disesuaikan, dan mudah digunakan.
Berdasarkan [Flashbar (AndroidIDE)](https://github.com/AndroidIDEOfficial/AndroidIDE/tree/dev/utilities%2Fflashbar) yang berdasarkan [Flashbar (aritraroy)](https://github.com/aritraroy/Flashbar)

## Konfigurasi

1. Letakkan kode ini di settings.gradle.kts (root kotlin dsl) di ```repositories``` 
```kotlin
dependencyResolutionManagement {
    repositories {
        maven { url = uri("https://jitpack.io") }
    }
}
```
jika menggunakan groovy dsl
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}
```
2. Masukkan dependensi ke dalam build.gradle.kts (app/build.gradle.kts)
```kotlin
implementation("com.github.hasanelfalakiy:flashbar:latest_version")
```

jika menggunakan groovy dsl
```groovy
implementation 'com.github.hasanelfalakiy:flashbar:${version}'
```

## Baca dokumentasi (dokka)

- [Dokumentasi](https://hasanelfalakiy.github.io/flashbar/)

## Penggunaan

### 1. Penggunaan Dasar (Activity/View)
```kotlin
Flashbar.Builder(this)
    .gravity(Flashbar.Gravity.TOP) // atau BOTTOM
    .title("Halo Dunia!")
    .message("Ini adalah pesan dari Flashbar.")
    .backgroundColorRes(R.color.colorPrimary)
    .build()
    .show()
```

### 2. Penggunaan di Jetpack Compose
Di Jetpack Compose, Anda dapat menggunakan `LocalContext` untuk mendapatkan Activity.
```kotlin
@Composable
fun MyScreen() {
    val context = LocalContext.current
    val activity = context as Activity

    Button(onClick = {
        Flashbar.Builder(activity)
            .message("Muncul di Jetpack Compose!")
            .build()
            .show()
    }) {
        Text("Tampilkan Flashbar")
    }
}
```

### 3. Kustomisasi Kartu (Baru!)
Anda sekarang dapat menyesuaikan tampilan kartu Flashbar agar lebih fleksibel.
```kotlin
Flashbar.Builder(activity)
    .message("Flashbar Kustom")
    // Mengatur elevasi (bayangan). Gunakan 0f agar tidak ada bayangan
    .cardElevation(0f) 
    // Mengatur radius pojok. Gunakan 0f untuk pojok kotak sempurna
    .cardCornerRadius(0f)
    .build()
    .show()
```

## Ingin berkontribusi?

> Jika Anda ingin berkontribusi, silakan fork repositori ini, klon ke mesin lokal Anda, buat perubahan, dorong, lalu kirim permintaan tarik ke repositori ini

## Kontak kami

- [Telegram](https://t.me/moonelfalakiy)
- [Grup diskusi telegram](https://t.me/moonlight_studio01/9)

## Lisensi

```
Copyright 2016 aritraroy
Licensed under the Apache License, Version 2.0
... (detail lisensi sama seperti sebelumnya)
```
```
flashbar
Copyright (C) 2024 Akash Yadav (AndroidIDE)
... (detail lisensi sama seperti sebelumnya)
```
```
flashbar
Copyright (C) 2026 Andi Hasan Ashari
... (detail lisensi sama seperti sebelumnya)
```
