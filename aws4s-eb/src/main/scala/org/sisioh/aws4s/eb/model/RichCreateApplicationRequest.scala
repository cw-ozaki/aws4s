package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.CreateApplicationRequest
import org.sisioh.aws4s.PimpedType

object CreateApplicationRequestFactory {

  def create(): CreateApplicationRequest = new CreateApplicationRequest()

  def create(applicationName: String): CreateApplicationRequest = new CreateApplicationRequest(applicationName)

}

class RichCreateApplicationRequest(val underlying: CreateApplicationRequest)
    extends AnyVal with PimpedType[CreateApplicationRequest] {

  def applicationNameOpt: Option[String] = Option(underlying.getApplicationName)

  def applicationNameOpt_=(value: Option[String]): Unit =
    underlying.setApplicationName(value.orNull)

  def withApplicationNameOpt(value: Option[String]): CreateApplicationRequest =
    underlying.withApplicationName(value.orNull)

  // ---

  def descriptionOpt: Option[String] = Option(underlying.getDescription)

  def descriptionOpt_=(value: Option[String]): Unit =
    underlying.setDescription(value.orNull)

  def withDescriptionOpt(value: Option[String]): CreateApplicationRequest =
    underlying.withDescription(value.orNull)

}
