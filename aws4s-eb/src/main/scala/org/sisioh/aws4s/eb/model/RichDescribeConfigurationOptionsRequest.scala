package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.{ OptionSpecification, DescribeConfigurationOptionsRequest }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object DescribeConfigurationOptionsRequestFactory {

  def create(): DescribeConfigurationOptionsRequest = new DescribeConfigurationOptionsRequest()

}

class RichDescribeConfigurationOptionsRequest(val underlying: DescribeConfigurationOptionsRequest)
    extends AnyVal with PimpedType[DescribeConfigurationOptionsRequest] {

  def applicationNameOpt: Option[String] = Option(underlying.getApplicationName)

  def applicationNameOpt_=(value: Option[String]): Unit =
    underlying.setApplicationName(value.orNull)

  def withApplicationNameOpt(value: Option[String]): DescribeConfigurationOptionsRequest =
    underlying.withApplicationName(value.orNull)

  // ---

  def templateNameOpt: Option[String] = Option(underlying.getTemplateName)

  def templateNameOpt_=(value: Option[String]): Unit =
    underlying.setTemplateName(value.orNull)

  def withTemplateNameOpt(value: Option[String]): DescribeConfigurationOptionsRequest =
    underlying.withTemplateName(value.orNull)

  // ---

  def environmentNameOpt: Option[String] = Option(underlying.getEnvironmentName)

  def environmentNameOpt_=(value: Option[String]): Unit =
    underlying.setEnvironmentName(value.orNull)

  def withEnvironmentNameOpt(value: Option[String]): DescribeConfigurationOptionsRequest =
    underlying.withEnvironmentName(value.orNull)

  // ---

  def solutionStackNameOpt: Option[String] = Option(underlying.getSolutionStackName)

  def solutionStackNameOpt_=(value: Option[String]): Unit =
    underlying.setSolutionStackName(value.orNull)

  def withSolutionStackNameOpt(value: Option[String]): DescribeConfigurationOptionsRequest =
    underlying.withSolutionStackName(value.orNull)

  // ---

  def options: Seq[OptionSpecification] = underlying.getOptions.asScala.toVector

  def options_=(value: Seq[OptionSpecification]): Unit =
    underlying.setOptions(value.asJava)

  def withOptions(value: Seq[OptionSpecification]): DescribeConfigurationOptionsRequest =
    underlying.withOptions(value.asJava)

}
