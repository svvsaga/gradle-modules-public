package no.vegvesen.saga.modules.beam

import org.apache.beam.sdk.testing.PAssert
import org.apache.beam.sdk.values.KV
import org.apache.beam.sdk.values.PCollection

/**
 * This file is copied from KIO, with some changes:
 * https://github.com/chermenin/kio/blob/master/kio-test/src/main/kotlin/ru/chermenin/kio/test/Assertions.kt
 * License
Copyright © 2020 Alex Chermenin

Licensed under the Apache License, Version 2.0: https://www.apache.org/licenses/LICENSE-2.0.txt
 */
fun <T> PCollection<T>.that(): PAssert.IterableAssert<T> {
    return PAssert.that(this)!!
}

fun <T> PCollection<T>.that(reason: String): PAssert.IterableAssert<T> {
    return PAssert.that(reason, this)
}

fun <T> PCollection<T>.thatSingleton(): PAssert.SingletonAssert<T> {
    return PAssert.thatSingleton(this)
}

fun <T> PCollection<T>.thatSingleton(reason: String): PAssert.SingletonAssert<T> {
    return PAssert.thatSingleton(reason, this)
}

fun <T> PCollection<Iterable<T>>.thatSingletonIterable(): PAssert.IterableAssert<T> {
    return PAssert.thatSingletonIterable(this)
}

fun <T> PCollection<Iterable<T>>.thatSingletonIterable(reason: String): PAssert.IterableAssert<T> {
    return PAssert.thatSingletonIterable(reason, this)
}

fun <K, V> PCollection<KV<K, V>>.thatMap(): PAssert.SingletonAssert<Map<K, V>> {
    return PAssert.thatMap(this)
}

fun <K, V> PCollection<KV<K, V>>.thatMap(reason: String): PAssert.SingletonAssert<Map<K, V>> {
    return PAssert.thatMap(reason, this)
}

fun <K, V> PCollection<KV<K, V>>.thatMultiMap(): PAssert.SingletonAssert<Map<K, Iterable<V>>> {
    return PAssert.thatMultimap(this)
}

fun <K, V> PCollection<KV<K, V>>.thatMultiMap(reason: String): PAssert.SingletonAssert<Map<K, Iterable<V>>> {
    return PAssert.thatMultimap(reason, this)
}

inline fun <T> PAssert.SingletonAssert<T>.satisfy(crossinline checker: (T) -> Unit): PAssert.SingletonAssert<T> {
    return this.satisfies {
        checker(it)
        null
    }
}

inline fun <T> PAssert.IterableAssert<T>.satisfy(
    crossinline checker: (Iterable<T>) -> Unit
): PAssert.IterableAssert<T> {
    return this.satisfies {
        checker(it)
        null
    }
}