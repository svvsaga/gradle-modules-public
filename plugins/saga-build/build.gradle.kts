// Touch to trigger build....

plugins {
    `kotlin-dsl`
    `maven-publish`
    id("com.google.cloud.artifactregistry.gradle-plugin") version "2.1.5"
}

group = "no.vegvesen.saga"
version =
    (if (project.hasProperty("releaseVersion")) project.property("releaseVersion").toString() else null)
        ?: "1.0.0-SNAPSHOT"
gradlePlugin {
    plugins {
        register("SagaBuild") {
            id = "saga-build"
            implementationClass = "SagaBuildPlugin"
            description = "Plugin for building Saga projects. Adds necessary repositories."
        }
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "17"
    }
}

val kotlinVersion = "1.7.10"

dependencies {
    implementation("org.jetbrains.kotlin", "kotlin-gradle-plugin", kotlinVersion)
}

repositories {
    mavenCentral()
}

publishing {
    repositories {
        maven {
            name = "GoogleArtifacts"
            url = uri("artifactregistry://europe-maven.pkg.dev/saga-artifacts/maven-public")
        }
    }
}
tasks.withType<PublishToMavenRepository> {
    doFirst {
        println("Publishing ${publication.groupId}:${publication.artifactId}:${publication.version} to ${repository.url}")
    }
}
