package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.ListVersionsRequest
import org.sisioh.aws4s.PimpedType

object ListVersionsRequestFactory {

  def create(): ListVersionsRequest = new ListVersionsRequest()

  def create(bucketName: String, prefix: String, keyMarker: String,
             versionIdMarker: String, delimiter: String, maxResults: Int): ListVersionsRequest =
    new ListVersionsRequest(bucketName, prefix, keyMarker, versionIdMarker, delimiter, maxResults)

}

class RichListVersionsRequest(val underlying: ListVersionsRequest)
  extends AnyVal with PimpedType[ListVersionsRequest] {

  def bucketNameOpt = Option(underlying.getBucketName)

  def bucketNameOpt_=(value: Option[String]): Unit =
    underlying.setBucketName(value.orNull)

  def withBucketNameOpt(value: Option[String]): ListVersionsRequest =
    underlying.withBucketName(value.orNull)

  // ---

  def prefixOpt: Option[String] = Option(underlying.getPrefix)

  def prefixOpt_=(value: Option[String]): Unit =
    underlying.setPrefix(value.orNull)

  def withPrefixOpt(value: Option[String]): ListVersionsRequest =
    underlying.withPrefix(value.orNull)

  // ---

  def keyMarkerOpt = Option(underlying.getKeyMarker)

  def keyMarkerOpt_=(value: Option[String]): Unit =
    underlying.setKeyMarker(value.orNull)

  def withKeyMarkerOpt(value: Option[String]): ListVersionsRequest =
    underlying.withKeyMarker(value.orNull)

  // ---

  def versionIdMarkerOpt: Option[String] = Option(underlying.getVersionIdMarker)

  def versionIdMarkerOpt_=(value: Option[String]): Unit =
    underlying.setVersionIdMarker(value.orNull)

  def withVersionIdMarkerOpt(value: Option[String]): ListVersionsRequest =
    underlying.withVersionIdMarker(value.orNull)

  // ---

  def delimiterOpt: Option[String] = Option(underlying.getDelimiter)

  def delimiterOpt_=(value: Option[String]): Unit =
    underlying.setDelimiter(value.orNull)

  def withDelimiterOpt(value: Option[String]): ListVersionsRequest =
    underlying.withDelimiter(value.orNull)

  // ---

  def maxResultsOpt: Option[Int] = Option(underlying.getMaxResults)

  def maxResultsOpt_=(value: Option[Int]): Unit =
    underlying.setMaxResults(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  def withMaxResultsOpt(value: Option[Int]): ListVersionsRequest =
    underlying.withMaxResults(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  // ---

  def encodingTypeOpt: Option[String] = Option(underlying.getEncodingType)

  def encodingTypeOpt_=(value: Option[String]): Unit =
    underlying.setEncodingType(value.orNull)

  def withEncodingTypeOpt_=(value: Option[String]): ListVersionsRequest =
    underlying.withEncodingType(value.orNull)

}
