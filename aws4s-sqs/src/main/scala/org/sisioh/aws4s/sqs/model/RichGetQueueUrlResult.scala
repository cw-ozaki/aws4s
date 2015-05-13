package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.{ ListDeadLetterSourceQueuesRequest, GetQueueUrlResult }
import org.sisioh.aws4s.PimpedType

object GetQueueUrlResultFactory {

  def create(): GetQueueUrlResult = new GetQueueUrlResult()

}

class RichGetQueueUrlResult(val underlying: GetQueueUrlResult)
    extends AnyVal with PimpedType[GetQueueUrlResult] {

  def queueUrlOpt: Option[String] = Option(underlying.getQueueUrl)

  def queueUrlOpt_=(value: Option[String]): Unit =
    underlying.setQueueUrl(value.orNull)

  def withQueueUrlOpt(value: Option[String]): GetQueueUrlResult =
    underlying.withQueueUrl(value.orNull)

}
