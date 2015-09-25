package org.sisioh.aws4s.sts.model

import com.amazonaws.services.securitytoken.model.{ DecodeAuthorizationMessageRequest, AssumeRoleWithSAMLResult }
import org.sisioh.aws4s.PimpedType

object DecodeAuthorizationMessageRequestFactory {

  def create: DecodeAuthorizationMessageRequest = new DecodeAuthorizationMessageRequest

}

class RichDecodeAuthorizationMessageRequest(val underlying: DecodeAuthorizationMessageRequest)
    extends AnyVal with PimpedType[DecodeAuthorizationMessageRequest] {

  def encodedMessageOpt: Option[String] =
    Option(underlying.getEncodedMessage)

  def withEncodedMessage(encodedMessage: Option[String]): DecodeAuthorizationMessageRequest =
    underlying.withEncodedMessage(encodedMessage.orNull)

}
