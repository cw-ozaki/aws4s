package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model._
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichSetQueueAttributesRequest(val underlying: SetQueueAttributesRequest)
    extends AnyVal with PimpedType[SetQueueAttributesRequest] {

  def queueUrlOpt: Option[String] = Option(underlying.getQueueUrl)

  def queueUrlOpt_=(value: Option[String]): Unit =
    underlying.setQueueUrl(value.orNull)

  def withQueueUrlOpt(value: Option[String]): SetQueueAttributesRequest =
    underlying.withQueueUrl(value.orNull)

  // ---

  def attributes: Map[String, String] = underlying.getAttributes.asScala.toMap

  def attributes_=(value: Map[String, String]): Unit =
    underlying.setAttributes(value.asJava)

  def withAttributes(value: Map[String, String]): SetQueueAttributesRequest =
    underlying.withAttributes(value.asJava)

}
