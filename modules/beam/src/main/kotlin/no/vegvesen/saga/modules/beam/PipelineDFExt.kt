package no.vegvesen.saga.modules.beam

import com.google.api.services.bigquery.model.TableSchema
import com.google.protobuf.Message
import org.apache.avro.generic.GenericRecord
import org.apache.beam.sdk.Pipeline
import org.apache.beam.sdk.coders.SerializableCoder
import org.apache.beam.sdk.io.gcp.bigquery.BigQueryIO
import org.apache.beam.sdk.io.gcp.pubsub.PubsubIO
import org.apache.beam.sdk.io.gcp.pubsub.PubsubMessage
import org.apache.beam.sdk.values.PCollection
import java.io.Serializable
import kotlin.reflect.full.isSubclassOf

inline fun <reified T> Pipeline.fromPubsub(
    projectId: String,
    subscription: String,
    idAttr: String = "uid"
): PCollection<T> {

    val klass = T::class

    // We have manually ensured every class is correctly cast. NB! Be aware of this when changing this code!
    @Suppress("UNCHECKED_CAST")
    val pubsubRead = when {
        klass.isSubclassOf(Message::class) -> PubsubIO.readProtos(klass.java as Class<Message>)
        klass == String::class -> PubsubIO.readStrings()
        klass == PubsubMessage::class -> PubsubIO.readMessagesWithAttributes()
        else -> {
            throw RuntimeException("Invalid type. it must be String or PubsubMessage")
        }
    } as PubsubIO.Read<T>

    return this.apply(
        "Reading ($subscription) from Pubsub",
        pubsubRead
            .fromSubscription("projects/$projectId/subscriptions/$subscription")
            .withIdAttribute(idAttr)
    )
}

inline fun <reified T : Serializable> Pipeline.readBQTable(
    inputTable: String,
    crossinline parseFn: (TableSchema, GenericRecord) -> T
): PCollection<T> =
    this.apply(
        "Read from BQ table $inputTable",
        BigQueryIO.read { schemaAndRecord -> parseFn(schemaAndRecord.tableSchema, schemaAndRecord.record) }
            .withCoder(SerializableCoder.of(T::class.java))
            .from(inputTable)
    )

inline fun <reified T : Serializable> Pipeline.readBQView(
    inputView: String,
    crossinline parseFn: (TableSchema, GenericRecord) -> T
): PCollection<T> =
    this.apply(
        "Read from BQ view $inputView",
        BigQueryIO
            .read { schemaAndRecord -> parseFn(schemaAndRecord.tableSchema, schemaAndRecord.record) }
            .withCoder(SerializableCoder.of(T::class.java))
            .fromQuery("SELECT * FROM `${inputView.replace(':', '.')}`")
            .usingStandardSql()
    )
