package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{AttributeAction, AttributeValue, AttributeValueUpdate}
import org.sisioh.aws4s.PimpedType

import scala.reflect.ClassTag

object AttributeValueUpdateFactory {

  def create: AttributeValueUpdate = new AttributeValueUpdate()

  def create(value: AttributeValue, action: String): AttributeValueUpdate = new AttributeValueUpdate()

}

class RichAttributeValueUpdate(val underlying: AttributeValueUpdate) extends AnyVal with PimpedType[AttributeValueUpdate] {

  def setAttributeAction(value: Option[AttributeAction]): Unit = underlying.setAction(value.orNull)

  def actionOpt_=(value: Option[String]): Unit = underlying.setAction(value.orNull)

  def actionOpt: Option[String] = Option(underlying.getAction)

  def valueOpt_=(value: Option[AttributeValue]): Unit = underlying.setValue(value.orNull)

  def valueOpt: Option[AttributeValue] = Option(underlying.getValue)

}
