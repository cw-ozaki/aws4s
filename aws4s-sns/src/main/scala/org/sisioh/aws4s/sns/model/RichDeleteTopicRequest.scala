package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.DeleteTopicRequest
import org.sisioh.aws4s.PimpedType

object DeleteTopicRequestFactory {
  def create(): DeleteTopicRequest =
    new DeleteTopicRequest()

  def create(topicArn: String): DeleteTopicRequest =
    new DeleteTopicRequest(topicArn)
}

class RichDeleteTopicRequest(val underlying: DeleteTopicRequest)
    extends AnyVal with PimpedType[DeleteTopicRequest] {

  def topicArnOpt: Option[String] =
    Option(underlying.getTopicArn)

  def topicArnOpt_=(value: Option[String]): Unit =
    underlying.setTopicArn(value.orNull)

  def withTopicArnOpt(value: Option[String]): DeleteTopicRequest =
    underlying.withTopicArn(value.orNull)

}
