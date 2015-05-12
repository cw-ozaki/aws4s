package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.ListMultipartUploadsRequest
import org.sisioh.aws4s.PimpedType

object ListMultipartUploadsRequestFactory {

  def create(bucketName: String): ListMultipartUploadsRequest =
    new ListMultipartUploadsRequest(bucketName)

}

class RichListMultipartUploadsRequest(val underlying: ListMultipartUploadsRequest)
  extends AnyVal with PimpedType[ListMultipartUploadsRequest] {

  def bucketName: String = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)

  // ---

  def delimiterOpt: Option[String] = Option(underlying.getDelimiter)

  def delimiterOpt_=(value: Option[String]): Unit =
    underlying.setDelimiter(value.orNull)

  def withDelimiterOpt(value: Option[String]): ListMultipartUploadsRequest =
    underlying.withDelimiter(value.orNull)

  // ---

  def prefixOpt: Option[String] = Option(underlying.getPrefix)

  def prefixOpt_=(value: Option[String]): Unit =
    underlying.setPrefix(value.orNull)

  def withPrefixOpt(value: Option[String]): ListMultipartUploadsRequest =
    underlying.withPrefix(value.orNull)

  // ---

  def maxUploadsOpt: Option[Int] = Option(underlying.getMaxUploads)

  def maxUploadsOpt_=(value: Option[Int]): Unit =
    underlying.setMaxUploads(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  def withMaxUploadsOpt(value: Option[Int]): ListMultipartUploadsRequest =
    underlying.withMaxUploads(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  // ---

  def keyMarkerOpt = Option(underlying.getKeyMarker)

  def keyMarkerOpt_=(value: Option[String]): Unit =
    underlying.setKeyMarker(value.orNull)

  def withKeyMarkerOpt(value: Option[String]): ListMultipartUploadsRequest =
    underlying.withKeyMarker(value.orNull)

  // ---

  def encodingTypeOpt: Option[String] = Option(underlying.getEncodingType)

  def encodingTypeOpt_=(value: Option[String]): Unit =
    underlying.setEncodingType(value.orNull)

  def withEncodingTypeOpt_=(value: Option[String]): ListMultipartUploadsRequest =
    underlying.withEncodingType(value.orNull)

}
