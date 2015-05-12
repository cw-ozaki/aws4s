package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.InitiateMultipartUploadResult
import org.sisioh.aws4s.PimpedType

object InitiateMultipartUploadResultFactory {

  def create(): InitiateMultipartUploadResult = new InitiateMultipartUploadResult()

}

class RichInitiateMultipartUploadResult(val underlying: InitiateMultipartUploadResult)
  extends AnyVal with PimpedType[InitiateMultipartUploadResult] {

  def bucketNameOpt = Option(underlying.getBucketName)

  def bucketNameOpt_=(value: Option[String]): Unit =
    underlying.setBucketName(value.orNull)

  // ---

  def keyOpt = Option(underlying.getKey)

  def keyOpt_=(value: Option[String]): Unit =
    underlying.setKey(value.orNull)

  // ---

  def uploadIdOpt = Option(underlying.getUploadId)

  def uploadIdOpt_=(value: Option[String]): Unit =
    underlying.setUploadId(value.orNull)

}
