package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.MultiFactorAuthentication
import org.sisioh.aws4s.PimpedType

object MultiFactorAuthenticationFactory {

  def create(deviceSerialNumber: String, token: String): MultiFactorAuthentication =
    new MultiFactorAuthentication(deviceSerialNumber, token)

}

class RichMultiFactorAuthentication(val underlying: MultiFactorAuthentication)
  extends AnyVal with PimpedType[MultiFactorAuthentication] {

  def deviceSerialNumber = underlying.getDeviceSerialNumber

  def token = underlying.getToken

}
