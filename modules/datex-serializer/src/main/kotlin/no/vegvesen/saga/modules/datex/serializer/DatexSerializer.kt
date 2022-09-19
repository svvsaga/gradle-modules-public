package no.vegvesen.saga.modules.datex.serializer

import arrow.core.Either
import arrow.core.flatMap
import arrow.core.left
import arrow.core.right
import eu.datex2.schema._2._2_0.D2LogicalModel
import eu.datex2.schema._3.messagecontainer.MessageContainer
import jakarta.xml.bind.JAXBContext
import jakarta.xml.bind.JAXBElement
import kotlinx.datetime.Instant
import no.vegvesen.saga.modules.datex.DatexVersion
import no.vegvesen.saga.modules.datex.containsDeliveryBreak
import no.vegvesen.saga.modules.datex.findDatexVersion
import no.vegvesen.saga.modules.shared.XmlString
import no.vegvesen.saga.modules.shared.extensions.bufferAndPeek
import no.vegvesen.saga.modules.shared.toKotlinInstant
import java.io.InputStream

data class DeliveryBreakError(val version: DatexVersion) : Exception("DeliveryBreak encountered")

data class MissingPayloadError(val version: DatexVersion, val document: XmlString) :
    Exception("Datex publication is missing payload")

class DatexSerializer {
    companion object {
        private val datex3JAXBContext: JAXBContext = JAXBContext.newInstance(MessageContainer::class.java)
        private val datex2JAXBContext: JAXBContext = JAXBContext.newInstance(D2LogicalModel::class.java)

        fun deserialize(xml: XmlString): Either<Throwable, DatexResult> = deserialize(xml.value.byteInputStream())

        fun deserialize(stream: InputStream): Either<Throwable, DatexResult> = Either.catchAndFlatten {
            val (bufferedStream, firstBytes) = stream.bufferAndPeek()
            val xml = XmlString(firstBytes.toString(Charsets.UTF_8).trim())

            findDatexVersion(xml).flatMap { version ->
                when (version) {
                    DatexVersion.DATEX_2 -> {
                        val result = datex2JAXBContext.createUnmarshaller().unmarshal(bufferedStream) as JAXBElement<*>
                        (result.value as D2LogicalModel).let {
                            it.payloadPublication?.publicationTime?.toKotlinInstant()?.let { publicationTime ->
                                Datex2Result(it, publicationTime).right()
                            } ?: if (containsDeliveryBreak(xml.value)) {
                                DeliveryBreakError(DatexVersion.DATEX_2).left()
                            } else {
                                MissingPayloadError(DatexVersion.DATEX_2, xml).left()
                            }
                        }
                    }
                    DatexVersion.DATEX_3 -> {
                        val result = datex3JAXBContext.createUnmarshaller().unmarshal(bufferedStream)
                        (result as MessageContainer).let {
                            it.payload.firstOrNull()?.publicationTime?.toKotlinInstant()?.let { publicationTime ->
                                Datex3Result(it, publicationTime).right()
                            } ?: if (containsDeliveryBreak(xml.value)) {
                                DeliveryBreakError(DatexVersion.DATEX_3).left()
                            } else {
                                MissingPayloadError(DatexVersion.DATEX_3, xml).left()
                            }
                        }
                    }
                }
            }
        }
    }
}

sealed class DatexResult {
    abstract val publicationTime: Instant
}

data class Datex3Result(val root: MessageContainer, override val publicationTime: Instant) : DatexResult()

data class Datex2Result(val root: D2LogicalModel, override val publicationTime: Instant) : DatexResult()
