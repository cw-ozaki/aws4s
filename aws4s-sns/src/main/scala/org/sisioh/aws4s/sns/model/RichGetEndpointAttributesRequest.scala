package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.GetEndpointAttributesRequest
import org.sisioh.aws4s.PimpedType

object GetEndpointAttributesRequestFactory {

  def create(): GetEndpointAttributesRequest =
    new GetEndpointAttributesRequest()

}

class RichGetEndpointAttributesRequest(val underlying: GetEndpointAttributesRequest)
    extends AnyVal with PimpedType[GetEndpointAttributesRequest] {

  def endpointArnOpt: Option[String] =
    Option(underlying.getEndpointArn)

  def endpointArnOpt_=(value: Option[String]): Unit =
    underlying.setEndpointArn(value.orNull)

  def withEndpointArnOpt(value: Option[String]): GetEndpointAttributesRequest =
    underlying.withEndpointArn(value.orNull)
}
