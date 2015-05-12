package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.TerminateEnvironmentRequest
import org.sisioh.aws4s.PimpedType

object TerminateEnvironmentRequestFactory {

  def create(): TerminateEnvironmentRequest = new TerminateEnvironmentRequest()

}

class RichTerminateEnvironmentRequest(val underlying: TerminateEnvironmentRequest)
    extends AnyVal with PimpedType[TerminateEnvironmentRequest] {

  def environmentIdOpt: Option[String] = Option(underlying.getEnvironmentId)

  def environmentIdOpt_=(value: Option[String]): Unit = underlying.setEnvironmentId(value.orNull)

  def withEnvironmentIdOpt(value: Option[String]): TerminateEnvironmentRequest =
    underlying.withEnvironmentId(value.orNull)

  // ---

  def environmentNameOpt: Option[String] = Option(underlying.getEnvironmentName)

  def environmentNameOpt_=(value: Option[String]): Unit =
    underlying.setEnvironmentName(value.orNull)

  def withEnvironmentNameOpt(value: Option[String]): TerminateEnvironmentRequest =
    underlying.withEnvironmentName(value.orNull)

  // ---

  def terminateResourcesOpt: Option[Boolean] = Option(underlying.getTerminateResources)

  def terminateResourcesOpt_=(value: Option[Boolean]): Unit =
    underlying.setTerminateResources(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  def withTerminateResourcesOpt(value: Option[Boolean]): TerminateEnvironmentRequest =
    underlying.withTerminateResources(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

}
