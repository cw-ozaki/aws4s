package org.sisioh.aws4s.s3.model

import java.io.{ File, InputStream }

import com.amazonaws.services.s3.model._
import org.sisioh.aws4s.PimpedType

class RichAbstractPutObjectRequest(val underlying: AbstractPutObjectRequest) extends AnyVal with PimpedType[AbstractPutObjectRequest] {

  def bucketName: String = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)

  // ---

  def key: String = underlying.getKey

  def key_=(value: String): Unit =
    underlying.setKey(value)

  // ---

  def accessControlListOpt: Option[AccessControlList] = Option(underlying.getAccessControlList)

  def accessControlListOpt_=(value: Option[AccessControlList]): Unit =
    underlying.setAccessControlList(value.orNull)

  def withAccessControlListOpt[T <: AbstractPutObjectRequest](value: Option[AccessControlList]): T =
    underlying.withAccessControlList(value.orNull)

  // ---

  def cannedAclOpt: Option[CannedAccessControlList] = Option(underlying.getCannedAcl)

  def cannedAclOpt_=(value: Option[CannedAccessControlList]): Unit =
    underlying.setCannedAcl(value.orNull)

  def withCannedAclOpt[T <: AbstractPutObjectRequest](value: Option[CannedAccessControlList]): T =
    underlying.withCannedAcl(value.orNull)

  // ---

  def fileOpt: Option[File] = Option(underlying.getFile)

  def fileOpt_=(value: Option[File]): Unit =
    underlying.setFile(value.orNull)

  def withFileOpt[T <: AbstractPutObjectRequest](value: Option[File]): T =
    underlying.withFile(value.orNull)

  // ---

  def inputStreamOpt: Option[InputStream] = Option(underlying.getInputStream)

  def inputStreamOpt_=(value: Option[InputStream]): Unit =
    underlying.setInputStream(value.orNull)

  def withInputStreamOpt[T <: AbstractPutObjectRequest](value: Option[InputStream]): T =
    underlying.withInputStream(value.orNull)

  // ---

  def metadataOpt: Option[ObjectMetadata] = Option(underlying.getMetadata)

  def metadataOpt_=(value: Option[ObjectMetadata]): Unit =
    underlying.setMetadata(value.orNull)

  def withMetadataOpt[T <: AbstractPutObjectRequest](value: Option[ObjectMetadata]): T =
    underlying.withMetadata(value.orNull)

  // ---

  def redirectLocationOpt: Option[String] = Option(underlying.getRedirectLocation)

  def redirectLocationOpt_=(value: Option[String]): Unit =
    underlying.setRedirectLocation(value.orNull)

  def withRedirectLocationOpt[T <: AbstractPutObjectRequest](value: Option[String]): T =
    underlying.withRedirectLocation(value.orNull)

  // ---

  def sseAwsKeyManagementParamsOpt: Option[SSEAwsKeyManagementParams] = Option(underlying.getSSEAwsKeyManagementParams)

  def sseAwsKeyManagementParamsOpt_=(value: Option[SSEAwsKeyManagementParams]): Unit =
    underlying.setSSEAwsKeyManagementParams(value.orNull)

  def withSSEAwsKeyManagementParamsOpt[T <: AbstractPutObjectRequest](value: Option[SSEAwsKeyManagementParams]): T =
    underlying.withSSEAwsKeyManagementParams(value.orNull)

  def sseCustomerKeyOpt: Option[SSECustomerKey] = Option(underlying.getSSECustomerKey)

  def sseCustomerKeyOpt_=(value: Option[SSECustomerKey]): Unit =
    underlying.setSSECustomerKey(value.orNull)

  def withSSECustomerKeyOpt[T <: AbstractPutObjectRequest](value: Option[SSECustomerKey]): T =
    underlying.withSSECustomerKey(value.orNull)

  // ---

  def storageClassOpt: Option[String] = Option(underlying.getStorageClass)

  def storageClassOpt_=(value: Option[String]): Unit =
    underlying.setStorageClass(value.orNull)

  def withStorageClassOpt[T <: AbstractPutObjectRequest](value: Option[String]): T =
    underlying.withStorageClass(value.orNull)

  def setStorageClassOpt(value: Option[StorageClass]): Unit =
    underlying.setStorageClass(value.orNull)

}

