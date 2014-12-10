package org.sisioh.aws4s.core.auth

import com.amazonaws.auth._
import com.amazonaws.auth.profile.ProfileCredentialsProvider
import com.amazonaws.internal.StaticCredentialsProvider
import org.sisioh.aws4s.PimpedType

object AWSCredentialsProviderFactory {

  def createDefaultProviderChain: DefaultAWSCredentialsProviderChain = new DefaultAWSCredentialsProviderChain()

  def createEnvironmentVariableProvider: EnvironmentVariableCredentialsProvider = new EnvironmentVariableCredentialsProvider()

  def createInstanceProfileProvider: InstanceProfileCredentialsProvider = new InstanceProfileCredentialsProvider()

  def createInstanceProfileProvider(refreshCredentialsAsync: Boolean): InstanceProfileCredentialsProvider = new InstanceProfileCredentialsProvider(refreshCredentialsAsync)

  def createStaticProvider(credentials: AWSCredentials): StaticCredentialsProvider = new StaticCredentialsProvider(credentials)

  def createSystemPropertiesProvider(): SystemPropertiesCredentialsProvider = new SystemPropertiesCredentialsProvider()

  def createClasspathPropertiesFileProvider(): ClasspathPropertiesFileCredentialsProvider = new ClasspathPropertiesFileCredentialsProvider()

  def createClasspathPropertiesFileProvider(credentialsFilePath: String): ClasspathPropertiesFileCredentialsProvider = new ClasspathPropertiesFileCredentialsProvider(credentialsFilePath)

  def createProfileProvider: ProfileCredentialsProvider = new ProfileCredentialsProvider()

  def createProfileProvider(profileName: String): ProfileCredentialsProvider = new ProfileCredentialsProvider(profileName)

  def createProfileProvider(profilesConfigFilePath: String, profileName: String): ProfileCredentialsProvider =
    new ProfileCredentialsProvider(profilesConfigFilePath, profileName)

}

class RichAWSCredentialsProvider(val underlying: AWSCredentialsProvider) extends AnyVal with PimpedType[AWSCredentialsProvider] {
  def credentials: AWSCredentials = underlying.getCredentials
}
