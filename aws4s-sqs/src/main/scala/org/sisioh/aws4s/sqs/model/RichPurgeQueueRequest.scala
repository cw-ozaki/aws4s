package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.PurgeQueueRequest
import org.sisioh.aws4s.PimpedType

class RichPurgeQueueRequest(val underlying: PurgeQueueRequest)
    extends AnyVal with PimpedType[PurgeQueueRequest] {

  def queueUrlOpt: Option[String] = Option(underlying.getQueueUrl)

  def queueUrlOpt_=(value: Option[String]): Unit =
    underlying.setQueueUrl(value.orNull)

  def withQueueUrlOpt(value: Option[String]): PurgeQueueRequest =
    underlying.withQueueUrl(value.orNull)

}
