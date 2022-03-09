package no.vegvesen.saga.modules.datex.inttest

import arrow.core.Either
import io.kotest.assertions.arrow.core.shouldBeRight
import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.FunSpec
import io.kotest.core.spec.style.funSpec
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.collections.shouldHaveSize
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import io.kotest.matchers.string.shouldEndWith
import io.ktor.client.HttpClient
import io.ktor.client.engine.mock.MockEngine
import io.ktor.client.engine.mock.respond
import no.vegvesen.saga.modules.datex.DatexClient
import no.vegvesen.saga.modules.datex.DatexIngestProcessor
import no.vegvesen.saga.modules.datex.DatexSettings
import no.vegvesen.saga.modules.datex.DatexStorageRepository
import no.vegvesen.saga.modules.datex.DatexValidator
import no.vegvesen.saga.modules.ktor.createApacheHttpClient
import no.vegvesen.saga.modules.shared.ContentType
import no.vegvesen.saga.modules.shared.blobstorage.FileMetadata
import no.vegvesen.saga.modules.shared.blobstorage.InMemoryBlobStorage
import no.vegvesen.saga.modules.shared.blobstorage.StoragePath
import no.vegvesen.saga.modules.shared.envOrThrow
import no.vegvesen.saga.modules.shared.functions.SimpleFunctionError
import no.vegvesen.saga.modules.shared.kvstore.InMemoryKVStore
import no.vegvesen.saga.modules.shared.services.DeadLetterStorage
import no.vegvesen.saga.modules.testing.ExternalTest
import no.vegvesen.saga.modules.testing.shouldBeLeftOfType
import no.vegvesen.saga.modules.testing.shouldBeRightAnd

@Tags(ExternalTest)
class DatexIntegrationTests : FunSpec({
    testDatexEndpoint("https://www.vegvesen.no/ws/no/vegvesen/veg/trafikkpublikasjon/trafikk/2/GetSituation")
    testDatexEndpoint("https://www.vegvesen.no/ws/no/vegvesen/veg/trafikkpublikasjon/trafikk/3/GetSituation")
    testDatexEndpoint("https://www.vegvesen.no/ws/no/vegvesen/veg/trafikkpublikasjon/reisetid/2/GetTravelTimeData")
    testDatexEndpoint("https://www.vegvesen.no/ws/no/vegvesen/veg/trafikkpublikasjon/reisetid/3/GetTravelTimeData")
    testDatexEndpoint("https://www.vegvesen.no/ws/no/vegvesen/veg/trafikkpublikasjon/reisetid/2/GetPredefinedTravelTimeLocations")
    testDatexEndpoint("https://www.vegvesen.no/ws/no/vegvesen/veg/trafikkpublikasjon/reisetid/3/GetPredefinedTravelTimeLocations")
    testDatexEndpoint("https://www.vegvesen.no/ws/no/vegvesen/veg/trafikkpublikasjon/vaer/2/GetMeasuredWeatherData")
    testDatexEndpoint("https://www.vegvesen.no/ws/no/vegvesen/veg/trafikkpublikasjon/vaer/3/GetMeasuredWeatherData")
    testDatexEndpoint("https://www.vegvesen.no/ws/no/vegvesen/veg/trafikkpublikasjon/vaer/2/GetMeasurementWeatherSiteTable")
    testDatexEndpoint("https://www.vegvesen.no/ws/no/vegvesen/veg/trafikkpublikasjon/vaer/3/GetMeasurementWeatherSiteTable")
})

private fun FunSpec.testDatexEndpoint(datexEndpoint: String) {
    include(
        funSpec {
            val datexSettings = DatexSettings(datexEndpoint, envOrThrow("DATEX_USERNAME"), envOrThrow("DATEX_PASSWORD"))
            val ingestBucket = "ingest"
            val deadLetterBucket = "deadletter"
            var kvStore = InMemoryKVStore()
            val blobStorage = InMemoryBlobStorage()

            fun createDatexClient(): DatexClient = DatexClient(
                createApacheHttpClient(), datexSettings, DatexValidator()
            )

            fun createProcessor(datexClient: DatexClient, gzipped: Boolean = true): DatexIngestProcessor =
                DatexIngestProcessor(
                    datexClient,
                    DatexStorageRepository(
                        ingestBucket, "datasource", kvStore, blobStorage
                    ),
                    DeadLetterStorage(blobStorage, deadLetterBucket), gzipped = gzipped
                )

            beforeEach {
                kvStore = InMemoryKVStore()
                blobStorage.clearFiles()
            }

            context(datexSettings.datexUrl) {
                test("can retrieve and save the latest publication in gzipped XML format") {
                    val result = createProcessor(createDatexClient()).process()

                    result.shouldBeRight()
                    blobStorage.listFiles(ingestBucket).shouldBeRightAnd { files ->
                        files.shouldHaveSize(1)
                        val file = files[0]
                        file.contentType shouldBe ContentType.Xml
                        file.contentEncoding shouldBe "gzip"
                        file.customTime.shouldNotBeNull()
                        val storagePath = StoragePath(ingestBucket, file.fileName)
                        blobStorage.loadFileAsString(storagePath) shouldBeRightAnd { xml ->
                            // Optimization to avoid OutOfMemoryError
                            xml.substring(0, 20).replace(Regex("ns\\d+:"), "").substring(0, 15).let<String, Unit> {
                                listOf("<d2LogicalModel", "<messageContain").shouldContain(it)
                            }
                        }
                    }
                }

                test("erronous document from Datex is stored in deadletter") {
                    val mockHttpClient = HttpClient(MockEngine) {
                        engine {
                            addHandler {
                                respond("aResponse")
                            }
                        }
                    }
                    val datexClient = DatexClient(
                        mockHttpClient, datexSettings, DatexValidator()
                    )

                    val result = createProcessor(datexClient).process()

                    val file = result.shouldBeStoredInDeadletter(blobStorage, ingestBucket, deadLetterBucket)
                    file.contentEncoding shouldBe "gzip"
                }

                test("when processor is created with gziped=false, deadletter files are not gzipped") {
                    val mockHttpClient = HttpClient(MockEngine) {
                        engine {
                            addHandler {
                                respond("aResponse")
                            }
                        }
                    }
                    val datexClient = DatexClient(
                        mockHttpClient, datexSettings, DatexValidator()
                    )

                    val result = createProcessor(datexClient, gzipped = false).process()

                    val file = result.shouldBeStoredInDeadletter(blobStorage, ingestBucket, deadLetterBucket)
                    file.contentEncoding shouldNotBe "gzip"
                }
            }
        }
    )
}

private suspend fun Either<SimpleFunctionError, Unit>.shouldBeStoredInDeadletter(
    storage: InMemoryBlobStorage,
    ingestBucket: String,
    deadLetterBucket: String
): FileMetadata {
    shouldBeLeftOfType<SimpleFunctionError.UnexpectedError>()
    storage.listFiles(ingestBucket).shouldBeRightAnd { it shouldHaveSize 0 }
    val files = storage.listFiles(deadLetterBucket).shouldBeRightAnd { deadLetterFiles ->
        deadLetterFiles shouldHaveSize 1
        val file = deadLetterFiles.single()
        file.fileName shouldEndWith ".xml"
        storage.loadFile(StoragePath(deadLetterBucket, file.fileName))
            .shouldBeRightAnd { String(it) shouldBe "aResponse" }
    }
    return files.single()
}
