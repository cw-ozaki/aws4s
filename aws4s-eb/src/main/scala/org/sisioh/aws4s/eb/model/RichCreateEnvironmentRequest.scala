package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model._
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object CreateEnvironmentRequestFactory {

  def create(): CreateEnvironmentRequest = new CreateEnvironmentRequest()

}

class RichCreateEnvironmentRequest(val underlying: CreateEnvironmentRequest)
  extends AnyVal with PimpedType[CreateEnvironmentRequest] {

  def applicationNameOpt: Option[String] = Option(underlying.getApplicationName)

  def applicationNameOpt_=(value: Option[String]): Unit =
    underlying.setApplicationName(value.orNull)

  def withApplicationNameOpt(value: Option[String]): CreateEnvironmentRequest =
    underlying.withApplicationName(value.orNull)

  // ---

  def environmentNameOpt: Option[String] = Option(underlying.getEnvironmentName)

  def environmentNameOpt_=(value: Option[String]): Unit =
    underlying.setEnvironmentName(value.orNull)

  def withEnvironmentNameOpt(value: Option[String]): CreateEnvironmentRequest =
    underlying.withEnvironmentName(value.orNull)

  // ---

  def descriptionOpt: Option[String] = Option(underlying.getDescription)

  def descriptionOpt_=(value: Option[String]): Unit =
    underlying.setDescription(value.orNull)

  def withDescriptionOpt(value: Option[String]): CreateEnvironmentRequest =
    underlying.withDescription(value.orNull)

  // ---

  def cNAMEPrefixOpt: Option[String] = Option(underlying.getCNAMEPrefix)

  def cNAMEPrefixOpt_=(value: Option[String]): Unit =
    underlying.setCNAMEPrefix(value.orNull)

  def withCNAMEPrefixOpt(value: Option[String]): CreateEnvironmentRequest =
    underlying.withCNAMEPrefix(value.orNull)

  // ---

  def tierOpt: Option[EnvironmentTier] = Option(underlying.getTier)

  def tierOpt_=(value: Option[EnvironmentTier]): Unit =
    underlying.setTier(value.orNull)

  def withTierOpt(value: Option[EnvironmentTier]): CreateEnvironmentRequest =
    underlying.withTier(value.orNull)

  // ---

  def versionLabelOpt: Option[String] = Option(underlying.getVersionLabel)

  def versionLabelOpt_=(value: Option[String]): Unit =
    underlying.setVersionLabel(value.orNull)

  def withVersionLabelOpt(value: Option[String]): CreateEnvironmentRequest =
    underlying.withVersionLabel(value.orNull)

  // ---

  def tags: Seq[Tag] = underlying.getTags.asScala.toVector

  def tags_=(value: Seq[Tag]): Unit =
    underlying.setTags(value.asJava)

  def withTags(value: Seq[Tag]): CreateEnvironmentRequest =
    underlying.withTags(value.asJava)

  // ---

  def templateNameOpt: Option[String] = Option(underlying.getTemplateName)

  def templateNameOpt_=(value: Option[String]): Unit =
    underlying.setTemplateName(value.orNull)

  def withTemplateNameOpt(value: Option[String]): CreateEnvironmentRequest =
    underlying.withTemplateName(value.orNull)

  // ---

  def solutionStackNameOpt: Option[String] = Option(underlying.getSolutionStackName)

  def solutionStackNameOpt_=(value: Option[String]): Unit =
    underlying.setSolutionStackName(value.orNull)

  def withSolutionStackNameOpt(value: Option[String]): CreateEnvironmentRequest =
    underlying.withSolutionStackName(value.orNull)

  // ---

  def optionSettings: Seq[ConfigurationOptionSetting] = underlying.getOptionSettings.asScala.toVector

  def optionSettings_=(value: Seq[ConfigurationOptionSetting]): Unit =
    underlying.setOptionSettings(value.asJava)

  def withOptionSettings(value: Seq[ConfigurationOptionSetting]): CreateEnvironmentRequest =
    underlying.withOptionSettings(value.asJava)

  // ---

  def optionsToRemove: Seq[OptionSpecification] = underlying.getOptionsToRemove.asScala.toVector

  def optionsToRemove_=(value: Seq[OptionSpecification]): Unit =
    underlying.setOptionsToRemove(value.asJava)

  def withOptionsToRemove(value: Seq[OptionSpecification]): CreateEnvironmentRequest =
    underlying.withOptionsToRemove(value.asJava)

}
