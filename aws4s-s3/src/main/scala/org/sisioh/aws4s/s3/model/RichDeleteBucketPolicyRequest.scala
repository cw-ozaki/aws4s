package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.DeleteBucketPolicyRequest
import org.sisioh.aws4s.PimpedType

object DeleteBucketPolicyRequestFactory {

  def create(bucketName: String): DeleteBucketPolicyRequest = new DeleteBucketPolicyRequest(bucketName)

}

class RichDeleteBucketPolicyRequest(val underlying: DeleteBucketPolicyRequest)
  extends AnyVal with PimpedType[DeleteBucketPolicyRequest] {

  def bucketName = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)
  
}
