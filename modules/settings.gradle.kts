rootProject.name = "modules"

pluginManagement {
    includeBuild("../plugins/saga-build")
}

include("shared")
include("testing")
include("ktor-client")
include("beam")
include("geo")
include("gcp-core")
include("datex-client")
include("gcp-datastore")
include("gcp-redis")
include("gcp-bigquery")
include("gcp-functions")
include("gcp-storage")
include("testing-gcp")
include("shared-testfactory")
include("datex-serializer")
include("datex-schemas")
include("datex-poller")
include("ktor-server-1")
include("ktor-server")
