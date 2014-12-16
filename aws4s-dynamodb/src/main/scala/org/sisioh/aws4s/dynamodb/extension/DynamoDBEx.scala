package org.sisioh.aws4s.dynamodb.extension

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient
import org.sisioh.aws4s.dynamodb.Implicits._
import org.sisioh.aws4s.dynamodb.model.{DeleteTableRequestFactory, DescribeTableRequestFactory}

import scala.util.Try

case object DynamoDBEx {

  def describeTable(tableName: String)(implicit client: AmazonDynamoDBClient): Try[TableEx] = {
    val describeTableRequest = DescribeTableRequestFactory.create().withTableNameOpt(Some(tableName))
    client.requestDescribeTable(describeTableRequest).map { result =>
      TableEx(result.getTable)
    }
  }

  def createTable(tableEx: TableEx)(implicit client: AmazonDynamoDBClient): Try[TableEx] = {
    client.requestCreateTable(tableEx.toCreateTableRequest).map(e => TableEx(e.getTableDescription))
  }

  def updateTable(tableName: String, provisionedThroughputEx: ProvisionedThroughputEx)(implicit client: AmazonDynamoDBClient): Try[TableEx] = {
    client.requestUpdateTable(tableName, provisionedThroughputEx.toProvisionedThroughput).map(e => TableEx(e.getTableDescription))
  }

  def deleteTable(tableName: String)(implicit client: AmazonDynamoDBClient): Try[TableEx] = {
    client.requestDeleteTable(tableName).map(e => TableEx(e.getTableDescription))
  }



}
