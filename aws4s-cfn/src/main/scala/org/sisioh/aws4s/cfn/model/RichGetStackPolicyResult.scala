package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model.GetStackPolicyResult
import org.sisioh.aws4s.PimpedType

object GetStackPolicyResultFactory {

  def create(): GetStackPolicyResult = new GetStackPolicyResult()

}

class RichGetStackPolicyResult(val underlying: GetStackPolicyResult)
    extends AnyVal with PimpedType[GetStackPolicyResult] {

  def stackPolicyBodyOpt: Option[String] = Option(underlying.getStackPolicyBody)

  def stackPolicyBodyOpt_=(value: Option[String]): Unit =
    underlying.setStackPolicyBody(value.orNull)

  def withStackPolicyBodyOpt(value: Option[String]): GetStackPolicyResult =
    underlying.withStackPolicyBody(value.orNull)

}
