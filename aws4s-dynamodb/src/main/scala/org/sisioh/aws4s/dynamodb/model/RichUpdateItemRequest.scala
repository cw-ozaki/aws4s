package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model._
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object UpdateItemRequestFactory {

  def create(): UpdateItemRequest = new UpdateItemRequest()

  def create(tableName: String, key: Map[String, AttributeValue], attributeUpdates: Map[String, AttributeValueUpdate]): UpdateItemRequest = new UpdateItemRequest(tableName, key.asJava, attributeUpdates.asJava)

  def create(tableName: String, key: Map[String, AttributeValue], attributeUpdates: Map[String, AttributeValueUpdate], returnValues: String): UpdateItemRequest = new UpdateItemRequest(tableName, key.asJava, attributeUpdates.asJava, returnValues)

  def create(tableName: String, key: Map[String, AttributeValue], attributeUpdates: Map[String, AttributeValueUpdate], returnValues: ReturnValue): UpdateItemRequest = new UpdateItemRequest(tableName, key.asJava, attributeUpdates.asJava, returnValues)

}

class RichUpdateItemRequest(val underlying: UpdateItemRequest) extends AnyVal with PimpedType[UpdateItemRequest] {

  // ---

  def tableNameOpt: Option[String] = Option(underlying.getTableName)

  def tableNameOpt_=(value: Option[String]): Unit = underlying.setTableName(value.orNull)

  def withTableNameOpt(value: Option[String]): UpdateItemRequest = underlying.withTableName(value.orNull)

  // ---

  def keyOpt: Option[Map[String, AttributeValue]] = Option(underlying.getKey).map(_.asScala.toMap)

  def keyOpt_=(value: Option[Map[String, AttributeValue]]): Unit = underlying.setKey(value.map(_.asJava).orNull)

  def withKeyOpt(value: Option[Map[String, AttributeValue]]): UpdateItemRequest = underlying.withKey(value.map(_.asJava).orNull)

  // ---

  def attributeUpdatesOpt: Option[Map[String, AttributeValueUpdate]] = Option(underlying.getAttributeUpdates).map(_.asScala.toMap)

  def attributeUpdatesOpt_=(value: Option[Map[String, AttributeValueUpdate]]): Unit = underlying.setAttributeUpdates(value.map(_.asJava).orNull)

  def withAttributeUpdatesOpt(value: Option[Map[String, AttributeValueUpdate]]): UpdateItemRequest = underlying.withAttributeUpdates(value.map(_.asJava).orNull)

  // ---

  def expectedOpt: Option[Map[String, ExpectedAttributeValue]] = Option(underlying.getExpected).map(_.asScala.toMap)

  def expectedOpt_=(value: Option[Map[String, ExpectedAttributeValue]]): Unit = underlying.setExpected(value.map(_.asJava).orNull)

  def withExpectedOpt(value: Option[Map[String, ExpectedAttributeValue]]): UpdateItemRequest = underlying.withExpected(value.map(_.asJava).orNull)

  // ---

  def conditionalOperatorOpt: Option[String] = Option(underlying.getConditionalOperator)

  def conditionalOperatorOpt_=(value: Option[String]): Unit = underlying.setConditionalOperator(value.orNull)

  def withConditionalOperatorOpt(value: Option[String]): UpdateItemRequest = underlying.withConditionalOperator(value.orNull)

  // ---

  def returnValuesOpt: Option[String] = Option(underlying.getReturnValues)

  def returnValuesOpt_=(value: Option[String]): Unit = underlying.setReturnValues(value.orNull)

  def withReturnValuesOpt(value: Option[String]): UpdateItemRequest = underlying.withReturnValues(value.orNull)

  // ---

  def returnConsumedCapacityOpt: Option[String] = Option(underlying.getReturnConsumedCapacity)

  def returnConsumedCapacityOpt_=(value: Option[String]): Unit = underlying.setReturnConsumedCapacity(value.orNull)

  def withReturnConsumedCapacityOpt(value: Option[String]): UpdateItemRequest = underlying.withReturnConsumedCapacity(value.orNull)

  // ---

  def returnItemCollectionMetricsOpt: Option[String] = Option(underlying.getReturnItemCollectionMetrics)

  def returnItemCollectionMetricsOpt(value: Option[String]): Unit = underlying.setReturnItemCollectionMetrics(value.orNull)

  def withReturnItemCollectionMetricsOpt(value: Option[String]): UpdateItemRequest = underlying.withReturnItemCollectionMetrics(value.orNull)

  // ---

  def updateExpressionOpt: Option[String] = Option(underlying.getUpdateExpression)

  def updateExpressionOpt_=(value: Option[String]): Unit = underlying.setUpdateExpression(value.orNull)

  def withUpdateExpressionOpt(value: Option[String]): UpdateItemRequest = underlying.withUpdateExpression(value.orNull)

  // ---

  def conditionExpressionOpt: Option[String] = Option(underlying.getConditionExpression)

  def conditionExpressionOpt_=(value: Option[String]): Unit = underlying.setConditionExpression(value.orNull)

  def withConditionExpressionOpt(value: Option[String]): UpdateItemRequest = underlying.withConditionExpression(value.orNull)

  // ---

  def expressionAttributeNamesOpt: Option[Map[String, String]] = Option(underlying.getExpressionAttributeNames).map(_.asScala.toMap)

  def expressionAttributeNamesOpt_=(value: Option[Map[String, String]]): Unit = underlying.setExpressionAttributeNames(value.map(_.asJava).orNull)

  def withExpressionAttributeNamesOpt(value: Option[Map[String, String]]): UpdateItemRequest = underlying.withExpressionAttributeNames(value.map(_.asJava).orNull)

  // ---

  def expressionAttributeValuesOpt: Option[Map[String, AttributeValue]] = Option(underlying.getExpressionAttributeValues).map(_.asScala.toMap)

  def expressionAttributeValuesOpt_=(value: Option[Map[String, AttributeValue]]): Unit = underlying.setExpressionAttributeValues(value.map(_.asJava).orNull)

  def withExpressionAttributeValuesOpt(value: Option[Map[String, AttributeValue]]): UpdateItemRequest = underlying.withExpressionAttributeValues(value.map(_.asJava).orNull)

  // ---

}
