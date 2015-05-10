package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model.DescribeStackResourceRequest
import org.sisioh.aws4s.PimpedType

class RichDescribeStackResourceRequest(val underlying: DescribeStackResourceRequest)
  extends AnyVal with PimpedType[DescribeStackResourceRequest] {

  def stackNameOpt: Option[String] = Option(underlying.getStackName)

  def stackNameOpt_=(value: Option[String]): Unit =
    underlying.setStackName(value.orNull)

  def withStackNameOpt(value: Option[String]): DescribeStackResourceRequest =
    underlying.withStackName(value.orNull)

  // ---

  def logicalResourceIdOpt = Option(underlying.getLogicalResourceId)

  def logicalResourceIdOpt_=(value: Option[String]): Unit =
    underlying.setLogicalResourceId(value.orNull)

  def withLogicalResourceIdOpt(value: Option[String]): DescribeStackResourceRequest =
    underlying.withLogicalResourceId(value.orNull)

}
