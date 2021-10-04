dependencies {
    implementation(project(":shared"))
    implementation(project(":ktor"))
    implementation("javax.xml.bind:jaxb-api")
    api("com.github.svvsaga:datex-client:1.2.0")

    testImplementation("io.ktor:ktor-client-mock-jvm")
    testImplementation(project(":testing"))
}
