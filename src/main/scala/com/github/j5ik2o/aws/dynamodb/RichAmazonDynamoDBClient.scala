package com.github.j5ik2o.aws.dynamodb

import com.amazonaws.ClientConfiguration
import com.amazonaws.auth.{AWSCredentialsProvider, AWSCredentials}
import com.amazonaws.metrics.RequestMetricCollector
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient
import com.amazonaws.services.dynamodbv2.model._
import com.github.j5ik2o.aws.PimpedType

import scala.collection.JavaConverters._

object AmazonDynamoDBClientFactory {

  def apply(): AmazonDynamoDBClient = new AmazonDynamoDBClient()

  def apply(clientConfiguration: ClientConfiguration): AmazonDynamoDBClient =
    new AmazonDynamoDBClient(clientConfiguration)

  def apply(awsCredentials: AWSCredentials): AmazonDynamoDBClient =
    new AmazonDynamoDBClient(awsCredentials)

  def apply(awsCredentials: AWSCredentials, clientConfiguration: ClientConfiguration): AmazonDynamoDBClient =
    new AmazonDynamoDBClient(awsCredentials, clientConfiguration)

  def apply(awsCredentialsProvider: AWSCredentialsProvider): AmazonDynamoDBClient =
    new AmazonDynamoDBClient(awsCredentialsProvider)

  def apply(awsCredentialsProvider: AWSCredentialsProvider, clientConfiguration: ClientConfiguration): AmazonDynamoDBClient =
    new AmazonDynamoDBClient(awsCredentialsProvider, clientConfiguration)

  def apply(awsCredentialsProvider: AWSCredentialsProvider, clientConfiguration: ClientConfiguration, requestMetricCollector: RequestMetricCollector): AmazonDynamoDBClient =
    new AmazonDynamoDBClient(awsCredentialsProvider, clientConfiguration, requestMetricCollector)

}

class RichAmazonDynamoDBClient(val underlying: AmazonDynamoDBClient) extends AnyVal with PimpedType[AmazonDynamoDBClient] {

  //  def batchGetItem(batchGetItemRequest: BatchGetItemRequest): BatchGetItemResult = underlying.batchGetItem(batchGetItemRequest)

  def batchGetItem(requestItems: Map[String, KeysAndAttributes]): BatchGetItemResult = underlying.batchGetItem(requestItems.asJava)

  def batchGetItem(requestItems: Map[String, KeysAndAttributes], returnConsumedCapacity: String): BatchGetItemResult =
    underlying.batchGetItem(requestItems.asJava, returnConsumedCapacity)

  //  def batchWriteItem(batchWriteItemRequest: BatchWriteItemRequest): BatchWriteItemResult =
  //    underlying.batchWriteItem(batchWriteItemRequest)

  def batchWriteItem(requestItems: Map[String, Seq[WriteRequest]]): BatchWriteItemResult =
    underlying.batchWriteItem(requestItems.map(e => (e._1, e._2.asJava)).asJava)

  //  def createTable(createTableRequest: CreateTableRequest): CreateTableResult =
  //    underlying.createTable(createTableRequest)

  def createTable(attributeDefinitions: Seq[AttributeDefinition], tableName: String, keySchema: Seq[KeySchemaElement], provisionedThroughput: ProvisionedThroughput): CreateTableResult =
    underlying.createTable(attributeDefinitions.asJava, tableName, keySchema.asJava, provisionedThroughput)

  def deleteItem(tableName: String, key: Map[String, AttributeValue]): DeleteItemResult =
    underlying.deleteItem(tableName, key.asJava)

  def deleteItem(tableName: String, key: Map[String, AttributeValue], returnValues: String): DeleteItemResult =
    underlying.deleteItem(tableName, key.asJava)

  def getItem(tableName: String, key: Map[String, AttributeValue]): GetItemResult =
    underlying.getItem(tableName, key.asJava)

  def getItem(tableName: String, key: Map[String, AttributeValue], consistentRead: Boolean): GetItemResult =
    underlying.getItem(tableName, key.asJava, consistentRead)

  def putItem(tableName: String, item: Map[String, AttributeValue]): PutItemResult =
    underlying.putItem(tableName, item.asJava)

  def putItem(tableName: String, item: Map[String, AttributeValue], returnValues: String): PutItemResult =
    underlying.putItem(tableName, item.asJava, returnValues)

  def scan(tableName: String, attributesToGet: Seq[String]): ScanResult =
    underlying.scan(tableName, attributesToGet.asJava)

  def scan(tableName: String, attributesToGet: Seq[String], scanFilter: Map[String, Condition]): ScanResult =
    underlying.scan(tableName, attributesToGet.asJava, scanFilter.asJava)

  def scan(tableName: String, scanFilter: Map[String, Condition]): ScanResult =
    underlying.scan(tableName, scanFilter.asJava)

  def updateItem(tableName: String, key: Map[String, AttributeValue], attributeUpdates: Map[String, AttributeValueUpdate]): UpdateItemResult =
    underlying.updateItem(tableName, key.asJava, attributeUpdates.asJava)

  def updateItem(tableName: String, key: Map[String, AttributeValue], attributeUpdates: Map[String, AttributeValueUpdate], returnValues: String): UpdateItemResult =
    underlying.updateItem(tableName, key.asJava, attributeUpdates.asJava)
}
