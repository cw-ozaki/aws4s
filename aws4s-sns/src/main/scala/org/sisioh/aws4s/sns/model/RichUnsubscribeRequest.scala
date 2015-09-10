package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.UnsubscribeRequest
import org.sisioh.aws4s.PimpedType

object UnsubscribeRequestFactory {

  def create(): UnsubscribeRequest =
    new UnsubscribeRequest()

  def create(subscriptionArn: String): UnsubscribeRequest =
    new UnsubscribeRequest(subscriptionArn)

}

class RichUnsubscribeRequest(val underlying: UnsubscribeRequest)
    extends AnyVal with PimpedType[UnsubscribeRequest] {

  def subscriptionArnOpt: Option[String] =
    Option(underlying.getSubscriptionArn)

  def subscriptionArnOpt_=(value: Option[String]): Unit =
    underlying.setSubscriptionArn(value.orNull)

  def withSubscriptionArnOpt(value: Option[String]): UnsubscribeRequest =
    underlying.withSubscriptionArn(value.orNull)
}
