package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model.DescribeStacksRequest
import org.sisioh.aws4s.PimpedType

class RichDescribeStacksRequest(val underlying: DescribeStacksRequest)
  extends AnyVal with PimpedType[DescribeStacksRequest] {

  def stackNameOpt: Option[String] = Option(underlying.getStackName)

  def stackNameOpt_=(value: Option[String]): Unit =
    underlying.setStackName(value.orNull)

  def withStackNameOpt(value: Option[String]): DescribeStacksRequest =
    underlying.withStackName(value.orNull)

  // ---

  def nextTokenOpt: Option[String] = Option(underlying.getNextToken)

  def nextTokenOpt_=(value: Option[String]): Unit =
    underlying.setNextToken(value.orNull)

  def withNextTokenOpt(value: Option[String]): DescribeStacksRequest =
    underlying.withNextToken(value.orNull)

}
