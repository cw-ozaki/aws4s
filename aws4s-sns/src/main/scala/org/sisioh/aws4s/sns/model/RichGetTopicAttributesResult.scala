package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.GetTopicAttributesResult
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object GetTopicAttributesResultFactory {

  def create(): GetTopicAttributesResult =
    new GetTopicAttributesResult()

}

class RichGetTopicAttributesResult(val underlying: GetTopicAttributesResult)
    extends AnyVal with PimpedType[GetTopicAttributesResult] {

  def attributes: Map[String, String] =
    underlying.getAttributes.asScala.toMap

  def attributes_=(value: Map[String, String]): Unit =
    underlying.setAttributes(value.asJava)

  def withAttributes(attributes: Map[String, String]): GetTopicAttributesResult =
    underlying.withAttributes(attributes.asJava)

  def attribute_+=(value: (String, String)): Unit =
    underlying.addAttributesEntry(value._1, value._2)

}
