package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{BucketNotificationConfiguration, SetBucketNotificationConfigurationRequest}
import org.sisioh.aws4s.PimpedType

object SetBucketNotificationConfigurationRequestFactory {

  def create(bucketName: String, notificationConfiguration:BucketNotificationConfiguration ):SetBucketNotificationConfigurationRequest =
    new SetBucketNotificationConfigurationRequest(bucketName, notificationConfiguration)

}

class RichSetBucketNotificationConfigurationRequest(val underlying: SetBucketNotificationConfigurationRequest)
  extends AnyVal with PimpedType[SetBucketNotificationConfigurationRequest] {

  def bucketName: String = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)

  // ---

  def notificationConfiguration: BucketNotificationConfiguration =
    underlying.getNotificationConfiguration

  def notificationConfiguration_=(value: BucketNotificationConfiguration): Unit =
    underlying.setNotificationConfiguration(value)

}
