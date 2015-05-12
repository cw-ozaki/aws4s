package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.RequestPaymentConfiguration
import com.amazonaws.services.s3.model.RequestPaymentConfiguration.Payer
import org.sisioh.aws4s.PimpedType

object RequestPaymentConfigurationFactory {

  def create(payer: Payer): RequestPaymentConfiguration =
    new RequestPaymentConfiguration(payer)

}

class RichRequestPaymentConfiguration(val underlying: RequestPaymentConfiguration)
    extends AnyVal with PimpedType[RequestPaymentConfiguration] {

  def payer = underlying.getPayer

  def payer_=(value: Payer): Unit =
    underlying.setPayer(value)

}
