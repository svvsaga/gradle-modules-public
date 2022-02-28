dependencies {
    api(project(":testing"))
    api(project(":gcp"))
    api(project(":gcp-bigquery"))
    api("org.testcontainers", "gcloud", "1.15.3")
}
