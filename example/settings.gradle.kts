rootProject.name = "example"

pluginManagement {
    repositories {
        maven {
            url = uri("https://europe-maven.pkg.dev/saga-artifacts/maven-public")
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

val modulesVersion = "16.7.5"

dependencyResolutionManagement {
    repositories {
        maven {
            url = uri("https://europe-maven.pkg.dev/saga-artifacts/maven-public")
        }
    }
    versionCatalogs {
        create("saga") {
            from("no.vegvesen.saga.modules:modules:$modulesVersion")
        }
    }
}
