package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model.{DescribeStackEventsResult, StackEvent}

import scala.collection.JavaConverters._

object DescribeStackEventsResultFactory {

  def create(): DescribeStackEventsResult = new DescribeStackEventsResult()

}

class RichDescribeStackEventsResult(val underlying: DescribeStackEventsResult) {

  def stackEvents: Seq[StackEvent] = underlying.getStackEvents.asScala.toVector

  def stackEvents_=(value: Seq[StackEvent]): Unit =
    underlying.setStackEvents(value.asJava)

  def withStackEvents(value: Seq[StackEvent]): DescribeStackEventsResult =
    underlying.withStackEvents(value.asJava)

  // ---

  def nextTokenOpt: Option[String] = Option(underlying.getNextToken)

  def nextTokenOpt_=(value: Option[String]): Unit =
    underlying.setNextToken(value.orNull)

  def withNextTokenOpt(value: Option[String]): DescribeStackEventsResult =
    underlying.withNextToken(value.orNull)
}
