package org.sisioh.aws4s.eb.model

import java.util.Date

import com.amazonaws.services.elasticbeanstalk.model.ApplicationDescription
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object RichApplicationDescriptionFactory {

  def create(): ApplicationDescription = new ApplicationDescription()

}

class RichApplicationDescription(val underlying: ApplicationDescription)
    extends AnyVal with PimpedType[ApplicationDescription] {

  def applicationNameOpt: Option[String] = Option(underlying.getApplicationName)

  def applicationNameOpt_=(value: Option[String]): Unit =
    underlying.setApplicationName(value.orNull)

  def withApplicationNameOpt(value: Option[String]): ApplicationDescription =
    underlying.withApplicationName(value.orNull)

  // ---

  def descriptionOpt: Option[String] = Option(underlying.getDescription)

  def descriptionOpt_=(value: Option[String]): Unit =
    underlying.setDescription(value.orNull)

  def withDescriptionOpt(value: Option[String]): ApplicationDescription =
    underlying.withDescription(value.orNull)

  // ---

  def dateCreatedOpt: Option[Date] = Option(underlying.getDateCreated)

  def dateCreatedOpt_=(value: Option[Date]): Unit =
    underlying.setDateCreated(value.orNull)

  def withDateCreateOpt(value: Option[Date]): ApplicationDescription =
    underlying.withDateCreated(value.orNull)

  // ---

  def dateUpdatedOpt: Option[Date] = Option(underlying.getDateUpdated)

  def dateUpdatedOpt_=(value: Option[Date]): Unit =
    underlying.setDateUpdated(value.orNull)

  def withDateUpdatedOpt(value: Option[Date]): ApplicationDescription =
    underlying.withDateUpdated(value.orNull)

  // ---

  def versions: Seq[String] = underlying.getVersions.asScala.toVector

  def versions_=(value: Seq[String]): Unit =
    underlying.setVersions(value.asJava)

  def withVersion(versions: Seq[String]): ApplicationDescription =
    underlying.withVersions(versions.asJava)

  // ---

  def configurationTemplates: Seq[String] =
    underlying.getConfigurationTemplates.asScala.toVector

  def configurationTemplates_=(value: Seq[String]): Unit =
    underlying.setConfigurationTemplates(value.asJava)

  def configurationTemplates(value: Seq[String]): ApplicationDescription =
    underlying.withConfigurationTemplates(value.asJava)

}
