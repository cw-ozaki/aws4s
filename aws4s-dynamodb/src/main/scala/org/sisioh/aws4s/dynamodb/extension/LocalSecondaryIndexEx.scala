package org.sisioh.aws4s.dynamodb.extension

import com.amazonaws.services.dynamodbv2.model.LocalSecondaryIndexDescription
import org.sisioh.aws4s.dynamodb.Implicits._

case class LocalSecondaryIndexEx(underlying: LocalSecondaryIndexDescription) {

  val indexNameOpt: Option[String] = underlying.indexNameOpt

  val keySchemaOpt: Option[Seq[KeySchemaElementEx]] = underlying.keySchemaOpt.map(_.map(KeySchemaElementEx(_)))

  val projectionOpt: Option[ProjectionEx] = underlying.projectionOpt.map(ProjectionEx)

  val indexSizeBytesOpt: Option[Long] = underlying.indexSizeBytesOpt

  val itemCountOpt: Option[Long] = underlying.itemCountOpt

}
