package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.UploadPartResult
import org.sisioh.aws4s.PimpedType

object UploadPartResultFactory {

  def create(): UploadPartResult = new UploadPartResult()

}

class RichUploadPartResult(val underlying: UploadPartResult)
    extends AnyVal with PimpedType[UploadPartResult] {

  def partNumber: Int = underlying.getPartNumber

  def partNumber_=(value: Int): Unit =
    underlying.setPartNumber(value)

  // ---

  def eTagOpt: Option[String] = Option(underlying.getETag)

  def eTagOpt_=(value: Option[String]): Unit =
    underlying.setETag(value.orNull)

}
