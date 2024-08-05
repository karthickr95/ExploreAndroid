package app.samples.gradle

import com.android.build.gradle.BaseExtension
import com.android.build.gradle.LibraryExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureApplicationPlugin() {
    with(pluginManager) {
        apply("com.android.application")
    }
}

internal fun Project.configureLibraryPlugin() {
    with(pluginManager) {
        apply("com.android.library")
    }
}

internal fun Project.configureAndroid() {

    android {
        compileSdkVersion(BuildAttributeUtils.COMPILE_SDK)

        defaultConfig {
            minSdk = BuildAttributeUtils.MIN_SDK
            targetSdk = BuildAttributeUtils.TARGET_SDK

            testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

            vectorDrawables {
                useSupportLibrary = true
            }
        }

        compileOptions {
            // https://developer.android.com/studio/write/java8-support
            // isCoreLibraryDesugaringEnabled = true
            sourceCompatibility = BuildAttributeUtils.Java
            targetCompatibility = BuildAttributeUtils.Java
        }

        testOptions {
            if (this@android is LibraryExtension) {
                // We only want to configure this for library modules
                targetSdk = BuildAttributeUtils.TARGET_SDK
            }

            unitTests {
                isIncludeAndroidResources = true
                isReturnDefaultValues = true
            }
        }
    }

    dependencies {
        // https://developer.android.com/studio/write/java8-support
        // "coreLibraryDesugaring"(libs.findLibrary("tools.desugarjdklibs").get())
    }
}

private fun Project.android(action: BaseExtension.() -> Unit) =
    extensions.configure<BaseExtension>(action)