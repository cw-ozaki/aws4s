package com.github.j5ik2o.aws.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{AttributeAction, AttributeValue, AttributeValueUpdate}
import com.github.j5ik2o.aws.PimpedType

object AttributeValueUpdateFactory {

  def apply: AttributeValueUpdate = new AttributeValueUpdate()

  def apply(value: AttributeValue, action: String): AttributeValueUpdate = new AttributeValueUpdate()

}

class RichAttributeValueUpdate(val underlying: AttributeValueUpdate) extends AnyVal with PimpedType[AttributeValueUpdate] {

  def action_=(value: AttributeAction): Unit = underlying.setAction(value)

  def action_=(value: String): Unit = underlying.setAction(value)

  def action: String = underlying.getAction

  def value_=(value: AttributeValue): Unit = underlying.setValue(value)

  def value: AttributeValue = underlying.getValue

}
