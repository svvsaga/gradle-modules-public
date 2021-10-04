dependencies {
    implementation(project(":datex"))
    implementation(project(":testing"))
    implementation(project(":gcp"))
    implementation(project(":gcp-storage"))
    implementation(project(":ktor"))
    implementation("io.ktor:ktor-client-mock-jvm")
    implementation("com.google.cloud", "google-cloud-storage")
}
