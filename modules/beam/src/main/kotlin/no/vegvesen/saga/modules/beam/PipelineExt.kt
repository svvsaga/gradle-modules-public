package no.vegvesen.saga.modules.beam

import org.apache.beam.sdk.Pipeline
import org.apache.beam.sdk.io.TextIO
import org.apache.beam.sdk.options.PipelineOptions
import org.apache.beam.sdk.options.PipelineOptionsFactory
import org.apache.beam.sdk.transforms.Create
import org.apache.beam.sdk.values.PCollection
import org.apache.beam.sdk.values.TypeDescriptor

object KPipe {
    inline fun <reified R : PipelineOptions> from(args: Array<String>): Pair<Pipeline, R> {
        val options = PipelineOptionsFactory.fromArgs(*args)
            .withValidation()
            .`as`(R::class.java)
        return Pipeline.create(options) to options
    }
}

/**
 * @return PCollection with lines in file
 */
fun Pipeline.fromTextFile(filename: String): PCollection<String> {
    return this.apply(
        "Reading lines from file with name $filename",
        TextIO.read().from(filename)
    )
}

inline fun <reified T> Pipeline.fromElements(elements: Iterable<T>, name: String? = null): PCollection<T> =
    Create.of(elements)
        .withType(TypeDescriptor.of(T::class.java))
        .let { values ->
            if (name != null) this.apply(name, values)
            else this.apply(values)
        }
