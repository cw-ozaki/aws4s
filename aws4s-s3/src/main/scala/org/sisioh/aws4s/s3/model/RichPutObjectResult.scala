package org.sisioh.aws4s.s3.model

import java.util.Date

import com.amazonaws.services.s3.model.PutObjectResult
import org.sisioh.aws4s.PimpedType

object PutObjectResultFactory {

  def create(): PutObjectResult = new PutObjectResult()

}

class RichPutObjectResult(val underlying: PutObjectResult)
  extends AnyVal with PimpedType[PutObjectResult] {

  def versionIdOpt: Option[String] = Option(underlying.getVersionId)

  def versionIdOpt_=(value: Option[String]): Unit =
    underlying.setVersionId(value.orNull)

  // ---

  def eTagOpt: Option[String] = Option(underlying.getETag)

  def eTagOpt_=(value: Option[String]): Unit =
    underlying.setETag(value.orNull)

  // ---

  def expirationTimeOpt: Option[Date] = Option(underlying.getExpirationTime)

  def expirationTimeOpt_=(value: Option[Date]): Unit =
    underlying.setExpirationTime(value.orNull)

  // ---

  def expirationTimeRuleIdOpt: Option[String] = Option(underlying.getExpirationTimeRuleId)

  def expirationTimeRuleIdOpt_=(value: Option[String]): Unit =
    underlying.setExpirationTimeRuleId(value.orNull)

  // ---

  def contentMd5Opt = Option(underlying.getContentMd5)

  def contentMd5Opt_=(value: Option[String]): Unit =
    underlying.setContentMd5(value.orNull)

}
