val ktorVersion = "1.6.8"

dependencies {
    implementation(project(":shared"))
    implementation("io.ktor", "ktor-server-core", ktorVersion)

    testImplementation("io.ktor", "ktor-server-tests", ktorVersion)
    testImplementation(project(":testing"))
}
