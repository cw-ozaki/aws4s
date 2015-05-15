package org.sisioh.aws4s.cfn.model

import java.util.Date

import com.amazonaws.services.cloudformation.model.StackResourceDetail
import org.sisioh.aws4s.PimpedType

object StackResourceDetailFactory {

  def create(): StackResourceDetail = new StackResourceDetail

}

class RichStackResourceDetail(val underlying: StackResourceDetail)
    extends AnyVal with PimpedType[StackResourceDetail] {

  def stackNameOpt: Option[String] = Option(underlying.getStackName)

  def stackNameOpt_=(value: Option[String]): Unit =
    underlying.setStackName(value.orNull)

  def withStackNameOpt(value: Option[String]): StackResourceDetail =
    underlying.withStackName(value.orNull)

  // ---

  def stackIdOpt: Option[String] = Option(underlying.getStackId)

  def stackIdOpt_=(value: Option[String]): Unit =
    underlying.setStackId(value.orNull)

  def withStackIdOpt(value: Option[String]): StackResourceDetail =
    underlying.withStackId(value.orNull)

  // ---

  def logicalResourceIdOpt = Option(underlying.getLogicalResourceId)

  def logicalResourceIdOpt_=(value: Option[String]): Unit =
    underlying.setLogicalResourceId(value.orNull)

  def withLogicalResourceIdOpt(value: Option[String]): StackResourceDetail =
    underlying.withLogicalResourceId(value.orNull)

  // ---

  def physicalResourceIdOpt: Option[String] = Option(underlying.getPhysicalResourceId)

  def physicalResourceIdOpt_=(value: Option[String]): Unit =
    underlying.setPhysicalResourceId(value.orNull)

  def withPhysicalResourceIdOpt(value: Option[String]): StackResourceDetail =
    underlying.withPhysicalResourceId(value.orNull)

  // ---

  def resourceTypeOpt: Option[String] = Option(underlying.getResourceType)

  def resourceTypeOpt_=(value: Option[String]): Unit =
    underlying.setResourceType(value.orNull)

  def withResourceTypeOpt(value: Option[String]): StackResourceDetail =
    underlying.withResourceType(value.orNull)

  // ---

  def lastUpdatedTimestampOpt: Option[Date] = Option(underlying.getLastUpdatedTimestamp)

  def lastUpdatedTimestampOpt(value: Option[Date]): Unit =
    underlying.setLastUpdatedTimestamp(value.orNull)

  def withLastUpdatedTimestampOpt(value: Option[Date]): StackResourceDetail =
    underlying.withLastUpdatedTimestamp(value.orNull)

  // ---

  def resourceStatusOpt: Option[String] = Option(underlying.getResourceStatus)

  def resourceStatusOpt_=(value: Option[String]): Unit =
    underlying.setResourceStatus(value.orNull)

  def withResourceStatusOpt(value: Option[String]): StackResourceDetail =
    underlying.withResourceStatus(value.orNull)

  // ---

  def resourceStatusReasonOpt: Option[String] = Option(underlying.getResourceStatusReason)

  def resourceStatusReasonOpt_=(value: Option[String]): Unit =
    underlying.setResourceStatusReason(value.orNull)

  def withResourceStatusReasonOpt(value: Option[String]): StackResourceDetail =
    underlying.withResourceStatusReason(value.orNull)

  // ---

  def descriptionOpt: Option[String] = Option(underlying.getDescription)

  def descriptionOpt_=(value: Option[String]): Unit =
    underlying.setDescription(value.orNull)

  def withDescriptionOpt(value: Option[String]): StackResourceDetail =
    underlying.withDescription(value.orNull)

  // ---

  def metadataOpt: Option[String] = Option(underlying.getMetadata)

  def metadataOpt_=(value: Option[String]): Unit =
    underlying.setMetadata(value.orNull)

  def withMetadataOpt(value: Option[String]): StackResourceDetail =
    underlying.withMetadata(value.orNull)
}
