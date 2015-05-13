package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.CreateQueueRequest
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichCreateQueueRequest(val underlying: CreateQueueRequest)
    extends AnyVal with PimpedType[CreateQueueRequest] {

  def queueNameOpt: Option[String] = Option(underlying.getQueueName)

  def queueNameOpt_=(value: Option[String]): Unit =
    underlying.setQueueName(value.orNull)

  def withQueueNameOpt(value: Option[String]): CreateQueueRequest =
    underlying.withQueueName(value.orNull)

  // ---

  def attributes: Map[String, String] = underlying.getAttributes.asScala.toMap

  def attributes_=(value: Map[String, String]): Unit =
    underlying.setAttributes(value.asJava)

  def withAttributes(value: Map[String, String]): CreateQueueRequest =
    underlying.withAttributes(value.asJava)
}
