package org.sisioh.aws4s.cfn.model

import java.util.Date

import com.amazonaws.services.cloudformation.model.StackEvent
import org.sisioh.aws4s.PimpedType

object StackEventFactory {

  def create(): StackEvent = new StackEvent()

}

class RichStackEvent(val underlying: StackEvent)
  extends AnyVal with PimpedType[StackEvent] {
  def stackIdOpt: Option[String] = Option(underlying.getStackId)

  def stackIdOpt_=(value: Option[String]): Unit =
    underlying.setStackId(value.orNull)

  def withStackIdOpt(value: Option[String]): StackEvent =
    underlying.withStackId(value.orNull)

  // ---

  def eventIdOpt: Option[String] = Option(underlying.getEventId)

  def eventIdOpt_=(value: Option[String]): Unit =
    underlying.setEventId(value.orNull)

  def withEventIdOpt(value: Option[String]): StackEvent =
    underlying.withEventId(value.orNull)

  // ---

  def stackNameOpt: Option[String] = Option(underlying.getStackName)

  def stackNameOpt_=(value: Option[String]): Unit =
    underlying.setStackName(value.orNull)

  def withStackNameOpt(value: Option[String]): StackEvent =
    underlying.withStackName(value.orNull)

  // ---

  def logicalResourceIdOpt = Option(underlying.getLogicalResourceId)

  def logicalResourceIdOpt_=(value: Option[String]): Unit =
    underlying.setLogicalResourceId(value.orNull)

  def withLogicalResourceIdOpt(value: Option[String]): StackEvent =
    underlying.withLogicalResourceId(value.orNull)

  // ---

  def physicalResourceIdOpt: Option[String] = Option(underlying.getPhysicalResourceId)

  def physicalResourceIdOpt_=(value: Option[String]): Unit =
    underlying.setPhysicalResourceId(value.orNull)

  def withPhysicalResourceIdOpt(value: Option[String]): StackEvent =
    underlying.withPhysicalResourceId(value.orNull)

  // ---

  def resourceTypeOpt: Option[String] = Option(underlying.getResourceType)

  def resourceTypeOpt_=(value: Option[String]): Unit =
    underlying.setResourceType(value.orNull)

  def withResourceTypeOpt(value: Option[String]): StackEvent =
    underlying.withResourceType(value.orNull)

  // ---

  def timestampOpt: Option[Date] = Option(underlying.getTimestamp)

  def timestampOpt_=(value: Option[Date]): Unit =
    underlying.setTimestamp(value.orNull)

  def withTimestampOpt(value: Option[Date]): StackEvent =
    underlying.withTimestamp(value.orNull)

  // ---

  def resourceStatusOpt: Option[String] = Option(underlying.getResourceStatus)

  def resourceStatusOpt_=(value: Option[String]): Unit =
    underlying.setResourceStatus(value.orNull)

  def withResourceStatusOpt(value: Option[String]): StackEvent =
    underlying.withResourceStatus(value.orNull)

  // ---

  def resourceStatusReasonOpt: Option[String] = Option(underlying.getResourceStatusReason)

  def resourceStatusReasonOpt_=(value: Option[String]): Unit =
    underlying.setResourceStatusReason(value.orNull)

  def withResourceStatusReasonOpt(value: Option[String]): StackEvent =
    underlying.withResourceStatusReason(value.orNull)

  // ---

  def resourcePropertiesOpt: Option[String] = Option(underlying.getResourceProperties)

  def resourcePropertiesOpt_=(value: Option[String]): Unit =
    underlying.setResourceProperties(value.orNull)

  def withResourcePropertiesOpt(value: Option[String]): StackEvent =
    underlying.withResourceProperties(value.orNull)

}
