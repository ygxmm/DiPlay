plugins {
    id("com.android.application")
}

android {
    namespace = "com.shilapi.xcertplay"
    compileSdk = 37

    defaultConfig {
        applicationId = "com.shilapi.xcertplay"
        minSdk = 18
        targetSdk = 18
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.core:core-ktx:1.9.0")
}
