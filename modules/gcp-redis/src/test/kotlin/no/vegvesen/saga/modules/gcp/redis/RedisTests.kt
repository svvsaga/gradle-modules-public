package no.vegvesen.saga.modules.gcp.redis

import io.kotest.assertions.arrow.core.shouldBeRight
import io.kotest.matchers.shouldBe
import kotlinx.coroutines.runBlocking
import no.vegvesen.saga.modules.shared.DeduplicationStorage
import no.vegvesen.saga.modules.testing.ExternalTest
import no.vegvesen.saga.modules.testing.IntegrationTest
import org.junit.Ignore
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import redis.clients.jedis.Jedis
import kotlin.time.DurationUnit
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

val logger: Logger = LoggerFactory.getLogger("DeduplicationStorageTests")

@ExperimentalTime
fun testInsert(storage: DeduplicationStorage<Long>) {
    val batchSize = 10_000_000
    val records = generateSequence(1L) { id ->
        id + 1
    }.take(batchSize).toList()

    measureTime {
        storage.clear()
    }.also { logger.info("Cleared DB in: " + it.toDouble(DurationUnit.SECONDS)) }

    measureTime {
        storage.saveIds(records)
    }.also { logger.info("First insert of $batchSize in: " + it.toDouble(DurationUnit.SECONDS)) }

    measureTime {
        storage.hasId(1).shouldBeRight(true)
        storage.hasId(50).shouldBeRight(true)
        storage.hasId(batchSize.toLong()).shouldBeRight(true)
        storage.hasId(batchSize.toLong() + 1).shouldBeRight(false)
    }.also { logger.info("Fetch record in: " + it.toDouble(DurationUnit.SECONDS)) }

    measureTime {
        storage.saveIds(records)
    }.also { logger.info("Second insert of $batchSize in: " + it.toDouble(DurationUnit.SECONDS)) }
}

@ExperimentalTime
@Tag(IntegrationTest)
@Tag(ExternalTest)
class RedisTests {
    private val testSubject = RedisDeduplicationStorage(Jedis("localhost"))

    @Test
    @Ignore("Only used manually to check performance")
    fun `check how long it takes for Redis to insert lots of rows and then to lookups`() {
        testInsert(testSubject)
    }

    @Test
    fun `insert records with offset`() {
        testSubject.clear()

        testSubject.saveIds(listOf(2, 9, 2_000_001))

        testSubject.hasId(2) shouldBeRight true
        testSubject.hasId(9) shouldBeRight true
        testSubject.hasId(2_000_001) shouldBeRight true
    }

    @Test
    fun `insert records with high ID`() {
        val records = generateSequence(4_600_000_000L) { id -> id + 2 }.take(100_000).toList()
        testSubject.clear()

        measureTime {
            testSubject.saveIds(records)
        }.also { logger.info("${it.toDouble(DurationUnit.SECONDS)}") }

        testSubject.hasId(4_600_000_000L) shouldBeRight true
        testSubject.hasId(4_600_000_001L) shouldBeRight false
        testSubject.hasId(4_600_000_002L) shouldBeRight true
    }

    @Test
    fun `upsert records`() {
        testSubject.clear()

        testSubject.saveIds(listOf(15, 16))
        testSubject.saveIds(listOf(16, 39))

        testSubject.hasId(15) shouldBeRight true
        testSubject.hasId(16) shouldBeRight true
        testSubject.hasId(39) shouldBeRight true
    }

    @Test
    fun `can get already processed records across buckets`() = runBlocking {
        testSubject.clear()
        val ids = (1_048_000L..1_050_000).toList()
        testSubject.saveIds(ids)

        val checkIds = (1_047_000L..1_051_000).toList()
        val duplicateIds = testSubject.fetchDuplicateIds(checkIds)

        duplicateIds shouldBeRight ids.toSet()
    }

    @Test
    fun `splitByteArrayToIds splits byte array into IDs`() {
        val ids = listOf(1, 3, 9, 1_000_000)
        val bytes = mergeIdsToByteArray(ids)

        val splitIds = splitByteArrayToIds(bytes, 0)

        splitIds shouldBe setOf(1L, 3, 9, 1_000_000)
    }
}