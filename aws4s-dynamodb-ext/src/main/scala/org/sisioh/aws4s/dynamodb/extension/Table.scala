package org.sisioh.aws4s.dynamodb.extension

import java.util.Date

import com.amazonaws.services.{ dynamodbv2 => aws }
import org.sisioh.aws4s.dynamodb.Implicits._
import org.sisioh.aws4s.dynamodb.model._

import scala.collection.JavaConverters._
import scala.util.Try

case class Table(underlying: aws.model.TableDescription) {

  private[dynamodb] def toCreateTableRequest = {
    CreateTableRequestFactory.create().
      withTableName(underlying.getTableName).
      withAttributeDefinitions(underlying.getAttributeDefinitions).
      withKeySchema(underlying.getKeySchema).
      withLocalSecondaryIndexesOpt(localSecondaryIndexesOpt.map(_.map(_.toLocalSecondaryIndex))).
      withGlobalSecondaryIndexesOpt(globalSecondaryIndexesOpt.map(_.map(_.toGlobalSecondaryIndex))).
      withProvisionedThroughputOpt(provisionedThroughputOpt.map(_.toProvisionedThroughput))
  }

  private[dynamodb] def toUpdateRequest(globalSecondaryIndexUpdates: Seq[GlobalSecondaryIndexUpdate]) = {
    UpdateTableRequestFactory.create().
      withTableName(underlying.getTableName).
      withGlobalSecondaryIndexUpdatesOpt(Some(globalSecondaryIndexUpdates.map(_.underlying))).
      withProvisionedThroughputOpt(provisionedThroughputOpt.map(_.toProvisionedThroughput))
  }

  private[dynamodb] def toDeleteTableRequest = {
    DeleteTableRequestFactory.create().
      withTableName(underlying.getTableName)
  }

  val attributeDefinitionsOpt: Option[Seq[AttributeDefinition]] = underlying.attributeDefinitionsOpt.map(_.map(AttributeDefinition))

  val nameOpt: Option[String] = underlying.tableNameOpt

  val keySchemaElementsOpt: Option[Seq[KeySchemaElement]] = underlying.keySchemaOpt.map(_.map(KeySchemaElement(_)))

  val tableStatusOpt: Option[String] = underlying.tableStatusOpt

  val creationDateTimeOpt: Option[Date] = underlying.creationDateTimeOpt

  val provisionedThroughputOpt: Option[ProvisionedThroughput] = underlying.provisionedThroughputOpt.map(ProvisionedThroughput)

  val tableSizeBytesOpt: Option[Long] = underlying.tableSizeBytesOpt

  val itemCountOpt: Option[Long] = underlying.itemCountOpt

  val localSecondaryIndexesOpt: Option[Seq[LocalSecondaryIndex]] = underlying.localSecondaryIndexesOpt.map(_.map(LocalSecondaryIndex))

  val globalSecondaryIndexesOpt: Option[Seq[GlobalSecondaryIndex]] = underlying.globalSecondaryIndexesOpt.map(_.map(GlobalSecondaryIndex))

  def deleteItem(keys: Map[String, AttributeValue])(implicit client: aws.AmazonDynamoDBClient): Try[Unit] = {
    val deleteItemRequest = DeleteItemRequestFactory.
      create().
      withTableNameOpt(nameOpt).
      withKeyOpt(Some(keys.map { case (k, v) => (k, v.underlying) }))
    client.deleteItemAsTry(deleteItemRequest).map(_ => ())
  }

  def updateItem(keys: Map[String, AttributeValue], attributes: Map[String, AttributeValueUpdate])(implicit client: aws.AmazonDynamoDBClient): Try[Unit] = {
    val updateItemRequest = UpdateItemRequestFactory.
      create().
      withTableNameOpt(nameOpt).
      withKeyOpt(Some(keys.map { case (k, v) => (k, v.underlying) })).
      withAttributeUpdatesOpt(Some(attributes.map { case (k, v) => (k, v.underlying) }))
    client.updateItemAsTry(updateItemRequest).map(_ => ())
  }

  def putItem(item: Map[String, AttributeValue])(implicit client: aws.AmazonDynamoDBClient): Try[Unit] = {
    val putItemRequest = PutItemRequestFactory.
      create().
      withTableNameOpt(nameOpt).
      withItemOpt(Some(item.map { case (k, v) => (k, v.underlying) }))
    client.putItemAsTry(putItemRequest).map(_ => ())
  }

  def getItem(keys: Map[String, AttributeValue])(implicit client: aws.AmazonDynamoDBClient): Try[Map[String, AttributeValue]] =
    client.getItemAsTry(
      nameOpt.get, keys.map {
        case (k, v) =>
          (k, v.underlying)
      }
    ).map { result =>
        result.itemOpt.map { item =>
          item.map {
            case (k, v) =>
              (k, AttributeValue(v))
          }
        }.get
      }

  def batchGetItem(requestItems: Map[String, KeysAndAttributes])(implicit client: aws.AmazonDynamoDBClient): Try[Unit] = {
    val batchGetItemRequest = BatchGetItemRequestFactory.
      create().
      withRequestItemsOpt(Some(requestItems.map { case (k, v) => (k, v.underlying) }))
    client.batchGetItemAsTry(batchGetItemRequest).
      map(_.getResponses.asScala.toMap.map { case (k, v) => (k, v.asScala.toSeq.map(_.asScala)) })
  }

  def batchWriteItem(requestItems: Map[String, Seq[WriteRequest]])(implicit client: aws.AmazonDynamoDBClient): Try[Unit] = {
    val batchWriteItemRequest = BatchWriteItemRequestFactory.
      create().
      withRequestItemsOpt(Some(requestItems.map { case (k, v) => (k, v.map(_.underlying)) }))
    client.batchWriteItemAsTry(batchWriteItemRequest).map(_ => ())
  }

}
