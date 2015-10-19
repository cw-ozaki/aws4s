package org.sisioh.aws4s.elasticache

import com.amazonaws.services.elasticache.AmazonElastiCacheClient
import com.amazonaws.services.elasticache.model.{EngineDefaults, DescribeEngineDefaultParametersRequest}
import org.sisioh.aws4s.elasticache.model.{RichEngineDefaults, RichDescribeEngineDefaultParametersRequest}

object Implicits

trait Implicits {
  implicit def richAmazonSQSClient(underlying: AmazonElastiCacheClient): RichAmazonElastiCacheClient = new RichAmazonElastiCacheClient(underlying)
}

trait ModelImplicits {

  implicit def richDescribeEngineDefaultParametersRequest(underlying: DescribeEngineDefaultParametersRequest): RichDescribeEngineDefaultParametersRequest = new RichDescribeEngineDefaultParametersRequest(underlying)

  implicit def richEngineDefaults(underlying: EngineDefaults): RichEngineDefaults = new RichEngineDefaults(underlying)

}
