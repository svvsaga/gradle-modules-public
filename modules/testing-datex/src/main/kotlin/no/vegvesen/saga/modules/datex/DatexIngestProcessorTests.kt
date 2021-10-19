package no.vegvesen.saga.modules.datex

import com.google.cloud.storage.StorageOptions
import io.kotest.assertions.arrow.either.shouldBeLeftOfType
import io.kotest.assertions.arrow.either.shouldBeRight
import io.kotest.core.spec.style.stringSpec
import io.kotest.matchers.collections.shouldHaveSize
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import io.kotest.matchers.string.shouldEndWith
import io.kotest.matchers.string.shouldStartWith
import io.ktor.client.HttpClient
import io.ktor.client.engine.mock.MockEngine
import io.ktor.client.engine.mock.respond
import no.vegvesen.saga.modules.gcp.secretmanager.SecretManagerUtils
import no.vegvesen.saga.modules.gcp.storage.GcpBlobStorage
import no.vegvesen.saga.modules.ktor.createApacheHttpClient
import no.vegvesen.saga.modules.shared.ContentType
import no.vegvesen.saga.modules.shared.blobstorage.StoragePath
import no.vegvesen.saga.modules.shared.functions.SimpleFunctionError
import no.vegvesen.saga.modules.shared.kvstore.InMemoryKVStore
import no.vegvesen.saga.modules.shared.services.DeadLetterStorage

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
            blobStorage.listFiles(ingestBucket).shouldBeRight { files ->
                files.shouldHaveSize(1)
                val file = files[0]
                file.contentType shouldBe ContentType.Xml
                file.contentEncoding shouldBe "gzip"
                file.customTime.shouldNotBeNull()
                val storagePath = StoragePath(ingestBucket, file.fileName)
                blobStorage.loadFileAsString(storagePath) shouldBeRight {
                    it shouldStartWith "<d2LogicalModel"
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

            result.shouldBeLeftOfType<SimpleFunctionError.UnexpectedError>()
            storage.list(ingestBucket).iterateAll() shouldHaveSize 0
            val deadLetterFiles = storage.list(deadLetterBucket).iterateAll()
            deadLetterFiles shouldHaveSize 1
            val file = deadLetterFiles.first()
            file.blobId.name shouldEndWith ".xml"
            file.contentEncoding shouldBe "gzip"
            String(storage.readAllBytes(file.blobId)) shouldBe "aResponse"
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

            result.shouldBeLeftOfType<SimpleFunctionError.UnexpectedError>()
            storage.list(ingestBucket).iterateAll() shouldHaveSize 0
            val deadLetterFiles = storage.list(deadLetterBucket).iterateAll()
            deadLetterFiles shouldHaveSize 1
            val file = deadLetterFiles.first()
            file.blobId.name shouldEndWith ".xml"
            file.contentEncoding shouldNotBe "gzip"
            String(storage.readAllBytes(file.blobId)) shouldBe "aResponse"
        }
    }

fun testDatexIngestProcessor(projectId: String, datexUrl: String, ingestBucket: String, deadLetterBucket: String) =
    DatexSettings(
        datexUrl,
        SecretManagerUtils.fetchSecretString(projectId, "datex_username_prod"),
        SecretManagerUtils.fetchSecretString(projectId, "datex_password_prod")
    ).let { datexSettings -> testDatexIngestProcessor(datexSettings, ingestBucket, deadLetterBucket) }
