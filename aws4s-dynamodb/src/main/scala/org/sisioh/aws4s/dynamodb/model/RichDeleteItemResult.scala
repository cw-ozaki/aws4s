package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{AttributeValue, ConsumedCapacity, DeleteItemResult, ItemCollectionMetrics}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object DeleteItemResultFactory {

  def apply(): DeleteItemResult = new DeleteItemResult()

}

class RichDeleteItemResult(val underlying: DeleteItemResult) extends AnyVal with PimpedType[DeleteItemResult] {

  def attributes_=(value: Map[String, AttributeValue]): Unit = underlying.setAttributes(value.asJava)

  def attributes: Map[String, AttributeValue] = underlying.getAttributes.asScala.toMap

  def consumedCapacity_=(value: ConsumedCapacity): Unit = underlying.setConsumedCapacity(value)

  def consumedCapacity: ConsumedCapacity = underlying.getConsumedCapacity

  def itemCollectionMetrics_=(value: ItemCollectionMetrics): Unit = underlying.setItemCollectionMetrics(value)

  def itemCollectionMetrics: ItemCollectionMetrics = underlying.getItemCollectionMetrics

}
