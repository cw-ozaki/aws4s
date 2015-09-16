package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.ConfirmSubscriptionResult
import org.sisioh.aws4s.PimpedType

object ConfirmSubscriptionResultFactory {

  def create(): ConfirmSubscriptionResult =
    new ConfirmSubscriptionResult()

}

class RichConfirmSubscriptionResult(val underlying: ConfirmSubscriptionResult)
    extends AnyVal with PimpedType[ConfirmSubscriptionResult] {

  def subscriptionArnOpt: Option[String] =
    Option(underlying.getSubscriptionArn)

  def subscriptionArnOpt_=(value: Option[String]): Unit =
    underlying.setSubscriptionArn(value.orNull)

  def withSubscriptionArnOpt(value: Option[String]): ConfirmSubscriptionResult =
    underlying.withSubscriptionArn(value.orNull)

}
