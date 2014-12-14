package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{BatchWriteItemRequest, ReturnConsumedCapacity, ReturnItemCollectionMetrics, WriteRequest}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object BatchWriteItemRequestFactory {

  def create(): BatchWriteItemRequest = new BatchWriteItemRequest()

  def create(requestItems: Map[String, Seq[WriteRequest]]): BatchWriteItemRequest = new BatchWriteItemRequest(requestItems.map { case (k, v) => (k, v.asJava)}.asJava)

}

class RichBatchWriteItemRequest(val underlying: BatchWriteItemRequest) extends AnyVal with PimpedType[BatchWriteItemRequest] {

  def requestItemsOpt_=(values: Option[Map[String, Seq[WriteRequest]]]): Unit =
    underlying.setRequestItems(values.map(_.map { case (k, v) => (k, v.asJava)}.asJava).orNull)

  def requestItemsOpt: Option[Map[String, Seq[WriteRequest]]] =
    Option(underlying.getRequestItems).map(_.asScala.map { case (k, v) => (k, v.asScala)}.toMap)

  def withRequestItems(requestItems: Option[Map[String, Seq[WriteRequest]]]): BatchWriteItemRequest =
    underlying.withRequestItems(requestItems.map(_.map { case (k, v) => (k, v.asJava)}.asJava).orNull)

  def addRequestItemsEntry(key: String, value: Seq[WriteRequest]): BatchWriteItemRequest =
    underlying.addRequestItemsEntry(key, value.asJava)

  def setReturnItemCollectionMetricsOpt(value: Option[ReturnItemCollectionMetrics]): Unit =
    underlying.setReturnItemCollectionMetrics(value.orNull)

  def returnItemCollectionMetricsOpt_=(value: Option[String]): Unit =
    underlying.setReturnItemCollectionMetrics(value.orNull)

  def returnItemCollectionMetricsOpt: Option[String] =
    Option(underlying.getReturnItemCollectionMetrics)

  def withReturnItemCollectionMetricsInStringOpt(returnItemCollectionMetrics: Option[String]): BatchWriteItemRequest =
    underlying.withReturnItemCollectionMetrics(returnItemCollectionMetrics.orNull)

  def withReturnItemCollectionMetricsOpt(returnItemCollectionMetrics: Option[ReturnItemCollectionMetrics]): BatchWriteItemRequest =
    underlying.withReturnItemCollectionMetrics(returnItemCollectionMetrics.orNull)

  def returnConsumedCapacityOpt_=(value: Option[String]): Unit = underlying.setReturnConsumedCapacity(value.orNull)

  def setReturnConsumedCapacityOpt(value: Option[ReturnConsumedCapacity]): Unit = underlying.setReturnConsumedCapacity(value.orNull)

  def returnConsumedCapacityOpt: Option[String] = Option(underlying.getReturnConsumedCapacity)

  def withReturnConsumedCapacityInStringOpt(returnConsumedCapacity: Option[String]): BatchWriteItemRequest =
    underlying.withReturnConsumedCapacity(returnConsumedCapacity.orNull)

  def withReturnConsumedCapacityOpt(returnConsumedCapacity: Option[ReturnConsumedCapacity]): BatchWriteItemRequest =
    underlying.withReturnConsumedCapacity(returnConsumedCapacity.orNull)

}
