package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.CreatePlatformEndpointResult
import org.sisioh.aws4s.PimpedType

object CreatePlatformEndpointResultFactory {

  def create(): CreatePlatformEndpointResult =
    new CreatePlatformEndpointResult()

}

class RichCreatePlatformEndpointResult(val underlying: CreatePlatformEndpointResult)
    extends AnyVal with PimpedType[CreatePlatformEndpointResult] {

  def endpointArnOpt: Option[String] =
    Option(underlying.getEndpointArn)

  def endpointArnOpt_=(value: Option[String]): Unit =
    underlying.setEndpointArn(value.orNull)

  def withEndpointArnOpt(value: Option[String]): CreatePlatformEndpointResult =
    underlying.withEndpointArn(value.orNull)

}
