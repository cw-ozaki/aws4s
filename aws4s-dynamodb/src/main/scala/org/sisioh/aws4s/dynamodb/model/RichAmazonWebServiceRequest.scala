package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.auth.AWSCredentials
import com.amazonaws.event.ProgressListener
import com.amazonaws.metrics.RequestMetricCollector
import com.amazonaws.{AmazonWebServiceRequest, RequestClientOptions}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichAmazonWebServiceRequest(val underlying: AmazonWebServiceRequest) extends AnyVal with PimpedType[AmazonWebServiceRequest] {

  def requestCredentialsOpt_=(value: Option[AWSCredentials]): Unit = underlying.setRequestCredentials(value.orNull)

  def requestCredentialsOpt: Option[AWSCredentials] = Option(underlying.getRequestCredentials)

  def requestClientOptions: RequestClientOptions = underlying.getRequestClientOptions

  def readLimit: Int = underlying.getReadLimit

  def customRequestHeadersOpt: Option[Map[String, String]] = Option(underlying.getCustomRequestHeaders).map(_.asScala.toMap)

  def requestMetricCollectorOpt_=(value: Option[RequestMetricCollector]): Unit = underlying.setRequestMetricCollector(value.orNull)

  def requestMetricCollectorOpt: Option[RequestMetricCollector] = Option(underlying.getRequestMetricCollector)

  def generalProgressListenerOpt_=(value: Option[ProgressListener]): Unit = underlying.setGeneralProgressListener(value.orNull)

  def generalProgressListenerOpt: Option[ProgressListener] = Option(underlying.getGeneralProgressListener)

}
