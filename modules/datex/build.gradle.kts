dependencies {
    implementation(project(":shared"))
    implementation(project(":ktor"))
    implementation(project(":datex-schemas"))
    implementation(project(":datex-serializer"))
    implementation("javax.xml.bind:jaxb-api")
    api("com.github.svvsaga:datex-client:1.2.0")

    testImplementation("io.ktor:ktor-client-mock-jvm")
    testImplementation(project(":testing"))
}
