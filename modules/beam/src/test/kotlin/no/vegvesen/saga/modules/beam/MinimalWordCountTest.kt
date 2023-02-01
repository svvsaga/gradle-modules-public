package no.vegvesen.saga.modules.beam

import org.apache.beam.sdk.testing.PAssert
import org.apache.beam.sdk.testing.TestPipeline
import org.apache.beam.sdk.values.KV
import org.junit.jupiter.api.Test

class MinimalWordCountTest {
    private val pipeline: TestPipeline = TestPipeline
        .create()
        .enableAbandonedNodeEnforcement(false)

    @Test
    fun testSpaces() {
        val res = pipeline.fromElements(listOf("test1 test2", " test3 test2")).let { pipe ->
            MinimalWordCount.pipelineSteps(pipe)
        }

        PAssert.that(res).containsInAnyOrder(
            KV.of("test1", 1),
            KV.of("test2", 2),
            KV.of("test3", 1)
        )

        pipeline.run()
    }

    @Test
    fun testCommas() {
        val res = pipeline.fromElements(listOf("test1,test2", " test3, test2")).let { pipe ->
            MinimalWordCount.pipelineSteps(pipe)
        }

        PAssert.that(res).containsInAnyOrder(
            KV.of("test1", 1),
            KV.of("test2", 2),
            KV.of("test3", 1)
        )

        pipeline.run()
    }
}
