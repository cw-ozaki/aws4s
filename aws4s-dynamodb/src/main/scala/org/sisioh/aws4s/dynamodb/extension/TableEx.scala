package org.sisioh.aws4s.dynamodb.extension

import java.util.Date

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient
import com.amazonaws.services.dynamodbv2.model.TableDescription
import org.sisioh.aws4s.dynamodb.Implicits._
import org.sisioh.aws4s.dynamodb.model.{KeySchemaElementFactory, PutItemRequestFactory}

import scala.util.Try

case class TableEx(underlying: TableDescription) {

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

  def putItem(item: Map[String, AttributeValueEx])(implicit client: AmazonDynamoDBClient): Try[Unit] = {
    val req = PutItemRequestFactory.
      create().
      withTableNameOpt(nameOpt).
      withItemOpt(Some(item.map { case (k, v) => (k, v.underlying)}))
    client.requestPutItem(req).map(_ => ())
  }

  def getItem(keys: Map[String, AttributeValueEx])(implicit client: AmazonDynamoDBClient): Try[Map[String, AttributeValueEx]] =
    client.requestGetItem(
      nameOpt.get, keys.map { case (k, v) =>
        (k, v.underlying)
      }
    ).map { result =>
      result.itemOpt.map { map =>
        map.map { case (k, v) =>
          (k, AttributeValueEx(v))
        }
      }.get
    }

}
