dependencies {
    implementation(project(":shared"))
    testImplementation(project(":testing"))
    api("com.google.cloud.functions", "functions-framework-api")
    api("com.google.api-client", "google-api-client")
    testImplementation("com.google.auth", "google-auth-library-oauth2-http")
}
