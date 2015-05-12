package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.NotificationConfiguration
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichNotificationConfiguration(val underlying: NotificationConfiguration)
    extends AnyVal with PimpedType[NotificationConfiguration] {

  def events: Set[String] = underlying.getEvents.asScala.toSet

  def events_=(value: Set[String]): Unit =
    underlying.setEvents(value.asJava)

  def withEvents(value: Set[String]): NotificationConfiguration =
    underlying.withEvents(value.asJava)

  // ---

  def objectPrefixes: Seq[String] = underlying.getObjectPrefixes.asScala.toVector

  def objectPrefixes_=(value: Seq[String]): Unit =
    underlying.setObjectPrefixes(value.asJava)

  def withObjectPrefixes(value: Seq[String]): NotificationConfiguration =
    underlying.withObjectPrefixes(value: _*)

}
