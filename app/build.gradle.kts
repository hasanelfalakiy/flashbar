
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.andihasan7.flashbarsample"
    compileSdk = 36
    
    defaultConfig {
        applicationId = "com.andihasan7.flashbarsample"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
        
        vectorDrawables { 
            useSupportLibrary = true
        }
    }
    
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        viewBinding = true
        
    }
    
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions.jvmTarget = "11"
}

dependencies {


    implementation(libs.androidx.constraintlayout)
    implementation(libs.google.material)
    implementation(libs.androidx.appcompat)
    
    implementation(project(":flashbar"))
}
