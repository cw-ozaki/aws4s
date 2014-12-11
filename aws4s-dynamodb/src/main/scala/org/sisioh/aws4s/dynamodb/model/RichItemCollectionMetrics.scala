package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{AttributeValue, ItemCollectionMetrics}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ItemCollectionMetricsFactory {

  def apply(): ItemCollectionMetrics = new ItemCollectionMetrics()

}

class RichItemCollectionMetrics(val underlying: ItemCollectionMetrics) extends AnyVal with PimpedType[ItemCollectionMetrics] {

  def itemCollectionKey: Map[String, AttributeValue] = underlying.getItemCollectionKey.asScala.toMap

  def itemCollectionKey_=(value: Map[String, AttributeValue]): Unit = underlying.setItemCollectionKey(value.asJava)

  def withItemCollectionKey(value: Map[String, AttributeValue]): ItemCollectionMetrics = underlying.withItemCollectionKey(value.asJava)

  def sizeEstimateRangeGB: Seq[Double] = underlying.getSizeEstimateRangeGB.asScala.map(_.asInstanceOf[Double])

  def sizeEstimateRangeGB_=(value: Seq[Double]): Unit = underlying.setSizeEstimateRangeGB(value.map(_.asInstanceOf[java.lang.Double]).asJava)

  def withSizeEstimateRangeGB(value: Seq[Double]): ItemCollectionMetrics = underlying.withSizeEstimateRangeGB(value.map(_.asInstanceOf[java.lang.Double]).asJava)

}
