package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.SetTopicAttributesRequest
import org.sisioh.aws4s.PimpedType

object SetTopicAttributesRequestFactory {

  def create(): SetTopicAttributesRequest =
    new SetTopicAttributesRequest()

  def create(topicArn: String, attributeName: String, attributeValue: String): SetTopicAttributesRequest =
    new SetTopicAttributesRequest(topicArn, attributeName, attributeValue)

}

class RichSetTopicAttributesRequest(val underlying: SetTopicAttributesRequest)
    extends AnyVal with PimpedType[SetTopicAttributesRequest] {

  def topicArnOpt: Option[String] =
    Option(underlying.getTopicArn)

  def topicArnOpt_=(value: Option[String]): Unit =
    underlying.setTopicArn(value.orNull)

  def withTopicArnOpt(value: Option[String]): SetTopicAttributesRequest =
    underlying.withTopicArn(value.orNull)

  def attributeNameOpt: Option[String] =
    Option(underlying.getAttributeName)

  def attributeNameOpt_=(value: Option[String]): Unit =
    underlying.setAttributeName(value.orNull)

  def withAttributeNameOpt(value: Option[String]): SetTopicAttributesRequest =
    underlying.withAttributeName(value.orNull)

  def attributeValueOpt: Option[String] =
    Option(underlying.getAttributeValue)

  def attributeValueOpt_=(value: Option[String]): Unit =
    underlying.setAttributeValue(value.orNull)

  def withAttributeValueOpt(value: Option[String]): SetTopicAttributesRequest =
    underlying.withAttributeValue(value.orNull)
}
