package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model._
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object CreateTableRequestFactory {

  def apply(): CreateTableRequest = new CreateTableRequest()

  def apply(tableName: String, keySchema: Seq[KeySchemaElement]): CreateTableRequest =
    new CreateTableRequest(tableName, keySchema.asJava)

  def apply(attributeDefinitions: Seq[AttributeDefinition], tableName: String, keySchema: Seq[KeySchemaElement], provisionedThroughput: ProvisionedThroughput): CreateTableRequest =
    new CreateTableRequest(attributeDefinitions.asJava, tableName, keySchema.asJava, provisionedThroughput)

}

class RichCreateTableRequest(val underlying: CreateTableRequest) extends AnyVal with PimpedType[CreateTableRequest] {

  def attributeDefinitions_=(value: Seq[AttributeDefinition]): Unit =
    underlying.setAttributeDefinitions(value.asJava)

  def attributeDefinitions: Seq[AttributeDefinition] = underlying.getAttributeDefinitions.asScala

  def withAttributeDefinitions(attributeDefinitions: Iterable[AttributeDefinition]): CreateTableRequest =
    underlying.withAttributeDefinitions(attributeDefinitions.toSeq.asJava)

  def keyScheme_=(value: Seq[KeySchemaElement]): Unit =
    underlying.setKeySchema(value.asJava)

  def keySchema: Seq[KeySchemaElement] = underlying.getKeySchema.asScala

  def withKeySchema(keySchema: Iterable[KeySchemaElement]): CreateTableRequest =
    underlying.withKeySchema(keySchema.toSeq.asJava)

  def localSecondaryIndexes_=(value: Seq[LocalSecondaryIndex]): Unit =
    underlying.setLocalSecondaryIndexes(value.asJava)

  def localSecondaryIndexes: Seq[LocalSecondaryIndex] =
    underlying.getLocalSecondaryIndexes.asScala

  def withLocalSecondaryIndexes(localSecondaryIndexes: Iterable[LocalSecondaryIndex]): CreateTableRequest =
    underlying.withLocalSecondaryIndexes(localSecondaryIndexes.toSeq.asJava)

  def globalSecondaryIndexes_=(value: Seq[GlobalSecondaryIndex]): Unit =
    underlying.setGlobalSecondaryIndexes(value.asJava)

  def globalSecondaryIndexes: Seq[GlobalSecondaryIndex] = underlying.getGlobalSecondaryIndexes.asScala

  def withGlobalSecondaryIndexes(globalSecondaryIndexes: Iterable[GlobalSecondaryIndex]): CreateTableRequest =
    underlying.withGlobalSecondaryIndexes(globalSecondaryIndexes.toSeq.asJava)

}

