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

enableFeaturePreview("VERSION_CATALOGS")

val modulesVersion = "7.0.0"

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
