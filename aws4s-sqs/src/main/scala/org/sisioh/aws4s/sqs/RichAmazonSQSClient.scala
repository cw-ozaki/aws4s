package org.sisioh.aws4s.sqs

import com.amazonaws._
import com.amazonaws.auth.{ AWSCredentials, AWSCredentialsProvider }
import com.amazonaws.metrics.RequestMetricCollector
import com.amazonaws.regions.Region
import com.amazonaws.services.sqs.AmazonSQSClient
import com.amazonaws.services.sqs.model._
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._
import scala.util.Try

object AmazonSQSClientFactory {

  def create(): AmazonSQSClient = new AmazonSQSClient()

  def create(clientConfiguration: ClientConfiguration): AmazonSQSClient = new AmazonSQSClient(clientConfiguration)

  def create(awsCredentials: AWSCredentials): AmazonSQSClient = new AmazonSQSClient(awsCredentials)

  def create(awsCredentials: AWSCredentials, clientConfiguration: ClientConfiguration): AmazonSQSClient = new AmazonSQSClient(awsCredentials, clientConfiguration)

  def create(awsCredentialsProvider: AWSCredentialsProvider): AmazonSQSClient = new AmazonSQSClient(awsCredentialsProvider)

  def create(awsCredentialsProvider: AWSCredentialsProvider, clientConfiguration: ClientConfiguration): AmazonSQSClient =
    new AmazonSQSClient(awsCredentialsProvider, clientConfiguration)

  def create(awsCredentialsProvider: AWSCredentialsProvider, clientConfiguration: ClientConfiguration, requestMetricCollector: RequestMetricCollector): AmazonSQSClient =
    new AmazonSQSClient(awsCredentialsProvider, clientConfiguration, requestMetricCollector)

}

class RichAmazonSQSClient(val underlying: AmazonSQSClient) extends AnyVal with PimpedType[AmazonSQSClient] {

  def setQueueAttributes(value: Option[SetQueueAttributesRequest]): Unit = underlying.setQueueAttributes(value.orNull)

  def changeMessageVisibilityBatchAsTry(value: ChangeMessageVisibilityBatchRequest): Try[ChangeMessageVisibilityBatchResult] =
    Try(underlying.changeMessageVisibilityBatch(value))

  def changeMessageVisibilityAsTry(value: ChangeMessageVisibilityRequest): Try[Unit] =
    Try(underlying.changeMessageVisibility(value))

  def getQueueUrlAsTry(value: GetQueueUrlRequest): Try[GetQueueUrlResult] =
    Try(underlying.getQueueUrl(value))

  def removePermissionAsTry(value: RemovePermissionRequest): Try[Unit] =
    Try(underlying.removePermission(value))

  def getQueueAttributesAsTry(value: GetQueueAttributesRequest): Try[GetQueueAttributesResult] =
    Try(underlying.getQueueAttributes(value))

  def sendMessageBatchAsTry(value: SendMessageBatchRequest): Try[SendMessageBatchResult] =
    Try(underlying.sendMessageBatch(value))

  def listDeadLetterSourceQueuesAsTry(value: ListDeadLetterSourceQueuesRequest): Try[ListDeadLetterSourceQueuesResult] =
    Try(underlying.listDeadLetterSourceQueues(value))

  def deleteQueueAsTry(value: DeleteQueueRequest): Try[Unit] =
    Try(underlying.deleteQueue(value))

  def sendMessageAsTry(value: SendMessageRequest): Try[SendMessageResult] =
    Try(underlying.sendMessage(value))

  def receiveMessageAsTry(value: ReceiveMessageRequest): Try[ReceiveMessageResult] =
    Try(underlying.receiveMessage(value))

  def listQueuesAsTry(value: ListQueuesRequest): Try[ListQueuesResult] =
    Try(underlying.listQueues(value))

  def deleteMessageBatchAsTry(queueUrl: String, entries: Seq[DeleteMessageBatchRequestEntry]): Try[DeleteMessageBatchResult] =
    Try(underlying.deleteMessageBatch(queueUrl, entries.asJava))

  def deleteMessageBatchAsTry(deleteMessageBatchRequest: DeleteMessageBatchRequest): Try[DeleteMessageBatchResult] =
    Try(underlying.deleteMessageBatch(deleteMessageBatchRequest))

  def createQueueAsTry(createQueueRequest: CreateQueueRequest): Try[CreateQueueResult] = Try(underlying.createQueue(createQueueRequest))

  def addPermissionAsTry(queueUrl: String, label: String, aWSAccountIds: Seq[String], actions: Seq[String]): Try[Unit] =
    Try(underlying.addPermission(queueUrl, label, aWSAccountIds.asJava, actions.asJava))

  def deleteMessageAsTry(deleteMessageRequest: DeleteMessageRequest): Try[Unit] = Try(underlying.deleteMessage(deleteMessageRequest))

  def listQueuesAsTry: Try[ListQueuesResult] = Try(underlying.listQueues())

  def setQueueAttributes(queueUrl: String, attributes: Map[String, String]): Unit =
    underlying.setQueueAttributes(queueUrl, attributes.asJava)

  def changeMessageVisibilityBatchAsTry(queueUrl: String, entries: Seq[ChangeMessageVisibilityBatchRequestEntry]): Try[ChangeMessageVisibilityBatchResult] =
    Try(underlying.changeMessageVisibilityBatch(queueUrl, entries.asJava))

  def changeMessageVisibilityAsTry(queueUrl: String, receiptHandle: String, visibilityTimeout: Int): Try[Unit] =
    Try(underlying.changeMessageVisibility(queueUrl, receiptHandle, visibilityTimeout))

  def getQueueUrlAsTry(queueName: String): Try[GetQueueUrlResult] = Try(underlying.getQueueUrl(queueName))

  def removePermissionAsTry(queueUrl: String, label: String): Try[Unit] =
    Try(underlying.removePermission(queueUrl, label))

  def getQueueAttributesAsTry(queueUrl: String, attributeNames: Seq[String]): Try[GetQueueAttributesResult] =
    Try(underlying.getQueueAttributes(queueUrl, attributeNames.asJava))

  def sendMessageBatchAsTry(queueUrl: String, entries: Seq[SendMessageBatchRequestEntry]): Try[SendMessageBatchResult] =
    Try(underlying.sendMessageBatch(queueUrl, entries.asJava))

  def deleteQueueAsTry(value: String): Try[Unit] = Try(underlying.deleteQueue(value))

  def sendMessageAsTry(queueUrl: String, messageBody: String): Try[SendMessageResult] = Try(underlying.sendMessage(queueUrl, messageBody))

  def receiveMessageAsTry(queueUrl: String): Try[ReceiveMessageResult] = Try(underlying.receiveMessage(queueUrl))

  def listQueuesAsTry(queueNamePrefix: String): Try[ListQueuesResult] = Try(underlying.listQueues(queueNamePrefix))

  def createQueueAsTry(queueName: String): Try[CreateQueueResult] = Try(underlying.createQueue(queueName))

  def addPermissionAsTry(queueUrl: String, label: String, aWSAccountIds: Seq[String], actions: List[String]): Try[Unit] =
    Try(underlying.addPermission(queueUrl, label, aWSAccountIds.asJava, actions.asJava))

  def deleteMessageAsTry(queueUrl: String, receiptHandle: String): Try[Unit] =
    Try(underlying.deleteMessage(queueUrl, receiptHandle))

  def shutdown(): Unit = underlying.shutdown()

  def getCachedResponseMetadataAsTry(amazonWebServiceRequest: AmazonWebServiceRequest): Try[ResponseMetadata] =
    Try(underlying.getCachedResponseMetadata(amazonWebServiceRequest))

}
