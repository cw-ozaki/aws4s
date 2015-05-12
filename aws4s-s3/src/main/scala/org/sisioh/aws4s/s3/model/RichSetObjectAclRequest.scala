package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{ CannedAccessControlList, AccessControlList, SetObjectAclRequest }
import org.sisioh.aws4s.PimpedType

object SetObjectAclRequestFactory {

  def create(bucketName: String, key: String, acl: AccessControlList): SetObjectAclRequest =
    new SetObjectAclRequest(bucketName, key, acl)

  def create(bucketName: String, key: String, acl: CannedAccessControlList): SetObjectAclRequest =
    new SetObjectAclRequest(bucketName, key, acl)

  def create(bucketName: String, key: String, versionId: String, acl: AccessControlList): SetObjectAclRequest =
    new SetObjectAclRequest(bucketName, key, versionId, acl)

  def create(bucketName: String, key: String, versionId: String, acl: CannedAccessControlList): SetObjectAclRequest =
    new SetObjectAclRequest(bucketName, key, versionId, acl)

}

class RichSetObjectAclRequest(val underlying: SetObjectAclRequest)
    extends AnyVal with PimpedType[SetObjectAclRequest] {

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
