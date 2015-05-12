package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{BucketLoggingConfiguration, SetBucketLoggingConfigurationRequest}
import org.sisioh.aws4s.PimpedType

class RichSetBucketLoggingConfigurationRequest(val underlying: SetBucketLoggingConfigurationRequest)
  extends AnyVal with PimpedType[SetBucketLoggingConfigurationRequest] {

  def bucketName: String = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)

  // ---

  def loggingConfiguration: BucketLoggingConfiguration = underlying.getLoggingConfiguration

  def loggingConfiguration_=(value: BucketLoggingConfiguration): Unit =
    underlying.setLoggingConfiguration(value)

}
