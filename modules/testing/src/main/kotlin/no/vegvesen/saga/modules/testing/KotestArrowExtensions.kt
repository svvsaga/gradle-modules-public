package no.vegvesen.saga.modules.testing

import arrow.core.Either
import arrow.core.Validated
import io.kotest.assertions.arrow.core.shouldBeInvalid
import io.kotest.assertions.arrow.core.shouldBeLeft
import io.kotest.assertions.arrow.core.shouldBeRight
import io.kotest.assertions.arrow.core.shouldBeValid
import io.kotest.matchers.types.shouldBeTypeOf

inline infix fun <A, B> Either<A, B>.shouldBeRightAnd(f: (b: B) -> Unit): B =
    shouldBeRight().also { f(it) }

inline infix fun <A, B> Either<A, B>.shouldBeLeftAnd(f: (a: A) -> Unit): A =
    shouldBeLeft().also { f(it) }

inline infix fun <A, B> Validated<A, B>.shouldBeValidAnd(f: (b: B) -> Unit): B =
    shouldBeValid().also { f(it) }

inline infix fun <A, B> Validated<A, B>.shouldBeInvalidAnd(f: (a: A) -> Unit): A =
    shouldBeInvalid().also { f(it) }

inline fun <reified T : Any> Either<Any?, Any?>.shouldBeLeftOfType() = shouldBeLeft().shouldBeTypeOf<T>()

inline fun <reified T : Any> Either<Any?, Any?>.shouldBeRightOfType() = shouldBeRight().shouldBeTypeOf<T>()