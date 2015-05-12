package org.sisioh.aws4s.s3.model

import java.util

import com.amazonaws.services.s3.model.{S3Event, QueueConfiguration}
import org.sisioh.aws4s.PimpedType

object QueueConfigurationFactory {

  def createWithS3Events(queueARN: String, events: Seq[S3Event]): QueueConfiguration =
    new QueueConfiguration(queueARN, util.EnumSet.of(events.head, events.tail.toArray: _*))

  def createWithStrings(queueARN: String, events: String*): QueueConfiguration =
    new QueueConfiguration(queueARN, events: _*)

}

class RichQueueConfiguration(val underlying: QueueConfiguration)
  extends AnyVal with PimpedType[QueueConfiguration] {

  def queueARN: String = underlying.getQueueARN

}
