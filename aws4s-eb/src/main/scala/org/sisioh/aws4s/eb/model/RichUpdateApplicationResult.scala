package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.{ApplicationDescription, UpdateApplicationResult}
import org.sisioh.aws4s.PimpedType

class RichUpdateApplicationResult(val underlying: UpdateApplicationResult)
  extends AnyVal with PimpedType[UpdateApplicationResult] {

  def applicationOpt: Option[ApplicationDescription] = Option(underlying.getApplication)

  def applicationOpt_=(value: Option[ApplicationDescription]): Unit =
    underlying.setApplication(value.orNull)

  def withApplicationOpt(value: Option[ApplicationDescription]): UpdateApplicationResult =
    underlying.withApplication(value.orNull)

}
