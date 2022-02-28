package no.vegvesen.saga.modules.gcp.datastore

import com.google.cloud.datastore.Datastore
import com.google.cloud.datastore.DatastoreOptions
import com.google.cloud.datastore.Query

fun createDatastore(projectId: String, namespace: String = ""): Datastore =
    DatastoreOptions.newBuilder().setProjectId(projectId).also {
        if (namespace.isNotBlank())
            it.setNamespace(namespace)
    }.build().service

fun Datastore.deleteAllEntitiesOfKind(kind: String) {
    Query.newKeyQueryBuilder()
        .setKind(kind)
        .build()
        .let(this::run)
        .asSequence()
        .toList()
        .toTypedArray()
        .let { delete(*it) }
}