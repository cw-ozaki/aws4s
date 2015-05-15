package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model.CancelUpdateStackRequest
import org.sisioh.aws4s.PimpedType

object CancelUpdateStackRequestFactory {

  def create(): CancelUpdateStackRequest = new CancelUpdateStackRequest()

}

class RichCancelUpdateStackRequest(val underlying: CancelUpdateStackRequest)
    extends AnyVal with PimpedType[CancelUpdateStackRequest] {

  def stackNameOpt: Option[String] = Option(underlying.getStackName)

  def stackNameOpt_=(value: Option[String]): Unit =
    underlying.setStackName(value.orNull)

  def withStackNameOpt(value: Option[String]): CancelUpdateStackRequest =
    underlying.withStackName(value.orNull)

}
