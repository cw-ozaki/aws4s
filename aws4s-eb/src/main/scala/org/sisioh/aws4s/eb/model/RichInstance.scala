package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.Instance
import org.sisioh.aws4s.PimpedType

object InstanceFactory {

  def create(): Instance = new Instance()

}

class RichInstance(val underlying: Instance)
    extends AnyVal with PimpedType[Instance] {

  def idOpt: Option[String] = Option(underlying.getId)

  def idOpt_=(value: Option[String]): Unit =
    underlying.setId(value.orNull)

  def withIdOpt(value: Option[String]): Instance =
    underlying.withId(value.orNull)

}
