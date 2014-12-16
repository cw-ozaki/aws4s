package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{GlobalSecondaryIndexDescription, KeySchemaElement, Projection, ProvisionedThroughputDescription}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object GlobalSecondaryIndexDescriptionFactory {

  def create(): GlobalSecondaryIndexDescription = new GlobalSecondaryIndexDescription()

}

class RichGlobalSecondaryIndexDescription(val underlying: GlobalSecondaryIndexDescription) extends AnyVal with PimpedType[GlobalSecondaryIndexDescription] {

  // ---

  def indexNameOpt: Option[String] = Option(underlying.getIndexName)

  def indexNameOpt_=(value: Option[String]): Unit = underlying.setIndexName(value.orNull)

  def withIndexNameOpt(value: Option[String]): GlobalSecondaryIndexDescription = underlying.withIndexName(value.orNull)

  // ---

  def keySchemaOpt: Option[Seq[KeySchemaElement]] = Option(underlying.getKeySchema).map(_.asScala)

  def keySchemaOpt_=(value: Option[Seq[KeySchemaElement]]): Unit = underlying.setKeySchema(value.map(_.asJava).orNull)

  def withKeySchemaOpt(value: Option[Seq[KeySchemaElement]]): GlobalSecondaryIndexDescription = underlying.withKeySchema(value.map(_.asJava).orNull)

  // ---

  def projectionOpt: Option[Projection] = Option(underlying.getProjection)

  def projectionOpt_=(value: Option[Projection]): Unit = underlying.setProjection(value.orNull)

  def withProjectionOpt(value: Option[Projection]): GlobalSecondaryIndexDescription = underlying.withProjection(value.orNull)

  // ---

  def indexStatusOpt: Option[String] = Option(underlying.getIndexStatus)

  def indexStatusOpt_=(value: Option[String]): Unit = underlying.setIndexStatus(value.orNull)

  def withIndexStatusOpt(value: Option[String]): GlobalSecondaryIndexDescription = underlying.withIndexStatus(value.orNull)

  // ---

  def provisionedThroughputOpt: Option[ProvisionedThroughputDescription] = Option(underlying.getProvisionedThroughput)

  def provisionedThroughputOpt_=(value: Option[ProvisionedThroughputDescription]): Unit = underlying.setProvisionedThroughput(value.orNull)

  def withProvisionedThroughputOpt(value: Option[ProvisionedThroughputDescription]): GlobalSecondaryIndexDescription = underlying.withProvisionedThroughput(value.orNull)

  // ---

  def indexSizeBytesOpt: Option[Long] = Option(underlying.getIndexSizeBytes)

  def indexSizeBytesOpt_=(value: Option[Long]): Unit = underlying.setIndexSizeBytes(value.map(_.asInstanceOf[java.lang.Long]).orNull)

  def withIndexSizeBytesOpt_=(value: Option[Long]): GlobalSecondaryIndexDescription = underlying.withIndexSizeBytes(value.map(_.asInstanceOf[java.lang.Long]).orNull)

  // ---

  def itemCountOpt: Option[Long] = Option(underlying.getItemCount)

  def itemCountOpt_=(value: Option[Long]): Unit = underlying.setItemCount(value.map(_.asInstanceOf[java.lang.Long]).orNull)

  def withitemCountOpt_=(value: Option[Long]): GlobalSecondaryIndexDescription = underlying.withItemCount(value.map(_.asInstanceOf[java.lang.Long]).orNull)

  // ---

}
