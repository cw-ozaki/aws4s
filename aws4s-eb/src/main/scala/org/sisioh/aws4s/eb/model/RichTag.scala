package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.Tag
import org.sisioh.aws4s.PimpedType

object TagFactory {

  def create(): Tag = new Tag()

}

class RichTag(val underlying: Tag) extends AnyVal with PimpedType[Tag] {

  def keyOpt: Option[String] = Option(underlying.getKey)

  def keyOpt_=(value: Option[String]): Unit =
    underlying.setKey(value.orNull)

  def withKeyOpt(value: Option[String]): Tag =
    underlying.withKey(value.orNull)

  // ---

  def valueOpt: Option[String] = Option(underlying.getValue)

  def valueOpt_=(value: Option[String]): Unit =
    underlying.setValue(value.orNull)

  def withValueOpt(value: Option[String]): Tag =
    underlying.withValue(value.orNull)

}
