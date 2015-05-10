package org.sisioh.aws4s.cfn.model

import java.util.Date

import com.amazonaws.services.cloudformation.model._
import org.sisioh.aws4s.PimpedType

class RichStackResourceSummary(val underlying: StackResourceSummary)
  extends AnyVal with PimpedType[StackResourceSummary] {

  def logicalResourceIdOpt = Option(underlying.getLogicalResourceId)

  def logicalResourceIdOpt_=(value: Option[String]): Unit =
    underlying.setLogicalResourceId(value.orNull)

  def withLogicalResourceIdOpt(value: Option[String]): StackResourceSummary =
    underlying.withLogicalResourceId(value.orNull)

  // ---

  def physicalResourceIdOpt: Option[String] = Option(underlying.getPhysicalResourceId)

  def physicalResourceIdOpt_=(value: Option[String]): Unit =
    underlying.setPhysicalResourceId(value.orNull)

  def withPhysicalResourceIdOpt(value: Option[String]): StackResourceSummary =
    underlying.withPhysicalResourceId(value.orNull)

  // ---

  def resourceTypeOpt: Option[String] = Option(underlying.getResourceType)

  def resourceTypeOpt_=(value: Option[String]): Unit =
    underlying.setResourceType(value.orNull)

  def withResourceTypeOpt(value: Option[String]): StackResourceSummary =
    underlying.withResourceType(value.orNull)

  // ---

  def lastUpdatedTimestampOpt: Option[Date] = Option(underlying.getLastUpdatedTimestamp)

  def lastUpdatedTimestampOpt(value: Option[Date]): Unit =
    underlying.setLastUpdatedTimestamp(value.orNull)

  def withLastUpdatedTimestampOpt(value: Option[Date]): StackResourceSummary =
    underlying.withLastUpdatedTimestamp(value.orNull)

  // ---

  def resourceStatusOpt: Option[String] = Option(underlying.getResourceStatus)

  def resourceStatusOpt_=(value: Option[String]): Unit =
    underlying.setResourceStatus(value.orNull)

  def withResourceStatusOpt(value: Option[String]): StackResourceSummary =
    underlying.withResourceStatus(value.orNull)

  // ---

  def resourceStatusReasonOpt: Option[String] = Option(underlying.getResourceStatusReason)

  def resourceStatusReasonOpt_=(value: Option[String]): Unit =
    underlying.setResourceStatusReason(value.orNull)

  def withResourceStatusReasonOpt(value: Option[String]): StackResourceSummary =
    underlying.withResourceStatusReason(value.orNull)

}
