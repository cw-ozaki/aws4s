package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model.GetStackPolicyRequest
import org.sisioh.aws4s.PimpedType

class RichGetStackPolicyRequest(val underlying: GetStackPolicyRequest)
  extends AnyVal with PimpedType[GetStackPolicyRequest] {

  def stackNameOpt: Option[String] = Option(underlying.getStackName)

  def stackNameOpt_=(value: Option[String]): Unit =
    underlying.setStackName(value.orNull)

  def withStackNameOpt(value: Option[String]): GetStackPolicyRequest =
    underlying.withStackName(value.orNull)

}
