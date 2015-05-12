package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{ CompleteMultipartUploadRequest, PartETag }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object CompleteMultipartUploadRequestFactory {

  def create(bucketName: String, key: String, uplaodId: String, partETags: Seq[PartETag]): CompleteMultipartUploadRequest =
    new CompleteMultipartUploadRequest(bucketName, key, uplaodId, partETags.asJava)

}

class RichCompleteMultipartUploadRequest(val underlying: CompleteMultipartUploadRequest)
    extends AnyVal with PimpedType[CompleteMultipartUploadRequest] {

  def bucketName: String = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)

  // ---

  def key: String = underlying.getKey

  def key_=(value: String): Unit =
    underlying.setKey(value)

  // ---

  def uploadId: String = underlying.getUploadId

  def uploadId_=(value: String): Unit =
    underlying.setUploadId(value)

  // ---

  def partETags: Seq[PartETag] = underlying.getPartETags.asScala.toVector

  def partETags_=(value: Seq[PartETag]): Unit =
    underlying.setPartETags(value.asJava)

  def withPartETags(value: Seq[PartETag]): CompleteMultipartUploadRequest =
    underlying.withPartETags(value.asJava)

}

