package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{KeySchemaElement, LocalSecondaryIndex, Projection}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object LocalSecondaryIndexFactory {

  def apply(): LocalSecondaryIndex = new LocalSecondaryIndex()
}

class RichLocalSecondaryIndex(val underlying: LocalSecondaryIndex) extends AnyVal with PimpedType[LocalSecondaryIndex] {

  def indexName: String = underlying.getIndexName

  def indexName_=(value: String): Unit = underlying.setIndexName(value)

  def keySchema: Seq[KeySchemaElement] = underlying.getKeySchema.asScala

  def keySchema_=(value: Seq[KeySchemaElement]): Unit = underlying.setKeySchema(value.asJava)

  def withKeySchema(value: Seq[KeySchemaElement]): LocalSecondaryIndex = underlying.withKeySchema(value.asJava)

  def projection: Projection = underlying.getProjection

  def projection_=(value: Projection): Unit = underlying.setProjection(value)

}
