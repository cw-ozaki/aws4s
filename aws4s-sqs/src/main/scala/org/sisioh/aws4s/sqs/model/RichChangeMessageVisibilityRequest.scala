package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.{ CreateQueueResult, ChangeMessageVisibilityRequest }
import org.sisioh.aws4s.PimpedType

class RichChangeMessageVisibilityRequest(val underlying: ChangeMessageVisibilityRequest)
    extends AnyVal with PimpedType[ChangeMessageVisibilityRequest] {
  def queueUrlOpt: Option[String] = Option(underlying.getQueueUrl)

  def queueUrlOpt_=(value: Option[String]): Unit =
    underlying.setQueueUrl(value.orNull)

  def withQueueUrlOpt(value: Option[String]): ChangeMessageVisibilityRequest =
    underlying.withQueueUrl(value.orNull)
}
