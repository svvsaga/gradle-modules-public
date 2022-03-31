package no.vegvesen.saga.modules.datex

import arrow.core.Either
import arrow.core.flatMap
import arrow.core.left
import arrow.core.right
import arrow.core.rightIfNotNull
import io.ktor.client.HttpClient
import io.ktor.client.features.ResponseException
import io.ktor.client.request.accept
import io.ktor.client.request.get
import io.ktor.client.request.header
import io.ktor.client.statement.HttpResponse
import io.ktor.client.statement.readText
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders
import io.ktor.http.HttpStatusCode
import io.ktor.http.ifModifiedSince
import no.vegvesen.saga.modules.shared.XmlString
import no.vegvesen.saga.modules.shared.toInstantFromHttpDateString
import no.vegvesen.saga.modules.shared.toXmlString
import java.time.Instant
import java.time.ZonedDateTime
import java.time.format.DateTimeParseException
import java.util.Base64
import java.util.Date

data class DatexResponse(val document: XmlString, val publicationTime: Instant, val lastModified: Instant?)

data class DatexSettings(val datexUrl: String, val username: String, val password: String)

open class DatexClient(
    private val ktorHttpClient: HttpClient,
    private val settings: DatexSettings,
    private val validator: DatexValidator
) {
    open suspend fun read(onlyModificationsSince: Instant? = null): Either<DatexError, DatexResponse> =
        runHttpGetRequest(onlyModificationsSince).flatMap { httpResponse ->
            when (val status = httpResponse.status) {
                HttpStatusCode.NotModified -> DatexError.NoNewDataAvailable.left()
                HttpStatusCode.Unauthorized, HttpStatusCode.Forbidden ->
                    DatexError.AuthError(
                        httpResponse.toString(),
                        status.value
                    ).left()
                else -> {
                    val content = httpResponse.readText(Charsets.UTF_8).toXmlString()
                    validator.validateDatexDoc(content)
                        .flatMap { getPublicationTime(content) }
                        .map { publicationTime ->
                            DatexResponse(
                                content,
                                publicationTime,
                                httpResponse.headers[HttpHeaders.LastModified]?.toInstantFromHttpDateString()
                            )
                        }
                        .mapLeft {
                            if (it is DatexError.MissingPublicationTimeError && containsDeliveryBreak(
                                    content.value.take(2000)
                                )
                            )
                                DatexError.DeliveryBreak
                            else
                                it
                        }
                }
            }
        }.mapLeft { ex ->
            when (ex) {
                is DatexError.HttpError ->
                    when (ex.httpCode) {
                        HttpStatusCode.NotModified.value -> DatexError.NoNewDataAvailable
                        HttpStatusCode.Unauthorized.value, HttpStatusCode.Forbidden.value -> DatexError.AuthError(
                            ex.message,
                            ex.httpCode
                        )
                        else -> ex
                    }
                else -> ex
            }
        }

    private fun containsDeliveryBreak(content: String) =
        content.contains(DeliveryBreakSubstrings.Datex2) || DeliveryBreakSubstrings.Datex3Regex.containsMatchIn(content)

    private suspend fun runHttpGetRequest(
        onlyModificationsSince: Instant?
    ): Either<DatexError, HttpResponse> = Either.catch {
        ktorHttpClient.get<HttpResponse>(settings.datexUrl) {
            val auth = Base64.getEncoder().encode(("${settings.username}:${settings.password}").toByteArray())
                .toString(Charsets.UTF_8)
            header("Authorization", "Basic $auth")
            accept(ContentType.Text.Xml)
            onlyModificationsSince?.let(Date::from)?.also(::ifModifiedSince)
        }
    }.mapLeft { fe ->
        when (fe) {
            is ResponseException -> DatexError.HttpError(fe.toString(), fe.response.status.value)
            else -> DatexError.Exception(fe.toString(), fe)
        }
    }

    companion object {
        private val publicationTimeRegex =
            Regex("<(\\w*?:)?publicationTime>(?<publicationTime>.*)</(\\w*?):?publicationTime>")

        fun getPublicationTime(document: XmlString): Either<DatexError.MissingPublicationTimeError, Instant> =
            publicationTimeRegex.find(document.value)?.groups?.get("publicationTime")?.value
                .rightIfNotNull {
                    DatexError.MissingPublicationTimeError(
                        "The Datex message did not have any <publicationTime> element.",
                        document
                    )
                }
                .flatMap {
                    try {
                        ZonedDateTime.parse(it).toInstant().right()
                    } catch (exception: DateTimeParseException) {
                        DatexError.MissingPublicationTimeError(
                            "The Datex message had an invalid <publicationTime> element.",
                            document
                        ).left()
                    }
                }

        object DeliveryBreakSubstrings {
            const val Datex2 = "<deliveryBreak>true</deliveryBreak>"
            val Datex3Regex = Regex("""<\w*:?value lang="en-us">Delivery break</\w*:?value>""")
            const val Datex3 = """<value lang="en-us">Delivery break</value>"""
        }
    }
}
