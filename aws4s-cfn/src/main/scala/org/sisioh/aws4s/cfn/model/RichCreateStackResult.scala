package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model.CreateStackResult
import org.sisioh.aws4s.PimpedType

object CreateStackResultFactroy {

  def create(): CreateStackResult = new CreateStackResult()

}

class RichCreateStackResult(val underlying: CreateStackResult)
    extends AnyVal with PimpedType[CreateStackResult] {

  def stackIdOpt: Option[String] = Option(underlying.getStackId)

  def stackIdOpt_=(value: Option[String]): Unit =
    underlying.setStackId(value.orNull)

  def withStackIdOpt(value: Option[String]): CreateStackResult =
    underlying.withStackId(value.orNull)

}
