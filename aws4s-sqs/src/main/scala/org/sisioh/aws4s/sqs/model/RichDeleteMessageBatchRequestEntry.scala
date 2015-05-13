package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.DeleteMessageBatchRequestEntry
import org.sisioh.aws4s.PimpedType

class RichDeleteMessageBatchRequestEntry(val underlying: DeleteMessageBatchRequestEntry)
    extends AnyVal with PimpedType[DeleteMessageBatchRequestEntry] {

  def idOpt: Option[String] = Option(underlying.getId)

  def idOpt_=(value: Option[String]): Unit =
    underlying.setId(value.orNull)

  def withIdOpt(value: Option[String]): DeleteMessageBatchRequestEntry =
    underlying.withId(value.orNull)

}
