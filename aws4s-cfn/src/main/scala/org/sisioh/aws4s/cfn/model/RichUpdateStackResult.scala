package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model.UpdateStackResult
import org.sisioh.aws4s.PimpedType

class RichUpdateStackResult(val underlying: UpdateStackResult)
  extends AnyVal with PimpedType[UpdateStackResult] {

  def stackIdOpt: Option[String] = Option(underlying.getStackId)

  def stackIdOpt_=(value: Option[String]): Unit =
    underlying.setStackId(value.orNull)

  def withStackIdOpt(value: Option[String]): UpdateStackResult =
    underlying.withStackId(value.orNull)

}
