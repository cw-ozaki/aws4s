package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{ AttributeValue, ConsumedCapacity, DeleteItemResult, ItemCollectionMetrics }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object DeleteItemResultFactory {

  def create(): DeleteItemResult = new DeleteItemResult()

}

class RichDeleteItemResult(val underlying: DeleteItemResult) extends AnyVal with PimpedType[DeleteItemResult] {

  // ---

  def attributesOpt: Option[Map[String, AttributeValue]] = Option(underlying.getAttributes).map(_.asScala.toMap)

  def attributesOpt_=(value: Option[Map[String, AttributeValue]]): Unit = underlying.setAttributes(value.map(_.asJava).orNull)

  def withAttributesOpt(value: Option[Map[String, AttributeValue]]): DeleteItemResult = underlying.withAttributes(value.map(_.asJava).orNull)

  // ---

  def consumedCapacityOpt: Option[ConsumedCapacity] = Option(underlying.getConsumedCapacity)

  def consumedCapacityOpt_=(value: Option[ConsumedCapacity]): Unit = underlying.setConsumedCapacity(value.orNull)

  def withConsumedCapacityOpt(value: Option[ConsumedCapacity]): DeleteItemResult = underlying.withConsumedCapacity(value.orNull)

  // ---

  def itemCollectionMetricsOpt: Option[ItemCollectionMetrics] = Option(underlying.getItemCollectionMetrics)

  def itemCollectionMetricsOpt_=(value: Option[ItemCollectionMetrics]): Unit = underlying.setItemCollectionMetrics(value.orNull)

  def withItemCollectionMetricsOpt(value: Option[ItemCollectionMetrics]): DeleteItemResult = underlying.withItemCollectionMetrics(value.orNull)

  // ---

}
