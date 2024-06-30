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
            id = "app.explore.root"
            implementationClass = "app.samples.gradle.RootConventionPlugin"
        }
        register("androidApplication") {
            id = "app.explore.android.application"
            implementationClass = "app.samples.gradle.AndroidApplicationConventionPlugin"
        }
        register("androidLibrary") {
            id = "app.explore.android.library"
            implementationClass = "app.samples.gradle.AndroidLibraryConventionPlugin"
        }
        register("composePlugin") {
            id = "app.explore.compose"
            implementationClass = "app.samples.gradle.ComposePlugin"
        }
        register("kotlinAndroid") {
            id = "app.explore.kotlin.android"
            implementationClass = "app.samples.gradle.KotlinAndroidConventionPlugin"
        }
    }
}