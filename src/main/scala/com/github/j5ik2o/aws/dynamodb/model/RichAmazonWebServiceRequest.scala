package com.github.j5ik2o.aws.dynamodb.model

import com.amazonaws.auth.AWSCredentials
import com.amazonaws.event.ProgressListener
import com.amazonaws.metrics.RequestMetricCollector
import com.amazonaws.{AmazonWebServiceRequest, RequestClientOptions}
import com.github.j5ik2o.aws.PimpedType

import scala.collection.JavaConverters._

class RichAmazonWebServiceRequest(val underlying: AmazonWebServiceRequest) extends AnyVal with PimpedType[AmazonWebServiceRequest] {

  def requestCredentials_=(value: AWSCredentials): Unit = underlying.setRequestCredentials(value)

  def requestCredentials: AWSCredentials = underlying.getRequestCredentials

  def requestClientOptions: RequestClientOptions = underlying.getRequestClientOptions

  def readLimit: Int = underlying.getReadLimit

  def customRequestHeaders: Map[String, String] = underlying.getCustomRequestHeaders.asScala.toMap

  def requestMetricCollector_=(value: RequestMetricCollector): Unit = underlying.setRequestMetricCollector(value)

  def requestMetricCollector: RequestMetricCollector = underlying.getRequestMetricCollector

  def generalProgressListener_=(value: ProgressListener): Unit = underlying.setGeneralProgressListener(value)

  def generalProgressListener: ProgressListener = underlying.getGeneralProgressListener

}
