package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{ BatchWriteItemResult, ConsumedCapacity, ItemCollectionMetrics, WriteRequest }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object BatchWriteItemResultFactory {

  def create(): BatchWriteItemResult = new BatchWriteItemResult()

}

class RichBatchWriteItemResult(val underlying: BatchWriteItemResult) extends AnyVal with PimpedType[BatchWriteItemResult] {

  // ---

  def unprocessedItemsOpt_=(value: Option[Map[String, Seq[WriteRequest]]]): Unit =
    underlying.setUnprocessedItems(value.map(_.map { case (k, v) => (k, v.asJava) }.asJava).orNull)

  def unprocessedItemsOpt: Option[Map[String, Seq[WriteRequest]]] =
    Option(underlying.getUnprocessedItems).map(_.asScala.map { case (k, v) => (k, v.asScala) }.toMap)

  def withUnprocessedItemsOpt(value: Option[Map[String, Seq[WriteRequest]]]): BatchWriteItemResult =
    underlying.withUnprocessedItems(value.map(_.map { case (k, v) => (k, v.asJava) }.asJava).orNull)

  // ---

  def itemCollectionMetricsOpt: Option[Map[String, Seq[ItemCollectionMetrics]]] =
    Option(underlying.getItemCollectionMetrics).map(_.asScala.map { case (k, v) => (k, v.asScala) }.toMap)

  def itemCollectionMetricsOpt_=(value: Option[Map[String, Seq[ItemCollectionMetrics]]]): Unit =
    underlying.setItemCollectionMetrics(value.map(_.map { case (k, v) => (k, v.asJava) }.asJava).orNull)

  def withItemCollectionMetricsOpt(value: Option[Map[String, Seq[ItemCollectionMetrics]]]): BatchWriteItemResult =
    underlying.withItemCollectionMetrics(value.map(_.map { case (k, v) => (k, v.asJava) }.asJava).orNull)

  // ---

  def consumedCapacityOpt: Option[Seq[ConsumedCapacity]] =
    Option(underlying.getConsumedCapacity).map(_.asScala.toVector)

  def consumedCapacityOpt_=(value: Option[Seq[ConsumedCapacity]]): Unit =
    underlying.setConsumedCapacity(value.map(_.asJava).orNull)

  def withConsumedCapacityOpt(value: Option[Iterable[ConsumedCapacity]]): BatchWriteItemResult =
    underlying.withConsumedCapacity(value.map(_.toSeq.asJava).orNull)

  // ---

}
