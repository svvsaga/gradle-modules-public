package no.vegvesen.saga.modules.gcp

import com.google.cloud.Timestamp.parseTimestamp
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import java.time.Instant
import com.google.protobuf.Timestamp as ProtobufTimestamp
import kotlinx.datetime.Instant as KotlinInstant

class TimestampExtensionsTest : FunSpec({
    val isoString = "2022-01-01T12:00:00.12345Z"
    val instant = Instant.parse(isoString)
    val kotlinInstant = KotlinInstant.parse(isoString)

    val cloudTimestamp = parseTimestamp(isoString)
    val protobufTimestamp =
        ProtobufTimestamp.newBuilder().setSeconds(instant.epochSecond).setNanos(instant.nano).build()

    test("cloud timestamp toInstant") {
        cloudTimestamp.toInstant() shouldBe instant
    }

    test("protobuf timestamp toInstant") {
        protobufTimestamp.toInstant() shouldBe instant
    }

    test("cloud timestamp toKotlinInstant") {
        cloudTimestamp.toKotlinInstant() shouldBe kotlinInstant
    }

    test("protobuf timestamp toKotlinInstant") {
        protobufTimestamp.toKotlinInstant() shouldBe kotlinInstant
    }
})
