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
                maven {
                    name = "GoogleArtifactRegistry"
                    url = uri("https://europe-maven.pkg.dev/saga-artifacts/maven-public")
                }
                maven("https://jitpack.io")
            }
            useJvmTarget("11")
        }
    }
}
