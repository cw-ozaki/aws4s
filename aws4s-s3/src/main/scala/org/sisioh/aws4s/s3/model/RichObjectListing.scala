package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{ObjectListing, S3ObjectSummary}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichObjectListing(val underlying: ObjectListing)
  extends AnyVal with PimpedType[ObjectListing] {

  def objectSummaries: Seq[S3ObjectSummary] = underlying.getObjectSummaries.asScala

  // ---

  def commonPrefixes: Seq[String] = underlying.getCommonPrefixes.asScala

  def commonPrefixes(value: Seq[String]): Unit =
    underlying.setCommonPrefixes(value.asJava)

  // ---

  def bucketNameOpt = Option(underlying.getBucketName)

  def bucketNameOpt_=(value: Option[String]): Unit =
    underlying.setBucketName(value.orNull)

  // ---

  def nextMarkerOpt: Option[String] = Option(underlying.getNextMarker)

  def nextMarkerOpt_=(value: Option[String]): Unit =
    underlying.setNextMarker(value.orNull)

  // ---

  def truncatedOpt: Option[Boolean] = Option(underlying.isTruncated)

  def truncatedOpt_=(value: Option[Boolean]): Unit =
    underlying.setTruncated(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  // ---

  def prefixOpt: Option[String] = Option(underlying.getPrefix)

  def prefixOpt_=(value: Option[String]): Unit =
    underlying.setPrefix(value.orNull)

  // ---

  def markerOpt: Option[String] = Option(underlying.getMarker)

  def markerOpt_=(value: Option[String]): Unit =
    underlying.setMarker(value.orNull)

  // ---

  /**
  private int maxKeys;
    private String delimiter;
    private String encodingType;
    */

}
