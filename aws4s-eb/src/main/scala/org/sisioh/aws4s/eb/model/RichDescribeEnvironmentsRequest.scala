package org.sisioh.aws4s.eb.model

import java.util.Date

import com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsRequest
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object DescribeEnvironmentsRequestFactory {

  def create(): DescribeEnvironmentsRequest = new DescribeEnvironmentsRequest()

}

class RichDescribeEnvironmentsRequest(val underlying: DescribeEnvironmentsRequest)
    extends AnyVal with PimpedType[DescribeEnvironmentsRequest] {

  def applicationNameOpt: Option[String] = Option(underlying.getApplicationName)

  def applicationNameOpt_=(value: Option[String]): Unit =
    underlying.setApplicationName(value.orNull)

  def withApplicationNameOpt(value: Option[String]): DescribeEnvironmentsRequest =
    underlying.withApplicationName(value.orNull)

  // ---

  def versionLabelOpt: Option[String] = Option(underlying.getVersionLabel)

  def versionLabelOpt_=(value: Option[String]): Unit =
    underlying.setVersionLabel(value.orNull)

  def withVersionLabelOpt(value: Option[String]): DescribeEnvironmentsRequest =
    underlying.withVersionLabel(value.orNull)

  // ---

  def environmentIds: Seq[String] = underlying.getEnvironmentIds.asScala.toVector

  def environmentIds_=(value: Seq[String]): Unit =
    underlying.setEnvironmentIds(value.asJava)

  def withEnvironmentIds(value: Seq[String]): DescribeEnvironmentsRequest =
    underlying.withEnvironmentIds(value.asJava)

  // ---

  def environmentNames: Seq[String] = underlying.getEnvironmentNames.asScala.toVector

  def environmentNames_=(value: Seq[String]): Unit =
    underlying.setEnvironmentNames(value.asJava)

  def withEnvironmentNames(value: Seq[String]): DescribeEnvironmentsRequest =
    underlying.withEnvironmentNames(value.asJava)

  // ---

  def includeDeletedOpt: Option[Boolean] = Option(underlying.getIncludeDeleted)

  def includeDeletedOpt_=(value: Option[Boolean]): Unit =
    underlying.setIncludeDeleted(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  def withIncludeDeletedOpt(value: Option[Boolean]): DescribeEnvironmentsRequest =
    underlying.withIncludeDeleted(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  // ---

  def includedDeletedBackToOpt: Option[Date] = Option(underlying.getIncludedDeletedBackTo)

  def includedDeletedBackToOpt_=(value: Option[Date]): Unit =
    underlying.setIncludedDeletedBackTo(value.orNull)

  def withIncludedDeletedBackToOpt(value: Option[Date]): DescribeEnvironmentsRequest =
    underlying.withIncludedDeletedBackTo(value.orNull)

}
