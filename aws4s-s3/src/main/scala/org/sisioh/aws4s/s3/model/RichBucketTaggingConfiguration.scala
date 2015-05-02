package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{TagSet, BucketTaggingConfiguration}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichBucketTaggingConfiguration(val underlying: BucketTaggingConfiguration)
  extends AnyVal with PimpedType[BucketTaggingConfiguration] {

  def tagSet: TagSet = underlying.getTagSet

  def tagSets: Seq[TagSet] = underlying.getAllTagSets.asScala

  def tagSets_=(value: Seq[TagSet]): Unit = {
    underlying.setTagSets(value.asJava)
  }

}
