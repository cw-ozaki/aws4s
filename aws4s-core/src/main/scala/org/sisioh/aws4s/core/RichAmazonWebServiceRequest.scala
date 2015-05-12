package org.sisioh.aws4s.core

import com.amazonaws.auth.AWSCredentials
import com.amazonaws.event.ProgressListener
import com.amazonaws.metrics.RequestMetricCollector
import com.amazonaws.{ AmazonWebServiceRequest, RequestClientOptions }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichAmazonWebServiceRequest(val underlying: AmazonWebServiceRequest)
    extends AnyVal with PimpedType[AmazonWebServiceRequest] {

  def generalProgressListener: ProgressListener = underlying.getGeneralProgressListener

  def generalProgressListener_=(value: ProgressListener): Unit =
    underlying.setGeneralProgressListener(value)

  def requestClientOptions: RequestClientOptions = underlying.getRequestClientOptions

  def requestMetricCollectorOpt: Option[RequestMetricCollector] = Option(underlying.getRequestMetricCollector)

  def requestMetricCollectorOpt_=(value: Option[RequestMetricCollector]): Unit =
    underlying.setRequestMetricCollector(value.orNull)

  def requestCredentialsOpt: Option[AWSCredentials] = Option(underlying.getRequestCredentials)

  def requestCredentialsOpt_=(value: Option[AWSCredentials]): Unit =
    underlying.setRequestCredentials(value.orNull)

  def customRequestHeadersOpt: Option[Map[String, String]] = Option(underlying.getCustomRequestHeaders).map(_.asScala.toMap)

  def readLimit = underlying.getReadLimit

  def copyPrivateRequestParameters: Map[String, String] = underlying.copyPrivateRequestParameters().asScala.toMap

}
