package org.sisioh.aws4s.dynamodb.model

import java.util.Map.Entry

import com.amazonaws.services.dynamodbv2.model.AttributeValue

private[dynamodb] case class KeyEntry(key: String, var value: AttributeValue) extends Entry[String, AttributeValue] {
  override def getKey: String = key

  override def getValue: AttributeValue = value

  override def setValue(value: AttributeValue): AttributeValue = {
    this.value = value
    this.value
  }
}
