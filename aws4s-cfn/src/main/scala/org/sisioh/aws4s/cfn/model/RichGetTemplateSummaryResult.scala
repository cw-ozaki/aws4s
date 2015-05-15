package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model.{ GetTemplateSummaryResult, ParameterDeclaration }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object GetTemplateSummaryResultFactory {

  def create(): GetTemplateSummaryResult = new GetTemplateSummaryResult()

}

class RichGetTemplateSummaryResult(val underlying: GetTemplateSummaryResult)
    extends AnyVal with PimpedType[GetTemplateSummaryResult] {

  def parameters: Seq[ParameterDeclaration] = underlying.getParameters.asScala.toVector

  def parameters_=(value: Seq[ParameterDeclaration]): Unit =
    underlying.setParameters(value.asJava)

  def withParameters(value: Seq[ParameterDeclaration]): GetTemplateSummaryResult =
    underlying.withParameters(value.asJava)

  // ---

  def descriptionOpt: Option[String] = Option(underlying.getDescription)

  def descriptionOpt_=(value: Option[String]): Unit =
    underlying.setDescription(value.orNull)

  def withDescriptionOpt(value: Option[String]): GetTemplateSummaryResult =
    underlying.withDescription(value.orNull)

  // ---

  def capabilities: Seq[String] = underlying.getCapabilities.asScala.toVector

  def capabilities_=(value: Seq[String]): Unit =
    underlying.setCapabilities(value.asJava)

  def withCapabilities(value: Seq[String]): GetTemplateSummaryResult =
    underlying.withCapabilities(value.asJava)

  // ---

  def capabilitiesReasonOpt: Option[String] = Option(underlying.getCapabilitiesReason)

  def capabilitiesReasonOpt_=(value: Option[String]): Unit =
    underlying.setCapabilitiesReason(value.orNull)

  def withCapabilitiesReasonOpt(value: Option[String]): GetTemplateSummaryResult =
    underlying.withCapabilitiesReason(value.orNull)

  // ---

  def versionOpt: Option[String] = Option(underlying.getVersion)

  def versionOpt_=(value: Option[String]): Unit =
    underlying.setVersion(value.orNull)

  def withVersionOpt(value: Option[String]): GetTemplateSummaryResult =
    underlying.withVersion(value.orNull)

}
