package org.sisioh.aws4s.sts.auth

import com.amazonaws.ClientConfiguration
import com.amazonaws.auth.{ AWSCredentials, AWSCredentialsProvider, AWSSessionCredentials, STSAssumeRoleSessionCredentialsProvider }
import org.sisioh.aws4s.PimpedType

object STSAssumeRoleSessionCredentialsProviderFactory {

  def createCredentialsProvider(longLivedCredentialsProvider: AWSCredentialsProvider, roleArn: String, roleSessionName: String) = new STSAssumeRoleSessionCredentialsProvider(longLivedCredentialsProvider, roleArn, roleSessionName)

  def createCredentialsProvider(longLivedCredentialsProvider: AWSCredentialsProvider, roleArn: String, roleSessionName: String, clientConfiguration: ClientConfiguration) = new STSAssumeRoleSessionCredentialsProvider(longLivedCredentialsProvider, roleArn, roleSessionName, clientConfiguration)

  def createCredentials(longLivedCredentials: AWSCredentials, roleArn: String, roleSessionName: String) = new STSAssumeRoleSessionCredentialsProvider(longLivedCredentials, roleArn, roleSessionName)

  def createCredentials(longLivedCredentials: AWSCredentials, roleArn: String, roleSessionName: String, clientConfiguration: ClientConfiguration) = new STSAssumeRoleSessionCredentialsProvider(longLivedCredentials, roleArn, roleSessionName, clientConfiguration)

  def createBasic(roleArn: String, roleSessionName: String): STSAssumeRoleSessionCredentialsProvider = new STSAssumeRoleSessionCredentialsProvider(roleArn, roleSessionName)

}

class RichSTSAssumeRoleSessionCredentialsProvider(val underlying: STSAssumeRoleSessionCredentialsProvider)
    extends AnyVal with PimpedType[STSAssumeRoleSessionCredentialsProvider] {

  def credentials: AWSSessionCredentials = underlying.getCredentials()

  def refresh = underlying.refresh()

  def setSTSClientEndpoint(endpoint: String) = underlying.setSTSClientEndpoint(endpoint)
}

