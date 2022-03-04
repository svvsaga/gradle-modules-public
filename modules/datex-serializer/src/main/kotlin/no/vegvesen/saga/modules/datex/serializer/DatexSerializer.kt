package no.vegvesen.saga.modules.datex.serializer

import arrow.core.Either
import eu.datex2.schema._2._2_0.D2LogicalModel
import eu.datex2.schema._3.messagecontainer.MessageContainer
import jakarta.xml.bind.JAXBContext
import jakarta.xml.bind.JAXBElement
import no.vegvesen.saga.modules.datex.DatexVersion
import no.vegvesen.saga.modules.datex.findDatexVersion
import no.vegvesen.saga.modules.shared.XmlString
import java.io.BufferedInputStream
import java.io.InputStream

class DatexSerializer {
    companion object {
        private val datex3JAXBContext: JAXBContext = JAXBContext.newInstance(MessageContainer::class.java)
        private val datex2JAXBContext: JAXBContext = JAXBContext.newInstance(D2LogicalModel::class.java)

        fun deserialize(xml: XmlString): Either<Throwable, DatexResult> = deserialize(xml.value.byteInputStream())

        fun deserialize(stream: InputStream): Either<Throwable, DatexResult> = Either.catchAndFlatten {

            val (bufferedStream, firstBytes) = bufferAndPeek(stream)
            val xml = XmlString(firstBytes.toString(Charsets.UTF_8).trim())

            findDatexVersion(xml).map {
                when (it) {
                    DatexVersion.DATEX_2 -> {
                        val result = datex2JAXBContext.createUnmarshaller().unmarshal(bufferedStream) as JAXBElement<*>
                        Datex2Result(result.value as D2LogicalModel)
                    }
                    DatexVersion.DATEX_3 -> {
                        val result = datex3JAXBContext.createUnmarshaller().unmarshal(bufferedStream)
                        Datex3Result(result as MessageContainer)
                    }
                }
            }
        }

        private fun bufferAndPeek(stream: InputStream, bytesToPeek: Int = 1024): Pair<BufferedInputStream, ByteArray> {
            val buffered = BufferedInputStream(stream)
            buffered.mark(bytesToPeek)
            val firstBytes = buffered.readNBytes(bytesToPeek)
            buffered.reset()
            return Pair(buffered, firstBytes)
        }
    }
}

sealed class DatexResult

data class Datex3Result(val root: MessageContainer) : DatexResult()

data class Datex2Result(val root: D2LogicalModel) : DatexResult()
