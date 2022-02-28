package no.vegvesen.saga.modules.datex

import io.kotest.assertions.arrow.core.shouldBeLeft
import io.kotest.assertions.arrow.core.shouldBeRight
import io.kotest.core.spec.style.StringSpec
import no.vegvesen.saga.modules.shared.XmlString
import no.vegvesen.saga.modules.shared.toXmlString
import no.vegvesen.saga.modules.testing.loadStringResourceOrThrow

class DatexValidatorTests : StringSpec({
    val testSubject = DatexValidator()

    fun fileIsValid(filePath: String, datexVersion: DatexVersion) {
        val xml = loadStringResourceOrThrow(filePath).toXmlString()

        val result = testSubject.validateDatexDoc(xml)

        result shouldBeRight datexVersion
    }

    fun fileIsNotValid(filePath: String) {
        val xml = loadStringResourceOrThrow(filePath).toXmlString()

        val result = testSubject.validateDatexDoc(xml)

        result.shouldBeLeft()
    }

    "valid reisetid Datex 2 file is validated successfully" {
        fileIsValid("GetTravelTimeData.xml", DatexVersion.DATEX_2)
    }

    "resisetid Datex 2 file with empty exchange element is validated successfully as datex 2.3, even though it does not follow the schema" {
        fileIsValid("GetPredefinedTravelTimeLocations_with_empty_exchange_element.xml", DatexVersion.DATEX_2)
    }

    "valid strekninger Datex 2 file is validated successfully" {
        fileIsValid("GetPredefinedTravelTimeLocations.xml", DatexVersion.DATEX_2)
    }

    "valid strekninger Datex 2 file with modelBaseVersion 3 is validated successfully as datex 2.3" {
        fileIsValid("GetPredefinedTravelTimeLocations_with_modelBaseVersion_3.xml", DatexVersion.DATEX_2)
    }

    "valid reisetid Datex 3 file is validated successfully as datex 3.1" {
        fileIsValid("GetTravelTimeData_Datex3.xml", DatexVersion.DATEX_3)
    }

    "invalid reisetid Datex 3 file gives validationError" {
        fileIsNotValid("GetTravelTimeData_Datex3_invalid.xml")
    }

    "reisetid Datex 3 file with missing modelBaseVersion on exchangeInformation is validated successfully" {
        fileIsValid(
            "GetTravelTimeData_Datex3_without_modelBaseVersion_on_exchangeInformation.xml",
            DatexVersion.DATEX_3
        )
    }

    "valid maaledata Datex 2 file is validated successfully" {
        fileIsValid("GetMeasuredWeatherData.xml", DatexVersion.DATEX_2)
    }

    "valid maalestasjoner Datex 2 file is validated successfully" {
        fileIsValid("GetMeasurementWeatherSiteTable.xml", DatexVersion.DATEX_2)
    }

    "invalid file fails validation" {
        val result = testSubject.validateDatexDoc(XmlString("invalid >< document"))
        result.shouldBeLeft()
    }

    "valid Datex 3 situations is validated successfully" {
        fileIsValid("GetSituations_Datex3.xml", DatexVersion.DATEX_3)
    }
})