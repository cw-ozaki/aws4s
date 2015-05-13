package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.RedirectRule
import org.sisioh.aws4s.PimpedType

object RedirectRuleFactory {

  def create(): RedirectRule = new RedirectRule()

}

class RichRedirectRule(val underlying: RedirectRule)
    extends AnyVal with PimpedType[RedirectRule] {

  def protocolOpt: Option[String] = Option(underlying.getprotocol())

  def protocolOpt_=(value: Option[String]): Unit =
    underlying.setProtocol(value.orNull)

  def withProtocolOpt(value: Option[String]): RedirectRule =
    underlying.withProtocol(value.orNull)

  // ---

  def hostNameOpt: Option[String] = Option(underlying.getHostName)

  def hostNameOpt_=(value: Option[String]): Unit =
    underlying.setHostName(value.orNull)

  def withHostNameOpt(value: Option[String]): RedirectRule =
    underlying.withHostName(value.orNull)

  // ---

  def replaceKeyPrefixWithOpt: Option[String] = Option(underlying.getReplaceKeyPrefixWith)

  def replaceKeyPrefixWithOpt_=(value: Option[String]): Unit =
    underlying.setReplaceKeyPrefixWith(value.orNull)

  def withReplaceKeyPrefixWithOpt(value: Option[String]): RedirectRule =
    underlying.withReplaceKeyPrefixWith(value.orNull)

  // ---

  def replaceKeyWithOpt: Option[String] = Option(underlying.getReplaceKeyWith)

  def replaceKeyWithOpt_=(value: Option[String]): Unit =
    underlying.setReplaceKeyWith(value.orNull)

  def withReplaceKeyWithOpt(value: Option[String]): RedirectRule =
    underlying.withReplaceKeyWith(value.orNull)

  // ---

  def httpRedirectCodeOpt: Option[String] = Option(underlying.getHttpRedirectCode)

  def httpRedirectCodeOpt_=(value: Option[String]): Unit =
    underlying.setHttpRedirectCode(value.orNull)

  def withHttpRedirectCodeOpt(value: Option[String]): RedirectRule =
    underlying.withHttpRedirectCode(value.orNull)

}
