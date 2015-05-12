package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model.{EstimateTemplateCostRequest, Parameter}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichEstimateTemplateCostRequest(val underlying: EstimateTemplateCostRequest)
  extends AnyVal with PimpedType[EstimateTemplateCostRequest] {
  def templateBodyOpt: Option[String] = Option(underlying.getTemplateBody)

  def templateBodyOpt_=(value: Option[String]): Unit =
    underlying.setTemplateBody(value.orNull)

  def withTemplateBodyOpt(value: Option[String]): EstimateTemplateCostRequest =
    underlying.withTemplateBody(value.orNull)

  // ---

  def templateURLOpt: Option[String] = Option(underlying.getTemplateURL)

  def templateURLOpt_=(value: Option[String]): Unit =
    underlying.setTemplateURL(value.orNull)

  def withTemplateURLOpt(value: Option[String]): EstimateTemplateCostRequest =
    underlying.withTemplateURL(value.orNull)

  // ---

  def parameters: Seq[Parameter] = underlying.getParameters.asScala.toVector

  def parameters_=(value: Seq[Parameter]): Unit =
    underlying.setParameters(value.asJava)

  def withParameters(value: Seq[Parameter]): EstimateTemplateCostRequest =
    underlying.withParameters(value.asJava)
}
