package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.BatchResultErrorEntry
import org.sisioh.aws4s.PimpedType

object BatchResultErrorEntryFactory {

  def create(): BatchResultErrorEntry = new BatchResultErrorEntry()

}

class RichBatchResultErrorEntry(val underlying: BatchResultErrorEntry)
    extends AnyVal with PimpedType[BatchResultErrorEntry] {

  def idOpt: Option[String] = Option(underlying.getId)

  def idOpt_=(value: Option[String]): Unit =
    underlying.setId(value.orNull)

  def withIdOpt(value: Option[String]): BatchResultErrorEntry =
    underlying.withId(value.orNull)

  // --

  def senderFaultOpt: Option[Boolean] = Option(underlying.getSenderFault)

  def senderFaultOpt_=(value: Option[Boolean]): Unit =
    underlying.setSenderFault(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  def withSenderFaultOpt(value: Option[Boolean]): BatchResultErrorEntry =
    underlying.withSenderFault(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  // ---

  def codeOpt: Option[String] = Option(underlying.getCode)

  def codeOpt_=(value: Option[String]): Unit =
    underlying.setCode(value.orNull)

  def withCodeOpt(value: Option[String]): BatchResultErrorEntry =
    underlying.withCode(value.orNull)

  // ---

  def messageOpt: Option[String] = Option(underlying.getMessage)

  def messageOpt_=(value: Option[String]): Unit =
    underlying.withMessage(value.orNull)

  def withMessageOpt(value: Option[String]): BatchResultErrorEntry =
    underlying.withMessage(value.orNull)
}
