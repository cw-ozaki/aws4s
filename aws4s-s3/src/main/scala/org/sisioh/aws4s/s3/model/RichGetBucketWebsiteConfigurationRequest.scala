package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.GetBucketWebsiteConfigurationRequest
import org.sisioh.aws4s.PimpedType

object GetBucketWebsiteConfigurationRequestFactory {

  def create(bucketName: String): GetBucketWebsiteConfigurationRequest =
    new GetBucketWebsiteConfigurationRequest(bucketName)

}

class RichGetBucketWebsiteConfigurationRequest(val underlying: GetBucketWebsiteConfigurationRequest)
    extends AnyVal with PimpedType[GetBucketWebsiteConfigurationRequest] {

  def bucketName: String = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)

}
