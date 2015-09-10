package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.GetPlatformApplicationAttributesResult
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object GetPlatformApplicationAttributesResultFactory {

  def create(): GetPlatformApplicationAttributesResult =
    new GetPlatformApplicationAttributesResult()

}

class RichGetPlatformApplicationAttributesResult(val underlying: GetPlatformApplicationAttributesResult)
    extends AnyVal with PimpedType[GetPlatformApplicationAttributesResult] {

  def attributes: Map[String, String] =
    underlying.getAttributes.asScala.toMap

  def attributes_=(value: Map[String, String]): Unit =
    underlying.setAttributes(value.asJava)

  def withAttributes(attributes: Map[String, String]): GetPlatformApplicationAttributesResult =
    underlying.withAttributes(attributes.asJava)

  def attribute_+=(value: (String, String)): Unit =
    underlying.addAttributesEntry(value._1, value._2)

}
