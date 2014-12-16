package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{AttributeAction, AttributeValue, AttributeValueUpdate}
import org.sisioh.aws4s.PimpedType

import scala.reflect.ClassTag

object AttributeValueUpdateFactory {

  def create: AttributeValueUpdate = new AttributeValueUpdate()

  def create(value: AttributeValue, action: String): AttributeValueUpdate = new AttributeValueUpdate()

}

class RichAttributeValueUpdate(val underlying: AttributeValueUpdate) extends AnyVal with PimpedType[AttributeValueUpdate] {

  // ---

  def actionOpt: Option[String] = Option(underlying.getAction)

  def actionOpt_=(value: Option[String]): Unit = underlying.setAction(value.orNull)

  def setAttributeAction(value: Option[AttributeAction]): Unit = underlying.setAction(value.orNull)

  def withActionOpt(value: Option[String]): AttributeValueUpdate = underlying.withAction(value.orNull)

  // ---

  def valueOpt: Option[AttributeValue] = Option(underlying.getValue)

  def valueOpt_=(value: Option[AttributeValue]): Unit = underlying.setValue(value.orNull)

  def withValueOpt(value: Option[AttributeValue]): AttributeValueUpdate = underlying.withValue(value.orNull)

  // ---

}
