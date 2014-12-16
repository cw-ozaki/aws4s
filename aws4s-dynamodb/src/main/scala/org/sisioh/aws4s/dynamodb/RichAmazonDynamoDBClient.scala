package org.sisioh.aws4s.dynamodb

import com.amazonaws.ClientConfiguration
import com.amazonaws.auth.{AWSCredentials, AWSCredentialsProvider}
import com.amazonaws.metrics.RequestMetricCollector
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient
import com.amazonaws.services.dynamodbv2.model._
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._
import scala.util.Try

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

  def requestBatchGetItem(batchGetItemRequest: BatchGetItemRequest): Try[BatchGetItemResult] =
    Try(underlying.batchGetItem(batchGetItemRequest))

  def requestBatchGetItem(requestItems: Map[String, KeysAndAttributes]): Try[BatchGetItemResult] =
    Try(underlying.batchGetItem(requestItems.asJava))

  // ---

  def requestBatchWriteItem(batchWriteItemRequest: BatchWriteItemRequest): Try[BatchWriteItemResult] =
    Try(underlying.batchWriteItem(batchWriteItemRequest))

  def requestBatchWriteItem(requestItems: Map[String, Seq[WriteRequest]]): Try[BatchWriteItemResult] =
    Try(underlying.batchWriteItem(requestItems.map(e => (e._1, e._2.asJava)).asJava))

  def requestBatchGetItem(requestItems: Map[String, KeysAndAttributes], returnConsumedCapacity: String): Try[BatchGetItemResult] =
    Try(underlying.batchGetItem(requestItems.asJava, returnConsumedCapacity))

  // ---

  def requestCreateTable(createTableRequest: CreateTableRequest): Try[CreateTableResult] =
    Try(underlying.createTable(createTableRequest))

  def requestCreateTable(attributeDefinitions: Seq[AttributeDefinition], tableName: String, keySchema: Seq[KeySchemaElement], provisionedThroughput: ProvisionedThroughput): Try[CreateTableResult] =
    Try(underlying.createTable(attributeDefinitions.asJava, tableName, keySchema.asJava, provisionedThroughput))

  // ---

  def requestDeleteItem(deleteItemRequest: DeleteItemRequest): Try[DeleteItemResult] =
    Try(underlying.deleteItem(deleteItemRequest))

  def requestDeleteItem(tableName: String, key: Map[String, AttributeValue]): Try[DeleteItemResult] =
    Try(underlying.deleteItem(tableName, key.asJava))

  def requestDeleteItem(tableName: String, key: Map[String, AttributeValue], returnValues: String): Try[DeleteItemResult] =
    Try(underlying.deleteItem(tableName, key.asJava))

  // ---

  def requestGetItem(getItemRequest: GetItemRequest): Try[GetItemResult] =
    Try(underlying.getItem(getItemRequest))

  def requestGetItem(tableName: String, key: Map[String, AttributeValue]): Try[GetItemResult] =
    Try(underlying.getItem(tableName, key.asJava))

  def requestGetItem(tableName: String, key: Map[String, AttributeValue], consistentRead: Boolean): Try[GetItemResult] =
    Try(underlying.getItem(tableName, key.asJava, consistentRead))

  // ---

  def requestPutItem(putItemRequest: PutItemRequest): Try[PutItemResult] =
    Try(underlying.putItem(putItemRequest))

  def requestPutItem(tableName: String, item: Map[String, AttributeValue]): Try[PutItemResult] =
    Try(underlying.putItem(tableName, item.asJava))

  def requestPutItem(tableName: String, item: Map[String, AttributeValue], returnValues: String): Try[PutItemResult] =
    Try(underlying.putItem(tableName, item.asJava, returnValues))

  // ---

  def requestScan(scanRequest: ScanRequest): Try[ScanResult] =
    Try(underlying.scan(scanRequest))

  def requestScan(tableName: String, attributesToGet: Seq[String]): Try[ScanResult] =
    Try(underlying.scan(tableName, attributesToGet.asJava))

  def requestScan(tableName: String, attributesToGet: Seq[String], scanFilter: Map[String, Condition]): Try[ScanResult] =
    Try(underlying.scan(tableName, attributesToGet.asJava, scanFilter.asJava))

  def requestScan(tableName: String, scanFilter: Map[String, Condition]): Try[ScanResult] =
    Try(underlying.scan(tableName, scanFilter.asJava))

  // ---

  def requestQuery(queryRequest: QueryRequest): Try[QueryResult] =
    Try(underlying.query(queryRequest))

  // ---

  def requestUpdateItem(updateItemRequest: UpdateItemRequest): Try[UpdateItemResult] =
    Try(underlying.updateItem(updateItemRequest))

  def requestUpdateItem(tableName: String, key: Map[String, AttributeValue], attributeUpdates: Map[String, AttributeValueUpdate]): Try[UpdateItemResult] =
    Try(underlying.updateItem(tableName, key.asJava, attributeUpdates.asJava))

  def requestUpdateItem(tableName: String, key: Map[String, AttributeValue], attributeUpdates: Map[String, AttributeValueUpdate], returnValues: String): Try[UpdateItemResult] =
    Try(underlying.updateItem(tableName, key.asJava, attributeUpdates.asJava))

  // ---

}
