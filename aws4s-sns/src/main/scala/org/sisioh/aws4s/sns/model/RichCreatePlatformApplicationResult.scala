package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.CreatePlatformApplicationResult
import org.sisioh.aws4s.PimpedType

object CreatePlatformApplicationResultFactory {

  def create(): CreatePlatformApplicationResult =
    new CreatePlatformApplicationResult()

}

class RichCreatePlatformApplicationResult(val underlying: CreatePlatformApplicationResult)
    extends AnyVal with PimpedType[CreatePlatformApplicationResult] {

  def platformApplicationArnOpt: Option[String] =
    Option(underlying.getPlatformApplicationArn)

  def platformApplicationArnOpt_=(value: Option[String]): Unit =
    underlying.setPlatformApplicationArn(value.orNull)

  def withPlatformApplicationArnOpt(value: Option[String]): CreatePlatformApplicationResult =
    underlying.withPlatformApplicationArn(value.orNull)

}
