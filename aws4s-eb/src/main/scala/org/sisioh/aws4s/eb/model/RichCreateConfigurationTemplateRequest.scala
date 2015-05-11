package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.{ConfigurationOptionSetting, SourceConfiguration, CreateConfigurationTemplateRequest}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object CreateConfigurationTemplateRequestFactory {

  def create(): CreateConfigurationTemplateRequest = new CreateConfigurationTemplateRequest()

}

class RichCreateConfigurationTemplateRequest(val underlying: CreateConfigurationTemplateRequest)
  extends AnyVal with PimpedType[CreateConfigurationTemplateRequest] {

  def applicationNameOpt: Option[String] = Option(underlying.getApplicationName)

  def applicationNameOpt_=(value: Option[String]): Unit =
    underlying.setApplicationName(value.orNull)

  def withApplicationNameOpt(value: Option[String]): CreateConfigurationTemplateRequest =
    underlying.withApplicationName(value.orNull)

  // ---

  def templateNameOpt: Option[String] = Option(underlying.getTemplateName)

  def templateNameOpt_=(value: Option[String]): Unit =
    underlying.setTemplateName(value.orNull)

  def withTemplateNameOpt(value: Option[String]): CreateConfigurationTemplateRequest =
    underlying.withTemplateName(value.orNull)

  // ---

  def solutionStackNameOpt: Option[String] = Option(underlying.getSolutionStackName)

  def solutionStackNameOpt_=(value: Option[String]): Unit =
    underlying.setSolutionStackName(value.orNull)

  def withSolutionStackNameOpt(value: Option[String]): CreateConfigurationTemplateRequest =
    underlying.withSolutionStackName(value.orNull)

  // ---

  def sourceConfigurationOpt: Option[SourceConfiguration] = Option(underlying.getSourceConfiguration)

  def sourceConfigurationOpt_=(value: Option[SourceConfiguration]): Unit =
    underlying.setSourceConfiguration(value.orNull)

  def withSourceConfigurationOpt(value: Option[SourceConfiguration]): CreateConfigurationTemplateRequest =
    underlying.withSourceConfiguration(value.orNull)

  // ---

  def environmentIdOpt: Option[String] = Option(underlying.getEnvironmentId)

  def environmentIdOpt_=(value: Option[String]): Unit = underlying.setEnvironmentId(value.orNull)

  def withEnvironmentIdOpt(value: Option[String]): CreateConfigurationTemplateRequest =
    underlying.withEnvironmentId(value.orNull)

  // ---

  def descriptionOpt: Option[String] = Option(underlying.getDescription)

  def descriptionOpt_=(value: Option[String]): Unit =
    underlying.setDescription(value.orNull)

  def withDescriptionOpt(value: Option[String]): CreateConfigurationTemplateRequest =
    underlying.withDescription(value.orNull)

  // ---

  def optionSettings: Seq[ConfigurationOptionSetting] = underlying.getOptionSettings.asScala

  def optionSettings_=(value: Seq[ConfigurationOptionSetting]): Unit =
    underlying.setOptionSettings(value.asJava)

  def withOptionSettings(value: Seq[ConfigurationOptionSetting]): CreateConfigurationTemplateRequest =
    underlying.withOptionSettings(value.asJava)
}
