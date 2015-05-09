package org.sisioh.aws4s.eb.model

import java.util.Date

import com.amazonaws.services.elasticbeanstalk.model.DescribeEventsRequest
import org.sisioh.aws4s.PimpedType

class RichDescribeEventsRequest(val underlying: DescribeEventsRequest)
  extends AnyVal with PimpedType[DescribeEventsRequest] {

  def applicationNameOpt: Option[String] = Option(underlying.getApplicationName)

  def applicationNameOpt_=(value: Option[String]): Unit =
    underlying.setApplicationName(value.orNull)

  def withApplicationNameOpt(value: Option[String]): DescribeEventsRequest =
    underlying.withApplicationName(value.orNull)

  // ---

  def versionLabelOpt: Option[String] = Option(underlying.getVersionLabel)

  def versionLabelOpt_=(value: Option[String]): Unit =
    underlying.setVersionLabel(value.orNull)

  def withVersionLabelOpt(value: Option[String]): DescribeEventsRequest =
    underlying.withVersionLabel(value.orNull)

  // ---

  def templateNameOpt: Option[String] = Option(underlying.getTemplateName)

  def templateNameOpt_=(value: Option[String]): Unit =
    underlying.setTemplateName(value.orNull)

  def withTemplateNameOpt(value: Option[String]): DescribeEventsRequest =
    underlying.withTemplateName(value.orNull)

  // ---

  def environmentIdOpt: Option[String] = Option(underlying.getEnvironmentId)

  def environmentIdOpt_=(value: Option[String]): Unit =
    underlying.setEnvironmentId(value.orNull)

  def withEnvironmentIdOpt(value: Option[String]): DescribeEventsRequest =
    underlying.withEnvironmentId(value.orNull)

  // ---

  def environmentNameOpt: Option[String] = Option(underlying.getEnvironmentName)

  def environmentNameOpt_=(value: Option[String]): Unit =
    underlying.setEnvironmentName(value.orNull)

  def withEnvironmentNameOpt(value: Option[String]): DescribeEventsRequest =
    underlying.withEnvironmentName(value.orNull)

  // ---

  def requestIdOpt: Option[String] = Option(underlying.getRequestId)

  def requestIdOpt_=(value: Option[String]): Unit =
    underlying.setRequestId(value.orNull)

  def withRequestIdOpt(value: Option[String]): DescribeEventsRequest =
    underlying.withRequestId(value.orNull)

  // ---

  def severityOpt: Option[String] = Option(underlying.getSeverity)

  def severityOpt_=(value: Option[String]): Unit =
    underlying.setSeverity(value.orNull)

  def withSeverityOpt(value: Option[String]): DescribeEventsRequest =
    underlying.withSeverity(value.orNull)

  // ---

  def startTimeOpt: Option[Date] = Option(underlying.getStartTime)

  def startTimeOpt_=(value: Option[Date]): Unit =
    underlying.setStartTime(value.orNull)

  def withStartTimeOpt(value: Option[Date]): DescribeEventsRequest =
    underlying.withStartTime(value.orNull)

  // ---

  def endTimeOpt: Option[Date] = Option(underlying.getEndTime)

  def endTimeOpt_=(value: Option[Date]): Unit =
    underlying.setEndTime(value.orNull)

  def withEndTimeOpt(value: Option[Date]): DescribeEventsRequest =
    underlying.withEndTime(value.orNull)

  // ---

  def maxRecordsOpt: Option[Int] = Option(underlying.getMaxRecords)

  def maxRecordsOpt_=(value: Option[Int]): Unit =
    underlying.setMaxRecords(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  def withMaxRecordsOpt(value: Option[Int]): DescribeEventsRequest =
    underlying.withMaxRecords(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  // ---

  def nextTokenOpt: Option[String] = Option(underlying.getNextToken)

  def nextTokenOpt_=(value: Option[String]): Unit =
    underlying.setNextToken(value.orNull)

  def withNextTokenOpt(value: Option[String]): DescribeEventsRequest =
    underlying.withNextToken(value.orNull)

}
