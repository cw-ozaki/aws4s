package org.sisioh.aws4s.sts.model

import com.amazonaws.services.securitytoken.model.{ DecodeAuthorizationMessageResult, DecodeAuthorizationMessageRequest }
import org.sisioh.aws4s.PimpedType

class RichDecodeAuthorizationMessageResult(val underlying: DecodeAuthorizationMessageResult)
    extends AnyVal
    with PimpedType[DecodeAuthorizationMessageResult] {

  def decodedMessageOpt: Option[String] =
    Option(underlying.getDecodedMessage)

  def withDecodedMessage(decodedMessage: Option[String]): DecodeAuthorizationMessageResult =
    underlying.withDecodedMessage(decodedMessage.orNull)

}
