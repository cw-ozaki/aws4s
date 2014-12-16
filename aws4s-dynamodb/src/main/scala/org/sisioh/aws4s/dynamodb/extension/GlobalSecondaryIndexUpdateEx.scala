package org.sisioh.aws4s.dynamodb.extension

import com.amazonaws.services.dynamodbv2.model.GlobalSecondaryIndexUpdate
import org.sisioh.aws4s.dynamodb.Implicits._

case class GlobalSecondaryIndexUpdateEx(underlying: GlobalSecondaryIndexUpdate) {

  val updateOpt = underlying.updateOpt

}
