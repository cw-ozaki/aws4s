package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.RemovePermissionRequest
import org.sisioh.aws4s.PimpedType

object RemovePermissionRequestFactory {

  def create(): RemovePermissionRequest =
    new RemovePermissionRequest()

  def create(topicArn: String, label: String): RemovePermissionRequest =
    new RemovePermissionRequest(topicArn, label)

}

class RichRemovePermissionRequest(val underlying: RemovePermissionRequest)
    extends AnyVal with PimpedType[RemovePermissionRequest] {

  def topicArnOpt: Option[String] =
    Option(underlying.getTopicArn)

  def topicArnOpt_=(value: Option[String]): Unit =
    underlying.setTopicArn(value.orNull)

  def withTopicArnOpt(value: Option[String]): RemovePermissionRequest =
    underlying.withTopicArn(value.orNull)

  def labelOpt: Option[String] =
    Option(underlying.getLabel)

  def labelOpt_=(value: Option[String]): Unit =
    underlying.setLabel(value.orNull)

  def withLabelOpt(value: Option[String]): RemovePermissionRequest =
    underlying.withLabel(value.orNull)

}
