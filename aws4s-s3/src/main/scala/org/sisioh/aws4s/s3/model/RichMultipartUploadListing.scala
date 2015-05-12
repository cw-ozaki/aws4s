package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{ MultipartUpload, MultipartUploadListing }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object MultipartUploadListingFactory {

  def create(): MultipartUploadListing = new MultipartUploadListing()

}

class RichMultipartUploadListing(val underlying: MultipartUploadListing)
    extends AnyVal with PimpedType[MultipartUploadListing] {

  def bucketNameOpt = Option(underlying.getBucketName)

  def bucketNameOpt_=(value: Option[String]): Unit =
    underlying.setBucketName(value.orNull)

  // ---

  def keyMarkerOpt = Option(underlying.getKeyMarker)

  def keyMarkerOpt_=(value: Option[String]): Unit =
    underlying.setKeyMarker(value.orNull)

  // ---

  def delimiterOpt: Option[String] = Option(underlying.getDelimiter)

  def delimiterOpt_=(value: Option[String]): Unit =
    underlying.setDelimiter(value.orNull)

  // ---

  def prefixOpt: Option[String] = Option(underlying.getPrefix)

  def prefixOpt_=(value: Option[String]): Unit =
    underlying.setPrefix(value.orNull)

  // ---

  def uploadIdMarkerOpt: Option[String] = Option(underlying.getUploadIdMarker)

  def uploadIdMarkerOpt_=(value: Option[String]): Unit =
    underlying.setUploadIdMarker(value.orNull)

  // ---

  def maxUploadsOpt: Option[Int] = Option(underlying.getMaxUploads)

  def maxUploadsOpt_=(value: Option[Int]): Unit =
    underlying.setMaxUploads(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  // ---

  def encodingTypeOpt: Option[String] = Option(underlying.getEncodingType)

  def encodingTypeOpt_=(value: Option[String]): Unit =
    underlying.setEncodingType(value.orNull)

  // ---

  def truncatedOpt: Option[Boolean] = Option(underlying.isTruncated)

  def truncatedOpt_=(value: Option[Boolean]): Unit =
    underlying.setTruncated(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  // ---

  def nextKeyMarkerOpt: Option[String] = Option(underlying.getNextKeyMarker)

  def nextKeyMarkerOpt_=(value: Option[String]): Unit =
    underlying.setNextKeyMarker(value.orNull)

  // ---

  def nextUploadIdMarkerOpt: Option[String] = Option(underlying.getNextUploadIdMarker)

  def nextUploadIdMarkerOpt_=(value: Option[String]): Unit =
    underlying.setNextUploadIdMarker(value.orNull)

  // ---

  def multipartUploads: Seq[MultipartUpload] = underlying.getMultipartUploads.asScala.toSeq

  def multipartUploads_=(value: Seq[MultipartUpload]): Unit =
    underlying.setMultipartUploads(value.asJava)

  // ---

  def commonPrefixes: Seq[String] = underlying.getCommonPrefixes.asScala.toSeq

  def commonPrefixes_=(value: Seq[String]): Unit =
    underlying.setCommonPrefixes(value.asJava)

}
