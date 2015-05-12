package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.EnvironmentTier
import org.sisioh.aws4s.PimpedType

object EnvironmentTierFactory {

  def create(): EnvironmentTier = new EnvironmentTier()

}

class RichEnvironmentTier(val underlying: EnvironmentTier)
    extends AnyVal with PimpedType[EnvironmentTier] {

  def nameOpt = Option(underlying.getName)

  def nameOpt_=(value: Option[String]): Unit =
    underlying.setName(value.orNull)

  def withNameOpt(value: Option[String]): EnvironmentTier =
    underlying.withName(value.orNull)

  // ---

  def typeOpt: Option[String] = Option(underlying.getType)

  def typeOpt_=(value: Option[String]): Unit =
    underlying.setType(value.orNull)

  def withTypeOpt(value: Option[String]): EnvironmentTier =
    underlying.withType(value.orNull)

  // ---

  def versionOpt: Option[String] = Option(underlying.getVersion)

  def versionOpt_=(value: Option[String]): Unit =
    underlying.setVersion(value.orNull)

  def withVersionOpt(value: Option[String]): EnvironmentTier =
    underlying.withVersion(value.orNull)

}
