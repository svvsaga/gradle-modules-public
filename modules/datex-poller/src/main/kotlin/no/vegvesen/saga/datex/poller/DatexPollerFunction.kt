package no.vegvesen.saga.datex.poller

import no.vegvesen.saga.modules.datex.DatexClient
import no.vegvesen.saga.modules.datex.DatexIngestProcessor
import no.vegvesen.saga.modules.datex.DatexSettings
import no.vegvesen.saga.modules.datex.DatexStorageRepository
import no.vegvesen.saga.modules.datex.DatexValidator
import no.vegvesen.saga.modules.gcp.datastore.GcpDatastoreKVStore
import no.vegvesen.saga.modules.gcp.datastore.createDatastore
import no.vegvesen.saga.modules.gcp.functions.GcpHttpFunction
import no.vegvesen.saga.modules.gcp.secretmanager.SecretManagerUtils
import no.vegvesen.saga.modules.gcp.storage.GcpBlobStorage
import no.vegvesen.saga.modules.ktor.createApacheHttpClient
import no.vegvesen.saga.modules.shared.services.DeadLetterStorage

/**
 * @param datexUsernamePasswordKey Name of the secret in GCP Secret Manager that holds the Datex username
 * @param datexUsernameSecretKey Name of the secret in GCP Secret Manager that holds the Datex password
 * @param datexEndpointUrl Which Datex endpoint to fetch from
 * @param dataSourceName Name for the data source, e.g. "veglogg-datex3". Used to prefix publications and Datastore storage
 * @param publicationsBucket Name of the bucket in which to store ingested publications, without gs://-prefix
 * @param deadLetterBucket Name of the bucket in which to store ingested documents that do not validate, without gs://-prefix
 */
abstract class DatexPollerFunction(
    private val datexUsernameSecretKey: String,
    private val datexUsernamePasswordKey: String,
    private val datexEndpointUrl: String,
    private val dataSourceName: String,
    private val publicationsBucket: String,
    private val deadLetterBucket: String,
) : GcpHttpFunction(
    {
        createProcessor(
            datexUsernameSecretKey,
            datexUsernamePasswordKey,
            datexEndpointUrl,
            dataSourceName,
            publicationsBucket,
            deadLetterBucket
        ).process()
    }
) {
    companion object {
        fun createProcessor(
            datexUsernameSecretKey: String,
            datexUsernamePasswordKey: String,
            datexEndpointUrl: String,
            dataSourceName: String,
            publicationsBucket: String,
            deadLetterBucket: String,
        ): DatexIngestProcessor {
            val datexUsername = SecretManagerUtils.fetchSecretString(projectId, datexUsernameSecretKey)
            val datexPassword = SecretManagerUtils.fetchSecretString(projectId, datexUsernamePasswordKey)
            val datexClient =
                DatexClient(
                    createApacheHttpClient(),
                    DatexSettings(datexEndpointUrl, datexUsername, datexPassword),
                    DatexValidator()
                )
            val blobStorage = GcpBlobStorage.create()
            val datexStorage = DatexStorageRepository(
                publicationsBucket,
                dataSourceName,
                GcpDatastoreKVStore(dataSourceName, createDatastore(projectId)),
                blobStorage
            )
            val deadLetterStorage = DeadLetterStorage(blobStorage, deadLetterBucket)
            return DatexIngestProcessor(datexClient, datexStorage, deadLetterStorage)
        }
    }
}
