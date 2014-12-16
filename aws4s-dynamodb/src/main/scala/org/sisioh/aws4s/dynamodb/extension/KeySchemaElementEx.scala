package org.sisioh.aws4s.dynamodb.extension

import com.amazonaws.services.dynamodbv2.model.{KeyType, KeySchemaElement}
import org.sisioh.aws4s.dynamodb.Implicits._
import org.sisioh.aws4s.dynamodb.model.KeySchemaElementFactory

object KeySchemaElementEx {

  def apply(attributeName: String, keyType: KeyType): KeySchemaElementEx =
    KeySchemaElementEx(
      KeySchemaElementFactory.create().
        withAttributeNameOpt(Some(attributeName)).
        withKeyTypeOpt(Some(keyType.toString))
    )

}

case class KeySchemaElementEx(underlying: KeySchemaElement) {

  val attributeName: Option[String] = underlying.attributeNameOpt

  val keyType: Option[KeyType] = underlying.keyTypeOpt.map{ v =>
    KeyType.fromValue(v)
  }

}
