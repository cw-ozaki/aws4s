package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model.{ ListStacksResult, StackSummary }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ListStacksResultFactory {

  def create(): ListStacksResult = new ListStacksResult()

}

class RichListStacksResult(val underlying: ListStacksResult)
    extends AnyVal with PimpedType[ListStacksResult] {

  def stackSummaries: Seq[StackSummary] = underlying.getStackSummaries.asScala.toVector

  def stackSummaries_=(value: Seq[StackSummary]): Unit =
    underlying.setStackSummaries(value.asJava)

  def withStackSummaries(value: Seq[StackSummary]): ListStacksResult =
    underlying.withStackSummaries(value.asJava)

  // ---

  def nextTokenOpt: Option[String] = Option(underlying.getNextToken)

  def nextTokenOpt_=(value: Option[String]): Unit =
    underlying.setNextToken(value.orNull)

  def withNextTokenOpt(value: Option[String]): ListStacksResult =
    underlying.withNextToken(value.orNull)

}
