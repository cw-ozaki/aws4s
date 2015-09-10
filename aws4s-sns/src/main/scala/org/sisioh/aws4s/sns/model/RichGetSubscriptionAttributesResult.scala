package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.GetSubscriptionAttributesResult
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object GetSubscriptionAttributesResultFactory {

  def create(): GetSubscriptionAttributesResult =
    new GetSubscriptionAttributesResult()

}

class RichGetSubscriptionAttributesResult(val underlying: GetSubscriptionAttributesResult)
    extends AnyVal with PimpedType[GetSubscriptionAttributesResult] {

  def attributes: Map[String, String] =
    underlying.getAttributes.asScala.toMap

  def attributes_=(value: Map[String, String]): Unit =
    underlying.setAttributes(value.asJava)

  def withAttributes(attributes: Map[String, String]): GetSubscriptionAttributesResult =
    underlying.withAttributes(attributes.asJava)

  def attribute_+=(value: (String, String)): Unit =
    underlying.addAttributesEntry(value._1, value._2)

}
