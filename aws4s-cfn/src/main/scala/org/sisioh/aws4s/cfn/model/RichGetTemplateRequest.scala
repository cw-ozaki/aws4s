package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model.GetTemplateRequest
import org.sisioh.aws4s.PimpedType

object GetTemplateRequestFactory {

  def create(): GetTemplateRequest = new GetTemplateRequest()

}

class RichGetTemplateRequest(val underlying: GetTemplateRequest)
    extends AnyVal with PimpedType[GetTemplateRequest] {

  def stackNameOpt: Option[String] = Option(underlying.getStackName)

  def stackNameOpt_=(value: Option[String]): Unit =
    underlying.setStackName(value.orNull)

  def withStackNameOpt(value: Option[String]): GetTemplateRequest =
    underlying.withStackName(value.orNull)

}
