package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.GetBucketLocationRequest
import org.sisioh.aws4s.PimpedType

object GetBucketLocationRequestFactory {

  def create(bucketName: String): GetBucketLocationRequest =
    new GetBucketLocationRequest(bucketName)

}

class RichGetBucketLocationRequest(val underlying: GetBucketLocationRequest)
  extends AnyVal with PimpedType[GetBucketLocationRequest] {

  def bucketName: String = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)

}
