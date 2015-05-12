package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.TopicConfiguration
import org.sisioh.aws4s.PimpedType

class RichTopicConfiguration(val underlying: TopicConfiguration)
extends AnyVal with PimpedType[TopicConfiguration] {

  def topicARN = underlying.getTopicARN

}
