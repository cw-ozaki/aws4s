package com.github.j5ik2o.aws.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{AttributeValue, ComparisonOperator, Condition}
import com.github.j5ik2o.aws.PimpedType

import scala.collection.JavaConverters._

object ConditionFactory {

  def apply(): Condition = new Condition()

}

class RichCondition(val underlying: Condition) extends AnyVal with PimpedType[Condition] {

  def attributeValueList_=(value: Seq[AttributeValue]): Unit =
    underlying.setAttributeValueList(value.asJava)

  def attributeValueList: Seq[AttributeValue] =
    underlying.getAttributeValueList.asScala

  def withAttributeValueList(attributeValueList: Iterable[AttributeValue]): Condition =
    underlying.withAttributeValueList(attributeValueList.toSeq.asJava)

  def comparisonOperator_=(value: String): Unit =
    underlying.setComparisonOperator(value)

  def comparisonOperator_=(value: ComparisonOperator): Unit =
    underlying.setComparisonOperator(value)

  def comparisonOperator: String = underlying.getComparisonOperator

}
