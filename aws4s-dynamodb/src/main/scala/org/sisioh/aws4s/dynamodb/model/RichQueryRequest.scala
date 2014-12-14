package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{AttributeValue, Condition, QueryRequest}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object QueryRequestFactory {

  def create(): QueryRequest = new QueryRequest()

  def create(tableName: Option[String]): QueryRequest = new QueryRequest(tableName.orNull)

}

class RichQueryRequest(val underlying: QueryRequest) extends AnyVal with PimpedType[QueryRequest] {

  def tableNameOpt: Option[String] = Option(underlying.getTableName)

  def tableNameOpt_=(value: Option[String]): Unit = underlying.setTableName(value.orNull)

  def indexNameOpt: Option[String] = Option(underlying.getIndexName)

  def indexNameOpt_=(value: Option[String]) = underlying.setIndexName(value.orNull)

  def selectOpt: Option[String] = Option(underlying.getSelect)

  def selectOpt_=(value: Option[String]): Unit = underlying.setSelect(value.orNull)

  def attributesToGetOpt: Option[Seq[String]] = Option(underlying.getAttributesToGet).map(_.asScala)

  def attributesToGetOpt_=(value: Option[Iterable[String]]): Unit = underlying.setAttributesToGet(value.map(_.toSeq.asJava).orNull)

  def withAttributesToGetOpt(value: Option[Iterable[String]]): QueryRequest = underlying.withAttributesToGet(value.map(_.toSeq.asJava).orNull)

  def limitOpt: Option[Int] = Option(underlying.getLimit)

  def limitOpt_=(value: Option[Int]): Unit = underlying.setLimit(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  def consistentReadOpt: Option[Boolean] = Option(underlying.getConsistentRead)

  def consistentReadOpt_=(value: Option[Boolean]) = underlying.setConsistentRead(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  def keyConditionsOpt: Option[Map[String, Condition]] = Option(underlying.getKeyConditions).map(_.asScala.toMap)

  def keyConditionsOpt_=(value: Option[Map[String, Condition]]): Unit = underlying.setKeyConditions(value.map(_.asJava).orNull)

  def withKeyConditionsOpt(value: Option[Map[String, Condition]]): QueryRequest = underlying.withKeyConditions(value.map(_.asJava).orNull)

  def queryFilterOpt: Option[Map[String, Condition]] = Option(underlying.getQueryFilter).map(_.asScala.toMap)

  def queryFilterOpt_=(value: Option[Map[String, Condition]]): Unit = underlying.setQueryFilter(value.map(_.asJava).orNull)

  def withQueryFilterOpt(value: Option[Map[String, Condition]]): QueryRequest = underlying.withQueryFilter(value.map(_.asJava).orNull)

  def conditionalOperatorOpt: Option[String] = Option(underlying.getConditionalOperator)

  def conditionalOperatorOpt_=(value: Option[String]): Unit = underlying.setConditionalOperator(value.orNull)

  def scanIndexForwardOpt: Option[Boolean] = Option(underlying.getScanIndexForward)

  def scanIndexForwardOpt_=(value: Option[Boolean]): Unit = underlying.setScanIndexForward(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  def exclusiveStartKeyOpt: Option[Map[String, AttributeValue]] = Option(underlying.getExclusiveStartKey).map(_.asScala.toMap)

  def exclusiveStartKeyOpt_=(value: Option[Map[String, AttributeValue]]): Unit = underlying.setExclusiveStartKey(value.map(_.asJava).orNull)

  def withExclusiveStartKeyOpt(value: Option[Map[String, AttributeValue]]): QueryRequest = underlying.withExclusiveStartKey(value.map(_.asJava).orNull)

  def setExclusiveStartKey(hashKey: (String, AttributeValue), rangeKey: (String, AttributeValue)): Unit =
    underlying.setExclusiveStartKey(KeyEntry(hashKey._1, hashKey._2), KeyEntry(rangeKey._1, rangeKey._2))

  def withExclusiveStartKey(hashKey: (String, AttributeValue), rangeKey: (String, AttributeValue)): QueryRequest =
    underlying.withExclusiveStartKey(KeyEntry(hashKey._1, hashKey._2), KeyEntry(rangeKey._1, rangeKey._2))

  def returnConsumedCapacityOpt: Option[String] = Option(underlying.getReturnConsumedCapacity)

  def returnConsumedCapacityOpt_=(value: Option[String]) = underlying.setReturnConsumedCapacity(value.orNull)

  def projectionExpressionOpt: Option[String] = Option(underlying.getProjectionExpression)

  def projectionExpressionOpt_=(value: Option[String]): Unit = underlying.setProjectionExpression(value.orNull)

  def filterExpressionOpt: Option[String] = Option(underlying.getFilterExpression)

  def filterExpressionOpt_=(value: Option[String]): Unit = underlying.setFilterExpression(value.orNull)

  def expressionAttributeNamesOpt: Option[Map[String, String]] = Option(underlying.getExpressionAttributeNames).map(_.asScala.toMap)

  def expressionAttributeNamesOpt_=(value: Option[Map[String, String]]): Unit = underlying.setExpressionAttributeNames(value.map(_.asJava).orNull)

  def withExpressionAttributeNamesOpt_=(value: Option[Map[String, String]]): QueryRequest = underlying.withExpressionAttributeNames(value.map(_.asJava).orNull)

  def expressionAttributeValuesOpt: Option[Map[String, AttributeValue]] = Option(underlying.getExpressionAttributeValues).map(_.asScala.toMap)

  def expressionAttributeValuesOpt_=(value: Option[Map[String, AttributeValue]]): Unit = underlying.setExpressionAttributeValues(value.map(_.asJava).orNull)

  def withExpressionAttributeValuesOpt(value: Option[Map[String, AttributeValue]]): QueryRequest = underlying.withExpressionAttributeValues(value.map(_.asJava).orNull)

}
