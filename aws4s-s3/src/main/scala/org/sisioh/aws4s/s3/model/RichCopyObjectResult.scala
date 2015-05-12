package org.sisioh.aws4s.s3.model

import java.util.Date

import com.amazonaws.services.s3.model.CopyObjectResult
import org.sisioh.aws4s.PimpedType

object CopyObjectResultFactory {

  def create(): CopyObjectResult = new CopyObjectResult()

}

class RichCopyObjectResult(val underlying: CopyObjectResult)
    extends AnyVal with PimpedType[CopyObjectResult] {

  def eTagOpt: Option[String] = Option(underlying.getETag)

  def eTagOpt_=(value: Option[String]): Unit =
    underlying.setETag(value.orNull)

  // ---

  def lastModifiedDateOpt: Option[Date] = Option(underlying.getLastModifiedDate)

  def lastModifiedDateOpt(value: Option[Date]): Unit =
    underlying.setLastModifiedDate(value.orNull)

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
