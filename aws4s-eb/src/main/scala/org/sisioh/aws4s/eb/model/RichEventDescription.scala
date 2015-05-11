package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.EventDescription
import org.sisioh.aws4s.PimpedType

object EventDescriptionFactory {

  def create(): EventDescription = new EventDescription()

}

class RichEventDescription(val underlying: EventDescription)
  extends AnyVal with PimpedType[EventDescription] {

  def eventDateOpt = Option(underlying.getEventDate)

  def messageOpt = Option(underlying.getMessage)

  def applicationNameOpt = Option(underlying.getApplicationName)

  def versionLabelOpt = Option(underlying.getVersionLabel)

  def templateNameOpt = Option(underlying.getTemplateName)

  def environmentNameOpt = Option(underlying.getEnvironmentName)

  def requestIdOpt = Option(underlying.getRequestId)

  def severityOpt = Option(underlying.getSeverity)

}
