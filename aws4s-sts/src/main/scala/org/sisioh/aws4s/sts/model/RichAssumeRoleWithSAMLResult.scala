package org.sisioh.aws4s.sts.model

import com.amazonaws.services.securitytoken.model.{ AssumedRoleUser, Credentials, AssumeRoleWithSAMLResult }
import org.sisioh.aws4s.PimpedType

class RichAssumeRoleWithSAMLResult(val underlying: AssumeRoleWithSAMLResult)
    extends AnyVal with PimpedType[AssumeRoleWithSAMLResult] {

  def credentialsOpt: Option[Credentials] =
    Option(underlying.getCredentials)

  def withCredentials(credentials: Option[Credentials]): AssumeRoleWithSAMLResult =
    underlying.withCredentials(credentials.orNull)

  def assumedRoleUserOpt: Option[AssumedRoleUser] =
    Option(underlying.getAssumedRoleUser)

  def withAssumedRoleUser(assumedRoleUser: Option[AssumedRoleUser]): AssumeRoleWithSAMLResult =
    underlying.withAssumedRoleUser(assumedRoleUser.orNull)

  def packedPolicySizeOpt: Option[Int] =
    Option(underlying.getPackedPolicySize)

  def withPackedPolicySize(packedPolicySize: Option[Int]): AssumeRoleWithSAMLResult =
    underlying.withPackedPolicySize(packedPolicySize.map(_.asInstanceOf[Integer]).orNull)

  def subjectOpt: Option[String] =
    Option(underlying.getSubject)

  def withSubject(subject: Option[String]): AssumeRoleWithSAMLResult =
    underlying.withSubject(subject.orNull)

  def subjectTypeOpt: Option[String] =
    Option(underlying.getSubjectType)

  def withSubjectType(subjectType: Option[String]): AssumeRoleWithSAMLResult =
    underlying.withSubjectType(subjectType.orNull)

  def issuerOpt: Option[String] =
    Option(underlying.getIssuer)

  def withIssuer(issuer: Option[String]): AssumeRoleWithSAMLResult =
    underlying.withIssuer(issuer.orNull)

  def audienceOpt: Option[String] =
    Option(underlying.getAudience)

  def withAudience(audience: Option[String]): AssumeRoleWithSAMLResult =
    underlying.withAudience(audience.orNull)

  def nameQualifierOpt: Option[String] =
    Option(underlying.getNameQualifier)

  def withNameQualifier(nameQualifier: Option[String]): AssumeRoleWithSAMLResult =
    underlying.withNameQualifier(nameQualifier.orNull)

}
