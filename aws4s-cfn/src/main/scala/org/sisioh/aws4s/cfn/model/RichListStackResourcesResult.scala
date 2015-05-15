package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model.{ ListStackResourcesResult, StackResourceSummary }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ListStackResourcesResultFactory {

  def create(): ListStackResourcesResult = new ListStackResourcesResult()

}

class RichListStackResourcesResult(val underlying: ListStackResourcesResult)
    extends AnyVal with PimpedType[ListStackResourcesResult] {

  def stackResourceSummaries: Seq[StackResourceSummary] = underlying.getStackResourceSummaries.asScala.toVector

  def stackResourceSummaries_=(value: Seq[StackResourceSummary]): Unit =
    underlying.setStackResourceSummaries(value.asJava)

  def withStackResourceSummaries(value: Seq[StackResourceSummary]): ListStackResourcesResult =
    underlying.withStackResourceSummaries(value.asJava)

  // ---

  def nextTokenOpt: Option[String] = Option(underlying.getNextToken)

  def nextTokenOpt_=(value: Option[String]): Unit =
    underlying.setNextToken(value.orNull)

  def withNextTokenOpt(value: Option[String]): ListStackResourcesResult =
    underlying.withNextToken(value.orNull)

}
