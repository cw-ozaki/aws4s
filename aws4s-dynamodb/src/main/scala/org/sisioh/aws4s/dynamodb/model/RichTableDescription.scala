package org.sisioh.aws4s.dynamodb.model

import java.util.Date

import com.amazonaws.services.dynamodbv2.model._
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object TableDescriptionFactory {

  def create(): TableDescription = new TableDescription()
}

class RichTableDescription(val underlying: TableDescription) extends AnyVal with PimpedType[TableDescription] {

  // ---

  def attributeDefinitionsOpt: Option[Seq[AttributeDefinition]] = Option(underlying.getAttributeDefinitions).map(_.asScala.toVector)

  def attributeDefinitionsOpt_=(value: Option[Seq[AttributeDefinition]]): Unit = underlying.setAttributeDefinitions(value.map(_.asJava).orNull)

  def withAttributeDefinitionsOpt(value: Option[Seq[AttributeDefinition]]): TableDescription = underlying.withAttributeDefinitions(value.map(_.asJava).orNull)

  // ---

  def tableNameOpt: Option[String] = Option(underlying.getTableName)

  def tableNameOpt_=(value: Option[String]): Unit = underlying.setTableName(value.orNull)

  def withTableNameOpt(value: Option[String]): TableDescription = underlying.withTableName(value.orNull)

  // ---

  def keySchemaOpt: Option[Seq[KeySchemaElement]] = Option(underlying.getKeySchema).map(_.asScala.toVector)

  def keySchemaOpt_=(value: Option[Seq[KeySchemaElement]]): Unit = underlying.setKeySchema(value.map(_.asJava).orNull)

  def withKeySchemaOpt(value: Option[Seq[KeySchemaElement]]): TableDescription = underlying.withKeySchema(value.map(_.asJava).orNull)

  // ---

  def tableStatusOpt: Option[String] = Option(underlying.getTableStatus)

  def tableStatusOpt_=(value: Option[String]): Unit = underlying.setTableStatus(value.orNull)

  def withTableStatusOpt(value: Option[String]): TableDescription = underlying.withTableStatus(value.orNull)

  // ---

  def creationDateTimeOpt: Option[Date] = Option(underlying.getCreationDateTime)

  def creationDateTimeOpt_=(value: Option[Date]): Unit = underlying.setCreationDateTime(value.orNull)

  def withCreationDateTimeOpt(value: Option[Date]): TableDescription = underlying.withCreationDateTime(value.orNull)

  // ---

  def provisionedThroughputOpt: Option[ProvisionedThroughputDescription] = Option(underlying.getProvisionedThroughput)

  def provisionedThroughputOpt_=(value: Option[ProvisionedThroughputDescription]): Unit = underlying.setProvisionedThroughput(value.orNull)

  def withProvisionedThroughputOpt(value: Option[ProvisionedThroughputDescription]): TableDescription = underlying.withProvisionedThroughput(value.orNull)

  // ---

  def tableSizeBytesOpt: Option[Long] = Option(underlying.getTableSizeBytes)

  def tableSizeBytesOpt_=(value: Option[Long]): Unit = underlying.setTableSizeBytes(value.map(_.asInstanceOf[java.lang.Long]).orNull)

  def withTableSizeBytesOpt(value: Option[Long]): TableDescription = underlying.withTableSizeBytes(value.map(_.asInstanceOf[java.lang.Long]).orNull)

  // ---

  def itemCountOpt: Option[Long] = Option(underlying.getItemCount)

  def itemCountOpt_=(value: Option[Long]): Unit = underlying.setItemCount(value.map(_.asInstanceOf[java.lang.Long]).orNull)

  def withItemCountOpt(value: Option[Long]): TableDescription = underlying.withItemCount(value.map(_.asInstanceOf[java.lang.Long]).orNull)

  // ---

  def localSecondaryIndexesOpt: Option[Seq[LocalSecondaryIndexDescription]] = Option(underlying.getLocalSecondaryIndexes).map(_.asScala.toVector)

  def localSecondaryIndexesOpt_=(value: Option[Seq[LocalSecondaryIndexDescription]]): Unit = underlying.setLocalSecondaryIndexes(value.map(_.asJava).orNull)

  def withLocalSecondaryIndexesOpt(value: Seq[LocalSecondaryIndexDescription]): TableDescription = underlying.withLocalSecondaryIndexes(value.asJava)

  // ---

  def globalSecondaryIndexesOpt: Option[Seq[GlobalSecondaryIndexDescription]] = Option(underlying.getGlobalSecondaryIndexes).map(_.asScala.toVector)

  def globalSecondaryIndexesOpt_=(value: Option[Seq[GlobalSecondaryIndexDescription]]): Unit = underlying.withGlobalSecondaryIndexes(value.map(_.asJava).orNull)

  def withGlobalSecondaryIndexesOpt(value: Option[Seq[GlobalSecondaryIndexDescription]]): TableDescription = underlying.withGlobalSecondaryIndexes(value.map(_.asJava).orNull)

  // ---

}
