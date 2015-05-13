package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{AttributeValue, ConsumedCapacity, ItemCollectionMetrics, UpdateItemResult}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object UpdateItemResultFactory {

  def create(): UpdateItemResult = new UpdateItemResult()

}

class RichUpdateItemResult(val underlying: UpdateItemResult) extends AnyVal with PimpedType[UpdateItemResult] {

  // ---

  def attributesOpt: Option[Map[String, AttributeValue]] = Option(underlying.getAttributes).map(_.asScala.toMap)

  def attributesOpt_=(value: Option[Map[String, AttributeValue]]): Unit = underlying.setAttributes(value.map(_.asJava).orNull)

  def withAttributesOpt(value: Option[Map[String, AttributeValue]]): UpdateItemResult = underlying.withAttributes(value.map(_.asJava).orNull)

  // ---

  def consumedCapacityOpt: Option[ConsumedCapacity] = Option(underlying.getConsumedCapacity)

  def consumedCapacityOpt_=(value: Option[ConsumedCapacity]): Unit = underlying.setConsumedCapacity(value.orNull)

  def withConsumedCapacityOpt(value: Option[ConsumedCapacity]): UpdateItemResult = underlying.withConsumedCapacity(value.orNull)

  // ---

  def itemCollectionMetricsOpt: Option[ItemCollectionMetrics] = Option(underlying.getItemCollectionMetrics)

  def itemCollectionMetricsOpt_=(value: Option[ItemCollectionMetrics]): Unit = underlying.setItemCollectionMetrics(value.orNull)

  def withItemCollectionMetricsOpt(value: Option[ItemCollectionMetrics]): UpdateItemResult = underlying.withItemCollectionMetrics(value.orNull)

  // ---

}
