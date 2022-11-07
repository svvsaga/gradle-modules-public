dependencies {
    api("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlinx", "kotlinx-serialization-properties")

    testImplementation(project(":testing"))
    testImplementation(project(":shared-testfactory"))

    // dependencies of the logstash-logback-encoder
    implementation("com.fasterxml.jackson.core", "jackson-databind")
    implementation("com.fasterxml.jackson.datatype", "jackson-datatype-jdk8")
    implementation("com.fasterxml.jackson.datatype", "jackson-datatype-jsr310")

    // Beware: Don't upgrade to slf4j 2.x until Cloud Function issue is fixed:
    // https://console.cloud.google.com/support/cases/detail/v2/42068176?organizationId=429006794855&supportedpurview=project
    implementation("ch.qos.logback:logback-classic:1.2.11")
    api("org.slf4j:slf4j-api:1.7.36")
    api("net.logstash.logback:logstash-logback-encoder:7.2")
    api("org.buildobjects:jproc:2.8.2")

    api("org.jetbrains.kotlinx", "kotlinx-datetime")
}
