package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{S3ObjectInputStream, ObjectMetadata, S3Object}
import org.sisioh.aws4s.PimpedType

class RichS3Object(val underlying: S3Object)
  extends AnyVal with PimpedType[S3Object] {

  def keyOpt: Option[String] = Option(underlying.getKey)

  def keyOpt_=(value: Option[String]): Unit =
    underlying.setKey(value.orNull)

  // ---

  def bucketNameOpt = Option(underlying.getBucketName)

  def bucketNameOpt_=(value: Option[String]): Unit =
    underlying.setBucketName(value.orNull)

  // ---

  def objectMetadata: ObjectMetadata = underlying.getObjectMetadata

  def objectMetadata_=(value: ObjectMetadata): Unit =
    underlying.setObjectMetadata(value)

  // ---

  def objectContentOpt: Option[S3ObjectInputStream] = Option(underlying.getObjectContent)

  def objectContentOpt_=(value: Option[S3ObjectInputStream]): Unit =
    underlying.setObjectContent(value.orNull)

  // ---

  def redirectLocationOpt: Option[String] = Option(underlying.getRedirectLocation)

  def redirectLocationOpt_=(value: Option[String]): Unit =
    underlying.setRedirectLocation(value.orNull)

  // ---

  def requesterChargedOpt: Option[Boolean] = Option(underlying.isRequesterCharged)

  def requesterChargedOpt_=(value: Option[Boolean]): Unit =
    underlying.setRequesterCharged(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

}
