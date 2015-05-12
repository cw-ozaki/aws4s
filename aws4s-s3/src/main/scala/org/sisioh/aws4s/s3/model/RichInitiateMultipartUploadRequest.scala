package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{ AccessControlList, CannedAccessControlList, ObjectMetadata, InitiateMultipartUploadRequest }
import org.sisioh.aws4s.PimpedType

object InitiateMultipartUploadRequestFactory {

  def create(bucketName: String, key: String): InitiateMultipartUploadRequest =
    new InitiateMultipartUploadRequest(bucketName, key)

  def create(bucketName: String, key: String, objectMetadata: ObjectMetadata): InitiateMultipartUploadRequest =
    new InitiateMultipartUploadRequest(bucketName, key)

}

class RichInitiateMultipartUploadRequest(val underlying: InitiateMultipartUploadRequest)
    extends AnyVal with PimpedType[InitiateMultipartUploadRequest] {

  def bucketName = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)

  def withBucketName(value: String): InitiateMultipartUploadRequest =
    underlying.withBucketName(value)

  // ---

  def key = underlying.getKey

  def key_=(value: String): Unit =
    underlying.setKey(value)

  def withKey(value: String): InitiateMultipartUploadRequest =
    underlying.withKey(value)

  def objectMetadataOpt: Option[ObjectMetadata] = Option(underlying.getObjectMetadata)

  def cannedACLOpt: Option[CannedAccessControlList] = Option(underlying.getCannedACL)

  def accessControlListOpt: Option[AccessControlList] = Option(underlying.getAccessControlList)

  def storageClassOpt = Option(underlying.getStorageClass)

  def redirectLocationOpt = Option(underlying.getRedirectLocation)

  def sseCustomerKeyOpt = Option(underlying.getSSECustomerKey)

  def sseAwsKeyManagementParams = Option(underlying.getSSEAwsKeyManagementParams)

}
