package org.sisioh.aws4s.dynamodb

import com.amazonaws.ClientConfiguration
import com.amazonaws.auth.{AWSCredentials, AWSCredentialsProvider}
import com.amazonaws.metrics.RequestMetricCollector
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient
import com.amazonaws.services.dynamodbv2.model._
import org.sisioh.aws4s.PimpedType

import scala.util.Try
import scala.collection.JavaConverters._

object AmazonDynamoDBClientFactory {

  def create(): AmazonDynamoDBClient = new AmazonDynamoDBClient()

  def create(clientConfiguration: ClientConfiguration): AmazonDynamoDBClient =
    new AmazonDynamoDBClient(clientConfiguration)

  def create(awsCredentials: AWSCredentials): AmazonDynamoDBClient =
    new AmazonDynamoDBClient(awsCredentials)

  def create(awsCredentials: AWSCredentials, clientConfiguration: ClientConfiguration): AmazonDynamoDBClient =
    new AmazonDynamoDBClient(awsCredentials, clientConfiguration)

  def create(awsCredentialsProvider: AWSCredentialsProvider): AmazonDynamoDBClient =
    new AmazonDynamoDBClient(awsCredentialsProvider)

  def create(awsCredentialsProvider: AWSCredentialsProvider, clientConfiguration: ClientConfiguration): AmazonDynamoDBClient =
    new AmazonDynamoDBClient(awsCredentialsProvider, clientConfiguration)

  def create(awsCredentialsProvider: AWSCredentialsProvider, clientConfiguration: ClientConfiguration, requestMetricCollector: RequestMetricCollector): AmazonDynamoDBClient =
    new AmazonDynamoDBClient(awsCredentialsProvider, clientConfiguration, requestMetricCollector)

}

class RichAmazonDynamoDBClient(val underlying: AmazonDynamoDBClient) extends AnyVal with PimpedType[AmazonDynamoDBClient] {

  // ---

  def scanAsTry(scanRequest: ScanRequest): Try[ScanResult] =
    Try(underlying.scan(scanRequest))

  def scanAsTry(tableName: String, attributesToGet: Seq[String]): Try[ScanResult] =
    Try(underlying.scan(tableName, attributesToGet.asJava))

  def scanAsTry(tableName: String, attributesToGet: Seq[String], scanFilter: Map[String, Condition]): Try[ScanResult] =
    Try(underlying.scan(tableName, attributesToGet.asJava, scanFilter.asJava))

  def scanAsTry(tableName: String, scanFilter: Map[String, Condition]): Try[ScanResult] =
    Try(underlying.scan(tableName, scanFilter.asJava))

  // ---

  def updateTableAsTry(updateTableRequest: UpdateTableRequest): Try[UpdateTableResult] =
    Try(underlying.updateTable(updateTableRequest))

  def updateTableAsTry(tableName:String, provisionedThroughput: ProvisionedThroughput): Try[UpdateTableResult] =
    Try(underlying.updateTable(tableName, provisionedThroughput))

  // ---

  def deleteTableAsTry(deleteTableRequest: DeleteTableRequest): Try[DeleteTableResult] =
    Try(underlying.deleteTable(deleteTableRequest))

  def deleteTableAsTry(tableName: String): Try[DeleteTableResult] =
    Try(underlying.deleteTable(tableName))

  // ---

  def batchWriteItemAsTry(batchWriteItemRequest: BatchWriteItemRequest): Try[BatchWriteItemResult] =
    Try(underlying.batchWriteItem(batchWriteItemRequest))

  def batchWriteItemAsTry(requestItems: Map[String, Seq[WriteRequest]]): Try[BatchWriteItemResult] =
    Try(underlying.batchWriteItem(requestItems.map(e => (e._1, e._2.asJava)).asJava))

  // ---

  def batchGetItemAsTry(requestItems: Map[String, KeysAndAttributes], returnConsumedCapacity: String): Try[BatchGetItemResult] =
    Try(underlying.batchGetItem(requestItems.asJava, returnConsumedCapacity))

  def batchGetItemAsTry(batchGetItemRequest: BatchGetItemRequest): Try[BatchGetItemResult] =
    Try(underlying.batchGetItem(batchGetItemRequest))

  def batchGetItemAsTry(requestItems: Map[String, KeysAndAttributes]): Try[BatchGetItemResult] =
    Try(underlying.batchGetItem(requestItems.asJava))

  // ---

  def describeTableAsTry(describeTableRequest: DescribeTableRequest): Try[DescribeTableResult] =
    Try(underlying.describeTable(describeTableRequest))

  def describeTableAsTry(tableName: String): Try[DescribeTableResult] =
    Try(underlying.describeTable(tableName))

  // ---

  def getItemAsTry(getItemRequest: GetItemRequest): Try[GetItemResult] =
    Try(underlying.getItem(getItemRequest))

  def getItemAsTry(tableName: String, key: Map[String, AttributeValue]): Try[GetItemResult] =
    Try(underlying.getItem(tableName, key.asJava))

  def getItemAsTry(tableName: String, key: Map[String, AttributeValue], consistentRead: Boolean): Try[GetItemResult] =
    Try(underlying.getItem(tableName, key.asJava, consistentRead))

  // ---

  def deleteItemAsTry(deleteItemRequest: DeleteItemRequest): Try[DeleteItemResult] =
    Try(underlying.deleteItem(deleteItemRequest))

  def deleteItemAsTry(tableName: String, key: Map[String, AttributeValue]): Try[DeleteItemResult] =
    Try(underlying.deleteItem(tableName, key.asJava))

  def deleteItemAsTry(tableName: String, key: Map[String, AttributeValue], returnValues: String): Try[DeleteItemResult] =
    Try(underlying.deleteItem(tableName, key.asJava))

  // ---

  def createTableAsTry(createTableRequest: CreateTableRequest): Try[CreateTableResult] =
    Try(underlying.createTable(createTableRequest))

  def createTableAsTry(attributeDefinitions: Seq[AttributeDefinition], tableName: String, keySchema: Seq[KeySchemaElement], provisionedThroughput: ProvisionedThroughput): Try[CreateTableResult] =
    Try(underlying.createTable(attributeDefinitions.asJava, tableName, keySchema.asJava, provisionedThroughput))

  // ---

  def queryAsTry(queryRequest: QueryRequest): Try[QueryResult] =
    Try(underlying.query(queryRequest))

  // ---

  def putItemAsTry(putItemRequest: PutItemRequest): Try[PutItemResult] =
    Try(underlying.putItem(putItemRequest))

  def putItemAsTry(tableName: String, item: Map[String, AttributeValue]): Try[PutItemResult] =
    Try(underlying.putItem(tableName, item.asJava))

  def putItemAsTry(tableName: String, item: Map[String, AttributeValue], returnValues: String): Try[PutItemResult] =
    Try(underlying.putItem(tableName, item.asJava, returnValues))

  // ---

  def listTablesAsTry(listTablesRequest: ListTablesRequest): Try[ListTablesResult] =
    Try(underlying.listTables(listTablesRequest))

  def listTablesAsTry(exclusiveStartTableName: String): Try[ListTablesResult] =
    Try(underlying.listTables(exclusiveStartTableName))

  def listTablesAsTry(exclusiveStartTableName: String, limit: Int): Try[ListTablesResult] =
    Try(underlying.listTables(exclusiveStartTableName, limit))

  def listTablesAsTry(): Try[ListTablesResult] =
    Try(underlying.listTables())

  // ---

  def updateItemAsTry(updateItemRequest: UpdateItemRequest): Try[UpdateItemResult] =
    Try(underlying.updateItem(updateItemRequest))

  def updateItemAsTry(tableName: String, key: Map[String, AttributeValue], attributeUpdates: Map[String, AttributeValueUpdate]): Try[UpdateItemResult] =
    Try(underlying.updateItem(tableName, key.asJava, attributeUpdates.asJava))

  def updateItemAsTry(tableName: String, key: Map[String, AttributeValue], attributeUpdates: Map[String, AttributeValueUpdate], returnValues: String): Try[UpdateItemResult] =
    Try(underlying.updateItem(tableName, key.asJava, attributeUpdates.asJava))

  // ---

}
