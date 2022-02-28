package no.vegvesen.saga.modules.datex

import arrow.core.Either
import arrow.core.handleErrorWith
import arrow.core.left
import arrow.core.right
import no.vegvesen.saga.modules.datex.RecoverableDatex2ValidationExceptions.errorContentOfExchangeElementNotComplete
import no.vegvesen.saga.modules.datex.RecoverableDatex2ValidationExceptions.errorLineStringExtensionNotInSchema
import no.vegvesen.saga.modules.datex.RecoverableDatex2ValidationExceptions.errorNewStrekningerHasModelBaseVersion3
import no.vegvesen.saga.modules.datex.RecoverableDatex3ValidationExceptions.errorExchangeInformationElementsLacksBaseVersion
import no.vegvesen.saga.modules.datex.RecoverableDatex3ValidationExceptions.errorTargetClassOfObjectReferenceIsNotValid
import no.vegvesen.saga.modules.shared.Logging
import no.vegvesen.saga.modules.shared.XmlString
import org.xml.sax.SAXParseException
import javax.xml.transform.Source
import javax.xml.transform.stream.StreamSource
import javax.xml.validation.Schema
import javax.xml.validation.SchemaFactory

object RecoverableDatex2ValidationExceptions {
    // Hack because strekninger uses linear line string extension which does not match schema
    const val errorLineStringExtensionNotInSchema =
        "cvc-complex-type.2.4.a: Invalid content was found starting with element '{\"http://datex2.eu/schema/2/2_0\":linearLineStringExtension}'. One of '{\"http://datex2.eu/schema/2/2_0\":openlrExtendedLinear, WC[##other:\"http://datex2.eu/schema/2/2_0\"]}' is expected."

    // New strekninger for some reason have modelBaseVersion="3"
    const val errorNewStrekningerHasModelBaseVersion3 =
        "cvc-complex-type.3.1: Value '3' of attribute 'modelBaseVersion' of element 'd2LogicalModel' is not valid with respect to the corresponding attribute use. Attribute 'modelBaseVersion' has a fixed value of '2'."

    // Exchange element is sometimes empty
    const val errorContentOfExchangeElementNotComplete =
        "cvc-complex-type.2.4.b: The content of element 'exchange' is not complete. One of '{\"http://datex2.eu/schema/2/2_0\":changedFlag, \"http://datex2.eu/schema/2/2_0\":clientIdentification, \"http://datex2.eu/schema/2/2_0\":deliveryBreak, \"http://datex2.eu/schema/2/2_0\":denyReason, \"http://datex2.eu/schema/2/2_0\":historicalStartDate, \"http://datex2.eu/schema/2/2_0\":historicalStopDate, \"http://datex2.eu/schema/2/2_0\":keepAlive, \"http://datex2.eu/schema/2/2_0\":requestType, \"http://datex2.eu/schema/2/2_0\":response, \"http://datex2.eu/schema/2/2_0\":subscriptionReference, \"http://datex2.eu/schema/2/2_0\":supplierIdentification}' is expected."
}

object RecoverableDatex3ValidationExceptions {
    // Some older Datex 3 files lack required modelBaseVersion for exchangeInformation
    const val errorExchangeInformationElementsLacksBaseVersion =
        "cvc-complex-type.4: Attribute 'modelBaseVersion' must appear on element 'ns2:exchangeInformation'"

    // Datex 3 files use a different namespace prefix for situation schema
    const val errorTargetClassOfObjectReferenceIsNotValid =
        "cvc-complex-type.3.1: Value 'ns13:SituationRecord' of attribute 'targetClass' of element 'ns8:objectReference'"
}

class DatexValidator : Logging {
    companion object {
        // Schema is thread safe, validator is not
        private val datex2Schema: Schema = SchemaFactory.newDefaultInstance()
            .newSchema(Companion::class.java.getResource("/DATEXIISchema_2_2_3.xsd"))

        private val datex3Schema: Schema =
            SchemaFactory.newDefaultInstance().newSchema(fetchDatex3SchemaFiles())

        private fun fetchDatex3SchemaFiles(): Array<Source> = listOf(
            "/DatexII_3/DATEXII_3_D2Payload.xsd",
            "/DatexII_3/DATEXII_3_Common.xsd",
            "/DatexII_3/DATEXII_3_LocationReferencing.xsd",
            "/DatexII_3/DATEXII_3_RoadTrafficData.xsd",
            "/DatexII_3/DATEXII_3_Situation.xsd",
            "/DatexII_3/DATEXII_3_Vms.xsd",
            "/DatexII_3/DATEXII_3_ExchangeInformation.xsd",
            "/DatexII_3/DATEXII_3_InformationManagement.xsd",
            "/DatexII_3/DATEXII_3_MessageContainer.xsd",
            "/DatexII_3/DATEXII_3_CISInformation.xsd",
        ).map { StreamSource(Companion::class.java.getResource(it)!!.toExternalForm()) }
            .toTypedArray()
    }

    private fun tryDatex2Validation(doc: XmlString) = Either.catch {
        datex2Schema.newValidator().validate(StreamSource(doc.value.byteInputStream()))
        DatexVersion.DATEX_2
    }.handleErrorWith { handleDatex2ValidationExceptions(doc, it) }

    private fun tryDatex3Validation(doc: XmlString) = Either.catch {
        datex3Schema.newValidator().validate(StreamSource(doc.value.byteInputStream()))
        DatexVersion.DATEX_3
    }.handleErrorWith { handleDatex3ValidationExceptions(doc, it) }

    fun validateDatexDoc(doc: XmlString): Either<DatexError.ValidationError, DatexVersion> =
        tryDatex2Validation(doc).handleErrorWith { tryDatex3Validation(doc) }
}

private fun handleDatex2ValidationExceptions(doc: XmlString, exception: Throwable) =
    when (exception) {
        is SAXParseException -> when {
            exception.localizedMessage.startsWith(errorLineStringExtensionNotInSchema) -> DatexVersion.DATEX_2.right()
            exception.localizedMessage.startsWith(errorNewStrekningerHasModelBaseVersion3) -> DatexVersion.DATEX_2.right()
            exception.localizedMessage.startsWith(errorContentOfExchangeElementNotComplete) -> DatexVersion.DATEX_2.right()
            else -> createError(doc, exception.localizedMessage, DatexVersion.DATEX_2)
        }
        else -> createError(doc, exception.localizedMessage, DatexVersion.DATEX_2)
    }

private fun handleDatex3ValidationExceptions(doc: XmlString, exception: Throwable) =
    when (exception) {
        is SAXParseException -> when {
            exception.localizedMessage.startsWith(errorExchangeInformationElementsLacksBaseVersion) -> DatexVersion.DATEX_3.right()
            exception.localizedMessage.startsWith(errorTargetClassOfObjectReferenceIsNotValid) -> DatexVersion.DATEX_3.right()
            else -> createError(doc, exception.localizedMessage, DatexVersion.DATEX_3)
        }
        else -> createError(doc, exception.localizedMessage, DatexVersion.DATEX_3)
    }

private fun createError(doc: XmlString, message: String, attemptedVersion: DatexVersion) =
    DatexError.ValidationError("Document does not follow $attemptedVersion schema: $message", doc)
        .left()