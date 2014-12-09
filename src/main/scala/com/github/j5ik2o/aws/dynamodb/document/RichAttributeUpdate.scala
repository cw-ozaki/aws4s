package com.github.j5ik2o.aws.dynamodb.document

import com.amazonaws.services.dynamodbv2.document.AttributeUpdate
import com.github.j5ik2o.aws.PimpedType

import scala.collection.JavaConverters._

object AttributeUpdateFactory {

  def apply(attributeName: String): AttributeUpdate = new AttributeUpdate(attributeName)


}

class RichAttributeUpdate(val underlying: AttributeUpdate)
  extends AnyVal with PimpedType[AttributeUpdate] {

  def attributeValues: Set[AnyRef] =
    Option(underlying.getAttributeValues).map(_.asScala.toSet).getOrElse(Set.empty)

}
