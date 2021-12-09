package no.vegvesen.saga.modules.testing

import io.kotest.matchers.collections.shouldHaveSize
import io.kotest.matchers.nulls.shouldNotBeNull

fun <T> Collection<T>?.shouldContainSingle(match: (t: T) -> Boolean): T {
    shouldNotBeNull()
    return filter(match).let {
        it shouldHaveSize 1
        it.single()
    }
}
