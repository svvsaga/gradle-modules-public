package no.vegvesen.saga.modules.ktor

import io.ktor.client.HttpClient
import io.ktor.client.HttpClientConfig
import io.ktor.client.engine.HttpClientEngineConfig
import io.ktor.client.engine.apache.Apache
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.compression.ContentEncoding
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

fun HttpClientConfig<out HttpClientEngineConfig>.installKotlinxSerialization() {
    install(ContentNegotiation) {
        json(
            Json {
                ignoreUnknownKeys = true
            }
        )
    }
}

fun createCIOHttpClientWithKotlinxSerialization(): HttpClient = HttpClient(CIO) {
    installKotlinxSerialization()
}

fun createApacheHttpClient(
    httpTimeoutSettings: HttpTimeoutSettings = HttpTimeoutSettings()
) = HttpClient(Apache) {
    engine {
        socketTimeout = httpTimeoutSettings.socketTimeoutMillis
        connectionRequestTimeout = httpTimeoutSettings.requestTimeoutMillis
        connectTimeout = httpTimeoutSettings.connectTimeoutMillis
    }
}

fun createApacheHttpClientWithKotlinxSerialization(useContentEncoding: Boolean = true): HttpClient =
    createApacheHttpClient().config {
        installKotlinxSerialization()
        if (useContentEncoding) {
            install(ContentEncoding) {
                gzip()
                deflate()
            }
        }
    }

data class HttpTimeoutSettings(
    /* connectTimeoutMillis specifies a timeout for establishing a connection with a server. */
    val connectTimeoutMillis: Int = 10_000,
    /* requestTimeoutMillis specifies a timeout for a whole HTTP call, from sending a request to receiving a response. */
    val requestTimeoutMillis: Int = 60_000,
    /* socketTimeoutMillis specifies a timeout for the maximum time in between two data packets when exchanging data with a server. */
    val socketTimeoutMillis: Int = 10_000
)
