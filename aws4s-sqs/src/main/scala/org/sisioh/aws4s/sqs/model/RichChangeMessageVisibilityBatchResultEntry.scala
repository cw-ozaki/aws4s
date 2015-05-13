package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchResultEntry
import org.sisioh.aws4s.PimpedType

object ChangeMessageVisibilityBatchResultEntryFactory {

  def create(): ChangeMessageVisibilityBatchResultEntry = new ChangeMessageVisibilityBatchResultEntry()

}

class RichChangeMessageVisibilityBatchResultEntry(val underlying: ChangeMessageVisibilityBatchResultEntry)
    extends AnyVal with PimpedType[ChangeMessageVisibilityBatchResultEntry] {

  def idOpt: Option[String] = Option(underlying.getId)

  def idOpt_=(value: Option[String]): Unit =
    underlying.setId(value.orNull)

  def withIdOpt(value: Option[String]): ChangeMessageVisibilityBatchResultEntry =
    underlying.withId(value.orNull)

}
