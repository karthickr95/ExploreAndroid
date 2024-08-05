package app.samples.gradle

import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies


internal fun Project.configureComposePlugin() {
    with(pluginManager) {
        apply("org.jetbrains.kotlin.plugin.compose")
    }
}

internal fun Project.configureComposeDependencies(useAlphaBom: Boolean = false) {
    dependencies {

        val bom = if (useAlphaBom) getLibrary("compose-bom")
        else getLibrary("compose-bom-alpha")
        implementation(platform(bom))

        implementation(getLibrary("compose-ui"))
        implementation(getLibrary("compose-ui-tooling-preview"))
        implementation(getLibrary("compose-material3"))

        debugImplementation(getLibrary("compose-ui-tooling"))
        debugImplementation(getLibrary("compose-ui-test-manifest"))

        androidTestImplementation(getLibrary("compose-ui-test-junit4"))
    }
}