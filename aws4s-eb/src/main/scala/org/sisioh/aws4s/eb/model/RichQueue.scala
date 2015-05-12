package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.Queue
import org.sisioh.aws4s.PimpedType

object QueueFactory {

  def create(): Queue = new Queue()

}

class RichQueue(val underlying: Queue)
    extends AnyVal with PimpedType[Queue] {

  def nameOpt: Option[String] = Option(underlying.getName)

  def nameOpt_=(value: Option[String]): Unit =
    underlying.setName(value.orNull)

  def withNameOpt(value: Option[String]): Queue =
    underlying.withName(value.orNull)

  // ---

  def urlOpt: Option[String] = Option(underlying.getURL)

  def urlOpt_=(value: Option[String]): Unit =
    underlying.setURL(value.orNull)

  def withUrlOpt(value: Option[String]): Queue =
    underlying.withURL(value.orNull)

}
