package no.vegvesen.saga.modules.datex.serializer

import eu.datex2.schema._3.locationreferencing.IsoNamedArea
import eu.datex2.schema._3.locationreferencing.LinearLocation
import eu.datex2.schema._3.locationreferencing.LocationGroupByList
import eu.datex2.schema._3.situation.SituationPublication
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeTypeOf
import kotlinx.datetime.Instant
import no.vegvesen.saga.modules.datex.DatexVersion
import no.vegvesen.saga.modules.shared.toKotlinInstant
import no.vegvesen.saga.modules.shared.toXmlString
import no.vegvesen.saga.modules.testing.loadStringResourceOrThrow
import no.vegvesen.saga.modules.testing.shouldBeLeftOfType
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

    test("fails on deliverybreak for Datex 2") {
        val deliveryBreakXml = """
            <d2LogicalModel xmlns="http://datex2.eu/schema/2/2_0" modelBaseVersion="2"><exchange><deliveryBreak>true</deliveryBreak><supplierIdentification><country>no</country><nationalIdentifier>Statens Vegvesen</nationalIdentifier></supplierIdentification></exchange></d2LogicalModel>
        """.trim()

        val result = DatexSerializer.deserialize(deliveryBreakXml.toXmlString())

        result.shouldBeLeftOfType<DeliveryBreakError>().version.shouldBe(DatexVersion.DATEX_2)
    }

    test("fails on deliverybreak for Datex 3") {
        val deliveryBreakXml = """
            <ns11:messageContainer xmlns="http://datex2.eu/schema/3/exchangeInformation" xmlns:ns2="http://datex2.eu/schema/3/common" xmlns:ns3="http://datex2.eu/schema/3/dataDictionaryExtension" xmlns:ns4="http://datex2.eu/schema/3/cctvExtension" xmlns:ns5="http://datex2.eu/schema/3/locationReferencing" xmlns:ns6="http://datex2.eu/schema/3/alertCLocationCodeTableExtension" xmlns:ns7="http://datex2.eu/schema/3/extension" xmlns:ns8="http://datex2.eu/schema/3/roadTrafficData" xmlns:ns9="http://datex2.eu/schema/3/vms" xmlns:ns10="http://datex2.eu/schema/3/situation" xmlns:ns11="http://datex2.eu/schema/3/messageContainer" xmlns:ns12="http://datex2.eu/schema/3/informationManagement" modelBaseVersion="3">
            <ns11:exchangeInformation>
            <dynamicInformation>
            <exchangeStatus _extendedValue="online"/>
            <returnInformation>
            <returnStatus _extendedValue="fail"/>
            <returnStatusReason>
            <ns2:values>
            <ns2:value lang="en-us">Delivery break</ns2:value>
            </ns2:values>
            </returnStatusReason>
            </returnInformation>
            </dynamicInformation>
            </ns11:exchangeInformation>
            </ns11:messageContainer>
        """.trimIndent()

        val result = DatexSerializer.deserialize(deliveryBreakXml.toXmlString())

        result.shouldBeLeftOfType<DeliveryBreakError>().version.shouldBe(DatexVersion.DATEX_3)
    }

    test("fails on missing payload for Datex 2") {
        val xml = """
            <d2LogicalModel xmlns="http://datex2.eu/schema/2/2_0" modelBaseVersion="2"></d2LogicalModel>
        """.trim()

        val result = DatexSerializer.deserialize(xml.toXmlString())

        result.shouldBeLeftOfType<MissingPayloadError>().version.shouldBe(DatexVersion.DATEX_2)
    }

    test("fails on missing payload for Datex 3") {
        val xml = """
            <ns11:messageContainer xmlns="http://datex2.eu/schema/3/exchangeInformation" xmlns:ns2="http://datex2.eu/schema/3/common" xmlns:ns3="http://datex2.eu/schema/3/dataDictionaryExtension" xmlns:ns4="http://datex2.eu/schema/3/cctvExtension" xmlns:ns5="http://datex2.eu/schema/3/locationReferencing" xmlns:ns6="http://datex2.eu/schema/3/alertCLocationCodeTableExtension" xmlns:ns7="http://datex2.eu/schema/3/extension" xmlns:ns8="http://datex2.eu/schema/3/roadTrafficData" xmlns:ns9="http://datex2.eu/schema/3/vms" xmlns:ns10="http://datex2.eu/schema/3/situation" xmlns:ns11="http://datex2.eu/schema/3/messageContainer" xmlns:ns12="http://datex2.eu/schema/3/informationManagement" modelBaseVersion="3">
            </ns11:messageContainer>
        """.trimIndent()

        val result = DatexSerializer.deserialize(xml.toXmlString())

        result.shouldBeLeftOfType<MissingPayloadError>().version.shouldBe(DatexVersion.DATEX_3)
    }
})
