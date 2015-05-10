package org.sisioh.aws4s.core

import com.amazonaws.{ResponseMetadata, AmazonWebServiceResponse}
import org.sisioh.aws4s.PimpedType

class RichAmazonWebServiceResponse[A](val underlying: AmazonWebServiceResponse[A])
  extends AnyVal with PimpedType[AmazonWebServiceResponse[A]] {

  def resultOpt: Option[A] = Option(underlying.getResult)

  def resultOpt_=(value: Option[A]): Unit =
    underlying.setResult(value.getOrElse(null.asInstanceOf[A]))

  def responseMetadataOpt = Option(underlying.getResponseMetadata)

  def responseMetadataOpt_=(value: Option[ResponseMetadata]): Unit =
    underlying.setResponseMetadata(value.orNull)

  def requestIdOpt: Option[String] = Option(underlying.getRequestId)

}
