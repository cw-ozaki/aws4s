package org.sisioh.aws4s.cfn.model

import java.util.Date

import com.amazonaws.services.cloudformation.model.StackSummary
import org.sisioh.aws4s.PimpedType

object StackSummaryFactory {

  def create(): StackSummary = new StackSummary()

}

class RichStackSummary(val underlying: StackSummary)
    extends AnyVal with PimpedType[StackSummary] {

  def stackIdOpt: Option[String] = Option(underlying.getStackId)

  def stackIdOpt_=(value: Option[String]): Unit =
    underlying.setStackId(value.orNull)

  def withStackIdOpt(value: Option[String]): StackSummary =
    underlying.withStackId(value.orNull)

  // ---

  def stackNameOpt: Option[String] = Option(underlying.getStackName)

  def stackNameOpt_=(value: Option[String]): Unit =
    underlying.setStackName(value.orNull)

  def withStackNameOpt(value: Option[String]): StackSummary =
    underlying.withStackName(value.orNull)

  // ---

  def templateDescriptionOpt: Option[String] = Option(underlying.getTemplateDescription)

  // ---

  def creationTimeOpt: Option[Date] = Option(underlying.getCreationTime)

  def creationTimeOpt_=(value: Option[Date]): Unit =
    underlying.setCreationTime(value.orNull)

  def withCreationTimeOpt(value: Option[Date]): StackSummary =
    underlying.withCreationTime(value.orNull)

  // ---

  def lastUpdatedTimeOpt: Option[Date] = Option(underlying.getLastUpdatedTime)

  def lastUpdatedTimeOpt_=(value: Option[Date]): Unit =
    underlying.setLastUpdatedTime(value.orNull)

  def withLastUpdatedTimeOpt(value: Option[Date]): StackSummary =
    underlying.withLastUpdatedTime(value.orNull)

  // ---

  def deletionTimeOpt: Option[Date] = Option(underlying.getDeletionTime)

  def deletionTimeOpt_=(value: Option[Date]): Unit =
    underlying.setDeletionTime(value.orNull)

  def withDeletionTimeOpt(value: Option[Date]): StackSummary =
    underlying.withDeletionTime(value.orNull)

  // ---

  def stackStatusOpt: Option[String] = Option(underlying.getStackStatus)

  def stackStatusOpt_=(value: Option[String]): Unit =
    underlying.setStackStatus(value.orNull)

  def withStackStatusOpt(value: Option[String]): StackSummary =
    underlying.withStackStatus(value.orNull)

  // ---

  def stackStatusReasonOpt: Option[String] = Option(underlying.getStackStatusReason)

  def stackStatusReasonOpt_=(value: Option[String]): Unit =
    underlying.setStackStatusReason(value.orNull)

  def withStackStatusReasonOpt(value: Option[String]): StackSummary =
    underlying.withStackStatusReason(value.orNull)

}
