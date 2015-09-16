package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.ListSubscriptionsByTopicRequest
import org.sisioh.aws4s.PimpedType

object ListSubscriptionsByTopicRequestFactory {

  def create(): ListSubscriptionsByTopicRequest =
    new ListSubscriptionsByTopicRequest()

  def create(topicArn: String): ListSubscriptionsByTopicRequest =
    new ListSubscriptionsByTopicRequest(topicArn)

}

class RichListSubscriptionsByTopicRequest(val underlying: ListSubscriptionsByTopicRequest)
    extends AnyVal with PimpedType[ListSubscriptionsByTopicRequest] {

  def topicArnOpt: Option[String] =
    Option(underlying.getTopicArn)

  def topicArnOpt_=(value: Option[String]): Unit =
    underlying.setTopicArn(value.orNull)

  def withTopicArn(value: Option[String]): ListSubscriptionsByTopicRequest =
    underlying.withTopicArn(value.orNull)

  def nextTokenOpt: Option[String] = Option(underlying.getNextToken)

  def nextTokenOpt_=(value: Option[String]): Unit =
    underlying.setNextToken(value.orNull)

  def withNextTokenOpt(value: Option[String]): ListSubscriptionsByTopicRequest =
    underlying.withNextToken(value.orNull)

}
