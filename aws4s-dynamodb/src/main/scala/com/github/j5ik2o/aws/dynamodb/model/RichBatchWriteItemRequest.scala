package com.github.j5ik2o.aws.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{BatchWriteItemRequest, ReturnConsumedCapacity, ReturnItemCollectionMetrics, WriteRequest}
import com.github.j5ik2o.aws.PimpedType

import scala.collection.JavaConverters._

object BatchWriteItemRequestFactory {

  def apply(): BatchWriteItemRequest = new BatchWriteItemRequest()

  def apply(requestItems: Map[String, Seq[WriteRequest]]): BatchWriteItemRequest = new BatchWriteItemRequest(requestItems.map { case (k, v) => (k, v.asJava)}.asJava)

}

class RichBatchWriteItemRequest(val underlying: BatchWriteItemRequest) extends AnyVal with PimpedType[BatchWriteItemRequest] {

  def requestItems_=(values: Map[String, Seq[WriteRequest]]): Unit =
    underlying.setRequestItems(values.map { case (k, v) => (k, v.asJava)}.asJava)

  def requestItems: Map[String, Seq[WriteRequest]] =
    underlying.getRequestItems.asScala.map { case (k, v) => (k, v.asScala)}.toMap

  def withRequestItems(requestItems: Map[String, Seq[WriteRequest]]): BatchWriteItemRequest =
    underlying.withRequestItems(requestItems.map { case (k, v) => (k, v.asJava)}.asJava)

  def addRequestItemsEntry(key: String, value: Seq[WriteRequest]): BatchWriteItemRequest =
    underlying.addRequestItemsEntry(key, value.asJava)

  def returnItemCollectionMetrics_=(value: String): Unit =
    underlying.setReturnItemCollectionMetrics(value)

  def returnItemCollectionMetrics_=(value: ReturnItemCollectionMetrics): Unit =
    underlying.setReturnItemCollectionMetrics(value)

  def returnItemCollectionMetrics: String =
    underlying.getReturnItemCollectionMetrics

  def withReturnItemCollectionMetrics(returnItemCollectionMetrics: String): BatchWriteItemRequest =
    underlying.withReturnItemCollectionMetrics(returnItemCollectionMetrics)

  def withReturnItemCollectionMetrics(returnItemCollectionMetrics: ReturnItemCollectionMetrics): BatchWriteItemRequest =
    underlying.withReturnItemCollectionMetrics(returnItemCollectionMetrics)

  def returnConsumedCapacity_=(value: String): Unit = underlying.setReturnConsumedCapacity(value)

  def returnConsumedCapacity_=(value: ReturnConsumedCapacity): Unit = underlying.setReturnConsumedCapacity(value)

  def returnConsumedCapacity: String = underlying.getReturnConsumedCapacity

  def withReturnConsumedCapacity(returnConsumedCapacity: String): BatchWriteItemRequest =
    underlying.withReturnConsumedCapacity(returnConsumedCapacity)

  def withReturnConsumedCapacity(returnConsumedCapacity: ReturnConsumedCapacity): BatchWriteItemRequest =
    underlying.withReturnConsumedCapacity(returnConsumedCapacity)

}
