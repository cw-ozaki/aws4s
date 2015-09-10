package org.sisioh.aws4s.sns.Implicits.model

import com.amazonaws.services.sns.model.CreatePlatformApplicationResult
import org.sisioh.aws4s.PimpedType

class RichCreatePlatformApplicationResult(val underlying: CreatePlatformApplicationResult)
  extends AnyVal with PimpedType[CreatePlatformApplicationResult] {

  def platformApplicationArnOpt: Option[String] =
    Option(underlying.getPlatformApplicationArn)

  def withPlatformApplicationArn(platformApplicationArn: Option[String]): CreatePlatformApplicationResult =
    underlying.withPlatformApplicationArn(platformApplicationArn.orNull)


}
