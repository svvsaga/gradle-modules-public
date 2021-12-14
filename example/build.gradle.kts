plugins {
    kotlin("jvm") version "1.6.10"
    id("saga-build") version "1.3.10"
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

group = "no.vegvesen.saga"
version = "1.0-SNAPSHOT"

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(saga.shared)
}
