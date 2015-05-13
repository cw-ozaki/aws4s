package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.{ BatchResultErrorEntry, DeleteMessageBatchResult, DeleteMessageBatchResultEntry }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichDeleteMessageBatchResult(val underlying: DeleteMessageBatchResult)
    extends AnyVal with PimpedType[DeleteMessageBatchResult] {

  def successful: Seq[DeleteMessageBatchResultEntry] = underlying.getSuccessful.asScala.toVector

  def failed: Seq[BatchResultErrorEntry] = underlying.getFailed.asScala.toVector

}
