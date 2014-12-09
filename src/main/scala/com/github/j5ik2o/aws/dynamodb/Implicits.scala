package com.github.j5ik2o.aws.dynamodb

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient
import com.amazonaws.services.dynamodbv2.document._
import com.amazonaws.services.dynamodbv2.model._
import com.github.j5ik2o.aws.dynamodb.document._
import com.github.j5ik2o.aws.dynamodb.model._

object Implicits extends Implicits

trait Implicits extends AmazonDynamoDBClientImplicits with DocumentImplicits with ModelImplicits

trait AmazonDynamoDBClientImplicits {

  implicit def richAmazonDynamoDBClient(underlying: AmazonDynamoDBClient): RichAmazonDynamoDBClient = new RichAmazonDynamoDBClient(underlying)

}

trait DocumentImplicits {

  implicit def richRichItemCollection(underlying: ItemCollection): RichItemCollection = new RichItemCollection(underlying)

  implicit def richDynamoDB(underlying: DynamoDB): RichDynamoDB = new RichDynamoDB(underlying)

  implicit def richGetItemOutcome(underlying: GetItemOutcome): RichGetItemOutcome = new RichGetItemOutcome(underlying)

  implicit def richItem(underlying: Item): RichItem = new RichItem(underlying)

  implicit def richIndex(underlying: Index): RichIndex = new RichIndex(underlying)

  implicit def richTable(underlying: Table): RichTable = new RichTable(underlying)

  implicit def richAttributeUpdate(underlying: AttributeUpdate): RichAttributeUpdate = new RichAttributeUpdate(underlying)

  //  implicit def richFilter[T](filter: Filter[T]): RichFilter[T] = new RichFilter[T](filter)

  implicit def richBatchWriteItemOutcome(underlying: BatchWriteItemOutcome): RichBatchWriteItemOutcome = new RichBatchWriteItemOutcome(underlying)

  implicit def richBatchGetItemOutcome(underlying: BatchGetItemOutcome): RichBatchGetItemOutcome = new RichBatchGetItemOutcome(underlying)
}

trait ModelImplicits {

  implicit def richBatchGetItemRequest(underlying: BatchGetItemRequest): RichBatchGetItemRequest = new RichBatchGetItemRequest(underlying)

  implicit def richBatchGetItemResult(underlying: BatchGetItemResult): RichBatchGetItemResult = new RichBatchGetItemResult(underlying)

  implicit def richBatchWriteItemRequest(underlying: BatchWriteItemRequest): RichBatchWriteItemRequest = new RichBatchWriteItemRequest(underlying)

  implicit def richBatchWriteItemResult(underlying: BatchWriteItemResult): RichBatchWriteItemResult = new RichBatchWriteItemResult(underlying)

  implicit def richListTablesResult(underlying: ListTablesResult): RichListTablesResult = new RichListTablesResult(underlying)

  implicit def richCreateTableRequest(underlying: CreateTableRequest): RichCreateTableRequest = new RichCreateTableRequest(underlying)

  implicit def richCreateTableResult(underlying: CreateTableResult): RichCreateTableResult = new RichCreateTableResult(underlying)

  implicit def richAttributeValue(underlying: AttributeValue): RichAttributeValue = new RichAttributeValue(underlying)

  implicit def richAttributeValueUpdate(underlying: AttributeValueUpdate): RichAttributeValueUpdate = new RichAttributeValueUpdate(underlying)

}