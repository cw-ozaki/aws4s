package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.AttributeDefinition
import org.sisioh.aws4s.PimpedType

class RichAttributeDefinition(val underlying: AttributeDefinition)
    extends AnyVal with PimpedType[AttributeDefinition] {

  // ---

  def attributeNameOpt: Option[String] = Option(underlying.getAttributeName)

  def attributeNameOpt_=(value: Option[String]): Unit = underlying.setAttributeName(value.orNull)

  def withAttributeNameOpt(value: Option[String]): AttributeDefinition = underlying.withAttributeName(value.orNull)

  // ---

  def attributeTypeOpt: Option[String] = Option(underlying.getAttributeType)

  def attributeTypeOpt_=(value: Option[String]): Unit = underlying.setAttributeType(value.orNull)

  def withAttributeTypeOpt(value: Option[String]): AttributeDefinition = underlying.withAttributeType(value.orNull)

  // ---

}
