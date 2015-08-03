package org.sisioh.aws4s.sts

import com.amazonaws._
import com.amazonaws.auth.{AWSCredentialsProvider, AWSCredentials}

import com.amazonaws.metrics.RequestMetricCollector
import com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClient
import com.amazonaws.services.securitytoken.model._

import org.sisioh.aws4s.PimpedType

import scala.util.Try

object AWSSecurityTokenServiceClientFactory {

  def create(): AWSSecurityTokenServiceClient = new AWSSecurityTokenServiceClient()

  def create(clientConfiguration: ClientConfiguration): AWSSecurityTokenServiceClient = new AWSSecurityTokenServiceClient(clientConfiguration)

  def create(awsCredentials: AWSCredentials): AWSSecurityTokenServiceClient = new AWSSecurityTokenServiceClient(awsCredentials)

  def create(awsCredentials: AWSCredentials, clientConfiguration: ClientConfiguration): AWSSecurityTokenServiceClient = new AWSSecurityTokenServiceClient(awsCredentials, clientConfiguration)

  def create(awsCredentialsProvider: AWSCredentialsProvider): AWSSecurityTokenServiceClient = new AWSSecurityTokenServiceClient(awsCredentialsProvider)

  def create(awsCredentialsProvider: AWSCredentialsProvider, clientConfiguration: ClientConfiguration): AWSSecurityTokenServiceClient =
    new AWSSecurityTokenServiceClient(awsCredentialsProvider, clientConfiguration)

  def create(awsCredentialsProvider: AWSCredentialsProvider, clientConfiguration: ClientConfiguration, requestMetricCollector: RequestMetricCollector): AWSSecurityTokenServiceClient =
    new AWSSecurityTokenServiceClient(awsCredentialsProvider, clientConfiguration, requestMetricCollector)

}

class RichAWSSecurityTokenServiceClient(val underlying: AWSSecurityTokenServiceClient)
    extends AnyVal with PimpedType[AWSSecurityTokenServiceClient] {

  def getSessionTokenAsTry(getSessionTokenRequest: GetSessionTokenRequest): Try[GetSessionTokenResult] = Try {
    underlying.getSessionToken(getSessionTokenRequest)
  }

  def decodeAuthorizationMessageAsTry(decodeAuthorizationMessageRequest: DecodeAuthorizationMessageRequest): Try[DecodeAuthorizationMessageResult] = Try {
    underlying.decodeAuthorizationMessage(decodeAuthorizationMessageRequest)
  }

  def assumeRoleWithSAMLAsTry(assumeRoleWithSAMLRequest: AssumeRoleWithSAMLRequest): Try[AssumeRoleWithSAMLResult] = Try {
    underlying.assumeRoleWithSAML(assumeRoleWithSAMLRequest)
  }

  def assumeRoleWithWebIdentityAsTry(assumeRoleWithWebIdentityRequest: AssumeRoleWithWebIdentityRequest): Try[AssumeRoleWithWebIdentityResult] = Try {
    underlying.assumeRoleWithWebIdentity(assumeRoleWithWebIdentityRequest)
  }

  def getFederationTokenAsTry(getFederationTokenRequest: GetFederationTokenRequest): Try[GetFederationTokenResult] = Try {
    underlying.getFederationToken(getFederationTokenRequest)
  }

  def assumeRoleAsTry(assumeRoleRequest: AssumeRoleRequest): Try[AssumeRoleResult] = Try {
    underlying.assumeRole(assumeRoleRequest)
  }

  def getSessionTokenAsTry: Try[GetSessionTokenResult] = Try {
    underlying.getSessionToken
  }

  def getCachedResponseMetadataAsTry(request: AmazonWebServiceRequest): Try[ResponseMetadata] = Try {
    underlying.getCachedResponseMetadata(request)
  }


}
