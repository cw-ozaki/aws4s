package org.sisioh.aws4s.sns.Implicits.model

import com.amazonaws.services.sns.model.ConfirmSubscriptionRequest
import org.sisioh.aws4s.PimpedType

object ConfirmSubscriptionRequestFactory {

  def create(): ConfirmSubscriptionRequest =
    new ConfirmSubscriptionRequest()

  def create(topicArn: String, token: String): ConfirmSubscriptionRequest =
    new ConfirmSubscriptionRequest(topicArn, token)

  def create(topicArn: String, token: String, authenticateOnUnsubscribe: String): ConfirmSubscriptionRequest =
    new ConfirmSubscriptionRequest(topicArn, token, authenticateOnUnsubscribe)

}

class RichConfirmSubscriptionRequest(val underlying: ConfirmSubscriptionRequest)
    extends AnyVal with PimpedType[ConfirmSubscriptionRequest] {

  def topicArnOpt: Option[String] =
    Option(underlying.getTopicArn)

  def withTopicArn(topicArn: Option[String]): ConfirmSubscriptionRequest =
    underlying.withTopicArn(topicArn.orNull)

  def tokenOpt: Option[String] =
    Option(underlying.getToken)

  def withToken(token: Option[String]): ConfirmSubscriptionRequest =
    underlying.withToken(token.orNull)

  def authenticateOnUnsubscribeOpt: Option[String] =
    Option(underlying.getAuthenticateOnUnsubscribe)

  def withAuthenticateOnUnsubscribe(authenticateOnUnsubscribe: Option[String]): ConfirmSubscriptionRequest =
    underlying.withAuthenticateOnUnsubscribe(authenticateOnUnsubscribe.orNull)

}
