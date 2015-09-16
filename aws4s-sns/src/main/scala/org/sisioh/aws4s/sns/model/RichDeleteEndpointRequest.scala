package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.DeleteEndpointRequest
import org.sisioh.aws4s.PimpedType

object DeleteEndpointRequestFactory {

  def create(): DeleteEndpointRequest =
    new DeleteEndpointRequest()

}

class RichDeleteEndpointRequest(val underlying: DeleteEndpointRequest)
    extends AnyVal with PimpedType[DeleteEndpointRequest] {

  def endpointArnOpt: Option[String] =
    Option(underlying.getEndpointArn)

  def endpointArnOpt_=(value: Option[String]): Unit =
    underlying.setEndpointArn(value.orNull)

  def withEndpointArnOpt(endpointArn: Option[String]): DeleteEndpointRequest =
    underlying.withEndpointArn(endpointArn.orNull)

}
