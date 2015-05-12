package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.DeleteBucketRequest
import org.sisioh.aws4s.PimpedType

object DeleteBucketRequestFactory {

  def create(bucketName: String): DeleteBucketRequest = new DeleteBucketRequest(bucketName)

}

class RichDeleteBucketRequest(val underlying: DeleteBucketRequest)
  extends AnyVal with PimpedType[DeleteBucketRequest] {

  def bucketName = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)

}
