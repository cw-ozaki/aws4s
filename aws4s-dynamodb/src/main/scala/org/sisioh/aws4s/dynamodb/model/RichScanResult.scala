package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{AttributeValue, ConsumedCapacity, ScanResult}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ScanResultFactory {

  def create(): ScanResult = new ScanResult()

}

class RichScanResult(val underlying: ScanResult) extends AnyVal with PimpedType[ScanResult] {

  // ---

  def itemsOpt: Option[Seq[Map[String, AttributeValue]]] = Option(underlying.getItems).map(_.asScala.map(_.asScala.toMap))

  def itemsOpt_=(value: Option[Seq[Map[String, AttributeValue]]]): Unit = underlying.setItems(value.map(_.map(_.asJava).asJava).orNull)

  def withItemsOpt(value: Option[Seq[Map[String, AttributeValue]]]): ScanResult = underlying.withItems(value.map(_.map(_.asJava).asJava).orNull)

  // ---

  def countOpt: Option[Int] = Option(underlying.getCount)

  def countOpt_=(value: Option[Int]): Unit = underlying.setCount(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  def withCountOpt(value: Option[Int]): ScanResult = underlying.withCount(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  // ---

  def scannedCountOpt: Option[Int] = Option(underlying.getScannedCount)

  def scannedCountOpt_=(value: Option[Int]): Unit = underlying.setScannedCount(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  def withScannedCountOpt(value: Option[Int]): ScanResult = underlying.withScannedCount(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  // ---

  def lastEvaluatedKeyOpt: Option[Map[String, AttributeValue]] = Option(underlying.getLastEvaluatedKey).map(_.asScala.toMap)

  def lastEvaluatedKeyOpt_=(value: Option[Map[String, AttributeValue]]): Unit = underlying.setLastEvaluatedKey(value.map(_.asJava).orNull)

  def withLastEvaluatedKeyOpt(value: Option[Map[String, AttributeValue]]): ScanResult = underlying.withLastEvaluatedKey(value.map(_.asJava).orNull)

  // ---

  def consumedCapacityOpt: Option[ConsumedCapacity] = Option(underlying.getConsumedCapacity)

  def consumedCapacityOpt_=(value: Option[ConsumedCapacity]): Unit = underlying.setConsumedCapacity(value.orNull)

  def withConsumedCapacityOpt(value: Option[ConsumedCapacity]): ScanResult = underlying.withConsumedCapacity(value.orNull)

  // ---

}
