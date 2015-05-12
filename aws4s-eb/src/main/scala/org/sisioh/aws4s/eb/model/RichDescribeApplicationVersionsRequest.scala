package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationVersionsRequest
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object DescribeApplicationVersionsRequestFactory {

  def create(): DescribeApplicationVersionsRequest = new DescribeApplicationVersionsRequest()

}

class RichDescribeApplicationVersionsRequest(val underlying: DescribeApplicationVersionsRequest)
  extends AnyVal with PimpedType[DescribeApplicationVersionsRequest] {

  def applicationNameOpt: Option[String] = Option(underlying.getApplicationName)

  def applicationNameOpt_=(value: Option[String]): Unit =
    underlying.setApplicationName(value.orNull)

  def withApplicationNameOpt(value: Option[String]): DescribeApplicationVersionsRequest =
    underlying.withApplicationName(value.orNull)

  // ---

  def versionLabels: Seq[String] = underlying.getVersionLabels.asScala.toVector

  def versionLabels_=(value: Seq[String]): Unit =
    underlying.setVersionLabels(value.asJava)

  def withVersionLabels(value: Seq[String]): DescribeApplicationVersionsRequest =
    underlying.withVersionLabels(value.asJava)

}
