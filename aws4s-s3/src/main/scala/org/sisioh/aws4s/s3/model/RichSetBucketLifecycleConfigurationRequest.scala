package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{BucketLifecycleConfiguration, SetBucketLifecycleConfigurationRequest}
import org.sisioh.aws4s.PimpedType

class RichSetBucketLifecycleConfigurationRequest(val underlying: SetBucketLifecycleConfigurationRequest)
  extends AnyVal with PimpedType[SetBucketLifecycleConfigurationRequest] {

  def bucketName: String = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)

  // ---

  def lifecycleConfiguration = underlying.getLifecycleConfiguration

  def lifecycleConfiguration_=(value: BucketLifecycleConfiguration): Unit =
    underlying.setLifecycleConfiguration(value)

}
