package org.sisioh.aws4s.s3.model

import java.util.Date

import com.amazonaws.services.s3.model.CompleteMultipartUploadResult
import org.sisioh.aws4s.PimpedType

object CompleteMultipartUploadResultFactory {

  def create(): CompleteMultipartUploadResult = new CompleteMultipartUploadResult()

}

class RichCompleteMultipartUploadResult(val underlying: CompleteMultipartUploadResult)
    extends AnyVal with PimpedType[CompleteMultipartUploadResult] {

  def bucketNameOpt: Option[String] = Option(underlying.getBucketName)

  def bucketNameOpt_=(value: Option[String]): Unit =
    underlying.setBucketName(value.orNull)

  // ---

  def keyOpt: Option[String] = Option(underlying.getKey)

  def keyOpt_=(value: Option[String]): Unit =
    underlying.setKey(value.orNull)

  // ---

  def locationOpt = Option(underlying.getLocation)

  def locationOpt_=(value: Option[String]): Unit =
    underlying.setLocation(value.orNull)

  // ---

  def eTagOpt: Option[String] = Option(underlying.getETag)

  def eTagOpt_=(value: Option[String]): Unit =
    underlying.setETag(value.orNull)

  // ---

  def versionIdOpt: Option[String] = Option(underlying.getVersionId)

  def versionIdOpt_=(value: Option[String]): Unit =
    underlying.setVersionId(value.orNull)

  // ---

  def expirationTimeOpt: Option[Date] = Option(underlying.getExpirationTime)

  def expirationTimeOpt_=(value: Option[Date]): Unit =
    underlying.setExpirationTime(value.orNull)

  // ---

  def expirationTimeRuleIdOpt: Option[String] = Option(underlying.getExpirationTimeRuleId)

  def expirationTimeRuleIdOpt_=(value: Option[String]): Unit =
    underlying.setExpirationTimeRuleId(value.orNull)

}
