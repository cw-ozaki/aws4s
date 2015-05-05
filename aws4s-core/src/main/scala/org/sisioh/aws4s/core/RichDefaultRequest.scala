package org.sisioh.aws4s.core

import java.io.InputStream
import java.net.URI

import com.amazonaws.DefaultRequest
import com.amazonaws.http.HttpMethodName
import com.amazonaws.util.AWSRequestMetrics
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichDefaultRequest[A](val underlying: DefaultRequest[A])
  extends AnyVal with PimpedType[DefaultRequest[A]] {

  def parameters: Map[String, String] = underlying.getParameters.asScala.toMap

  def headers: Map[String, String] = underlying.getHeaders.asScala.toMap

  def endpointOpt: Option[URI] = Option(underlying.getEndpoint)

  def endpointOpt_=(value: Option[URI]): Unit =
    underlying.setEndpoint(value.orNull)

  def contentOpt: Option[InputStream] = Option(underlying.getContent)

  def contentOpt_=(value: Option[InputStream]): Unit =
    underlying.setContent(value.orNull)

  def httpMethod = underlying.getHttpMethod

  def httpMethod_=(value: HttpMethodName): Unit =
    underlying.setHttpMethod(value)

  def timeOffset: Int = underlying.getTimeOffset

  def timeOffset_=(value: Int): Unit =
    underlying.setTimeOffset(value)

  def resourcePathOpt = Option(underlying.getResourcePath)

  def resourcePathOpt_=(value: Option[String]): Unit =
    underlying.setResourcePath(value.orNull)

  def awsRequestMetricsOpt: Option[AWSRequestMetrics] = Option(underlying.getAWSRequestMetrics)

  def awsRequestMetricsOpt_=(value: Option[AWSRequestMetrics]): Unit =
    underlying.setAWSRequestMetrics(value.orNull)

}
