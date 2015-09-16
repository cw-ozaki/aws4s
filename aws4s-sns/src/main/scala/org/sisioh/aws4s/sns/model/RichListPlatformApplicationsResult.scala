package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.{ ListPlatformApplicationsResult, PlatformApplication }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ListPlatformApplicationsResultFactory {
  def create(): ListPlatformApplicationsResult =
    new ListPlatformApplicationsResult()

}

class RichListPlatformApplicationsResult(val underlying: ListPlatformApplicationsResult)
    extends AnyVal with PimpedType[ListPlatformApplicationsResult] {

  def nextTokenOpt: Option[String] = Option(underlying.getNextToken)

  def nextTokenOpt_=(value: Option[String]): Unit =
    underlying.setNextToken(value.orNull)

  def withNextTokenOpt(value: Option[String]): ListPlatformApplicationsResult =
    underlying.withNextToken(value.orNull)

  def platformApplications: Seq[PlatformApplication] =
    underlying.getPlatformApplications.asScala.toVector

  def platformApplications_=(value: Seq[PlatformApplication]): Unit =
    underlying.setPlatformApplications(value.asJava)

  def withPlatformApplications(value: Seq[PlatformApplication]): ListPlatformApplicationsResult =
    underlying.withPlatformApplications(value.asJava)

}
