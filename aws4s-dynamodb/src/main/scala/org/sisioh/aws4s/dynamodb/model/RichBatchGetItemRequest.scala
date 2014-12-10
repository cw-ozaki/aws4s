package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{BatchGetItemRequest, KeysAndAttributes, ReturnConsumedCapacity}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object BatchGetItemRequestFactory {

  def apply(): BatchGetItemRequest = new BatchGetItemRequest()

  def apply(requestItems: Map[String, KeysAndAttributes]): BatchGetItemRequest =
    new BatchGetItemRequest(requestItems.asJava)

  def apply(requestItems: Map[String, KeysAndAttributes], returnConsumedCapacity: String): BatchGetItemRequest =
    new BatchGetItemRequest(requestItems.asJava, returnConsumedCapacity)

  def apply(requestItems: Map[String, KeysAndAttributes], returnConsumedCapacity: ReturnConsumedCapacity): BatchGetItemRequest =
    new BatchGetItemRequest(requestItems.asJava, returnConsumedCapacity)

}

class RichBatchGetItemRequest(val underlying: BatchGetItemRequest) extends AnyVal with PimpedType[BatchGetItemRequest] {

  def requestItems_=(values: Map[String, KeysAndAttributes]): Unit =
    underlying.setRequestItems(values.asJava)

  def requestItems: Map[String, KeysAndAttributes] =
    underlying.getRequestItems.asScala.toMap

  def withRequestItems(requestItems: Map[String, KeysAndAttributes]): BatchGetItemRequest =
    underlying.withRequestItems(requestItems.asJava)

  def returnConsumedCapacity_=(value: String): Unit = underlying.setReturnConsumedCapacity(value)

  def returnConsumedCapacity_=(value: ReturnConsumedCapacity): Unit = underlying.setReturnConsumedCapacity(value)

  def returnConsumedCapacity: String = underlying.getReturnConsumedCapacity


}
