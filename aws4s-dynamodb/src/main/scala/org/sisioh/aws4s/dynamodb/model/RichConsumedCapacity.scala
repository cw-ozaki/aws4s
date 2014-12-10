package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{Capacity, ConsumedCapacity}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ConsumedCapacityFactory {

  def apply(): ConsumedCapacity = new ConsumedCapacity()

}

class RichConsumedCapacity(val underlying: ConsumedCapacity) extends AnyVal with PimpedType[ConsumedCapacity] {

  def tableName_=(value: Capacity): Unit = underlying.setTable(value)

  def tableName: Capacity = underlying.getTable

  def localSecondaryIndexes_=(value: Map[String, Capacity]): Unit =
    underlying.setLocalSecondaryIndexes(value.asJava)

  def localSecondaryIndexes: Map[String, Capacity] =
    underlying.getLocalSecondaryIndexes.asScala.toMap

  def withLocalSecondaryIndexes(localSecondaryIndexes: Map[String, Capacity]): ConsumedCapacity =
    underlying.withLocalSecondaryIndexes(localSecondaryIndexes.asJava)

  def globalSecondaryIndexes_=(value: Map[String, Capacity]): Unit =
    underlying.setGlobalSecondaryIndexes(value.asJava)

  def globalSecondaryIndexes: Map[String, Capacity] =
    underlying.getGlobalSecondaryIndexes.asScala.toMap

  def withGlobalSecondaryIndexes(globalSecondaryIndexes: Map[String, Capacity]): ConsumedCapacity =
    underlying.withGlobalSecondaryIndexes(globalSecondaryIndexes.asJava)

}
