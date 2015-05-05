package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationsRequest
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichDescribeApplicationsRequest(val underlying: DescribeApplicationsRequest)
  extends AnyVal with PimpedType[DescribeApplicationsRequest] {

  def applicationNames: Seq[String] = underlying.getApplicationNames.asScala

  def applicationNames_=(value: Seq[String]): Unit =
    underlying.setApplicationNames(value.asJava)

  def wihApplicationNames(value: Seq[String]): DescribeApplicationsRequest =
    underlying.withApplicationNames(value.asJava)

}
