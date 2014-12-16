package org.sisioh.aws4s.dynamodb.extension

import com.amazonaws.services.dynamodbv2.model.{ProvisionedThroughput, GlobalSecondaryIndex, GlobalSecondaryIndexDescription}
import org.sisioh.aws4s.dynamodb.Implicits._

case class GlobalSecondaryIndexEx(underlying: GlobalSecondaryIndexDescription) {

  val indexNameOpt: Option[String] = underlying.indexNameOpt

  val keySchemaElementsOpt: Option[Seq[KeySchemaElementEx]] =
    underlying.keySchemaOpt.map(_.map(KeySchemaElementEx(_)))

  val projectionOpt: Option[ProjectionEx] = underlying.projectionOpt.map(ProjectionEx)

  val provisionedThroughputOpt: Option[ProvisionedThroughputEx] =
    underlying.provisionedThroughputOpt.map(ProvisionedThroughputEx)

  val indexSizeBytesOpt: Option[Long] = underlying.indexSizeBytesOpt

  val indexStatusOpt: Option[String] = underlying.indexStatusOpt

  val itemCountOpt: Option[Long] = underlying.itemCountOpt

  def toGlobalSecondaryIndex = {
    new GlobalSecondaryIndex().
      withIndexName(underlying.getIndexName).
      withKeySchema(underlying.getKeySchema).
      withProjection(underlying.getProjection).
      withProvisionedThroughput(
        new ProvisionedThroughput(
          underlying.getProvisionedThroughput.getReadCapacityUnits,
          underlying.getProvisionedThroughput.getWriteCapacityUnits
        )
      )
  }


}
