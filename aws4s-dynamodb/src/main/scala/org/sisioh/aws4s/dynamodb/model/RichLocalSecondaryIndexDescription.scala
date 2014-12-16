package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{Projection, KeySchemaElement, LocalSecondaryIndexDescription}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object LocalSecondaryIndexDescriptionFactory {

  def create(): LocalSecondaryIndexDescription = new LocalSecondaryIndexDescription()

}

class RichLocalSecondaryIndexDescription(val underlying: LocalSecondaryIndexDescription) extends AnyVal with PimpedType[LocalSecondaryIndexDescription] {

  // ---

  def indexNameOpt: Option[String] = Option(underlying.getIndexName)

  def indexNameOpt_=(value: Option[String]): Unit = underlying.setIndexName(value.orNull)

  def withIndexNameOpt(value: Option[String]): LocalSecondaryIndexDescription = underlying.withIndexName(value.orNull)

  // ---

  def keySchemaOpt: Option[Seq[KeySchemaElement]] = Option(underlying.getKeySchema).map(_.asScala)

  def keySchemaOpt_=(value: Option[Seq[KeySchemaElement]]): Unit = underlying.setKeySchema(value.map(_.asJava).orNull)

  def withKeySchemaOpt(value: Option[Seq[KeySchemaElement]]): LocalSecondaryIndexDescription = underlying.withKeySchema(value.map(_.asJava).orNull)

  // ---

  def projectionOpt: Option[Projection] = Option(underlying.getProjection)

  def projectionOpt_=(value: Option[Projection]): Unit = underlying.setProjection(value.orNull)

  def withProjectionOpt(value: Option[Projection]): LocalSecondaryIndexDescription = underlying.withProjection(value.orNull)

  // ---

  def indexSizeBytesOpt: Option[Long] = Option(underlying.getIndexSizeBytes)

  def indexSizeBytesOpt_=(value: Option[Long]): Unit = underlying.setIndexSizeBytes(value.map(_.asInstanceOf[java.lang.Long]).orNull)

  def withIndexSizeBytesOpt(value: Option[Long]): LocalSecondaryIndexDescription = underlying.withIndexSizeBytes(value.map(_.asInstanceOf[java.lang.Long]).orNull)

  // ---

  def itemCountOpt: Option[Long] = Option(underlying.getItemCount)

  def itemCountOpt_=(value: Option[Long]): Unit = underlying.setItemCount(value.map(_.asInstanceOf[java.lang.Long]).orNull)

  def withItemCountOpt(value: Option[Long]): LocalSecondaryIndexDescription = underlying.withItemCount(value.map(_.asInstanceOf[java.lang.Long]).orNull)

  // ---

}
