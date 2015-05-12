package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.GetBucketAclRequest
import org.sisioh.aws4s.PimpedType

object GetBucketAclRequestFactory {

  def create(bucketName: String): GetBucketAclRequest =
    new GetBucketAclRequest(bucketName)

}

class RichGetBucketAclRequest(val underlying: GetBucketAclRequest)
    extends AnyVal with PimpedType[GetBucketAclRequest] {

  def bucketName: String = underlying.getBucketName

}
