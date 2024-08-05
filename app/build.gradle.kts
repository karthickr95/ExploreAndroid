plugins {
    alias(libs.plugins.app.application)
    alias(libs.plugins.app.compose)
}

android {
    namespace = "com.karthickr.explore"

    defaultConfig {
        applicationId = "com.karthickr.explore"
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    buildFeatures {
        compose = true
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(projects.ui.theme)
    implementation(projects.ui.common)

    implementation(libs.core)
    implementation(libs.lifecycle.runtime)
    implementation(libs.activity.compose)

    testImplementation(libs.junit)

    androidTestImplementation(libs.junit)
    androidTestImplementation(libs.espresso.core)

}