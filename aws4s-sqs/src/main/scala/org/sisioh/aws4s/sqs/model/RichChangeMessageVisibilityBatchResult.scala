package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.{ BatchResultErrorEntry, ChangeMessageVisibilityBatchResult, ChangeMessageVisibilityBatchResultEntry }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichChangeMessageVisibilityBatchResult(val underlying: ChangeMessageVisibilityBatchResult)
    extends AnyVal with PimpedType[ChangeMessageVisibilityBatchResult] {

  def successful: Seq[ChangeMessageVisibilityBatchResultEntry] = underlying.getSuccessful.asScala.toVector

  def failed: Seq[BatchResultErrorEntry] = underlying.getFailed.asScala.toVector

}
