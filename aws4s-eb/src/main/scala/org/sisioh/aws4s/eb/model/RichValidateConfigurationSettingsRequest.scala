package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.{ ConfigurationOptionSetting, ValidateConfigurationSettingsRequest }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ValidateConfigurationSettingsRequestFactory {

  def create(): ValidateConfigurationSettingsRequest = new ValidateConfigurationSettingsRequest()

}

class RichValidateConfigurationSettingsRequest(val underlying: ValidateConfigurationSettingsRequest)
    extends AnyVal with PimpedType[ValidateConfigurationSettingsRequest] {

  def applicationNameOpt: Option[String] = Option(underlying.getApplicationName)

  def applicationNameOpt_=(value: Option[String]): Unit =
    underlying.setApplicationName(value.orNull)

  def withApplicationNameOpt(value: Option[String]): ValidateConfigurationSettingsRequest =
    underlying.withApplicationName(value.orNull)

  // ---

  def templateNameOpt: Option[String] = Option(underlying.getTemplateName)

  def templateNameOpt_=(value: Option[String]): Unit =
    underlying.setTemplateName(value.orNull)

  def withTemplateNameOpt(value: Option[String]): ValidateConfigurationSettingsRequest =
    underlying.withTemplateName(value.orNull)

  // ---

  def environmentNameOpt: Option[String] = Option(underlying.getEnvironmentName)

  def environmentNameOpt_=(value: Option[String]): Unit =
    underlying.setEnvironmentName(value.orNull)

  def withEnvironmentNameOpt(value: Option[String]): ValidateConfigurationSettingsRequest =
    underlying.withEnvironmentName(value.orNull)

  // ---

  def optionSettings: Seq[ConfigurationOptionSetting] = underlying.getOptionSettings.asScala

  def optionSettings_=(value: Seq[ConfigurationOptionSetting]): Unit =
    underlying.setOptionSettings(value.asJava)

  def withOptionSettings(value: Iterable[ConfigurationOptionSetting]): ValidateConfigurationSettingsRequest =
    underlying.withOptionSettings(value.toSeq.asJava)

}
