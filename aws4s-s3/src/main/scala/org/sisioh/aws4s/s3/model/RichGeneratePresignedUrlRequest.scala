package org.sisioh.aws4s.s3.model

import java.util.Date

import com.amazonaws.HttpMethod
import com.amazonaws.services.s3.model.{GeneratePresignedUrlRequest, ResponseHeaderOverrides, SSECustomerKey}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object GeneratePresignedUrlRequestFactory {

  def create(bucketName: String, key: String): GeneratePresignedUrlRequest =
    new GeneratePresignedUrlRequest(bucketName, key)

  def create(bucketName: String, key: String, method: HttpMethod): GeneratePresignedUrlRequest =
    new GeneratePresignedUrlRequest(bucketName, key, method)

}

class RichGeneratePresignedUrlRequest(val underlying: GeneratePresignedUrlRequest)
  extends AnyVal with PimpedType[GeneratePresignedUrlRequest] {

  def method = underlying.getMethod

  def method_=(value: HttpMethod): Unit =
    underlying.setMethod(value)

  // ---

  def bucketName: String = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)

  // ---

  def key: String = underlying.getKey

  def key_=(value: String): Unit =
    underlying.setKey(value)

  // ---

  def contentTypeOpt = Option(underlying.getContentType)

  def contentTypeOpt_=(value: Option[String]): Unit =
    underlying.setContentType(value.orNull)

  def withContentTypeOpt(value: Option[String]): GeneratePresignedUrlRequest =
    underlying.withContentType(value.orNull)

  // ---

  def contentMd5Opt = Option(underlying.getContentMd5)

  def contentMd5Opt_=(value: Option[String]): Unit =
    underlying.setContentMd5(value.orNull)

  def withContentMd5Opt(value: Option[String]): GeneratePresignedUrlRequest =
    underlying.withContentMd5(value.orNull)

  // ---

  def expirationOpt: Option[Date] = Option(underlying.getExpiration)

  def expirationOpt_=(value: Option[Date]): Unit =
    underlying.setExpiration(value.orNull)

  def withExpirationOpt(value: Option[Date]): GeneratePresignedUrlRequest =
    underlying.withExpiration(value.orNull)

  // ---

  def requestParametersOpt: Option[Map[String, String]] = Option(underlying.getRequestParameters.asScala.toMap)

  // ---

  def responseHeadersOpt: Option[ResponseHeaderOverrides] = Option(underlying.getResponseHeaders)

  def responseHeadersOpt(value: Option[ResponseHeaderOverrides]): Unit =
    underlying.setResponseHeaders(value.orNull)

  def withResponseHeadersOpt(value: Option[ResponseHeaderOverrides]): GeneratePresignedUrlRequest =
    underlying.withResponseHeaders(value.orNull)

  // ---

  def sseCustomerKeyOpt: Option[SSECustomerKey] = Option(underlying.getSSECustomerKey)

  def sseCustomerKeyOpt_=(value: Option[SSECustomerKey]): Unit =
    underlying.setSSECustomerKey(value.orNull)

  def withSseCustomerKeyOpt(value: Option[SSECustomerKey]): GeneratePresignedUrlRequest =
    underlying.withSSECustomerKey(value.orNull)

}
