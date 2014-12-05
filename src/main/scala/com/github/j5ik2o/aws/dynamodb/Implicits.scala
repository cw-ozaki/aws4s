package com.github.j5ik2o.aws.dynamodb

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient
import com.amazonaws.services.dynamodbv2.document._
import com.amazonaws.services.dynamodbv2.model._
import com.github.j5ik2o.aws.dynamodb.document._
import com.github.j5ik2o.aws.dynamodb.model._

object Implicits extends Implicits

trait Implicits extends DynamoDBClientImplicits with DocumentImplicits with ModelImplicits

trait DynamoDBClientImplicits {

  implicit def richDynamoDBClient(client: AmazonDynamoDBClient): RichAmazonDynamoDBClient = new RichAmazonDynamoDBClient(client)

}

trait DocumentImplicits {

  implicit def richDynamoDB(db: DynamoDB): RichDynamoDB = new RichDynamoDB(db)

  implicit def richItem(item: Item): RichItem = new RichItem(item)

  implicit def richTable(table: Table): RichTable = new RichTable(table)

  implicit def richAttributeUpdate(au: AttributeUpdate): RichAttributeUpdate = new RichAttributeUpdate(au)

  //  implicit def richFilter[T](filter: Filter[T]): RichFilter[T] = new RichFilter[T](filter)

  implicit def richBatchWriteItemOutcome(r: BatchWriteItemOutcome): RichBatchWriteItemOutcome = new RichBatchWriteItemOutcome(r)

  implicit def richBatchGetItemOutcome(r: BatchGetItemOutcome): RichBatchGetItemOutcome = new RichBatchGetItemOutcome(r)
}

trait ModelImplicits {

  implicit def richListTablesResult(ltr: ListTablesResult): RichListTablesResult = new RichListTablesResult(ltr)

  implicit def richCreateTableRequest(ctr: CreateTableRequest): RichCreateTableRequest = new RichCreateTableRequest(ctr)

  implicit def richCreateTableResult(ctr: CreateTableResult): RichCreateTableResult = new RichCreateTableResult(ctr)

  implicit def richAttributeValue(av: AttributeValue): RichAttributeValue = new RichAttributeValue(av)

  implicit def richAttributeValueUpdate(avu: AttributeValueUpdate): RichAttributeValueUpdate = new RichAttributeValueUpdate(avu)

}