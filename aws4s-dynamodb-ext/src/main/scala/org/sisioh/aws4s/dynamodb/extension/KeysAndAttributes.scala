package org.sisioh.aws4s.dynamodb.extension

import com.amazonaws.services.{ dynamodbv2 => aws }
import org.sisioh.aws4s.dynamodb.Implicits._

case class KeysAndAttributes(underlying: aws.model.KeysAndAttributes) {

  val attributesToGetOpt = underlying.attributesToGetOpt

  val consistentReadOpt = underlying.consistentReadOpt

  val expressionAttributeNamesOpt = underlying.expressionAttributeNamesOpt

  val keysOpt: Option[Seq[Map[String, AttributeValue]]] = underlying.keysOpt.map(_.map(
    _.map {
      case (k, v) =>
        (k, AttributeValue(v))
    }))
}
