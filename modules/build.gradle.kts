// Touch to trigger build

plugins {
    kotlin("jvm") version "1.5.31"
    kotlin("plugin.serialization") version "1.5.31"
    id("com.adarshr.test-logger") version "3.0.0"
    id("saga-build")
    `maven-publish`
    `version-catalog`
    id("com.github.jk1.dependency-license-report") version "2.0"
    id("com.google.cloud.artifactregistry.gradle-plugin") version "2.1.4"
    id("com.github.ben-manes.versions") version "0.39.0"
}

val kotlinVersion = "1.5.31"
val kotlinxCoroutinesVersion = "1.5.1"
val kotlinxDateTimeVersion = "0.2.1"
val ktorVersion = "1.6.0"
val arrowVersion = "1.0.1"
val jacksonVersion = "2.12.3"
val jUnitVersion = "5.7.1"
val serializationVersion = "1.2.1"
val functionsVersion = "1.0.4"
val gcpLibrariesBomVersion = "24.0.0"
val xmlBindVersion = "2.3.1"

val modulesVersion =
    (if (project.hasProperty("releaseVersion")) project.property("releaseVersion").toString() else null)
        ?: "1.0.0-SNAPSHOT"

allprojects {
    group = "no.vegvesen.saga.modules"
    version = modulesVersion

    useJvmTarget("11")

    apply(plugin = "maven-publish")
    apply(plugin = "com.google.cloud.artifactregistry.gradle-plugin")

    publishing {
        repositories {
            maven {
                name = "GoogleArtifacts"
                url = uri("artifactregistry://europe-maven.pkg.dev/saga-artifacts/maven-public")
            }
        }
    }
}

catalog {
    versionCatalog {
        subprojects.forEach {
            alias(it.name).to(it.group.toString(), it.name).version(modulesVersion)
        }
    }
}

publishing {
    publications {
        create<MavenPublication>("versionCatalog") {
            from(components["versionCatalog"])
        }
    }
}

subprojects {
    apply(plugin = "kotlin")
    apply(plugin = "kotlinx-serialization")
    apply(plugin = "com.adarshr.test-logger")

    useIntegrationTests()

    dependencies {
        api(platform("com.google.cloud:libraries-bom:$gcpLibrariesBomVersion"))
        api(kotlin("stdlib-jdk8"))
        api("org.jetbrains.kotlinx", "kotlinx-serialization-json", serializationVersion)
        api("io.arrow-kt", "arrow-core", arrowVersion)
        api("io.arrow-kt", "arrow-fx-coroutines", arrowVersion)

        testImplementation("org.junit.jupiter", "junit-jupiter-api", jUnitVersion)
        testRuntimeOnly("org.junit.jupiter", "junit-jupiter-engine", jUnitVersion)

        constraints {
            implementation("org.jetbrains.kotlin", "kotlin-reflect", kotlinVersion)
            api("org.jetbrains.kotlinx", "kotlinx-datetime", kotlinxDateTimeVersion)
            api("org.jetbrains.kotlinx", "kotlinx-coroutines-core", kotlinxCoroutinesVersion)
            api("org.jetbrains.kotlinx", "kotlinx-serialization-properties", serializationVersion)
            api("org.jetbrains.kotlinx", "kotlinx-serialization-protobuf", serializationVersion)
            api("io.ktor", "ktor-server-netty", ktorVersion)
            api("io.ktor", "ktor-client-core-jvm", ktorVersion)
            api("io.ktor", "ktor-client-serialization-jvm", ktorVersion)
            api("io.ktor", "ktor-client-encoding", ktorVersion)
            api("io.ktor", "ktor-client-apache", ktorVersion)
            api("io.ktor", "ktor-client-cio", ktorVersion) // TODO: Phase out

            implementation("javax.xml.bind", "jaxb-api", xmlBindVersion)

            implementation("com.fasterxml.jackson.module", "jackson-module-kotlin", jacksonVersion)
            implementation("com.fasterxml.jackson.core", "jackson-databind", jacksonVersion)
            implementation("com.fasterxml.jackson.datatype", "jackson-datatype-jdk8", jacksonVersion)
            implementation("com.fasterxml.jackson.datatype", "jackson-datatype-jsr310", jacksonVersion)

            implementation("io.ktor", "ktor-client-mock-jvm", ktorVersion)
            api("io.ktor", "ktor-client-mock-jvm", ktorVersion)

            implementation("com.google.cloud.functions", "functions-framework-api", functionsVersion)
            api("com.google.cloud.functions", "functions-framework-api", functionsVersion)
        }
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.freeCompilerArgs += "-Xsam-conversions=class" // Workaround for serialization issue: https://youtrack.jetbrains.com/issue/KT-46359
    }
    tasks.withType<PublishToMavenRepository> {
        doFirst {
            println("Publishing ${publication.groupId}:${publication.artifactId}:${publication.version} to ${repository.url}")
        }
    }
    java {
        withJavadocJar()
        withSourcesJar()
    }
    publishing {
        publications {
            register<MavenPublication>(project.name) {
                from(components["java"])
            }
        }
    }
}
