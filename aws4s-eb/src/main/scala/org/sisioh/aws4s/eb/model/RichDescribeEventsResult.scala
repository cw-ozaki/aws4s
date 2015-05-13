package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.{DescribeEventsResult, EventDescription}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object DescribeEventsResultFactory {

  def create(): DescribeEventsResult = new DescribeEventsResult()

}

class RichDescribeEventsResult(val underlying: DescribeEventsResult)
    extends AnyVal with PimpedType[DescribeEventsResult] {

  def events: Seq[EventDescription] = underlying.getEvents.asScala.toVector

  def events_=(value: Seq[EventDescription]): Unit =
    underlying.setEvents(value.asJava)

  def withEvents(value: Seq[EventDescription]): DescribeEventsResult =
    underlying.withEvents(value.asJava)

  // ---

  def nextTokenOpt: Option[String] = Option(underlying.getNextToken)

  def nextTokenOpt_=(value: Option[String]): Unit =
    underlying.setNextToken(value.orNull)

  def withNextTokenOpt(value: Option[String]): DescribeEventsResult =
    underlying.withNextToken(value.orNull)
}
