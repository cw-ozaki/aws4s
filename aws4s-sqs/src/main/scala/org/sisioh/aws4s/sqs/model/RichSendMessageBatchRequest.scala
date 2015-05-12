package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.{SendMessageBatchRequest, SendMessageBatchRequestEntry}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichSendMessageBatchRequest(val underlying: SendMessageBatchRequest)
  extends AnyVal with PimpedType[SendMessageBatchRequest] {

  def queueUrlOpt: Option[String] = Option(underlying.getQueueUrl)

  def queueUrlOpt_=(value: Option[String]): Unit =
    underlying.setQueueUrl(value.orNull)

  def withQueueUrlOpt(value: Option[String]): SendMessageBatchRequest =
    underlying.withQueueUrl(value.orNull)

  // ---

  def entries: Seq[SendMessageBatchRequestEntry] = underlying.getEntries.asScala.toVector

  def entries_=(value: Seq[SendMessageBatchRequestEntry]): Unit =
    underlying.setEntries(value.asJava)

  def withEntries(value: Seq[SendMessageBatchRequestEntry]): SendMessageBatchRequest =
    underlying.withEntries(value.asJava)

}
