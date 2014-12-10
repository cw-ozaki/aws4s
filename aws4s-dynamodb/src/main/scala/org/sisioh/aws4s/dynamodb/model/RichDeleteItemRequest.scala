package org.sisioh.aws4s.dynamodb.model

import java.util.Map.Entry

import com.amazonaws.services.dynamodbv2.model._
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._


object DeleteItemRequestFactory {

  def apply(): DeleteItemRequest = new DeleteItemRequest()

  def apply(tableName: String, key: Map[String, AttributeValue]): DeleteItemRequest = new DeleteItemRequest(tableName, key.asJava)

  def apply(tableName: String, key: Map[String, AttributeValue], returnValues: String): DeleteItemRequest = new DeleteItemRequest(tableName, key.asJava, returnValues)

  def apply(tableName: String, key: Map[String, AttributeValue], returnValues: ReturnValue): DeleteItemRequest =
    new DeleteItemRequest(tableName, key.asJava, returnValues)

}

private case class KeyEntry(key: String, var value: AttributeValue) extends Entry[String, AttributeValue] {
  override def getKey: String = key

  override def getValue: AttributeValue = value

  override def setValue(value: AttributeValue): AttributeValue = {
    this.value = value
    this.value
  }
}

class RichDeleteItemRequest(val underlying: DeleteItemRequest) extends AnyVal with PimpedType[DeleteItemRequest] {

  def tableName_=(value: String): Unit = underlying.setTableName(value)

  def tableName: String = underlying.getTableName

  def key_=(value: Map[String, AttributeValue]): Unit = underlying.setKey(value.asJava)

  def key: Map[String, AttributeValue] = underlying.getKey.asScala.toMap

  def withKey(key: Map[String, AttributeValue]): DeleteItemRequest =
    underlying.withKey(key.asJava)

  def withKey(hashKey: (String, AttributeValue), rangeKey: (String, AttributeValue)): DeleteItemRequest =
    underlying.withKey(KeyEntry(hashKey._1, hashKey._2), KeyEntry(rangeKey._1, rangeKey._2))

  def expected_=(value: Map[String, ExpectedAttributeValue]): Unit =
    underlying.setExpected(value.asJava)

  def expected: Map[String, ExpectedAttributeValue] =
    underlying.getExpected.asScala.toMap

  def withExpected(expected: Map[String, ExpectedAttributeValue]): DeleteItemRequest =
    underlying.withExpected(expected.asJava)

  def conditionalOperator_=(value: String): Unit =
    underlying.setConditionalOperator(value)

  def conditionalOperator_=(value: ConditionalOperator): Unit =
    underlying.setConditionalOperator(value)

  def conditionalOperator: String = underlying.getConditionalOperator

  def returnValues_=(value: String): Unit = underlying.setReturnValues(value)

  def returnValues_=(value: ReturnValue): Unit = underlying.setReturnValues(value)

  def returnValues: String = underlying.getReturnValues

  def returnConsumedCapacity_=(value: String): Unit = underlying.setReturnConsumedCapacity(value)

  def returnConsumedCapacity_=(value: ReturnConsumedCapacity): Unit = underlying.setReturnConsumedCapacity(value)

  def returnConsumedCapacity: String = underlying.getReturnConsumedCapacity

  def returnItemCollectionMetrics_=(value: String): Unit = underlying.setReturnItemCollectionMetrics(value)

  def returnItemCollectionMetrics_=(value: ReturnItemCollectionMetrics): Unit = underlying.setReturnItemCollectionMetrics(value)

  def returnItemCollectionMetrics: String = underlying.getReturnItemCollectionMetrics

  def conditionExpression_=(value: String): Unit = underlying.setConditionExpression(value)

  def conditionExpression: String = underlying.getConditionExpression

  def expressionAttributeNames_=(value: Map[String, String]): Unit = underlying.setExpressionAttributeNames(value.asJava)

  def expressionAttributeNames: Map[String, String] = underlying.getExpressionAttributeNames.asScala.toMap

  def withExpressionAttributeNames(expressionAttributeNames: Map[String, String]): DeleteItemRequest =
    underlying.withExpressionAttributeNames(expressionAttributeNames.asJava)

  def expressionAttributeValues_=(value: Map[String, AttributeValue]): Unit =
    underlying.setExpressionAttributeValues(value.asJava)

  def expressionAttributeValues: Map[String, AttributeValue] =
    underlying.getExpressionAttributeValues.asScala.toMap

  def withExpressionAttributeValues(expressionAttributeValues: Map[String, AttributeValue]): DeleteItemRequest =
    underlying.withExpressionAttributeValues(expressionAttributeValues.asJava)

}
