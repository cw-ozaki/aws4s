package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.ConfirmSubscriptionRequest
import org.sisioh.aws4s.PimpedType

object ConfirmSubscriptionRequestFactory {

  def create(): ConfirmSubscriptionRequest =
    new ConfirmSubscriptionRequest()

  def create(topicArn: String,
             token: String): ConfirmSubscriptionRequest =
    new ConfirmSubscriptionRequest(topicArn, token)

  def create(topicArn: String,
             token: String,
             authenticateOnUnsubscribe: String): ConfirmSubscriptionRequest =
    new ConfirmSubscriptionRequest(
      topicArn,
      token,
      authenticateOnUnsubscribe)

}

class RichConfirmSubscriptionRequest(val underlying: ConfirmSubscriptionRequest)
    extends AnyVal with PimpedType[ConfirmSubscriptionRequest] {

  def topicArnOpt: Option[String] =
    Option(underlying.getTopicArn)

  def topicArnOpt_=(value: Option[String]): Unit =
    underlying.setTopicArn(value.orNull)

  def withTopicArnOpt(value: Option[String]): ConfirmSubscriptionRequest =
    underlying.withTopicArn(value.orNull)

  def tokenOpt: Option[String] =
    Option(underlying.getToken)

  def tokenOpt_=(value: Option[String]): Unit =
    underlying.setToken(value.orNull)

  def withTokenOpt(value: Option[String]): ConfirmSubscriptionRequest =
    underlying.withToken(value.orNull)

  def authenticateOnUnsubscribeOpt: Option[String] =
    Option(underlying.getAuthenticateOnUnsubscribe)

  def authenticateOnUnsubscribeOpt_=(value: Option[String]) =
    underlying.setAuthenticateOnUnsubscribe(value.orNull)

  def withAuthenticateOnUnsubscribeOpt(authenticateOnUnsubscribe: Option[String]): ConfirmSubscriptionRequest =
    underlying.withAuthenticateOnUnsubscribe(authenticateOnUnsubscribe.orNull)

}
