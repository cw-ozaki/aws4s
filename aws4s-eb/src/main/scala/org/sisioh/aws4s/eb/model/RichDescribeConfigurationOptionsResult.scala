package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model._
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object DescribeConfigurationOptionsResultFactory {

  def create(): DescribeConfigurationOptionsResult = new DescribeConfigurationOptionsResult()

}

class RichDescribeConfigurationOptionsResult(val underlying: DescribeConfigurationOptionsResult)
  extends AnyVal with PimpedType[DescribeConfigurationOptionsResult] {

  def solutionStackNameOpt: Option[String] = Option(underlying.getSolutionStackName)

  def solutionStackNameOpt_=(value: Option[String]): Unit =
    underlying.setSolutionStackName(value.orNull)

  def withSolutionStackNameOpt(value: Option[String]): DescribeConfigurationOptionsResult =
    underlying.withSolutionStackName(value.orNull)

  // ---

  def options: Seq[ConfigurationOptionDescription] = underlying.getOptions.asScala.toVector

  def options_=(value: Seq[ConfigurationOptionDescription]): Unit =
    underlying.setOptions(value.asJava)

  def withOptions(value: Seq[ConfigurationOptionDescription]): DescribeConfigurationOptionsResult =
    underlying.withOptions(value.asJava)

}
