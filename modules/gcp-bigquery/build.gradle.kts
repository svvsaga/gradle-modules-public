val bigQueryVersion = "2.14.3"

dependencies {
    implementation(project(":shared"))
    testImplementation(project(":testing"))
    testImplementation(project(":testing-gcp"))
    api("com.google.cloud", "google-cloud-bigquery", bigQueryVersion)
    api("com.google.cloud", "google-cloud-bigquerystorage", bigQueryVersion)
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf:1.3.3")
}
