rootProject.name = "example"

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/svvsaga/gradle-modules-public")
        }
    }
}

enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/svvsaga/gradle-modules-public")
        }
    }
    versionCatalogs {
        create("saga") {
            from("no.vegvesen.saga.modules:modules:1.3.5")
        }
    }
}
