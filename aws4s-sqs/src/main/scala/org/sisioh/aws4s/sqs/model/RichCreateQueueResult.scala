package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.{ DeleteMessageBatchRequest, CreateQueueResult }
import org.sisioh.aws4s.PimpedType

class RichCreateQueueResult(val underlying: CreateQueueResult)
    extends AnyVal with PimpedType[CreateQueueResult] {
  def queueUrlOpt: Option[String] = Option(underlying.getQueueUrl)

  def queueUrlOpt_=(value: Option[String]): Unit =
    underlying.setQueueUrl(value.orNull)

  def withQueueUrlOpt(value: Option[String]): CreateQueueResult =
    underlying.withQueueUrl(value.orNull)
}
