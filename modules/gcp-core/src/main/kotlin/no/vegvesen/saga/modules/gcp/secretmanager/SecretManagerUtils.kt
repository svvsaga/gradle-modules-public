package no.vegvesen.saga.modules.gcp.secretmanager

import com.google.cloud.secretmanager.v1.SecretManagerServiceClient
import com.google.cloud.secretmanager.v1.SecretVersionName

object SecretManagerUtils {
    private fun SecretManagerServiceClient.getSecretString(project: String, secret: String): String =
        this.accessSecretVersion(
            SecretVersionName.of(project, secret, "latest"),
        ).payload.data.toStringUtf8()

    fun fetchSecretString(project: String, secret: String): String =
        SecretManagerServiceClient.create().use {
            it.getSecretString(project, secret)
        }
}
