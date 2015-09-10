package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.GetPlatformApplicationAttributesRequest
import org.sisioh.aws4s.PimpedType

object GetPlatformApplicationAttributesRequestFactory {

  def create(): GetPlatformApplicationAttributesRequest =
    new GetPlatformApplicationAttributesRequest()

}

class RichGetPlatformApplicationAttributesRequest(val underlying: GetPlatformApplicationAttributesRequest)
    extends AnyVal with PimpedType[GetPlatformApplicationAttributesRequest] {

  def platformApplicationArnOpt: Option[String] =
    Option(underlying.getPlatformApplicationArn)

  def platformApplicationArnOpt_=(value: Option[String]): Unit =
    underlying.setPlatformApplicationArn(value.orNull)

  def withPlatformApplicationArnOpt(value: Option[String]): GetPlatformApplicationAttributesRequest =
    underlying.withPlatformApplicationArn(value.orNull)

}
