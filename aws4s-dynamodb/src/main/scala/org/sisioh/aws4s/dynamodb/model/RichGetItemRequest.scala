package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{AttributeValue, GetItemRequest, ReturnConsumedCapacity}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object GetItemRequestFactory {

  def apply(): GetItemRequest = new GetItemRequest()

  def apply(tableName: String, key: Map[String, AttributeValue]): GetItemRequest = new GetItemRequest(tableName, key.asJava)

}

class RichGetItemRequest(val underlying: GetItemRequest) extends AnyVal with PimpedType[GetItemRequest] {

  def key: Map[String, AttributeValue] = underlying.getKey.asScala.toMap

  def key_=(value: Map[String, AttributeValue]): Unit = underlying.setKey(value.asJava)

  def withKey(key: Map[String, AttributeValue]): GetItemRequest = underlying.withKey(key.asJava)

  def withKey(hashKey: (String, AttributeValue), rangeKey: (String, AttributeValue)): GetItemRequest =
    underlying.withKey(KeyEntry(hashKey._1, hashKey._2), KeyEntry(rangeKey._1, rangeKey._2))

  def attributesToGet(): Seq[String] = underlying.getAttributesToGet.asScala

  def attributesToGet_=(value: Iterable[String]): Unit = underlying.setAttributesToGet(value.toSeq.asJava)

  def withAttributesToGet(value: Iterable[String]): GetItemRequest = underlying.withAttributesToGet(value.toSeq.asJava)

  def returnConsumedCapacity: String = underlying.getReturnConsumedCapacity

  def returnConsumedCapacity_=(value: String): Unit = underlying.setReturnConsumedCapacity(value)

  def returnConsumedCapacity_=(value: ReturnConsumedCapacity): Unit = underlying.setReturnConsumedCapacity(value)

  def projectionExpression: String = underlying.getProjectionExpression

  def projectionExpression_=(value: String): Unit = underlying.setProjectionExpression(value)


  def expressionAttributeNames: Map[String, String] = underlying.getExpressionAttributeNames.asScala.toMap

  def expressionAttributeNames_=(value: Map[String, String]): Unit = underlying.setExpressionAttributeNames(value.asJava)

  def withExpressionAttributeNames(value: Map[String, String]): GetItemRequest = underlying.withExpressionAttributeNames(value.asJava)


}
