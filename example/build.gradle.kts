// Touch to trigger module

plugins {
    kotlin("jvm") version "1.7.20"
    id("saga-build") version "31.0.1"
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

group = "no.vegvesen.saga"
version = "1.0-SNAPSHOT"

dependencies {
    implementation(saga.shared)
}
