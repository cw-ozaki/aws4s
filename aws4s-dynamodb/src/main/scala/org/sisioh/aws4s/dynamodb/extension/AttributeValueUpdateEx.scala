package org.sisioh.aws4s.dynamodb.extension

import com.amazonaws.services.dynamodbv2.model.AttributeValueUpdate
import org.sisioh.aws4s.dynamodb.Implicits._

case class AttributeValueUpdateEx(underlying: AttributeValueUpdate) {

  val valueOpt = underlying.valueOpt

  val actionOpt = underlying.actionOpt

}
