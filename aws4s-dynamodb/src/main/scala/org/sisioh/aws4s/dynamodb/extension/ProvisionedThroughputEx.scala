package org.sisioh.aws4s.dynamodb.extension

import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughputDescription
import org.sisioh.aws4s.dynamodb.Implicits._

case class ProvisionedThroughputEx(underlying: ProvisionedThroughputDescription) {

  val lastDecreaseDateTimeOpt = underlying.lastDecreaseDateTimeOpt

  val lastIncreaseDateTimeOpt = underlying.lastIncreaseDateTimeOpt

  val numberOfDecreasesTodayOpt = underlying.numberOfDecreasesTodayOpt

  val readCapacityUnitsOpt: Option[Long] = underlying.readCapacityUnitsOpt

  val writeCapacityUnitsOpt: Option[Long] = underlying.writeCapacityUnitsOpt

}
