package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.GetRequestPaymentConfigurationRequest
import org.sisioh.aws4s.PimpedType

object GetRequestPaymentConfigurationRequestFactory {

  def create(bucketName: String): GetRequestPaymentConfigurationRequest =
    new GetRequestPaymentConfigurationRequest(bucketName)

}

class RichGetRequestPaymentConfigurationRequest(val underlying: GetRequestPaymentConfigurationRequest)
  extends AnyVal with PimpedType[GetRequestPaymentConfigurationRequest] {

  def bucketName: String = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)

}
