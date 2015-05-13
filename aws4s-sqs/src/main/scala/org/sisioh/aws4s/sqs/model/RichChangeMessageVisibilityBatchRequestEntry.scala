package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchRequestEntry
import org.sisioh.aws4s.PimpedType

object ChangeMessageVisibilityBatchRequestEntryFactory {

  def create(): ChangeMessageVisibilityBatchRequestEntry = new ChangeMessageVisibilityBatchRequestEntry()

  def create(id: String, receiptHandle: String): ChangeMessageVisibilityBatchRequestEntry =
    new ChangeMessageVisibilityBatchRequestEntry(id, receiptHandle)

}

class RichChangeMessageVisibilityBatchRequestEntry(val underlying: ChangeMessageVisibilityBatchRequestEntry)
    extends AnyVal with PimpedType[ChangeMessageVisibilityBatchRequestEntry] {

  def idOpt: Option[String] = Option(underlying.getId)

  def idOpt_=(value: Option[String]): Unit =
    underlying.setId(value.orNull)

  def withIdOpt(value: Option[String]): ChangeMessageVisibilityBatchRequestEntry =
    underlying.withId(value.orNull)

  // ---

  def receiptHandleOpt: Option[String] = Option(underlying.getReceiptHandle)

  def receiptHandleOpt_=(value: Option[String]): Unit =
    underlying.setReceiptHandle(value.orNull)

  def withReceiptHandleOpt(value: Option[String]): ChangeMessageVisibilityBatchRequestEntry =
    underlying.withReceiptHandle(value.orNull)

  // ---

  def visibilityTimeoutOpt: Option[Int] = Option(underlying.getVisibilityTimeout)

  def visibilityTimeoutOpt_=(value: Option[Int]): Unit =
    underlying.setVisibilityTimeout(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  def withVisibilityTimeoutOpt(value: Option[Int]): ChangeMessageVisibilityBatchRequestEntry =
    underlying.withVisibilityTimeout(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

}
