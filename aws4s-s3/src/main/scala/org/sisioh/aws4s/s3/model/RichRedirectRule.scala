package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.RedirectRule
import org.sisioh.aws4s.PimpedType

object RedirectRuleFactory {

  def create(): RedirectRule = new RedirectRule()

}

class RichRedirectRule(val underlying: RedirectRule)
    extends AnyVal with PimpedType[RedirectRule] {

  def protocolOpt = Option(underlying.getprotocol())

  def hostNameOpt = Option(underlying.getHostName)

  def replaceKeyPrefixWithOpt = Option(underlying.getReplaceKeyPrefixWith)

  def replaceKeyWithOpt = Option(underlying.getReplaceKeyWith)

  def httpRedirectCodeOpt = Option(underlying.getHttpRedirectCode)

}
