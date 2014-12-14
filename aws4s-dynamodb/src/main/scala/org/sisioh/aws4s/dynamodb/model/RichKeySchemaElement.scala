package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{KeySchemaElement, KeyType}
import org.sisioh.aws4s.PimpedType

object KeySchemaElementFactory {

  def create(): KeySchemaElement = new KeySchemaElement()

  def create(attributeName: String, keyType: String): KeySchemaElement = new KeySchemaElement(attributeName, keyType)

  def create(attributeName: String, keyType: KeyType): KeySchemaElement = new KeySchemaElement(attributeName, keyType)

}

class RichKeySchemaElement(val underlying: KeySchemaElement) extends AnyVal with PimpedType[KeySchemaElement] {

  def attributeNameOpt: Option[String] = Option(underlying.getAttributeName)

  def attributeNameOpt_=(value: Option[String]): Unit = underlying.setAttributeName(value.orNull)

  def keyTypeOpt: Option[String] = Option(underlying.getKeyType)

  def keyTypeOpt_=(value: Option[String]): Unit = underlying.setKeyType(value.orNull)

}
