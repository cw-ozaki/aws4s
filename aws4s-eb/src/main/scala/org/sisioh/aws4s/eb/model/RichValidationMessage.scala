package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.ValidationMessage
import org.sisioh.aws4s.PimpedType

object ValidationMessageFactory {

  def create(): ValidationMessage = new ValidationMessage()

}

class RichValidationMessage(val underlying: ValidationMessage)
  extends AnyVal with PimpedType[ValidationMessage] {

  def messageOpt = Option(underlying.getMessage)

  // ---

  def severityOpt: Option[String] = Option(underlying.getSeverity)

  def severityOpt_=(value: Option[String]): Unit =
    underlying.setSeverity(value.orNull)

  def withSeverityOpt(value: Option[String]): ValidationMessage =
    underlying.withSeverity(value.orNull)

  // ---

  def namespaceOpt: Option[String] = Option(underlying.getNamespace)

  def namespaceOpt_=(value: Option[String]): Unit =
    underlying.setNamespace(value.orNull)

  def withNamespaceOpt(value: Option[String]): ValidationMessage =
    underlying.withNamespace(value.orNull)

  // ---

  def optionNameOpt = Option(underlying.getOptionName)

  def optionNameOpt_=(value: Option[String]): Unit =
    underlying.setOptionName(value.orNull)

  def withOptionNameOpt(value: Option[String]): ValidationMessage =
    underlying.withOptionName(value.orNull)

}
