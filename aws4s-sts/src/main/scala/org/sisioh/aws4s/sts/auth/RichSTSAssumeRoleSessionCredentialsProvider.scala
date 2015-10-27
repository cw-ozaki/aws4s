package org.sisioh.aws4s.sts.auth

import com.amazonaws.auth.{ AWSSessionCredentials, STSAssumeRoleSessionCredentialsProvider }
import org.sisioh.aws4s.PimpedType

class RichSTSAssumeRoleSessionCredentialsProvider(val underlying: STSAssumeRoleSessionCredentialsProvider)
    extends AnyVal with PimpedType[STSAssumeRoleSessionCredentialsProvider] {

  def credentials: AWSSessionCredentials = underlying.getCredentials()

  def refresh = underlying.refresh()

  def setSTSClientEndpoint(endpoint: String) = underlying.setSTSClientEndpoint(endpoint)
}

