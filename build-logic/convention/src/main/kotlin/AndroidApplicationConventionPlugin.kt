import app.samples.gradle.configureAndroid
import app.samples.gradle.configureApplicationPlugin
import app.samples.gradle.configureKotlin
import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidApplicationConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            configureApplicationPlugin()
            configureAndroid()
            configureKotlin()
        }
    }
}