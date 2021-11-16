import org.gradle.api.Project
import org.gradle.api.tasks.bundling.AbstractArchiveTask
import org.gradle.api.tasks.testing.Test
import org.gradle.kotlin.dsl.named
import org.gradle.kotlin.dsl.register
import org.gradle.kotlin.dsl.withType
import java.io.ByteArrayOutputStream

fun Project.setVersionFromGitSha() {
    val stdout = ByteArrayOutputStream()
    project.exec {
        commandLine("git", "log", "--format=%h", "--abbrev=8", "-1", project.projectDir)
        standardOutput = stdout
    }
    val gitSha = stdout.toString().trim()
    version = "1.0.$gitSha"
    useReproducibleBuilds()
}

fun Project.useReproducibleBuilds() {
    tasks.withType<AbstractArchiveTask>().configureEach {
        isPreserveFileTimestamps = false
        isReproducibleFileOrder = true
    }
}

fun Project.useAppVersion() {
    version = (if (project.hasProperty("appVersion")) project.property("appVersion") else null) ?: "1.0-SNAPSHOT"
}

fun Project.useIntegrationTests() {
    tasks.named<Test>("test") {
        useJUnitPlatform {
            excludeTags("IntegrationTest", "ExternalTest")
        }
        systemProperty("kotest.tags", "!IntegrationTest & !ExternalTest")
    }
    tasks.register<Test>("intTest") {
        useJUnitPlatform {
            excludeTags("ExternalTest")
        }
        systemProperty("kotest.tags", "!ExternalTest")
    }
    tasks.register<Test>("externalTest") {
        useJUnitPlatform()
    }

    tasks.withType<Test> {
        reports {
            // For showing test reports in CI
            junitXml.required.set(true)
        }
    }
}

fun Project.useJvmTarget(version: String) {
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = version
        }
    }
}
