package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.DescribeTableRequest
import org.sisioh.aws4s.PimpedType

object DescribeTableRequestFactory {

  def apply(): DescribeTableRequest = new DescribeTableRequest()

  def apply(tableName: String): DescribeTableRequest = new DescribeTableRequest(tableName)

}

class RichDescribeTableRequest(val underlying: DescribeTableRequest) extends AnyVal with PimpedType[DescribeTableRequest] {

  def tableName_=(value: String): Unit = underlying.setTableName(value)

  def tableName: String = underlying.getTableName

}
