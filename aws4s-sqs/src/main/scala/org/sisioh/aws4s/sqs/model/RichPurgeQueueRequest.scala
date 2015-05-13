package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.PurgeQueueRequest
import org.sisioh.aws4s.PimpedType

object PurgeQueueRequestFactory {

  def create(): PurgeQueueRequest = new PurgeQueueRequest()

  def create(queueUrl: String): PurgeQueueRequest = new PurgeQueueRequest(queueUrl)

}

class RichPurgeQueueRequest(val underlying: PurgeQueueRequest)
    extends AnyVal with PimpedType[PurgeQueueRequest] {

  def queueUrlOpt: Option[String] = Option(underlying.getQueueUrl)

  def queueUrlOpt_=(value: Option[String]): Unit =
    underlying.setQueueUrl(value.orNull)

  def withQueueUrlOpt(value: Option[String]): PurgeQueueRequest =
    underlying.withQueueUrl(value.orNull)

}
