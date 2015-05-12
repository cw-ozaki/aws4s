package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{ AccessControlList, CannedAccessControlList, CreateBucketRequest, Region }
import org.sisioh.aws4s.PimpedType

object CreateBucketRequestFactory {

  def create(bucketName: String): CreateBucketRequest = new CreateBucketRequest(bucketName)

  def create(bucketName: String, region: Region): CreateBucketRequest = new CreateBucketRequest(bucketName, region)

  def create(bucketName: String, region: String): CreateBucketRequest = new CreateBucketRequest(bucketName, region)

}

class RichCreateBucketRequest(val underlying: CreateBucketRequest)
    extends AnyVal with PimpedType[CreateBucketRequest] {

  def bucketName: String = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)

  // ---

  def region: String = underlying.getRegion

  def region_=(value: String): Unit =
    underlying.setRegion(value)

  // ---

  def cannedAclOpt: Option[CannedAccessControlList] = Option(underlying.getCannedAcl)

  def cannedAclOpt_=(value: Option[CannedAccessControlList]): Unit =
    underlying.setCannedAcl(value.orNull)

  def withCannedAclOpt(value: Option[CannedAccessControlList]): CreateBucketRequest =
    underlying.withCannedAcl(value.orNull)

  // ---

  def accessControlListOpt: Option[AccessControlList] = Option(underlying.getAccessControlList)

  def accessControlListOpt_=(value: Option[AccessControlList]): Unit =
    underlying.setAccessControlList(value.orNull)

  def withAccessControlListOpt(value: Option[AccessControlList]): CreateBucketRequest =
    underlying.withAccessControlList(value.orNull)

}
