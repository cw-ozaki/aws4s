package org.sisioh.aws4s.dynamodb.document

import com.amazonaws.services.dynamodbv2.document.AttributeUpdate
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object AttributeUpdateFactory {

  def apply(attributeName: String): AttributeUpdate = new AttributeUpdate(attributeName)

}

class RichAttributeUpdate(val underlying: AttributeUpdate)
    extends AnyVal with PimpedType[AttributeUpdate] {

  def attributeValues: Set[AnyRef] =
    Option(underlying.getAttributeValues).map(_.asScala.toSet).getOrElse(Set.empty)

}
