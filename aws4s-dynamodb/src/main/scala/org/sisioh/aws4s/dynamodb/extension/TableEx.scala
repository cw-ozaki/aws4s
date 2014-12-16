package org.sisioh.aws4s.dynamodb.extension

import java.util.Date

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient
import com.amazonaws.services.dynamodbv2.model.{GlobalSecondaryIndexUpdate, TableDescription}
import org.sisioh.aws4s.dynamodb.Implicits._
import org.sisioh.aws4s.dynamodb.model._
import scala.collection.JavaConverters._
import scala.util.Try

case class TableEx(underlying: TableDescription) {

  private[dynamodb] def toCreateTableRequest = {
    CreateTableRequestFactory.create().
      withTableName(underlying.getTableName).
      withAttributeDefinitions(underlying.getAttributeDefinitions).
      withKeySchema(underlying.getKeySchema).
      withLocalSecondaryIndexesOpt(localSecondaryIndexesOpt.map(_.map(_.toLocalSecondaryIndex))).
      withGlobalSecondaryIndexesOpt(globalSecondaryIndexesOpt.map(_.map(_.toGlobalSecondaryIndex))).
      withProvisionedThroughputOpt(provisionedThroughputOpt.map(_.toProvisionedThroughput))
  }

  def toUpdateRequest(globalSecondaryIndexUpdates: Seq[GlobalSecondaryIndexUpdateEx]) = {
    UpdateTableRequestFactory.create().
      withTableName(underlying.getTableName).
      withGlobalSecondaryIndexUpdatesOpt(Some(globalSecondaryIndexUpdates.map(_.underlying))).
      withProvisionedThroughputOpt(provisionedThroughputOpt.map(_.toProvisionedThroughput))
  }

  private[dynamodb] def toDeleteTableRequest = {
    DeleteTableRequestFactory.create().
      withTableName(underlying.getTableName)
  }



  val attributeDefinitionsOpt: Option[Seq[AttributeDefinitionEx]] = underlying.attributeDefinitionsOpt.map(_.map(AttributeDefinitionEx))

  val nameOpt: Option[String] = underlying.tableNameOpt

  val keySchemaElementsOpt: Option[Seq[KeySchemaElementEx]] = underlying.keySchemaOpt.map(_.map(KeySchemaElementEx(_)))

  val tableStatusOpt: Option[String] = underlying.tableStatusOpt

  val creationDateTimeOpt: Option[Date] = underlying.creationDateTimeOpt

  val provisionedThroughputOpt: Option[ProvisionedThroughputEx] = underlying.provisionedThroughputOpt.map(ProvisionedThroughputEx)

  val tableSizeBytesOpt: Option[Long] = underlying.tableSizeBytesOpt

  val itemCountOpt: Option[Long] = underlying.itemCountOpt

  val localSecondaryIndexesOpt: Option[Seq[LocalSecondaryIndexEx]] = underlying.localSecondaryIndexesOpt.map(_.map(LocalSecondaryIndexEx))

  val globalSecondaryIndexesOpt: Option[Seq[GlobalSecondaryIndexEx]] = underlying.globalSecondaryIndexesOpt.map(_.map(GlobalSecondaryIndexEx))

  def deleteItem(keys: Map[String, AttributeValueEx])(implicit client: AmazonDynamoDBClient): Try[Unit] = {
    val deleteItemRequest = DeleteItemRequestFactory.
      create().
      withTableNameOpt(nameOpt).
      withKeyOpt(Some(keys.map { case (k, v) => (k, v.underlying)}))
    client.requestDeleteItem(deleteItemRequest).map(_ => ())
  }

  def updateItem(keys: Map[String, AttributeValueEx], attributes: Map[String, AttributeValueUpdateEx])(implicit client: AmazonDynamoDBClient): Try[Unit] = {
    val updateItemRequest = UpdateItemRequestFactory.
      create().
      withTableNameOpt(nameOpt).
      withKeyOpt(Some(keys.map { case (k, v) => (k, v.underlying)})).
      withAttributeUpdatesOpt(Some(attributes.map { case (k, v) => (k, v.underlying)}))
    client.requestUpdateItem(updateItemRequest).map(_ => ())
  }

  def putItem(item: Map[String, AttributeValueEx])(implicit client: AmazonDynamoDBClient): Try[Unit] = {
    val putItemRequest = PutItemRequestFactory.
      create().
      withTableNameOpt(nameOpt).
      withItemOpt(Some(item.map { case (k, v) => (k, v.underlying)}))
    client.requestPutItem(putItemRequest).map(_ => ())
  }

  def getItem(keys: Map[String, AttributeValueEx])(implicit client: AmazonDynamoDBClient): Try[Map[String, AttributeValueEx]] =
    client.requestGetItem(
      nameOpt.get, keys.map { case (k, v) =>
        (k, v.underlying)
      }
    ).map { result =>
      result.itemOpt.map { item =>
        item.map { case (k, v) =>
          (k, AttributeValueEx(v))
        }
      }.get
    }

  def batchGetItem(requestItems: Map[String, KeysAndAttributesEx])(implicit client: AmazonDynamoDBClient): Try[Unit] = {
    val batchGetItemRequest = BatchGetItemRequestFactory.
      create().
      withRequestItemsOpt(Some(requestItems.map { case (k, v) => (k, v.underlying)}))
    client.requestBatchGetItem(batchGetItemRequest).
      map(_.getResponses.asScala.toMap.map{ case (k,v) => (k, v.asScala.toSeq.map(_.asScala))})
  }

  def batchWriteItem(requestItems: Map[String, Seq[WriteRequestEx]])(implicit client: AmazonDynamoDBClient): Try[Unit] = {
    val batchWriteItemRequest = BatchWriteItemRequestFactory.
      create().
      withRequestItemsOpt(Some(requestItems.map{ case (k, v) => (k, v.map(_.underlying))}))
    client.requestBatchWriteItem(batchWriteItemRequest).map(_ => ())
  }

}
