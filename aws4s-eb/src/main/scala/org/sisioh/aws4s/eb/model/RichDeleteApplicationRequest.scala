package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationRequest
import org.sisioh.aws4s.PimpedType

class RichDeleteApplicationRequest(val underlying: DeleteApplicationRequest)
  extends AnyVal with PimpedType[DeleteApplicationRequest] {

  def applicationNameOpt: Option[String] = Option(underlying.getApplicationName)

  def applicationNameOpt_=(value: Option[String]): Unit =
    underlying.setApplicationName(value.orNull)

  def withApplicationNameOpt(value: Option[String]): DeleteApplicationRequest =
    underlying.withApplicationName(value.orNull)

  // ---

  def terminateEnvByForceOpt: Option[Boolean] = Option(underlying.getTerminateEnvByForce)

  def terminateEnvByForceOpt_=(value: Option[Boolean]): Unit =
    underlying.setTerminateEnvByForce(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  def withTerminateEnvByForceOpt_=(value: Option[Boolean]): DeleteApplicationRequest =
    underlying.withTerminateEnvByForce(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

}

