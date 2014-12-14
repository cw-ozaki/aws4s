package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{DescribeTableResult, TableDescription}
import org.sisioh.aws4s.PimpedType

object DescribeTableResultFactory {

  def create(): DescribeTableResult = new DescribeTableResult()

}

class RichDescribeTableResult(val underlying: DescribeTableResult) extends AnyVal with PimpedType[DescribeTableResult] {

  def tableOpt_=(value: Option[TableDescription]): Unit = underlying.setTable(value.orNull)

  def tableOpt: Option[TableDescription] = Option(underlying.getTable)

}
