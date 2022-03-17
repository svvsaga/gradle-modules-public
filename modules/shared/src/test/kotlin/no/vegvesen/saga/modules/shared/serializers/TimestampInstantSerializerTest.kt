package no.vegvesen.saga.modules.shared.serializers

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import kotlinx.datetime.Clock
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json

@ExperimentalSerializationApi
class TimestampInstantSerializerTest : FunSpec({
    test("can serialize and deserialize Instant as microseconds") {
        val now = Clock.System.now()

        val serialized = Json.encodeToString(TimestampInstantSerializer, now)

        val deserialized = Json.decodeFromString(TimestampInstantSerializer, serialized)

        deserialized shouldBe now
    }
})
