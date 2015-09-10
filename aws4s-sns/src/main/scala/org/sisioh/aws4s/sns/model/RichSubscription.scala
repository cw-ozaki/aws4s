package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.Subscription
import org.sisioh.aws4s.PimpedType

object SubscriptionFactory {
  def create(): Subscription =
    new Subscription()

}

class RichSubscription(val underlying: Subscription)
    extends AnyVal with PimpedType[Subscription] {

  def subscriptionArnOpt: Option[String] =
    Option(underlying.getSubscriptionArn)

  def subscriptionArnOpt_=(value: Option[String]): Unit =
    underlying.setSubscriptionArn(value.orNull)

  def withSubscriptionArnOpt(value: Option[String]): Subscription =
    underlying.withSubscriptionArn(value.orNull)

  def ownerOpt: Option[String] = Option(underlying.getOwner)

  def ownerOpt_=(value: Option[String]): Unit =
    underlying.setOwner(value.orNull)

  def withOwnerOpt(value: Option[String]): Subscription =
    underlying.withOwner(value.orNull)

  def protocolOpt: Option[String] = Option(underlying.getProtocol())

  def protocolOpt_=(value: Option[String]): Unit =
    underlying.setProtocol(value.orNull)

  def withProtocolOpt(value: Option[String]): Subscription =
    underlying.withProtocol(value.orNull)

  def endpointOpt: Option[String] = Option(underlying.getEndpoint)

  def endpointOpt_=(value: Option[String]): Unit =
    underlying.setEndpoint(value.orNull)

  def withEndpointOpt(value: Option[String]): Subscription =
    underlying.withEndpoint(value.orNull)

  def topicArnOpt: Option[String] =
    Option(underlying.getTopicArn)

  def topicArnOpt_=(value: Option[String]): Unit =
    underlying.setTopicArn(value.orNull)

  def withTopicArnOpt(value: Option[String]): Subscription =
    underlying.withTopicArn(value.orNull)
}
