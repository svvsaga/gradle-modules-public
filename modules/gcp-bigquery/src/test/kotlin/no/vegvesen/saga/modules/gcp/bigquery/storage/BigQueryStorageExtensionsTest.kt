package no.vegvesen.saga.modules.gcp.bigquery.storage

import ch.qos.logback.classic.Level
import com.google.api.gax.rpc.ResourceExhaustedException
import com.google.cloud.bigquery.storage.v1.AppendRowsResponse
import com.google.cloud.bigquery.storage.v1.JsonStreamWriter
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.collections.shouldBeEmpty
import io.kotest.matchers.collections.shouldHaveSize
import io.kotest.matchers.collections.shouldNotBeEmpty
import io.mockk.every
import io.mockk.mockk
import no.vegvesen.saga.modules.testing.TestLogger
import org.slf4j.LoggerFactory
import kotlin.time.Duration.Companion.seconds
import kotlin.time.ExperimentalTime

@kotlinx.serialization.Serializable
data class Foo(val bar: Int)

@ExperimentalTime
class BigQueryStorageExtensionsTest : FunSpec({
    val testSubject = mockk<JsonStreamWriter>()
    val exception = ResourceExhaustedException(
        "No resources",
        Exception(),
        mockk(),
        true
    )

    val logger = LoggerFactory.getLogger(BigQueryStorageExtensionsTest::class.java)

    every {
        testSubject.append(any()).get()
    } throws exception andThenThrows exception andThenThrows exception andThen mockk<AppendRowsResponse>()

    test("writeJson can retry") {
        val testLogger = TestLogger()

        testSubject.writeJson(listOf(Foo(1)), Foo.serializer()) { exception, delay ->
            logger.warn("Failure, delaying $delay", exception)
        }.shouldBeEmpty()

        testLogger.events.filter { it.level == Level.WARN } shouldHaveSize 3
    }

    test("writeJson fails when time limit has been reached") {
        val failingWriter = mockk<JsonStreamWriter>()
        val testLogger = TestLogger()

        every { failingWriter.append(any()).get() } throws exception

        val result = failingWriter.writeJson(
            listOf(Foo(1)),
            Foo.serializer(),
            backoffSettings = ExponentialBackoffSettings(0.1.seconds, 0.5.seconds)
        ) { exception, delay ->
            logger.warn("Failure, delaying $delay", exception)
        }

        result.shouldNotBeEmpty()
        testLogger.events.filter { it.level == Level.WARN }.shouldNotBeEmpty()
    }
})
