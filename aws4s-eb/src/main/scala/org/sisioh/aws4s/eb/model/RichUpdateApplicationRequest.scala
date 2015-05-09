package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationRequest
import org.sisioh.aws4s.PimpedType

class RichUpdateApplicationRequest(val underlying: UpdateApplicationRequest)
  extends AnyVal with PimpedType[UpdateApplicationRequest] {

  def applicationNameOpt: Option[String] = Option(underlying.getApplicationName)

  def applicationNameOpt_=(value: Option[String]): Unit =
    underlying.setApplicationName(value.orNull)

  def withApplicationNameOpt(value: Option[String]): UpdateApplicationRequest =
    underlying.withApplicationName(value.orNull)

  // ---

  def descriptionOpt: Option[String] = Option(underlying.getDescription)

  def descriptionOpt_=(value: Option[String]): Unit =
    underlying.setDescription(value.orNull)

  def withDescriptionOpt(value: Option[String]): UpdateApplicationRequest =
    underlying.withDescription(value.orNull)

}
