dependencies {
    testImplementation(project(":testing"))
    implementation(project(":shared"))

    // Authenticate with Redis Memorystore using application default credentials
    implementation("com.google.auth", "google-auth-library-oauth2-http")
    implementation("com.google.api-client", "google-api-client")
    implementation("com.google.apis", "google-api-services-redis", "v1-rev20221007-2.0.0")

    api("redis.clients", "jedis", "4.3.1")
}
