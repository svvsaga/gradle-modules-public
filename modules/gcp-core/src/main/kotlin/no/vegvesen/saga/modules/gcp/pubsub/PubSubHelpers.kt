package no.vegvesen.saga.modules.gcp.pubsub

import com.google.api.gax.batching.BatchingSettings
import com.google.cloud.pubsub.v1.Publisher
import com.google.cloud.pubsub.v1.stub.GrpcSubscriberStub
import com.google.protobuf.Timestamp
import com.google.pubsub.v1.PullRequest
import com.google.pubsub.v1.ReceivedMessage
import com.google.pubsub.v1.SeekRequest
import com.google.pubsub.v1.TopicName
import java.time.Instant
import org.threeten.bp.Duration

fun createPublisher(
    projectId: String,
    topic: String,
    batchingSettings: BatchingSettings = BatchingSettings.newBuilder().build()
): Publisher = Publisher.newBuilder(TopicName.of(projectId, topic))
    .setBatchingSettings(batchingSettings)
    .build()

fun createBatchingSettings(
    requestByteThreshold: Long = 8192,
    elementCountThreshold: Long = 1000,
    delayThreshold: Duration = Duration.ofSeconds(1)
): BatchingSettings {
    // Publish request get triggered based on request size, messages count & time since last
    // publish, whichever condition is met first.
    return BatchingSettings.newBuilder()
        .setRequestByteThreshold(requestByteThreshold)
        .setElementCountThreshold(elementCountThreshold)
        .setDelayThreshold(delayThreshold)
        .build()
}

fun GrpcSubscriberStub.getMessageCount(pullRequest: PullRequest): Int {
    // Pull requests are not guaranteed to fetch all pending messages at once, so we keep fetching
    var count = pullCallable().call(pullRequest).receivedMessagesCount
    var totalCount = count

    while (count > 0) {
        count = pullCallable().call(pullRequest).receivedMessagesCount
        totalCount += count
    }
    return totalCount
}

fun GrpcSubscriberStub.purgeMessages(subscription: String) {
    val now = Instant.now()
    val timestamp = Timestamp.newBuilder().setSeconds(now.epochSecond).setNanos(now.nano).build()
    seekCallable().call(
        SeekRequest.newBuilder()
            .setSubscription(subscription)
            .setTime(timestamp)
            .build()
    )
}

fun createPullRequest(subscription: String, maxMessages: Int = 10000): PullRequest = PullRequest.newBuilder()
    .setMaxMessages(maxMessages)
    .setSubscription(subscription)
    .build()

fun GrpcSubscriberStub.pullAllMessages(subscription: String): List<ReceivedMessage> {
    val pullRequest = createPullRequest(subscription)
    var allMessages = pullCallable().call(pullRequest).receivedMessagesList
    var count = allMessages.size

    while (count > 0) {
        val messages = pullCallable().call(pullRequest).receivedMessagesList
        allMessages = allMessages.plus(messages)
        count = messages.size
    }
    return allMessages
}
