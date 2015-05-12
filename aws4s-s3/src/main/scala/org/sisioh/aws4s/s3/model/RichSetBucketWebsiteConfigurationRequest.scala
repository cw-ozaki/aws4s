package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{BucketWebsiteConfiguration, SetBucketWebsiteConfigurationRequest}
import org.sisioh.aws4s.PimpedType

object SetBucketWebsiteConfigurationRequestFactory {

  def create(bucketName: String, configuration: BucketWebsiteConfiguration): SetBucketWebsiteConfigurationRequest =
    new SetBucketWebsiteConfigurationRequest(bucketName, configuration)

}

class RichSetBucketWebsiteConfigurationRequest(val underlying: SetBucketWebsiteConfigurationRequest)
extends AnyVal with PimpedType[SetBucketWebsiteConfigurationRequest] {

  def bucketName: String = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)

  // ---

  def configuration = underlying.getConfiguration

  def configuration_=(value: BucketWebsiteConfiguration): Unit =
    underlying.setConfiguration(value)

}
