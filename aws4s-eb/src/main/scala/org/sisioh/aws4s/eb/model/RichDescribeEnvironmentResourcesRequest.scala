package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentResourcesRequest
import org.sisioh.aws4s.PimpedType

object DescribeEnvironmentResourcesRequestFactory {

  def create(): DescribeEnvironmentResourcesRequest = new DescribeEnvironmentResourcesRequest()

}

class RichDescribeEnvironmentResourcesRequest(val underlying: DescribeEnvironmentResourcesRequest)
    extends AnyVal with PimpedType[DescribeEnvironmentResourcesRequest] {

  def environmentIdOpt: Option[String] = Option(underlying.getEnvironmentId)

  def environmentIdOpt_=(value: Option[String]): Unit =
    underlying.setEnvironmentId(value.orNull)

  def withEnvironmentIdOpt(value: Option[String]): DescribeEnvironmentResourcesRequest =
    underlying.withEnvironmentId(value.orNull)

  // ---

  def environmentNameOpt: Option[String] = Option(underlying.getEnvironmentName)

  def environmentNameOpt_=(value: Option[String]): Unit =
    underlying.setEnvironmentName(value.orNull)

  def withEnvironmentNameOpt(value: Option[String]): DescribeEnvironmentResourcesRequest =
    underlying.withEnvironmentName(value.orNull)

}
