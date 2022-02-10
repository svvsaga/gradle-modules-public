package no.vegvesen.saga.modules.testing

import no.vegvesen.saga.modules.shared.envOrThrow

val SagaIntTestProject: String by lazy { envOrThrow("SAGA_INT_TEST_PROJECT_ID") }
