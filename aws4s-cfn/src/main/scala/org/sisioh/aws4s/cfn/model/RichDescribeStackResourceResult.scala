package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model.{DescribeStackResourceResult, StackResourceDetail}
import org.sisioh.aws4s.PimpedType

object DescribeStackResourceResultFactory {

  def create(): DescribeStackResourceResult = new DescribeStackResourceResult()

}

class RichDescribeStackResourceResult(val underlying: DescribeStackResourceResult)
  extends AnyVal with PimpedType[DescribeStackResourceResult] {

  def stackResourceDetailOpt: Option[StackResourceDetail] = Option(underlying.getStackResourceDetail)

  def stackResourceDetailOpt_=(value: Option[StackResourceDetail]): Unit =
    underlying.setStackResourceDetail(value.orNull)

  def withStackResourceDetailOpt(value: Option[StackResourceDetail]): DescribeStackResourceResult =
    underlying.withStackResourceDetail(value.orNull)
}
