package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.HeadBucketRequest
import org.sisioh.aws4s.PimpedType

object HeadBucketRequestFactory {

  def create(bucketName: String): HeadBucketRequest = new HeadBucketRequest(bucketName)

}

class RichHeadBucketRequest(val underlying: HeadBucketRequest)
    extends AnyVal with PimpedType[HeadBucketRequest] {

  def bucketName = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)

}
