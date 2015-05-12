package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model._
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object DeleteItemRequestFactory {

  def create(): DeleteItemRequest = new DeleteItemRequest()

  def create(tableName: String, key: Map[String, AttributeValue]): DeleteItemRequest = new DeleteItemRequest(tableName, key.asJava)

  def create(tableName: String, key: Map[String, AttributeValue], returnValues: String): DeleteItemRequest = new DeleteItemRequest(tableName, key.asJava, returnValues)

  def create(tableName: String, key: Map[String, AttributeValue], returnValues: ReturnValue): DeleteItemRequest =
    new DeleteItemRequest(tableName, key.asJava, returnValues)

}

class RichDeleteItemRequest(val underlying: DeleteItemRequest) extends AnyVal with PimpedType[DeleteItemRequest] {

  // ---

  def tableNameOpt: Option[String] = Option(underlying.getTableName)

  def tableNamOpt_=(value: Option[String]): Unit = underlying.setTableName(value.orNull)

  def withTableNameOpt(value: Option[String]): DeleteItemRequest = underlying.withTableName(value.orNull)

  // ---

  def keyOpt_=(value: Option[Map[String, AttributeValue]]): Unit = underlying.setKey(value.map(_.asJava).orNull)

  def keyOpt: Option[Map[String, AttributeValue]] = Option(underlying.getKey).map(_.asScala.toMap)

  def withKeyOpt(value: Option[Map[String, AttributeValue]]): DeleteItemRequest =
    underlying.withKey(value.map(_.asJava).orNull)

  def withKeyOpt(hashKey: (String, AttributeValue), rangeKey: (String, AttributeValue)): DeleteItemRequest =
    underlying.withKey(KeyEntry(hashKey._1, hashKey._2), KeyEntry(rangeKey._1, rangeKey._2))

  // ---

  def expectedOpt_=(value: Option[Map[String, ExpectedAttributeValue]]): Unit =
    underlying.setExpected(value.map(_.asJava).orNull)

  def expectedOpt: Option[Map[String, ExpectedAttributeValue]] =
    Option(underlying.getExpected).map(_.asScala.toMap)

  def withExpectedOpt(value: Option[Map[String, ExpectedAttributeValue]]): DeleteItemRequest =
    underlying.withExpected(value.map(_.asJava).orNull)

  // ---

  def conditionalOperatorOpt: Option[String] = Option(underlying.getConditionalOperator)

  def conditionalOperatorOpt_=(value: Option[String]): Unit =
    underlying.setConditionalOperator(value.orNull)

  def setConditionalOperatorOpt(value: Option[ConditionalOperator]): Unit =
    underlying.setConditionalOperator(value.orNull)

  def withConditionalOperatorOpt_=(value: Option[String]): DeleteItemRequest =
    underlying.withConditionalOperator(value.orNull)

  // ---

  def returnValuesOpt: Option[String] = Option(underlying.getReturnValues)

  def returnValuesOpt_=(value: Option[String]): Unit = underlying.setReturnValues(value.orNull)

  def setReturnValuesOpt(value: Option[ReturnValue]): Unit = underlying.setReturnValues(value.orNull)

  def withReturnValuesOpt(value: Option[String]): DeleteItemRequest = underlying.withReturnValues(value.orNull)

  // ---

  def returnConsumedCapacityOpt: Option[String] = Option(underlying.getReturnConsumedCapacity)

  def returnConsumedCapacityOpt_=(value: Option[String]): Unit = underlying.setReturnConsumedCapacity(value.orNull)

  def setReturnConsumedCapacityOpt(value: Option[ReturnConsumedCapacity]): Unit = underlying.setReturnConsumedCapacity(value.orNull)

  def withReturnConsumedCapacityOpt(value: Option[String]): DeleteItemRequest = underlying.withReturnConsumedCapacity(value.orNull)

  // ---

  def returnItemCollectionMetrics: Option[String] = Option(underlying.getReturnItemCollectionMetrics)

  def returnItemCollectionMetricsOpt_=(value: Option[String]): Unit = underlying.setReturnItemCollectionMetrics(value.orNull)

  def setReturnItemCollectionMetricsOpt(value: Option[ReturnItemCollectionMetrics]): Unit = underlying.setReturnItemCollectionMetrics(value.orNull)

  def withReturnItemCollectionMetricsOpt(value: Option[String]): DeleteItemRequest = underlying.withReturnItemCollectionMetrics(value.orNull)

  // ---

  def conditionExpressionOpt: Option[String] = Option(underlying.getConditionExpression)

  def conditionExpressionOpt_=(value: Option[String]): Unit = underlying.setConditionExpression(value.orNull)

  def withConditionExpressionOpt(value: Option[String]): DeleteItemRequest = underlying.withConditionExpression(value.orNull)

  // ---

  def expressionAttributeNamesOpt: Option[Map[String, String]] = Option(underlying.getExpressionAttributeNames).map(_.asScala.toMap)

  def expressionAttributeNamesOpt_=(value: Map[String, String]): Unit = underlying.setExpressionAttributeNames(value.asJava)

  def withExpressionAttributeNamesOpt(value: Option[Map[String, String]]): DeleteItemRequest =
    underlying.withExpressionAttributeNames(value.map(_.asJava).orNull)

  // ---

  def expressionAttributeValuesOpt: Option[Map[String, AttributeValue]] =
    Option(underlying.getExpressionAttributeValues).map(_.asScala.toMap)

  def expressionAttributeValuesOpt_=(value: Option[Map[String, AttributeValue]]): Unit =
    underlying.setExpressionAttributeValues(value.map(_.asJava).orNull)

  def withExpressionAttributeValuesOpt(value: Option[Map[String, AttributeValue]]): DeleteItemRequest =
    underlying.withExpressionAttributeValues(value.map(_.asJava).orNull)

  // ---

}
