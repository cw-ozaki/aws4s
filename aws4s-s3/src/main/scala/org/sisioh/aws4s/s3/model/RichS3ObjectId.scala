package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.S3ObjectId
import org.sisioh.aws4s.PimpedType

class RichS3ObjectId(val underlying: S3ObjectId)
  extends AnyVal with PimpedType[S3ObjectId] {

  def bucket: String = underlying.getBucket

  // ---

  def key: String = underlying.getKey

  // ---

  def versionId = underlying.getVersionId

}
