package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.EmailAddressGrantee
import org.sisioh.aws4s.PimpedType

object EmailAddressGranteeFactory {

  def create(emailAddress: String): EmailAddressGrantee = new EmailAddressGrantee(emailAddress)

}


class RichEmailAddressGrantee(val underlying: EmailAddressGrantee)
  extends AnyVal with PimpedType[EmailAddressGrantee] {

  def typeIdentifier = underlying.getTypeIdentifier

  // ---

  def identifierOpt: Option[String] = Option(underlying.getIdentifier)

  def identifierOpt_=(value: Option[String]): Unit =
    underlying.setIdentifier(value.orNull)

}
