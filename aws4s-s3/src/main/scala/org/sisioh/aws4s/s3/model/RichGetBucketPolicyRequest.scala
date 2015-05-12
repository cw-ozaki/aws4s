package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.GetBucketPolicyRequest
import org.sisioh.aws4s.PimpedType

object GetBucketPolicyRequestFactory {

  def create(bucketName: String): GetBucketPolicyRequest =
    new GetBucketPolicyRequest(bucketName)

}

class RichGetBucketPolicyRequest(val underlying: GetBucketPolicyRequest)
    extends AnyVal with PimpedType[GetBucketPolicyRequest] {

  def bucketName: String = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)

}
