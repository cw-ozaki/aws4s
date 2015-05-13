package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model.{DescribeStackResourcesResult, StackResource}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object DescribeStackResourcesResultFactory {

  def create(): DescribeStackResourcesResult = new DescribeStackResourcesResult()

}

class RichDescribeStackResourcesResult(val underlying: DescribeStackResourcesResult)
  extends AnyVal with PimpedType[DescribeStackResourcesResult] {

  def stackResources: Seq[StackResource] = underlying.getStackResources.asScala.toVector

  def stackResources_=(value: Seq[StackResource]): Unit =
    underlying.setStackResources(value.asJava)

  def withStackResources(value: Seq[StackResource]): DescribeStackResourcesResult =
    underlying.withStackResources(value.asJava)

}
