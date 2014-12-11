package org.sisioh.aws4s.dynamodb.model

import java.util.Date

import com.amazonaws.services.dynamodbv2.model._
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object TableDescriptionFactory {

  def apply(): TableDescription = new TableDescription()
}

class RichTableDescription(val underlying: TableDescription) extends AnyVal with PimpedType[TableDescription] {

  def attributeDefinitions: Seq[AttributeDefinition] = underlying.getAttributeDefinitions.asScala

  def attributeDefinitions_=(value: Seq[AttributeDefinition]): Unit = underlying.setAttributeDefinitions(value.asJava)

  def withAttributeDefinitions(value: Seq[AttributeDefinition]): TableDescription = underlying.withAttributeDefinitions(value.asJava)

  def tableName: String = underlying.getTableName

  def tableName_=(value: String): Unit = underlying.setTableName(value)

  def keySchema: Seq[KeySchemaElement] = underlying.getKeySchema.asScala

  def keySchema_=(value: Seq[KeySchemaElement]): Unit = underlying.setKeySchema(value.asJava)

  def withKeySchema(value: Seq[KeySchemaElement]): TableDescription = underlying.withKeySchema(value.asJava)

  def tableStatus: String = underlying.getTableStatus

  def tableStatus_=(value: String): Unit = underlying.setTableStatus(value)

  def creationDateTime: Date = underlying.getCreationDateTime

  def creationDateTime_=(value: Date): Unit = underlying.setCreationDateTime(value)

  def provisionedThroughput: ProvisionedThroughputDescription = underlying.getProvisionedThroughput

  def provisionedThroughput_=(value: ProvisionedThroughputDescription): Unit = underlying.setProvisionedThroughput(value)

  def tableSizeBytes: Long = underlying.getTableSizeBytes

  def tableSizeBytes_=(value: Long): Unit = underlying.setTableSizeBytes(value)

  def itemCount: Long = underlying.getItemCount

  def itemCount_=(value: Long): Unit = underlying.setItemCount(value)

  def localSecondaryIndexes: Seq[LocalSecondaryIndexDescription] = underlying.getLocalSecondaryIndexes.asScala

  def localSecondaryIndexes_=(value: Seq[LocalSecondaryIndexDescription]): Unit = underlying.setLocalSecondaryIndexes(value.asJava)

  def withLocalSecondaryIndexes(value: Seq[LocalSecondaryIndexDescription]): TableDescription = underlying.withLocalSecondaryIndexes(value.asJava)

  def globalSecondaryIndexes: Seq[GlobalSecondaryIndexDescription] = underlying.getGlobalSecondaryIndexes.asScala

  def globalSecondaryIndexes_=(value: Seq[GlobalSecondaryIndexDescription]): Unit = underlying.withGlobalSecondaryIndexes(value.asJava)

  def withGlobalSecondaryIndexes(value: Seq[GlobalSecondaryIndexDescription]): TableDescription = underlying.withGlobalSecondaryIndexes(value.asJava)

}
