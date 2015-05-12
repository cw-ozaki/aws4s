package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model._
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object UpdateEnvironmentRequestFactory {

  def create(): UpdateEnvironmentRequest = new UpdateEnvironmentRequest()

}

class RichUpdateEnvironmentRequest(val underlying: UpdateEnvironmentRequest)
    extends AnyVal with PimpedType[UpdateEnvironmentRequest] {

  def environmentIdOpt: Option[String] = Option(underlying.getEnvironmentId)

  def environmentIdOpt_=(value: Option[String]): Unit = underlying.setEnvironmentId(value.orNull)

  def withEnvironmentIdOpt(value: Option[String]): UpdateEnvironmentRequest =
    underlying.withEnvironmentId(value.orNull)

  // ---

  def environmentNameOpt: Option[String] = Option(underlying.getEnvironmentName)

  def environmentNameOpt_=(value: Option[String]): Unit =
    underlying.setEnvironmentName(value.orNull)

  def withEnvironmentNameOpt(value: Option[String]): UpdateEnvironmentRequest =
    underlying.withEnvironmentName(value.orNull)

  // ---

  def descriptionOpt: Option[String] = Option(underlying.getDescription)

  def descriptionOpt_=(value: Option[String]): Unit =
    underlying.setDescription(value.orNull)

  def withDescriptionOpt(value: Option[String]): UpdateEnvironmentRequest =
    underlying.withDescription(value.orNull)

  // ---

  def tierOpt: Option[EnvironmentTier] = Option(underlying.getTier)

  def tierOpt_=(value: Option[EnvironmentTier]): Unit =
    underlying.setTier(value.orNull)

  def withTierOpt(value: Option[EnvironmentTier]): UpdateEnvironmentRequest =
    underlying.withTier(value.orNull)

  // ---

  def versionLabelOpt: Option[String] = Option(underlying.getVersionLabel)

  def versionLabelOpt_=(value: Option[String]): Unit =
    underlying.setVersionLabel(value.orNull)

  def withVersionLabelOpt(value: Option[String]): UpdateEnvironmentRequest =
    underlying.withVersionLabel(value.orNull)

  // ---

  def templateNameOpt: Option[String] = Option(underlying.getTemplateName)

  def templateNameOpt_=(value: Option[String]): Unit =
    underlying.setTemplateName(value.orNull)

  def withTemplateNameOpt(value: Option[String]): UpdateEnvironmentRequest =
    underlying.withTemplateName(value.orNull)

  // ---

  def optionSettings: Seq[ConfigurationOptionSetting] = underlying.getOptionSettings.asScala

  def optionSettings_=(value: Seq[ConfigurationOptionSetting]): Unit =
    underlying.setOptionSettings(value.asJava)

  def withOptionSettings(value: Seq[ConfigurationOptionSetting]): UpdateEnvironmentRequest =
    underlying.withOptionSettings(value.asJava)

  // ---

  def optionsToRemove: Seq[OptionSpecification] = underlying.getOptionsToRemove.asScala

  def optionsToRemove_=(value: Seq[OptionSpecification]): Unit =
    underlying.setOptionsToRemove(value.asJava)

  def withOptionsToRemove(value: Seq[OptionSpecification]): UpdateEnvironmentRequest =
    underlying.withOptionsToRemove(value.asJava)

}
