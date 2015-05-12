package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.CanonicalGrantee
import org.sisioh.aws4s.PimpedType

object CanonicalGranteeFactory {

  def create(identifier: String): CanonicalGrantee = new CanonicalGrantee(identifier)

}

class RichCanonicalGrantee(val underlying: CanonicalGrantee)
    extends AnyVal with PimpedType[CanonicalGrantee] {

  def typeIdentifier = underlying.getTypeIdentifier

  // ---

  def identifier: String = underlying.getIdentifier

  def identifier_=(value: String): Unit =
    underlying.setIdentifier(value)

  // ---

  def displayNameOpt: Option[String] = Option(underlying.getDisplayName)

  def displayNameOpt_=(value: Option[String]): Unit =
    underlying.setDisplayName(value.orNull)

}
