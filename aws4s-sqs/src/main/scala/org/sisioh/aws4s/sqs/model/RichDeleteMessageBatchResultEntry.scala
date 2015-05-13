package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.DeleteMessageBatchResultEntry
import org.sisioh.aws4s.PimpedType

object DeleteMessageBatchResultEntryFactory {

  def create(): DeleteMessageBatchResultEntry = new DeleteMessageBatchResultEntry()

}

class RichDeleteMessageBatchResultEntry(val underlying: DeleteMessageBatchResultEntry)
    extends AnyVal with PimpedType[DeleteMessageBatchResultEntry] {

  def idOpt: Option[String] = Option(underlying.getId)

  def idOpt_=(value: Option[String]): Unit =
    underlying.setId(value.orNull)

  def withIdOpt(value: Option[String]): DeleteMessageBatchResultEntry =
    underlying.withId(value.orNull)

}
