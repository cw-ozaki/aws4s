package com.github.j5ik2o.aws.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.DescribeTableRequest
import com.github.j5ik2o.aws.PimpedType

object DescribeTableRequestFactory {

  def apply(): DescribeTableRequest = new DescribeTableRequest()

  def apply(tableName: String): DescribeTableRequest = new DescribeTableRequest(tableName)

}

class RichDescribeTableRequest(val underlying: DescribeTableRequest) extends AnyVal with PimpedType[DescribeTableRequest] {

  def tableName_=(value: String): Unit = underlying.setTableName(value)

  def tableName: String = underlying.getTableName

}
