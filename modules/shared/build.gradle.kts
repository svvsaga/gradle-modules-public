repositories {
    mavenCentral()
}
dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("ch.qos.logback:logback-classic:1.2.7")
    implementation("org.jetbrains.kotlinx", "kotlinx-serialization-properties")

    testImplementation(project(":testing"))
    testImplementation(project(":shared-testfactory"))

    // dependencies of the logstash-logback-encoder
    implementation("com.fasterxml.jackson.core", "jackson-databind")
    implementation("com.fasterxml.jackson.datatype", "jackson-datatype-jdk8")
    implementation("com.fasterxml.jackson.datatype", "jackson-datatype-jsr310")
    // should not have be exposed ie. "implementation", see Kanbanize: #3507
    api("org.slf4j:slf4j-api:1.7.32")
    api("net.logstash.logback:logstash-logback-encoder:7.0")
    api("org.buildobjects:jproc:2.6.2")

    api("org.jetbrains.kotlinx", "kotlinx-datetime")
}
