package org.sisioh.aws4s.sts.model

import com.amazonaws.services.securitytoken.model.{ FederatedUser, Credentials, GetFederationTokenResult, AssumeRoleWithSAMLResult }
import org.sisioh.aws4s.PimpedType

class RichGetFederationTokenResult(val underlying: GetFederationTokenResult)
    extends AnyVal
    with PimpedType[GetFederationTokenResult] {

  def credentialsOpt: Option[Credentials] =
    Option(underlying.getCredentials)

  def withCredentials(credentials: Option[Credentials]): GetFederationTokenResult =
    underlying.withCredentials(credentials.orNull)

  def federatedUserOpt: Option[FederatedUser] =
    Option(underlying.getFederatedUser)

  def withFederatedUser(federatedUser: Option[FederatedUser]): GetFederationTokenResult =
    underlying.withFederatedUser(federatedUser.orNull)

  def packedPolicySizeOpt: Option[Int] =
    Option(underlying.getPackedPolicySize)

  def withPackedPolicySize(packedPolicySize: Option[Int]): GetFederationTokenResult =
    underlying.withPackedPolicySize(packedPolicySize.map(_.asInstanceOf[Integer]).orNull)

}
