package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model._
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichValidateTemplateResult(val underlying: ValidateTemplateResult)
  extends AnyVal with PimpedType[ValidateTemplateResult] {

  def parameters: Seq[TemplateParameter] = underlying.getParameters.asScala.toVector

  def parameters_=(value: Seq[TemplateParameter]): Unit =
    underlying.setParameters(value.asJava)

  def withParameters(value: Seq[TemplateParameter]): ValidateTemplateResult =
    underlying.withParameters(value.asJava)

  // ---

  def descriptionOpt: Option[String] = Option(underlying.getDescription)

  def descriptionOpt_=(value: Option[String]): Unit =
    underlying.setDescription(value.orNull)

  def withDescriptionOpt(value: Option[String]): ValidateTemplateResult =
    underlying.withDescription(value.orNull)

  // ---

  def capabilities: Seq[String] = underlying.getCapabilities.asScala.toVector

  def capabilities_=(value: Seq[String]): Unit =
    underlying.setCapabilities(value.asJava)

  def withCapabilities(value: Seq[String]): ValidateTemplateResult =
    underlying.withCapabilities(value.asJava)

  // ---

  def capabilitiesReasonOpt: Option[String] = Option(underlying.getCapabilitiesReason)

  def capabilitiesReasonOpt_=(value: Option[String]): Unit =
    underlying.setCapabilitiesReason(value.orNull)

  def withCapabilitiesReasonOpt(value: Option[String]): ValidateTemplateResult =
    underlying.withCapabilitiesReason(value.orNull)

}
