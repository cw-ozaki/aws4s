package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.ResponseHeaderOverrides
import org.sisioh.aws4s.PimpedType

object ResponseHeaderOverridesFactory {

  def create(): ResponseHeaderOverrides = new ResponseHeaderOverrides()

}

class RichResponseHeaderOverrides(val underlying: ResponseHeaderOverrides)
  extends AnyVal with PimpedType[ResponseHeaderOverrides] {

  def contentTypeOpt = Option(underlying.getContentType)

  def contentLanguageOpt = Option(underlying.getContentLanguage)

  def expiresOpt = Option(underlying.getExpires)

  def cacheControlOpt = Option(underlying.getCacheControl)

  def contentDispositionOpt = Option(underlying.getContentDisposition)

  def contentEncodingOpt = Option(underlying.getContentEncoding)

}
