package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.TagSet
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichTagSet(val underlying: TagSet)
  extends AnyVal with PimpedType[TagSet] {

  def allTags: Map[String, String] = underlying.getAllTags.asScala.toMap


}
