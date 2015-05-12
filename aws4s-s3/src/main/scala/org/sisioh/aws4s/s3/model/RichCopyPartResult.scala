package org.sisioh.aws4s.s3.model

import java.util.Date

import com.amazonaws.services.s3.model.CopyPartResult
import org.sisioh.aws4s.PimpedType

object CopyPartResultFactory {

  def create(): CopyPartResult = new CopyPartResult()

}

class RichCopyPartResult(val underlying: CopyPartResult)
    extends AnyVal with PimpedType[CopyPartResult] {

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

  def partNumberOpt: Option[Int] = Option(underlying.getPartNumber)

  def partNumberOpt_=(value: Option[Int]): Unit =
    underlying.setPartNumber(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

}
