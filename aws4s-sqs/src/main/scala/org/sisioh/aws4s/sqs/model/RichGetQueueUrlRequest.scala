package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.GetQueueUrlRequest
import org.sisioh.aws4s.PimpedType

object GetQueueUrlRequestFactory {

  def create(): GetQueueUrlRequest = new GetQueueUrlRequest()

  def create(queueName: String): GetQueueUrlRequest = new GetQueueUrlRequest(queueName)

}

class RichGetQueueUrlRequest(val underlying: GetQueueUrlRequest)
    extends AnyVal with PimpedType[GetQueueUrlRequest] {

  def queueNameOpt: Option[String] = Option(underlying.getQueueName)

  def queueNameOpt_=(value: Option[String]): Unit =
    underlying.setQueueName(value.orNull)

  def withQueueNameOpt(value: Option[String]): GetQueueUrlRequest =
    underlying.withQueueName(value.orNull)

  // ---

  def queueOwnerAWSAccountIdOpt: Option[String] = Option(underlying.getQueueOwnerAWSAccountId)

  def queueOwnerAWSAccountIdOpt_=(value: Option[String]): Unit =
    underlying.setQueueOwnerAWSAccountId(value.orNull)

  def withQueueOwnerAWSAccountIdOpt(value: Option[String]): GetQueueUrlRequest =
    underlying.withQueueOwnerAWSAccountId(value.orNull)

}
