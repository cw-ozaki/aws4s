package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{AccessControlList, SetBucketAclRequest}
import org.sisioh.aws4s.PimpedType

class RichSetBucketAclRequest(val underlying: SetBucketAclRequest)
  extends AnyVal with PimpedType[SetBucketAclRequest] {

  def bucketName: String = underlying.getBucketName

  // ---

  def aclOpt: Option[AccessControlList] = Option(underlying.getAcl)

  // ---

  def cannedAclOpt = Option(underlying.getCannedAcl)

}
