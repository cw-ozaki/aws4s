package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.{ DeleteMessageBatchRequestEntry, DeleteMessageBatchResultEntry }
import org.sisioh.aws4s.PimpedType

class RichDeleteMessageBatchResultEntry(val underlying: DeleteMessageBatchResultEntry)
    extends AnyVal with PimpedType[DeleteMessageBatchResultEntry] {

  def idOpt: Option[String] = Option(underlying.getId)

  def idOpt_=(value: Option[String]): Unit =
    underlying.setId(value.orNull)

  def withIdOpt(value: Option[String]): DeleteMessageBatchResultEntry =
    underlying.withId(value.orNull)

}
