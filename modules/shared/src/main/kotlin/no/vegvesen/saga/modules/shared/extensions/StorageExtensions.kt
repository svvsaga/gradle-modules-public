package no.vegvesen.saga.modules.shared.extensions

import no.vegvesen.saga.modules.shared.blobstorage.StoragePath
import no.vegvesen.saga.modules.shared.functions.StorageEvent

fun StorageEvent.toStoragePath(): StoragePath = StoragePath(bucket, name)
