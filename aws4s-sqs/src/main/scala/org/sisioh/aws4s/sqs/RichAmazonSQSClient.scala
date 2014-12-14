package org.sisioh.aws4s.sqs

import com.amazonaws._
import com.amazonaws.auth.{AWSCredentials, AWSCredentialsProvider}
import com.amazonaws.metrics.RequestMetricCollector
import com.amazonaws.regions.Region
import com.amazonaws.services.sqs.AmazonSQSClient
import com.amazonaws.services.sqs.model._
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._
import scala.util.Try

object AmazonSQSClientFactory {

  def create(): AmazonSQSClient = new AmazonSQSClient()

  def create(clientConfiguration: ClientConfiguration) = new AmazonSQSClient(clientConfiguration)

  def create(awsCredentials: AWSCredentials) = new AmazonSQSClient(awsCredentials)

  def create(awsCredentials: AWSCredentials, clientConfiguration: ClientConfiguration) = new AmazonSQSClient(awsCredentials, clientConfiguration)

  def create(awsCredentialsProvider: AWSCredentialsProvider) = new AmazonSQSClient(awsCredentialsProvider)

  def create(awsCredentialsProvider: AWSCredentialsProvider, clientConfiguration: ClientConfiguration) =
   new AmazonSQSClient(awsCredentialsProvider, clientConfiguration)

  def create(awsCredentialsProvider: AWSCredentialsProvider, clientConfiguration: ClientConfiguration, requestMetricCollector: RequestMetricCollector) =
    new AmazonSQSClient(awsCredentialsProvider, clientConfiguration, requestMetricCollector)

}

class RichAmazonSQSClient(val underlying: AmazonSQSClient) extends AnyVal with PimpedType[AmazonSQSClient] {

  def setEndpoint(value: Option[String]): Unit = underlying.setEndpoint(value.orNull)

  def setRegion(value: Option[Region]): Unit = underlying.setRegion(value.orNull)

  def setQueueAttributes(value: Option[SetQueueAttributesRequest]): Unit = underlying.setQueueAttributes(value.orNull)

  def changeMessageVisibilityBatch(value: ChangeMessageVisibilityBatchRequest): Try[ChangeMessageVisibilityBatchResult] =
    Try(underlying.changeMessageVisibilityBatch(value))

  def changeMessageVisibility(value: ChangeMessageVisibilityRequest): Try[Unit] =
    Try(underlying.changeMessageVisibility(value))

  def getQueueUrl(value: GetQueueUrlRequest): Try[GetQueueUrlResult] =
    Try(underlying.getQueueUrl(value))

  def removePermission(value: RemovePermissionRequest): Try[Unit] =
    Try(underlying.removePermission(value))

  def getQueueAttributes(value: GetQueueAttributesRequest): Try[GetQueueAttributesResult] =
    Try(underlying.getQueueAttributes(value))

  def sendMessageBatch(value: SendMessageBatchRequest): Try[SendMessageBatchResult] =
    Try(underlying.sendMessageBatch(value))

  def listDeadLetterSourceQueues(value: ListDeadLetterSourceQueuesRequest): Try[ListDeadLetterSourceQueuesResult] =
    Try(underlying.listDeadLetterSourceQueues(value))

  def deleteQueue(value: DeleteQueueRequest): Try[Unit] =
    Try(underlying.deleteQueue(value))

  def sendMessage(value: SendMessageRequest): Try[SendMessageResult] =
    Try(underlying.sendMessage(value))

  def receiveMessage(value: ReceiveMessageRequest): Try[ReceiveMessageResult] =
    Try(underlying.receiveMessage(value))

  def listQueues(value: ListQueuesRequest): Try[ListQueuesResult] =
    Try(underlying.listQueues(value))

  def deleteMessageBatch(queueUrl: String, entries: Seq[DeleteMessageBatchRequestEntry]): Try[DeleteMessageBatchResult] =
    Try(underlying.deleteMessageBatch(queueUrl, entries.asJava))

  def createQueue(createQueueRequest: CreateQueueRequest): Try[CreateQueueResult] = Try(underlying.createQueue(createQueueRequest))

  def addPermission(queueUrl: String, label: String, aWSAccountIds: Seq[String], actions: Seq[String]): Try[Unit] =
    Try(underlying.addPermission(queueUrl, label, aWSAccountIds.asJava, actions.asJava))

  def deleteMessage(deleteMessageRequest: DeleteMessageRequest): Try[Unit] = Try(underlying.deleteMessage(deleteMessageRequest))

  def listQueues: Try[ListQueuesResult] = Try(underlying.listQueues())

  def setQueueAttributes(queueUrl: String, attributes: Map[String, String]): Unit =
    underlying.setQueueAttributes(queueUrl, attributes.asJava)

  def changeMessageVisibilityBatch(queueUrl: String, entries: Seq[ChangeMessageVisibilityBatchRequestEntry]): Try[ChangeMessageVisibilityBatchResult] =
    Try(underlying.changeMessageVisibilityBatch(queueUrl, entries.asJava))

  def changeMessageVisibility(queueUrl: String, receiptHandle: String, visibilityTimeout: Int) = Try(underlying.changeMessageVisibility(queueUrl, receiptHandle, visibilityTimeout))

  def getQueueUrl(queueName: String): Try[GetQueueUrlResult] = Try(underlying.getQueueUrl(queueName))

  def removePermission(queueUrl: String, label: String) = Try(underlying.removePermission(queueUrl, label))

  def getQueueAttributes(queueUrl: String, attributeNames: Seq[String]): Try[GetQueueAttributesResult] =
    Try(underlying.getQueueAttributes(queueUrl, attributeNames.asJava))

  def sendMessageBatch(queueUrl: String, entries: Seq[SendMessageBatchRequestEntry]): Try[SendMessageBatchResult] =
    Try(underlying.sendMessageBatch(queueUrl, entries.asJava))

  def deleteQueue(value: String): Try[Unit] = Try(underlying.deleteQueue(value))

  def sendMessage(queueUrl: String, messageBody: String): Try[SendMessageResult] = Try(underlying.sendMessage(queueUrl, messageBody))

  def receiveMessage(queueUrl: String): Try[ReceiveMessageResult] = Try(underlying.receiveMessage(queueUrl))

  def listQueues(queueNamePrefix: String): Try[ListQueuesResult] = Try(underlying.listQueues(queueNamePrefix))

  def createQueue(queueName: String): Try[CreateQueueResult] = Try(underlying.createQueue(queueName))

  def addPermission(queueUrl: String, label: String, aWSAccountIds: Seq[String], actions: List[String]) =
    Try(underlying.addPermission(queueUrl, label, aWSAccountIds.asJava, actions.asJava))

  def deleteMessage(queueUrl: String, receiptHandle: String) = Try(underlying.deleteMessage(queueUrl, receiptHandle))

  def shutdown = underlying.shutdown()

  def getCachedResponseMetadata(amazonWebServiceRequest: AmazonWebServiceRequest): Try[ResponseMetadata] =
    Try(underlying.getCachedResponseMetadata(amazonWebServiceRequest))


}
