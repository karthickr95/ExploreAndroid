package app.samples.gradle

import org.gradle.api.Project
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

internal fun Project.configureKotlin() {
    with(pluginManager) {
        apply("org.jetbrains.kotlin.android")
    }
    tasks.withType<KotlinCompile>().configureEach {
        kotlinOptions {
            jvmTarget = BuildAttributeUtils.Java.toString()
        }
    }
}