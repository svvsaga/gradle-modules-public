dependencies {
    api("org.jetbrains.kotlin:kotlin-reflect")
    api("org.jetbrains.kotlinx", "kotlinx-coroutines-core")
    implementation("org.jetbrains.kotlinx", "kotlinx-serialization-properties")

    testImplementation(project(":testing"))
    testImplementation(project(":shared-testfactory"))

    // dependencies of the logstash-logback-encoder
    implementation("com.fasterxml.jackson.core", "jackson-databind")
    implementation("com.fasterxml.jackson.datatype", "jackson-datatype-jdk8")
    implementation("com.fasterxml.jackson.datatype", "jackson-datatype-jsr310")

    implementation("ch.qos.logback:logback-classic:1.4.5")
    api("org.slf4j:slf4j-api:2.0.6")
    api("net.logstash.logback:logstash-logback-encoder:7.2")
    api("org.buildobjects:jproc:2.8.2")
    api("io.github.reactivecircus.cache4k:cache4k:0.9.0")

    api("org.jetbrains.kotlinx", "kotlinx-datetime")
}
