package org.sisioh.aws4s.core.auth

import com.amazonaws.auth.{AWSCredentials, AWSCredentialsProviderChain}
import org.sisioh.aws4s.PimpedType

class RichAWSCredentialsProviderChain(val underlying: AWSCredentialsProviderChain)
  extends AnyVal with PimpedType[AWSCredentialsProviderChain] {

  def credentials: AWSCredentials = underlying.getCredentials()

  def reuseLastProvider: Boolean = underlying.getReuseLastProvider

  def refresh = underlying.refresh()

  def setReuseLastProvider(b: Boolean) = underlying.setReuseLastProvider(b)
}

