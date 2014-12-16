package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{AttributeValue, ConsumedCapacity, QueryResult}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object QueryResultFactory {

  def create(): QueryResult = new QueryResult()

}

class RichQueryResult(val underlying: QueryResult) extends AnyVal with PimpedType[QueryResult] {

  // ---

  def itemsOpt: Option[Seq[Map[String, AttributeValue]]] = Option(underlying.getItems).map(_.asScala.map(_.asScala.toMap))

  def itemsOpt_=(value: Option[Seq[Map[String, AttributeValue]]]): Unit = underlying.setItems(value.map(_.map(_.asJava).asJava).orNull)

  def withItemsOpt(value: Option[Seq[Map[String, AttributeValue]]]): QueryResult = underlying.withItems(value.map(_.map(_.asJava).asJava).orNull)

  // ---

  def countOpt: Option[Int] = Option(underlying.getCount)

  def countOpt_=(value: Option[Int]): Unit = underlying.setCount(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  def withCountOpt(value: Option[Int]): QueryResult = underlying.withCount(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  // ---

  def scannedCountOpt: Option[Int] = Option(underlying.getScannedCount)

  def scannedCountOpt_=(value: Option[Int]): Unit = underlying.setScannedCount(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  def withScannedCountOpt(value: Option[Int]): QueryResult = underlying.withScannedCount(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  // ---

  def lastEvaluatedKeyOpt: Option[Map[String, AttributeValue]] = Option(underlying.getLastEvaluatedKey).map(_.asScala.toMap)

  def lastEvaluatedKeyOpt_=(value: Option[Map[String, AttributeValue]]): Unit = underlying.setLastEvaluatedKey(value.map(_.asJava).orNull)

  def withLastEvaluatedKeyOpt(value: Option[Map[String, AttributeValue]]): QueryResult = underlying.withLastEvaluatedKey(value.map(_.asJava).orNull)

  // ---

  def consumedCapacityOpt: Option[ConsumedCapacity] = Option(underlying.getConsumedCapacity)

  def consumedCapacityOpt_=(value: Option[ConsumedCapacity]): Unit = underlying.setConsumedCapacity(value.orNull)

  def withConsumedCapacityOpt(value: Option[ConsumedCapacity]): QueryResult = underlying.withConsumedCapacity(value.orNull)

  // ---

}
