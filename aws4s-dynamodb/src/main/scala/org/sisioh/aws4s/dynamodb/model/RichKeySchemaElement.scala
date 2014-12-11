package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{KeySchemaElement, KeyType}
import org.sisioh.aws4s.PimpedType

object KeySchemaElementFactory {

  def apply(): KeySchemaElement = new KeySchemaElement()

  def apply(attributeName: String, keyType: String): KeySchemaElement = new KeySchemaElement(attributeName, keyType)

  def apply(attributeName: String, keyType: KeyType): KeySchemaElement = new KeySchemaElement(attributeName, keyType)

}

class RichKeySchemaElement(val underlying: KeySchemaElement) extends AnyVal with PimpedType[KeySchemaElement] {

  def attributeName: String = underlying.getAttributeName

  def attributeName(value: String): Unit = underlying.setAttributeName(value)

  def keyType: String = underlying.getKeyType

  def keyType(value: String): Unit = underlying.setKeyType(value)

}
