package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.DeleteEnvironmentConfigurationRequest
import org.sisioh.aws4s.PimpedType

class RichDeleteEnvironmentConfigurationRequest(val underlying: DeleteEnvironmentConfigurationRequest)
  extends AnyVal with PimpedType[DeleteEnvironmentConfigurationRequest] {

  def applicationNameOpt: Option[String] = Option(underlying.getApplicationName)

  def applicationNameOpt_=(value: Option[String]): Unit =
    underlying.setApplicationName(value.orNull)

  def withApplicationNameOpt(value: Option[String]): DeleteEnvironmentConfigurationRequest =
    underlying.withApplicationName(value.orNull)

  // ---

  def environmentNameOpt: Option[String] = Option(underlying.getEnvironmentName)

  def environmentNameOpt_=(value: Option[String]): Unit =
    underlying.setEnvironmentName(value.orNull)

  def withEnvironmentNameOpt(value: Option[String]): DeleteEnvironmentConfigurationRequest =
    underlying.withEnvironmentName(value.orNull)

}
