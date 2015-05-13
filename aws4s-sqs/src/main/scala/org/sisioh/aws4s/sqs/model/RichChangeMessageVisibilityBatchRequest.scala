package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model._
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ChangeMessageVisibilityBatchRequestFactory {

  def create(): ChangeMessageVisibilityBatchRequest = new ChangeMessageVisibilityBatchRequest()

  def create(queueUrl: String, entries: Seq[ChangeMessageVisibilityBatchRequestEntry]): ChangeMessageVisibilityBatchRequest =
    new ChangeMessageVisibilityBatchRequest(queueUrl, entries.asJava)

}

class RichChangeMessageVisibilityBatchRequest(val underlying: ChangeMessageVisibilityBatchRequest)
    extends AnyVal with PimpedType[ChangeMessageVisibilityBatchRequest] {

  def queueUrlOpt: Option[String] = Option(underlying.getQueueUrl)

  def queueUrlOpt_=(value: Option[String]): Unit =
    underlying.setQueueUrl(value.orNull)

  def withQueueUrlOpt(value: Option[String]): ChangeMessageVisibilityBatchRequest =
    underlying.withQueueUrl(value.orNull)

  // ---

  def entries: Seq[ChangeMessageVisibilityBatchRequestEntry] = underlying.getEntries.asScala.toVector

  def entries_=(value: Seq[ChangeMessageVisibilityBatchRequestEntry]): Unit =
    underlying.setEntries(value.asJava)

  def withEntries(value: Seq[ChangeMessageVisibilityBatchRequestEntry]): ChangeMessageVisibilityBatchRequest =
    underlying.withEntries(value.asJava)

}
