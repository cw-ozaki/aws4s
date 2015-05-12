package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.{ OptionRestrictionRegex, ConfigurationOptionDescription }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ConfigurationOptionDescriptionFactory {

  def create(): ConfigurationOptionDescription = new ConfigurationOptionDescription

}

class RichConfigurationOptionDescription(val underlying: ConfigurationOptionDescription)
    extends AnyVal with PimpedType[ConfigurationOptionDescription] {

  def namespaceOpt: Option[String] = Option(underlying.getNamespace)

  def namespaceOpt_=(value: Option[String]): Unit =
    underlying.setNamespace(value.orNull)

  def withNamespaceOpt(value: Option[String]): ConfigurationOptionDescription =
    underlying.withNamespace(value.orNull)

  // ---

  def nameOpt: Option[String] = Option(underlying.getName)

  def nameOpt_=(value: Option[String]): Unit =
    underlying.setName(value.orNull)

  def withNameOpt(value: Option[String]): ConfigurationOptionDescription =
    underlying.withName(value.orNull)

  // ---

  def defaultValueOpt: Option[String] = Option(underlying.getDefaultValue)

  def defaultValueOpt_=(value: Option[String]): Unit =
    underlying.setDefaultValue(value.orNull)

  def withDefaultValueOpt(value: Option[String]): ConfigurationOptionDescription =
    underlying.withDefaultValue(value.orNull)

  // ---

  def changeSeverityOpt: Option[String] = Option(underlying.getChangeSeverity)

  def changeSeverityOpt_=(value: Option[String]): Unit =
    underlying.setChangeSeverity(value.orNull)

  def withChangeSeverityOpt(value: Option[String]): ConfigurationOptionDescription =
    underlying.withChangeSeverity(value.orNull)

  // ---

  def userDefinedOpt: Option[Boolean] = Option(underlying.getUserDefined)

  def userDefinedOpt_=(value: Option[Boolean]): Unit =
    underlying.setUserDefined(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  def withUserDefinedOpt(value: Option[Boolean]): ConfigurationOptionDescription =
    underlying.withUserDefined(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  // ---

  def valueTypeOpt: Option[String] = Option(underlying.getValueType)

  def valueTypeOpt_=(value: Option[String]): Unit =
    underlying.setValueType(value.orNull)

  def withValueTypeOpt(value: Option[String]): ConfigurationOptionDescription =
    underlying.withValueType(value.orNull)

  // ---

  def valueOptions: Seq[String] = underlying.getValueOptions.asScala.toVector

  def valueOptions_=(value: Seq[String]): Unit =
    underlying.setValueOptions(value.asJava)

  def withValueOptions(value: Seq[String]): ConfigurationOptionDescription =
    underlying.withValueOptions(value.asJava)

  // ---

  def minValueOpt: Option[Int] = Option(underlying.getMinValue)

  def minValueOpt_=(value: Option[Int]): Unit =
    underlying.setMinValue(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  def withMinValueOpt(value: Option[Int]): ConfigurationOptionDescription =
    underlying.withMinValue(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  // ---

  def maxValueOpt: Option[Int] = Option(underlying.getMaxValue)

  def maxValueOpt_=(value: Option[Int]): Unit =
    underlying.setMaxValue(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  def withMaxValueOpt(value: Option[Int]): ConfigurationOptionDescription =
    underlying.withMaxValue(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  // ---

  def maxLengthOpt: Option[Int] = Option(underlying.getMaxLength)

  def maxLengthOpt_=(value: Option[Int]): Unit =
    underlying.setMaxLength(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  def withMaxLengthOpt(value: Option[Int]): ConfigurationOptionDescription =
    underlying.withMaxLength(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  // ---

  def regexOpt: Option[OptionRestrictionRegex] = Option(underlying.getRegex)

  def regexOpt_=(value: Option[OptionRestrictionRegex]): Unit =
    underlying.setRegex(value.orNull)

  def regexOpt(value: Option[OptionRestrictionRegex]): ConfigurationOptionDescription =
    underlying.withRegex(value.orNull)
}
