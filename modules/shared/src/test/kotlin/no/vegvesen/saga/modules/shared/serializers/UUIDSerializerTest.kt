package no.vegvesen.saga.modules.shared.serializers

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import java.util.UUID
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json

@ExperimentalSerializationApi
class UUIDSerializerTest : FunSpec({
    test("can serialize and deserialize UUID") {
        val uuid = UUID.randomUUID()

        val encoded = Json.encodeToString(UUIDSerializer, uuid)
        val decoded = Json.decodeFromString(UUIDSerializer, encoded)

        decoded shouldBe uuid
    }
})
