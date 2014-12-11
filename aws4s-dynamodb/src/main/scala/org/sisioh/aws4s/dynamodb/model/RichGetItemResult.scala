package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{ConsumedCapacity, AttributeValue, GetItemResult}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object GetItemResultFactory {

  def apply(): GetItemResult = new GetItemResult()

}

class RichGetItemResult(val underlying: GetItemResult) extends AnyVal with PimpedType[GetItemResult] {

  def item: Map[String, AttributeValue] = underlying.getItem.asScala.toMap

  def item_=(value: Map[String, AttributeValue]): Unit = underlying.setItem(item.asJava)

  def withItem(value: Map[String, AttributeValue]): GetItemResult = underlying.withItem(value.asJava)

  def consumedCapacity: ConsumedCapacity = underlying.getConsumedCapacity

  def consumedCapacity_=(value: ConsumedCapacity): Unit = underlying.setConsumedCapacity(value)

}
