package org.sisioh.aws4s.dynamodb.document

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient
import com.amazonaws.services.dynamodbv2.document.{BatchWriteItemOutcome, BatchGetItemOutcome, DynamoDB, Table}
import com.amazonaws.services.dynamodbv2.model._
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object DynamoDBFactory {

  def apply(client: AmazonDynamoDBClient): DynamoDB = new DynamoDB(client)

}

class RichDynamoDB(val underlying: DynamoDB) extends AnyVal with PimpedType[DynamoDB] {

  def table(tableName: String): Table = underlying.getTable(tableName)

  def createTable(tableName: String, keySchema: List[KeySchemaElement], attributeDefinitions: List[AttributeDefinition], provisionedThroughput: ProvisionedThroughput): Table =
    underlying.createTable(tableName, keySchema.asJava, attributeDefinitions.asJava, provisionedThroughput)

  def batchGetItemUnprocessed(returnConsumedCapacity: ReturnConsumedCapacity, unprocessedKeys: Map[String, KeysAndAttributes]): BatchGetItemOutcome =
    underlying.batchGetItemUnprocessed(returnConsumedCapacity, unprocessedKeys.asJava)

  def batchGetItemUnprocessed(unprocessedKeys: Map[String, KeysAndAttributes]): BatchGetItemOutcome =
    underlying.batchGetItemUnprocessed(unprocessedKeys.asJava)

  def  batchWriteItemUnprocessed(unprocessedItems: Map[String, Seq[WriteRequest]]): BatchWriteItemOutcome =
    underlying.batchWriteItemUnprocessed(unprocessedItems.map(e => (e._1, e._2.asJava)).asJava)

}
