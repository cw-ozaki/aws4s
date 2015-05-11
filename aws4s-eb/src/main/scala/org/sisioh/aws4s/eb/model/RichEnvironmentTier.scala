package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.EnvironmentTier
import org.sisioh.aws4s.PimpedType

class RichEnvironmentTier(val underlying: EnvironmentTier)
  extends AnyVal with PimpedType[EnvironmentTier] {

  def nameOpt = Option(underlying.getName)

  def typeOpt = Option(underlying.getType)

  def versionOpt = Option(underlying.getVersion)

}
