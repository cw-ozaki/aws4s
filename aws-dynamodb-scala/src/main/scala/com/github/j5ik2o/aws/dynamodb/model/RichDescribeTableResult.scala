package com.github.j5ik2o.aws.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{TableDescription, DescribeTableResult}
import com.github.j5ik2o.aws.PimpedType

object DescribeTableResultFactory {

  def apply(): DescribeTableResult = new DescribeTableResult()

}

class RichDescribeTableResult(val underlying: DescribeTableResult) extends AnyVal with PimpedType[DescribeTableResult] {

  def table_=(value: TableDescription): Unit = underlying.setTable(table)

  def table: TableDescription = underlying.getTable

}
