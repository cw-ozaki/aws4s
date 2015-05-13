package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.{ ListDeadLetterSourceQueuesResult, ListQueuesResult }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichListDeadLetterSourceQueuesResult(val underlying: ListDeadLetterSourceQueuesResult)
    extends AnyVal with PimpedType[ListDeadLetterSourceQueuesResult] {

  def queueUrls: Seq[String] = underlying.getQueueUrls.asScala.toVector

  def queueUrl_=(value: Seq[String]): Unit =
    underlying.setQueueUrls(value.asJava)

  def withQueueUrl(value: Seq[String]): ListDeadLetterSourceQueuesResult =
    underlying.withQueueUrls(value.asJava)

}
