package org.sisioh.aws4s.sts.model

import com.amazonaws.services.securitytoken.model.{FederatedUser, DecodeAuthorizationMessageRequest}
import org.sisioh.aws4s.PimpedType

object FederatedUserFactory {

  def create(federatedUserId: String, arn: String): FederatedUser =
    new FederatedUser(federatedUserId, arn)

}

class RichFederatedUser(val underlying: FederatedUser)
    extends AnyVal
    with PimpedType[FederatedUser] {

  def federatedUserIdOpt: Option[String] =
    Option(underlying.getFederatedUserId)

  def withFederatedUserId(federatedUserId: Option[String]): FederatedUser =
    underlying.withFederatedUserId(federatedUserId.orNull)

  def arnOpt: Option[String] =
    Option(underlying.getArn)

  def withArn(arn: Option[String]): FederatedUser =
    underlying.withArn(arn.orNull)

}
