package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.DescribeTableRequest
import org.sisioh.aws4s.PimpedType

object DescribeTableRequestFactory {

  def create(): DescribeTableRequest = new DescribeTableRequest()

  def create(tableName: String): DescribeTableRequest = new DescribeTableRequest(tableName)

}

class RichDescribeTableRequest(val underlying: DescribeTableRequest) extends AnyVal with PimpedType[DescribeTableRequest] {

  def tableNameOpt_=(value: Option[String]): Unit = underlying.setTableName(value.orNull)

  def tableNameOpt: Option[String] = Option(underlying.getTableName)

}
