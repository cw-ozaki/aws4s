package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.{ Endpoint, ListEndpointsByPlatformApplicationResult }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ListEndpointsByPlatformApplicationResultFactory {

  def create(): ListEndpointsByPlatformApplicationResult = new ListEndpointsByPlatformApplicationResult()

}

class RichListEndpointsByPlatformApplicationResult(val underlying: ListEndpointsByPlatformApplicationResult)
    extends AnyVal with PimpedType[ListEndpointsByPlatformApplicationResult] {

  def endpoints: Seq[Endpoint] =
    underlying.getEndpoints.asScala.toVector

  def endpoints_=(value: Seq[Endpoint]): Unit =
    underlying.setEndpoints(value.asJava)

  def withEndpoints(value: Seq[Endpoint]): ListEndpointsByPlatformApplicationResult =
    underlying.withEndpoints(value.asJava)

  def nextTokenOpt: Option[String] = Option(underlying.getNextToken)

  def nextTokenOpt_=(value: Option[String]): Unit =
    underlying.setNextToken(value.orNull)

  def withNextTokenOpt(value: Option[String]): ListEndpointsByPlatformApplicationResult =
    underlying.withNextToken(value.orNull)
}
