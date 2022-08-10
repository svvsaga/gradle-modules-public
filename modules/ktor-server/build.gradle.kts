dependencies {
    implementation(project(":shared"))
    testImplementation(project(":testing"))
    @Suppress("VulnerableLibrariesLocal", "RedundantSuppression")
    api(platform("io.ktor:ktor-bom:2.0.3"))
    api("io.ktor", "ktor-server-core")
    testImplementation("io.ktor", "ktor-server-tests")
}
