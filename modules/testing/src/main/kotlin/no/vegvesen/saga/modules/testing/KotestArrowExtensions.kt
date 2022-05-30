package no.vegvesen.saga.modules.testing

import arrow.core.Either
import arrow.core.Validated
import arrow.core.left
import arrow.core.right
import io.kotest.assertions.arrow.core.shouldBeInvalid
import io.kotest.assertions.arrow.core.shouldBeLeft
import io.kotest.assertions.arrow.core.shouldBeRight
import io.kotest.assertions.arrow.core.shouldBeValid
import io.kotest.matchers.types.shouldBeTypeOf
import io.mockk.ConstantAnswer
import io.mockk.MockKStubScope

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

infix fun <T, B, L> MockKStubScope<Either<L, T>, B>.returns(returnValue: T) =
    answers(ConstantAnswer(returnValue.right()))

infix fun <T, B, L> MockKStubScope<Either<L, T>, B>.returnsLeft(returnValue: L) =
    answers(ConstantAnswer(returnValue.left()))
