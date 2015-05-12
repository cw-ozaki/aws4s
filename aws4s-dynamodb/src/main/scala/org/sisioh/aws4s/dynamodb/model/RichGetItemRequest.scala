package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{ DeleteTableRequest, AttributeValue, GetItemRequest, ReturnConsumedCapacity }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object GetItemRequestFactory {

  def create(): GetItemRequest = new GetItemRequest()

  def create(tableName: String, key: Map[String, AttributeValue]): GetItemRequest = new GetItemRequest(tableName, key.asJava)

}

class RichGetItemRequest(val underlying: GetItemRequest) extends AnyVal with PimpedType[GetItemRequest] {

  // ---

  def tableNameOpt: Option[String] = Option(underlying.getTableName)

  def tableNameOpt_=(value: Option[String]): Unit = underlying.setTableName(value.orNull)

  def withTableNameOpt(value: Option[String]): GetItemRequest = underlying.withTableName(value.orNull)

  // ---

  def keyOpt: Option[Map[String, AttributeValue]] = Option(underlying.getKey).map(_.asScala.toMap)

  def keyOpt_=(value: Option[Map[String, AttributeValue]]): Unit = underlying.setKey(value.map(_.asJava).orNull)

  def withKeyOpt(key: Option[Map[String, AttributeValue]]): GetItemRequest = underlying.withKey(key.map(_.asJava).orNull)

  def withKey(hashKey: (String, AttributeValue), rangeKey: (String, AttributeValue)): GetItemRequest =
    underlying.withKey(KeyEntry(hashKey._1, hashKey._2), KeyEntry(rangeKey._1, rangeKey._2))

  // ---

  def attributesToGetOpt(): Option[Seq[String]] = Option(underlying.getAttributesToGet).map(_.asScala.toVector)

  def attributesToGetOpt_=(value: Option[Iterable[String]]): Unit = underlying.setAttributesToGet(value.map(_.toSeq.asJava).orNull)

  def withAttributesToGetOpt(value: Option[Iterable[String]]): GetItemRequest = underlying.withAttributesToGet(value.map(_.toSeq.asJava).orNull)

  // ---

  def returnConsumedCapacityOpt: Option[String] = Option(underlying.getReturnConsumedCapacity)

  def returnConsumedCapacityOpt_=(value: Option[String]): Unit = underlying.setReturnConsumedCapacity(value.orNull)

  def setReturnConsumedCapacityOpt(value: Option[ReturnConsumedCapacity]): Unit = underlying.setReturnConsumedCapacity(value.orNull)

  def withReturnConsumedCapacityOpt(value: Option[String]): GetItemRequest = underlying.withReturnConsumedCapacity(value.orNull)

  // ---

  def projectionExpressionOpt: Option[String] = Option(underlying.getProjectionExpression)

  def projectionExpressionOpt_=(value: Option[String]): Unit = underlying.setProjectionExpression(value.orNull)

  def withProjectionExpressionOpt(value: Option[String]): GetItemRequest = underlying.withProjectionExpression(value.orNull)

  // ---

  def expressionAttributeNamesOpt: Option[Map[String, String]] = Option(underlying.getExpressionAttributeNames).map(_.asScala.toMap)

  def expressionAttributeNamesOpt_=(value: Option[Map[String, String]]): Unit = underlying.setExpressionAttributeNames(value.map(_.asJava).orNull)

  def withExpressionAttributeNamesOpt(value: Option[Map[String, String]]): GetItemRequest = underlying.withExpressionAttributeNames(value.map(_.asJava).orNull)

  // ---

}
