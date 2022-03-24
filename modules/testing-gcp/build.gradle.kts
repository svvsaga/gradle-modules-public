dependencies {
    api(project(":testing"))
    api(project(":gcp-core"))
    api(project(":gcp-bigquery"))
    api("org.testcontainers", "gcloud", "1.15.3")
}
