package app.samples.gradle

import org.gradle.api.Project
import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.getByType


fun Project.getLibrary(alias: String): Provider<MinimalExternalModuleDependency> {
    return libs.findLibrary(alias).get()
}

fun DependencyHandlerScope.implementation(lib: Provider<MinimalExternalModuleDependency>) {
    add("implementation", lib)
}

fun DependencyHandlerScope.debugImplementation(lib: Provider<MinimalExternalModuleDependency>) {
    add("debugImplementation", lib)
}

fun DependencyHandlerScope.testImplementation(lib: Provider<MinimalExternalModuleDependency>) {
    add("testImplementation", lib)
}

fun DependencyHandlerScope.androidTestImplementation(lib: Provider<MinimalExternalModuleDependency>) {
    add("androidTestImplementation", lib)
}

val Project.libs
    get(): VersionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")