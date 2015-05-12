package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.Owner
import org.sisioh.aws4s.PimpedType

class RichOwner(val underlying: Owner)
  extends AnyVal with PimpedType[Owner] {

  def idOpt: Option[String] = Option(underlying.getId)

  def idOpt_=(value: Option[String]): Unit =
    underlying.setId(value.orNull)

  // ---

  def displayNameOpt: Option[String] = Option(underlying.getDisplayName)

  def displayNameOpt_=(value: Option[String]): Unit =
    underlying.setDisplayName(value.orNull)

}
