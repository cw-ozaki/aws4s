package org.sisioh.aws4s.dynamodb.extension

import com.amazonaws.services.dynamodbv2.model.{ProvisionedThroughput, ProvisionedThroughputDescription}
import org.sisioh.aws4s.dynamodb.Implicits._

case class ProvisionedThroughputEx(underlying: ProvisionedThroughputDescription) {

  val lastDecreaseDateTimeOpt = underlying.lastDecreaseDateTimeOpt

  val lastIncreaseDateTimeOpt = underlying.lastIncreaseDateTimeOpt

  val numberOfDecreasesTodayOpt = underlying.numberOfDecreasesTodayOpt

  val readCapacityUnitsOpt: Option[Long] = underlying.readCapacityUnitsOpt

  val writeCapacityUnitsOpt: Option[Long] = underlying.writeCapacityUnitsOpt

  def toProvisionedThroughput = {
    new ProvisionedThroughput().
      withReadCapacityUnits(underlying.getReadCapacityUnits).
      withWriteCapacityUnits(underlying.getWriteCapacityUnits)
  }

}
