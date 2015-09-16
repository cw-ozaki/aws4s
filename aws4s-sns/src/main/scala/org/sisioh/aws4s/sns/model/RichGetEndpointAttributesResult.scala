package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.GetEndpointAttributesResult
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object GetEndpointAttributesResultFactory {

  def create(): GetEndpointAttributesResult = new GetEndpointAttributesResult()

}

class RichGetEndpointAttributesResult(val underlying: GetEndpointAttributesResult)
    extends AnyVal with PimpedType[GetEndpointAttributesResult] {

  def attributes: Map[String, String] =
    underlying.getAttributes.asScala.toMap

  def attributes_=(value: Map[String, String]): Unit =
    underlying.setAttributes(value.asJava)

  def withAttributes(attributes: Map[String, String]): GetEndpointAttributesResult =
    underlying.withAttributes(attributes.asJava)

  def attribute_+=(value: (String, String)): Unit =
    underlying.addAttributesEntry(value._1, value._2)

}
