package org.sisioh.aws4s.s3.model

import java.util.Date

import com.amazonaws.services.s3.model.{Owner, S3ObjectSummary}
import org.sisioh.aws4s.PimpedType

object S3ObjectSummaryFactory {

  def create(): S3ObjectSummary = new S3ObjectSummary()

}

class RichS3ObjectSummary(val underlying: S3ObjectSummary)
  extends AnyVal with PimpedType[S3ObjectSummary] {

  def bucketNameOpt = Option(underlying.getBucketName)

  def bucketNameOpt_=(value: Option[String]): Unit =
    underlying.setBucketName(value.orNull)

  // ---

  def keyOpt: Option[String] = Option(underlying.getKey)

  def keyOpt_=(value: Option[String]): Unit =
    underlying.setKey(value.orNull)

  // ---

  def eTagOpt: Option[String] = Option(underlying.getETag)

  def eTagOpt_=(value: Option[String]): Unit =
    underlying.setETag(value.orNull)

  // ---

  def size: Long = underlying.getSize

  def size_=(value: Long): Unit =
    underlying.setSize(value)

  // ---

  def lastModifiedOpt: Option[Date] = Option(underlying.getLastModified)

  def lastModifiedOpt_=(value: Option[Date]): Unit =
    underlying.setLastModified(value.orNull)

  // ---

  def storageClassOpt: Option[String] = Option(underlying.getStorageClass)

  def storageClassOpt_=(value: Option[String]): Unit =
    underlying.setStorageClass(value.orNull)

  // ---

  def ownerOpt: Option[Owner] = Option(underlying.getOwner)

  def ownerOpt_=(value: Option[Owner]): Unit =
    underlying.setOwner(value.orNull)

}
