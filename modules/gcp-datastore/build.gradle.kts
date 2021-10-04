dependencies {
    implementation(project(":shared"))
    implementation(project(":gcp"))
    implementation("io.arrow-kt", "arrow-fx-coroutines")
    testImplementation(project(":testing"))
    testImplementation(project(":shared-testfactory"))
    api("com.google.cloud", "google-cloud-datastore")
}
