package no.vegvesen.saga.modules.datex

import arrow.core.right
import io.kotest.assertions.arrow.core.shouldBeLeft
import io.kotest.assertions.arrow.core.shouldBeRight
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeTypeOf
import io.ktor.client.HttpClient
import io.ktor.client.engine.mock.MockEngine
import io.ktor.client.engine.mock.respond
import io.ktor.client.engine.mock.respondError
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders
import io.ktor.http.HttpStatusCode
import io.ktor.http.content.LastModifiedVersion
import io.ktor.http.content.VersionCheckResult
import io.ktor.http.headersOf
import io.mockk.every
import io.mockk.mockk
import no.vegvesen.saga.modules.shared.XmlString
import no.vegvesen.saga.modules.shared.toGMTDate
import no.vegvesen.saga.modules.shared.toHttpDateString
import no.vegvesen.saga.modules.shared.toXmlString
import no.vegvesen.saga.modules.testing.shouldBeRightAnd
import java.time.Instant
import java.time.ZonedDateTime
import java.time.temporal.ChronoUnit
import java.util.Base64

class DatexClientTests : AnnotationSpec() {
    private val testUsername = "username"
    private val testPassword = "password"
    private val testDateLastModified = Instant.now().truncatedTo(ChronoUnit.SECONDS)
    private val expectedAuth =
        Base64.getEncoder().encode(("$testUsername:$testPassword").toByteArray()).toString(Charsets.UTF_8)

    private val testUrl = "https://testnonexistingdomain.com/GetSituation"
    private val testDatexDocument =
        XmlString("Datex document<publicationTime>2021-01-01T00:00:00+02:00</publicationTime>")

    private val datexValidator = mockk<DatexValidator> {
        every { validateDatexDoc(XmlString(any())) } returns DatexVersion.DATEX_2.right()
    }

    private val ktorTestHttpClient = HttpClient(MockEngine) {
        engine {
            addHandler { request ->
                when (request.url.toString()) {
                    testUrl -> if (request.headers.contains("Authorization", "Basic $expectedAuth")) {
                        when (LastModifiedVersion(testDateLastModified.toGMTDate()).check(request.headers)) {
                            VersionCheckResult.OK -> {
                                val responseHeaders = headersOf(
                                    HttpHeaders.ContentType to listOf(ContentType.Text.Xml.toString()),
                                    HttpHeaders.LastModified to listOf(testDateLastModified.toHttpDateString())
                                )
                                respond(testDatexDocument.value, headers = responseHeaders)
                            }
                            VersionCheckResult.NOT_MODIFIED -> {
                                respond("", HttpStatusCode.NotModified)
                            }
                            VersionCheckResult.PRECONDITION_FAILED -> {
                                respondError(HttpStatusCode.PreconditionFailed)
                            }
                        }
                    } else respondError(HttpStatusCode.Unauthorized)
                    else -> error("Unhandled ${request.url}")
                }
            }
        }
    }

    @Test
    suspend fun `DatexRepository should always give Datex document when running read() without date param with correct auth`() {
        val repository = DatexClient(
            ktorTestHttpClient,
            DatexSettings(testUrl, testUsername, testPassword),
            datexValidator
        )
        val result = repository.read()

        result shouldBeRightAnd {
            it.document shouldBe testDatexDocument
        }
    }

    @Test
    suspend fun `DatexRepository should return auth error when not authenticating correctly with Datex service`() {
        val repository = DatexClient(
            ktorTestHttpClient,
            DatexSettings(testUrl, "wrong username", "wrong password"),
            datexValidator
        )
        val result = repository.read()

        result.shouldBeLeft().shouldBeTypeOf<DatexError.AuthError>()
    }

    @Test
    suspend fun `DatexRepository should return no data available when no data after given date is available from web server`() {
        val testDate = testDateLastModified.plusSeconds(10)

        val result = DatexClient(
            ktorTestHttpClient,
            DatexSettings(testUrl, testUsername, testPassword),
            datexValidator
        )
            .read(testDate)

        result.shouldBeLeft().shouldBeTypeOf<DatexError.NoNewDataAvailable>()
    }

    @Test
    suspend fun `DatexRepository should give Datex document when new data after given date is available`() {
        val testDate = testDateLastModified.minusSeconds(10)

        val result = DatexClient(
            ktorTestHttpClient,
            DatexSettings(testUrl, testUsername, testPassword),
            datexValidator
        )
            .read(testDate)

        result shouldBeRightAnd {
            it.document shouldBe testDatexDocument
        }
    }

    @Test
    suspend fun `DatexRepository should give last modified date when header available`() {
        val result = DatexClient(
            ktorTestHttpClient,
            DatexSettings(testUrl, testUsername, testPassword),
            datexValidator
        ).read()

        result shouldBeRightAnd {
            it.lastModified shouldBe testDateLastModified
        }
    }

    @Test
    suspend fun `fails with DeliveryBreak if deliveryBreak is returned from Datex`() {
        val deliveryBreakXml = """
            <d2LogicalModel xmlns="http://datex2.eu/schema/2/2_0" modelBaseVersion="2"><exchange><deliveryBreak>true</deliveryBreak><supplierIdentification><country>no</country><nationalIdentifier>Statens Vegvesen</nationalIdentifier></supplierIdentification></exchange></d2LogicalModel>
        """.trim()
        val httpClient = HttpClient(MockEngine) {
            engine {
                addHandler {
                    respond(deliveryBreakXml)
                }
            }
        }
        val testSubject = DatexClient(
            httpClient,
            DatexSettings(testUrl, testUsername, testPassword),
            datexValidator
        )

        val result = testSubject.read()

        result shouldBeLeft DatexError.DeliveryBreak
    }

    @Test
    fun `can read publication time from Datex 3 publication`() {
        DatexClient.getPublicationTime(
            """<?xml version="1.0"?>
<ns11:messageContainer xmlns="http://datex2.eu/schema/3/exchangeInformation" xmlns:ns2="http://datex2.eu/schema/3/common" xmlns:ns3="http://datex2.eu/schema/3/dataDictionaryExtension" xmlns:ns4="http://datex2.eu/schema/3/cctvExtension" xmlns:ns5="http://datex2.eu/schema/3/locationReferencing" xmlns:ns6="http://datex2.eu/schema/3/alertCLocationCodeTableExtension" xmlns:ns7="http://datex2.eu/schema/3/extension" xmlns:ns8="http://datex2.eu/schema/3/situation" xmlns:ns9="http://datex2.eu/schema/3/roadTrafficData" xmlns:ns10="http://datex2.eu/schema/3/vms" xmlns:ns11="http://datex2.eu/schema/3/messageContainer" xmlns:ns12="http://datex2.eu/schema/3/informationManagement" modelBaseVersion="3">
  <ns11:payload xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="ns8:SituationPublication" lang="no" modelBaseVersion="3">
    <ns2:feedType>FULL</ns2:feedType>
    <ns2:publicationTime>2022-02-23T15:26:42+01:00</ns2:publicationTime>
    <ns2:publicationCreator>
      <ns2:country>no</ns2:country>
      <ns2:nationalIdentifier>NPRA</ns2:nationalIdentifier>""".toXmlString()
        ) shouldBeRight ZonedDateTime.parse("2022-02-23T15:26:42+01:00").toInstant()
    }
}
