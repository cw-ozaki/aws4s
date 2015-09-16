package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.AddPermissionRequest
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object AddPermissionRequestFactory {

  def create(): AddPermissionRequest = new AddPermissionRequest()

  def create(topicArn: String,
             label: String,
             awsAccountIds: Seq[String],
             actions: Seq[String]): AddPermissionRequest =
    new AddPermissionRequest(
      topicArn,
      label,
      awsAccountIds.asJava,
      actions.asJava)
}

class RichAddPermissionRequest(val underlying: AddPermissionRequest)
    extends AnyVal with PimpedType[AddPermissionRequest] {

  def topicArnOpt: Option[String] =
    Option(underlying.getTopicArn)

  def topicArnOpt_=(value: Option[String]): Unit =
    underlying.setTopicArn(value.orNull)

  def withTopicArnOpt(value: Option[String]): AddPermissionRequest =
    underlying.withTopicArn(value.orNull)

  def labelOpt: Option[String] =
    Option(underlying.getLabel)

  def labelOpt_=(value: Option[String]) =
    underlying.setLabel(value.orNull)

  def withLabelOpt(label: Option[String]): AddPermissionRequest =
    underlying.withLabel(label.orNull)

  def awsAccountIds: Seq[String] =
    underlying.getAWSAccountIds.asScala.toVector

  def awsAccountIds_=(value: Seq[String]): Unit =
    underlying.setAWSAccountIds(value.asJava)

  def withAWSAccountIds(value: Seq[String]): AddPermissionRequest =
    underlying.withAWSAccountIds(value.asJava)

  def actionNames: Seq[String] =
    underlying.getActionNames.asScala.toVector

  def actionNames_=(value: Seq[String]): Unit =
    underlying.setActionNames(value.asJava)

  def withActionNames(value: Seq[String]): AddPermissionRequest =
    underlying.withActionNames(value.asJava)

}
