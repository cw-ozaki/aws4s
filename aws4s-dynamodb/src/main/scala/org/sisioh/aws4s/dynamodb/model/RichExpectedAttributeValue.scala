package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{AttributeValue, ExpectedAttributeValue}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ExpectedAttributeValueFactory {

  def create(): ExpectedAttributeValue = new ExpectedAttributeValue()

  def create(value: AttributeValue): ExpectedAttributeValue = new ExpectedAttributeValue(value)

  def create(exists: Boolean): ExpectedAttributeValue = new ExpectedAttributeValue(exists)

}

class RichExpectedAttributeValue(val underlying: ExpectedAttributeValue)
  extends AnyVal with PimpedType[ExpectedAttributeValue] {

  def valueOpt: Option[AttributeValue] = Option(underlying.getValue)

  def valueOpt_=(value: Option[AttributeValue]): Unit =
    underlying.setValue(value.orNull)

  def withValueOpt(value: Option[AttributeValue]): ExpectedAttributeValue =
    underlying.withValue(value.orNull)

  // ---

  def existsOpt: Option[Boolean] = Option(underlying.getExists)

  def existsOpt_=(value: Option[Boolean]): Unit =
    underlying.setExists(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  def withExistsOpt(value: Option[Boolean]): ExpectedAttributeValue =
    underlying.withExists(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  // ---

  def comparisonOperatorOpt: Option[String] = Option(underlying.getComparisonOperator)

  def comparisonOperatorOpt_=(value: Option[String]): Unit =
    underlying.setComparisonOperator(value.orNull)

  def withComparisonOperatorOpt(value: Option[String]): ExpectedAttributeValue =
    underlying.withComparisonOperator(value.orNull)

  // ---

  def attributeValueList: Seq[AttributeValue] = underlying.getAttributeValueList.asScala.toVector

  def attributeValueList_=(value: Seq[AttributeValue]): Unit =
    underlying.setAttributeValueList(value.asJava)

  def withAttributeValueList(value: Seq[AttributeValue]): ExpectedAttributeValue =
    underlying.withAttributeValueList(value.asJava)

}
