package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.RestartAppServerRequest
import org.sisioh.aws4s.PimpedType

class RichRestartAppServerRequest(val underlying: RestartAppServerRequest)
  extends AnyVal with PimpedType[RestartAppServerRequest] {

  def environmentIdOpt: Option[String] = Option(underlying.getEnvironmentId)

  def environmentIdOpt_=(value: Option[String]): Unit = underlying.setEnvironmentId(value.orNull)

  def withEnvironmentIdOpt(value: Option[String]): RestartAppServerRequest =
    underlying.withEnvironmentId(value.orNull)

  // ---

  def environmentNameOpt: Option[String] = Option(underlying.getEnvironmentName)

  def environmentNameOpt_=(value: Option[String]): Unit =
    underlying.setEnvironmentName(value.orNull)

  def withEnvironmentNameOpt(value: Option[String]): RestartAppServerRequest =
    underlying.withEnvironmentName(value.orNull)

}
