package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.ConfigurationOptionSetting
import org.sisioh.aws4s.PimpedType

object ConfigurationOptionSettingFactory {

  def create: ConfigurationOptionSetting = new ConfigurationOptionSetting()

}

class RichConfigurationOptionSetting(val underlying: ConfigurationOptionSetting)
  extends AnyVal with PimpedType[ConfigurationOptionSetting] {

  def namespaceOpt: Option[String] = Option(underlying.getNamespace)

  def namespaceOpt_=(value: Option[String]): Unit =
    underlying.setNamespace(value.orNull)

  def withNamespaceOpt(value: Option[String]): ConfigurationOptionSetting =
    underlying.withNamespace(value.orNull)

  // ---

  def optionalNameOpt: Option[String] = Option(underlying.getOptionName)

  def optionalNameOpt_=(value: Option[String]): Unit =
    underlying.setOptionName(value.orNull)

  def withOptionalNameOpt(value: Option[String]):ConfigurationOptionSetting =
    underlying.withOptionName(value.orNull)

  // ---

  def valueOpt: Option[String] = Option(underlying.getValue)

  def valueOpt_=(value: Option[String]): Unit =
    underlying.setValue(value.orNull)

  def withValueOpt(value: Option[String]): ConfigurationOptionSetting =
    underlying.withValue(value.orNull)

}
