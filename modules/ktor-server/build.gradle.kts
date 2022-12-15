dependencies {
    api(platform("io.ktor:ktor-bom:2.2.1"))
    api("io.ktor", "ktor-server-core")
    api("io.ktor", "ktor-server-auth")

    implementation(project(":shared"))

    testImplementation(project(":testing"))
    testImplementation("io.ktor", "ktor-server-tests")
}
