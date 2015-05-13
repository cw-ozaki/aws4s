package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model.Parameter
import org.sisioh.aws4s.PimpedType

object ParameterFactory {

  def create(): Parameter = new Parameter()

}

class RichParameter(val underlying: Parameter)
  extends AnyVal with PimpedType[Parameter] {

  def parameterKeyOpt: Option[String] = Option(underlying.getParameterKey)

  def parameterKeyOpt_=(value: Option[String]): Unit =
    underlying.setParameterKey(value.orNull)

  def withParameterKeyOpt(value: Option[String]): Parameter =
    underlying.withParameterKey(value.orNull)

  // ---

  def parameterValueOpt: Option[String] = Option(underlying.getParameterValue)

  def parameterValueOpt_=(value: Option[String]): Unit =
    underlying.setParameterValue(value.orNull)

  def withParameterValueOpt(value: Option[String]): Parameter =
    underlying.withParameterKey(value.orNull)

  // ---

  def usePreviousValueOpt: Option[Boolean] = Option(underlying.getUsePreviousValue)

  def usePreviousValueOpt_=(value: Option[Boolean]): Unit =
    underlying.setUsePreviousValue(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  def withUsePreviousValueOpt(value: Option[Boolean]): Parameter =
    underlying.withUsePreviousValue(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

}
