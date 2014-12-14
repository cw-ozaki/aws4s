package org.sisioh.aws4s.dynamodb.extension

import java.util.Date

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient
import org.sisioh.aws4s.dynamodb.Implicits._
import org.sisioh.aws4s.dynamodb.model.PutItemRequestFactory

import scala.util.Try

case class TableEx(name: String,
                   keySchemas: Seq[KeySchemaElementEx],
                   creationDateTime: Date,
                   provisionedThroughput: ProvisionedThroughputEx,
                   tableSizeBytes: Long,
                   itemCount: Long,
                   localSecondaryIndexes: Seq[LocalSecondaryIndexEx],
                   globalSecondaryIndexes: Seq[GlobalSecondaryIndexEx]) {

  def putItem(item: Map[String, AttributeValueEx])(implicit client: AmazonDynamoDBClient): Try[Unit] = Try {
    val req = PutItemRequestFactory.
      create().
      withTableNameOpt(Some(name)).
      withItemOpt(Some(item.map { case (k, v) => (k, v.toUnderlying)}))
    client.putItem(req)
  }

  def getItem(keys: Map[String, AttributeValueEx])(implicit client: AmazonDynamoDBClient): Try[Map[String, AttributeValueEx]] =
    client.getItem(
      name, keys.map { case (k, v) =>
        (k, v.toUnderlying)
      }
    ).map { result =>
      result.itemOpt.map { map =>
        map.map { case (k, v) =>
          (k, AttributeValueEx(v))
        }
      }.get
    }

}
