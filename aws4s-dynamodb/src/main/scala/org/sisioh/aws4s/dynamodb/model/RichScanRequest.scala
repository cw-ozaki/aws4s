package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{AttributeValue, Condition, ScanRequest}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ScanRequestFactory {

  def apply(): ScanRequest = new ScanRequest()

}

class RichScanRequest(val underlying: ScanRequest) extends AnyVal with PimpedType[ScanRequest] {

  def tableName: String = underlying.getTableName

  def tableName(value: String): Unit = underlying.setTableName(value)

  def attributesToGet: Seq[String] = underlying.getAttributesToGet.asScala

  def attributesToGet_=(value: Iterable[String]): Unit = underlying.setAttributesToGet(value.toSeq.asJava)

  def withAttributesToGet(value: Iterable[String]): ScanRequest = underlying.withAttributesToGet(value.toSeq.asJava)

  def limit: Int = underlying.getLimit

  def limit_=(value: Int): Unit = underlying.setLimit(value)

  def select: String = underlying.getSelect

  def select_=(value: String): Unit = underlying.setSelect(value)

  def scanFilter: Map[String, Condition] = underlying.getScanFilter.asScala.toMap

  def scanFilter_=(value: Map[String, Condition]): Unit = underlying.setScanFilter(value.asJava)

  def withScanFilter(value: Map[String, Condition]): ScanRequest = underlying.withScanFilter(value.asJava)

  def conditionalOperator: String = underlying.getConditionalOperator

  def conditionalOperator_=(value: String): Unit = underlying.setConditionalOperator(value)

  def exclusiveStartKey: Map[String, AttributeValue] = underlying.getExclusiveStartKey.asScala.toMap

  def exclusiveStartKey_=(value: Map[String, AttributeValue]): Unit = underlying.setExclusiveStartKey(value.asJava)

  def withExclusiveStartKey(value: Map[String, AttributeValue]): ScanRequest = underlying.withExclusiveStartKey(value.asJava)

  def setExclusiveStartKey(hashKey: (String, AttributeValue), rangeKey: (String, AttributeValue)): Unit =
    underlying.setExclusiveStartKey(KeyEntry(hashKey._1, hashKey._2), KeyEntry(rangeKey._1, rangeKey._2))

  def withExclusiveStartKey(hashKey: (String, AttributeValue), rangeKey: (String, AttributeValue)): ScanRequest =
    underlying.withExclusiveStartKey(KeyEntry(hashKey._1, hashKey._2), KeyEntry(rangeKey._1, rangeKey._2))

  def returnConsumedCapacity: String = underlying.getReturnConsumedCapacity

  def returnConsumedCapacity_=(value: String): Unit = underlying.setReturnConsumedCapacity(value)

  def totalSegments: Int = underlying.getTotalSegments

  def totalSegments_=(value: Int): Unit = underlying.setTotalSegments(value)

  def segment: Int = underlying.getSegment

  def segment_=(value: Int): Unit = underlying.setSegment(value)

  def projectionExpression: String = underlying.getProjectionExpression

  def projectionExpression_=(value: String): Unit = underlying.setProjectionExpression(value)

  def filterExpression: String = underlying.getFilterExpression

  def filterExpression_=(value: String): Unit = underlying.setFilterExpression(value)

  def expressionAttributeNames: Map[String, String] = underlying.getExpressionAttributeNames.asScala.toMap

  def expressionAttributeNames_=(value: Map[String, String]): Unit = underlying.setExpressionAttributeNames(value.asJava)

  def withExpressionAttributeNames(value: Map[String, String]): ScanRequest = underlying.withExpressionAttributeNames(value.asJava)

  def expressionAttributeValues: Map[String, AttributeValue] = underlying.getExpressionAttributeValues.asScala.toMap

  def expressionAttributeValues_=(value: Map[String, AttributeValue]): Unit = underlying.setExpressionAttributeValues(value.asJava)

  def withExpressionAttributeValues(value: Map[String, AttributeValue]): ScanRequest = underlying.withExpressionAttributeValues(value.asJava)

}
