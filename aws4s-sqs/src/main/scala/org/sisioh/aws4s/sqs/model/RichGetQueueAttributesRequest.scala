package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.GetQueueAttributesRequest
import org.sisioh.aws4s.PimpedType

object GetQueueAttributesRequestFactory {

  def create(): GetQueueAttributesRequest = new GetQueueAttributesRequest()

  def create(queueUrl: String): GetQueueAttributesRequest = new GetQueueAttributesRequest(queueUrl)

}

class RichGetQueueAttributesRequest(val underlying: GetQueueAttributesRequest)
    extends AnyVal with PimpedType[GetQueueAttributesRequest] {

  def queueUrlOpt: Option[String] = Option(underlying.getQueueUrl)

  def queueUrlOpt_=(value: Option[String]): Unit =
    underlying.setQueueUrl(value.orNull)

  def withQueueUrlOpt(value: Option[String]): GetQueueAttributesRequest =
    underlying.withQueueUrl(value.orNull)

}
