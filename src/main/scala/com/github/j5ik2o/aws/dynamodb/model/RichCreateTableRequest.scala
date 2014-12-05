package com.github.j5ik2o.aws.dynamodb.model

import com.amazonaws.services.dynamodbv2.model._
import com.github.j5ik2o.aws.dynamodb.PimpedType

import scala.collection.JavaConverters._

object CreateTableRequestFactory {

  def apply(): CreateTableRequest = new CreateTableRequest()

  def apply(tableName: String, keySchema: Seq[KeySchemaElement]): CreateTableRequest =
    new CreateTableRequest(tableName, keySchema.asJava)

  def apply(attributeDefinitions: Seq[AttributeDefinition], tableName: String, keySchema: Seq[KeySchemaElement], provisionedThroughput: ProvisionedThroughput): CreateTableRequest =
    new CreateTableRequest(attributeDefinitions.asJava, tableName, keySchema.asJava, provisionedThroughput)

}

class RichCreateTableRequest(val underlying: CreateTableRequest) extends AnyVal with PimpedType[CreateTableRequest] {

  def attributeDefinitions: Seq[AttributeDefinition] = underlying.getAttributeDefinitions.asScala

  def withAttributeDefinitions(attributeDefinitions: Iterable[AttributeDefinition]): CreateTableRequest =
    underlying.withAttributeDefinitions(attributeDefinitions.toSeq.asJava)

  def keySchema: Seq[KeySchemaElement] = underlying.getKeySchema.asScala

  def withKeySchema(keySchema: Iterable[KeySchemaElement]): CreateTableRequest =
    underlying.withKeySchema(keySchema.toSeq.asJava)

  def localSecondaryIndexes: Seq[LocalSecondaryIndex] =
    underlying.getLocalSecondaryIndexes.asScala

  def withLocalSecondaryIndexes(localSecondaryIndexes: Iterable[LocalSecondaryIndex]): CreateTableRequest =
    underlying.withLocalSecondaryIndexes(localSecondaryIndexes.toSeq.asJava)

  def globalSecondaryIndexes: Seq[GlobalSecondaryIndex] = underlying.getGlobalSecondaryIndexes.asScala

  def withGlobalSecondaryIndexes(globalSecondaryIndexes: Iterable[GlobalSecondaryIndex]): CreateTableRequest =
    underlying.withGlobalSecondaryIndexes(globalSecondaryIndexes.toSeq.asJava)

}

