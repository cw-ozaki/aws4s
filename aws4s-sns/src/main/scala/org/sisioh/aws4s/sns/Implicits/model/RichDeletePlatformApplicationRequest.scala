package org.sisioh.aws4s.sns.Implicits.model

import com.amazonaws.services.sns.model.DeletePlatformApplicationRequest
import org.sisioh.aws4s.PimpedType

object DeletePlatformApplicationRequestFactory {

  def create(platformApplicationArn: String) =
    new DeletePlatformApplicationRequest().withPlatformApplicationArn(platformApplicationArn)
}

class RichDeletePlatformApplicationRequest(val underlying: DeletePlatformApplicationRequest)
  extends AnyVal with PimpedType[DeletePlatformApplicationRequest] {

  def platformApplicationArnOpt: Option[String] =
    Option(underlying.getPlatformApplicationArn)

  def withPlatformApplicationArn(platformApplicationArn: Option[String]): DeletePlatformApplicationRequest =
    underlying.withPlatformApplicationArn(platformApplicationArn.orNull)
  
}
