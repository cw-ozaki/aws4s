package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model._
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._


object CreateGlobalSecondaryIndexActionFactory {

  def create(): CreateGlobalSecondaryIndexAction = new CreateGlobalSecondaryIndexAction()

}

class RichCreateGlobalSecondaryIndexAction(val underlying: CreateGlobalSecondaryIndexAction)
  extends AnyVal with PimpedType[CreateGlobalSecondaryIndexAction] {

  def indexNameOpt: Option[String] = Option(underlying.getIndexName)

  def indexNameOpt_=(value: Option[String]): Unit =
    underlying.setIndexName(value.orNull)

  def withIndexNameOpt(value: Option[String]): CreateGlobalSecondaryIndexAction =
    underlying.withIndexName(value.orNull)

  // ---

  def keySchema: Seq[KeySchemaElement] = underlying.getKeySchema.asScala.toVector

  def keySchema_=(value: Seq[KeySchemaElement]): Unit =
    underlying.setKeySchema(value.asJava)

  def withKeySchema(value: Seq[KeySchemaElement]): CreateGlobalSecondaryIndexAction =
    underlying.withKeySchema(value.asJava)

  // ---

  def projectionOpt: Option[Projection] = Option(underlying.getProjection)

  def projectionOpt_=(value: Option[Projection]): Unit =
    underlying.setProjection(value.orNull)

  def withProjectionOpt(value: Option[Projection]): CreateGlobalSecondaryIndexAction =
    underlying.withProjection(value.orNull)

  // ---

  def provisionedThroughputOpt: Option[ProvisionedThroughput] = Option(underlying.getProvisionedThroughput)

  def provisionedThroughputOpt_=(value: Option[ProvisionedThroughput]): Unit =
    underlying.setProvisionedThroughput(value.orNull)

  def withProvisionedThroughputOpt(value: Option[ProvisionedThroughput]): CreateGlobalSecondaryIndexAction =
    underlying.withProvisionedThroughput(value.orNull)

}
