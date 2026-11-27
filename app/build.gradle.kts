plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.compose")
}

val testKeystorePath = System.getenv("DAILY_CLASSICS_KEYSTORE_PATH")

android {
    namespace = "com.dailyclassics.app"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.dailyclassics.app"
        minSdk = 26
        targetSdk = 36
        versionCode = 2
        versionName = "0.1.1"
    }

    signingConfigs {
        create("stableTest") {
            if (!testKeystorePath.isNullOrBlank()) {
                storeFile = file(testKeystorePath)
                storePassword = System.getenv("DAILY_CLASSICS_KEYSTORE_PASSWORD")
                keyAlias = System.getenv("DAILY_CLASSICS_KEY_ALIAS") ?: "dailyclassics"
                keyPassword = System.getenv("DAILY_CLASSICS_KEYSTORE_PASSWORD")
            }
        }
    }

    buildTypes {
        getByName("debug") {
            if (!testKeystorePath.isNullOrBlank()) {
                signingConfig = signingConfigs.getByName("stableTest")
            }
        }
    }

    buildFeatures { compose = true }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions { jvmTarget = "17" }
}

dependencies {
    implementation(platform("androidx.compose:compose-bom:2025.04.01"))
    implementation("androidx.activity:activity-compose:1.10.1")
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.material:material-icons-extended")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.7")
    testImplementation("junit:junit:4.13.2")
    debugImplementation("androidx.compose.ui:ui-tooling")
}
