package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.SourceConfiguration
import org.sisioh.aws4s.PimpedType

class RichSourceConfiguration(val underlying: SourceConfiguration)
  extends AnyVal with PimpedType[SourceConfiguration] {

  def applicationNameOpt: Option[String] = Option(underlying.getApplicationName)

  def applicationNameOpt_=(value: Option[String]): Unit =
    underlying.setApplicationName(value.orNull)

  def withApplicationNameOpt(value: Option[String]): SourceConfiguration =
    underlying.withApplicationName(value.orNull)

  // ---

  def templateNameOpt: Option[String] = Option(underlying.getTemplateName)

  def templateNameOpt_=(value: Option[String]): Unit =
    underlying.setTemplateName(value.orNull)

  def withTemplateNameOpt(value: Option[String]): SourceConfiguration =
    underlying.withTemplateName(value.orNull)

}
