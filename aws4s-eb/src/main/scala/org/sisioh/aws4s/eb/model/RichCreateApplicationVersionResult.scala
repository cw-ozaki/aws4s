package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.{ApplicationVersionDescription, CreateApplicationVersionResult}
import org.sisioh.aws4s.PimpedType

object CreateApplicationVersionResultFactory {

  def create(): CreateApplicationVersionResult = new CreateApplicationVersionResult()

}

class RichCreateApplicationVersionResult(val underlying: CreateApplicationVersionResult)
  extends AnyVal with PimpedType[CreateApplicationVersionResult] {

  def applicationVersionOpt: Option[ApplicationVersionDescription] = Option(underlying.getApplicationVersion)

  def applicationVersionOpt_=(value: Option[ApplicationVersionDescription]): Unit =
    underlying.setApplicationVersion(value.orNull)

  def withApplicationVersionOpt(value: Option[ApplicationVersionDescription]): CreateApplicationVersionResult =
    underlying.withApplicationVersion(value.orNull)

}
