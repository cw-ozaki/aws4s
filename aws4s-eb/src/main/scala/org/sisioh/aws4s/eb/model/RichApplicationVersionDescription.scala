package org.sisioh.aws4s.eb.model

import java.util.Date

import com.amazonaws.services.elasticbeanstalk.model.{ ApplicationVersionDescription, S3Location }
import org.sisioh.aws4s.PimpedType

object ApplicationVersionDescriptionFactory {

  def create() = new ApplicationVersionDescription()

}

class RichApplicationVersionDescription(val underlying: ApplicationVersionDescription)
    extends AnyVal with PimpedType[ApplicationVersionDescription] {

  def applicationNameOpt: Option[String] = Option(underlying.getApplicationName)

  def applicationNameOpt_=(value: Option[String]): Unit =
    underlying.setApplicationName(value.orNull)

  def withApplicationNameOpt(value: Option[String]): ApplicationVersionDescription =
    underlying.withApplicationName(value.orNull)

  // ---

  def descriptionOpt: Option[String] = Option(underlying.getDescription)

  def descriptionOpt_=(value: Option[String]): Unit =
    underlying.setDescription(value.orNull)

  def withDescriptionOpt(value: Option[String]): ApplicationVersionDescription =
    underlying.withDescription(value.orNull)

  // ---

  def versionLabelOpt: Option[String] = Option(underlying.getVersionLabel)

  def versionLabelOpt_=(value: Option[String]): Unit =
    underlying.setVersionLabel(value.orNull)

  def withVersionLabelOpt(value: Option[String]): ApplicationVersionDescription =
    underlying.withVersionLabel(value.orNull)

  // ---

  def sourceBundleOpt: Option[S3Location] = Option(underlying.getSourceBundle)

  def sourceBundleOpt_=(value: Option[S3Location]): Unit =
    underlying.setSourceBundle(value.orNull)

  def withSourceBundleOpt(value: Option[S3Location]): ApplicationVersionDescription =
    underlying.withSourceBundle(value.orNull)

  // ---

  def dateCreatedOpt: Option[Date] = Option(underlying.getDateCreated)

  def dateCreatedOpt_=(value: Option[Date]): Unit =
    underlying.setDateCreated(value.orNull)

  def withDateCreateOpt(value: Option[Date]): ApplicationVersionDescription =
    underlying.withDateCreated(value.orNull)

  // ---

  def dateUpdatedOpt: Option[Date] = Option(underlying.getDateUpdated)

  def dateUpdatedOpt_=(value: Option[Date]): Unit =
    underlying.setDateUpdated(value.orNull)

  def withDateUpdatedOpt(value: Option[Date]): ApplicationVersionDescription =
    underlying.withDateUpdated(value.orNull)

}
