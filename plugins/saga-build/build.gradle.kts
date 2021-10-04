plugins {
    `kotlin-dsl`
    `maven-publish`
}

group = "no.vegvesen.saga"
version =
    "1.3.${(if (project.hasProperty("releaseVersion")) project.property("releaseVersion") else null) ?: "0-SNAPSHOT"}"

gradlePlugin {
    plugins {
        register("SagaBuild") {
            id = "saga-build"
            implementationClass = "SagaBuildPlugin"
            description = "Plugin for building Saga projects. Adds necessary repositories."
        }
    }
}
repositories {
    mavenCentral()
}
publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/svvsaga/gradle-modules-public")
            credentials {
                username = project.findProperty("gpr.user") as String? ?: System.getenv("GITHUB_ACTOR")
                password = project.findProperty("gpr.key") as String? ?: System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
tasks.withType<PublishToMavenRepository> {
    doFirst {
        println("Publishing ${publication.groupId}:${publication.artifactId}:${publication.version} to ${repository.url}")
    }
}
