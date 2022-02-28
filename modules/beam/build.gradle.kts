val beamVersion = "2.31.0"

dependencies {
    api("org.apache.beam", "beam-runners-google-cloud-dataflow-java", beamVersion)
    api("org.apache.beam", "beam-sdks-java-core", beamVersion)
    api("org.apache.beam", "beam-sdks-java-io-google-cloud-platform", beamVersion)

    api("com.google.guava:guava:30.1.1-jre") {
        because("Needed by Apache Beam. (https://github.com/GoogleCloudPlatform/cloud-opensource-java/wiki/The-Google-Cloud-Platform-Libraries-BOM#guava-versions--jre-or--android)")
    }

    testImplementation("org.apache.beam", "beam-runners-direct-java", beamVersion)
}