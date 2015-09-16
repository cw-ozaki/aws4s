package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationRequest
import org.sisioh.aws4s.PimpedType

object ListEndpointsByPlatformApplicationRequestFactory {
  def create(): ListEndpointsByPlatformApplicationRequest =
    new ListEndpointsByPlatformApplicationRequest()
}

class RichListEndpointsByPlatformApplicationRequest(val underlying: ListEndpointsByPlatformApplicationRequest)
    extends AnyVal with PimpedType[ListEndpointsByPlatformApplicationRequest] {

  def platformApplicationArnOpt: Option[String] =
    Option(underlying.getPlatformApplicationArn)

  def platformApplicationArnOpt_=(value: Option[String]): Unit =
    underlying.setPlatformApplicationArn(value.orNull)

  def withPlatformApplicationArnOpt(value: Option[String]): ListEndpointsByPlatformApplicationRequest =
    underlying.withPlatformApplicationArn(value.orNull)

  def nextTokenOpt: Option[String] = Option(underlying.getNextToken)

  def nextTokenOpt_=(value: Option[String]): Unit =
    underlying.setNextToken(value.orNull)

  def withNextTokenOpt(value: Option[String]): ListEndpointsByPlatformApplicationRequest =
    underlying.withNextToken(value.orNull)

}
