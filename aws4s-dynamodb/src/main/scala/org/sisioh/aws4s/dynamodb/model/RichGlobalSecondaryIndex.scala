package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{GlobalSecondaryIndex, KeySchemaElement, Projection, ProvisionedThroughput}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object GlobalSecondaryIndexFactory {

  def apply(): GlobalSecondaryIndex = new GlobalSecondaryIndex()

}

class RichGlobalSecondaryIndex(val underlying: GlobalSecondaryIndex) extends AnyVal with PimpedType[GlobalSecondaryIndex] {

  def indexName: String = underlying.getIndexName

  def indexName_=(value: String): Unit = underlying.setIndexName(value)

  def keySchema: Seq[KeySchemaElement] = underlying.getKeySchema.asScala

  def keySchema_=(value: Seq[KeySchemaElement]): Unit = underlying.setKeySchema(value.asJava)

  def withKeySchema(value: Seq[KeySchemaElement]): GlobalSecondaryIndex = underlying.withKeySchema(value.asJava)

  def projection: Projection = underlying.getProjection

  def projection(value: Projection): Unit = underlying.setProjection(value)

  def provisionedThroughput: ProvisionedThroughput = underlying.getProvisionedThroughput

  def provisionedThroughput(value: ProvisionedThroughput): Unit = underlying.setProvisionedThroughput(value)

}
