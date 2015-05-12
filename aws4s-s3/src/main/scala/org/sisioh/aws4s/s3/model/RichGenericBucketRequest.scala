package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.GenericBucketRequest

object GenericBucketRequestFactory {

  def create(bucketName: String): GenericBucketRequest =
    new GenericBucketRequest(bucketName)

}

class RichGenericBucketRequest(val underlying: GenericBucketRequest) {

  def bucketName: String = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)

}
