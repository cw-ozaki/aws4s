package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.{DescribeEnvironmentResourcesResult, EnvironmentResourceDescription}
import org.sisioh.aws4s.PimpedType

object DescribeEnvironmentResourcesResultFactory {

  def create(): DescribeEnvironmentResourcesResult = new DescribeEnvironmentResourcesResult()

}

class RichDescribeEnvironmentResourcesResult(val underlying: DescribeEnvironmentResourcesResult)
  extends AnyVal with PimpedType[DescribeEnvironmentResourcesResult] {

  def environmentResourcesOpt: Option[EnvironmentResourceDescription] = Option(underlying.getEnvironmentResources)

  def environmentResourcesOpt_=(value: Option[EnvironmentResourceDescription]): Unit =
    underlying.setEnvironmentResources(value.orNull)

  def withEnvironmentResourcesOpt(value: Option[EnvironmentResourceDescription]) =
    underlying.withEnvironmentResources(value.orNull)

}
