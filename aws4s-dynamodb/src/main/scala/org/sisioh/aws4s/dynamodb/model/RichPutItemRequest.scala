package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model._
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object PutItemRequestFactory {

  def create(): PutItemRequest = new PutItemRequest()

  def create(tableName: String, item: Map[String, AttributeValue]): PutItemRequest = new PutItemRequest(tableName, item.asJava)

  def create(tableName: String, item: Map[String, AttributeValue], returnValues: ReturnValue): PutItemRequest = new PutItemRequest(tableName, item.asJava, returnValues)

}

class RichPutItemRequest(val underlying: PutItemRequest) extends AnyVal with PimpedType[PutItemRequest] {

  // ---

  def tableNameOpt: Option[String] = Option(underlying.getTableName)

  def tableNameOpt_=(value: Option[String]): Unit = underlying.setTableName(value.orNull)

  def withTableNameOpt(value: Option[String]): PutItemRequest = underlying.withTableName(value.orNull)

  // ---

  def itemOpt: Option[Map[String, AttributeValue]] = Option(underlying.getItem).map(_.asScala.toMap)

  def itemOpt_=(value: Option[Map[String, AttributeValue]]): Unit = underlying.setItem(value.map(_.asJava).orNull)

  def withItemOpt(value: Option[Map[String, AttributeValue]]): PutItemRequest = underlying.withItem(value.map(_.asJava).orNull)

  // ---

  def expectedOpt: Option[Map[String, ExpectedAttributeValue]] = Option(underlying.getExpected).map(_.asScala.toMap)

  def expectedOpt_=(value: Option[Map[String, ExpectedAttributeValue]]): Unit = underlying.setExpected(value.map(_.asJava).orNull)

  def withExpectedOpt(value: Option[Map[String, ExpectedAttributeValue]]): PutItemRequest = underlying.withExpected(value.map(_.asJava).orNull)

  // ---

  def returnValuesOpt: Option[String] = Option(underlying.getReturnValues)

  def returnValuesOpt_=(value: Option[String]): Unit = underlying.setReturnValues(value.orNull)

  def setReturnValuesOpt(value: Option[ReturnValue]): Unit = underlying.setReturnValues(value.orNull)

  def withReturnValuesOpt(value: Option[String]): PutItemRequest = underlying.withReturnValues(value.orNull)

  // ---

  def returnConsumedCapacityOpt: Option[String] = Option(underlying.getReturnConsumedCapacity)

  def returnConsumedCapacityOpt_=(value: Option[String]): Unit = underlying.setReturnConsumedCapacity(value.orNull)

  def setReturnConsumedCapacityOpt(value: Option[ReturnConsumedCapacity]): Unit = underlying.setReturnConsumedCapacity(value.orNull)

  def withReturnConsumedCapacityOpt(value: Option[String]): PutItemRequest = underlying.withReturnConsumedCapacity(value.orNull)

  // ---

  def returnItemCollectionMetricsOpt: Option[String] = Option(underlying.getReturnItemCollectionMetrics)

  def returnItemCollectionMetricsOpt_=(value: Option[String]): Unit = underlying.setReturnItemCollectionMetrics(value.orNull)

  def setReturnItemCollectionMetricsOpt(value: Option[ReturnItemCollectionMetrics]): Unit = underlying.setReturnItemCollectionMetrics(value.orNull)

  def withReturnItemCollectionMetricsOpt(value: Option[String]): PutItemRequest = underlying.withReturnItemCollectionMetrics(value.orNull)

  // ---

  def conditionalOperatorOpt: Option[String] = Option(underlying.getConditionalOperator)

  def conditionalOperatorOpt_=(value: Option[String]): Unit = underlying.setConditionalOperator(value.orNull)

  def setConditionalOperatorOpt(value: Option[ConditionalOperator]): Unit = underlying.setConditionalOperator(value.orNull)

  def withConditionalOperatorOpt(value: Option[String]): PutItemRequest = underlying.withConditionalOperator(value.orNull)

  // ---

  def conditionExpressionOpt: Option[String] = Option(underlying.getConditionExpression)

  def conditionExpressionOpt_=(value: Option[String]): Unit = underlying.setConditionExpression(value.orNull)

  def withConditionExpressionOpt(value: Option[String]): PutItemRequest = underlying.withConditionExpression(value.orNull)

  // ---

  def expressionAttributeNamesOpt: Option[Map[String, String]] = Option(underlying.getExpressionAttributeNames).map(_.asScala.toMap)

  def expressionAttributeNamesOpt_=(value: Option[Map[String, String]]): Unit = underlying.setExpressionAttributeNames(value.map(_.asJava).orNull)

  def withExpressionAttributeNamesOpt(value: Option[Map[String, String]]): PutItemRequest = underlying.withExpressionAttributeNames(value.map(_.asJava).orNull)

  // ---

  def expressionAttributeValuesOpt: Option[Map[String, AttributeValue]]= Option(underlying.getExpressionAttributeValues).map(_.asScala.toMap)

  def expressionAttributeValuesOpt_=(value: Option[Map[String, AttributeValue]]): Unit = underlying.setExpressionAttributeValues(value.map(_.asJava).orNull)

  def withExpressionAttributeValuesOpt(value: Option[Map[String, AttributeValue]]): PutItemRequest = underlying.withExpressionAttributeValues(value.map(_.asJava).orNull)

  // ---
}
