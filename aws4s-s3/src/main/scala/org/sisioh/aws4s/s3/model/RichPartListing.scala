package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{PartSummary, Owner, PartListing}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichPartListing(val underlying: PartListing)
  extends AnyVal with PimpedType[PartListing] {

  def bucketNameOpt = Option(underlying.getBucketName)

  def bucketNameOpt_=(value: Option[String]): Unit =
    underlying.setBucketName(value.orNull)

  // ---
  def keyOpt: Option[String] = Option(underlying.getKey)

  def keyOpt_=(value: Option[String]): Unit =
    underlying.setKey(value.orNull)

  // ---

  def uploadIdOpt = Option(underlying.getUploadId)

  def uploadIdOpt_=(value: Option[String]): Unit =
    underlying.setUploadId(value.orNull)

  // ---

  def maxPartsOpt: Option[Int] = Option(underlying.getMaxParts)

  def maxPartsOpt_=(value: Option[Int]): Unit =
    underlying.setMaxParts(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  // ---

  def partNumberMarkerOpt: Option[Int] = Option(underlying.getPartNumberMarker)

  def partNumberMarkerOpt_=(value: Option[Int]): Unit =
    underlying.setPartNumberMarker(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  // ---

  def encodingTypeOpt: Option[String] = Option(underlying.getEncodingType)

  def encodingTypeOpt_=(value: Option[String]): Unit =
    underlying.setEncodingType(value.orNull)

  // ---

  def ownerOpt: Option[Owner] = Option(underlying.getOwner)

  def ownerOpt_=(value: Option[Owner]): Unit =
    underlying.setOwner(value.orNull)

  // ---

  def initiatorOpt: Option[Owner] = Option(underlying.getInitiator)

  def initiatorOpt_=(value: Option[Owner]): Unit =
    underlying.setInitiator(value.orNull)

  // ---

  def storageClassOpt: Option[String] = Option(underlying.getStorageClass)

  def storageClassOpt_=(value: Option[String]): Unit =
    underlying.setStorageClass(value.orNull)

  // ---

  def truncatedOpt: Option[Boolean] = Option(underlying.isTruncated)

  def truncatedOpt_=(value: Option[Boolean]): Unit =
    underlying.setTruncated(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  // ---

  def nextPartNumberMarkerOpt: Option[Int] = Option(underlying.getNextPartNumberMarker)

  // ---

  def parts: Seq[PartSummary] = underlying.getParts.asScala

}
