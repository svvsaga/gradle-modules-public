plugins {
    java
    id("com.intershop.gradle.jaxb") version "5.1.0"
}

// binding.xjb needed to avoid name collision between extensions with underscores when generating POJO from XSD.
jaxb {
    javaGen {
        register("Datex3") {
            schema = file(
                "../datex-schemas/src/main/resources/DatexII_3/DATEXII_3_MessageContainer.xsd",
            )
            binding = file("binding.xjb")
            outputDir = file("src/main/java")
            header = false
            args = listOf("-npa")
        }
        register("Datex2") {
            schema = file(
                "../datex-schemas/src/main/resources/DATEXIISchema_2_2_3.xsd",
            )
            binding = file("binding.xjb")
            outputDir = file("src/main/java")
            header = false
            args = listOf("-npa")
        }
    }
}

// Necessary for unmarshalling of Datex 3 files to work
tasks.register("addRootElement") {
    doLast {
        exec {
            commandLine(
                "sed",
                "-i.bak",
                "s/^public class MessageContainer/@jakarta\\.xml\\.bind\\.annotation\\.XmlRootElement public class MessageContainer/",
                "src/main/java/eu/datex2/schema/_3/messagecontainer/MessageContainer.java",
            )
        }
        exec {
            commandLine(
                "rm",
                "src/main/java/eu/datex2/schema/_3/messagecontainer/MessageContainer.java.bak"
            )
        }
    }
}

// Handle duplicate ServiceRequestCondition.java
tasks.withType<Jar> {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

tasks.register<Delete>("cleanDatex") {
    group = "datex"
    delete(
        fileTree("src/main/java")
    )
}

tasks.getByName("jaxb") {
    dependsOn("cleanDatex")
}

tasks.getByName("jaxbJavaGenDatex3") {
    finalizedBy("addRootElement")
}

dependencies {
    implementation("jakarta.xml.bind", "jakarta.xml.bind-api", "3.0.1")
    implementation("org.glassfish.jaxb", "jaxb-runtime", "3.0.2")

    implementation(project(":datex-schemas"))
    implementation(project(":shared"))
    testImplementation(project(":testing"))
}
