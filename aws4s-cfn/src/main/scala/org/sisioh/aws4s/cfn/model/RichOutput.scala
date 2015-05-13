package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model.Output
import org.sisioh.aws4s.PimpedType

object OutputFactory {

  def create(): Output = new Output()

}

class RichOutput(val underlying: Output)
  extends AnyVal with PimpedType[Output] {

  def outputKeyOpt: Option[String] = Option(underlying.getOutputKey)

  def outputKeyOpt_=(value: Option[String]): Unit =
    underlying.setOutputKey(value.orNull)

  def withOutputKeyOpt(value: Option[String]): Output =
    underlying.withOutputKey(value.orNull)

  // ---

  def outputValueOpt: Option[String] = Option(underlying.getOutputValue)

  def outputValueOpt_=(value: Option[String]): Unit =
    underlying.setOutputValue(value.orNull)

  def withOutputValueOpt(value: Option[String]): Output =
    underlying.withOutputValue(value.orNull)

  // ---

  def descriptionOpt: Option[String] = Option(underlying.getDescription)

  def descriptionOpt_=(value: Option[String]): Unit =
    underlying.setDescription(value.orNull)

  def withDescriptionOpt(value: Option[String]): Output =
    underlying.withDescription(value.orNull)

}
