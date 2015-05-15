package org.sisioh.aws4s.cfn.model

import java.util.Date

import com.amazonaws.services.cloudformation.model.StackResource
import org.sisioh.aws4s.PimpedType

object StackResourceFactory {

  def create(): StackResource = new StackResource()

}

class RichStackResource(val underlying: StackResource)
    extends AnyVal with PimpedType[StackResource] {

  def stackNameOpt: Option[String] = Option(underlying.getStackName)

  def stackNameOpt_=(value: Option[String]): Unit =
    underlying.setStackName(value.orNull)

  def withStackNameOpt(value: Option[String]): StackResource =
    underlying.withStackName(value.orNull)

  // ---

  def stackIdOpt: Option[String] = Option(underlying.getStackId)

  def stackIdOpt_=(value: Option[String]): Unit =
    underlying.setStackId(value.orNull)

  def withStackIdOpt(value: Option[String]): StackResource =
    underlying.withStackId(value.orNull)

  // ---

  def logicalResourceIdOpt = Option(underlying.getLogicalResourceId)

  def logicalResourceIdOpt_=(value: Option[String]): Unit =
    underlying.setLogicalResourceId(value.orNull)

  def withLogicalResourceIdOpt(value: Option[String]): StackResource =
    underlying.withLogicalResourceId(value.orNull)

  // ---

  def physicalResourceIdOpt: Option[String] = Option(underlying.getPhysicalResourceId)

  def physicalResourceIdOpt_=(value: Option[String]): Unit =
    underlying.setPhysicalResourceId(value.orNull)

  def withPhysicalResourceIdOpt(value: Option[String]): StackResource =
    underlying.withPhysicalResourceId(value.orNull)

  // ---

  def resourceTypeOpt: Option[String] = Option(underlying.getResourceType)

  def resourceTypeOpt_=(value: Option[String]): Unit =
    underlying.setResourceType(value.orNull)

  def withResourceTypeOpt(value: Option[String]): StackResource =
    underlying.withResourceType(value.orNull)

  // ---

  def timestampOpt: Option[Date] = Option(underlying.getTimestamp)

  def timestampOpt_=(value: Option[Date]): Unit =
    underlying.setTimestamp(value.orNull)

  def withTimestampOpt(value: Option[Date]): StackResource =
    underlying.withTimestamp(value.orNull)

  // ---

  def resourceStatusOpt: Option[String] = Option(underlying.getResourceStatus)

  def resourceStatusOpt_=(value: Option[String]): Unit =
    underlying.setResourceStatus(value.orNull)

  def withResourceStatusOpt(value: Option[String]): StackResource =
    underlying.withResourceStatus(value.orNull)

  // ---

  def resourceStatusReasonOpt: Option[String] = Option(underlying.getResourceStatusReason)

  def resourceStatusReasonOpt_=(value: Option[String]): Unit =
    underlying.setResourceStatusReason(value.orNull)

  def withResourceStatusReasonOpt(value: Option[String]): StackResource =
    underlying.withResourceStatusReason(value.orNull)

  // ---

  def descriptionOpt: Option[String] = Option(underlying.getDescription)

  def descriptionOpt_=(value: Option[String]): Unit =
    underlying.setDescription(value.orNull)

  def withDescriptionOpt(value: Option[String]): StackResource =
    underlying.withDescription(value.orNull)

}
