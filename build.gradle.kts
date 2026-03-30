plugins {
    id("com.android.application") version "7.0.0" apply false
    id("org.jetbrains.kotlin.android") version "1.5.31" apply false
}

android {
    compileSdk = 31

    defaultConfig {
        applicationId = "com.example.luxeai"
        minSdk = 21
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.4.0")
    implementation("androidx.compose.ui:ui:1.0.5")  // Jetpack Compose UI
    implementation("androidx.compose.material:material:1.0.5")  // Jetpack Compose Material
    implementation("androidx.compose.ui:ui-tooling-preview:1.0.5")  // Jetpack Compose Tooling
    implementation("androidx.activity:activity-compose:1.4.0")  // Jetpack Compose Activity

    implementation("com.google.firebase:firebase-bom:29.0.3")  // Firebase BOM
    implementation("com.google.firebase:firebase-analytics-ktx")  // Firebase Analytics
    implementation("com.google.firebase:firebase-auth-ktx")  // Firebase Authentication
    implementation("com.google.firebase:firebase-database-ktx")  // Firebase Realtime Database
    implementation("com.google.firebase:firebase-firestore-ktx")  // Firebase Firestore

    implementation("org.tensorflow:tensorflow-lite:2.7.0")  // TensorFlow Lite for AI
    implementation("org.tensorflow:tensorflow-lite-gpu:2.7.0")  // TensorFlow Lite GPU support 
}