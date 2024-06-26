plugins {
    id("com.karthickr.explore.android.library.compose")
}

android {
    namespace = "com.karthickr.common"

}

dependencies {

    implementation(libs.core)

    testImplementation(libs.junit)

    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
}