package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{ ItemCollectionMetrics, AttributeValue, ConsumedCapacity, PutItemResult }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object PutItemResultFactory {

  def create(): PutItemResult = new PutItemResult()

}

class RichPutItemResult(val underlying: PutItemResult) extends AnyVal with PimpedType[PutItemResult] {

  // ---

  def attributesOpt: Option[Map[String, AttributeValue]] = Option(underlying.getAttributes).map(_.asScala.toMap)

  def attributesOpt_=(value: Option[Map[String, AttributeValue]]): Unit = underlying.setAttributes(value.map(_.asJava).orNull)

  def withAttributesOpt(value: Option[Map[String, AttributeValue]]): PutItemResult = underlying.withAttributes(value.map(_.asJava).orNull)

  // ---

  def consumedCapacityOpt: Option[ConsumedCapacity] = Option(underlying.getConsumedCapacity)

  def consumedCapacityOpt_=(value: Option[ConsumedCapacity]): Unit = underlying.setConsumedCapacity(value.orNull)

  def withConsumedCapacityOpt(value: Option[ConsumedCapacity]): PutItemResult = underlying.withConsumedCapacity(value.orNull)

  // ---

  def itemCollectionMetricsOpt: Option[ItemCollectionMetrics] = Option(underlying.getItemCollectionMetrics)

  def itemCollectionMetricsOpt_=(value: Option[ItemCollectionMetrics]): Unit = underlying.setItemCollectionMetrics(value.orNull)

  def withItemCollectionMetricsOpt(value: Option[ItemCollectionMetrics]): PutItemResult = underlying.withItemCollectionMetrics(value.orNull)

  // ---

}
