package org.sisioh.aws4s.sts.model

import com.amazonaws.services.securitytoken.model.{AssumedRoleUser, Credentials, AssumeRoleResult}
import org.sisioh.aws4s.PimpedType

class RichAssumeRoleResult(val underlying: AssumeRoleResult)
    extends AnyVal with PimpedType[AssumeRoleResult] {

  def credentialsOpt: Option[Credentials] =
    Option(underlying.getCredentials)

  def withCredentials(credentials: Option[Credentials]): AssumeRoleResult =
    underlying.withCredentials(credentials.orNull)

  def assumedRoleUserOpt: Option[AssumedRoleUser] =
    Option(underlying.getAssumedRoleUser)

  def withAssumedRoleUser(assumedRoleUser: Option[AssumedRoleUser]): AssumeRoleResult =
    underlying.withAssumedRoleUser(assumedRoleUser.orNull)

  def packedPolicySizeOpt: Option[Int] =
    Option(underlying.getPackedPolicySize)

  def withPackedPolicySize(packedPolicySize: Option[Int]): AssumeRoleResult =
    underlying.withPackedPolicySize(packedPolicySize.map(_.asInstanceOf[java.lang.Integer]).orNull)

}
