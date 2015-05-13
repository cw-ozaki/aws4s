package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.{ DeleteMessageRequest, DeleteQueueRequest }
import org.sisioh.aws4s.PimpedType

class RichDeleteQueueRequest(val underlying: DeleteQueueRequest)
    extends AnyVal with PimpedType[DeleteQueueRequest] {

  def queueUrlOpt: Option[String] = Option(underlying.getQueueUrl)

  def queueUrlOpt_=(value: Option[String]): Unit =
    underlying.setQueueUrl(value.orNull)

  def withQueueUrlOpt(value: Option[String]): DeleteQueueRequest =
    underlying.withQueueUrl(value.orNull)

}
