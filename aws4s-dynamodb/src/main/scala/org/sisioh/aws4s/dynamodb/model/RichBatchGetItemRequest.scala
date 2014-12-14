package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{BatchGetItemRequest, KeysAndAttributes, ReturnConsumedCapacity}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object BatchGetItemRequestFactory {

  def create(): BatchGetItemRequest = new BatchGetItemRequest()

  def create(requestItems: Map[String, KeysAndAttributes]): BatchGetItemRequest =
    new BatchGetItemRequest(requestItems.asJava)

  def create(requestItems: Map[String, KeysAndAttributes], returnConsumedCapacity: String): BatchGetItemRequest =
    new BatchGetItemRequest(requestItems.asJava, returnConsumedCapacity)

  def create(requestItems: Map[String, KeysAndAttributes], returnConsumedCapacity: ReturnConsumedCapacity): BatchGetItemRequest =
    new BatchGetItemRequest(requestItems.asJava, returnConsumedCapacity)

}

class RichBatchGetItemRequest(val underlying: BatchGetItemRequest) extends AnyVal with PimpedType[BatchGetItemRequest] {

  def requestItemsOpt_=(values: Option[Map[String, KeysAndAttributes]]): Unit =
    underlying.setRequestItems(values.map(_.asJava).orNull)

  def requestItemsOpt: Option[Map[String, KeysAndAttributes]] =
    Option(underlying.getRequestItems).map(_.asScala.toMap)

  def withRequestItemsOpt(values: Option[Map[String, KeysAndAttributes]]): BatchGetItemRequest =
    underlying.withRequestItems(values.map(_.asJava).orNull)

  def setReturnConsumedCapacityOpt(value: Option[ReturnConsumedCapacity]): Unit = underlying.setReturnConsumedCapacity(value.orNull)

  def returnConsumedCapacityOpt_=(value: Option[String]): Unit = underlying.setReturnConsumedCapacity(value.orNull)

  def returnConsumedCapacityOpt: Option[String] = Option(underlying.getReturnConsumedCapacity)


}
