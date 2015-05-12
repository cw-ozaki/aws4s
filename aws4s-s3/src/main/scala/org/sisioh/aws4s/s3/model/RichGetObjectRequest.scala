package org.sisioh.aws4s.s3.model

import java.util.Date

import com.amazonaws.services.s3.model.{GetObjectRequest, ResponseHeaderOverrides, S3ObjectId}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object GetObjectRequestFactory {

  def create(bucketName: String, key: String): GetObjectRequest =
    new GetObjectRequest(bucketName, key)

  def create(bucketName: String, key: String, versionId: String): GetObjectRequest =
    new GetObjectRequest(bucketName, key, versionId)

  def create(s3ObjectId: S3ObjectId): GetObjectRequest =
    new GetObjectRequest(s3ObjectId)

  def create(bucketName: String, key: String, isRequesterPays: Boolean): GetObjectRequest =
    new GetObjectRequest(bucketName, key, isRequesterPays)

}

class RichGetObjectRequest(val underlying: GetObjectRequest)
  extends AnyVal with PimpedType[GetObjectRequest] {

  def bucketName = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)

  def withBucketName(value: String): GetObjectRequest =
    underlying.withBucketName(value)

  // ---

  def key: String = underlying.getKey

  def key_=(value: String): Unit =
    underlying.setKey(value)

  def withKey(value: String): GetObjectRequest =
    underlying.withKey(value)

  // ---

  def versionIdOpt: Option[String] = Option(underlying.getVersionId)

  def versionIdOpt_=(value: Option[String]): Unit =
    underlying.setVersionId(value.orNull)

  def withVersionIdOpt(value: Option[String]): GetObjectRequest =
    underlying.withVersionId(value.orNull)

  // ---

  def range: Option[Array[Long]] = Option(underlying.getRange)

  def matchingETagConstraints: Seq[String] = underlying.getMatchingETagConstraints.asScala

  def nonmatchingETagConstraints: Seq[String] = underlying.getNonmatchingETagConstraints.asScala

  def unmodifiedSinceConstraintOpt: Option[Date] = Option(underlying.getUnmodifiedSinceConstraint)

  def modifiedSinceConstraintOpt: Option[Date] = Option(underlying.getModifiedSinceConstraint)

  def responseHeadersOpt: Option[ResponseHeaderOverrides] = Option(underlying.getResponseHeaders)

  def requesterPays: Boolean = underlying.isRequesterPays

  def sseCustomerKeyOpt = Option(underlying.getSSECustomerKey)

  def s3ObjectIdOpt = Option(underlying.getS3ObjectId)
}
