package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{ConsumedCapacity, AttributeValue, GetItemResult}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object GetItemResultFactory {

  def create(): GetItemResult = new GetItemResult()

}

class RichGetItemResult(val underlying: GetItemResult) extends AnyVal with PimpedType[GetItemResult] {

  def itemOpt: Option[Map[String, AttributeValue]] = Option(underlying.getItem).map(_.asScala.toMap)

  def itemOpt_=(value: Option[Map[String, AttributeValue]]): Unit = underlying.setItem(value.map(_.asJava).orNull)

  def withItemOpt(value: Option[Map[String, AttributeValue]]): GetItemResult = underlying.withItem(value.map(_.asJava).orNull)

  def consumedCapacityOpt: Option[ConsumedCapacity] = Option(underlying.getConsumedCapacity)

  def consumedCapacityOpt_=(value: Option[ConsumedCapacity]): Unit = underlying.setConsumedCapacity(value.orNull)

}
