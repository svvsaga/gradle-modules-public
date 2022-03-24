dependencies {
    implementation(project(":shared"))
    implementation(project(":ktor"))
    implementation(project(":datex-schemas"))

    testImplementation("io.ktor:ktor-client-mock-jvm")
    testImplementation(project(":testing"))
}
