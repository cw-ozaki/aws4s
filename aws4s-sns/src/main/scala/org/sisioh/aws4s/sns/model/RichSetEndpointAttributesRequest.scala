package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.SetEndpointAttributesRequest
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object SetEndpointAttributesRequestFactory {
  def create(): SetEndpointAttributesRequest =
    new SetEndpointAttributesRequest()
}

class RichSetEndpointAttributesRequest(val underlying: SetEndpointAttributesRequest)
    extends AnyVal with PimpedType[SetEndpointAttributesRequest] {

  def endpointArnOpt: Option[String] =
    Option(underlying.getEndpointArn)

  def endpointArnOpt_=(value: Option[String]): Unit =
    underlying.setEndpointArn(value.orNull)

  def withEndpointArnOpt(value: Option[String]): SetEndpointAttributesRequest =
    underlying.withEndpointArn(value.orNull)

  def attributes: Map[String, String] =
    underlying.getAttributes.asScala.toMap

  def attributes_=(value: Map[String, String]): Unit =
    underlying.setAttributes(value.asJava)

  def withAttributes(attributes: Map[String, String]): SetEndpointAttributesRequest =
    underlying.withAttributes(attributes.asJava)

  def attribute_+=(value: (String, String)): Unit =
    underlying.addAttributesEntry(value._1, value._2)

}
