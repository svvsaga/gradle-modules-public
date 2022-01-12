dependencies {
    implementation("com.google.api-client", "google-api-client", "1.32.2")
    implementation(project(":shared"))
    testImplementation(project(":testing"))
    api("com.google.cloud.functions", "functions-framework-api")
}
