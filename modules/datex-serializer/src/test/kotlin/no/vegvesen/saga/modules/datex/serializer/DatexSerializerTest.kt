package no.vegvesen.saga.modules.datex.serializer

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import kotlinx.datetime.Instant
import no.vegvesen.saga.modules.shared.toKotlinInstant
import no.vegvesen.saga.modules.shared.toXmlString
import no.vegvesen.saga.modules.testing.loadStringResourceOrThrow
import no.vegvesen.saga.modules.testing.shouldBeRightOfType

class DatexSerializerTest : FunSpec({

    test("can deserialize Datex 2 document") {
        val datex2Xml = loadStringResourceOrThrow("datex2-sample.xml")

        val result = DatexSerializer.deserialize(datex2Xml.toXmlString())

        result.shouldBeRightOfType<Datex2Result>().also {
            it.root.payloadPublication.publicationTime.toKotlinInstant() shouldBe Instant.parse("2022-02-23T15:27:53+01:00")
        }
    }

    test("can deserialize Datex 3 document") {
        val datex3Xml = loadStringResourceOrThrow("datex3-sample.xml")

        val result = DatexSerializer.deserialize(datex3Xml.toXmlString())

        result.shouldBeRightOfType<Datex3Result>().also {
            it.root.payload[0].publicationTime.toKotlinInstant() shouldBe Instant.parse("2022-02-23T15:26:42+01:00")
        }
    }
})
