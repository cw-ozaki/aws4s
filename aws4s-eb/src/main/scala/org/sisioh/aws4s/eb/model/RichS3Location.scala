package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.S3Location
import org.sisioh.aws4s.PimpedType

class RichS3Location(val underlying: S3Location)
  extends AnyVal with PimpedType[S3Location] {

  def s3BucketOpt: Option[String] = Option(underlying.getS3Bucket)

  def s3BucketOpt_=(value: Option[String]): Unit =
    underlying.setS3Bucket(value.orNull)

  def withS3BucketOpt(value: Option[String]): S3Location =
    underlying.withS3Bucket(value.orNull)

  // ---

  def s3KeyOpt: Option[String] = Option(underlying.getS3Key)

  def s3KeyOpt_=(value: Option[String]): Unit =
    underlying.setS3Key(value.orNull)

  def withS3KeyOpt(value: Option[String]): S3Location =
    underlying.withS3Key(value.orNull)

}
