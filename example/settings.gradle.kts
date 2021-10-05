rootProject.name = "example"

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven {
            url = uri("https://europe-maven.pkg.dev/saga-artifacts/maven-public")
        }
    }
}

enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    repositories {
        maven {
            url = uri("https://europe-maven.pkg.dev/saga-artifacts/maven-public")
        }
    }
    versionCatalogs {
        create("saga") {
            from("no.vegvesen.saga.modules:modules:1.3.9")
        }
    }
}
