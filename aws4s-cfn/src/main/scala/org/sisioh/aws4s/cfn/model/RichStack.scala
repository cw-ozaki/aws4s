package org.sisioh.aws4s.cfn.model

import java.util.Date

import com.amazonaws.services.cloudformation.model._
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichStack(val underlying: Stack)
  extends AnyVal with PimpedType[Stack] {

  def stackIdOpt: Option[String] = Option(underlying.getStackId)

  def stackIdOpt_=(value: Option[String]): Unit =
    underlying.setStackId(value.orNull)

  def withStackIdOpt(value: Option[String]): Stack =
    underlying.withStackId(value.orNull)

  def stackNameOpt: Option[String] = Option(underlying.getStackName)

  def stackNameOpt_=(value: Option[String]): Unit =
    underlying.setStackName(value.orNull)

  def withStackNameOpt(value: Option[String]): Stack =
    underlying.withStackName(value.orNull)

  // ---

  def descriptionOpt: Option[String] = Option(underlying.getDescription)

  def descriptionOpt_=(value: Option[String]): Unit =
    underlying.setDescription(value.orNull)

  def withDescriptionOpt(value: Option[String]): Stack =
    underlying.withDescription(value.orNull)

  // ---

  def parameters: Seq[Parameter] = underlying.getParameters.asScala

  def parameters_=(value: Seq[Parameter]): Unit =
    underlying.setParameters(value.asJava)

  def withParameters(value: Seq[Parameter]): Stack =
    underlying.withParameters(value.asJava)

  // ---

  def creationTimeOpt: Option[Date] = Option(underlying.getCreationTime)

  def creationTimeOpt_=(value: Option[Date]): Unit =
    underlying.setCreationTime(value.orNull)

  def withCreationTimeOpt(value: Option[Date]): Stack =
    underlying.withCreationTime(value.orNull)

  // ---

  def lastUpdatedTimeOpt: Option[Date] = Option(underlying.getLastUpdatedTime)

  def lastUpdatedTimeOpt_=(value: Option[Date]): Unit =
    underlying.setLastUpdatedTime(value.orNull)

  def withLastUpdatedTimeOpt(value: Option[Date]): Stack =
    underlying.withLastUpdatedTime(value.orNull)

  // ---

  def stackStatusOpt: Option[String] = Option(underlying.getStackStatus)

  def stackStatusOpt_=(value: Option[String]): Unit =
    underlying.setStackStatus(value.orNull)

  def withStackStatusOpt(value: Option[String]): Stack =
    underlying.withStackStatus(value.orNull)

  // ---

  def stackStatusReasonOpt: Option[String] = Option(underlying.getStackStatusReason)

  def stackStatusReasonOpt_=(value: Option[String]): Unit =
    underlying.setStackStatusReason(value.orNull)

  def withStackStatusReasonOpt(value: Option[String]): Stack =
    underlying.withStackStatusReason(value.orNull)

  // ---

  def disableRollbackOpt: Option[Boolean] = Option(underlying.getDisableRollback)

  def disableRollbackOpt(value: Option[Boolean]): Unit =
    underlying.setDisableRollback(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  def withDisableRollbackOpt(value: Option[Boolean]): Stack =
    underlying.withDisableRollback(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  // ---

  def notificationARNs: Seq[String] = underlying.getNotificationARNs.asScala

  def notificationARNs_=(value: Seq[String]): Unit =
    underlying.setNotificationARNs(value.asJava)

  def withNotificationARNs(value: Seq[String]): Stack =
    underlying.withNotificationARNs(value.asJava)

  // ---

  def timeoutInMinutesOpt: Option[Int] = Option(underlying.getTimeoutInMinutes)

  def timeoutInMinutesOpt_=(value: Option[Int]): Unit =
    underlying.setTimeoutInMinutes(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  def timeoutInMinutesOpt(value: Option[Int]): Stack =
    underlying.withTimeoutInMinutes(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  // ---

  def capabilities: Seq[String] = underlying.getCapabilities.asScala

  def capabilities_=(value: Seq[String]): Unit =
    underlying.setCapabilities(value.asJava)

  def withCapabilities(value: Seq[String]): Stack =
    underlying.withCapabilities(value.asJava)

  // ---

  def outputs: Seq[Output] = underlying.getOutputs.asScala

  def outputs_=(value: Seq[Output]): Unit =
    underlying.setOutputs(value.asJava)

  def withOutputs(value: Seq[Output]): Stack =
    underlying.withOutputs(value.asJava)

  // ---

  def tags: Seq[Tag] = underlying.getTags.asScala

  def tags_=(value: Seq[Tag]): Unit =
    underlying.setTags(tags.asJava)

  def withTags(value: Seq[Tag]): Stack =
    underlying.withTags(value.asJava)

}
