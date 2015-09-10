package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.SetSubscriptionAttributesRequest
import org.sisioh.aws4s.PimpedType

object SetSubscriptionAttributesRequestFactory {

  def create(): SetSubscriptionAttributesRequest =
    new SetSubscriptionAttributesRequest()

  def create(subscriptionArn: String, attributeName: String, attributeValue: String): SetSubscriptionAttributesRequest =
    new SetSubscriptionAttributesRequest(subscriptionArn, attributeName, attributeValue)
}

class RichSetSubscriptionAttributesRequest(val underlying: SetSubscriptionAttributesRequest)
    extends AnyVal with PimpedType[SetSubscriptionAttributesRequest] {

  def subscriptionArnOpt: Option[String] =
    Option(underlying.getSubscriptionArn)

  def subscriptionArnOpt_=(value: Option[String]): Unit =
    underlying.setSubscriptionArn(value.orNull)

  def withSubscriptionArnOpt(value: Option[String]): SetSubscriptionAttributesRequest =
    underlying.withSubscriptionArn(value.orNull)

  def attributeNameOpt: Option[String] =
    Option(underlying.getAttributeName)

  def attributeNameOpt_=(value: Option[String]): Unit =
    underlying.setAttributeName(value.orNull)

  def withAttributeNameOpt(value: Option[String]): SetSubscriptionAttributesRequest =
    underlying.withAttributeName(value.orNull)

  def attributeValueOpt: Option[String] =
    Option(underlying.getAttributeValue)

  def attributeValueOpt_=(value: Option[String]): Unit =
    underlying.setAttributeValue(value.orNull)

  def withAttributeValueOpt(value: Option[String]): SetSubscriptionAttributesRequest =
    underlying.withAttributeValue(value.orNull)

}
