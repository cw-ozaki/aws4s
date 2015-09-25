package org.sisioh.aws4s.sts.model

import com.amazonaws.services.securitytoken.model.{ Credentials, GetSessionTokenResult, GetFederationTokenResult }
import org.sisioh.aws4s.PimpedType

class RichGetSessionTokenResult(val underlying: GetSessionTokenResult)
    extends AnyVal
    with PimpedType[GetSessionTokenResult] {

  def credentialsOpt: Option[Credentials] =
    Option(underlying.getCredentials)

  def withCredentials(credentials: Option[Credentials]): GetSessionTokenResult =
    underlying.withCredentials(credentials.orNull)

}
