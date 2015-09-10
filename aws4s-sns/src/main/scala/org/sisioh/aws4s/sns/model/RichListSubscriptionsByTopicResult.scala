package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.{ ListSubscriptionsByTopicResult, Subscription }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ListSubscriptionsByTopicResultFactory {
  def create(): ListSubscriptionsByTopicResult =
    new ListSubscriptionsByTopicResult()

}

class RichListSubscriptionsByTopicResult(val underlying: ListSubscriptionsByTopicResult)
    extends AnyVal with PimpedType[ListSubscriptionsByTopicResult] {

  def nextTokenOpt: Option[String] = Option(underlying.getNextToken)

  def nextTokenOpt_=(value: Option[String]): Unit =
    underlying.setNextToken(value.orNull)

  def withNextTokenOpt(value: Option[String]): ListSubscriptionsByTopicResult =
    underlying.withNextToken(value.orNull)

  def subscriptions: Seq[Subscription] =
    underlying.getSubscriptions.asScala.toVector

  def subscriptions_=(value: Seq[Subscription]): Unit =
    underlying.setSubscriptions(value.asJava)

  def withSubscription(value: Seq[Subscription]): ListSubscriptionsByTopicResult =
    underlying.withSubscriptions(value.asJava)

}
