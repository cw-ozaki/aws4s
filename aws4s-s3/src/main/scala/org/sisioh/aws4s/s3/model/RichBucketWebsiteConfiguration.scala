package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{BucketWebsiteConfiguration, RoutingRule}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object BucketWebsiteConfigurationFactory {

  def create(): BucketWebsiteConfiguration = new BucketWebsiteConfiguration()

  def create(indexDocumentSuffix: String): BucketWebsiteConfiguration =
    new BucketWebsiteConfiguration(indexDocumentSuffix)

}

class RichBucketWebsiteConfiguration(val underlying: BucketWebsiteConfiguration)
  extends AnyVal with PimpedType[BucketWebsiteConfiguration] {

  def indexDocumentSuffixOpt = Option(underlying.getIndexDocumentSuffix)

  def errorDocumentOpt = Option(underlying.getErrorDocument)

  def redirectAllRequestsToOpt = Option(underlying.getRedirectAllRequestsTo)

  def routingRules: Seq[RoutingRule] = underlying.getRoutingRules.asScala

}
