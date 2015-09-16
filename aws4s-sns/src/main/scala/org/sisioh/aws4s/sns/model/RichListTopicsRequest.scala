package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.ListTopicsRequest
import org.sisioh.aws4s.PimpedType

object ListTopicsRequestFactory {

  def create(): ListTopicsRequest =
    new ListTopicsRequest()

  def create(nextToken: String): ListTopicsRequest =
    new ListTopicsRequest(nextToken)
}

class RichListTopicsRequest(val underlying: ListTopicsRequest)
    extends AnyVal with PimpedType[ListTopicsRequest] {

  def nextTokenOpt: Option[String] = Option(underlying.getNextToken)

  def nextTokenOpt_=(value: Option[String]): Unit =
    underlying.setNextToken(value.orNull)

  def withNextTokenOpt(value: Option[String]): ListTopicsRequest =
    underlying.withNextToken(value.orNull)

}
