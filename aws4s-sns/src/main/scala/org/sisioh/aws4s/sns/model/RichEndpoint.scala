package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.Endpoint
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object EndpointFactory {

  def create(): Endpoint =
    new Endpoint()

}

class RichEndpoint(val underlying: Endpoint)
    extends AnyVal with PimpedType[Endpoint] {

  def endpointArnOpt: Option[String] =
    Option(underlying.getEndpointArn)

  def endpointArnOpt_=(value: Option[String]): Unit =
    underlying.setEndpointArn(value.orNull)

  def withTopicArnOpt(value: Option[String]): Endpoint =
    underlying.withEndpointArn(value.orNull)

  def attributes: Map[String, String] =
    underlying.getAttributes.asScala.toMap

  def attributes_=(value: Map[String, String]): Unit =
    underlying.setAttributes(value.asJava)

  def withAttributes(attributes: Map[String, String]): Endpoint =
    underlying.withAttributes(attributes.asJava)
}
