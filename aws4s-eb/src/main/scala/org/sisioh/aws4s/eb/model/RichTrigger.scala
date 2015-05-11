package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.Trigger
import org.sisioh.aws4s.PimpedType

class RichTrigger(val underlying: Trigger)
  extends AnyVal with PimpedType[Trigger] {

  def nameOpt: Option[String] = Option(underlying.getName)

  def nameOpt_=(value: Option[String]): Unit =
    underlying.setName(value.orNull)

  def withNameOpt(value: Option[String]): Trigger =
    underlying.withName(value.orNull)

}
