package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{AttributeValue, ConsumedCapacity, ItemCollectionMetrics, UpdateItemResult}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object UpdateItemResultFactory {

  def apply(): UpdateItemResult = new UpdateItemResult()

}

class RichUpdateItemResult(val underlying: UpdateItemResult) extends AnyVal with PimpedType[UpdateItemResult] {

  def attributes: Map[String, AttributeValue] = underlying.getAttributes.asScala.toMap

  def attributes_=(value: Map[String, AttributeValue]): Unit = underlying.setAttributes(value.asJava)

  def withAttributes(value: Map[String, AttributeValue]): UpdateItemResult = underlying.withAttributes(value.asJava)

  def consumedCapacity: ConsumedCapacity = underlying.getConsumedCapacity

  def consumedCapacity_=(value: ConsumedCapacity): Unit = underlying.setConsumedCapacity(value)

  def itemCollectionMetrics: ItemCollectionMetrics = underlying.getItemCollectionMetrics

  def itemCollectionMetrics_=(value: ItemCollectionMetrics): Unit = underlying.setItemCollectionMetrics(value)

}
