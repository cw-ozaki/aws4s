package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model._
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object PutItemRequestFactory {

  def apply(): PutItemRequest = new PutItemRequest()

  def apply(tableName: String, item: Map[String, AttributeValue]): PutItemRequest = new PutItemRequest(tableName, item.asJava)

  def apply(tableName: String, item: Map[String, AttributeValue], returnValues: ReturnValue): PutItemRequest = new PutItemRequest(tableName, item.asJava, returnValues)

}

class RichPutItemRequest(val underlying: PutItemRequest) extends AnyVal with PimpedType[PutItemRequest] {

  def tableName: String = underlying.getTableName

  def tableName_=(value: String): Unit = underlying.setTableName(value)

  def item: Map[String, AttributeValue] = underlying.getItem.asScala.toMap

  def item_=(value: Map[String, AttributeValue]): Unit = underlying.setItem(item.asJava)

  def withItem(item: Map[String, AttributeValue]): PutItemRequest = underlying.withItem(item.asJava)

  def expected: Map[String, ExpectedAttributeValue] = underlying.getExpected.asScala.toMap

  def expected_=(value: Map[String, ExpectedAttributeValue]): Unit = underlying.setExpected(value.asJava)

  def withExpected(value: Map[String, ExpectedAttributeValue]): PutItemRequest = underlying.withExpected(value.asJava)

  def returnValues: String = underlying.getReturnValues

  def returnValues_=(value: String): Unit = underlying.setReturnValues(value)

  def returnValues_=(value: ReturnValue): Unit = underlying.setReturnValues(value)

  def returnConsumedCapacity: String = underlying.getReturnConsumedCapacity

  def returnConsumedCapacity_=(value: String): Unit = underlying.setReturnConsumedCapacity(value)

  def returnConsumedCapacity_=(value: ReturnConsumedCapacity): Unit = underlying.setReturnConsumedCapacity(value)

  def returnItemCollectionMetrics: String = underlying.getReturnItemCollectionMetrics

  def returnItemCollectionMetrics_=(value: String): Unit = underlying.setReturnItemCollectionMetrics(value)

  def returnItemCollectionMetrics_=(value: ReturnItemCollectionMetrics): Unit = underlying.setReturnItemCollectionMetrics(value)

  def conditionalOperator: String = underlying.getConditionalOperator

  def conditionalOperator_=(value: String): Unit = underlying.setConditionalOperator(value)

  def conditionalOperator_=(value: ConditionalOperator): Unit = underlying.setConditionalOperator(value)

  def conditionExpression: String = underlying.getConditionExpression

  def conditionExpression_=(value: String): Unit = underlying.setConditionExpression(value)

  def expressionAttributeNames: Map[String, String]= underlying.getExpressionAttributeNames.asScala.toMap

  def expressionAttributeNames_=(value: Map[String, String]): Unit = underlying.setExpressionAttributeNames(value.asJava)

  def withExpressionAttributeNames(value: Map[String, String]): PutItemRequest = underlying.withExpressionAttributeNames(value.asJava)

  def expressionAttributeValues: Map[String, AttributeValue]= underlying.getExpressionAttributeValues.asScala.toMap

  def expressionAttributeValues_=(value: Map[String, AttributeValue]): Unit = underlying.setExpressionAttributeValues(value.asJava)

  def withExpressionAttributeValues(value: Map[String, AttributeValue]): PutItemRequest = underlying.withExpressionAttributeValues(value.asJava)

}
