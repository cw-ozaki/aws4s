package org.sisioh.aws4s.sts

import com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClient
import com.amazonaws.services.securitytoken.model._
import org.sisioh.aws4s.sts.model._

object Implicits extends Implicits

trait Implicits extends ModelImplicits {

  implicit def richAmazonSQSClient(underlying: AWSSecurityTokenServiceClient): RichAWSSecurityTokenServiceClient = new RichAWSSecurityTokenServiceClient(underlying)

}

trait ModelImplicits {

  implicit def richAssumeRoleRequest(underlying: AssumeRoleRequest): RichAssumeRoleRequest = new RichAssumeRoleRequest(underlying)

  implicit def richAssumeRoleResult(underlying: AssumeRoleResult): RichAssumeRoleResult = new RichAssumeRoleResult(underlying)

  implicit def richAssumeRoleWithSAMLRequest(underlying: AssumeRoleWithSAMLRequest): RichAssumeRoleWithSAMLRequest = new RichAssumeRoleWithSAMLRequest(underlying)

  implicit def richAssumeRoleWithSAMLResult(underlying: AssumeRoleWithSAMLResult): RichAssumeRoleWithSAMLResult = new RichAssumeRoleWithSAMLResult(underlying)

  implicit def richCredentials(underlying: Credentials): RichCredentials = new RichCredentials(underlying)

  implicit def richDecodeAuthorizationMessageRequest(underlying: DecodeAuthorizationMessageRequest): RichDecodeAuthorizationMessageRequest = new RichDecodeAuthorizationMessageRequest(underlying)

  implicit def richDecodeAuthorizationMessageResult(underlying: DecodeAuthorizationMessageResult): RichDecodeAuthorizationMessageResult = new RichDecodeAuthorizationMessageResult(underlying)

  implicit def richRichFederatedUser(underlying: FederatedUser): RichFederatedUser = new RichFederatedUser(underlying)

  implicit def richGetFederationTokenRequest(underlying: GetFederationTokenRequest): RichGetFederationTokenRequest = new RichGetFederationTokenRequest(underlying)

  implicit def richGetFederationTokenResult(underlying: GetFederationTokenResult): RichGetFederationTokenResult = new RichGetFederationTokenResult(underlying)

}
