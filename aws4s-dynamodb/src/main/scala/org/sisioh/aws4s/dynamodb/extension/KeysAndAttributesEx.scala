package org.sisioh.aws4s.dynamodb.extension

import com.amazonaws.services.dynamodbv2.model.KeysAndAttributes
import org.sisioh.aws4s.dynamodb.Implicits._

case class KeysAndAttributesEx(underlying: KeysAndAttributes) {

  val attributesToGetOpt = underlying.attributesToGetOpt

  val consistentReadOpt = underlying.consistentReadOpt

  val expressionAttributeNamesOpt = underlying.expressionAttributeNamesOpt

  val keysOpt: Option[Seq[Map[String, AttributeValueEx]]] = underlying.keysOpt.map(_.map(
    _.map { case (k, v) =>
      (k, AttributeValueEx(v))
    }))
}
