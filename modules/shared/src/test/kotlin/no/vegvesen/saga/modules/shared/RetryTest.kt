package no.vegvesen.saga.modules.shared

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import io.kotest.assertions.arrow.core.shouldBeLeft
import io.kotest.assertions.arrow.core.shouldBeRight
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.ints.shouldBeExactly
import io.kotest.matchers.shouldBe
import no.vegvesen.saga.modules.shared.Retry.ExponentialBackoffSettings
import no.vegvesen.saga.modules.shared.Retry.retry
import no.vegvesen.saga.modules.shared.Retry.retryEither
import kotlin.time.Duration.Companion.seconds
import kotlin.time.ExperimentalTime

@ExperimentalTime
class RetryTest : FunSpec({

    test("will retry on thrown exceptions") {
        var runs = 0
        val result = retry("some-description", ExponentialBackoffSettings(0.1.seconds, 42)) {
            if (runs++ < 2) {
                throw Exception("err")
            }
            runs
        }
        result.shouldBeRight(3)
        runs.shouldBeExactly(3)
    }

    test("will retry on failed eithers") {
        var runs = 0
        val result = retryEither("some-description", ExponentialBackoffSettings(0.1.seconds, 42)) {
            if (runs++ < 2) Exception("err").left()
            else runs.right()
        }
        result.shouldBeRight(3)
        runs.shouldBeExactly(3)
    }

    test("will only run the given amount of times") {
        var runs = 0
        val result: Either<Throwable, Nothing> = retry("some-description", ExponentialBackoffSettings(0.1.seconds, 2)) {
            runs++
            throw Exception("err")
        }
        result.shouldBeLeft()
        runs.shouldBe(2)
    }
})
