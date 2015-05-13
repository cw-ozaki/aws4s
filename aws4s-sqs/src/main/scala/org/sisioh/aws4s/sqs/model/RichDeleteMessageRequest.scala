package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.DeleteMessageRequest
import org.sisioh.aws4s.PimpedType

object DeleteMessageRequestFactory {

  def create(): DeleteMessageRequest = new DeleteMessageRequest()

  def create(queueUrl: String, receiptHandle: String): DeleteMessageRequest =
    new DeleteMessageRequest(queueUrl, receiptHandle)

}

class RichDeleteMessageRequest(val underlying: DeleteMessageRequest)
    extends AnyVal with PimpedType[DeleteMessageRequest] {

  def queueUrlOpt: Option[String] = Option(underlying.getQueueUrl)

  def queueUrlOpt_=(value: Option[String]): Unit =
    underlying.setQueueUrl(value.orNull)

  def withQueueUrlOpt(value: Option[String]): DeleteMessageRequest =
    underlying.withQueueUrl(value.orNull)

  // ---

  def receiptHandleOpt: Option[String] = Option(underlying.getReceiptHandle)

  def receiptHandleOpt_=(value: Option[String]): Unit =
    underlying.setReceiptHandle(value.orNull)

  def withReceiptHandleOpt(value: Option[String]): DeleteMessageRequest =
    underlying.withReceiptHandle(value.orNull)

}
