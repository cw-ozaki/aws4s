package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.{LoadBalancer, LaunchConfiguration}
import org.sisioh.aws4s.PimpedType

class RichLaunchConfiguration(val underlying: LaunchConfiguration)
  extends AnyVal with PimpedType[LaunchConfiguration] {

  def nameOpt: Option[String] = Option(underlying.getName)

  def nameOpt_=(value: Option[String]): Unit =
    underlying.setName(value.orNull)

  def withNameOpt(value: Option[String]): LaunchConfiguration =
    underlying.withName(value.orNull)

}
