rootProject.name = "modules"
include("shared")
include("testing")
include("ktor")
include("beam")
include("geo")
include("gcp")
include("datex")
include("gcp-datastore")
include("gcp-redis")
include("gcp-bigquery")
include("gcp-functions")
include("gcp-storage")
include("testing-gcp")
include("testing-datex")
include("shared-testfactory")

pluginManagement {
    includeBuild("../plugins/saga-build")

    repositories {
        maven {
            url = uri("https://europe-maven.pkg.dev/saga-artifacts/maven-public")
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
