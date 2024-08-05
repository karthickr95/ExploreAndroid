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
        register("AndroidApplication") {
            id = "app.explore.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("AndroidLibrary") {
            id = "app.explore.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        register("ComposePlugin") {
            id = "app.explore.compose"
            implementationClass = "ComposeConventionPlugin"
        }
        register("KotlinAndroid") {
            id = "app.explore.kotlin.android"
            implementationClass = "KotlinConventionPlugin"
        }
    }
}