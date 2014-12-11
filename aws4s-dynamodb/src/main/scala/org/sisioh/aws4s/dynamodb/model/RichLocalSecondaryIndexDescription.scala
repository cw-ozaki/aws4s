package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{Projection, KeySchemaElement, LocalSecondaryIndexDescription}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object LocalSecondaryIndexDescriptionFactory {

  def apply(): LocalSecondaryIndexDescription = new LocalSecondaryIndexDescription()

}

class RichLocalSecondaryIndexDescription(val underlying: LocalSecondaryIndexDescription) extends AnyVal with PimpedType[LocalSecondaryIndexDescription] {

  def indexName: String = underlying.getIndexName

  def indexName_=(value: String): Unit = underlying.setIndexName(value)

  def keySchema: Seq[KeySchemaElement] = underlying.getKeySchema.asScala

  def keySchema_=(value: Seq[KeySchemaElement]): Unit = underlying.setKeySchema(value.asJava)

  def withKeySchema(value: Seq[KeySchemaElement]): LocalSecondaryIndexDescription = underlying.withKeySchema(value.asJava)

  def projection: Projection = underlying.getProjection

  def projection_=(value: Projection): Unit = underlying.setProjection(value)

  def indexSizeBytes: Long = underlying.getIndexSizeBytes

  def indexSizeBytes_=(value: Long): Unit = underlying.setIndexSizeBytes(value)

  def itemCount: Long = underlying.getItemCount

  def itemCount_=(value: Long): Unit = underlying.setItemCount(value)

}
