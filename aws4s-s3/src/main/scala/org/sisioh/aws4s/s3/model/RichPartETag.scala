package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.PartETag
import org.sisioh.aws4s.PimpedType

class RichPartETag(val underlying: PartETag)
  extends AnyVal with PimpedType[PartETag] {

  def partNumber: Int = underlying.getPartNumber

  def partNumber_=(value: Int): Unit =
    underlying.setPartNumber(value)

  // ---

  def eTag: String = underlying.getETag

  def eTag_=(value: String): Unit =
    underlying.setETag(value)

}
