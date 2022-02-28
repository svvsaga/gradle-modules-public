package no.vegvesen.saga.modules.shared.services

import arrow.core.Either

/**
 * Used by backfill process pipeline to maintain which IDs have been processed already,
 * and to check off ones that are processed, so that we know when the backfill is completed.
 *
 * IDs can be any unique identifier, typically a filename like "1234.xml".
 */
interface BackfillProgressChecker {
    /**
     * Save initial or additional IDs to be backfilled for a specific job ID.
     */
    suspend fun saveIds(jobId: String, ids: Collection<String>): Either<Throwable, Unit>

    /**
     * Cross off a backfilled ID and return the immediate remaining count.
     */
    suspend fun completeIdAndGetRemainingCount(jobId: String, id: String): Either<Throwable, Long>

    /**
     * Delete all data for a specific job ID.
     */
    suspend fun clear(jobId: String): Either<Throwable, Unit>

    /**
     * Check if ID has yet to be processed.
     */
    suspend fun isIdPending(jobId: String, fileName: String): Either<Throwable, Boolean>

    /**
     * Return the remaining count of documents to be processed for a given job.
     */
    suspend fun getRemainingCount(jobId: String): Either<Throwable, Long>
}