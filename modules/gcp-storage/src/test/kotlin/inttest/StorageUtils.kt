package inttest

import com.google.cloud.storage.Storage

fun Storage.deleteAllFilesInBucket(bucket: String) {
    list(bucket).iterateAll().forEach { it.delete() }
}