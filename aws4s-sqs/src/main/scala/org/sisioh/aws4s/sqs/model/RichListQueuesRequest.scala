package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.ListQueuesRequest
import org.sisioh.aws4s.PimpedType

object ListQueuesRequestFactory {

  def create(): ListQueuesRequest = new ListQueuesRequest()

  def create(queueNamePrefix: String): ListQueuesRequest = new ListQueuesRequest(queueNamePrefix)

}

class RichListQueuesRequest(val underlying: ListQueuesRequest)
    extends AnyVal with PimpedType[ListQueuesRequest] {

  def queueNamePrefixOpt: Option[String] = Option(underlying.getQueueNamePrefix)

  def queueNamePrefixOpt_=(value: Option[String]): Unit =
    underlying.setQueueNamePrefix(value.orNull)

  def withQueueNamePrefixOpt(value: Option[String]): ListQueuesRequest =
    underlying.withQueueNamePrefix(value.orNull)

}
