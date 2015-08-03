package org.sisioh.aws4s.sts.model

import com.amazonaws.services.securitytoken.model.AssumeRoleRequest
import org.sisioh.aws4s.PimpedType

object AssumeRoleRequestFactory {

  def create(): AssumeRoleRequest = new AssumeRoleRequest()

}

class RichAssumeRoleRequest(val underlying: AssumeRoleRequest)
    extends AnyVal with PimpedType[AssumeRoleRequest] {

  def roleArnOpt: Option[String] =
    Option(underlying.getRoleArn)

  def withRoleArn(roleArn: Option[String]): AssumeRoleRequest =
    underlying.withRoleArn(roleArn.orNull)

  def roleSessionNameOpt: Option[String] =
    Option(underlying.getRoleSessionName)

  def withRoleSessionName(roleSessionName: Option[String]): AssumeRoleRequest =
    underlying.withRoleSessionName(roleSessionName.orNull)

  def policyOpt: Option[String] =
    Option(underlying.getPolicy)

  def withPolicy(policy: Option[String]): AssumeRoleRequest =
    underlying.withPolicy(policy.orNull)

  def durationSecondsOpt: Option[Integer] =
    Option(underlying.getDurationSeconds)

  def withDurationSeconds(durationSeconds: Option[Integer]): AssumeRoleRequest =
    underlying.withDurationSeconds(durationSeconds.orNull)

  def externalIdOpt: Option[String] =
    Option(underlying.getExternalId)

  def withExternalId(externalId: Option[String]): AssumeRoleRequest =
    underlying.withExternalId(externalId.orNull)

  def serialNumberOpt: Option[String] =
    Option(underlying.getSerialNumber)

  def withSerialNumber(serialNumber: Option[String]): AssumeRoleRequest =
    underlying.withSerialNumber(serialNumber.orNull)

  def tokenCodeOpt: Option[String] =
    Option(underlying.getTokenCode)

  def withTokenCode(tokenCode: Option[String]): AssumeRoleRequest =
    underlying.withTokenCode(tokenCode.orNull)

}
