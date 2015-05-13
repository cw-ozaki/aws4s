package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{AttributeValue, Condition, ScanRequest}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ScanRequestFactory {

  def create(): ScanRequest = new ScanRequest()

  def create(tableName: String): ScanRequest = new ScanRequest(tableName)

}

class RichScanRequest(val underlying: ScanRequest) extends AnyVal with PimpedType[ScanRequest] {

  // ---

  def tableNameOpt: Option[String] = Option(underlying.getTableName)

  def tableNameOpt_=(value: Option[String]): Unit = underlying.setTableName(value.orNull)

  def withTableNameOpt(value: Option[String]): ScanRequest = underlying.withTableName(value.orNull)

  // ---

  def attributesToGet: Seq[String] = underlying.getAttributesToGet.asScala.toVector

  def attributesToGet_=(value: Iterable[String]): Unit = underlying.setAttributesToGet(value.toSeq.asJava)

  def withAttributesToGet(value: Iterable[String]): ScanRequest = underlying.withAttributesToGet(value.toSeq.asJava)

  // ---

  def limitOpt: Option[Int] = Option(underlying.getLimit)

  def limitOpt_=(value: Option[Int]): Unit = underlying.setLimit(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  def withLimitOpt(value: Option[Int]): ScanRequest = underlying.withLimit(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  // ---

  def selectOpt: Option[String] = Option(underlying.getSelect)

  def selectOpt_=(value: Option[String]): Unit = underlying.setSelect(value.orNull)

  def withSelectOpt(value: Option[String]): ScanRequest = underlying.withSelect(value.orNull)

  // ---

  def scanFilterOpt: Option[Map[String, Condition]] = Option(underlying.getScanFilter).map(_.asScala.toMap)

  def scanFilterOpt_=(value: Option[Map[String, Condition]]): Unit = underlying.setScanFilter(value.map(_.asJava).orNull)

  def withScanFilterOpt(value: Option[Map[String, Condition]]): ScanRequest = underlying.withScanFilter(value.map(_.asJava).orNull)

  // ---

  def conditionalOperatorOpt: Option[String] = Option(underlying.getConditionalOperator)

  def conditionalOperatorOpt_=(value: Option[String]): Unit = underlying.setConditionalOperator(value.orNull)

  def withConditionalOperatorOpt(value: Option[String]): ScanRequest = underlying.withConditionalOperator(value.orNull)

  // ---

  def exclusiveStartKeyOpt: Option[Map[String, AttributeValue]] = Option(underlying.getExclusiveStartKey).map(_.asScala.toMap)

  def exclusiveStartKeyOpt_=(value: Option[Map[String, AttributeValue]]): Unit = underlying.setExclusiveStartKey(value.map(_.asJava).orNull)

  def withExclusiveStartKeyOpt(value: Option[Map[String, AttributeValue]]): ScanRequest = underlying.withExclusiveStartKey(value.map(_.asJava).orNull)

  def setExclusiveStartKey(hashKey: (String, AttributeValue), rangeKey: (String, AttributeValue)): Unit =
    underlying.setExclusiveStartKey(KeyEntry(hashKey._1, hashKey._2), KeyEntry(rangeKey._1, rangeKey._2))

  def withExclusiveStartKey(hashKey: (String, AttributeValue), rangeKey: (String, AttributeValue)): ScanRequest =
    underlying.withExclusiveStartKey(KeyEntry(hashKey._1, hashKey._2), KeyEntry(rangeKey._1, rangeKey._2))

  // ---

  def returnConsumedCapacityOpt: Option[String] = Option(underlying.getReturnConsumedCapacity)

  def returnConsumedCapacityOpt_=(value: Option[String]): Unit = underlying.setReturnConsumedCapacity(value.orNull)

  def withReturnConsumedCapacityOpt(value: Option[String]): ScanRequest = underlying.withReturnConsumedCapacity(value.orNull)

  // ---

  def totalSegmentsOpt: Option[Int] = Option(underlying.getTotalSegments)

  def totalSegmentsOpt_=(value: Option[Int]): Unit = underlying.setTotalSegments(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  def withTotalSegmentsOpt(value: Option[Int]): ScanRequest = underlying.withTotalSegments(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  // ---

  def segmentOpt: Option[Int] = Option(underlying.getSegment)

  def segmentOpt_=(value: Option[Int]): Unit = underlying.setSegment(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  def withSegmentOpt(value: Option[Int]): ScanRequest = underlying.withSegment(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  // ---

  def projectionExpressionOpt: Option[String] = Option(underlying.getProjectionExpression)

  def projectionExpressionOpt_=(value: Option[String]): Unit = underlying.setProjectionExpression(value.orNull)

  def withProjectionExpressionOpt(value: Option[String]): ScanRequest = underlying.withProjectionExpression(value.orNull)

  // ---

  def filterExpressionOpt: Option[String] = Option(underlying.getFilterExpression)

  def filterExpressionOpt_=(value: Option[String]): Unit = underlying.setFilterExpression(value.orNull)

  def withFilterExpressionOpt(value: Option[String]): ScanRequest = underlying.withFilterExpression(value.orNull)

  // ---

  def expressionAttributeNamesOpt: Option[Map[String, String]] = Option(underlying.getExpressionAttributeNames).map(_.asScala.toMap)

  def expressionAttributeNamesOpt_=(value: Option[Map[String, String]]): Unit = underlying.setExpressionAttributeNames(value.map(_.asJava).orNull)

  def withExpressionAttributeNamesOpt(value: Option[Map[String, String]]): ScanRequest = underlying.withExpressionAttributeNames(value.map(_.asJava).orNull)

  // ---

  def expressionAttributeValuesOpt: Option[Map[String, AttributeValue]] = Option(underlying.getExpressionAttributeValues).map(_.asScala.toMap)

  def expressionAttributeValuesOpt_=(value: Option[Map[String, AttributeValue]]): Unit = underlying.setExpressionAttributeValues(value.map(_.asJava).orNull)

  def withExpressionAttributeValuesOpt(value: Option[Map[String, AttributeValue]]): ScanRequest = underlying.withExpressionAttributeValues(value.map(_.asJava).orNull)

  // ---

}
