val kotestVersion = "5.1.0"
val kotestExtensionsVersion = "1.2.2"
val mockkVersion = "1.12.2"
val jUnitVersion = "5.8.2"
val logbackVersion = "1.2.11"

dependencies {
    api(project(":shared"))
    api(kotlin("test"))
    api(kotlin("test-junit5"))
    api("io.kotest", "kotest-assertions-core-jvm", kotestVersion)
    api("io.kotest.extensions", "kotest-assertions-arrow", kotestExtensionsVersion)
    api("io.kotest", "kotest-runner-junit5", kotestVersion)
    api("io.kotest", "kotest-property", kotestVersion)
    api("io.mockk", "mockk", mockkVersion)
    api("org.junit.jupiter", "junit-jupiter-api", jUnitVersion)
    api("ch.qos.logback", "logback-classic", logbackVersion)
    api("io.kotest.extensions", "kotest-extensions-testcontainers", "1.0.1")
    api("org.testcontainers", "testcontainers", "1.16.2")
}
