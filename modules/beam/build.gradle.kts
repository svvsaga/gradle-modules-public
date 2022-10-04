val beamVersion = "2.41.0"

dependencies {
    api("org.apache.beam", "beam-runners-google-cloud-dataflow-java", beamVersion)
    api("org.apache.beam", "beam-sdks-java-core", beamVersion)
    api("org.apache.beam", "beam-sdks-java-io-google-cloud-platform", beamVersion)

    api("com.google.guava:guava:31.1-jre") {
        because("Needed by Apache Beam. (https://cloud.google.com/java/docs/bom)")
    }

    testImplementation("org.apache.beam", "beam-runners-direct-java", beamVersion)
}
