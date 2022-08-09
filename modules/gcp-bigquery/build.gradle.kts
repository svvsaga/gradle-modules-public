dependencies {
    implementation(project(":shared"))
    testImplementation(project(":testing"))
    testImplementation(project(":testing-gcp"))
    api("com.google.cloud", "google-cloud-bigquery")
    api("com.google.cloud", "google-cloud-bigquerystorage")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf:1.3.3")
}
