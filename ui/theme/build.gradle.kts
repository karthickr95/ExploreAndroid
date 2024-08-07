plugins {
    alias(libs.plugins.app.library)
    alias(libs.plugins.app.compose)
}

android {
    namespace = "com.explore.theme"
}

dependencies {

    implementation(platform(libs.compose.bom))
    implementation(libs.compose.material3)

    testImplementation(libs.junit)

    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
}