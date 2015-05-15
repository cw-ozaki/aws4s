package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model.GetTemplateSummaryRequest
import org.sisioh.aws4s.PimpedType

object GetTemplateSummaryRequestFactory {

  def create(): GetTemplateSummaryRequest = new GetTemplateSummaryRequest()

}

class RichGetTemplateSummaryRequest(val underlying: GetTemplateSummaryRequest)
    extends AnyVal with PimpedType[GetTemplateSummaryRequest] {

  def stackNameOpt: Option[String] = Option(underlying.getStackName)

  def stackNameOpt_=(value: Option[String]): Unit =
    underlying.setStackName(value.orNull)

  def withStackNameOpt(value: Option[String]): GetTemplateSummaryRequest =
    underlying.withStackName(value.orNull)

  // ---

  def templateBodyOpt: Option[String] = Option(underlying.getTemplateBody)

  def templateBodyOpt_=(value: Option[String]): Unit =
    underlying.setTemplateBody(value.orNull)

  def withTemplateBodyOpt(value: Option[String]): GetTemplateSummaryRequest =
    underlying.withTemplateBody(value.orNull)

  // ---

  def templateURLOpt: Option[String] = Option(underlying.getTemplateURL)

  def templateURLOpt_=(value: Option[String]): Unit =
    underlying.setTemplateURL(value.orNull)

  def withTemplateURLOpt(value: Option[String]): GetTemplateSummaryRequest =
    underlying.withTemplateURL(value.orNull)

}
