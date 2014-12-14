package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{GlobalSecondaryIndexDescription, KeySchemaElement, Projection, ProvisionedThroughputDescription}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object GlobalSecondaryIndexDescriptionFactory {

  def create(): GlobalSecondaryIndexDescription = new GlobalSecondaryIndexDescription()

}

class RichGlobalSecondaryIndexDescription(val underlying: GlobalSecondaryIndexDescription) extends AnyVal with PimpedType[GlobalSecondaryIndexDescription] {

  def indexNameOpt: Option[String] = Option(underlying.getIndexName)

  def indexNameOpt_=(value: Option[String]): Unit = underlying.setIndexName(value.orNull)

  def keySchemaOpt: Option[Seq[KeySchemaElement]] = Option(underlying.getKeySchema).map(_.asScala)

  def keySchemaOpt_=(value: Option[Seq[KeySchemaElement]]): Unit = underlying.setKeySchema(value.map(_.asJava).orNull)

  def withKeySchemaOpt(value: Option[Seq[KeySchemaElement]]): GlobalSecondaryIndexDescription = underlying.withKeySchema(value.map(_.asJava).orNull)

  def projectionOpt: Option[Projection] = Option(underlying.getProjection)

  def projectionOpt_=(value: Option[Projection]): Unit = underlying.setProjection(value.orNull)

  def indexStatusOpt: Option[String] = Option(underlying.getIndexStatus)

  def indexStatusOpt_=(value: Option[String]): Unit = underlying.getIndexStatus

  def provisionedThroughputOpt: Option[ProvisionedThroughputDescription] = Option(underlying.getProvisionedThroughput)

  def provisionedThroughputOpt_=(value: Option[ProvisionedThroughputDescription]): Unit = underlying.setProvisionedThroughput(value.orNull)

  def indexSizeBytesOpt: Option[Long] = Option(underlying.getIndexSizeBytes)

  def indexSizeBytesOpt_=(value: Option[Long]): Unit = underlying.setIndexSizeBytes(value.map(_.asInstanceOf[java.lang.Long]).orNull)

  def itemCountOpt: Option[Long] = Option(underlying.getItemCount)

  def itemCountOpt_=(value: Option[Long]): Unit = underlying.setItemCount(value.map(_.asInstanceOf[java.lang.Long]).orNull)


}
