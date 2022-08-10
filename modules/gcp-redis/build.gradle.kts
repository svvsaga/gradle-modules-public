val googleAuthVersion = "1.9.0"
val googleApisVersion = "v1-rev20220518-2.0.0"
val jedisVersion = "3.3.0"

dependencies {

    testImplementation(project(":testing"))
    implementation(project(":shared"))

    // Authenticate with Redis Memorystore using application default credentials
    implementation("com.google.auth", "google-auth-library-oauth2-http", googleAuthVersion)
    implementation("com.google.api-client", "google-api-client")
    implementation("com.google.apis", "google-api-services-redis", googleApisVersion)

    api("redis.clients", "jedis", jedisVersion)
}
