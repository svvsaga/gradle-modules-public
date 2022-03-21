package no.vegvesen.saga.modules.shared

import arrow.core.Either
import arrow.core.computations.either
import arrow.core.left
import arrow.core.right
import io.kotest.assertions.arrow.core.shouldBeLeft
import io.kotest.assertions.arrow.core.shouldBeRight
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.collections.shouldContainInOrder
import io.kotest.matchers.shouldBe
import kotlinx.coroutines.delay

fun succeed(): Either<Throwable, Unit> = Unit.right()

fun fail(): Either<Throwable, Unit> = Exception("oops").left()

class FunctionalTest : FunSpec({
    test("par fails if one fails, other is cancelled") {
        var flag = false

        val result = either<Throwable, Unit> {
            par({
                delay(100)
                flag = true
                succeed().bind()
            }, {
                fail().bind()
            })
        }

        result.shouldBeLeft()
        flag shouldBe false
    }

    test("funcs are called in parallel") {
        val list = mutableListOf<String>()

        val result = either<Throwable, Unit> {
            par({
                delay(150)
                list.add("A")
                succeed().bind()
            }, {
                delay(50)
                list.add("B")
                succeed().bind()
            })
        }

        result.shouldBeRight()
        list.shouldContainInOrder("B", "A")
    }

    test("first failure in any func will be thrown and rest are cancelled") {
        var flag = false

        shouldThrow<Exception> {
            par({
                delay(50)
                flag = true
            }, {
                delay(100)
                throw Exception("oops 2")
            }, {
                throw Exception("oops")
            })
        }.message shouldBe "oops"

        flag shouldBe false
    }
})
