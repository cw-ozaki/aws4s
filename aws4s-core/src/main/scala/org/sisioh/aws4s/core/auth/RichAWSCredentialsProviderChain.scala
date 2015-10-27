package org.sisioh.aws4s.core.auth

import com.amazonaws.auth.{ AWSCredentials, AWSCredentialsProvider, AWSCredentialsProviderChain }
import org.sisioh.aws4s.PimpedType

object AWSCredentialsProviderChainFactory {

  def createCredentialsProviders(providers: AWSCredentialsProvider*): AWSCredentialsProviderChain = new AWSCredentialsProviderChain(providers: _*)

}

class RichAWSCredentialsProviderChain(val underlying: AWSCredentialsProviderChain)
    extends AnyVal with PimpedType[AWSCredentialsProviderChain] {

  def credentials: AWSCredentials = underlying.getCredentials()

  def reuseLastProvider: Boolean = underlying.getReuseLastProvider

  def refresh = underlying.refresh()

  def setReuseLastProvider(b: Boolean) = underlying.setReuseLastProvider(b)
}

