package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.SetBucketPolicyRequest
import org.sisioh.aws4s.PimpedType

object SetBucketPolicyRequestFactory {

  def create(bucketName: String, policyText: String): SetBucketPolicyRequest =
    new SetBucketPolicyRequest(bucketName, policyText)

}

class RichSetBucketPolicyRequest(val underlying: SetBucketPolicyRequest)
  extends AnyVal with PimpedType[SetBucketPolicyRequest] {

  def bucketName: String = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)

  // ---

  def policyText: String =  underlying.getPolicyText

  def policyText_=(value: String): Unit =
    underlying.setPolicyText(value)

}
