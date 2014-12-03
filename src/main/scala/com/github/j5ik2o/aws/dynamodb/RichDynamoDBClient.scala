package com.github.j5ik2o.aws.dynamodb

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient
import com.amazonaws.services.dynamodbv2.model._

import scala.collection.JavaConverters._

class RichDynamoDBClient(val underlying: AmazonDynamoDBClient) extends AnyVal with PimpedType[AmazonDynamoDBClient] {

  def batchGetItem(batchGetItemRequest: BatchGetItemRequest): BatchGetItemResult = underlying.batchGetItem(batchGetItemRequest)

  def batchGetItem(requestItems: Map[String, KeysAndAttributes]): BatchGetItemResult = underlying.batchGetItem(requestItems.asJava)

  def batchGetItem(requestItems: Map[String, KeysAndAttributes], returnConsumedCapacity: String): BatchGetItemResult =
    underlying.batchGetItem(requestItems.asJava, returnConsumedCapacity)

  def batchWriteItem(batchWriteItemRequest: BatchWriteItemRequest): BatchWriteItemResult =
    underlying.batchWriteItem(batchWriteItemRequest)

  def batchWriteItem(requestItems: Map[String, Seq[WriteRequest]]): BatchWriteItemResult =
    underlying.batchWriteItem(requestItems.map(e => (e._1, e._2.asJava)).asJava)

  def createTable(createTableRequest: CreateTableRequest): CreateTableResult =
    underlying.createTable(createTableRequest)

  def createTable(attributeDefinitions: Seq[AttributeDefinition], tableName: String, keySchema: Seq[KeySchemaElement], provisionedThroughput: ProvisionedThroughput): CreateTableResult =
    underlying.createTable(attributeDefinitions.asJava, tableName, keySchema.asJava, provisionedThroughput)

}
