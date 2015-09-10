package org.sisioh.aws4s.sns.Implicits.model

import com.amazonaws.services.sns.model.ConfirmSubscriptionResult
import org.sisioh.aws4s.PimpedType

class RichConfirmSubscriptionResult(val underlying: ConfirmSubscriptionResult)
    extends AnyVal with PimpedType[ConfirmSubscriptionResult] {

  def subscriptionArnOpt: Option[String] =
    Option(underlying.getSubscriptionArn)

  def withSubscriptionArn(subscriptionArn: Option[String]): ConfirmSubscriptionResult =
    underlying.withSubscriptionArn(subscriptionArn.orNull)

}
