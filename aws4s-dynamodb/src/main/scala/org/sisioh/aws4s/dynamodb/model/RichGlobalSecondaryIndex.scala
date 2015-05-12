package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{ GlobalSecondaryIndex, KeySchemaElement, Projection, ProvisionedThroughput }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object GlobalSecondaryIndexFactory {

  def create(): GlobalSecondaryIndex = new GlobalSecondaryIndex()

}

class RichGlobalSecondaryIndex(val underlying: GlobalSecondaryIndex) extends AnyVal with PimpedType[GlobalSecondaryIndex] {

  def indexNameOpt: Option[String] = Option(underlying.getIndexName)

  def indexNameOpt_=(value: Option[String]): Unit = underlying.setIndexName(value.orNull)

  def withIndexNameOpt(value: Option[String]): GlobalSecondaryIndex = underlying.withIndexName(value.orNull)

  def keySchemaOpt: Option[Seq[KeySchemaElement]] = Option(underlying.getKeySchema).map(_.asScala.toVector)

  def keySchemaOpt_=(value: Option[Seq[KeySchemaElement]]): Unit = underlying.setKeySchema(value.map(_.asJava).orNull)

  def withKeySchemaOpt(value: Option[Seq[KeySchemaElement]]): GlobalSecondaryIndex =
    underlying.withKeySchema(value.map(_.asJava).orNull)

  def projectionOpt: Option[Projection] = Option(underlying.getProjection)

  def projectionOpt(value: Option[Projection]): Unit = underlying.setProjection(value.orNull)

  def withProjectionOpt(value: Option[Projection]): GlobalSecondaryIndex = underlying.withProjection(value.orNull)

  def provisionedThroughputOpt: Option[ProvisionedThroughput] = Option(underlying.getProvisionedThroughput)

  def provisionedThroughputOpt(value: Option[ProvisionedThroughput]): Unit = underlying.setProvisionedThroughput(value.orNull)

  def withProvisionedThroughputOpt(value: Option[ProvisionedThroughput]): GlobalSecondaryIndex = underlying.withProvisionedThroughput(value.orNull)

}
