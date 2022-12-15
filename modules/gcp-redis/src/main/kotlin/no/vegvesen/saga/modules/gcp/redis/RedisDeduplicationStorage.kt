package no.vegvesen.saga.modules.gcp.redis

import arrow.core.Either
import no.vegvesen.saga.modules.shared.DeduplicationStorage
import redis.clients.jedis.Jedis
import redis.clients.jedis.args.BitOP
import java.util.BitSet

/**
 * We perform deduplication by storing IDs as bits in Redis, divided into buckets of 2^20 (1_048_576)
 *      to avoid too large keys.
 * Example: we get a batch of IDs 1_000_001-1_100_000.json:
 * - Every ID in the range will be split into a bucket, and a value in the bucket:
 * - 1_000_001 => bucket: 1_000_001 / 1_048_576 = 0, value: 1_000_001 % 1_048_576 = 1_000_001
 * - 1_100_000 => bucket: 1_100_000 / 1_048_576 = 1, value: 1_100_000 % 1_048_576 = 51_424
 * - Then all the values in a bucket will be merged as a single bitset, with the bits at index equal to value set to 1.
 * - Updates are saved to a separate bitset per bucket and ORed into the bucket.
 * - Batch checks are done by creating a new bitset for the new records, and ANDing it with the bucket,
 *      then downloading the response and converting back to IDs.
 */
class RedisDeduplicationStorage(private val jedis: Jedis) : DeduplicationStorage<Long> {
    override fun clear(): Either<Throwable, Unit> = Either.catch {
        jedis.flushAll()
    }

    override fun hasId(id: Long): Either<Throwable, Boolean> = Either.catch {
        val (bucket, value) = getBucketAndValue(id)
        jedis.getbit(getBucketKey(bucket), value)
    }

    override suspend fun fetchDuplicateIds(ids: Collection<Long>): Either<Throwable, Set<Long>> = Either.catch {
        splitIdsToBuckets(ids)
            .flatMap { (bucket, values) ->
                val checkBytes = mergeIdsToByteArray(values)
                val checkKey = getBucketKey(bucket, "check")
                val resultKey = getBucketKey(bucket, "result")
                val bucketKey = getBucketKey(bucket)

                val bytes = jedis.multi().use { transaction ->
                    transaction.set(checkKey.encodeToByteArray(), checkBytes)
                    transaction.bitop(BitOP.AND, resultKey, checkKey, bucketKey)
                    val duplicateBytes = transaction.get(resultKey.encodeToByteArray())
                    transaction.del(checkKey, resultKey)
                    transaction.exec()
                    duplicateBytes.get()
                }

                splitByteArrayToIds(bytes, bucket)
            }.toSet()
    }

    // pd = produksjonsdata
    private fun getBucketKey(bucket: Long, key: String? = null) = "pd:bucket:$bucket${if (key == null) "" else ":$key"}"

    override fun saveIds(newIds: Collection<Long>): Either<Throwable, Unit> = Either.catch {
        splitIdsToBuckets(newIds)
            .forEach { (bucket, values) ->
                val bytes = mergeIdsToByteArray(values)
                val upsertKey = getBucketKey(bucket, "upsert")
                val bucketKey = getBucketKey(bucket)
                // Insert and merge bitset
                jedis.multi().use { transaction ->
                    transaction.set(upsertKey.encodeToByteArray(), bytes)
                    transaction.bitop(BitOP.OR, bucketKey, bucketKey, upsertKey)
                    transaction.del(upsertKey)
                    transaction.exec()
                }
            }
    }
}

const val bucketSize = 1 shl 20 // 2 ^ 20 = 1 Mb = 128 kB per bucket

fun getBucketAndValue(id: Long) = (id / bucketSize) to (id % bucketSize)

fun getBucket(id: Long): Long = id / bucketSize
fun getBucketValue(id: Long): Int = (id % bucketSize).toInt()

fun splitIdsToBuckets(ids: Collection<Long>): Map<Long, List<Int>> =
    ids.groupBy(::getBucket, ::getBucketValue)

fun mergeIdsToBitSet(ids: Collection<Int>): BitSet {
    require(ids.isNotEmpty()) { "Ids must not be empty" }

    // Preallocate enough space to store all IDs, if ids are ordered, which we expect them to be from Elrapp.
    // If not, the BitSet will grow dynamically, and this is OK.
    val bitSet = BitSet(ids.last() + 1)

    ids.forEach { id ->
        // Redis stores bitsets with bytes reversed
        val byteIndex = id / 8
        val bitIndex = id % 8
        bitSet[mirrorByte(byteIndex, bitIndex)] = true
    }

    return bitSet
}

fun splitByteArrayToIds(bytes: ByteArray, bucket: Long): Set<Long> {
    val bitSet = BitSet.valueOf(bytes)

    val setBits = bitSet.cardinality()

    val set = HashSet<Long>(setBits)

    var i = bitSet.nextSetBit(0)

    while (i > -1) {
        val byteIndex = i / 8
        val bitIndex = i % 8
        val id = mirrorByte(byteIndex, bitIndex)
        set.add(bucket * bucketSize + id)
        i = bitSet.nextSetBit(i + 1)
    }

    return set
}

private fun mirrorByte(byteIndex: Int, bitIndex: Int) = byteIndex * 8 + 7 - bitIndex

fun mergeIdsToByteArray(orderedIds: Collection<Int>): ByteArray = mergeIdsToBitSet(orderedIds).toByteArray()
