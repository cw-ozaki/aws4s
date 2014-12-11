package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{GlobalSecondaryIndexDescription, KeySchemaElement, Projection, ProvisionedThroughputDescription}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object GlobalSecondaryIndexDescriptionFactory {

  def apply(): GlobalSecondaryIndexDescription = new GlobalSecondaryIndexDescription()

}

class RichGlobalSecondaryIndexDescription(val underlying: GlobalSecondaryIndexDescription) extends AnyVal with PimpedType[GlobalSecondaryIndexDescription] {

  def indexName: String = underlying.getIndexName

  def indexName_=(value: String): Unit = underlying.setIndexName(value)

  def keySchema: Seq[KeySchemaElement] = underlying.getKeySchema.asScala

  def keySchema_=(value: Seq[KeySchemaElement]): Unit = underlying.setKeySchema(value.asJava)

  def withKeySchema(value: Seq[KeySchemaElement]): GlobalSecondaryIndexDescription = underlying.withKeySchema(value.asJava)

  def projection: Projection = underlying.getProjection

  def projection_=(value: Projection): Unit = underlying.getProjection

  def indexStatus: String = underlying.getIndexStatus

  def indexStatus_=(value: String): Unit = underlying.getIndexStatus

  def provisionedThroughput: ProvisionedThroughputDescription = underlying.getProvisionedThroughput

  def provisionedThroughput_=(value: ProvisionedThroughputDescription): Unit = underlying.setProvisionedThroughput(value)

  def indexSizeBytes: Long = underlying.getIndexSizeBytes

  def indexSizeBytes_=(value: Long): Unit = underlying.setIndexSizeBytes(value)

  def itemCount: Long = underlying.getItemCount

  def itemCount_=(value: Long): Unit = underlying.setItemCount(value)


}
