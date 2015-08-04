package org.sisioh.aws4s.sts.model

import com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLRequest
import org.sisioh.aws4s.PimpedType

object AssumeRoleWithSAMLRequestFactory {

  def create: AssumeRoleWithSAMLRequest = new AssumeRoleWithSAMLRequest

}

class RichAssumeRoleWithSAMLRequest(val underlying: AssumeRoleWithSAMLRequest)
    extends AnyVal with PimpedType[AssumeRoleWithSAMLRequest] {

  def roleArnOpt: Option[String] =
    Option(underlying.getRoleArn)

  def withRoleArn(roleArn: Option[String]): AssumeRoleWithSAMLRequest =
    underlying.withRoleArn(roleArn.orNull)

  def principalArnOpt: Option[String] =
    Option(underlying.getPrincipalArn)

  def withPrincipalArn(principalArn: Option[String]): AssumeRoleWithSAMLRequest =
    underlying.withPrincipalArn(principalArn.orNull)

  def sAMLAssertionOpt: Option[String] =
    Option(underlying.getSAMLAssertion)

  def withSAMLAssertion(sAMLAssertion: Option[String]): AssumeRoleWithSAMLRequest =
    underlying.withSAMLAssertion(sAMLAssertion.orNull)

  def policyOpt: Option[String] =
    Option(underlying.getPolicy)

  def withPolicy(policy: Option[String]): AssumeRoleWithSAMLRequest =
    underlying.withPolicy(policy.orNull)

  def durationSecondsOpt: Option[Int] =
    Option(underlying.getDurationSeconds)

  def withDurationSeconds(durationSeconds: Option[Int]): AssumeRoleWithSAMLRequest =
    underlying.withDurationSeconds(durationSeconds.map(_.asInstanceOf[java.lang.Integer]).orNull)


}
