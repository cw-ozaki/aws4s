package org.sisioh.aws4s.dynamodb.document

import com.amazonaws.services.dynamodbv2.document.Attribute
import org.sisioh.aws4s.PimpedType

object AttributeFactory {

  def create(attrName: String, value: AnyRef): Attribute = new Attribute(attrName, value)

}

class RichAttribute(val underlying: Attribute) extends AnyVal with PimpedType[Attribute] {

  def name: String = underlying.getName

  def value: AnyRef = underlying.getValue

}
