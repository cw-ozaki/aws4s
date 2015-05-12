package org.sisioh.aws4s.dynamodb.extension

import com.amazonaws.services.{ dynamodbv2 => aws }
import org.sisioh.aws4s.dynamodb.Implicits._
import org.sisioh.aws4s.dynamodb.model.GlobalSecondaryIndexFactory

case class GlobalSecondaryIndex(underlying: aws.model.GlobalSecondaryIndexDescription) {

  val indexNameOpt: Option[String] = underlying.indexNameOpt

  val keySchemaElementsOpt: Option[Seq[KeySchemaElement]] =
    underlying.keySchemaOpt.map(_.map(KeySchemaElement(_)))

  val projectionOpt: Option[Projection] = underlying.projectionOpt.map(Projection)

  val provisionedThroughputOpt: Option[ProvisionedThroughput] =
    underlying.provisionedThroughputOpt.map(ProvisionedThroughput)

  val indexSizeBytesOpt: Option[Long] = underlying.indexSizeBytesOpt

  val indexStatusOpt: Option[String] = underlying.indexStatusOpt

  val itemCountOpt: Option[Long] = underlying.itemCountOpt

  def toGlobalSecondaryIndex: aws.model.GlobalSecondaryIndex = {
    GlobalSecondaryIndexFactory.create().
      withIndexName(underlying.getIndexName).
      withKeySchema(underlying.getKeySchema).
      withProjection(underlying.getProjection).
      withProvisionedThroughputOpt(provisionedThroughputOpt.map(_.toProvisionedThroughput))
  }

}
