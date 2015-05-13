package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model.DescribeStackResourcesRequest
import org.sisioh.aws4s.PimpedType

object DescribeStackResourcesRequestFactory {

  def create(): DescribeStackResourcesRequest = new DescribeStackResourcesRequest()

}

class RichDescribeStackResourcesRequest(val underlying: DescribeStackResourcesRequest)
  extends AnyVal with PimpedType[DescribeStackResourcesRequest] {

  def stackNameOpt: Option[String] = Option(underlying.getStackName)

  def stackNameOpt_=(value: Option[String]): Unit =
    underlying.setStackName(value.orNull)

  def withStackNameOpt(value: Option[String]): DescribeStackResourcesRequest =
    underlying.withStackName(value.orNull)

  // ---

  def logicalResourceIdOpt: Option[String] = Option(underlying.getLogicalResourceId)

  def logicalResourceIdOpt_=(value: Option[String]): Unit =
    underlying.setLogicalResourceId(value.orNull)

  def withLogicalResourceIdOpt(value: Option[String]): DescribeStackResourcesRequest =
    underlying.withLogicalResourceId(value.orNull)

  // ---

  def physicalResourceIdOpt: Option[String] = Option(underlying.getPhysicalResourceId)

  def physicalResourceIdOpt_=(value: Option[String]): Unit =
    underlying.setPhysicalResourceId(value.orNull)

  def withPhysicalResourceIdOpt(value: Option[String]): DescribeStackResourcesRequest =
    underlying.withPhysicalResourceId(value.orNull)


}
