package org.sisioh.aws4s.dynamodb.extension

import com.amazonaws.services.dynamodbv2.model.AttributeDefinition

import org.sisioh.aws4s.dynamodb.Implicits._

case class AttributeDefinitionEx(underlying: AttributeDefinition) {

  val attributeNameOpt = underlying.attributeNameOpt

  val attributeTypeOpt = underlying.attributeTypeOpt

}

