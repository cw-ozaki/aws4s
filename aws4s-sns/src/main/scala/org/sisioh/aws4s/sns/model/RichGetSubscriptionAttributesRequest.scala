package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.GetSubscriptionAttributesRequest
import org.sisioh.aws4s.PimpedType

object GetSubscriptionAttributesRequestFactory {

  def create(): GetSubscriptionAttributesRequest =
    new GetSubscriptionAttributesRequest()

  def create(subscriptionArn: String): GetSubscriptionAttributesRequest =
    new GetSubscriptionAttributesRequest(subscriptionArn)

}

class RichGetSubscriptionAttributesRequest(val underlying: GetSubscriptionAttributesRequest)
    extends AnyVal with PimpedType[GetSubscriptionAttributesRequest] {

  def subscriptionArnOpt: Option[String] =
    Option(underlying.getSubscriptionArn)

  def subscriptionArnOpt_=(value: Option[String]): Unit =
    underlying.setSubscriptionArn(value.orNull)

  def withSubscriptionArnOpt(value: Option[String]): GetSubscriptionAttributesRequest =
    underlying.withSubscriptionArn(value.orNull)

}
