package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{AccessControlList, SetObjectAclRequest}
import org.sisioh.aws4s.PimpedType

class RichSetObjectAclRequest(val underlying: SetObjectAclRequest)
extends AnyVal with PimpedType[SetObjectAclRequest]{

  def bucketName: String = underlying.getBucketName

  // ---

  def key: String = underlying.getKey

  // ---

  def versionIdOpt: Option[String] = Option(underlying.getVersionId)

  // ---

  def aclOpt: Option[AccessControlList] = Option(underlying.getAcl)

  // ---

  def cannedAclOpt = Option(underlying.getCannedAcl)

}
