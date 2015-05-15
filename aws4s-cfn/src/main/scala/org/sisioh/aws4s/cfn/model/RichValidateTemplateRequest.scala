package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model.ValidateTemplateRequest
import org.sisioh.aws4s.PimpedType

object ValidateTemplateRequestFactory {

  def create(): ValidateTemplateRequest = new ValidateTemplateRequest()

}

class RichValidateTemplateRequest(val underlying: ValidateTemplateRequest)
    extends AnyVal with PimpedType[ValidateTemplateRequest] {

  def templateBodyOpt: Option[String] = Option(underlying.getTemplateBody)

  def templateBodyOpt_=(value: Option[String]): Unit =
    underlying.setTemplateBody(value.orNull)

  def withTemplateBodyOpt(value: Option[String]): ValidateTemplateRequest =
    underlying.withTemplateBody(value.orNull)

  // ---

  def templateURLOpt: Option[String] = Option(underlying.getTemplateURL)

  def templateURLOpt_=(value: Option[String]): Unit =
    underlying.setTemplateURL(value.orNull)

  def withTemplateURLOpt(value: Option[String]): ValidateTemplateRequest =
    underlying.withTemplateURL(value.orNull)
}
