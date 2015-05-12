package org.sisioh.aws4s.s3.model

import java.util.Date

import com.amazonaws.services.s3.model.{Owner, S3VersionSummary}
import org.sisioh.aws4s.PimpedType

object S3VersionSummaryFactory {

  def create(): S3VersionSummary = new S3VersionSummary()

}

class RichS3VersionSummary(val underlying: S3VersionSummary)
  extends AnyVal with PimpedType[S3VersionSummary] {

  def bucketNameOpt = Option(underlying.getBucketName)

  def bucketNameOpt_=(value: Option[String]): Unit =
    underlying.setBucketName(value.orNull)

  // ---

  def keyOpt: Option[String] = Option(underlying.getKey)

  def keyOpt_=(value: Option[String]): Unit =
    underlying.setKey(value.orNull)

  // ---

  def versionIdOpt: Option[String] = Option(underlying.getVersionId)

  def versionIdOpt_=(value: Option[String]): Unit =
    underlying.setVersionId(value.orNull)

  // ---

  def latestOpt: Option[Boolean] = Option(underlying.isLatest)

  def latestOpt_=(value: Option[Boolean]): Unit =
    underlying.setIsLatest(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  // ---

  def lastModifiedOpt: Option[Date] = Option(underlying.getLastModified)

  def lastModifiedOpt_=(value: Option[Date]): Unit =
    underlying.setLastModified(value.orNull)

  // ---

  def ownerOpt = Option(underlying.getOwner)

  def ownerOpt_=(value: Option[Owner]): Unit =
    underlying.setOwner(value.orNull)

  // ---

  def eTagOpt: Option[String] = Option(underlying.getETag)

  def eTagOpt_=(value: Option[String]): Unit =
    underlying.setETag(value.orNull)

  // ---

  def size: Long = underlying.getSize

  def size_=(value: Long): Unit =
    underlying.setSize(value)

  // ---

  def storageClassOpt: Option[String] = Option(underlying.getStorageClass)

  def storageClassOpt_=(value: Option[String]): Unit =
    underlying.setStorageClass(value.orNull)

  // ---

  def deleteMarker(): Option[Boolean] = Option(underlying.isDeleteMarker)

  def deleteMarker_=(value: Option[Boolean]): Unit =
    underlying.setIsDeleteMarker(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

}
