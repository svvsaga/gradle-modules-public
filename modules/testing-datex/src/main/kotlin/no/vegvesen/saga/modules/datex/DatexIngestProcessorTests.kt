package no.vegvesen.saga.modules.datex

import arrow.core.Either
import com.google.cloud.storage.Blob
import com.google.cloud.storage.Storage
import com.google.cloud.storage.StorageOptions
import io.kotest.assertions.arrow.core.shouldBeRight
import io.kotest.core.spec.style.stringSpec
import io.kotest.matchers.collections.shouldBeOneOf
import io.kotest.matchers.collections.shouldHaveSize
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import io.kotest.matchers.string.shouldEndWith
import io.ktor.client.HttpClient
import io.ktor.client.engine.mock.MockEngine
import io.ktor.client.engine.mock.respond
import no.vegvesen.saga.modules.gcp.storage.GcpBlobStorage
import no.vegvesen.saga.modules.ktor.createApacheHttpClient
import no.vegvesen.saga.modules.shared.ContentType
import no.vegvesen.saga.modules.shared.blobstorage.StoragePath
import no.vegvesen.saga.modules.shared.functions.SimpleFunctionError
import no.vegvesen.saga.modules.shared.kvstore.InMemoryKVStore
import no.vegvesen.saga.modules.shared.services.DeadLetterStorage
import no.vegvesen.saga.modules.testing.shouldBeLeftOfType
import no.vegvesen.saga.modules.testing.shouldBeRightAnd

fun testDatexIngestProcessor(datexSettings: DatexSettings, ingestBucket: String, deadLetterBucket: String) =
    stringSpec {
        var kvStore = InMemoryKVStore()
        val storage = StorageOptions.getDefaultInstance().service
        val blobStorage = GcpBlobStorage.create()

        fun createDatexClient(): DatexClient = DatexClient(
            createApacheHttpClient(),
            datexSettings,
            DatexValidator()
        )

        fun createProcessor(datexClient: DatexClient, gzipped: Boolean = true): DatexIngestProcessor =
            DatexIngestProcessor(
                datexClient,
                DatexStorageRepository(
                    ingestBucket,
                    "datasource",
                    kvStore,
                    blobStorage
                ),
                DeadLetterStorage(blobStorage, deadLetterBucket),
                gzipped = gzipped
            )

        beforeEach {
            kvStore = InMemoryKVStore()
            storage.list(ingestBucket).iterateAll().map { it.delete() }
            storage.list(deadLetterBucket).iterateAll().map { it.delete() }
        }

        "can retrieve and save the latest publication in gzipped XML format" {
            val result = createProcessor(createDatexClient()).process()

            result.shouldBeRight()
            blobStorage.listFiles(ingestBucket).shouldBeRightAnd { files ->
                files.shouldHaveSize(1)
                val file = files[0]
                file.contentType shouldBe ContentType.Xml
                file.contentEncoding shouldBe "gzip"
                file.customTime.shouldNotBeNull()
                val storagePath = StoragePath(ingestBucket, file.fileName)
                blobStorage.loadFileAsString(storagePath) shouldBeRightAnd {
                    // Optimization to avoid OutOfMemoryError
                    it.substring(0, 20).replace(Regex("ns\\d+:"), "")
                        .substring(0, 15) shouldBeOneOf listOf("<d2LogicalModel", "<messageContain")
                }
            }
        }

        "erronous document from Datex is stored in deadletter" {
            val mockHttpClient = HttpClient(MockEngine) {
                engine {
                    addHandler {
                        respond("aResponse")
                    }
                }
            }
            val datexClient = DatexClient(
                mockHttpClient,
                datexSettings,
                DatexValidator()
            )

            val result = createProcessor(datexClient).process()

            val file = result.shouldBeStoredInDeadletter(storage, ingestBucket, deadLetterBucket)
            file.contentEncoding shouldBe "gzip"
        }

        "when processor is created with gziped=false, deadletter files are not gzipped" {
            val mockHttpClient = HttpClient(MockEngine) {
                engine {
                    addHandler {
                        respond("aResponse")
                    }
                }
            }
            val datexClient = DatexClient(
                mockHttpClient,
                datexSettings,
                DatexValidator()
            )

            val result = createProcessor(datexClient, gzipped = false).process()

            val file = result.shouldBeStoredInDeadletter(storage, ingestBucket, deadLetterBucket)
            file.contentEncoding shouldNotBe "gzip"
        }
    }

private fun Either<SimpleFunctionError, Unit>.shouldBeStoredInDeadletter(
    storage: Storage,
    ingestBucket: String,
    deadLetterBucket: String
): Blob {
    shouldBeLeftOfType<SimpleFunctionError.UnexpectedError>()
    storage.list(ingestBucket).iterateAll() shouldHaveSize 0
    val deadLetterFiles = storage.list(deadLetterBucket).iterateAll()
    deadLetterFiles shouldHaveSize 1
    val file = deadLetterFiles.first()
    file.blobId.name shouldEndWith ".xml"
    String(storage.readAllBytes(file.blobId)) shouldBe "aResponse"
    return file
}
