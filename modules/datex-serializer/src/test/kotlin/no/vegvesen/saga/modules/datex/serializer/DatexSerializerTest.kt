package no.vegvesen.saga.modules.datex.serializer

import eu.datex2.schema._3.locationreferencing.IsoNamedArea
import eu.datex2.schema._3.locationreferencing.LinearLocation
import eu.datex2.schema._3.locationreferencing.LocationGroupByList
import eu.datex2.schema._3.situation.SituationPublication
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeTypeOf
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

    test("can deserialize Datex 3 document with subdivisionCode") {
        val datex3Xml = loadStringResourceOrThrow("datex3-sample.xml")

        val result = DatexSerializer.deserialize(datex3Xml.toXmlString())

        result.shouldBeRightOfType<Datex3Result>().also {
            val payloadPublication = it.root.payload[0]
            payloadPublication.shouldBeTypeOf<SituationPublication>()
            payloadPublication.publicationTime.toKotlinInstant() shouldBe Instant.parse("2022-02-23T15:26:42+01:00")
            val locationReference = payloadPublication.situation[0].situationRecord[0].locationReference
            locationReference.shouldBeTypeOf<LocationGroupByList>()
            val location = locationReference.locationContainedInGroup.first()
            location.shouldBeTypeOf<LinearLocation>()
            val namedArea = location.supplementaryPositionalDescription.namedArea
            namedArea.shouldBeTypeOf<IsoNamedArea>()
            namedArea.subdivisionCode shouldBe "34"
        }
    }
})
