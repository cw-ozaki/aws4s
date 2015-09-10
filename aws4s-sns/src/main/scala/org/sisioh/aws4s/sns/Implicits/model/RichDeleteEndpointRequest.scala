package org.sisioh.aws4s.sns.Implicits.model

import com.amazonaws.services.sns.model.DeleteEndpointRequest
import org.sisioh.aws4s.PimpedType

class RichDeleteEndpointRequest(val underlying: DeleteEndpointRequest)
  extends AnyVal with PimpedType[DeleteEndpointRequest] {

  def endpointArnOpt: Option[String] =
    Option(underlying.getEndpointArn)

  def withEndpointArn(endpointArn: Option[String]): DeleteEndpointRequest =
    underlying.withEndpointArn(endpointArn.orNull)

}
