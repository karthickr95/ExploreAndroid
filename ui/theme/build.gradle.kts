plugins {
    id("com.karthickr.explore.android.library.compose")
}

android {
    namespace = "com.karthickr.theme"

}

dependencies {

    implementation(platform(libs.compose.bom))
    implementation(libs.compose.material3)

    testImplementation(libs.junit)

    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
}