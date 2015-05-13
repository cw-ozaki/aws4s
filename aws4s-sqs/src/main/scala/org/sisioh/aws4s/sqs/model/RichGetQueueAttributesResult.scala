package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.GetQueueAttributesResult
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichGetQueueAttributesResult(val underlying: GetQueueAttributesResult)
    extends AnyVal with PimpedType[GetQueueAttributesResult] {

  def attributes: Map[String, String] = underlying.getAttributes.asScala.toMap

  def attributes_=(value: Map[String, String]): Unit =
    underlying.setAttributes(value.asJava)

  def withAttributes(value: Map[String, String]): GetQueueAttributesResult =
    underlying.withAttributes(value.asJava)
}
