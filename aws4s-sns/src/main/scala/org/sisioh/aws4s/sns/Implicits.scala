package org.sisioh.aws4s.sns

import com.amazonaws.services.sns.AmazonSNSClient
import com.amazonaws.services.sns.model._
import org.sisioh.aws4s.sns.model._

object Implicits extends Implicits with ModelImplicits

trait Implicits {

  implicit def richAmazonSNSClient(underlying: AmazonSNSClient): RichAmazonSNSClient = new RichAmazonSNSClient(underlying)

}

trait ModelImplicits {

  implicit def richAddPermissionRequest(underlying: AddPermissionRequest): RichAddPermissionRequest = new RichAddPermissionRequest(underlying)

  implicit def richConfirmSubscriptionRequest(underlying: ConfirmSubscriptionRequest): RichConfirmSubscriptionRequest = new RichConfirmSubscriptionRequest(underlying)

  implicit def richConfirmSubscriptionResult(underlying: ConfirmSubscriptionResult): RichConfirmSubscriptionResult = new RichConfirmSubscriptionResult(underlying)

  implicit def richCreatePlatformApplicationRequest(underlying: CreatePlatformApplicationRequest): RichCreatePlatformApplicationRequest = new RichCreatePlatformApplicationRequest(underlying)

  implicit def richCreatePlatformApplicationResult(underlying: CreatePlatformApplicationResult): RichCreatePlatformApplicationResult = new RichCreatePlatformApplicationResult(underlying)

  implicit def richCreatePlatformEndpointRequest(underlying: CreatePlatformEndpointRequest): RichCreatePlatformEndpointRequest = new RichCreatePlatformEndpointRequest(underlying)

  implicit def richCreatePlatformEndpointResult(underlying: CreatePlatformEndpointResult): RichCreatePlatformEndpointResult = new RichCreatePlatformEndpointResult(underlying)

  implicit def richCreateTopicRequest(underlying: CreateTopicRequest): RichCreateTopicRequest = new RichCreateTopicRequest(underlying)

  implicit def richCreateTopicResult(underlying: CreateTopicResult): RichCreateTopicResult = new RichCreateTopicResult(underlying)

  implicit def richDeleteEndpointRequest(underlying: DeleteEndpointRequest): RichDeleteEndpointRequest = new RichDeleteEndpointRequest(underlying)

  implicit def richDeletePlatformApplicationRequest(underlying: DeletePlatformApplicationRequest): RichDeletePlatformApplicationRequest = new RichDeletePlatformApplicationRequest(underlying)

  implicit def richDeleteTopicRequest(underlying: DeleteTopicRequest): RichDeleteTopicRequest = new RichDeleteTopicRequest(underlying)

  implicit def richEndpoint(underlying: Endpoint): RichEndpoint = new RichEndpoint(underlying)

  implicit def richGetEndpointAttributesRequest(underlying: GetEndpointAttributesRequest): RichGetEndpointAttributesRequest = new RichGetEndpointAttributesRequest(underlying)

  implicit def richGetEndpointAttributesResult(underlying: GetEndpointAttributesResult): RichGetEndpointAttributesResult = new RichGetEndpointAttributesResult(underlying)

  implicit def richGetPlatformApplicationAttributesRequest(underlying: GetPlatformApplicationAttributesRequest): RichGetPlatformApplicationAttributesRequest = new RichGetPlatformApplicationAttributesRequest(underlying)

  implicit def richGetPlatformApplicationAttributesResult(underlying: GetPlatformApplicationAttributesResult): RichGetPlatformApplicationAttributesResult = new RichGetPlatformApplicationAttributesResult(underlying)

  implicit def richGetSubscriptionAttributesRequest(underlying: GetSubscriptionAttributesRequest): RichGetSubscriptionAttributesRequest = new RichGetSubscriptionAttributesRequest(underlying)

  implicit def richGetSubscriptionAttributesResult(underlying: GetSubscriptionAttributesResult): RichGetSubscriptionAttributesResult = new RichGetSubscriptionAttributesResult(underlying)

  implicit def richGetTopicAttributesRequest(underlying: GetTopicAttributesRequest): RichGetTopicAttributesRequest = new RichGetTopicAttributesRequest(underlying)

  implicit def richGetTopicAttributesResult(underlying: GetTopicAttributesResult): RichGetTopicAttributesResult = new RichGetTopicAttributesResult(underlying)

  implicit def richListEndpointsByPlatformApplicationRequest(underlying: ListEndpointsByPlatformApplicationRequest): RichListEndpointsByPlatformApplicationRequest = new RichListEndpointsByPlatformApplicationRequest(underlying)

  implicit def richListEndpointsByPlatformApplicationResult(underlying: ListEndpointsByPlatformApplicationResult): RichListEndpointsByPlatformApplicationResult = new RichListEndpointsByPlatformApplicationResult(underlying)

  implicit def richListPlatformApplicationsRequest(underlying: ListPlatformApplicationsRequest): RichListPlatformApplicationsRequest = new RichListPlatformApplicationsRequest(underlying)

  implicit def richListPlatformApplicationsResult(underlying: ListPlatformApplicationsResult): RichListPlatformApplicationsResult = new RichListPlatformApplicationsResult(underlying)

  implicit def richListSubscriptionsByTopicRequest(underlying: ListSubscriptionsByTopicRequest): RichListSubscriptionsByTopicRequest = new RichListSubscriptionsByTopicRequest(underlying)

  implicit def richListSubscriptionsByTopicResult(underlying: ListSubscriptionsByTopicResult): RichListSubscriptionsByTopicResult = new RichListSubscriptionsByTopicResult(underlying)

  implicit def richListSubscriptionsRequest(underlying: ListSubscriptionsRequest): RichListSubscriptionsRequest = new RichListSubscriptionsRequest(underlying)

  implicit def richListSubscriptionsResult(underlying: ListSubscriptionsResult): RichListSubscriptionsResult = new RichListSubscriptionsResult(underlying)

  implicit def richListTopicsRequest(underlying: ListTopicsRequest): RichListTopicsRequest = new RichListTopicsRequest(underlying)

  implicit def richListTopicsResult(underlying: ListTopicsResult): RichListTopicsResult = new RichListTopicsResult(underlying)

  implicit def richMessageAttributeValue(underlying: MessageAttributeValue): RichMessageAttributeValue = new RichMessageAttributeValue(underlying)

  implicit def richPlatformApplication(underlying: PlatformApplication): RichPlatformApplication = new RichPlatformApplication(underlying)

  implicit def richPublishRequest(underlying: PublishRequest): RichPublishRequest = new RichPublishRequest(underlying)

  implicit def richPublishResult(underlying: PublishResult): RichPublishResult = new RichPublishResult(underlying)

  implicit def richRemovePermissionRequest(underlying: RemovePermissionRequest): RichRemovePermissionRequest = new RichRemovePermissionRequest(underlying)

  implicit def richSetEndpointAttributesRequest(underlying: SetEndpointAttributesRequest): RichSetEndpointAttributesRequest = new RichSetEndpointAttributesRequest(underlying)

  implicit def richSetPlatformApplicationAttributesRequest(underlying: SetPlatformApplicationAttributesRequest): RichSetPlatformApplicationAttributesRequest = new RichSetPlatformApplicationAttributesRequest(underlying)

  implicit def richSetSubscriptionAttributesRequest(underlying: SetSubscriptionAttributesRequest): RichSetSubscriptionAttributesRequest = new RichSetSubscriptionAttributesRequest(underlying)

  implicit def richSetTopicAttributesRequest(underlying: SetTopicAttributesRequest): RichSetTopicAttributesRequest = new RichSetTopicAttributesRequest(underlying)

  implicit def richSubscribeRequest(underlying: SubscribeRequest): RichSubscribeRequest = new RichSubscribeRequest(underlying)

  implicit def richSubscribeResult(underlying: SubscribeResult): RichSubscribeResult = new RichSubscribeResult(underlying)

  implicit def richSubscription(underlying: Subscription): RichSubscription = new RichSubscription(underlying)

  implicit def richTopic(underlying: Topic): RichTopic = new RichTopic(underlying)

  implicit def richUnsubscribeRequest(underlying: UnsubscribeRequest): RichUnsubscribeRequest = new RichUnsubscribeRequest(underlying)

}