package org.sisioh.aws4s.sqs

import com.amazonaws.ClientConfiguration
import com.amazonaws.auth.{AWSCredentials, AWSCredentialsProvider}
import com.amazonaws.metrics.RequestMetricCollector
import com.amazonaws.services.sqs.AmazonSQSClient
import com.amazonaws.services.sqs.model._
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object AmazonSQSClientFactory {

  def create(): AmazonSQSClient = new AmazonSQSClient()

  def create(clientConfiguration: ClientConfiguration) = new AmazonSQSClient(clientConfiguration)

  def create(awsCredentials: AWSCredentials) = new AmazonSQSClient(awsCredentials)

  def create(awsCredentials: AWSCredentials, clientConfiguration: ClientConfiguration) = new AmazonSQSClient(awsCredentials, clientConfiguration)

  def create(awsCredentialsProvider: AWSCredentialsProvider) = new AmazonSQSClient(awsCredentialsProvider)

  def create(awsCredentialsProvider: AWSCredentialsProvider, clientConfiguration: ClientConfiguration) = new AmazonSQSClient(awsCredentialsProvider, clientConfiguration)

  def create(awsCredentialsProvider: AWSCredentialsProvider, clientConfiguration: ClientConfiguration, requestMetricCollector: RequestMetricCollector) =
    new AmazonSQSClient(awsCredentialsProvider, clientConfiguration, requestMetricCollector)

}

class RichAmazonSQSClient(val underlying: AmazonSQSClient) extends AnyVal with PimpedType[AmazonSQSClient] {

  def setQueueAttributes(queueUrl: String, attributes: Map[String, String]): Unit =
    underlying.setQueueAttributes(queueUrl, attributes.asJava)

  def changeMessageVisibilityBatch(queueUrl: String, entries: Seq[ChangeMessageVisibilityBatchRequestEntry]): ChangeMessageVisibilityBatchResult =
    underlying.changeMessageVisibilityBatch(queueUrl, entries.asJava)

  def getQueueAttributes(queueUrl: String, attributeNames: Seq[String]): GetQueueAttributesResult =
    underlying.getQueueAttributes(queueUrl, attributeNames.asJava)

  def sendMessageBatch(queueUrl: String, entries: Seq[SendMessageBatchRequestEntry]): SendMessageBatchResult =
    underlying.sendMessageBatch(queueUrl, entries.asJava)

  def deleteMessageBatch(queueUrl: String, entries: Seq[DeleteMessageBatchRequestEntry]): DeleteMessageBatchResult =
    underlying.deleteMessageBatch(queueUrl, entries.asJava)

  def addPermission(queueUrl: String, label: String, aWSAccountIds: Seq[String], actions: Seq[String]): Unit =
    underlying.addPermission(queueUrl, label, aWSAccountIds.asJava, actions.asJava)

}
