plugins {
    alias(libs.plugins.kotlin.dsl)
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(libs.versions.java.get())
    }
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("root") {
            id = "com.karthickr.explore.root"
            implementationClass = "app.samples.gradle.RootConventionPlugin"
        }
        register("androidApplication") {
            id = "com.karthickr.explore.android.application"
            implementationClass = "app.samples.gradle.AndroidApplicationConventionPlugin"
        }
        register("androidLibrary") {
            id = "com.karthickr.explore.android.library"
            implementationClass = "app.samples.gradle.AndroidLibraryConventionPlugin"
        }
        register("androidComposeLibrary") {
            id = "com.karthickr.explore.android.library.compose"
            implementationClass = "app.samples.gradle.AndroidComposeLibraryConventionPlugin"
        }
        register("kotlinAndroid") {
            id = "com.karthickr.explore.kotlin.android"
            implementationClass = "app.samples.gradle.KotlinAndroidConventionPlugin"
        }
    }
}