import app.samples.gradle.BuildAttributeUtils
import app.samples.gradle.configureComposeDependencies
import app.samples.gradle.configureComposePlugin
import org.gradle.api.Plugin
import org.gradle.api.Project

private const val USE_COMPOSE_ALPHA_BOM = true


class ComposeConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                if (hasPlugin(BuildAttributeUtils.APPLICATION_GROUP_ID)) {
                    configureComposePlugin()
                    configureComposeDependencies(USE_COMPOSE_ALPHA_BOM)
                } else if (hasPlugin(BuildAttributeUtils.LIBRARY_GROUP_ID)) {
                    configureComposePlugin()
                    configureComposeDependencies(USE_COMPOSE_ALPHA_BOM)
                }
            }
        }
    }
}