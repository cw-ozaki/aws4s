package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.CreateStorageLocationResult
import org.sisioh.aws4s.PimpedType

object CreateStorageLocationResultFactory {

  def create(): CreateStorageLocationResult = new CreateStorageLocationResult()

}

class RichCreateStorageLocationResult(val underlying: CreateStorageLocationResult)
  extends AnyVal with PimpedType[CreateStorageLocationResult] {

  def s3BucketOpt: Option[String] = Option(underlying.getS3Bucket)

  def s3BucketOpt_=(value: Option[String]): Unit =
    underlying.setS3Bucket(value.orNull)

  def withS3BucketOpt(value: Option[String]): CreateStorageLocationResult =
    underlying.withS3Bucket(value.orNull)

}
