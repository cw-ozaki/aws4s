package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model.Tag
import org.sisioh.aws4s.PimpedType

class RichTag(val underlying: Tag)
  extends AnyVal with PimpedType[Tag] {

  def keyOpt: Option[String] = Option(underlying.getKey)

  def keyOpt_=(value: Option[String]): Unit =
    underlying.setKey(value.orNull)

  def withKeyOpt(value: Option[String]): Tag =
    underlying.withKey(value.orNull)

  // ---

  def valueOpt = Option(underlying.getValue)

  def valueOpt_=(value: Option[String]): Unit =
    underlying.setValue(value.orNull)

  def withValueOpt(value: Option[String]): Tag =
    underlying.withValue(value.orNull)

}
