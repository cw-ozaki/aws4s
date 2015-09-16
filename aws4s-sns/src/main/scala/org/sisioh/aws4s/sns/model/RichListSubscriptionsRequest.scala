package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.ListSubscriptionsRequest
import org.sisioh.aws4s.PimpedType

object ListSubscriptionsRequestFactory {
  def create(): ListSubscriptionsRequest =
    new ListSubscriptionsRequest()

  def create(nextToken: String): ListSubscriptionsRequest =
    new ListSubscriptionsRequest(nextToken)
}

class RichListSubscriptionsRequest(val underlying: ListSubscriptionsRequest)
    extends AnyVal with PimpedType[ListSubscriptionsRequest] {

  def nextTokenOpt: Option[String] = Option(underlying.getNextToken)

  def nextTokenOpt_=(value: Option[String]): Unit =
    underlying.setNextToken(value.orNull)

  def withNextTokenOpt(value: Option[String]): ListSubscriptionsRequest =
    underlying.withNextToken(value.orNull)
}
