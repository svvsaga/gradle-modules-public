dependencies {
    implementation(project(":shared"))
    implementation(project(":ktor"))
    implementation(project(":datex-schemas"))

    testImplementation("io.ktor:ktor-client-mock-jvm:2.0.3")
    testImplementation(project(":testing"))
}
