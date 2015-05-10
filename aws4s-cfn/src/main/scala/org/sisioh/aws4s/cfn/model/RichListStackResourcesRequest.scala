package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model.ListStackResourcesRequest
import org.sisioh.aws4s.PimpedType

class RichListStackResourcesRequest(val underlying: ListStackResourcesRequest)
  extends AnyVal with PimpedType[ListStackResourcesRequest] {

  def stackNameOpt: Option[String] = Option(underlying.getStackName)

  def stackNameOpt_=(value: Option[String]): Unit =
    underlying.setStackName(value.orNull)

  def withStackNameOpt(value: Option[String]): ListStackResourcesRequest =
    underlying.withStackName(value.orNull)

  // ---

  def nextTokenOpt: Option[String] = Option(underlying.getNextToken)

  def nextTokenOpt_=(value: Option[String]): Unit =
    underlying.setNextToken(value.orNull)

  def withNextTokenOpt(value: Option[String]): ListStackResourcesRequest =
    underlying.withNextToken(value.orNull)

}
