package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.GetTopicAttributesRequest
import org.sisioh.aws4s.PimpedType

object GetTopicAttributesRequestFactory {

  def create(): GetTopicAttributesRequest =
    new GetTopicAttributesRequest()

  def create(topicArn: String): GetTopicAttributesRequest =
    new GetTopicAttributesRequest(topicArn)

}

class RichGetTopicAttributesRequest(val underlying: GetTopicAttributesRequest)
    extends AnyVal with PimpedType[GetTopicAttributesRequest] {

  def topicArnOpt: Option[String] =
    Option(underlying.getTopicArn)

  def topicArnOpt_=(value: Option[String]): Unit =
    underlying.setTopicArn(value.orNull)

  def withTopicArn(value: Option[String]): GetTopicAttributesRequest =
    underlying.withTopicArn(value.orNull)

}
