package org.sisioh.aws4s.sqs

import com.amazonaws.services.sqs.AmazonSQSClient
import com.amazonaws.services.sqs.model._
import org.sisioh.aws4s.sqs.model._

object Implicits extends Implicits

trait Implicits extends ModelImplicits {

  implicit def richAmazonSQSClient(underlying: AmazonSQSClient): RichAmazonSQSClient = new RichAmazonSQSClient(underlying)

}

trait ModelImplicits {

  implicit def richAddPermissionRequest(underlying: AddPermissionRequest): RichAddPermissionRequest = new RichAddPermissionRequest(underlying)

  implicit def richBatchResultErrorEntry(underlying: BatchResultErrorEntry): RichBatchResultErrorEntry = new RichBatchResultErrorEntry(underlying)

  implicit def richChangeMessageVisibilityBatchRequest(underlying: ChangeMessageVisibilityBatchRequest): RichChangeMessageVisibilityBatchRequest = new RichChangeMessageVisibilityBatchRequest(underlying)

  implicit def richChangeMessageVisibilityBatchRequestEntry(underlying: ChangeMessageVisibilityBatchRequestEntry): RichChangeMessageVisibilityBatchRequestEntry = new RichChangeMessageVisibilityBatchRequestEntry(underlying)

  implicit def richChangeMessageVisibilityBatchResult(underlying: ChangeMessageVisibilityBatchResult): RichChangeMessageVisibilityBatchResult = new RichChangeMessageVisibilityBatchResult(underlying)

  implicit def richChangeMessageVisibilityBatchResultEntry(underlying: ChangeMessageVisibilityBatchResultEntry): RichChangeMessageVisibilityBatchResultEntry = new RichChangeMessageVisibilityBatchResultEntry(underlying)

  implicit def richChangeMessageVisibilityRequest(underlying: ChangeMessageVisibilityRequest): RichChangeMessageVisibilityRequest = new RichChangeMessageVisibilityRequest(underlying)

  implicit def richCreateQueueRequest(underlying: CreateQueueRequest): RichCreateQueueRequest = new RichCreateQueueRequest(underlying)

  implicit def richCreateQueueResult(underlying: CreateQueueResult): RichCreateQueueResult = new RichCreateQueueResult(underlying)

  implicit def richDeleteMessageBatchRequest(underlying: DeleteMessageBatchRequest): RichDeleteMessageBatchRequest = new RichDeleteMessageBatchRequest(underlying)

  implicit def richDeleteMessageBatchRequestEntry(underlying: DeleteMessageBatchRequestEntry): RichDeleteMessageBatchRequestEntry = new RichDeleteMessageBatchRequestEntry(underlying)

  implicit def richDeleteMessageBatchResult(underlying: DeleteMessageBatchResult): RichDeleteMessageBatchResult = new RichDeleteMessageBatchResult(underlying)

  implicit def richDeleteMessageBatchResultEntry(underlying: DeleteMessageBatchResultEntry): RichDeleteMessageBatchResultEntry = new RichDeleteMessageBatchResultEntry(underlying)

  implicit def richDeleteMessageRequest(underlying: DeleteMessageRequest): RichDeleteMessageRequest = new RichDeleteMessageRequest(underlying)

  implicit def richDeleteQueueRequest(underlying: DeleteQueueRequest): RichDeleteQueueRequest = new RichDeleteQueueRequest(underlying)

  implicit def richGetQueueAttributesRequest(underlying: GetQueueAttributesRequest): RichGetQueueAttributesRequest = new RichGetQueueAttributesRequest(underlying)

  implicit def richGetQueueAttributesResult(underlying: GetQueueAttributesResult): RichGetQueueAttributesResult = new RichGetQueueAttributesResult(underlying)

  implicit def richGetQueueUrlRequest(underlying: GetQueueUrlRequest): RichGetQueueUrlRequest = new RichGetQueueUrlRequest(underlying)

  implicit def richGetQueueUrlResult(underlying: GetQueueUrlResult): RichGetQueueUrlResult = new RichGetQueueUrlResult(underlying)

  implicit def richListDeadLetterSourceQueuesRequest(underlying: ListDeadLetterSourceQueuesRequest): RichListDeadLetterSourceQueuesRequest = new RichListDeadLetterSourceQueuesRequest(underlying)

  implicit def richListDeadLetterSourceQueuesResult(underlying: ListDeadLetterSourceQueuesResult): RichListDeadLetterSourceQueuesResult = new RichListDeadLetterSourceQueuesResult(underlying)

  implicit def richListQueuesRequest(underlying: ListQueuesRequest): RichListQueuesRequest = new RichListQueuesRequest(underlying)

  implicit def richListQueuesResult(underlying: ListQueuesResult): RichListQueuesResult = new RichListQueuesResult(underlying)

  implicit def richMessage(underlying: Message): RichMessage = new RichMessage(underlying)

  implicit def richMessageAttributeValue(underlying: MessageAttributeValue): RichMessageAttributeValue = new RichMessageAttributeValue(underlying)

  implicit def richPurgeQueueRequest(underlying: PurgeQueueRequest): RichPurgeQueueRequest = new RichPurgeQueueRequest(underlying)

  implicit def richQueueAttributeName(underlying: QueueAttributeName): RichQueueAttributeName = new RichQueueAttributeName(underlying)

  implicit def richReceiveMessageRequest(underlying: ReceiveMessageRequest): RichReceiveMessageRequest = new RichReceiveMessageRequest(underlying)

  implicit def richReceiveMessageResult(underlying: ReceiveMessageResult): RichReceiveMessageResult = new RichReceiveMessageResult(underlying)

  implicit def richRemovePermissionRequest(underlying: RemovePermissionRequest): RichRemovePermissionRequest = new RichRemovePermissionRequest(underlying)

  implicit def richSendMessageBatchRequest(underlying: SendMessageBatchRequest): RichSendMessageBatchRequest = new RichSendMessageBatchRequest(underlying)

  implicit def richSendMessageBatchRequestEntry(underlying: SendMessageBatchRequestEntry): RichSendMessageBatchRequestEntry = new RichSendMessageBatchRequestEntry(underlying)

  implicit def richSendMessageBatchResult(underlying: SendMessageBatchResult): RichSendMessageBatchResult = new RichSendMessageBatchResult(underlying)

  implicit def richSendMessageBatchResultEntry(underlying: SendMessageBatchResultEntry): RichSendMessageBatchResultEntry = new RichSendMessageBatchResultEntry(underlying)

  implicit def richSendMessageRequest(underlying: SendMessageRequest): RichSendMessageRequest = new RichSendMessageRequest(underlying)

  implicit def richSendMessageResult(underlying: SendMessageResult): RichSendMessageResult = new RichSendMessageResult(underlying)

  implicit def richSetQueueAttributesRequest(underlying: SetQueueAttributesRequest): RichSetQueueAttributesRequest = new RichSetQueueAttributesRequest(underlying)

}

