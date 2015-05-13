package org.sisioh.aws4s.eb.model

import java.util.Date

import com.amazonaws.services.elasticbeanstalk.model.{ConfigurationOptionSetting, UpdateConfigurationTemplateResult}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object UpdateConfigurationTemplateResultFactory {

  def create(): UpdateConfigurationTemplateResult = new UpdateConfigurationTemplateResult()

}

class RichUpdateConfigurationTemplateResult(val underlying: UpdateConfigurationTemplateResult)
    extends AnyVal with PimpedType[UpdateConfigurationTemplateResult] {

  def solutionStackNameOpt: Option[String] = Option(underlying.getSolutionStackName)

  def solutionStackNameOpt_=(value: Option[String]): Unit =
    underlying.setSolutionStackName(value.orNull)

  def withSolutionStackNameOpt(value: Option[String]): UpdateConfigurationTemplateResult =
    underlying.withSolutionStackName(value.orNull)

  // ---

  def applicationNameOpt: Option[String] = Option(underlying.getApplicationName)

  def applicationNameOpt_=(value: Option[String]): Unit =
    underlying.setApplicationName(value.orNull)

  def withApplicationNameOpt(value: Option[String]): UpdateConfigurationTemplateResult =
    underlying.withApplicationName(value.orNull)

  // ---

  def templateNameOpt: Option[String] = Option(underlying.getTemplateName)

  def templateNameOpt_=(value: Option[String]): Unit =
    underlying.setTemplateName(value.orNull)

  def withTemplateNameOpt(value: Option[String]): UpdateConfigurationTemplateResult =
    underlying.withTemplateName(value.orNull)

  // ---

  def descriptionOpt: Option[String] = Option(underlying.getDescription)

  def descriptionOpt_=(value: Option[String]): Unit =
    underlying.setDescription(value.orNull)

  def withDescriptionOpt(value: Option[String]): UpdateConfigurationTemplateResult =
    underlying.withDescription(value.orNull)

  // ---

  def environmentNameOpt: Option[String] = Option(underlying.getEnvironmentName)

  def environmentNameOpt_=(value: Option[String]): Unit =
    underlying.setEnvironmentName(value.orNull)

  def withEnvironmentNameOpt(value: Option[String]): UpdateConfigurationTemplateResult =
    underlying.withEnvironmentName(value.orNull)

  // ---

  def deploymentStatusOpt: Option[String] = Option(underlying.getDeploymentStatus)

  def deploymentStatusOpt_=(value: Option[String]): Unit =
    underlying.setDeploymentStatus(value.orNull)

  def withDeploymentStatusOpt(value: Option[String]): UpdateConfigurationTemplateResult =
    underlying.withDeploymentStatus(value.orNull)

  // ---

  def dateCreatedOpt: Option[Date] = Option(underlying.getDateCreated)

  def dateCreatedOpt_=(value: Option[Date]): Unit =
    underlying.setDateCreated(value.orNull)

  def withDateCreatedOpt(value: Option[Date]): UpdateConfigurationTemplateResult =
    underlying.withDateCreated(value.orNull)

  // ---

  def dateUpdatedOpt: Option[Date] = Option(underlying.getDateUpdated)

  def dateUpdatedOpt_=(value: Option[Date]): Unit = underlying.setDateUpdated(value.orNull)

  def withDateUpdatedOpt(value: Option[Date]): UpdateConfigurationTemplateResult =
    underlying.withDateUpdated(value.orNull)

  // ---

  def optionSettings: Seq[ConfigurationOptionSetting] = underlying.getOptionSettings.asScala

  def optionSettings_=(value: Seq[ConfigurationOptionSetting]): Unit =
    underlying.setOptionSettings(value.asJava)

  def withOptionSettings(value: Seq[ConfigurationOptionSetting]): UpdateConfigurationTemplateResult =
    underlying.withOptionSettings(value.asJava)

}
