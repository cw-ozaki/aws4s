package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{ BucketTaggingConfiguration, SetBucketTaggingConfigurationRequest }
import org.sisioh.aws4s.PimpedType

object SetBucketTaggingConfigurationRequestFactory {

  def create(bucketName: String, taggingConfiguration: BucketTaggingConfiguration): SetBucketTaggingConfigurationRequest =
    new SetBucketTaggingConfigurationRequest(bucketName, taggingConfiguration)

}

class RichSetBucketTaggingConfigurationRequest(val underlying: SetBucketTaggingConfigurationRequest)
    extends AnyVal with PimpedType[SetBucketTaggingConfigurationRequest] {

  def bucketName: String = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)

  // ---

  def taggingConfiguration: BucketTaggingConfiguration = underlying.getTaggingConfiguration

  def taggingConfiguration_=(value: BucketTaggingConfiguration): Unit =
    underlying.setTaggingConfiguration(value)

}
