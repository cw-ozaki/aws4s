package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.{ ListSubscriptionsResult, Subscription }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ListSubscriptionsResultFactory {

  def create(): ListSubscriptionsResult =
    new ListSubscriptionsResult()

}

class RichListSubscriptionsResult(val underlying: ListSubscriptionsResult)
    extends AnyVal with PimpedType[ListSubscriptionsResult] {

  def nextTokenOpt: Option[String] = Option(underlying.getNextToken)

  def nextTokenOpt_=(value: Option[String]): Unit =
    underlying.setNextToken(value.orNull)

  def withNextTokenOpt(value: Option[String]): ListSubscriptionsResult =
    underlying.withNextToken(value.orNull)

  def subscriptions: Seq[Subscription] =
    underlying.getSubscriptions.asScala.toVector

  def subscriptions_=(value: Seq[Subscription]): Unit =
    underlying.setSubscriptions(value.asJava)

  def withSubscription(value: Seq[Subscription]): ListSubscriptionsResult =
    underlying.withSubscriptions(value.asJava)

}
