package org.sisioh.aws4s.s3.model

import java.util

import com.amazonaws.services.s3.model.{ S3Event, TopicConfiguration }
import org.sisioh.aws4s.PimpedType

object TopicConfigurationFactory {

  def createWithS3Events(topicARN: String, events: Seq[S3Event]): TopicConfiguration =
    new TopicConfiguration(topicARN, util.EnumSet.of(events.head, events.tail.toArray: _*))

  def createWithStrings(topicARN: String, events: String*): TopicConfiguration =
    new TopicConfiguration(topicARN, events: _*)

}

class RichTopicConfiguration(val underlying: TopicConfiguration)
    extends AnyVal with PimpedType[TopicConfiguration] {

  def topicARN = underlying.getTopicARN

}
