package org.sisioh.aws4s.dynamodb.extension

import com.amazonaws.services.{ dynamodbv2 => aws }
import org.sisioh.aws4s.dynamodb.Implicits._

case class AttributeDefinition(underlying: aws.model.AttributeDefinition) {

  val attributeNameOpt = underlying.attributeNameOpt

  val attributeTypeOpt = underlying.attributeTypeOpt

}

