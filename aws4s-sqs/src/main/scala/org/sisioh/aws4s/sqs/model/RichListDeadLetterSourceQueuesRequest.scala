package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesRequest

import org.sisioh.aws4s.PimpedType

object ListDeadLetterSourceQueuesRequestFactory {

  def create(): ListDeadLetterSourceQueuesRequest = new ListDeadLetterSourceQueuesRequest()

  def create(queueUrl: String): ListDeadLetterSourceQueuesRequest = new ListDeadLetterSourceQueuesRequest(queueUrl)

}

class RichListDeadLetterSourceQueuesRequest(val underlying: ListDeadLetterSourceQueuesRequest)
    extends AnyVal with PimpedType[ListDeadLetterSourceQueuesRequest] {

  def queueUrlOpt: Option[String] = Option(underlying.getQueueUrl)

  def queueUrlOpt_=(value: Option[String]): Unit =
    underlying.setQueueUrl(value.orNull)

  def withQueueUrlOpt(value: Option[String]): ListDeadLetterSourceQueuesRequest =
    underlying.withQueueUrl(value.orNull)

}
