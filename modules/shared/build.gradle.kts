dependencies {
    api("org.jetbrains.kotlin:kotlin-reflect")
    implementation("ch.qos.logback:logback-classic:1.4.3")
    implementation("org.jetbrains.kotlinx", "kotlinx-serialization-properties")

    testImplementation(project(":testing"))
    testImplementation(project(":shared-testfactory"))

    // dependencies of the logstash-logback-encoder
    implementation("com.fasterxml.jackson.core", "jackson-databind")
    implementation("com.fasterxml.jackson.datatype", "jackson-datatype-jdk8")
    implementation("com.fasterxml.jackson.datatype", "jackson-datatype-jsr310")

    api("org.slf4j:slf4j-api:2.0.3")
    api("net.logstash.logback:logstash-logback-encoder:7.2")
    api("org.buildobjects:jproc:2.8.2")

    api("org.jetbrains.kotlinx", "kotlinx-datetime")
}
