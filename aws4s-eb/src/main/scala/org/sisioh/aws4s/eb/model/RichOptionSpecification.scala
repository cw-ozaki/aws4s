package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.OptionSpecification
import org.sisioh.aws4s.PimpedType

object OptionSpecificationFactory {

  def create(): OptionSpecification = new OptionSpecification()

}

class RichOptionSpecification(val underlying: OptionSpecification)
    extends AnyVal with PimpedType[OptionSpecification] {

  def namespaceOpt: Option[String] = Option(underlying.getNamespace)

  def namespaceOpt_=(value: Option[String]): Unit =
    underlying.setNamespace(value.orNull)

  def withNamespaceOpt(value: Option[String]): OptionSpecification =
    underlying.withNamespace(value.orNull)

  // ---

  def optionNameOpt = Option(underlying.getOptionName)

  def optionNameOpt_=(value: Option[String]): Unit =
    underlying.setOptionName(value.orNull)

  def withOptionNameOpt(value: Option[String]): OptionSpecification =
    underlying.withOptionName(value.orNull)

}
