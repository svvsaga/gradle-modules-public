import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.maven
import org.gradle.kotlin.dsl.repositories

class SagaBuildPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.allprojects {
            repositories {
                mavenCentral()
                maven("https://oss.sonatype.org/content/repositories/snapshots")
                maven("https://packages.confluent.io/maven") // Needed by beam-runners-google-cloud-dataflow-java
                maven("https://jitpack.io")
                maven {
                    name = "GitHubPackages"
                    url = uri("https://maven.pkg.github.com/svvsaga/gradle-modules-public")
                }
            }
        }
    }
}
