package no.vegvesen.saga.modules.shared.serializers.test

import io.kotest.matchers.shouldBe
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import no.vegvesen.saga.modules.shared.SqlPoint
import no.vegvesen.saga.modules.shared.serializers.SqlPointSerializer
import org.junit.jupiter.api.Test

@ExperimentalSerializationApi
class SqlPointSerializerTests {
    @Test
    fun `can serialize and deserialize SqlPoint`() {
        val sqlPoint = SqlPoint(23.4321f, 10.1431f)

        val serialized = Json.encodeToString(SqlPointSerializer, sqlPoint)
        val deserialized = Json.decodeFromString(SqlPointSerializer, serialized)

        serialized shouldBe "\"POINT (10.1431 23.4321)\""
        deserialized shouldBe sqlPoint
    }
}
