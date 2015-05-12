package org.sisioh.aws4s.s3.model

import java.util.Date

import com.amazonaws.services.s3.model.PartSummary
import org.sisioh.aws4s.PimpedType

object PartSummaryFactory {

  def create(): PartSummary = new PartSummary()

}


class RichPartSummary(val underlying: PartSummary)
  extends AnyVal with PimpedType[PartSummary] {

  def partNumberOpt: Option[Int] = Option(underlying.getPartNumber)

  def partNumberOpt_=(value: Option[Int]): Unit =
    underlying.setPartNumber(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  // ---

  def lastModifiedOpt: Option[Date] = Option(underlying.getLastModified)

  def lastModifiedOpt_=(value: Option[Date]): Unit =
    underlying.setLastModified(value.orNull)

  // ---

  def eTagOpt: Option[String] = Option(underlying.getETag)

  def eTagOpt_=(value: Option[String]): Unit =
    underlying.setETag(value.orNull)

  // ---

  def sizeOpt = Option(underlying.getSize)

  def sizeOpt_=(value: Option[Long]): Unit =
    underlying.setSize(value.map(_.asInstanceOf[java.lang.Long]).orNull)

}
