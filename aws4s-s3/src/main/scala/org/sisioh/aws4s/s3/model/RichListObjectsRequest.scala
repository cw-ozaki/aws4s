package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.ListObjectsRequest
import org.sisioh.aws4s.PimpedType

object ListObjectsRequestFactory {

  def create(): ListObjectsRequest = new ListObjectsRequest()

  def create(bucketName: String, prefix: String, marker: String, delimiter: String, maxKey: Int): ListObjectsRequest =
    new ListObjectsRequest(bucketName, prefix, marker, delimiter, maxKey)

}

class RichListObjectsRequest(val underlying: ListObjectsRequest)
  extends AnyVal with PimpedType[ListObjectsRequest] {

  def bucketNameOpt = Option(underlying.getBucketName)

  def bucketNameOpt_=(value: Option[String]): Unit =
    underlying.setBucketName(value.orNull)

  def withBucketNameOpt(value: Option[String]): ListObjectsRequest =
    underlying.withBucketName(value.orNull)

  // ---

  def prefixOpt: Option[String] = Option(underlying.getPrefix)

  def prefixOpt_=(value: Option[String]): Unit =
    underlying.setPrefix(value.orNull)

  // ---

  def markerOpt: Option[String] = Option(underlying.getMarker)

  def markerOpt_=(value: Option[String]): Unit =
    underlying.setMarker(value.orNull)

  // ---

  def delimiterOpt: Option[String] = Option(underlying.getDelimiter)

  def delimiterOpt_=(value: Option[String]): Unit =
    underlying.setDelimiter(value.orNull)

  // ---

  def maxKeysOpt: Option[Int] = Option(underlying.getMaxKeys)

  def maxKeysOpt_=(value: Option[Int]): Unit =
    underlying.setMaxKeys(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  // ---

  def encodingTypeOpt: Option[String] = Option(underlying.getEncodingType)

  def encodingTypeOpt_=(value: Option[String]): Unit =
    underlying.setEncodingType(value.orNull)

}
