dependencies {
    implementation("org.locationtech.jts", "jts-core", "1.18.2")
    api("org.locationtech.proj4j", "proj4j", "1.1.2")

    testImplementation(project(":testing"))
}
