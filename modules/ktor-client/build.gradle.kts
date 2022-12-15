val ktorVersion = "2.2.1"

dependencies {
    implementation("io.ktor", "ktor-client-cio", ktorVersion)
    api("io.ktor", "ktor-client-apache", ktorVersion)
    api("io.ktor", "ktor-client-core-jvm", ktorVersion)
    api("io.ktor", "ktor-client-serialization-jvm", ktorVersion)
    api("io.ktor", "ktor-client-encoding", ktorVersion)
    api("io.ktor", "ktor-client-content-negotiation", ktorVersion)
    api("io.ktor", "ktor-serialization-kotlinx-json", ktorVersion)
}
