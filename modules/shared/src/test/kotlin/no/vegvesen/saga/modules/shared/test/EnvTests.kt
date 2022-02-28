package no.vegvesen.saga.modules.shared.test

import arrow.core.zip
import io.kotest.assertions.arrow.core.shouldBeValid
import io.kotest.assertions.throwables.shouldNotThrow
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.collections.shouldHaveSize
import io.kotest.matchers.string.shouldContain
import io.kotest.matchers.string.shouldHaveMinLength
import no.vegvesen.saga.modules.shared.envOrThrow
import no.vegvesen.saga.modules.shared.envToValidated
import no.vegvesen.saga.modules.shared.envToValidatedNel
import no.vegvesen.saga.modules.testing.shouldBeInvalidAnd
import no.vegvesen.saga.modules.testing.shouldBeValidAnd

class EnvTests : FunSpec({
    context("Env variable PATH") {
        val testEnvVar = "PATH"

        test("envOrThrow finds") {
            shouldNotThrow<Throwable> {
                envOrThrow(testEnvVar) shouldHaveMinLength 1
            }
        }

        test("envToValidated finds valid") {
            envToValidated(testEnvVar).shouldBeValid() shouldHaveMinLength 1
        }
    }

    context("Unknown env variable") {
        val testEnvVar = "TEST_ENV_VAR"

        test("envOrThrow throws fetching unknown variable") {
            shouldThrow<Error> {
                envOrThrow(testEnvVar)
            }
        }

        test("envToValidated gives invalid") {
            envToValidated(testEnvVar).shouldBeInvalidAnd {
                it shouldContain "Missing"
                it shouldContain testEnvVar
            }
        }
    }

    test("envToValidatedNel can collect multiple errors") {
        envToValidatedNel("invalid1")
            .zip(envToValidatedNel("invalid2"), envToValidatedNel("invalid3")) { a, b, c ->
                a + b + c
            } shouldBeInvalidAnd {
            it shouldHaveSize 3
            it.toString().shouldContain("invalid1")
            it.toString().shouldContain("invalid3")
        }
    }

    test("envToValidatedNel can fetch multiple variables") {
        envToValidatedNel("PATH").zip(envToValidatedNel("HOME")) { path, home ->
            Pair(path, home)
        } shouldBeValidAnd {
            it.first shouldHaveMinLength 1
            it.second shouldHaveMinLength 1
        }
    }
})
