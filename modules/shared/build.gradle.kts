dependencies {
    api("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlinx", "kotlinx-serialization-properties")

    testImplementation(project(":testing"))
    testImplementation(project(":shared-testfactory"))

    // dependencies of the logstash-logback-encoder
    implementation("com.fasterxml.jackson.core", "jackson-databind")
    implementation("com.fasterxml.jackson.datatype", "jackson-datatype-jdk8")
    implementation("com.fasterxml.jackson.datatype", "jackson-datatype-jsr310")

    api("ch.qos.logback:logback-classic:1.4.4")
    api("net.logstash.logback:logstash-logback-encoder:7.2")
    api("org.buildobjects:jproc:2.8.2")

    api("org.jetbrains.kotlinx", "kotlinx-datetime")
}
