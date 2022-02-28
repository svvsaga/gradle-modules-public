package no.vegvesen.saga.modules.ktor

import io.ktor.client.HttpClient
import io.ktor.client.HttpClientConfig
import io.ktor.client.engine.HttpClientEngineConfig
import io.ktor.client.engine.apache.Apache
import io.ktor.client.engine.cio.CIO
import io.ktor.client.features.compression.ContentEncoding
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import kotlinx.serialization.json.Json

fun HttpClientConfig<out HttpClientEngineConfig>.installKotlinxSerialization() {
    install(JsonFeature) {
        serializer = KotlinxSerializer(
            Json {
                ignoreUnknownKeys = true
            }
        )
    }
}

fun createCIOHttpClientWithKotlinxSerialization(): HttpClient {
    return HttpClient(CIO) {
        installKotlinxSerialization()
    }
}

fun createApacheHttpClient() = HttpClient(Apache) {
    engine {
        socketTimeout = 60 * 1000
        connectionRequestTimeout = 60 * 1000
        connectTimeout = 60 * 1000
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