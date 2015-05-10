package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model.ParameterDeclaration
import org.sisioh.aws4s.PimpedType

class RichParameterDeclaration(val underlying: ParameterDeclaration)
  extends AnyVal with PimpedType[ParameterDeclaration] {

  def parameterKeyOpt: Option[String] = Option(underlying.getParameterKey)

  def parameterKeyOpt_=(value: Option[String]): Unit =
    underlying.setParameterKey(value.orNull)

  def withParameterKeyOpt(value: Option[String]): ParameterDeclaration =
    underlying.withParameterKey(value.orNull)

  // ---

  def defaultValueOpt: Option[String] = Option(underlying.getDefaultValue)

  def defaultValueOpt_=(value: Option[String]): Unit =
    underlying.setDefaultValue(value.orNull)

  def withDefaultValueOpt(value: Option[String]): ParameterDeclaration =
    underlying.withDefaultValue(value.orNull)

  // ---

  def parameterTypeOpt = Option(underlying.getParameterType)

  def parameterTypeOpt_=(value: Option[String]): Unit =
    underlying.setParameterType(value.orNull)

  def withParameterTypeOpt(value: Option[String]): ParameterDeclaration =
    underlying.withParameterType(value.orNull)

  // ---

  def noEchoOpt: Option[Boolean] = Option(underlying.getNoEcho)

  def noEchoOpt_=(value: Option[Boolean]): Unit =
    underlying.setNoEcho(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  def withNoEchoOpt(value: Option[Boolean]): ParameterDeclaration =
    underlying.withNoEcho(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  // ---

  def descriptionOpt: Option[String] = Option(underlying.getDescription)

  def descriptionOpt_=(value: Option[String]): Unit =
    underlying.setDescription(value.orNull)

  def withDescriptionOpt(value: Option[String]): ParameterDeclaration =
    underlying.withDescription(value.orNull)

}
