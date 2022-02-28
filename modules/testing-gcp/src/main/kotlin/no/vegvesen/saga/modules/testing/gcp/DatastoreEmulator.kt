package no.vegvesen.saga.modules.testing.gcp

import org.testcontainers.containers.DatastoreEmulatorContainer
import org.testcontainers.utility.DockerImageName

class DatastoreEmulator :
    DatastoreEmulatorContainer(DockerImageName.parse("gcr.io/google.com/cloudsdktool/cloud-sdk:emulators"))