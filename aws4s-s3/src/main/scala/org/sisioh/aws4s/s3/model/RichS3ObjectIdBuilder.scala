package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.S3ObjectIdBuilder
import org.sisioh.aws4s.PimpedType

class RichS3ObjectIdBuilder(val underlying: S3ObjectIdBuilder)
  extends AnyVal with PimpedType[S3ObjectIdBuilder] {

  def bucketOpt: Option[String] = Option(underlying.getBucket)

  def bucketOpt_=(value: Option[String]): Unit =
    underlying.setBucket(value.orNull)

  def withBucketOpt(value: Option[String]): S3ObjectIdBuilder =
    underlying.withBucket(value.orNull)

  // ---

  def keyOpt: Option[String] = Option(underlying.getKey)

  def keyOpt_=(value: Option[String]): Unit =
    underlying.setKey(value.orNull)

  def withKeyOpt(value: Option[String]): S3ObjectIdBuilder =
    underlying.withKey(value.orNull)

  // ---

  def versionIdOpt: Option[String] = Option(underlying.getVersionId)

  def versionIdOpt_=(value: Option[String]): Unit =
    underlying.setVersionId(value.orNull)

  def withVersionIdOpt(value: Option[String]): S3ObjectIdBuilder =
    underlying.withVersionId(value.orNull)

}
