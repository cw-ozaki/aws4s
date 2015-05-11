package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.{ApplicationDescription, CreateApplicationResult}
import org.sisioh.aws4s.PimpedType

object CreateApplicationResultFactory {

  def create(): CreateApplicationResult = new CreateApplicationResult()

}

class RichCreateApplicationResult(val underlying: CreateApplicationResult)
  extends AnyVal with PimpedType[CreateApplicationResult] {

  def applicationOpt: Option[ApplicationDescription] = Option(underlying.getApplication)

  def applicationOpt_=(value: Option[ApplicationDescription]): Unit =
    underlying.setApplication(value.orNull)

  def withApplicationOpt(value: Option[ApplicationDescription]): CreateApplicationResult =
    underlying.withApplication(value.orNull)

}
