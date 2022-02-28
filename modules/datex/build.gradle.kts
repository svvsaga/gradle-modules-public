dependencies {
    implementation(project(":shared"))
    implementation(project(":ktor"))
    implementation(project(":datex-schemas"))
    implementation("javax.xml.bind:jaxb-api")

    testImplementation("io.ktor:ktor-client-mock-jvm")
    testImplementation(project(":testing"))
}
