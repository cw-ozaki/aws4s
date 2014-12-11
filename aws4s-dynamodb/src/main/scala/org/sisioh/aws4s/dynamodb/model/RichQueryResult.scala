package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{AttributeValue, ConsumedCapacity, QueryResult}

import scala.collection.JavaConverters._

object QueryResultFactory {

  def apply(): QueryResult = new QueryResult()

}

class RichQueryResult(val underlying: QueryResult) {

  def items: Seq[Map[String, AttributeValue]] = underlying.getItems.asScala.map(_.asScala.toMap)

  def items_=(value: Seq[Map[String, AttributeValue]]): Unit = underlying.setItems(value.map(_.asJava).asJava)

  def withItems(value: Seq[Map[String, AttributeValue]]): QueryResult = underlying.withItems(value.map(_.asJava).asJava)

  def count: Int = underlying.getCount

  def count_=(value: Int): Unit = underlying.setCount(value)

  def scannedCount: Int = underlying.getScannedCount

  def scannedCount_=(value: Int): Unit = underlying.setScannedCount(value)

  def lastEvaluatedKey: Map[String, AttributeValue] = underlying.getLastEvaluatedKey.asScala.toMap

  def lastEvaluatedKey_=(value: Map[String, AttributeValue]): Unit = underlying.setLastEvaluatedKey(value.asJava)

  def withLastEvaluatedKey(value: Map[String, AttributeValue]): QueryResult = underlying.withLastEvaluatedKey(value.asJava)

  def consumedCapacity: ConsumedCapacity = underlying.getConsumedCapacity

  def consumedCapacity_=(value: ConsumedCapacity): Unit = underlying.setConsumedCapacity(value)

}
