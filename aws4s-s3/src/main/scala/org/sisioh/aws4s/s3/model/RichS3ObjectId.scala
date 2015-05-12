package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{S3ObjectId, S3ObjectIdBuilder}
import org.sisioh.aws4s.PimpedType

object S3ObjectIdFactory {

  def create(bucket: String, key: String): S3ObjectId = new S3ObjectId(bucket, key)

  def create(bucket: String, key: String, versionId: String): S3ObjectId = new S3ObjectId(bucket, key, versionId)

  def create(builder: S3ObjectIdBuilder): S3ObjectId = new S3ObjectId(builder)

}

class RichS3ObjectId(val underlying: S3ObjectId)
  extends AnyVal with PimpedType[S3ObjectId] {

  def bucket: String = underlying.getBucket

  // ---

  def key: String = underlying.getKey

  // ---

  def versionId = underlying.getVersionId

}
