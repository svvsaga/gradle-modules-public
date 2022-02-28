dependencies {
    api(project(":shared"))

    implementation("com.google.cloud", "google-cloud-storage")
    implementation("com.google.cloud", "google-cloud-bigquery")
    implementation("com.google.cloud", "google-cloud-secretmanager")

    api("com.google.cloud", "google-cloud-pubsub")
    api("com.google.cloud", "google-cloud-datastore")
    api("com.google.cloud.functions", "functions-framework-api")

    implementation("io.arrow-kt", "arrow-core")

    testImplementation(project(":testing"))
    testImplementation(project(":shared-testfactory"))
}