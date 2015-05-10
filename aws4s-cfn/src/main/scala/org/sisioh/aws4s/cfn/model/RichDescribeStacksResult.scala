package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model.{DescribeStacksResult, Stack}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichDescribeStacksResult(val underlying: DescribeStacksResult)
  extends AnyVal with PimpedType[DescribeStacksResult] {

  def stacks: Seq[Stack] = underlying.getStacks.asScala

  def stacks_=(value: Seq[Stack]): Unit =
    underlying.setStacks(value.asJava)

  def withStacks(value: Seq[Stack]): DescribeStacksResult =
    underlying.withStacks(value.asJava)

  // ---

  def nextTokenOpt: Option[String] = Option(underlying.getNextToken)

  def nextTokenOpt_=(value: Option[String]): Unit =
    underlying.setNextToken(value.orNull)

  def withNextTokenOpt(value: Option[String]): DescribeStacksResult =
    underlying.withNextToken(value.orNull)

}
