package org.sisioh.aws4s.sns

import com.amazonaws.auth.{ AWSCredentials, AWSCredentialsProvider }
import com.amazonaws.metrics.RequestMetricCollector
import com.amazonaws.regions.Region
import com.amazonaws.services.sns.AmazonSNSClient
import com.amazonaws.services.sns.model._
import com.amazonaws.{ AmazonWebServiceRequest, ClientConfiguration, ResponseMetadata }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._
import scala.util.Try

object AmazonSNSClientFactory {
  def create(): AmazonSNSClient =
    new AmazonSNSClient()

  def create(clientConfiguration: ClientConfiguration): AmazonSNSClient =
    new AmazonSNSClient(clientConfiguration)

  def create(awsCredentials: AWSCredentials): AmazonSNSClient =
    new AmazonSNSClient(awsCredentials)

  def create(awsCredentials: AWSCredentials, clientConfiguration: ClientConfiguration): AmazonSNSClient =
    new AmazonSNSClient(awsCredentials, clientConfiguration)

  def create(awsCredentialsProvider: AWSCredentialsProvider): AmazonSNSClient =
    new AmazonSNSClient(awsCredentialsProvider)

  def create(awsCredentialsProvider: AWSCredentialsProvider, clientConfiguration: ClientConfiguration) =
    new AmazonSNSClient(awsCredentialsProvider, clientConfiguration)

  def create(awsCredentialsProvider: AWSCredentialsProvider, clientConfiguration: ClientConfiguration, requestMetricCollector: RequestMetricCollector) =
    new AmazonSNSClient(awsCredentialsProvider, clientConfiguration, requestMetricCollector)

}

class RichAmazonSNSClient(val underlying: AmazonSNSClient) extends AnyVal with PimpedType[AmazonSNSClient] {
  def setEndpointAsTry(endpoint: String): Try[Unit] = Try {
    underlying.setEndpoint(endpoint)
  }

  def setRegionAsTry(region: Region): Try[Unit] = Try {
    underlying.setRegion(region)
  }

  def confirmSubscriptionAsTry(confirmSubscriptionRequest: ConfirmSubscriptionRequest): Try[ConfirmSubscriptionResult] = Try {
    underlying.confirmSubscription(confirmSubscriptionRequest)
  }

  def createPlatformApplicationAsTry(createPlatformApplicationRequest: CreatePlatformApplicationRequest): Try[CreatePlatformApplicationResult] = Try {
    underlying.createPlatformApplication(createPlatformApplicationRequest)
  }

  def getTopicAttributesAsTry(getTopicAttributesRequest: GetTopicAttributesRequest): Try[GetTopicAttributesResult] = Try {
    underlying.getTopicAttributes(getTopicAttributesRequest)
  }

  def subscribeAsTry(subscribeRequest: SubscribeRequest): Try[SubscribeResult] = Try {
    underlying.subscribe(subscribeRequest)
  }

  def deleteEndpointAsTry(deleteEndpointRequest: DeleteEndpointRequest): Try[Unit] = Try {
    underlying.deleteEndpoint(deleteEndpointRequest)
  }

  def setTopicAttributesAsTry(setTopicAttributesRequest: SetTopicAttributesRequest): Try[Unit] = Try {
    underlying.setTopicAttributes(setTopicAttributesRequest)
  }

  def removePermissionAsTry(removePermissionRequest: RemovePermissionRequest): Try[Unit] = Try {
    underlying.removePermission(removePermissionRequest)
  }

  def getEndpointAttributesAsTry(getEndpointAttributesRequest: GetEndpointAttributesRequest): Try[GetEndpointAttributesResult] = Try {
    underlying.getEndpointAttributes(getEndpointAttributesRequest)
  }

  def listSubscriptionsAsTry(listSubscriptionsRequest: ListSubscriptionsRequest): Try[ListSubscriptionsResult] = Try {
    underlying.listSubscriptions(listSubscriptionsRequest)
  }

  def createPlatformEndpointAsTry(createPlatformEndpointRequest: CreatePlatformEndpointRequest): Try[CreatePlatformEndpointResult] = Try {
    underlying.createPlatformEndpoint(createPlatformEndpointRequest)
  }

  def setSubscriptionAttributesAsTry(setSubscriptionAttributesRequest: SetSubscriptionAttributesRequest): Try[Unit] = Try {
    underlying.setSubscriptionAttributes(setSubscriptionAttributesRequest)
  }

  def createTopicAsTry(createTopicRequest: CreateTopicRequest): Try[CreateTopicResult] = Try {
    underlying.createTopic(createTopicRequest)
  }

  def getSubscriptionAttributesAsTry(getSubscriptionAttributesRequest: GetSubscriptionAttributesRequest): Try[GetSubscriptionAttributesResult] = Try {
    underlying.getSubscriptionAttributes(getSubscriptionAttributesRequest)
  }

  def listTopicsAsTry(listTopicsRequest: ListTopicsRequest): Try[ListTopicsResult] = Try {
    underlying.listTopics(listTopicsRequest)
  }

  def deletePlatformApplicationAsTry(deletePlatformApplicationRequest: DeletePlatformApplicationRequest): Try[Unit] = Try {
    underlying.deletePlatformApplication(deletePlatformApplicationRequest)
  }

  def listPlatformApplicationsAsTry(listPlatformApplicationsRequest: ListPlatformApplicationsRequest): Try[ListPlatformApplicationsResult] = Try {
    underlying.listPlatformApplications(listPlatformApplicationsRequest)
  }

  def setEndpointAttributesAsTry(setEndpointAttributesRequest: SetEndpointAttributesRequest): Try[Unit] = Try {
    underlying.setEndpointAttributes(setEndpointAttributesRequest)
  }

  def unsubscribeAsTry(unsubscribeRequest: UnsubscribeRequest): Try[Unit] = Try {
    underlying.unsubscribe(unsubscribeRequest)
  }

  def deleteTopicAsTry(deleteTopicRequest: DeleteTopicRequest): Try[Unit] = Try {
    underlying.deleteTopic(deleteTopicRequest)
  }

  def getPlatformApplicationAttributesAsTry(getPlatformApplicationAttributesRequest: GetPlatformApplicationAttributesRequest): Try[GetPlatformApplicationAttributesResult] = Try {
    underlying.getPlatformApplicationAttributes(getPlatformApplicationAttributesRequest)
  }

  def setPlatformApplicationAttributesAsTry(setPlatformApplicationAttributesRequest: SetPlatformApplicationAttributesRequest): Try[Unit] = Try {
    underlying.setPlatformApplicationAttributes(setPlatformApplicationAttributesRequest)
  }

  def addPermissionAsTry(addPermissionRequest: AddPermissionRequest): Try[Unit] = Try {
    underlying.addPermission(addPermissionRequest)
  }

  def listEndpointsByPlatformApplicationAsTry(listEndpointsByPlatformApplicationRequest: ListEndpointsByPlatformApplicationRequest): Try[ListEndpointsByPlatformApplicationResult] = Try {
    underlying.listEndpointsByPlatformApplication(listEndpointsByPlatformApplicationRequest)
  }

  def listSubscriptionsByTopicAsTry(listSubscriptionsByTopicRequest: ListSubscriptionsByTopicRequest): Try[ListSubscriptionsByTopicResult] = Try {
    underlying.listSubscriptionsByTopic(listSubscriptionsByTopicRequest)
  }

  def publishAsTry(publishRequest: PublishRequest): Try[PublishResult] = Try {
    underlying.publish(publishRequest)
  }

  def listSubscriptionsAsTry(): Try[ListSubscriptionsResult] = Try {
    underlying.listSubscriptions()
  }

  def listTopicsAsTry(): Try[ListTopicsResult] = Try {
    underlying.listTopics()
  }

  def listPlatformApplicationsAsTry(): Try[ListPlatformApplicationsResult] = Try {
    underlying.listPlatformApplications()
  }

  def confirmSubscriptionAsTry(topicArn: String, token: String, authenticateOnUnsubscribe: String): Try[ConfirmSubscriptionResult] = Try {
    underlying.confirmSubscription(topicArn, token, authenticateOnUnsubscribe)
  }

  def confirmSubscriptionAsTry(topicArn: String, token: String): Try[ConfirmSubscriptionResult] = Try {
    underlying.confirmSubscription(topicArn, token)
  }

  def getTopicAttributesAsTry(topicArn: String): Try[GetTopicAttributesResult] = Try {
    underlying.getTopicAttributes(topicArn)
  }

  def subscribeAsTry(topicArn: String, protocol: String, endpoint: String): Try[SubscribeResult] = Try {
    underlying.subscribe(topicArn, protocol, endpoint)
  }

  def setTopicAttributesAsTry(topicArn: String, attributeName: String, attributeValue: String): Try[Unit] = Try {
    underlying.setTopicAttributes(topicArn, attributeName, attributeValue)
  }

  def removePermissionAsTry(topicArn: String, label: String): Try[Unit] = Try {
    underlying.removePermission(topicArn, label)
  }

  def listSubscriptionsAsTry(nextToken: String): Try[ListSubscriptionsResult] = Try {
    underlying.listSubscriptions(nextToken)
  }

  def setSubscriptionAttributesAsTry(subscriptionArn: String, attributeName: String, attributeValue: String): Try[Unit] = Try {
    underlying.setSubscriptionAttributes(subscriptionArn, attributeName, attributeValue)
  }

  def createTopicAsTry(name: String): Try[CreateTopicResult] = Try {
    underlying.createTopic(name)
  }

  def getSubscriptionAttributesAsTry(subscriptionArn: String): Try[GetSubscriptionAttributesResult] = Try {
    underlying.getSubscriptionAttributes(subscriptionArn)
  }

  def listTopicsAsTry(nextToken: String): Try[ListTopicsResult] = Try {
    underlying.listTopics(nextToken)
  }

  def unsubscribeAsTry(subscriptionArn: String): Try[Unit] = Try {
    underlying.unsubscribe(subscriptionArn)
  }

  def deleteTopicAsTry(topicArn: String): Try[Unit] = Try {
    underlying.deleteTopic(topicArn)
  }

  def addPermissionAsTry(topicArn: String, label: String, aWSAccountIds: Seq[String], actionNames: Seq[String]): Try[Unit] = Try {
    underlying.addPermission(topicArn, label, aWSAccountIds.asJava, actionNames.asJava)
  }

  def listSubscriptionsByTopicAsTry(topicArn: String, nextToken: String): Try[ListSubscriptionsByTopicResult] = Try {
    underlying.listSubscriptionsByTopic(topicArn, nextToken)
  }

  def listSubscriptionsByTopicAsTry(topicArn: String): Try[ListSubscriptionsByTopicResult] = Try {
    underlying.listSubscriptionsByTopic(topicArn)
  }

  def publishAsTry(topicArn: String, message: String): Try[PublishResult] = Try {
    underlying.publish(topicArn, message)
  }

  def publishAsTry(topicArn: String, message: String, subject: String): Try[PublishResult] = Try {
    underlying.publish(topicArn, message, subject)
  }

  def getCachedResponseMetadataAsTry(request: AmazonWebServiceRequest): Try[ResponseMetadata] = Try {
    underlying.getCachedResponseMetadata(request)
  }

}
