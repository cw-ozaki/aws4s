package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{AttributeValue, ComparisonOperator, Condition}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ConditionFactory {

  import org.sisioh.aws4s.dynamodb.Implicits._

  def create(): Condition = new Condition()

  def eq(values: Any*) = create()
    .withComparisonOperator(ComparisonOperator.EQ)
    .withAttributeValueListOpt(Some(values.map(e => AttributeValueFactory.toJavaValue(e))))

  def ne(values: Any*) = create()
    .withComparisonOperator(ComparisonOperator.NE)
    .withAttributeValueListOpt(Some(values.map(e => AttributeValueFactory.toJavaValue(e))))

  def gt(values: Any*) = create()
    .withComparisonOperator(ComparisonOperator.GT)
    .withAttributeValueListOpt(Some(values.map(e => AttributeValueFactory.toJavaValue(e))))

  def ge(values: Any*) = create()
    .withComparisonOperator(ComparisonOperator.GE)
    .withAttributeValueListOpt(Some(values.map(e => AttributeValueFactory.toJavaValue(e))))

  def lt(values: Any*) = create()
    .withComparisonOperator(ComparisonOperator.LT)
    .withAttributeValueListOpt(Some(values.map(e => AttributeValueFactory.toJavaValue(e))))

  def le(values: Any*) = create()
    .withComparisonOperator(ComparisonOperator.LE)
    .withAttributeValueListOpt(Some(values.map(e => AttributeValueFactory.toJavaValue(e))))

  def in(values: Any*) = create()
    .withComparisonOperator(ComparisonOperator.IN)
    .withAttributeValueListOpt(Some(values.map(e => AttributeValueFactory.toJavaValue(e))))

  def between(values: Any*) = create()
    .withComparisonOperator(ComparisonOperator.BETWEEN)
    .withAttributeValueListOpt(Some(values.map(e => AttributeValueFactory.toJavaValue(e))))

  def isNotNull = create()
    .withComparisonOperator(ComparisonOperator.NOT_NULL)

  def isNull = create()
    .withComparisonOperator(ComparisonOperator.NULL)

  def contains(values: Any*) = create()
    .withComparisonOperator(ComparisonOperator.CONTAINS)
    .withAttributeValueListOpt(Some(values.map(e => AttributeValueFactory.toJavaValue(e))))

  def notContains(values: Any*) = create()
    .withComparisonOperator(ComparisonOperator.NOT_CONTAINS)
    .withAttributeValueListOpt(Some(values.map(e => AttributeValueFactory.toJavaValue(e))))

  def beginsWith(values: Any*) = create()
    .withComparisonOperator(ComparisonOperator.BEGINS_WITH)
    .withAttributeValueListOpt(Some(values.map(e => AttributeValueFactory.toJavaValue(e))))

}

class RichCondition(val underlying: Condition) extends AnyVal with PimpedType[Condition] {

  def attributeValueListOpt_=(value: Option[Seq[AttributeValue]]): Unit =
    underlying.setAttributeValueList(value.map(_.asJava).orNull)

  def attributeValueListOpt: Option[Seq[AttributeValue]] =
    Option(underlying.getAttributeValueList).map(_.asScala)

  def withAttributeValueListOpt(attributeValueList: Option[Iterable[AttributeValue]]): Condition =
    underlying.withAttributeValueList(attributeValueList.map(_.toSeq.asJava).orNull)

  def comparisonOperatorOpt_=(value: Option[String]): Unit =
    underlying.setComparisonOperator(value.orNull)

  def setComparisonOperatorOpt(value: Option[ComparisonOperator]): Unit =
    underlying.setComparisonOperator(value.orNull)

  def comparisonOperatorOpt: Option[String] = Option(underlying.getComparisonOperator)

}
