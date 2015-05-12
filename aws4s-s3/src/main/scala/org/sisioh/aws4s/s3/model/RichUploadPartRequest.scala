package org.sisioh.aws4s.s3.model

import java.io.{ InputStream, File }

import com.amazonaws.services.s3.model.{ ObjectMetadata, SSECustomerKey, UploadPartRequest }
import org.sisioh.aws4s.PimpedType

object UploadPartRequestFactory {

  def create(): UploadPartRequest = new UploadPartRequest()

}

class RichUploadPartRequest(val underlying: UploadPartRequest)
    extends AnyVal with PimpedType[UploadPartRequest] {

  def bucketNameOpt: Option[String] = Option(underlying.getBucketName)

  def bucketNameOpt_=(value: Option[String]): Unit =
    underlying.setBucketName(value.orNull)

  def withBucketNameOpt(value: Option[String]): UploadPartRequest =
    underlying.withBucketName(value.orNull)

  // ---

  def keyOpt: Option[String] = Option(underlying.getKey)

  def keyOpt_=(value: Option[String]): Unit =
    underlying.setKey(value.orNull)

  def withKeyOpt(value: Option[String]): UploadPartRequest =
    underlying.withKey(value.orNull)

  // ---

  def uploadIdOpt = Option(underlying.getUploadId)

  def uploadIdOpt_=(value: Option[String]): Unit =
    underlying.setUploadId(value.orNull)

  def withUploadIdOpt(value: Option[String]): UploadPartRequest =
    underlying.withUploadId(value.orNull)

  // ---

  def inputStreamOpt: Option[InputStream] = Option(underlying.getInputStream)

  def inputStreamOpt_=(value: Option[InputStream]): Unit =
    underlying.setInputStream(value.orNull)

  def withInputStreamOpt(value: Option[InputStream]): UploadPartRequest =
    underlying.withInputStream(value.orNull)

  // ---

  def partNumber: Int = underlying.getPartNumber

  def partNumber_=(value: Int): Unit =
    underlying.setPartNumber(value)

  def withPartNumber_=(value: Int): UploadPartRequest =
    underlying.withPartNumber(value)

  // ---

  def partSize: Long = underlying.getPartSize

  def partSize_=(value: Long): Unit =
    underlying.setPartSize(value)

  def witPartSize(value: Long) = underlying.withPartSize(value)

  // ---

  def md5DigestOpt: Option[String] = Option(underlying.getMd5Digest)

  def md5DigestOpt_=(value: Option[String]): Unit =
    underlying.setMd5Digest(value.orNull)

  def withMD5DigestOpt(value: Option[String]): UploadPartRequest =
    underlying.withMD5Digest(value.orNull)

  // ---

  def fileOpt: Option[File] = Option(underlying.getFile)

  def fileOpt_=(value: Option[File]): Unit =
    underlying.setFile(value.orNull)

  def withFileOpt(value: Option[File]): UploadPartRequest =
    underlying.withFile(value.orNull)

  // ---

  def fileOffset: Long = underlying.getFileOffset

  def fileOffset_=(value: Long): Unit =
    underlying.setFileOffset(value)

  // ---

  def lastPart: Boolean = underlying.isLastPart

  def lastPart_=(value: Boolean): Unit =
    underlying.setLastPart(value)

  // ---

  def sseCustomerKeyOpt: Option[SSECustomerKey] = Option(underlying.getSSECustomerKey)

  def sseCustomerKeyOpt_=(value: Option[SSECustomerKey]): Unit =
    underlying.setSSECustomerKey(value.orNull)

  def withSSECustomerKeyOpt(value: Option[SSECustomerKey]): UploadPartRequest =
    underlying.withSSECustomerKey(value.orNull)

  // ---

  def objectMetadataOpt: Option[ObjectMetadata] = Option(underlying.getObjectMetadata)

  def objectMetadataOpt_=(value: Option[ObjectMetadata]): Unit =
    underlying.setObjectMetadata(value.orNull)

  def withObjectMetadataOpt(value: Option[ObjectMetadata]): UploadPartRequest =
    underlying.withObjectMetadata(value.orNull)

}
