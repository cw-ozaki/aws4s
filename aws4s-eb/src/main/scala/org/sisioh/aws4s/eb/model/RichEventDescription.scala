package org.sisioh.aws4s.eb.model

import java.util.Date

import com.amazonaws.services.elasticbeanstalk.model.EventDescription
import org.sisioh.aws4s.PimpedType

object EventDescriptionFactory {

  def create(): EventDescription = new EventDescription()

}

class RichEventDescription(val underlying: EventDescription)
    extends AnyVal with PimpedType[EventDescription] {

  def eventDateOpt: Option[Date] = Option(underlying.getEventDate)

  def eventDateOpt_=(value: Option[Date]): Unit =
    underlying.setEventDate(value.orNull)

  // ---

  def messageOpt: Option[String] = Option(underlying.getMessage)

  def messageOpt_=(value: Option[String]): Unit =
    underlying.withMessage(value.orNull)

  def withMessageOpt(value: Option[String]): EventDescription =
    underlying.withMessage(value.orNull)

  // ---

  def applicationNameOpt: Option[String] = Option(underlying.getApplicationName)

  def applicationNameOpt_=(value: Option[String]): Unit =
    underlying.setApplicationName(value.orNull)

  def withApplicationNameOpt(value: Option[String]): EventDescription =
    underlying.withApplicationName(value.orNull)

  // ---

  def versionLabelOpt: Option[String] = Option(underlying.getVersionLabel)

  def versionLabelOpt_=(value: Option[String]): Unit =
    underlying.setVersionLabel(value.orNull)

  def withVersionLabelOpt(value: Option[String]): EventDescription =
    underlying.withVersionLabel(value.orNull)

  // ---

  def templateNameOpt: Option[String] = Option(underlying.getTemplateName)

  def templateNameOpt_=(value: Option[String]): Unit =
    underlying.setTemplateName(value.orNull)

  def withTemplateNameOpt(value: Option[String]): EventDescription =
    underlying.withTemplateName(value.orNull)

  // ---

  def environmentNameOpt: Option[String] = Option(underlying.getEnvironmentName)

  def environmentNameOpt_=(value: Option[String]): Unit =
    underlying.setEnvironmentName(value.orNull)

  def withEnvironmentNameOpt(value: Option[String]): EventDescription =
    underlying.withEnvironmentName(value.orNull)

  // ---

  def requestIdOpt: Option[String] = Option(underlying.getRequestId)

  def requestIdOpt_=(value: Option[String]): Unit =
    underlying.setRequestId(value.orNull)

  def withRequestIdOpt(value: Option[String]): EventDescription =
    underlying.withRequestId(value.orNull)

  // ---

  def severityOpt: Option[String] = Option(underlying.getSeverity)

  def severityOpt_=(value: Option[String]): Unit =
    underlying.setSeverity(value.orNull)

  def withSeverityOpt(value: Option[String]): EventDescription =
    underlying.withSeverity(value.orNull)
}
