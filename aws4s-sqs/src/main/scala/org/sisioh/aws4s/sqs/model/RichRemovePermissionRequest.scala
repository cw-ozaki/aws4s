package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.RemovePermissionRequest
import org.sisioh.aws4s.PimpedType

object RemovePermissionRequestFactory {

  def create(): RemovePermissionRequest = new RemovePermissionRequest()

}

class RichRemovePermissionRequest(val underlying: RemovePermissionRequest)
    extends AnyVal with PimpedType[RemovePermissionRequest] {

  def queueUrlOpt: Option[String] = Option(underlying.getQueueUrl)

  def queueUrlOpt_=(value: Option[String]): Unit =
    underlying.setQueueUrl(value.orNull)

  def withQueueUrlOpt(value: Option[String]): RemovePermissionRequest =
    underlying.withQueueUrl(value.orNull)

  // ---

  def labelOpt: Option[String] = Option(underlying.getLabel)

  def labelOpt(value: Option[String]): Unit =
    underlying.setLabel(value.orNull)

  def withLabelOpt_=(value: Option[String]): RemovePermissionRequest =
    underlying.withLabel(value.orNull)

}
