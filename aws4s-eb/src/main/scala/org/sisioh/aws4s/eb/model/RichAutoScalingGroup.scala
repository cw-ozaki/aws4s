package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.{ ConfigurationOptionDescription, AutoScalingGroup }
import org.sisioh.aws4s.PimpedType

object AutoScalingGroupFactory {

  def create(): AutoScalingGroup = new AutoScalingGroup()

}

class RichAutoScalingGroup(val underlying: AutoScalingGroup)
    extends AnyVal with PimpedType[AutoScalingGroup] {

  def nameOpt: Option[String] = Option(underlying.getName)

  def nameOpt_=(value: Option[String]): Unit =
    underlying.setName(value.orNull)

  def withNameOpt(value: Option[String]): AutoScalingGroup =
    underlying.withName(value.orNull)

}
