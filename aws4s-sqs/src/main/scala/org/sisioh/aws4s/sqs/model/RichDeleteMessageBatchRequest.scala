package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model._
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object DeleteMessageBatchRequestFactory {

  def create(): DeleteMessageBatchRequest = new DeleteMessageBatchRequest()

  def create(queueUrl: String): DeleteMessageBatchRequest = new DeleteMessageBatchRequest(queueUrl)

}

class RichDeleteMessageBatchRequest(val underlying: DeleteMessageBatchRequest)
    extends AnyVal with PimpedType[DeleteMessageBatchRequest] {
  def queueUrlOpt: Option[String] = Option(underlying.getQueueUrl)

  def queueUrlOpt_=(value: Option[String]): Unit =
    underlying.setQueueUrl(value.orNull)

  def withQueueUrlOpt(value: Option[String]): DeleteMessageBatchRequest =
    underlying.withQueueUrl(value.orNull)

  // ---

  def entries: Seq[DeleteMessageBatchRequestEntry] = underlying.getEntries.asScala.toVector

  def entries_=(value: Seq[DeleteMessageBatchRequestEntry]): Unit =
    underlying.setEntries(value.asJava)

  def withEntries(value: Seq[DeleteMessageBatchRequestEntry]): DeleteMessageBatchRequest =
    underlying.withEntries(value.asJava)
}
