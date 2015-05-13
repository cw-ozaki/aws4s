package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.ListQueuesResult
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ListQueuesResultFactory {

  def create(): ListQueuesResult = new ListQueuesResult()

}

class RichListQueuesResult(val underlying: ListQueuesResult)
    extends AnyVal with PimpedType[ListQueuesResult] {

  def queueUrls: Seq[String] = underlying.getQueueUrls.asScala.toVector

  def queueUrl_=(value: Seq[String]): Unit =
    underlying.setQueueUrls(value.asJava)

  def withQueueUrl(value: Seq[String]): ListQueuesResult =
    underlying.withQueueUrls(value.asJava)

}
