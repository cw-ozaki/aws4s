package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model.TemplateParameter
import org.sisioh.aws4s.PimpedType

object TemplateParameterFactory {

  def create(): TemplateParameter = new TemplateParameter()

}

class RichTemplateParameter(val underlying: TemplateParameter)
  extends AnyVal with PimpedType[TemplateParameter] {

  def parameterKeyOpt: Option[String] = Option(underlying.getParameterKey)

  def parameterKeyOpt_=(value: Option[String]): Unit =
    underlying.setParameterKey(value.orNull)

  def withParameterKeyOpt(value: Option[String]): TemplateParameter =
    underlying.withParameterKey(value.orNull)

  // ---

  def defaultValueOpt: Option[String] = Option(underlying.getDefaultValue)

  def defaultValueOpt_=(value: Option[String]): Unit =
    underlying.setDefaultValue(value.orNull)

  def withDefaultValueOpt(value: Option[String]): TemplateParameter =
    underlying.withDefaultValue(value.orNull)

  // ---

  def noEchoOpt: Option[Boolean] = Option(underlying.getNoEcho)

  def noEchoOpt_=(value: Option[Boolean]): Unit =
    underlying.setNoEcho(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  def withNoEchoOpt(value: Option[Boolean]): TemplateParameter =
    underlying.withNoEcho(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  // ---

  def descriptionOpt: Option[String] = Option(underlying.getDescription)

  def descriptionOpt_=(value: Option[String]): Unit =
    underlying.setDescription(value.orNull)

  def withDescriptionOpt(value: Option[String]): TemplateParameter =
    underlying.withDescription(value.orNull)

}
