package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model.GetTemplateResult
import org.sisioh.aws4s.PimpedType

class RichGetTemplateResult(val underlying: GetTemplateResult)
  extends AnyVal with PimpedType[GetTemplateResult] {

  def templateBodyOpt: Option[String] = Option(underlying.getTemplateBody)

  def templateBodyOpt_=(value: Option[String]): Unit =
    underlying.setTemplateBody(value.orNull)

  def withTemplateBodyOpt(value: Option[String]): GetTemplateResult =
    underlying.withTemplateBody(value.orNull)

}
