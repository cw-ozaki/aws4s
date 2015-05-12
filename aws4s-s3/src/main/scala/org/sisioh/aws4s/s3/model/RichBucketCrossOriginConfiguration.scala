package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{CORSRule, BucketCrossOriginConfiguration}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object BucketCrossOriginConfigurationFactory {

  def create() = new BucketCrossOriginConfiguration()

}

class RichBucketCrossOriginConfiguration(val underlying: BucketCrossOriginConfiguration)
  extends AnyVal with PimpedType[BucketCrossOriginConfiguration] {

  def rulesOpt: Option[Seq[CORSRule]] = Option(underlying.getRules).map(_.asScala.toVector)

  def rulesOpt_=(value: Option[Seq[CORSRule]]): Unit = {
    underlying.setRules(value.map(_.asJava).orNull)
  }

  def withRules(value: Seq[CORSRule]): BucketCrossOriginConfiguration =
    underlying.withRules(value.asJava)

}
