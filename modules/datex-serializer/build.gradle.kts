plugins {
    java
    id("com.intershop.gradle.jaxb") version "5.1.0"
}
java.sourceSets["main"].java {
    srcDir("src/generated/java")
}
jaxb {
    javaGen {
        register("Datex3") {
            schema = file(
                "../datex-schemas/src/main/resources/DatexII_3/DATEXII_3_MessageContainer.xsd",
            )
            outputDir = file("src/generated/java")
            header = false
            args = listOf("-XautoNameResolution")
        }
        register("Datex2") {
            schema = file(
                "../datex-schemas/src/main/resources/DATEXIISchema_2_2_0.xsd",
            )
            outputDir = file("src/generated/java")
            header = false
            args = listOf("-XautoNameResolution")
        }
    }
}

// Necessary for unmarshalling of Datex 3 files to work
tasks.register("postProcessDatex3") {
    doLast {
        // XmlRootElement must be added
        exec {
            commandLine(
                "sed",
                "-i.bak",
                "s/^public class MessageContainer/@jakarta\\.xml\\.bind\\.annotation\\.XmlRootElement public class MessageContainer/",
                "src/generated/java/eu/datex2/schema/_3/messagecontainer/MessageContainer.java",
            )
        }
        exec {
            commandLine(
                "rm",
                "-f",
                "src/generated/java/eu/datex2/schema/_3/messagecontainer/MessageContainer.java.bak"
            )
        }
    }
}

// Handle duplicate ServiceRequestCondition.java
tasks.withType<Jar> {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

tasks.register<Delete>("cleanGenerated") {
    delete(
        fileTree("src/generated")
    )
}

tasks.getByName("jaxb") {
    dependsOn("cleanGenerated")
}

tasks.getByName("jaxbJavaGenDatex3") {
    finalizedBy("postProcessDatex3")
}

dependencies {
    implementation("jakarta.xml.bind", "jakarta.xml.bind-api", "3.0.1")
    implementation("org.glassfish.jaxb", "jaxb-runtime", "3.0.2")

    implementation(project(":datex-schemas"))
    implementation(project(":shared"))
    testImplementation(project(":testing"))
}
