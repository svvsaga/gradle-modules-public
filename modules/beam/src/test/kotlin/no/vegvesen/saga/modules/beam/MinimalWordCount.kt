package no.vegvesen.saga.modules.beam

import org.apache.beam.sdk.options.PipelineOptions
import org.apache.beam.sdk.options.Validation
import org.apache.beam.sdk.values.KV
import org.apache.beam.sdk.values.PCollection

interface WordCountOptions : PipelineOptions {
    @get:Validation.Required
    var inputFile: String
}

object MinimalWordCount {
    fun pipelineSteps(input: PCollection<String>): PCollection<KV<String, Long>> {
        return input.parFlatMap("Split words") {
            it.split("[^a-zA-Z0-9']+".toRegex())
        }
            .filter("Remove empty elements") { it.isNotEmpty() }
            .countPerElement()
    }

    private fun createPipeline(args: Array<String>) {
        val (pipeline, options) = KPipe.from<WordCountOptions>(args)

        pipeline.fromTextFile(options.inputFile).let(::pipelineSteps)
    }

    fun main(args: Array<String>) {
        createPipeline(args)
    }
}