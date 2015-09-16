package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.ListPlatformApplicationsRequest
import org.sisioh.aws4s.PimpedType

object ListPlatformApplicationsRequestFactory {
  def create(): ListPlatformApplicationsRequest =
    new ListPlatformApplicationsRequest()

}

class RichListPlatformApplicationsRequest(val underlying: ListPlatformApplicationsRequest)
    extends AnyVal with PimpedType[ListPlatformApplicationsRequest] {

  def nextTokenOpt: Option[String] = Option(underlying.getNextToken)

  def nextTokenOpt_=(value: Option[String]): Unit =
    underlying.setNextToken(value.orNull)

  def withNextTokenOpt(value: Option[String]): ListPlatformApplicationsRequest =
    underlying.withNextToken(value.orNull)

}
