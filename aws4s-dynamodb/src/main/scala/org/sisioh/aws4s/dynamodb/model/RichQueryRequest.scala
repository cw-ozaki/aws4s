package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{AttributeValue, Condition, QueryRequest}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object QueryRequestFactory {

  def apply(): QueryRequest = new QueryRequest()

  def apply(tableName: String): QueryRequest = new QueryRequest(tableName)

}

class RichQueryRequest(val underlying: QueryRequest) extends AnyVal with PimpedType[QueryRequest] {

  def tableName: String = underlying.getTableName

  def tableName_=(value: String): Unit = underlying.setTableName(value)

  def indexName: String = underlying.getIndexName

  def indexName_=(value: String) = underlying.setIndexName(value)

  def select: String = underlying.getSelect

  def select_=(value: String): Unit = underlying.setSelect(value)

  def attributesToGet: Seq[String] = underlying.getAttributesToGet.asScala

  def attributesToGet_=(value: Seq[String]): Unit = underlying.setAttributesToGet(value.asJava)

  def withAttributesToGet(value: Seq[String]): QueryRequest = underlying.withAttributesToGet(value.asJava)

  def limit: Int = underlying.getLimit

  def limit_=(value: Int): Unit = underlying.setLimit(value)

  def consistentRead: Boolean = underlying.getConsistentRead

  def consistentRead_=(value: Boolean) = underlying.setConsistentRead(value)

  def keyConditions: Map[String, Condition] = underlying.getKeyConditions.asScala.toMap

  def keyConditions_=(value: Map[String, Condition]): Unit = underlying.setKeyConditions(value.asJava)

  def withKeyConditions(value: Map[String, Condition]): QueryRequest = underlying.withKeyConditions(value.asJava)

  def queryFilter: Map[String, Condition] = underlying.getQueryFilter.asScala.toMap

  def queryFilter_=(value: Map[String, Condition]): Unit = underlying.setQueryFilter(value.asJava)

  def withQueryFilter(value: Map[String, Condition]): QueryRequest = underlying.withQueryFilter(value.asJava)

  def conditionalOperator: String = underlying.getConditionalOperator

  def conditionalOperator_=(value: String): Unit = underlying.setConditionalOperator(value)

  def scanIndexForward: Boolean = underlying.getScanIndexForward

  def scanIndexForward_=(value: Boolean): Unit = underlying.setScanIndexForward(value)

  def exclusiveStartKey: Map[String, AttributeValue] = underlying.getExclusiveStartKey.asScala.toMap

  def exclusiveStartKey_=(value: Map[String, AttributeValue]): Unit = underlying.setExclusiveStartKey(value.asJava)

  def withExclusiveStartKey(value: Map[String, AttributeValue]): QueryRequest = underlying.withExclusiveStartKey(value.asJava)

  def setExclusiveStartKey(hashKey: (String, AttributeValue), rangeKey: (String, AttributeValue)): Unit =
    underlying.setExclusiveStartKey(KeyEntry(hashKey._1, hashKey._2), KeyEntry(rangeKey._1, rangeKey._2))

  def withExclusiveStartKey(hashKey: (String, AttributeValue), rangeKey: (String, AttributeValue)): QueryRequest =
    underlying.withExclusiveStartKey(KeyEntry(hashKey._1, hashKey._2), KeyEntry(rangeKey._1, rangeKey._2))

  def returnConsumedCapacity: String = underlying.getReturnConsumedCapacity

  def returnConsumedCapacity_=(value: String) = underlying.setReturnConsumedCapacity(value)

  def projectionExpression: String = underlying.getProjectionExpression

  def projectionExpression_=(value: String): Unit = underlying.setProjectionExpression(value)

  def filterExpression: String = underlying.getFilterExpression

  def filterExpression_=(value: String): Unit = underlying.setFilterExpression(value)

  def expressionAttributeNames: Map[String, String] = underlying.getExpressionAttributeNames.asScala.toMap

  def expressionAttributeNames_=(value: Map[String, String]): Unit = underlying.setExpressionAttributeNames(value.asJava)

  def withExpressionAttributeNames_=(value: Map[String, String]): QueryRequest = underlying.withExpressionAttributeNames(value.asJava)

  def expressionAttributeValues: Map[String, AttributeValue] = underlying.getExpressionAttributeValues.asScala.toMap

  def expressionAttributeValues_=(value: Map[String, AttributeValue]): Unit = underlying.setExpressionAttributeValues(value.asJava)

  def withExpressionAttributeValues(value: Map[String, AttributeValue]): QueryRequest = underlying.withExpressionAttributeValues(value.asJava)


}
