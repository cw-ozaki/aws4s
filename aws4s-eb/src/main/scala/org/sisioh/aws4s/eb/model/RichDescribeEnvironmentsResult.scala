package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.{DescribeEnvironmentsResult, EnvironmentDescription}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichDescribeEnvironmentsResult(val underlying: DescribeEnvironmentsResult)
  extends AnyVal with PimpedType[DescribeEnvironmentsResult] {

  def environments: Seq[EnvironmentDescription] = underlying.getEnvironments.asScala

  def environments_=(value: Seq[EnvironmentDescription]): Unit =
    underlying.setEnvironments(value.asJava)

  def withEnvironments(value: Seq[EnvironmentDescription]): DescribeEnvironmentsResult =
    underlying.withEnvironments(value.asJava)

}
