package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.AddPermissionRequest
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichAddPermissionRequest(val underlying: AddPermissionRequest)
  extends AnyVal with PimpedType[AddPermissionRequest] {

  def queueUrlOpt: Option[String] = Option(underlying.getQueueUrl)

  def queueUrlOpt_=(value: Option[String]): Unit =
    underlying.setQueueUrl(value.orNull)

  def withQueueUrlOpt(value: Option[String]): AddPermissionRequest =
    underlying.withQueueUrl(value.orNull)

  // ---

  def labelOpt: Option[String] = Option(underlying.getLabel)

  def labelOpt(value: Option[String]): Unit =
    underlying.setLabel(value.orNull)

  def withLabelOpt_=(value: Option[String]): AddPermissionRequest =
    underlying.withLabel(value.orNull)

  // ---

  def awsAccountIds: Seq[String] = underlying.getAWSAccountIds.asScala.toVector

  def awsAccountIds_=(value: Seq[String]): Unit =
    underlying.setAWSAccountIds(value.asJava)

  def withAwsAccountIds(value: Seq[String]): AddPermissionRequest =
    underlying.withAWSAccountIds(value.asJava)

  // ---

  def actions: Seq[String] = underlying.getActions.asScala.toVector

  def actions_=(value: Seq[String]): Unit =
    underlying.setActions(value.asJava)

  def withActions(value: Seq[String]): AddPermissionRequest =
    underlying.withActions(value.asJava)
}
