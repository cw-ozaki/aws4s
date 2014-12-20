package org.sisioh.aws4s.dynamodb.extension

import com.amazonaws.services.{dynamodbv2 => aws}
import org.sisioh.aws4s.dynamodb.Implicits._

case class GlobalSecondaryIndexUpdate(underlying: aws.model.GlobalSecondaryIndexUpdate) {

  val updateOpt = underlying.updateOpt

}
