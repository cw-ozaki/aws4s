package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.DeletePlatformApplicationRequest
import org.sisioh.aws4s.PimpedType

object DeletePlatformApplicationRequestFactory {

  def create(): DeletePlatformApplicationRequest =
    new DeletePlatformApplicationRequest()

}

class RichDeletePlatformApplicationRequest(val underlying: DeletePlatformApplicationRequest)
    extends AnyVal with PimpedType[DeletePlatformApplicationRequest] {

  def platformApplicationArnOpt: Option[String] =
    Option(underlying.getPlatformApplicationArn)

  def platformApplicationArnOpt_=(value: Option[String]): Unit =
    underlying.setPlatformApplicationArn(value.orNull)

  def withPlatformApplicationArnOpt(platformApplicationArn: Option[String]): DeletePlatformApplicationRequest =
    underlying.withPlatformApplicationArn(platformApplicationArn.orNull)

}
