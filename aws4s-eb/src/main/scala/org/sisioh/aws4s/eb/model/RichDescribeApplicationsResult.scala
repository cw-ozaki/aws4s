package org.sisioh.aws4s.eb.model


import com.amazonaws.services.elasticbeanstalk.model.{ApplicationDescription, DescribeApplicationsResult}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object DescribeApplicationsResultFactory {

  def create(): DescribeApplicationsResult = new DescribeApplicationsResult()

}

class RichDescribeApplicationsResult(val underlying: DescribeApplicationsResult)
  extends AnyVal with PimpedType[DescribeApplicationsResult] {

  def applications: Seq[ApplicationDescription] = underlying.getApplications.asScala.toVector

  def applications_=(value: Seq[ApplicationDescription]): Unit =
    underlying.setApplications(value.asJava)

  def withApplications(value: Seq[ApplicationDescription]): DescribeApplicationsResult =
    underlying.withApplications(value.asJava)

}
