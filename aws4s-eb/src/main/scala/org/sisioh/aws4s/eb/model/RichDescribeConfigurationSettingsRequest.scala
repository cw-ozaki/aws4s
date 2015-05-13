package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationSettingsRequest
import org.sisioh.aws4s.PimpedType

object DescribeConfigurationSettingsRequestFactory {

  def create(): DescribeConfigurationSettingsRequest = new DescribeConfigurationSettingsRequest()

  def create(applicationName: String): DescribeConfigurationSettingsRequest = new DescribeConfigurationSettingsRequest(applicationName)

}

class RichDescribeConfigurationSettingsRequest(val underlying: DescribeConfigurationSettingsRequest)
  extends AnyVal with PimpedType[DescribeConfigurationSettingsRequest] {

  def applicationNameOpt: Option[String] = Option(underlying.getApplicationName)

  def applicationNameOpt_=(value: Option[String]): Unit =
    underlying.setApplicationName(value.orNull)

  def withApplicationNameOpt(value: Option[String]): DescribeConfigurationSettingsRequest =
    underlying.withApplicationName(value.orNull)

  // ---

  def templateNameOpt: Option[String] = Option(underlying.getTemplateName)

  def templateNameOpt_=(value: Option[String]): Unit =
    underlying.setTemplateName(value.orNull)

  def withTemplateNameOpt(value: Option[String]): DescribeConfigurationSettingsRequest =
    underlying.withTemplateName(value.orNull)

  // ---

  def environmentNameOpt: Option[String] = Option(underlying.getEnvironmentName)

  def environmentNameOpt_=(value: Option[String]): Unit =
    underlying.setEnvironmentName(value.orNull)

  def withEnvironmentNameOpt(value: Option[String]): DescribeConfigurationSettingsRequest =
    underlying.withEnvironmentName(value.orNull)

}
