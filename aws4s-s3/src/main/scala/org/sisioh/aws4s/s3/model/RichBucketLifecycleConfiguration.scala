package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.BucketLifecycleConfiguration
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration.Rule
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object BucketLifecycleConfigurationFactory {

  def create(): BucketLifecycleConfiguration = new BucketLifecycleConfiguration()

}

class RichBucketLifecycleConfiguration(val underlying: BucketLifecycleConfiguration)
  extends AnyVal with PimpedType[BucketLifecycleConfiguration] {

  def rulesOpt: Option[Seq[Rule]] = Option(underlying.getRules).map(_.asScala.toVector)

  def rulesOpt_=(value: Option[Seq[Rule]]): Unit = {
    underlying.setRules(value.map(_.asJava).orNull)
  }

}







