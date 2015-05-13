package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.{DescribeEnvironmentsResult, EnvironmentDescription}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object DescribeEnvironmentsResultFactory {

  def create(): DescribeEnvironmentsResult = new DescribeEnvironmentsResult()

}

class RichDescribeEnvironmentsResult(val underlying: DescribeEnvironmentsResult)
    extends AnyVal with PimpedType[DescribeEnvironmentsResult] {

  def environments: Seq[EnvironmentDescription] = underlying.getEnvironments.asScala.toVector

  def environments_=(value: Seq[EnvironmentDescription]): Unit =
    underlying.setEnvironments(value.asJava)

  def withEnvironments(value: Seq[EnvironmentDescription]): DescribeEnvironmentsResult =
    underlying.withEnvironments(value.asJava)

}
