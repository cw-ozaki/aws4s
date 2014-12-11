package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{AttributeValue, ConsumedCapacity, ScanResult}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ScanResultFactory {

  def apply(): ScanResult = new ScanResult()

}

class RichScanResult(val underlying: ScanResult) extends AnyVal with PimpedType[ScanResult] {

  def items: Seq[Map[String, AttributeValue]] = underlying.getItems.asScala.map(_.asScala.toMap)

  def items(value: Seq[Map[String, AttributeValue]]): Unit = underlying.setItems(value.map(_.asJava).asJava)

  def count: Int = underlying.getCount

  def count_=(value: Int): Unit = underlying.setCount(value)

  def scannedCount: Int = underlying.getScannedCount

  def scannedCount_=(value: Int): Unit = underlying.setScannedCount(value)

  def lastEvaluatedKey: Map[String, AttributeValue] = underlying.getLastEvaluatedKey.asScala.toMap

  def lastEvaluatedKey_=(value: Map[String, AttributeValue]): Unit = underlying.setLastEvaluatedKey(value.asJava)

  def consumedCapacity: ConsumedCapacity = underlying.getConsumedCapacity

  def consumedCapacity_=(value: ConsumedCapacity): Unit = underlying.setConsumedCapacity(value)

}
