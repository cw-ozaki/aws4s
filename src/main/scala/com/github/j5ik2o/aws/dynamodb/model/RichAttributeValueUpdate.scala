package com.github.j5ik2o.aws.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{AttributeValue, AttributeValueUpdate}
import com.github.j5ik2o.aws.dynamodb.PimpedType

object AttributeValueUpdateFactory {

  def apply: AttributeValueUpdate = new AttributeValueUpdate()

  def apply(value: AttributeValue, action: String): AttributeValueUpdate = new AttributeValueUpdate()

}

class RichAttributeValueUpdate(val underlying: AttributeValueUpdate) extends AnyVal with PimpedType[AttributeValueUpdate] {

  def action: String = underlying.getAction

  def value: AttributeValue = underlying.getValue

}
