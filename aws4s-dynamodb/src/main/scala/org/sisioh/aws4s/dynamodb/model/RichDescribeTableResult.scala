package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{DescribeTableResult, TableDescription}
import org.sisioh.aws4s.PimpedType

object DescribeTableResultFactory {

  def apply(): DescribeTableResult = new DescribeTableResult()

}

class RichDescribeTableResult(val underlying: DescribeTableResult) extends AnyVal with PimpedType[DescribeTableResult] {

  def table_=(value: TableDescription): Unit = underlying.setTable(table)

  def table: TableDescription = underlying.getTable

}
