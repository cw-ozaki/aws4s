package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.ListPartsRequest
import org.sisioh.aws4s.PimpedType

object ListPartsRequestFactory {

  def create(bucketName: String, key: String, uploadId: String): ListPartsRequest =
    new ListPartsRequest(bucketName, key, uploadId)

}

class RichListPartsRequest(val underlying: ListPartsRequest)
  extends AnyVal with PimpedType[ListPartsRequest] {

  def bucketName: String = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)

  // ---

  def key: String = underlying.getKey

  def key_=(value: String): Unit =
    underlying.setKey(value)

  // ---

  def uploadId: String = underlying.getUploadId

  def uploadId_=(value: String): Unit =
    underlying.setUploadId(value)

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

}
