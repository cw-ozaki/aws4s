package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.{ConfigurationOptionSetting, OptionSpecification, UpdateConfigurationTemplateRequest}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichUpdateConfigurationTemplateRequest(val underlying: UpdateConfigurationTemplateRequest)
  extends AnyVal with PimpedType[UpdateConfigurationTemplateRequest] {

  def applicationNameOpt: Option[String] = Option(underlying.getApplicationName)

  def applicationNameOpt_=(value: Option[String]): Unit =
    underlying.setApplicationName(value.orNull)

  def withApplicationNameOpt(value: Option[String]): UpdateConfigurationTemplateRequest =
    underlying.withApplicationName(value.orNull)

  // ---

  def templateNameOpt: Option[String] = Option(underlying.getTemplateName)

  def templateNameOpt_=(value: Option[String]): Unit =
    underlying.setTemplateName(value.orNull)

  def withTemplateNameOpt(value: Option[String]): UpdateConfigurationTemplateRequest =
    underlying.withTemplateName(value.orNull)

  // ---

  def descriptionOpt: Option[String] = Option(underlying.getDescription)

  def descriptionOpt_=(value: Option[String]): Unit =
    underlying.setDescription(value.orNull)

  def withDescriptionOpt(value: Option[String]): UpdateConfigurationTemplateRequest =
    underlying.withDescription(value.orNull)

  // ---

  def optionSettings: Seq[ConfigurationOptionSetting] = underlying.getOptionSettings.asScala

  def optionSettings_=(value: Seq[ConfigurationOptionSetting]): Unit =
    underlying.setOptionSettings(value.asJava)

  def withOptionSettings(value: Seq[ConfigurationOptionSetting]): UpdateConfigurationTemplateRequest =
    underlying.withOptionSettings(value.asJava)

  // ---

  def optionsToRemove: Seq[OptionSpecification] = underlying.getOptionsToRemove.asScala

  def optionsToRemove_=(value: Seq[OptionSpecification]): Unit =
    underlying.setOptionsToRemove(value.asJava)

  def withOptionsToRemove(value: Seq[OptionSpecification]): UpdateConfigurationTemplateRequest =
    underlying.withOptionsToRemove(value.asJava)

}
