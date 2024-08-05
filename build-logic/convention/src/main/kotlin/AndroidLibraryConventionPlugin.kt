import app.samples.gradle.configureAndroid
import app.samples.gradle.configureKotlin
import app.samples.gradle.configureLibraryPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidLibraryConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            configureLibraryPlugin()
            configureAndroid()
            configureKotlin()
        }
    }

}