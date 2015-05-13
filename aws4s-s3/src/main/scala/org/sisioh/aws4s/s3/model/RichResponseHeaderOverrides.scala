package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.ResponseHeaderOverrides
import org.sisioh.aws4s.PimpedType

object ResponseHeaderOverridesFactory {

  def create(): ResponseHeaderOverrides = new ResponseHeaderOverrides()

}

class RichResponseHeaderOverrides(val underlying: ResponseHeaderOverrides)
  extends AnyVal with PimpedType[ResponseHeaderOverrides] {

  def contentTypeOpt: Option[String] = Option(underlying.getContentType)

  def contentTypeOpt_=(value: Option[String]): Unit =
    underlying.setContentType(value.orNull)

  def withContentTypeOpt(value: Option[String]): ResponseHeaderOverrides =
    underlying.withContentType(value.orNull)

  // ---

  def contentLanguageOpt: Option[String] = Option(underlying.getContentLanguage)

  def contentLanguageOpt_=(value: Option[String]): Unit =
    underlying.setContentLanguage(value.orNull)

  def withContentLanguageOpt(value: Option[String]): ResponseHeaderOverrides =
    underlying.withContentLanguage(value.orNull)

  // ---

  def expiresOpt: Option[String] = Option(underlying.getExpires)

  def expiresOpt_=(value: Option[String]): Unit =
    underlying.setExpires(value.orNull)

  def withExpiresOpt(value: Option[String]): ResponseHeaderOverrides =
    underlying.withExpires(value.orNull)

  // ---

  def cacheControlOpt: Option[String] = Option(underlying.getCacheControl)

  def cacheControlOpt_=(value: Option[String]): Unit =
    underlying.setCacheControl(value.orNull)

  def withCacheControlOpt(value: Option[String]): ResponseHeaderOverrides =
    underlying.withCacheControl(value.orNull)

  // ---

  def contentDispositionOpt: Option[String] = Option(underlying.getContentDisposition)

  def contentDispositionOpt_=(value: Option[String]): Unit =
    underlying.setContentDisposition(value.orNull)

  def withContentDispositionOpt(value: Option[String]): ResponseHeaderOverrides =
    underlying.withContentDisposition(value.orNull)

  // ---

  def contentEncodingOpt: Option[String] = Option(underlying.getContentEncoding)

  def contentEncodingOpt_=(value: Option[String]): Unit =
    underlying.setContentEncoding(value.orNull)

  def withContentEncodingOpt(value: Option[String]): ResponseHeaderOverrides =
    underlying.withContentEncoding(value.orNull)

}
