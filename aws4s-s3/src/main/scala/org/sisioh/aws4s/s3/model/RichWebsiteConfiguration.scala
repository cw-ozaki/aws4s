package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{RoutingRule, WebsiteConfiguration}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object WebsiteConfigurationFactory {

  def create(): WebsiteConfiguration = new WebsiteConfiguration()

}

class RichWebsiteConfiguration(val underlying: WebsiteConfiguration)
  extends AnyVal with PimpedType[WebsiteConfiguration] {

  def indexDocumentSuffixOpt: Option[String] = Option(underlying.getIndexDocumentSuffix)

  def indexDocumentSuffixOpt_=(value: Option[String]): Unit =
    underlying.setIndexDocumentSuffix(value.orNull)

  def withIndexDocumentSuffixOpt(value: Option[String]): WebsiteConfiguration =
    underlying.withIndexDocumentSuffix(value.orNull)

  // ---

  def errorDocumentOpt: Option[String] = Option(underlying.getErrorDocument)

  def errorDocumentOpt_=(value: Option[String]): Unit =
    underlying.setErrorDocument(value.orNull)

  def withErrorDocumentOpt(value: Option[String]): WebsiteConfiguration =
    underlying.witherrorDocument(value.orNull)

  // ---

  def redirectAllRequestsToOpt: Option[String] = Option(underlying.getRedirectAllRequestsTo)

  def redirectAllRequestsToOpt_=(value: Option[String]): Unit =
    underlying.setRedirectAllRequestsTo(value.orNull)

  def withRedirectAllRequestsToOpt(value: Option[String]): WebsiteConfiguration =
    underlying.withRedirectAllRequestsTo(value.orNull)

  // ---

  def routingRules: Seq[RoutingRule] = underlying.getRoutingRule.asScala.toVector

  def routingRules_=(value: Seq[RoutingRule]): Unit =
    underlying.setRoutingRules(value.asJava)

  def withRoutingRules(value: Seq[RoutingRule]): WebsiteConfiguration =
    underlying.withRoutingRule(value.asJava)

}
