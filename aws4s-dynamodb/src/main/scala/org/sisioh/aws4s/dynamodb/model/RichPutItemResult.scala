package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{ItemCollectionMetrics, AttributeValue, ConsumedCapacity, PutItemResult}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object PutItemResultFactory {

  def create(): PutItemResult = new PutItemResult()

}

class RichPutItemResult(val underlying: PutItemResult) extends AnyVal with PimpedType[PutItemResult] {

  def attributesOpt: Map[String, AttributeValue] = underlying.getAttributes.asScala.toMap

  def attributesOpt_=(value: Map[String, AttributeValue]): Unit = underlying.setAttributes(value.asJava)

  def withAttributesOpt(value: Map[String, AttributeValue]): PutItemResult = underlying.withAttributes(value.asJava)

  def consumedCapacityOpt: ConsumedCapacity = underlying.getConsumedCapacity

  def consumedCapacityOpt_=(value: ConsumedCapacity): Unit = underlying.setConsumedCapacity(value)

  def itemCollectionMetricsOpt: ItemCollectionMetrics = underlying.getItemCollectionMetrics

  def itemCollectionMetricsOpt_=(value: ItemCollectionMetrics): Unit = underlying.setItemCollectionMetrics(value)

}
