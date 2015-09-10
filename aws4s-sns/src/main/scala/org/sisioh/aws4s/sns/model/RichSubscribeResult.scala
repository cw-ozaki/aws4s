package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.SubscribeResult
import org.sisioh.aws4s.PimpedType

object SubscribeResultFactory {

  def create(): SubscribeResult =
    new SubscribeResult()

}

class RichSubscribeResult(val underlying: SubscribeResult)
    extends AnyVal with PimpedType[SubscribeResult] {

  def subscriptionArnOpt: Option[String] =
    Option(underlying.getSubscriptionArn)

  def subscriptionArnOpt_=(value: Option[String]): Unit =
    underlying.setSubscriptionArn(value.orNull)

  def withSubscriptionArnOpt(value: Option[String]): SubscribeResult =
    underlying.withSubscriptionArn(value.orNull)

}
