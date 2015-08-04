package org.sisioh.aws4s.sts.model

import com.amazonaws.services.securitytoken.model.{GetFederationTokenRequest, GetFederationTokenResult}
import org.sisioh.aws4s.PimpedType

object GetFederationTokenRequestFactory {

  def create(name: String): GetFederationTokenRequest = new GetFederationTokenRequest(name)

}

class RichGetFederationTokenRequest(val underlying: GetFederationTokenRequest)
    extends AnyVal
    with PimpedType[GetFederationTokenRequest] {

  def nameOpt: Option[String] =
    Option(underlying.getName)

  def withName(name: Option[String]): GetFederationTokenRequest =
    underlying.withName(name.orNull)

  def policyOpt: Option[String] =
    Option(underlying.getPolicy)

  def withPolicy(policy: Option[String]): GetFederationTokenRequest =
    underlying.withPolicy(policy.orNull)

  def durationSecondsOpt: Option[Int] =
    Option(underlying.getDurationSeconds)

  def withDurationSeconds(durationSeconds: Option[Int]): GetFederationTokenRequest =
    underlying.withDurationSeconds(durationSeconds.map(_.asInstanceOf[Integer]).orNull)

}
