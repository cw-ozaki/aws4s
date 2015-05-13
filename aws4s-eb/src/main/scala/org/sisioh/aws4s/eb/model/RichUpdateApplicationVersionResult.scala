package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.{ApplicationVersionDescription, UpdateApplicationVersionResult}
import org.sisioh.aws4s.PimpedType

object UpdateApplicationVersionResultFactory {

  def create(): UpdateApplicationVersionResult = new UpdateApplicationVersionResult()

}

class RichUpdateApplicationVersionResult(val underlying: UpdateApplicationVersionResult)
    extends AnyVal with PimpedType[UpdateApplicationVersionResult] {

  def applicationVersionOpt: Option[ApplicationVersionDescription] = Option(underlying.getApplicationVersion)

  def applicationVersionOpt_=(value: Option[ApplicationVersionDescription]): Unit =
    underlying.setApplicationVersion(value.orNull)

  def withApplicationVersionOpt(value: Option[ApplicationVersionDescription]): UpdateApplicationVersionResult =
    underlying.withApplicationVersion(value.orNull)

}
