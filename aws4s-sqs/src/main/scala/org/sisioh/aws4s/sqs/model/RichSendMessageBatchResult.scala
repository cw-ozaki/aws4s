package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.{ BatchResultErrorEntry, SendMessageBatchResultEntry, SendMessageBatchResult }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichSendMessageBatchResult(val underlying: SendMessageBatchResult)
    extends AnyVal with PimpedType[SendMessageBatchResult] {

  def successful: Seq[SendMessageBatchResultEntry] = underlying.getSuccessful.asScala.toVector

  def failed: Seq[BatchResultErrorEntry] = underlying.getFailed.asScala.toVector

}
