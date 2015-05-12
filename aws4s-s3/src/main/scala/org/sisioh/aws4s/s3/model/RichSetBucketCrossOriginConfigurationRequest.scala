package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{ BucketCrossOriginConfiguration, SetBucketCrossOriginConfigurationRequest }
import org.sisioh.aws4s.PimpedType

object SetBucketCrossOriginConfigurationRequestFactory {

  def create(bucketName: String, crossOriginConfiguration: BucketCrossOriginConfiguration): SetBucketCrossOriginConfigurationRequest =
    new SetBucketCrossOriginConfigurationRequest(bucketName, crossOriginConfiguration)

}

class RichSetBucketCrossOriginConfigurationRequest(val underlying: SetBucketCrossOriginConfigurationRequest)
    extends AnyVal with PimpedType[SetBucketCrossOriginConfigurationRequest] {

  def bucketName: String = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)

  // ---

  def crossOriginConfiguration: BucketCrossOriginConfiguration = underlying.getCrossOriginConfiguration

  def crossOriginConfiguration_=(value: BucketCrossOriginConfiguration): Unit =
    underlying.setCrossOriginConfiguration(value)

}
