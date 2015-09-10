package org.sisioh.aws4s.sns.Implicits.model

import com.amazonaws.services.sns.model.CreatePlatformEndpointResult
import org.sisioh.aws4s.PimpedType

class RichCreatePlatformEndpointResult(val underlying: CreatePlatformEndpointResult)
  extends AnyVal with PimpedType[CreatePlatformEndpointResult] {

  def endpointArnOpt: Option[String] =
    Option(underlying.getEndpointArn)

  def withEndpointArn(endpointArn: Option[String]): CreatePlatformEndpointResult =
    underlying.withEndpointArn(endpointArn.orNull)

}
