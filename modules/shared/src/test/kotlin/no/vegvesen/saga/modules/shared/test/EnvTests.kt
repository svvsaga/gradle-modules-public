package no.vegvesen.saga.modules.shared.test

import arrow.core.zip
import io.kotest.assertions.arrow.nel.shouldContain
import io.kotest.assertions.arrow.nel.shouldHaveSize
import io.kotest.assertions.arrow.validation.shouldBeInvalid
import io.kotest.assertions.arrow.validation.shouldBeValid
import io.kotest.assertions.throwables.shouldNotThrow
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.string.shouldContain
import io.kotest.matchers.string.shouldHaveMinLength
import no.vegvesen.saga.modules.shared.envOrThrow
import no.vegvesen.saga.modules.shared.envToValidated
import no.vegvesen.saga.modules.shared.envToValidatedNel

class EnvTests : FunSpec({
    context("Env variable PATH") {
        val testEnvVar = "PATH"

        test("envOrThrow finds") {
            shouldNotThrow<Throwable> {
                envOrThrow(testEnvVar) shouldHaveMinLength 1
            }
        }

        test("envToValidated finds valid") {
            envToValidated(testEnvVar) shouldBeValid {
                it.value shouldHaveMinLength 1
            }
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
            envToValidated(testEnvVar) shouldBeInvalid {
                it.value shouldContain "Missing"
                it.value shouldContain testEnvVar
            }
        }
    }

    test("envToValidatedNel can collect multiple errors") {
        envToValidatedNel("invalid1")
            .zip(envToValidatedNel("invalid2"), envToValidatedNel("invalid3")) { a, b, c ->
                a + b + c
        } shouldBeInvalid {
            it.value shouldHaveSize 3
            it.value.toString().shouldContain("invalid1")
            it.value.toString().shouldContain("invalid3")
        }
    }

    test("envToValidatedNel can fetch multiple variables") {
        envToValidatedNel("PATH").zip(envToValidatedNel("HOME")) { path, home ->
            Pair(path, home)
            } shouldBeValid {
            it.value.first shouldHaveMinLength 1
            it.value.second shouldHaveMinLength 1
        }
    }
})
