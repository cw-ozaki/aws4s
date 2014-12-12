package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{AttributeValue, ComparisonOperator, Condition}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ConditionFactory {

  import org.sisioh.aws4s.dynamodb.Implicits._

  def create(): Condition = new Condition()

  def eq(values: Any*) = create()
    .withComparisonOperator(ComparisonOperator.EQ)
    .withAttributeValueList(values.map(e => AttributeValueFactory.toJavaValue(e)))

  def ne(values: Any*) = create()
    .withComparisonOperator(ComparisonOperator.NE)
    .withAttributeValueList(values.map(e => AttributeValueFactory.toJavaValue(e)))

  def gt(values: Any*) = create()
    .withComparisonOperator(ComparisonOperator.GT)
    .withAttributeValueList(values.map(e => AttributeValueFactory.toJavaValue(e)))

  def ge(values: Any*) = create()
    .withComparisonOperator(ComparisonOperator.GE)
    .withAttributeValueList(values.map(e => AttributeValueFactory.toJavaValue(e)))

  def lt(values: Any*) = create()
    .withComparisonOperator(ComparisonOperator.LT)
    .withAttributeValueList(values.map(e => AttributeValueFactory.toJavaValue(e)))

  def le(values: Any*) = create()
    .withComparisonOperator(ComparisonOperator.LE)
    .withAttributeValueList(values.map(e => AttributeValueFactory.toJavaValue(e)))

  def in(values: Any*) = create()
    .withComparisonOperator(ComparisonOperator.IN)
    .withAttributeValueList(values.map(e => AttributeValueFactory.toJavaValue(e)))

  def between(values: Any*) = create()
    .withComparisonOperator(ComparisonOperator.BETWEEN)
    .withAttributeValueList(values.map(e => AttributeValueFactory.toJavaValue(e)))

  def isNotNull = create()
    .withComparisonOperator(ComparisonOperator.NOT_NULL)

  def isNull = create()
    .withComparisonOperator(ComparisonOperator.NULL)

  def contains(values: Any*) = create()
    .withComparisonOperator(ComparisonOperator.CONTAINS)
    .withAttributeValueList(values.map(e => AttributeValueFactory.toJavaValue(e)))

  def notContains(values: Any*) = create()
    .withComparisonOperator(ComparisonOperator.NOT_CONTAINS)
    .withAttributeValueList(values.map(e => AttributeValueFactory.toJavaValue(e)))

  def beginsWith(values: Any*) = create()
    .withComparisonOperator(ComparisonOperator.BEGINS_WITH)
    .withAttributeValueList(values.map(e => AttributeValueFactory.toJavaValue(e)))

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
