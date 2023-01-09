package no.vegvesen.saga.modules.testing.gcp

enum class ResourceIsolationMode {
    /** Resource will be created once for the entire spec. */
    PerSpec,

    /** Resource will be created once per container (e.g. context). If no containers are specified, it won't be created. */
    PerContainer,

    /** Resource will be created once per leaf test. */
    PerTest,
}
