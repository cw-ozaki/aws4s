package org.sisioh.aws4s.dynamodb.extension

import com.amazonaws.services.{dynamodbv2 => aws}
import org.sisioh.aws4s.dynamodb.Implicits._

case class LocalSecondaryIndex(underlying: aws.model.LocalSecondaryIndexDescription) {

  val indexNameOpt: Option[String] = underlying.indexNameOpt

  val keySchemaOpt: Option[Seq[KeySchemaElement]] = underlying.keySchemaOpt.map(_.map(KeySchemaElement(_)))

  val projectionOpt: Option[Projection] = underlying.projectionOpt.map(Projection)

  val indexSizeBytesOpt: Option[Long] = underlying.indexSizeBytesOpt

  val itemCountOpt: Option[Long] = underlying.itemCountOpt

  def toLocalSecondaryIndex: aws.model.LocalSecondaryIndex =
    new aws.model.LocalSecondaryIndex().
      withIndexName(underlying.getIndexName).
      withKeySchema(underlying.getKeySchema).
      withProjection(underlying.getProjection)

}
