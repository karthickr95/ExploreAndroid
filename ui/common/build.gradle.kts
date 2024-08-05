plugins {
    alias(libs.plugins.app.library)
    alias(libs.plugins.app.compose)
}

android {
    namespace = "com.explore.common"

    buildFeatures {

    }
}

dependencies {

    implementation(libs.core)

    testImplementation(libs.junit)

    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
}