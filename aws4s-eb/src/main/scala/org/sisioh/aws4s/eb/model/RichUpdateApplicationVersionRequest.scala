package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationVersionRequest
import org.sisioh.aws4s.PimpedType

object UpdateApplicationVersionRequestFactory {

  def create(): UpdateApplicationVersionRequest = new UpdateApplicationVersionRequest()

  def create(applicationName: String, versionLabel: String): UpdateApplicationVersionRequest =
    new UpdateApplicationVersionRequest(applicationName, versionLabel)

}

class RichUpdateApplicationVersionRequest(val underlying: UpdateApplicationVersionRequest)
    extends AnyVal with PimpedType[UpdateApplicationVersionRequest] {

  def applicationNameOpt: Option[String] = Option(underlying.getApplicationName)

  def applicationNameOpt_=(value: Option[String]): Unit =
    underlying.setApplicationName(value.orNull)

  def withApplicationNameOpt(value: Option[String]): UpdateApplicationVersionRequest =
    underlying.withApplicationName(value.orNull)

  // ---

  def versionLabelOpt: Option[String] = Option(underlying.getVersionLabel)

  def versionLabelOpt_=(value: Option[String]): Unit =
    underlying.setVersionLabel(value.orNull)

  def withVersionLabelOpt(value: Option[String]): UpdateApplicationVersionRequest =
    underlying.withVersionLabel(value.orNull)

  // ---

  def descriptionOpt: Option[String] = Option(underlying.getDescription)

  def descriptionOpt_=(value: Option[String]): Unit =
    underlying.setDescription(value.orNull)

  def withDescriptionOpt(value: Option[String]): UpdateApplicationVersionRequest =
    underlying.withDescription(value.orNull)

}
