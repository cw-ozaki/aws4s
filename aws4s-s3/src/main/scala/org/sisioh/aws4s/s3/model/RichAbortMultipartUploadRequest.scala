package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.AbortMultipartUploadRequest
import org.sisioh.aws4s.PimpedType

object AbortMultipartUploadRequestFactory {

  def create(bucketName: String, key: String, uploadId: String): AbortMultipartUploadRequest =
    new AbortMultipartUploadRequest(bucketName, key, uploadId)

}

class RichAbortMultipartUploadRequest(val underlying: AbortMultipartUploadRequest)
  extends AnyVal with PimpedType[AbortMultipartUploadRequest] {

  def bucketName: String = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)

  // ---

  def key: String = underlying.getKey

  def key_=(value: String): Unit = underlying.setKey(value)

  // ---

  def uploadId: String = underlying.getUploadId

  def uploadId_=(value: String): Unit =
    underlying.setUploadId(value)

}
