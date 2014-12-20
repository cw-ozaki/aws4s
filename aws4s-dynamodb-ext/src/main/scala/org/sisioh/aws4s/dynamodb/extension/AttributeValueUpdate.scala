package org.sisioh.aws4s.dynamodb.extension

import com.amazonaws.services.{dynamodbv2 => aws}
import org.sisioh.aws4s.dynamodb.Implicits._

case class AttributeValueUpdate(underlying: aws.model.AttributeValueUpdate) {

  val valueOpt = underlying.valueOpt

  val actionOpt = underlying.actionOpt

}
