package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.{CreateApplicationVersionRequest, S3Location}
import org.sisioh.aws4s.PimpedType

object CreateApplicationVersionRequestFactory {

  def create(): CreateApplicationVersionRequest = new CreateApplicationVersionRequest()

}

class RichCreateApplicationVersionRequest(val underlying: CreateApplicationVersionRequest)
  extends AnyVal with PimpedType[CreateApplicationVersionRequest] {

  def applicationNameOpt: Option[String] = Option(underlying.getApplicationName)

  def applicationNameOpt_=(value: Option[String]): Unit =
    underlying.setApplicationName(value.orNull)

  def withApplicationNameOpt(value: Option[String]): CreateApplicationVersionRequest =
    underlying.withApplicationName(value.orNull)

  // ---

  def versionLabelOpt: Option[String] = Option(underlying.getVersionLabel)

  def versionLabelOpt_=(value: Option[String]): Unit =
    underlying.setVersionLabel(value.orNull)

  def withVersionLabelOpt(value: Option[String]): CreateApplicationVersionRequest =
    underlying.withVersionLabel(value.orNull)

  // ---

  def descriptionOpt: Option[String] = Option(underlying.getDescription)

  def descriptionOpt_=(value: Option[String]): Unit =
    underlying.setDescription(value.orNull)

  def withDescriptionOpt(value: Option[String]): CreateApplicationVersionRequest =
    underlying.withDescription(value.orNull)

  // ---

  def sourceBundleOpt: Option[S3Location] = Option(underlying.getSourceBundle)

  def sourceBundleOpt_=(value: Option[S3Location]): Unit =
    underlying.setSourceBundle(value.orNull)

  def withSourceBundleOpt(value: Option[S3Location]): CreateApplicationVersionRequest =
    underlying.withSourceBundle(value.orNull)

  // ---

  def autoCreateApplicationOpt: Option[Boolean] = Option(underlying.getAutoCreateApplication)

  def autoCreateApplicationOpt_=(value: Option[Boolean]): Unit =
    underlying.setAutoCreateApplication(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  def withAutoCreateApplicationOpt(value: Option[Boolean]): CreateApplicationVersionRequest =
    underlying.withAutoCreateApplication(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

}
