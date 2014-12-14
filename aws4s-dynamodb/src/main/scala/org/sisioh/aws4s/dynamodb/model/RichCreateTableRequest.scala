package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model._
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object CreateTableRequestFactory {

  def create(): CreateTableRequest = new CreateTableRequest()

  def create(tableName: String, keySchema: Seq[KeySchemaElement]): CreateTableRequest =
    new CreateTableRequest(tableName, keySchema.asJava)

  def create(attributeDefinitions: Seq[AttributeDefinition], tableName: String, keySchema: Seq[KeySchemaElement], provisionedThroughput: ProvisionedThroughput): CreateTableRequest =
    new CreateTableRequest(attributeDefinitions.asJava, tableName, keySchema.asJava, provisionedThroughput)

}

class RichCreateTableRequest(val underlying: CreateTableRequest) extends AnyVal with PimpedType[CreateTableRequest] {

  def tableNameOpt: Option[String] = Option(underlying.getTableName)

  def tableNameOpt_=(value: Option[String]): Unit = underlying.setTableName(value.orNull)

  def withTableNameOpt(value: Option[String]): CreateTableRequest = underlying.withTableName(value.orNull)

  def attributeDefinitionOpt_=(value: Option[Seq[AttributeDefinition]]): Unit =
    underlying.setAttributeDefinitions(value.map(_.asJava).orNull)

  def attributeDefinitionsOpt: Option[Seq[AttributeDefinition]] = Option(underlying.getAttributeDefinitions).map(_.asScala)

  def withAttributeDefinitionsOpt(values: Option[Iterable[AttributeDefinition]]): CreateTableRequest =
    underlying.withAttributeDefinitions(values.map(_.toSeq.asJava).orNull)

  def keySchemeOpt_=(value: Option[Seq[KeySchemaElement]]): Unit =
    underlying.setKeySchema(value.map(_.asJava).orNull)

  def keySchemaOpt: Option[Seq[KeySchemaElement]] = Option(underlying.getKeySchema).map(_.asScala)

  def withKeySchemaOpt(value: Option[Iterable[KeySchemaElement]]): CreateTableRequest =
    underlying.withKeySchema(value.map(_.toSeq.asJava).orNull)

  def localSecondaryIndexesOpt_=(value: Option[Seq[LocalSecondaryIndex]]): Unit =
    underlying.setLocalSecondaryIndexes(value.map(_.asJava).orNull)

  def localSecondaryIndexesOpt: Option[Seq[LocalSecondaryIndex]] =
    Option(underlying.getLocalSecondaryIndexes).map(_.asScala)

  def withLocalSecondaryIndexesOpt(value: Option[Iterable[LocalSecondaryIndex]]): CreateTableRequest =
    underlying.withLocalSecondaryIndexes(value.map(_.toSeq.asJava).orNull)

  def globalSecondaryIndexesOpt_=(value: Option[Seq[GlobalSecondaryIndex]]): Unit =
    underlying.setGlobalSecondaryIndexes(value.map(_.asJava).orNull)

  def globalSecondaryIndexesOpt: Option[Seq[GlobalSecondaryIndex]] =
    Option(underlying.getGlobalSecondaryIndexes).map(_.asScala)

  def withGlobalSecondaryIndexesOpt(value: Option[Iterable[GlobalSecondaryIndex]]): CreateTableRequest =
    underlying.withGlobalSecondaryIndexes(value.map(_.toSeq.asJava).orNull)

  def provisionedThroughputOpt: Option[ProvisionedThroughput] =
    Option(underlying.getProvisionedThroughput)

  def provisionedThroughputOpt_=(value: Option[ProvisionedThroughput]): Unit =
    underlying.setProvisionedThroughput(value.orNull)

  def withProvisionedThroughputOpt(value: Option[ProvisionedThroughput]): CreateTableRequest =
    underlying.withProvisionedThroughput(value.orNull)

}

