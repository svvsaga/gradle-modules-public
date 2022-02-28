dependencies {
    implementation(project(":shared"))
    testImplementation(project(":testing"))
    testImplementation(project(":shared-testfactory"))
    api("com.google.cloud", "google-cloud-storage")
}