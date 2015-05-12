package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{S3VersionSummary, VersionListing}

import scala.collection.JavaConverters._

object VersionListingFactory {

  def create(): VersionListing = new VersionListing()

}

class RichVersionListing(val underlying: VersionListing) {

  def versionSummaries: Seq[S3VersionSummary] = underlying.getVersionSummaries.asScala.toVector

  def versionSummaries_=(value: Seq[S3VersionSummary]): Unit =
    underlying.setVersionSummaries(value.asJava)

  // ---

  def commonPrefixes: Seq[String] = underlying.getCommonPrefixes.asScala.toVector

  def commonPrefixes(value: Seq[String]): Unit =
    underlying.setCommonPrefixes(value.asJava)

  // ---

  def bucketNameOpt = Option(underlying.getBucketName)

  def bucketNameOpt_=(value: Option[String]): Unit =
    underlying.setBucketName(value.orNull)

  // ---

  def nextKeyMarkerOpt: Option[String] = Option(underlying.getNextKeyMarker)

  def nextKeyMarkerOpt_=(value: Option[String]): Unit =
    underlying.setNextKeyMarker(value.orNull)

  // ---

  def nextVersionIdMarkerOpt: Option[String] = Option(underlying.getNextVersionIdMarker)

  def nextVersionIdMarkerOpt_=(value: Option[String]): Unit =
    underlying.setNextVersionIdMarker(value.orNull)

  // ---

  def truncated: Boolean = underlying.isTruncated

  def truncated_=(value: Boolean): Unit =
    underlying.setTruncated(value)

  // ---

  def prefixOpt: Option[String] = Option(underlying.getPrefix)

  def prefixOpt_=(value: Option[String]): Unit =
    underlying.setPrefix(value.orNull)

  // ---

  def keyMarkerOpt = Option(underlying.getKeyMarker)

  def keyMarkerOpt_=(value: Option[String]): Unit =
    underlying.setKeyMarker(value.orNull)

  // ---

  def versionIdMarkerOpt: Option[String] = Option(underlying.getVersionIdMarker)

  def versionIdMarkerOpt_=(value: Option[String]): Unit =
    underlying.setVersionIdMarker(value.orNull)

  // ---

  def maxKeys: Int = underlying.getMaxKeys

  def maxKeys_=(value: Int): Unit =
    underlying.setMaxKeys(value)

  // ---

  def delimiterOpt: Option[String] = Option(underlying.getDelimiter)

  def delimiterOpt_=(value: Option[String]): Unit =
    underlying.setDelimiter(value.orNull)

  // ---

  def encodingTypeOpt: Option[String] = Option(underlying.getEncodingType)

  def encodingTypeOpt_=(value: Option[String]): Unit =
    underlying.setEncodingType(value.orNull)

}
