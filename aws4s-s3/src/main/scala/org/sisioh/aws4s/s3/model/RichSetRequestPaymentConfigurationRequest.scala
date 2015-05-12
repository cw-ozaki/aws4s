package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{RequestPaymentConfiguration, SetRequestPaymentConfigurationRequest}
import org.sisioh.aws4s.PimpedType

class RichSetRequestPaymentConfigurationRequest(val underlying: SetRequestPaymentConfigurationRequest)
  extends AnyVal with PimpedType[SetRequestPaymentConfigurationRequest] {

  def bucketName: String = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)

  // ---

  def configuration: RequestPaymentConfiguration = underlying.getConfiguration

  def configuration_=(value: RequestPaymentConfiguration): Unit =
    underlying.setConfiguration(value)

}
