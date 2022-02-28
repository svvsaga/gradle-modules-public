package no.vegvesen.saga.modules.testing

import io.kotest.core.Tag

const val IntegrationTest = "IntegrationTest"
const val ExternalTest = "ExternalTest"

val IntegrationTestTag = Tag(IntegrationTest)
val ExternalTestTag = Tag(ExternalTest)