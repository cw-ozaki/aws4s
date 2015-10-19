package org.sisioh.aws4s.core

import com.amazonaws.AmazonWebServiceClient
import com.amazonaws.metrics.RequestMetricCollector
import com.amazonaws.regions.{ Region, Regions }
import org.sisioh.aws4s.PimpedType

class RichAmazonWebServiceClient(val underlying: AmazonWebServiceClient)
    extends AnyVal with PimpedType[AmazonWebServiceClient] {

  def region_=(value: Region): Unit =
    underlying.setRegion(value)

  def endpoint_=(value: String): Unit =
    underlying.setEndpoint(value)

  def serviceNameOpt: Option[String] = Option(underlying.getServiceName)

  def serviceNameIntern(value: String): Unit =
    underlying.setServiceNameIntern(value)

  def signerRegionOverrideOpt: Option[String] = Option(underlying.getSignerRegionOverride)

  def signerRegionOverrideOpt(value: Option[String]): Unit =
    underlying.setSignerRegionOverride(value.orNull)

  def timeOffset: Int = underlying.getTimeOffset

  def timeOffset_=(value: Int): Unit =
    underlying.setTimeOffset(value)

  def requestMetricsCollectorOpt: Option[RequestMetricCollector] =
    Option(underlying.getRequestMetricsCollector)

}
