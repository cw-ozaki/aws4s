package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{ExpectedAttributeValue, AttributeValueUpdate, AttributeValue, UpdateItemRequest}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object UpdateItemRequestFactory {

  def apply(): UpdateItemRequest = new UpdateItemRequest()

}

class RichUpdateItemRequest(val underlying: UpdateItemRequest) extends AnyVal with PimpedType[UpdateItemRequest] {

  def tableName: String = underlying.getTableName

  def tableName_=(value: String): Unit = underlying.setTableName(value)

  def key: Map[String, AttributeValue] = underlying.getKey.asScala.toMap

  def key_=(value: Map[String, AttributeValue]): Unit = underlying.setKey(value.asJava)

  def withKey(value: Map[String, AttributeValue]): UpdateItemRequest = underlying.withKey(value.asJava)

  def attributeUpdates: Map[String, AttributeValueUpdate] = underlying.getAttributeUpdates.asScala.toMap

  def attributeUpdates_=(value: Map[String, AttributeValueUpdate]): Unit = underlying.setAttributeUpdates(value.asJava)

  def withAttributeUpdates(value: Map[String, AttributeValueUpdate]): UpdateItemRequest = underlying.withAttributeUpdates(value.asJava)

  def expected: Map[String, ExpectedAttributeValue] = underlying.getExpected.asScala.toMap

  def expected_=(value: Map[String, ExpectedAttributeValue]): Unit = underlying.setExpected(value.asJava)

  def withExpected(value: Map[String, ExpectedAttributeValue]): UpdateItemRequest = underlying.withExpected(value.asJava)

  def conditionalOperator: String = underlying.getConditionalOperator

  def conditionalOperator_=(value: String): Unit = underlying.setConditionalOperator(value)

  def returnValues: String = underlying.getReturnValues

  def returnValues_=(value: String): Unit = underlying.setReturnValues(value)

  def returnConsumedCapacity: String = underlying.getReturnConsumedCapacity

  def returnConsumedCapacity_=(value: String): Unit = underlying.setReturnConsumedCapacity(value)

  def returnItemCollectionMetrics: String = underlying.getReturnItemCollectionMetrics

  def returnItemCollectionMetrics(value: String): Unit = underlying.setReturnItemCollectionMetrics(value)

  def updateExpression: String = underlying.getUpdateExpression

  def updateExpression_=(value: String): Unit = underlying.setUpdateExpression(value)

  def conditionExpression: String = underlying.getConditionExpression

  def conditionExpression_=(value: String): Unit = underlying.setConditionExpression(value)

  def expressionAttributeNames: Map[String, String] = underlying.getExpressionAttributeNames.asScala.toMap

  def expressionAttributeNames_=(value: Map[String, String]): Unit = underlying.setExpressionAttributeNames(value.asJava)

  def withExpressionAttributeNames(value: Map[String, String]): UpdateItemRequest = underlying.withExpressionAttributeNames(value.asJava)

  def expressionAttributeValues: Map[String, AttributeValue] = underlying.getExpressionAttributeValues.asScala.toMap

  def expressionAttributeValues_=(value: Map[String, AttributeValue]): Unit = underlying.setExpressionAttributeValues(value.asJava)

  def withExpressionAttributeValues(value: Map[String, AttributeValue]): UpdateItemRequest = underlying.withExpressionAttributeValues(value.asJava)


}
