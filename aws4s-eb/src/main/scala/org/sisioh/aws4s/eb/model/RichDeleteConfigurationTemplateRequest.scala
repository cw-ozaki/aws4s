package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.DeleteConfigurationTemplateRequest
import org.sisioh.aws4s.PimpedType

object DeleteConfigurationTemplateRequestFactory {

  def create(): DeleteConfigurationTemplateRequest = new DeleteConfigurationTemplateRequest()

}

class RichDeleteConfigurationTemplateRequest(val underlying: DeleteConfigurationTemplateRequest)
  extends AnyVal with PimpedType[DeleteConfigurationTemplateRequest] {

  def applicationNameOpt: Option[String] = Option(underlying.getApplicationName)

  def applicationNameOpt_=(value: Option[String]): Unit =
    underlying.setApplicationName(value.orNull)

  def withApplicationNameOpt(value: Option[String]): DeleteConfigurationTemplateRequest =
    underlying.withApplicationName(value.orNull)

  // ---

  def templateNameOpt: Option[String] = Option(underlying.getTemplateName)

  def templateNameOpt_=(value: Option[String]): Unit =
    underlying.setTemplateName(value.orNull)

  def withTemplateNameOpt(value: Option[String]): DeleteConfigurationTemplateRequest =
    underlying.withTemplateName(value.orNull)

}
