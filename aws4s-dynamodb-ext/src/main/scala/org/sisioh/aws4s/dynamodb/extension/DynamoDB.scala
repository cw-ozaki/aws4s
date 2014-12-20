package org.sisioh.aws4s.dynamodb.extension

import com.amazonaws.services.{dynamodbv2 => aws}
import org.sisioh.aws4s.dynamodb.Implicits._
import org.sisioh.aws4s.dynamodb.model.DescribeTableRequestFactory

import scala.util.Try

case object DynamoDB {

  def describeTable(tableName: String)(implicit client: aws.AmazonDynamoDBClient): Try[Table] = {
    val describeTableRequest = DescribeTableRequestFactory.create().withTableNameOpt(Some(tableName))
    client.requestDescribeTable(describeTableRequest).map { result =>
      Table(result.getTable)
    }
  }

  def createTable(tableEx: Table)(implicit client: aws.AmazonDynamoDBClient): Try[Table] = {
    client.requestCreateTable(tableEx.toCreateTableRequest).map(e => Table(e.getTableDescription))
  }

  def updateTable(tableName: String, provisionedThroughputEx: ProvisionedThroughput)(implicit client: aws.AmazonDynamoDBClient): Try[Table] = {
    client.requestUpdateTable(tableName, provisionedThroughputEx.toProvisionedThroughput).map(e => Table(e.getTableDescription))
  }

  def deleteTable(tableName: String)(implicit client: aws.AmazonDynamoDBClient): Try[Table] = {
    client.requestDeleteTable(tableName).map(e => Table(e.getTableDescription))
  }


}
