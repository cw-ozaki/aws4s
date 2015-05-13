package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.{ GetQueueUrlResult, GetQueueAttributesRequest }
import org.sisioh.aws4s.PimpedType

class RichGetQueueAttributesRequest(val underlying: GetQueueAttributesRequest)
    extends AnyVal with PimpedType[GetQueueAttributesRequest] {

  def queueUrlOpt: Option[String] = Option(underlying.getQueueUrl)

  def queueUrlOpt_=(value: Option[String]): Unit =
    underlying.setQueueUrl(value.orNull)

  def withQueueUrlOpt(value: Option[String]): GetQueueAttributesRequest =
    underlying.withQueueUrl(value.orNull)

}
