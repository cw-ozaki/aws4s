package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.Topic
import org.sisioh.aws4s.PimpedType

object TopicFactory {
  def create(): Topic =
    new Topic()
}

class RichTopic(val underlying: Topic)
    extends AnyVal with PimpedType[Topic] {

  def topicArnOpt: Option[String] =
    Option(underlying.getTopicArn)

  def topicArnOpt_=(value: Option[String]): Unit =
    underlying.setTopicArn(value.orNull)

  def withTopicArnOpt(value: Option[String]): Topic =
    underlying.withTopicArn(value.orNull)
}
