package org.sisioh.aws4s.sts.model

import com.amazonaws.services.securitytoken.model.{GetSessionTokenRequest, GetFederationTokenResult}
import org.sisioh.aws4s.PimpedType

object GetSessionTokenRequestFactory {

  def create: GetSessionTokenRequest = new GetSessionTokenRequest

}

class RichGetSessionTokenRequest(val underlying: GetSessionTokenRequest)
    extends AnyVal
    with PimpedType[GetSessionTokenRequest] {

  def durationSecondsOpt: Option[Int] =
    Option(underlying.getDurationSeconds)

  def withDurationSeconds(durationSeconds: Option[Int]): GetSessionTokenRequest =
    underlying.withDurationSeconds(durationSeconds.map(_.asInstanceOf[Integer]).orNull)

  def serialNumberOpt: Option[String] =
    Option(underlying.getSerialNumber)

  def withSerialNumber(serialNumber: Option[String]): GetSessionTokenRequest =
    underlying.withSerialNumber(serialNumber.orNull)

  def tokenCodeOpt: Option[String] =
    Option(underlying.getTokenCode)

  def withTokenCode(tokenCode: Option[String]): GetSessionTokenRequest =
    underlying.withTokenCode(tokenCode.orNull)

}
