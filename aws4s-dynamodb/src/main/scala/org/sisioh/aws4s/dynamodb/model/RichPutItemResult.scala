package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{ItemCollectionMetrics, AttributeValue, ConsumedCapacity, PutItemResult}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object PutItemResultFactory {

  def apply(): PutItemResult = new PutItemResult()

}

class RichPutItemResult(val underlying: PutItemResult) extends AnyVal with PimpedType[PutItemResult] {

  def attributes: Map[String, AttributeValue] = underlying.getAttributes.asScala.toMap

  def attributes_=(value: Map[String, AttributeValue]): Unit = underlying.setAttributes(value.asJava)

  def withAttributes(value: Map[String, AttributeValue]): PutItemResult = underlying.withAttributes(value.asJava)

  def consumedCapacity: ConsumedCapacity = underlying.getConsumedCapacity

  def consumedCapacity_=(value: ConsumedCapacity): Unit = underlying.setConsumedCapacity(value)

  def itemCollectionMetrics: ItemCollectionMetrics = underlying.getItemCollectionMetrics

  def itemCollectionMetrics_=(value: ItemCollectionMetrics): Unit = underlying.setItemCollectionMetrics(value)

}
